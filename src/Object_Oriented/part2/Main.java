package Object_Oriented.part2;
/*
public class Main {
    public static void main(String[] args) {
        // 상위 수준 모듈인 transcoder 패키지에서 사용할
        // 하위 수준 모듈 객체 생성
        JobQueue jobQueue = new FileJobQueue();
        Transcoder transcoder = new FfmpegTranscoder();

        // 상위 수준 모듈이 하위 수준 모듈을 사용할 수 있도록 Locator 초기화
        Locator locator = new Locator(jobQueue, transcoder);
        Locator.init(locator);

        // 상위 수준 모듈 객체를 생성하고 실행
        final Worker worker = new Worker();
        Thread t = new Thread(new Runnable() {
            public void run() {
                worker.run();
            }
        });
        JobCLI cli = new JobCLI();
        cli.interact();
    }
}

// 수정후의 Main클래스의 변화
public class Main {
    public static void main(String[] args) {
        // 상위 수준 모듈인 transcoder 패키지에서 사용할
        // 하위 수준 모듈 객체 생성
        JobQueue jobQueue = new FileJobQueue();
        Transcoder transcoder = new FfmpegTranscoder();

        // 상위 수준 모듈 객체를 생성하고 실행
        final Worker worker = new Worker(jobQueue, transcoder);
        Thread t = new Thread(new Runnable() {
            public void run() {
                worker.run();
            }
        });
        JobCLI cli = new JobCLI(jobQueue);
        cli.interact();
    }
 */

