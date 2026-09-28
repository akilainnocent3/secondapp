package androidx.compose.foundation;

import defpackage.mtg0;
import defpackage.p3w;
import defpackage.rp70;
import defpackage.zp70;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ScrollingLayoutElement;", "Lp3w;", "Lrp70;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScrollingLayoutElement extends p3w<rp70> {
    public final zp70 b;
    public final boolean c;
    public final boolean d;

    public ScrollingLayoutElement(zp70 zp70Var, boolean z, boolean z2) {
        this.b = zp70Var;
        this.c = z;
        this.d = z2;
    }

    @Override // defpackage.p3w
    public final androidx.compose.ui.d.c a() {
        rp70 rp70Var = new rp70();
        rp70Var.D = this.b;
        rp70Var.E = this.c;
        rp70Var.F = this.d;
        return rp70Var;
    }

    @Override // defpackage.p3w
    public final void d(androidx.compose.ui.d.c cVar) {
        rp70 rp70Var = (rp70) cVar;
        rp70Var.D = this.b;
        rp70Var.E = this.c;
        rp70Var.F = this.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        return Intrinsics.g(this.b, scrollingLayoutElement.b) && this.c == scrollingLayoutElement.c && this.d == scrollingLayoutElement.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + mtg0.a(this.b.hashCode() * 31, 31, this.c);
    }
}
