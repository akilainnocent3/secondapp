package nj;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@o0
@yi.c
@yi.d
public final class a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @zq.a
    public String f116888a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @zq.a
    public Boolean f116889b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @zq.a
    public Integer f116890c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @zq.a
    public Thread.UncaughtExceptionHandler f116891d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @zq.a
    public ThreadFactory f116892e = null;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ThreadFactory f116893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f116894b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AtomicLong f116895c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Boolean f116896d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Integer f116897e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Thread.UncaughtExceptionHandler f116898f;

        public a(final ThreadFactory val$backingThreadFactory, final String val$nameFormat, final AtomicLong val$count, final Boolean val$daemon, final Integer val$priority, final Thread.UncaughtExceptionHandler val$uncaughtExceptionHandler) {
            this.f116893a = val$backingThreadFactory;
            this.f116894b = val$nameFormat;
            this.f116895c = val$count;
            this.f116896d = val$daemon;
            this.f116897e = val$priority;
            this.f116898f = val$uncaughtExceptionHandler;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f116893a.newThread(runnable);
            Objects.requireNonNull(threadNewThread);
            String str = this.f116894b;
            if (str != null) {
                AtomicLong atomicLong = this.f116895c;
                Objects.requireNonNull(atomicLong);
                threadNewThread.setName(a3.d(str, Long.valueOf(atomicLong.getAndIncrement())));
            }
            Boolean bool = this.f116896d;
            if (bool != null) {
                threadNewThread.setDaemon(bool.booleanValue());
            }
            Integer num = this.f116897e;
            if (num != null) {
                threadNewThread.setPriority(num.intValue());
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f116898f;
            if (uncaughtExceptionHandler != null) {
                threadNewThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            return threadNewThread;
        }
    }

    public static ThreadFactory c(a3 builder) {
        String str = builder.f116888a;
        Boolean bool = builder.f116889b;
        Integer num = builder.f116890c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = builder.f116891d;
        ThreadFactory threadFactoryDefaultThreadFactory = builder.f116892e;
        if (threadFactoryDefaultThreadFactory == null) {
            threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        }
        return new a(threadFactoryDefaultThreadFactory, str, str != null ? new AtomicLong(0L) : null, bool, num, uncaughtExceptionHandler);
    }

    public static String d(String format, Object... args) {
        return String.format(Locale.ROOT, format, args);
    }

    public ThreadFactory b() {
        return c(this);
    }

    @qj.a
    public a3 e(boolean daemon) {
        this.f116889b = Boolean.valueOf(daemon);
        return this;
    }

    @qj.a
    public a3 f(String nameFormat) {
        d(nameFormat, 0);
        this.f116888a = nameFormat;
        return this;
    }

    @qj.a
    public a3 g(int priority) {
        zi.l0.m(priority >= 1, "Thread priority (%s) must be >= %s", priority, 1);
        zi.l0.m(priority <= 10, "Thread priority (%s) must be <= %s", priority, 10);
        this.f116890c = Integer.valueOf(priority);
        return this;
    }

    @qj.a
    public a3 h(ThreadFactory backingThreadFactory) {
        this.f116892e = (ThreadFactory) zi.l0.E(backingThreadFactory);
        return this;
    }

    @qj.a
    public a3 i(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f116891d = (Thread.UncaughtExceptionHandler) zi.l0.E(uncaughtExceptionHandler);
        return this;
    }
}
