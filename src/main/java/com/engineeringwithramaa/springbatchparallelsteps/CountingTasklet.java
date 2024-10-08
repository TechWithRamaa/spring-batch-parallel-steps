package com.engineeringwithramaa.springbatchparallelsteps;

import org.apache.logging.log4j.ThreadContext;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class CountingTasklet implements Tasklet {
    @Override
    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
        System.out.println(String.format("%s has been executed on thread %s", chunkContext.getStepContext().getStepName(),
                                            Thread.currentThread().getName()));
        return RepeatStatus.FINISHED;
    }
}
