package androidx.compose.foundation.relocation;

import androidx.compose.ui.d;
import defpackage.ia5;
import defpackage.la5;
import defpackage.ma5;
import defpackage.p3w;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;", "Lp3w;", "Lma5;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class BringIntoViewRequesterElement extends p3w<ma5> {
    public final ia5 b;

    public BringIntoViewRequesterElement(ia5 ia5Var) {
        this.b = ia5Var;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        ma5 ma5Var = new ma5();
        ma5Var.D = this.b;
        return ma5Var;
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        ma5 ma5Var = (ma5) cVar;
        ia5 ia5Var = ma5Var.D;
        if (ia5Var instanceof la5) {
            ((la5) ia5Var).a.j(ma5Var);
        }
        ia5 ia5Var2 = this.b;
        if (ia5Var2 instanceof la5) {
            ((la5) ia5Var2).a.b(ma5Var);
        }
        ma5Var.D = ia5Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BringIntoViewRequesterElement) {
            return Intrinsics.g(this.b, ((BringIntoViewRequesterElement) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
