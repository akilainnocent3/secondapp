package jv;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class r0 extends or.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public static final a f100869d = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final String f100870c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements or.j.c<r0> {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        public a() {
        }
    }

    public r0(@oy.l String str) {
        super(f100869d);
        this.f100870c = str;
    }

    public static /* synthetic */ r0 n0(r0 r0Var, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = r0Var.f100870c;
        }
        return r0Var.m0(str);
    }

    @oy.l
    public final String F() {
        return this.f100870c;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0) && kotlin.jvm.internal.m0.g(this.f100870c, ((r0) obj).f100870c);
    }

    public int hashCode() {
        return this.f100870c.hashCode();
    }

    @oy.l
    public final r0 m0(@oy.l String str) {
        return new r0(str);
    }

    @oy.l
    public final String o0() {
        return this.f100870c;
    }

    @oy.l
    public String toString() {
        return "CoroutineName(" + this.f100870c + ')';
    }
}
