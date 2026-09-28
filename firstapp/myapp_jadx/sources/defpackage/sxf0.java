package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 %2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0005\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0012\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0003J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010#\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001f2\u0006\u0010 \u001a\u00020\u00002\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0086\bø\u0001\u0000¢\u0006\u0004\b#\u0010$\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006'"}, d2 = {"Lsxf0;", "", "<init>", "()V", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "(JLjava/util/concurrent/TimeUnit;)Lsxf0;", "timeoutNanos", "()J", "", "hasDeadline", "()Z", "deadlineNanoTime", "(J)Lsxf0;", AnalyticsParam.KEY_BI_DURATION, "deadline", "clearTimeout", "()Lsxf0;", "clearDeadline", "", "throwIfReached", "cancel", "Ljava/util/concurrent/locks/Condition;", "condition", "awaitSignal", "(Ljava/util/concurrent/locks/Condition;)V", "monitor", "waitUntilNotified", "(Ljava/lang/Object;)V", "T", "other", "Lkotlin/Function0;", "block", "intersectWith", "(Lsxf0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Companion", "b", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class sxf0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final sxf0 NONE = new a();
    public boolean a;
    public long b;
    public long c;
    public volatile Object d;

    /* JADX INFO: renamed from: sxf0$b, reason: from kotlin metadata */
    public static final class Companion {
    }

    public void awaitSignal(Condition condition) throws InterruptedIOException {
        condition.getClass();
        try {
            boolean a2 = getA();
            long c = getC();
            if (!a2 && c == 0) {
                condition.await();
                return;
            }
            if (a2 && c != 0) {
                c = Math.min(c, deadlineNanoTime() - System.nanoTime());
            } else if (a2) {
                c = deadlineNanoTime() - System.nanoTime();
            }
            if (c <= 0) {
                throw new InterruptedIOException("timeout");
            }
            Object obj = this.d;
            if (condition.awaitNanos(c) <= 0 && this.d == obj) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public void cancel() {
        this.d = new Object();
    }

    public sxf0 clearDeadline() {
        this.a = false;
        return this;
    }

    public sxf0 clearTimeout() {
        this.c = 0L;
        return this;
    }

    public final sxf0 deadline(long duration, TimeUnit unit) {
        unit.getClass();
        if (duration > 0) {
            return deadlineNanoTime(unit.toNanos(duration) + System.nanoTime());
        }
        kb5.a(avg.a(duration, "duration <= 0: "));
        return null;
    }

    public long deadlineNanoTime() {
        if (this.a) {
            return this.b;
        }
        ib5.a("No deadline");
        return 0L;
    }

    /* JADX INFO: renamed from: hasDeadline, reason: from getter */
    public boolean getA() {
        return this.a;
    }

    public final <T> T intersectWith(sxf0 other, Function0<? extends T> block) {
        other.getClass();
        block.getClass();
        long c = getC();
        Companion companion = INSTANCE;
        long c2 = other.getC();
        long c3 = getC();
        companion.getClass();
        if (c2 == 0 || (c3 != 0 && c2 >= c3)) {
            c2 = c3;
        }
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout(c2, timeUnit);
        if (!getA()) {
            if (other.getA()) {
                deadlineNanoTime(other.deadlineNanoTime());
            }
            try {
                return block.invoke();
            } finally {
                timeout(c, timeUnit);
                if (other.getA()) {
                    clearDeadline();
                }
            }
        }
        long jDeadlineNanoTime = deadlineNanoTime();
        if (other.getA()) {
            deadlineNanoTime(Math.min(deadlineNanoTime(), other.deadlineNanoTime()));
        }
        try {
            return block.invoke();
        } finally {
            timeout(c, timeUnit);
            if (other.getA()) {
                deadlineNanoTime(jDeadlineNanoTime);
            }
        }
    }

    public void throwIfReached() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public sxf0 timeout(long timeout, TimeUnit unit) {
        unit.getClass();
        if (timeout >= 0) {
            this.c = unit.toNanos(timeout);
            return this;
        }
        kb5.a(avg.a(timeout, "timeout < 0: "));
        return null;
    }

    /* JADX INFO: renamed from: timeoutNanos, reason: from getter */
    public long getC() {
        return this.c;
    }

    public void waitUntilNotified(Object monitor) throws InterruptedIOException {
        monitor.getClass();
        try {
            boolean a2 = getA();
            long c = getC();
            if (!a2 && c == 0) {
                monitor.wait();
                return;
            }
            long jNanoTime = System.nanoTime();
            if (a2 && c != 0) {
                c = Math.min(c, deadlineNanoTime() - jNanoTime);
            } else if (a2) {
                c = deadlineNanoTime() - jNanoTime;
            }
            if (c <= 0) {
                throw new InterruptedIOException("timeout");
            }
            Object obj = this.d;
            long j = c / 1000000;
            monitor.wait(j, (int) (c - (1000000 * j)));
            if (System.nanoTime() - jNanoTime >= c && this.d == obj) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public sxf0 deadlineNanoTime(long deadlineNanoTime) {
        this.a = true;
        this.b = deadlineNanoTime;
        return this;
    }

    public static final class a extends sxf0 {
        @Override // defpackage.sxf0
        public final sxf0 timeout(long j, TimeUnit timeUnit) {
            timeUnit.getClass();
            return this;
        }

        @Override // defpackage.sxf0
        public final void throwIfReached() {
        }

        @Override // defpackage.sxf0
        public final sxf0 deadlineNanoTime(long j) {
            return this;
        }
    }
}
