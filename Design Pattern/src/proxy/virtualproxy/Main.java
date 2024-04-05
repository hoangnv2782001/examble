package proxy.virtualproxy;

public class Main {
    /**
     * virtual proxy : tạo một object trung gian dùng để call real  object khi cần :
     * Ví dụ : lazy loading trong hibernate khi sử dụng lazy load sẽ trả về một proxy và
     * khi cần dữ liệu sẽ gọi proxy để lấy dữ liệu
     * @param args
     */
    public static void main(String[] args) {

        ProxyImage proxyImage = new ProxyImage("1234456788");

        proxyImage.showImage();

        proxyImage.showImage();
    }
}
