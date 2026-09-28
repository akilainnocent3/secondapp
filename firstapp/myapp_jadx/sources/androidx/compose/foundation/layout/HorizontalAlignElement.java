package androidx.compose.foundation.layout;

import defpackage.ljm;
import defpackage.n54;
import defpackage.p3w;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/HorizontalAlignElement;", "Lp3w;", "Lljm;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HorizontalAlignElement extends p3w<ljm> {
    public final n54.a b;

    public HorizontalAlignElement(n54.a aVar) {
        this.b = aVar;
    }

    @Override // defpackage.p3w
    public final androidx.compose.ui.d.c a() {
        ljm ljmVar = new ljm();
        ljmVar.D = this.b;
        return ljmVar;
    }

    @Override // defpackage.p3w
    public final void d(androidx.compose.ui.d.c cVar) {
        ((ljm) cVar).D = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        HorizontalAlignElement horizontalAlignElement = obj instanceof HorizontalAlignElement ? (HorizontalAlignElement) obj : null;
        if (horizontalAlignElement == null) {
            return false;
        }
        return Intrinsics.g(this.b, horizontalAlignElement.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a);
    }
}
