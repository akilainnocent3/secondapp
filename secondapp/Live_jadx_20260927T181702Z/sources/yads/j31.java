package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class j31 implements dj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e43 f150919a;

    public /* synthetic */ j31() {
        this(new e43());
    }

    @Override // yads.dj
    public final boolean a(Object obj) {
        String str = ((u41) obj).f156268c;
        if (str == null) {
            return false;
        }
        this.f150919a.getClass();
        return str.length() > 0 && !kotlin.jvm.internal.m0.g(fw.b.f85379f, str);
    }

    public j31(e43 e43Var) {
        this.f150919a = e43Var;
    }
}
