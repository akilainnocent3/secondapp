package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
@zv.b0
public final class t80 {

    @oy.l
    public static final s80 Companion = new s80();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zv.j[] f155753d = {null, null, new dw.f(dw.c3.f79541a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f155755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f155756c;

    public /* synthetic */ t80(int i10, String str, boolean z10, List list) {
        if (7 != (i10 & 7)) {
            dw.g2.b(i10, 7, r80.f154811a.getDescriptor());
        }
        this.f155754a = str;
        this.f155755b = z10;
        this.f155756c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t80)) {
            return false;
        }
        t80 t80Var = (t80) obj;
        return kotlin.jvm.internal.m0.g(this.f155754a, t80Var.f155754a) && this.f155755b == t80Var.f155755b && kotlin.jvm.internal.m0.g(this.f155756c, t80Var.f155756c);
    }

    public final int hashCode() {
        return this.f155756c.hashCode() + ((g8.a.a(this.f155755b) + (this.f155754a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DebugPanelSdkData(version=" + this.f155754a + ", isIntegratedSuccess=" + this.f155755b + ", integrationMessages=" + this.f155756c + gi.j.f86771d;
    }

    public t80(boolean z10, List list) {
        this.f155754a = "7.18.1";
        this.f155755b = z10;
        this.f155756c = list;
    }
}
