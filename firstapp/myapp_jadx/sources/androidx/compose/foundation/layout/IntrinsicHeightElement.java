package androidx.compose.foundation.layout;

import defpackage.knn;
import defpackage.lzo;
import defpackage.p3w;
import defpackage.pzo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicHeightElement;", "Lp3w;", "Llzo;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class IntrinsicHeightElement extends p3w<lzo> {
    public final pzo b;
    public final boolean c = true;
    public final Function1<knn, Unit> d;

    public IntrinsicHeightElement(pzo pzoVar, Function1 function1) {
        this.b = pzoVar;
        this.d = function1;
    }

    @Override // defpackage.p3w
    public final androidx.compose.ui.d.c a() {
        lzo lzoVar = new lzo();
        lzoVar.D = this.b;
        lzoVar.E = this.c;
        return lzoVar;
    }

    @Override // defpackage.p3w
    public final void d(androidx.compose.ui.d.c cVar) {
        lzo lzoVar = (lzo) cVar;
        lzoVar.D = this.b;
        lzoVar.E = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicHeightElement intrinsicHeightElement = obj instanceof IntrinsicHeightElement ? (IntrinsicHeightElement) obj : null;
        return intrinsicHeightElement != null && this.b == intrinsicHeightElement.b && this.c == intrinsicHeightElement.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }
}
