package com.kodilla.four.one;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    private final JobLauncher jobLauncher;
    private final Job job;

    public PersonController(JobLauncher jobLauncher, Job job) {
        this.jobLauncher = jobLauncher;
        this.job = job;
    }

    @GetMapping(path = "person/readAndWrite")
    public void readPeopleDatasAndWriteAges() throws Exception {
        jobLauncher.run(job, new JobParameters());
    }
}
