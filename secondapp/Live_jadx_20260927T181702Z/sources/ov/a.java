package ov;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends CancellationException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    @cs.g
    public final transient Object f119847b;

    public a(@oy.l Object obj) {
        super("Flow was aborted, no more elements needed");
        this.f119847b = obj;
    }

    @Override // java.lang.Throwable
    @oy.l
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
