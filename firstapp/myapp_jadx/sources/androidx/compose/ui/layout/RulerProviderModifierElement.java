package androidx.compose.ui.layout;

import defpackage.p3w;
import defpackage.pkd;
import defpackage.tsr;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/RulerProviderModifierElement;", "Lp3w;", "Landroidx/compose/ui/layout/d0;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class RulerProviderModifierElement extends p3w<d0> {
    public final g b;

    public RulerProviderModifierElement(g gVar) {
        this.b = gVar;
    }

    @Override // defpackage.p3w
    public final androidx.compose.ui.d.c a() {
        return new d0(this.b);
    }

    @Override // defpackage.p3w
    public final void d(androidx.compose.ui.d.c cVar) {
        d0 d0Var = (d0) cVar;
        g gVar = d0Var.D;
        g gVar2 = this.b;
        if (gVar != gVar2) {
            d0Var.D = gVar2;
            tsr.h0(pkd.f(d0Var), false, 7);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        RulerProviderModifierElement rulerProviderModifierElement = obj instanceof RulerProviderModifierElement ? (RulerProviderModifierElement) obj : null;
        return (rulerProviderModifierElement != null ? rulerProviderModifierElement.b : null) == this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
