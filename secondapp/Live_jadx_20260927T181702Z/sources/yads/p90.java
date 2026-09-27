package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class p90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p90 f153820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s70 f153821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f153822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f153823d;

    public p90(p90 p90Var, s70 s70Var, boolean z10, List list) {
        this.f153820a = p90Var;
        this.f153821b = s70Var;
        this.f153822c = z10;
        this.f153823d = list;
    }

    public static p90 a(p90 p90Var, p90 p90Var2, s70 s70Var, boolean z10, List list, int i10) {
        if ((i10 & 1) != 0) {
            p90Var2 = p90Var.f153820a;
        }
        if ((i10 & 2) != 0) {
            s70Var = p90Var.f153821b;
        }
        if ((i10 & 4) != 0) {
            z10 = p90Var.f153822c;
        }
        if ((i10 & 8) != 0) {
            list = p90Var.f153823d;
        }
        p90Var.getClass();
        return new p90(p90Var2, s70Var, z10, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p90)) {
            return false;
        }
        p90 p90Var = (p90) obj;
        return kotlin.jvm.internal.m0.g(this.f153820a, p90Var.f153820a) && kotlin.jvm.internal.m0.g(this.f153821b, p90Var.f153821b) && this.f153822c == p90Var.f153822c && kotlin.jvm.internal.m0.g(this.f153823d, p90Var.f153823d);
    }

    public final int hashCode() {
        p90 p90Var = this.f153820a;
        return this.f153823d.hashCode() + ((g8.a.a(this.f153822c) + ((this.f153821b.hashCode() + ((p90Var == null ? 0 : p90Var.hashCode()) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DebugPanelUiState(prevState=" + this.f153820a + ", destination=" + this.f153821b + ", isLoading=" + this.f153822c + ", uiData=" + this.f153823d + gi.j.f86771d;
    }
}
