package com.twilio.voice;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public final class Logger {
    public static final int INHERIT = 8;
    private int level = 8;
    private final String name;
    private static final Map<Class<?>, Logger> loggers = new HashMap();
    private static int globalLevel = 6;

    private Logger(String str) {
        this.name = str;
    }

    public static int getLogLevel() {
        return globalLevel;
    }

    public static Logger getLogger(Class<?> cls) {
        Map<Class<?>, Logger> map = loggers;
        if (!map.containsKey(cls)) {
            synchronized (map) {
                try {
                    if (!map.containsKey(cls)) {
                        map.put(cls, new Logger(cls.getSimpleName()));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return map.get(cls);
    }

    public static void setLogLevel(int i) {
        globalLevel = i;
    }

    public void d(String str, Throwable th) {
        if (isDebugEnabled()) {
            Voice.getLogger().log(new LogParameters.Builder(LogLevel.DEBUG, this.name, str).throwable(th).build());
        }
    }

    public void e(String str, Throwable th) {
        if (isErrorEnabled()) {
            Voice.getLogger().log(new LogParameters.Builder(LogLevel.ERROR, this.name, str).throwable(th).build());
        }
    }

    public void i(String str, Throwable th) {
        if (isInfoEnabled()) {
            Voice.getLogger().log(new LogParameters.Builder(LogLevel.INFO, this.name, str).throwable(th).build());
        }
    }

    public boolean isDebugEnabled() {
        int i = this.level;
        if (i > 3) {
            return i == 8 && globalLevel <= 3;
        }
        return true;
    }

    public boolean isErrorEnabled() {
        int i = this.level;
        if (i > 6) {
            return i == 8 && globalLevel <= 6;
        }
        return true;
    }

    public boolean isInfoEnabled() {
        int i = this.level;
        if (i > 4) {
            return i == 8 && globalLevel <= 4;
        }
        return true;
    }

    public boolean isVerboseEnabled() {
        int i = this.level;
        if (i > 2) {
            return i == 8 && globalLevel <= 2;
        }
        return true;
    }

    public boolean isWarnEnabled() {
        int i = this.level;
        if (i > 5) {
            return i == 8 && globalLevel <= 5;
        }
        return true;
    }

    public void setLevel(int i) {
        this.level = i;
    }

    public void v(String str, Throwable th) {
        if (isVerboseEnabled()) {
            Voice.getLogger().log(new LogParameters.Builder(LogLevel.TRACE, this.name, str).throwable(th).build());
        }
    }

    public void w(String str, Throwable th) {
        if (isWarnEnabled()) {
            Voice.getLogger().log(new LogParameters.Builder(LogLevel.WARNING, this.name, str).throwable(th).build());
        }
    }

    public void d(String str) {
        if (isDebugEnabled()) {
            Voice.getLogger().log(new LogParameters.Builder(LogLevel.DEBUG, this.name, str).build());
        }
    }

    public void e(String str) {
        if (isErrorEnabled()) {
            Voice.getLogger().log(new LogParameters.Builder(LogLevel.ERROR, this.name, str).build());
        }
    }

    public void i(String str) {
        if (isInfoEnabled()) {
            Voice.getLogger().log(new LogParameters.Builder(LogLevel.INFO, this.name, str).build());
        }
    }

    public void v(String str) {
        if (isVerboseEnabled()) {
            Voice.getLogger().log(new LogParameters.Builder(LogLevel.TRACE, this.name, str).build());
        }
    }

    public void w(String str) {
        if (isWarnEnabled()) {
            Voice.getLogger().log(new LogParameters.Builder(LogLevel.WARNING, this.name, str).build());
        }
    }
}
