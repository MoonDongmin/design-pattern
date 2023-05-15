package Object_Oriented.part2;
/* 리스코프 치환 잘못된 예시

public class CopyUtil {
    public class CopyUtil {
        public static void copy(InputStream is, OutputStream out) {
            byte[] data = new byte[512];
            int len = -1;

            // InputStream.read() 메서드는 스트림의 끝에 도달하면 -1을 리턴
            // is가 SatanInputStream인 경우 read() 메서드는
            // -1을 리턴하지 않으므로, 아래 코드는 무한 루프가 됨
            while ((len = is.read(data)) != -1) {
                out.write(data, 0, len);
            }
        }
}

public class SatanInputStream implements InputStream {
    public int read(byte[] data) {
        ...
        return 0; // 데이터가 없을 때 0을 리턴하도록 구현
    }
}

 */
