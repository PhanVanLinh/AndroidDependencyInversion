package toong.vn.androiddependencyinversion.without;

/**
 * Created by PhanVanLinh on 13/03/2018.
 * phanvanlinh.94vn@gmail.com
 */

public class Client {
    private Service1 service1;
    private Service2 service2;

    Client(Service1 service1, Service2 service2) {
        this.service1 = service1;
        this.service2 = service2;
    }

    public void doSomeThing() {
        if (service1 != null) {
            service1.doSomeThingInService();
            return;
        }
        if (service2 == null) {
            service2.doSomeThingInService();
        }
    }
}
