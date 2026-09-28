package androidx.compose.foundation;

import defpackage.p3w;
import defpackage.psw;
import defpackage.t5i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/FocusableElement;", "Lp3w;", "Lt5i;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class FocusableElement extends p3w<t5i> {
    public final psw b;

    public FocusableElement(psw pswVar) {
        this.b = pswVar;
    }

    @Override // defpackage.p3w
    public final androidx.compose.ui.d.c a() {
        return new t5i(this.b, 1, null);
    }

    @Override // defpackage.p3w
    public final void d(androidx.compose.ui.d.c cVar) {
        ((t5i) cVar).u2(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusableElement) {
            return Intrinsics.g(this.b, ((FocusableElement) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        psw pswVar = this.b;
        if (pswVar != null) {
            return pswVar.hashCode();
        }
        return 0;
    }
}
