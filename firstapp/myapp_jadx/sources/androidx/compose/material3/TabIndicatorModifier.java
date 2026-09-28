package androidx.compose.material3;

import androidx.compose.ui.d;
import defpackage.g7f;
import defpackage.goh;
import defpackage.gpp;
import defpackage.j1f0;
import defpackage.mtg0;
import defpackage.p3w;
import defpackage.twd0;
import defpackage.z1f0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/TabIndicatorModifier;", "Lp3w;", "Lj1f0;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TabIndicatorModifier extends p3w<j1f0> {
    public final twd0<List<z1f0>> b;
    public final int c;
    public final boolean d;
    public final goh<g7f> e;

    /* JADX WARN: Multi-variable type inference failed */
    public TabIndicatorModifier(twd0<? extends List<z1f0>> twd0Var, int i, boolean z, goh<g7f> gohVar) {
        this.b = twd0Var;
        this.c = i;
        this.d = z;
        this.e = gohVar;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        j1f0 j1f0Var = new j1f0();
        j1f0Var.D = this.b;
        j1f0Var.E = this.c;
        j1f0Var.F = this.d;
        j1f0Var.G = this.e;
        return j1f0Var;
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        j1f0 j1f0Var = (j1f0) cVar;
        j1f0Var.D = this.b;
        j1f0Var.E = this.c;
        j1f0Var.F = this.d;
        j1f0Var.G = this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabIndicatorModifier)) {
            return false;
        }
        TabIndicatorModifier tabIndicatorModifier = (TabIndicatorModifier) obj;
        return Intrinsics.g(this.b, tabIndicatorModifier.b) && this.c == tabIndicatorModifier.c && this.d == tabIndicatorModifier.d && Intrinsics.g(this.e, tabIndicatorModifier.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + mtg0.a(gpp.a(this.c, this.b.hashCode() * 31, 31), 31, this.d);
    }

    public final String toString() {
        return "TabIndicatorModifier(tabPositionsState=" + this.b + ", selectedTabIndex=" + this.c + ", followContentSize=" + this.d + ", animationSpec=" + this.e + ')';
    }
}
