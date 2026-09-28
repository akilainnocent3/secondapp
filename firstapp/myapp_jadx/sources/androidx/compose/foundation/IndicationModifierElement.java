package androidx.compose.foundation;

import defpackage.lfn;
import defpackage.mfn;
import defpackage.okd;
import defpackage.p3w;
import defpackage.psw;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/IndicationModifierElement;", "Lp3w;", "Llfn;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class IndicationModifierElement extends p3w<lfn> {
    public final psw b;
    public final mfn c;

    public IndicationModifierElement(psw pswVar, mfn mfnVar) {
        this.b = pswVar;
        this.c = mfnVar;
    }

    @Override // defpackage.p3w
    public final androidx.compose.ui.d.c a() {
        okd okdVarA = this.c.a(this.b);
        lfn lfnVar = new lfn();
        lfnVar.F = okdVarA;
        lfnVar.p2(okdVarA);
        return lfnVar;
    }

    @Override // defpackage.p3w
    public final void d(androidx.compose.ui.d.c cVar) {
        lfn lfnVar = (lfn) cVar;
        okd okdVarA = this.c.a(this.b);
        lfnVar.q2(lfnVar.F);
        lfnVar.F = okdVarA;
        lfnVar.p2(okdVarA);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return Intrinsics.g(this.b, indicationModifierElement.b) && Intrinsics.g(this.c, indicationModifierElement.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
