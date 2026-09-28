package androidx.compose.foundation.lazy;

import androidx.compose.ui.d;
import defpackage.lsz;
import defpackage.p3w;
import defpackage.twd0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/ParentSizeElement;", "Lp3w;", "Llsz;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ParentSizeElement extends p3w<lsz> {
    public final float b;
    public final twd0<Integer> c;

    public ParentSizeElement(float f, twd0 twd0Var) {
        this.b = f;
        this.c = twd0Var;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        lsz lszVar = new lsz();
        lszVar.D = this.b;
        lszVar.E = this.c;
        return lszVar;
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        lsz lszVar = (lsz) cVar;
        lszVar.D = this.b;
        lszVar.E = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParentSizeElement)) {
            return false;
        }
        ParentSizeElement parentSizeElement = (ParentSizeElement) obj;
        return this.b == parentSizeElement.b && Intrinsics.g(this.c, parentSizeElement.c);
    }

    public final int hashCode() {
        twd0<Integer> twd0Var = this.c;
        return Float.hashCode(this.b) + ((twd0Var != null ? twd0Var.hashCode() : 0) * 961);
    }
}
