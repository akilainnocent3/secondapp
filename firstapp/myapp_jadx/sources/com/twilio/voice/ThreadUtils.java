package com.twilio.voice;

/* JADX INFO: loaded from: classes8.dex */
class ThreadUtils {

    public static class ThreadChecker {
        private final long threadId;

        public ThreadChecker(Thread thread) {
            this.threadId = thread.getId();
        }

        public void checkIsOnValidThread() {
        }
    }
}
