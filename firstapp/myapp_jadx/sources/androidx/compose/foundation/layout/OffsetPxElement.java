package androidx.compose.foundation.layout;

import defpackage.iwo;
import defpackage.kly;
import defpackage.mmd;
import defpackage.p3w;
import defpackage.pkd;
import defpackage.rly;
import defpackage.ruw;
import defpackage.tsr;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/OffsetPxElement;", "Lp3w;", "Lrly;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class OffsetPxElement extends p3w<rly> {
    public final Function1<mmd, iwo> b;
    public final boolean c = true;

    public OffsetPxElement(Function1 function1, kly klyVar) {
        this.b = function1;
    }

    @Override // defpackage.p3w
    public final androidx.compose.ui.d.c a() {
        rly rlyVar = new rly();
        rlyVar.D = this.b;
        rlyVar.E = this.c;
        return rlyVar;
    }

    @Override // defpackage.p3w
    public final void d(androidx.compose.ui.d.c cVar) {
        rly rlyVar = (rly) cVar;
        Function1<? super mmd, iwo> function1 = rlyVar.D;
        Function1<mmd, iwo> function2 = this.b;
        boolean z = this.c;
        if (function1 != function2 || rlyVar.E != z) {
            tsr tsrVarF = pkd.f(rlyVar);
            tsr.c cVar2 = tsr.g0;
            tsrVarF.g0(false);
        }
        rlyVar.D = function2;
        rlyVar.E = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetPxElement offsetPxElement = obj instanceof OffsetPxElement ? (OffsetPxElement) obj : null;
        return offsetPxElement != null && this.b == offsetPxElement.b && this.c == offsetPxElement.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OffsetPxModifier(offset=");
        sb.append(this.b);
        sb.append(", rtlAware=");
        return ruw.a(sb, this.c, ')');
    }
}
