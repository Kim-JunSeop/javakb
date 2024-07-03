package Q1;

public class ObjectFactory {

    public Object createObject(String type) {
        Object obj = null;
        switch (type.toLowerCase()) {
            case "apple":
                obj = new AppleClass();
                break;
            case "banana":
                obj = new BananaClass();
                break;
            case "ice":
                obj = new IceClass();
                break;
            default:
                System.out.println(type + " 객체가 생성되었습니다");
                break;
        }
        if (obj != null) {
            System.out.println(type + " 입력되었습니다.");

        }
        return obj;
    }
}
