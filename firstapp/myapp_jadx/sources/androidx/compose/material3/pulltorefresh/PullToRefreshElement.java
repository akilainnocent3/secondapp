package androidx.compose.material3.pulltorefresh;

import androidx.compose.ui.d;
import defpackage.ca30;
import defpackage.ej5;
import defpackage.g7f;
import defpackage.mtg0;
import defpackage.p3w;
import defpackage.x7g;
import defpackage.x930;
import defpackage.z930;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;", "Lp3w;", "Lx930;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PullToRefreshElement extends p3w<x930> {
    public final boolean b;
    public final Function0<Unit> c;
    public final boolean d = true;
    public final ca30 e;
    public final float f;

    public PullToRefreshElement(boolean z, Function0 function0, ca30 ca30Var, float f) {
        this.b = z;
        this.c = function0;
        this.e = ca30Var;
        this.f = f;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        return new x930(this.b, this.c, this.d, this.e, this.f);
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        x930 x930Var = (x930) cVar;
        x930Var.G = this.c;
        x930Var.H = this.d;
        x930Var.I = this.e;
        x930Var.J = this.f;
        boolean z = x930Var.F;
        boolean z2 = this.b;
        if (z != z2) {
            x930Var.F = z2;
            ej5.c(x930Var.d2(), null, null, new z930(x930Var, null), 3);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PullToRefreshElement)) {
            return false;
        }
        PullToRefreshElement pullToRefreshElement = (PullToRefreshElement) obj;
        return this.b == pullToRefreshElement.b && this.d == pullToRefreshElement.d && this.c == pullToRefreshElement.c && Intrinsics.g(this.e, pullToRefreshElement.e) && g7f.b(this.f, pullToRefreshElement.f);
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + ((this.e.hashCode() + x7g.a(mtg0.a(Boolean.hashCode(this.b) * 31, 31, this.d), 31, this.c)) * 31);
    }
}
