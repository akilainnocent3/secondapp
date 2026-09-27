package qv;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.m
    public final transient or.j f123000b;

    public l(@oy.l or.j jVar) {
        this.f123000b = jVar;
    }

    @Override // java.lang.Throwable
    @oy.l
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    @oy.l
    public String getLocalizedMessage() {
        return String.valueOf(this.f123000b);
    }
}
