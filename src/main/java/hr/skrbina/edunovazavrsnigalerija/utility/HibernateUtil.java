/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.skrbina.edunovazavrsnigalerija.utility;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 *
 * @author Hrvoje
 */
public class HibernateUtil {

    private static StandardServiceRegistry registry;
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                // Create registry
                registry = new StandardServiceRegistryBuilder().configure().build();
                // Create MetadataSources
                MetadataSources sources = new MetadataSources(registry);
                // Create Metadata
                Metadata metadata = sources.getMetadataBuilder().build();
                // Create SessionFactory
                sessionFactory = metadata.getSessionFactoryBuilder().build();
            } catch (Exception e) {
                if (registry != null) {
                    StandardServiceRegistryBuilder.destroy(registry);
                }
            }
        }
        return sessionFactory;
    }

    // metoda za produkciju
    /*
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {

                try {
                    URL  jarPath = Start.class.getProtectionDomain().
                            getCodeSource().getLocation();
                    System.out.println(jarPath);
                    String jarDir = new File(jarPath.toString()).getParent()
                            .replace("file:" + File.separator, "");
                    System.out.println(jarDir);
                    File hcfgFile = new File(jarDir
                            + File.separator + "hibernate.cfg.xml");
                    System.out.println(">>>>" + hcfgFile.getAbsolutePath());
                    Configuration cfg = new Configuration().configure(hcfgFile);
                    cfg.addAnnotatedClass(Operater.class);
                    cfg.addAnnotatedClass(Smjer.class);
                    cfg.addAnnotatedClass(Polaznik.class);
                    cfg.addAnnotatedClass(Predavac.class);
                    cfg.addAnnotatedClass(Grupa.class);
                    StandardServiceRegistryBuilder sb = new StandardServiceRegistryBuilder();
                    sb.applySettings(cfg.getProperties());
                    StandardServiceRegistry standardServiceRegistry = sb.build();
                   
                    sessionFactory = cfg.buildSessionFactory(standardServiceRegistry);
                } catch (Exception e) {
                    System.out.println("================================");
                    e.printStackTrace();
                    System.out.println("================================");
                    // Create registry
                    registry = new StandardServiceRegistryBuilder().configure().build();
                    // Create MetadataSources
                    MetadataSources sources = new MetadataSources(registry);
                    // Create Metadata
                    Metadata metadata = sources.getMetadataBuilder().build();
                    // Create SessionFactory
                    sessionFactory = metadata.getSessionFactoryBuilder().build();
                }

            } catch (Exception e) {
                e.printStackTrace();
                if (registry != null) {
                    StandardServiceRegistryBuilder.destroy(registry);
                }
            }
        }
        return sessionFactory;
    }
     */
    public static void shutdown() {
        if (registry != null) {
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }
}