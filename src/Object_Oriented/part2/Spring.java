package Object_Oriented.part2;

import java.beans.BeanProperty;
/* 자바 코드를 이용한 스프링 프레임워크 설정

@Configuration
public class TranscoderConfig {
    @Bean
    public JobQueue fileJobQueue() {
        return new FileJobQueue();
    }

    @Bean
    public Transcoder ffmpegTranscoder() {
        new FfmpegTranscode();
    }

    @Bean
    public Worker worker() {
        return new Worker(fileJobQueue(), ffmpegTranscoder());
    }

    @Bean
    public JobCLI jobCli() {
        JobCLI jobCli = new JobCLI();
        jobCli.setJobQueue(fileJobQueue());
    }
}

 */
