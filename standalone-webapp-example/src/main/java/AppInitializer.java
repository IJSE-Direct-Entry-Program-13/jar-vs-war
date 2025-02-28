import lk.ijse.dep13.app.HelloServlet;
import org.apache.catalina.Context;
import org.apache.catalina.Wrapper;
import org.apache.catalina.startup.Tomcat;

import java.io.File;

public class AppInitializer {

    public static void main(String[] args) throws Exception {
        String appInitializerPath = AppInitializer.class.getProtectionDomain().getCodeSource().getLocation().getFile();
        String appPath = new File(appInitializerPath).getParentFile().getParent();
        System.out.println(appPath);

        Tomcat tomcat = new Tomcat();
        tomcat.setPort(9090);

        // Deploy
        tomcat.addWebapp("/app", appPath);

//        Context ctx = tomcat.addContext("/app", new File(uri).getParentFile()
//                .getParentFile().getParent());
//        Wrapper helloServlet = tomcat.addServlet(ctx, "HelloServlet", new HelloServlet());
//        helloServlet.addMapping("/hello");
        tomcat.getConnector();
        tomcat.start();
    }
}
