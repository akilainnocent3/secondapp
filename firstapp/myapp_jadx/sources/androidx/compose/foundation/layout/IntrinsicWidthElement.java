package androidx.compose.foundation.layout;

import defpackage.knn;
import defpackage.p3w;
import defpackage.pzo;
import defpackage.tzo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicWidthElement;", "Lp3w;", "Ltzo;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class IntrinsicWidthElement extends p3w<tzo> {
    public final pzo b;
    public final boolean c;
    public final Function1<knn, Unit> d;

    /* JADX WARN: Multi-variable type inference failed */
    public IntrinsicWidthElement(pzo pzoVar, boolean z, Function1<? super knn, Unit> function1) {
        this.b = pzoVar;
        this.c = z;
        this.d = function1;
    }

    @Override // defpackage.p3w
    public final androidx.compose.ui.d.c a() {
        tzo tzoVar = new tzo();
        tzoVar.D = this.b;
        tzoVar.E = this.c;
        return tzoVar;
    }

    @Override // defpackage.p3w
    public final void d(androidx.compose.ui.d.c cVar) {
        tzo tzoVar = (tzo) cVar;
        tzoVar.D = this.b;
        tzoVar.E = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicWidthElement intrinsicWidthElement = obj instanceof IntrinsicWidthElement ? (IntrinsicWidthElement) obj : null;
        return intrinsicWidthElement != null && this.b == intrinsicWidthElement.b && this.c == intrinsicWidthElement.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }
}
