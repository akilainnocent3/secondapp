package androidx.compose.foundation.layout;

import defpackage.d75;
import defpackage.ht;
import defpackage.knn;
import defpackage.p3w;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/BoxChildDataElement;", "Lp3w;", "Ld75;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class BoxChildDataElement extends p3w<d75> {
    public final ht b;
    public final boolean c;
    public final Function1<knn, Unit> d;

    /* JADX WARN: Multi-variable type inference failed */
    public BoxChildDataElement(ht htVar, boolean z, Function1<? super knn, Unit> function1) {
        this.b = htVar;
        this.c = z;
        this.d = function1;
    }

    @Override // defpackage.p3w
    public final androidx.compose.ui.d.c a() {
        d75 d75Var = new d75();
        d75Var.D = this.b;
        d75Var.E = this.c;
        return d75Var;
    }

    @Override // defpackage.p3w
    public final void d(androidx.compose.ui.d.c cVar) {
        d75 d75Var = (d75) cVar;
        d75Var.D = this.b;
        d75Var.E = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        return boxChildDataElement != null && Intrinsics.g(this.b, boxChildDataElement.b) && this.c == boxChildDataElement.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }
}
