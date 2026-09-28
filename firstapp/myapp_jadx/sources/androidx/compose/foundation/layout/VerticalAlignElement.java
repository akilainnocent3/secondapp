package androidx.compose.foundation.layout;

import defpackage.n54;
import defpackage.p3w;
import defpackage.s2i0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/VerticalAlignElement;", "Lp3w;", "Ls2i0;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VerticalAlignElement extends p3w<s2i0> {
    public final n54.b b;

    public VerticalAlignElement(n54.b bVar) {
        this.b = bVar;
    }

    @Override // defpackage.p3w
    public final androidx.compose.ui.d.c a() {
        s2i0 s2i0Var = new s2i0();
        s2i0Var.D = this.b;
        return s2i0Var;
    }

    @Override // defpackage.p3w
    public final void d(androidx.compose.ui.d.c cVar) {
        ((s2i0) cVar).D = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        VerticalAlignElement verticalAlignElement = obj instanceof VerticalAlignElement ? (VerticalAlignElement) obj : null;
        if (verticalAlignElement == null) {
            return false;
        }
        return Intrinsics.g(this.b, verticalAlignElement.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a);
    }
}
