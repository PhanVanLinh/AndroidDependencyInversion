package toong.vn.androiddependencyinversion.has;

/**
 * Created by PhanVanLinh on 13/03/2018.
 * phanvanlinh.94vn@gmail.com
 */

public class Client {
    Service service;

    public Client(Service service) {
        this.service = service;
    }

    public void work() {
        service.doSomeThingInService();
    }
}
