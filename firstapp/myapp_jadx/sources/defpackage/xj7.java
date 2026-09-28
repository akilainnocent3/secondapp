package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes8.dex */
public final class xj7 extends CancellationException {
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
