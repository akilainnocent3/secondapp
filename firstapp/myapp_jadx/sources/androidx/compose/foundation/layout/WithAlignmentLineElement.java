package androidx.compose.foundation.layout;

import defpackage.kt;
import defpackage.p3w;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/WithAlignmentLineElement;", "Lp3w;", "Landroidx/compose/foundation/layout/i$a;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WithAlignmentLineElement extends p3w<i.a> {
    public final kt b;

    public WithAlignmentLineElement(kt ktVar) {
        this.b = ktVar;
    }

    @Override // defpackage.p3w
    public final androidx.compose.ui.d.c a() {
        i.a aVar = new i.a();
        aVar.D = this.b;
        return aVar;
    }

    @Override // defpackage.p3w
    public final void d(androidx.compose.ui.d.c cVar) {
        ((i.a) cVar).D = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        WithAlignmentLineElement withAlignmentLineElement = obj instanceof WithAlignmentLineElement ? (WithAlignmentLineElement) obj : null;
        if (withAlignmentLineElement == null) {
            return false;
        }
        return Intrinsics.g(this.b, withAlignmentLineElement.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
