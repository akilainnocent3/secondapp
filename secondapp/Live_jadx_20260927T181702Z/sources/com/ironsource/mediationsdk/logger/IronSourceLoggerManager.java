package com.ironsource.mediationsdk.logger;

import com.ironsource.C4332ib;
import gi.j;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class IronSourceLoggerManager extends IronSourceLogger {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile IronSourceLoggerManager f62724d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<IronSourceLogger> f62725c;

    private IronSourceLoggerManager(String str) {
        super(str);
        this.f62725c = new CopyOnWriteArrayList();
        c();
    }

    private void c() {
        this.f62725c.add(new a(0));
    }

    public static IronSourceLoggerManager getLogger() {
        if (f62724d == null) {
            synchronized (IronSourceLoggerManager.class) {
                try {
                    if (f62724d == null) {
                        f62724d = new IronSourceLoggerManager(IronSourceLoggerManager.class.getSimpleName());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f62724d;
    }

    public void a(IronSourceLogger.IronSourceTag ironSourceTag, C4332ib c4332ib) {
        if (a(c4332ib.a())) {
            return;
        }
        a(ironSourceTag, c4332ib.c(), c4332ib.a());
    }

    public void addLogger(IronSourceLogger ironSourceLogger) {
        this.f62725c.add(ironSourceLogger);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    @Deprecated(forRemoval = true, since = "8.3.0")
    public void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i10) {
        if (a(i10)) {
            return;
        }
        a(ironSourceTag, str, i10);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th2) {
        if (th2 == null) {
            Iterator<IronSourceLogger> it = this.f62725c.iterator();
            while (it.hasNext()) {
                it.next().log(ironSourceTag, str, 3);
            }
        } else {
            Iterator<IronSourceLogger> it2 = this.f62725c.iterator();
            while (it2.hasNext()) {
                it2.next().logException(ironSourceTag, str, th2);
            }
        }
    }

    public void onLog(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i10) {
        log(ironSourceTag, str, i10);
    }

    public void setLoggerDebugLevel(String str, int i10) {
        if (str == null) {
            return;
        }
        IronSourceLogger ironSourceLoggerA = a(str);
        if (ironSourceLoggerA == null) {
            log(IronSourceLogger.IronSourceTag.NATIVE, "Failed to find logger:setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i10 + j.f86771d, 0);
            return;
        }
        if (i10 < 0 || i10 > 3) {
            this.f62725c.remove(ironSourceLoggerA);
            return;
        }
        log(IronSourceLogger.IronSourceTag.NATIVE, "setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i10 + j.f86771d, 0);
        ironSourceLoggerA.setDebugLevel(i10);
    }

    public void a(IronSourceLogger.IronSourceTag ironSourceTag, C4332ib c4332ib, Throwable th2) {
        if (a(c4332ib.a())) {
            return;
        }
        logException(ironSourceTag, c4332ib.c(), th2);
    }

    private IronSourceLoggerManager(String str, int i10) {
        super(str, i10);
        this.f62725c = new CopyOnWriteArrayList();
        c();
    }

    private boolean a(int i10) {
        return i10 < this.f62720a;
    }

    public void a(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i10) {
        for (IronSourceLogger ironSourceLogger : this.f62725c) {
            if (ironSourceLogger.a() <= i10) {
                ironSourceLogger.log(ironSourceTag, str, i10);
            }
        }
    }

    public static IronSourceLoggerManager getLogger(int i10) {
        IronSourceLoggerManager logger = getLogger();
        logger.f62720a = i10;
        return logger;
    }

    private IronSourceLogger a(String str) {
        for (IronSourceLogger ironSourceLogger : this.f62725c) {
            if (ironSourceLogger.b().equals(str)) {
                return ironSourceLogger;
            }
        }
        return null;
    }
}
