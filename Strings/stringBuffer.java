import java.io.* ;

public class stringBuffer {
    public static void main( String[] args)
    throws IOException {

        stringBuffer sb = new stringBuffer();

        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

        System.out.println("Enter surname: ");
        String sur = br.readLine();

        System.out.println("Enter firstname: ");
        String fir = br.readLine();

        System.out.println("Enter midname: ");
        String mid = br.readLine();

        sb.append(sur);
        sb.append(fir);
        sb.append(mid);

        System.out.println("Name : " +sb);

        int n = sur.length();
        sb.insert(n , mid);

        System.out.println("Full name: " +sb);
        System.out.println("In reverse: " +sb.reverse());

    }
}