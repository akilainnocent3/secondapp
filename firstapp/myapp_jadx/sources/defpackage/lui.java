package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/* JADX INFO: loaded from: classes8.dex */
public final class lui extends sxf0 {
    public sxf0 e;

    public lui(sxf0 sxf0Var) {
        sxf0Var.getClass();
        this.e = sxf0Var;
    }

    @Override // defpackage.sxf0
    public final void awaitSignal(Condition condition) throws InterruptedIOException {
        condition.getClass();
        this.e.awaitSignal(condition);
    }

    @Override // defpackage.sxf0
    public final void cancel() {
        this.e.cancel();
    }

    @Override // defpackage.sxf0
    public final sxf0 clearDeadline() {
        return this.e.clearDeadline();
    }

    @Override // defpackage.sxf0
    public final sxf0 clearTimeout() {
        return this.e.clearTimeout();
    }

    @Override // defpackage.sxf0
    public final long deadlineNanoTime() {
        return this.e.deadlineNanoTime();
    }

    @Override // defpackage.sxf0
    /* JADX INFO: renamed from: hasDeadline */
    public final boolean getA() {
        return this.e.getA();
    }

    @Override // defpackage.sxf0
    public final void throwIfReached() throws InterruptedIOException {
        this.e.throwIfReached();
    }

    @Override // defpackage.sxf0
    public final sxf0 timeout(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.e.timeout(j, timeUnit);
    }

    @Override // defpackage.sxf0
    /* JADX INFO: renamed from: timeoutNanos */
    public final long getC() {
        return this.e.getC();
    }

    @Override // defpackage.sxf0
    public final void waitUntilNotified(Object obj) throws InterruptedIOException {
        obj.getClass();
        this.e.waitUntilNotified(obj);
    }

    @Override // defpackage.sxf0
    public final sxf0 deadlineNanoTime(long j) {
        return this.e.deadlineNanoTime(j);
    }
}
