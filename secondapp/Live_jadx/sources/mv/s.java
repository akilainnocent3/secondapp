package mv;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class s implements rr.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.m
    public final rr.e f115382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final StackTraceElement f115383c;

    public s(@oy.m rr.e eVar, @oy.l StackTraceElement stackTraceElement) {
        this.f115382b = eVar;
        this.f115383c = stackTraceElement;
    }

    @Override // rr.e
    @oy.m
    public rr.e getCallerFrame() {
        return this.f115382b;
    }

    @Override // rr.e
    @oy.l
    public StackTraceElement getStackTraceElement() {
        return this.f115383c;
    }
}
