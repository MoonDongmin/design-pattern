package Object_Oriented.part2;
/*

public class ServiceLocator {
    private JobQueue jobQueue;
    private Transcoder transcoder;

    public ServiceLocator(JobQueue jobQueue, Transcoder transcoder) {
        this.jobQueue = jobQueue;
        this.transcoder = transcoder;
    }

    public JobQueue getJobQueue() {
        return jobQueue;
    }

    public Transcoder getTranscoder() {
        return transcoder;
    }

    //서비스 로케이터 접근 위한 static 메서드
    private static ServiceLocator instance;

    public static void load(ServiceLocator locator) {
        ServiceLocator.instance = locator;
    }

    public static ServiceLocator getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        //의존 객체 생성
        FileJobQueue jobQueue = new FileJobQueue();
        FfmpegTranscoder transcoder = new FfmpegTranscoder();

        //서비스 로케이터 초기화
        ServiceLocator locator = new ServiceLocator(jobQueue, transcoder);
        ServiceLocator.load(locator);

        //어플리케이션 코드 실행
        Worker worker = new Worker();
        JobCLI jobCli = new JobCLI();
        jobCli.interact();
        ...
    }
}

 */
