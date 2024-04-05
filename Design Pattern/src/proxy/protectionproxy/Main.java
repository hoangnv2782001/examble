package proxy.protectionproxy;

public class Main {
    /**
     * protection proxy : bao vệ real project khi có yêu cầu truy cập bằng cách đặt trước nó
     * một proxy kiểm tra quyền truy cập
     * @param args
     */
    public static void main(String[] args) {



                UserService admin = new UserServiceProxy("testeeee", "admin");
                admin.load();
                admin.insert();

                UserService customer = new UserServiceProxy("wsdfghjk", "guest");
                customer.load();
                customer.insert();

    }
}
