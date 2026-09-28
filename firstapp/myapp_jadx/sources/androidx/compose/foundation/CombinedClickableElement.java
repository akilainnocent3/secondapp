package androidx.compose.foundation;

import defpackage.mtg0;
import defpackage.p3w;
import defpackage.psw;
import defpackage.w78;
import defpackage.x7g;
import defpackage.yje0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/CombinedClickableElement;", "Lp3w;", "Lw78;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class CombinedClickableElement extends p3w<w78> {
    public final psw b;
    public final boolean c;
    public final Function0<Unit> d;
    public final boolean e;

    public CombinedClickableElement() {
        throw null;
    }

    public CombinedClickableElement(psw pswVar, Function0 function0) {
        this.b = pswVar;
        this.c = true;
        this.d = function0;
        this.e = true;
    }

    @Override // defpackage.p3w
    public final androidx.compose.ui.d.c a() {
        return new w78(this.d, this.e, this.b, this.c);
    }

    @Override // defpackage.p3w
    public final void d(androidx.compose.ui.d.c cVar) {
        yje0 yje0Var;
        w78 w78Var = (w78) cVar;
        w78Var.getClass();
        boolean z = w78Var.K;
        boolean z2 = this.c;
        boolean z3 = z != z2;
        w78Var.B2(this.b, null, false, z2, null, null, this.d);
        if (!z3 || (yje0Var = w78Var.O) == null) {
            return;
        }
        yje0Var.O0();
        Unit unit = Unit.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CombinedClickableElement.class != obj.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        return Intrinsics.g(this.b, combinedClickableElement.b) && this.c == combinedClickableElement.c && this.d == combinedClickableElement.d && this.e == combinedClickableElement.e;
    }

    public final int hashCode() {
        psw pswVar = this.b;
        return Boolean.hashCode(this.e) + x7g.a(mtg0.a(mtg0.a((pswVar != null ? pswVar.hashCode() : 0) * 961, 31, false), 29791, this.c), 923521, this.d);
    }
}
