package com.twilio.voice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public class LogParameters {
    public String file;
    public String function;
    public LogLevel level;
    public int line;
    public String message;
    public LogModule module;
    public String tag;
    public String thread;
    public String timestamp;
    public Throwable tr;

    public static class Builder {
        private LogLevel level;
        private String message;
        private String tag;
        private Throwable tr;
        private LogModule module = LogModule.PLATFORM;
        private String timestamp = LogParameters.getTimestamp();
        public String file = "";
        private String function = "";
        private int line = 0;
        private String thread = LogParameters.getThreadNameOrId();

        public Builder(LogLevel logLevel, String str, String str2) {
            this.tag = "";
            this.message = "";
            Preconditions.checkNotNull(logLevel, "Level must not be null");
            Preconditions.checkNotNull(str, "Tag must not be null");
            Preconditions.checkNotNull(str2, "Message must not be null");
            this.level = logLevel;
            this.tag = str;
            this.message = str2;
        }

        public LogParameters build() {
            return new LogParameters(this, 0);
        }

        public Builder file(String str) {
            Preconditions.checkNotNull(str, "Filename must not be null");
            this.file = str;
            return this;
        }

        public Builder function(String str) {
            Preconditions.checkNotNull(str, "Method name must not be null");
            this.function = str;
            return this;
        }

        public Builder line(int i) {
            this.line = i;
            return this;
        }

        public Builder module(LogModule logModule) {
            Preconditions.checkNotNull(logModule, "Module must not be null");
            this.module = logModule;
            return this;
        }

        public Builder thread(String str) {
            Preconditions.checkNotNull(str, "Thread name or id must not be null");
            this.thread = str;
            return this;
        }

        public Builder throwable(Throwable th) {
            this.tr = th;
            return this;
        }

        public Builder timestamp(String str) {
            Preconditions.checkNotNull(str, "Timestamp must not be null");
            this.timestamp = str;
            return this;
        }
    }

    public LogParameters(LogModule logModule, LogLevel logLevel, String str, String str2, String str3, int i, String str4, String str5, String str6) {
        Preconditions.checkNotNull(logModule, "Module must not be null");
        Preconditions.checkNotNull(logLevel, "Level must not be null");
        Preconditions.checkNotNull(str, "Timestamp must not be null");
        Preconditions.checkNotNull(str2, "Filename must not be null");
        Preconditions.checkNotNull(str3, "Method name must not be null");
        Preconditions.checkNotNull(str4, "Tag must not be null");
        Preconditions.checkNotNull(str5, "Message must not be null");
        Preconditions.checkNotNull(str6, "Thread name or id must not be null");
        this.module = logModule;
        this.level = logLevel;
        this.timestamp = str.isEmpty() ? getTimestamp() : str;
        this.file = str2;
        this.function = str3;
        this.line = i;
        this.tag = str4;
        this.message = str5;
        this.thread = str6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getThreadNameOrId() {
        return !Thread.currentThread().getName().isEmpty() ? Thread.currentThread().getName() : Long.toString(Thread.currentThread().getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getTimestamp() {
        return new SimpleDateFormat("yy-MM-dd hh:mm:ss.SSS", Locale.US).format(Calendar.getInstance().getTime()).toString();
    }

    private LogParameters(Builder builder) {
        Preconditions.checkNotNull(builder, "Builder must not be null");
        this.module = builder.module;
        this.level = builder.level;
        this.timestamp = builder.timestamp;
        this.file = builder.file;
        this.function = builder.function;
        this.line = builder.line;
        this.tag = builder.tag;
        this.message = builder.message;
        this.thread = builder.thread;
        this.tr = builder.tr;
    }

    public /* synthetic */ LogParameters(Builder builder, int i) {
        this(builder);
    }

    public LogParameters(LogLevel logLevel, String str, String str2) {
        this(LogModule.PLATFORM, logLevel, getTimestamp(), "", "", 0, str, str2, getThreadNameOrId());
    }
}
