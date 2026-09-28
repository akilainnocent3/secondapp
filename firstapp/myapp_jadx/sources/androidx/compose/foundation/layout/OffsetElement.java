package androidx.compose.foundation.layout;

import defpackage.g7f;
import defpackage.k35;
import defpackage.knn;
import defpackage.oly;
import defpackage.p3w;
import defpackage.pkd;
import defpackage.ruw;
import defpackage.tsr;
import defpackage.tvh;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/OffsetElement;", "Lp3w;", "Loly;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class OffsetElement extends p3w<oly> {
    public final float b;
    public final float c;
    public final boolean d;
    public final Function1<knn, Unit> e;

    public OffsetElement(float f, float f2, boolean z, Function1 function1) {
        this.b = f;
        this.c = f2;
        this.d = z;
        this.e = function1;
    }

    @Override // defpackage.p3w
    public final androidx.compose.ui.d.c a() {
        oly olyVar = new oly();
        olyVar.D = this.b;
        olyVar.E = this.c;
        olyVar.F = this.d;
        return olyVar;
    }

    @Override // defpackage.p3w
    public final void d(androidx.compose.ui.d.c cVar) {
        oly olyVar = (oly) cVar;
        float f = olyVar.D;
        float f2 = this.b;
        boolean zB = g7f.b(f, f2);
        float f3 = this.c;
        boolean z = this.d;
        if (!zB || !g7f.b(olyVar.E, f3) || olyVar.F != z) {
            tsr tsrVarF = pkd.f(olyVar);
            tsr.c cVar2 = tsr.g0;
            tsrVarF.g0(false);
        }
        olyVar.D = f2;
        olyVar.E = f3;
        olyVar.F = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetElement offsetElement = obj instanceof OffsetElement ? (OffsetElement) obj : null;
        return offsetElement != null && g7f.b(this.b, offsetElement.b) && g7f.b(this.c, offsetElement.c) && this.d == offsetElement.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + tvh.a(this.c, Float.hashCode(this.b) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OffsetModifierElement(x=");
        k35.a(this.b, ", y=", sb);
        k35.a(this.c, ", rtlAware=", sb);
        return ruw.a(sb, this.d, ')');
    }
}
