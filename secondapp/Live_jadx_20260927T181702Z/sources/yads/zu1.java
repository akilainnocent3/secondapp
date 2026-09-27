package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
@zv.b0
public final class zu1 {

    @oy.l
    public static final yu1 Companion = new yu1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f159027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f159028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f159029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f159030d;

    public /* synthetic */ zu1(int i10, long j10, String str, String str2, String str3) {
        if (15 != (i10 & 15)) {
            dw.g2.b(i10, 15, xu1.f157995a.getDescriptor());
        }
        this.f159027a = j10;
        this.f159028b = str;
        this.f159029c = str2;
        this.f159030d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zu1)) {
            return false;
        }
        zu1 zu1Var = (zu1) obj;
        return this.f159027a == zu1Var.f159027a && kotlin.jvm.internal.m0.g(this.f159028b, zu1Var.f159028b) && kotlin.jvm.internal.m0.g(this.f159029c, zu1Var.f159029c) && kotlin.jvm.internal.m0.g(this.f159030d, zu1Var.f159030d);
    }

    public final int hashCode() {
        return this.f159030d.hashCode() + k4.a(this.f159029c, k4.a(this.f159028b, f0.p.a(this.f159027a) * 31, 31), 31);
    }

    public final String toString() {
        return "MobileAdsSdkLog(timestamp=" + this.f159027a + ", type=" + this.f159028b + ", tag=" + this.f159029c + ", text=" + this.f159030d + gi.j.f86771d;
    }

    public zu1(long j10, String str, String str2, String str3) {
        this.f159027a = j10;
        this.f159028b = str;
        this.f159029c = str2;
        this.f159030d = str3;
    }
}
