package com.java8to11.chapter04;

import java.time.Duration;

public class Progress {

    private Duration studyDuration;
    private boolean finished;

    public Duration getStudyDuration() {
        return studyDuration;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setStudyDuration(Duration studyDuration) {
        this.studyDuration = studyDuration;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

}
