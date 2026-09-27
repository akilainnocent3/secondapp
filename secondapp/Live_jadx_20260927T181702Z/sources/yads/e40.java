package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
@zv.b0
public final class e40 {

    @oy.l
    public static final d40 Companion = new d40();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f148491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f148492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f148493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m40 f148494d;

    public /* synthetic */ e40(int i10, String str, String str2, String str3, m40 m40Var) {
        if (7 != (i10 & 7)) {
            dw.g2.b(i10, 7, c40.f147555a.getDescriptor());
        }
        this.f148491a = str;
        this.f148492b = str2;
        this.f148493c = str3;
        if ((i10 & 8) == 0) {
            this.f148494d = null;
        } else {
            this.f148494d = m40Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e40)) {
            return false;
        }
        e40 e40Var = (e40) obj;
        return kotlin.jvm.internal.m0.g(this.f148491a, e40Var.f148491a) && kotlin.jvm.internal.m0.g(this.f148492b, e40Var.f148492b) && kotlin.jvm.internal.m0.g(this.f148493c, e40Var.f148493c) && kotlin.jvm.internal.m0.g(this.f148494d, e40Var.f148494d);
    }

    public final int hashCode() {
        int iA = k4.a(this.f148493c, k4.a(this.f148492b, this.f148491a.hashCode() * 31, 31), 31);
        m40 m40Var = this.f148494d;
        return iA + (m40Var == null ? 0 : m40Var.hashCode());
    }

    public final String toString() {
        return "DebugPanelAdUnit(name=" + this.f148491a + ", format=" + this.f148492b + ", adUnitId=" + this.f148493c + ", mediation=" + this.f148494d + gi.j.f86771d;
    }
}
