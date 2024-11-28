public class Main {
    public static void main(String[] args) {
        MyStringBuilder sb = new MyStringBuilder();
        MyStringBuilder sb2 = new MyStringBuilder();
        MyStringListener sl1 = new MyStringListener("sl1", sb);
        MyStringListener sl2 = new MyStringListener("sl2", sb);

        sb.append("hello");
        sb.append(" world");
        sb2.append("hello world");
        System.out.println(sb + " " + sb2);
        System.out.println(sb.compareTo(sb2));
        sb.reverse();
        System.out.println(sb);

        sb.removeObserver(sl2);

        sb.delete(3, 7);
        System.out.println(sb);

        sb2.registerObserver(sl2);

        sb2.deleteCharAt(4);
        System.out.println(sb2);
        System.out.println(sb2.indexOf("world"));
        System.out.println(sb2.indexOf("world", 6));
        sb2.append("world");
        System.out.println(sb2.lastIndexOf("world"));
    }
}