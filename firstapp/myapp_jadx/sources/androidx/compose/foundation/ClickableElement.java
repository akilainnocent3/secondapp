package androidx.compose.foundation;

import defpackage.mfn;
import defpackage.mtg0;
import defpackage.p3w;
import defpackage.psw;
import defpackage.rr7;
import defpackage.su50;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ClickableElement;", "Lp3w;", "Lrr7;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ClickableElement extends p3w<rr7> {
    public final psw b;
    public final mfn c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final su50 g;
    public final Function0<Unit> h;

    public ClickableElement() {
        throw null;
    }

    public ClickableElement(psw pswVar, mfn mfnVar, boolean z, boolean z2, String str, su50 su50Var, Function0 function0) {
        this.b = pswVar;
        this.c = mfnVar;
        this.d = z;
        this.e = z2;
        this.f = str;
        this.g = su50Var;
        this.h = function0;
    }

    @Override // defpackage.p3w
    public final androidx.compose.ui.d.c a() {
        return new rr7(this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    @Override // defpackage.p3w
    public final void d(androidx.compose.ui.d.c cVar) {
        ((rr7) cVar).B2(this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return Intrinsics.g(this.b, clickableElement.b) && Intrinsics.g(this.c, clickableElement.c) && this.d == clickableElement.d && this.e == clickableElement.e && Intrinsics.g(this.f, clickableElement.f) && Intrinsics.g(this.g, clickableElement.g) && this.h == clickableElement.h;
    }

    public final int hashCode() {
        psw pswVar = this.b;
        int iHashCode = (pswVar != null ? pswVar.hashCode() : 0) * 31;
        mfn mfnVar = this.c;
        int iA = mtg0.a(mtg0.a((iHashCode + (mfnVar != null ? mfnVar.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode2 = (iA + (str != null ? str.hashCode() : 0)) * 31;
        su50 su50Var = this.g;
        return this.h.hashCode() + ((iHashCode2 + (su50Var != null ? Integer.hashCode(su50Var.a) : 0)) * 31);
    }
}
