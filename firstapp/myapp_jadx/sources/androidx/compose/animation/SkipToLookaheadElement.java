package androidx.compose.animation;

import defpackage.p3w;
import defpackage.qy90;
import defpackage.x5a0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/SkipToLookaheadElement;", "Lp3w;", "Lqy90;", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SkipToLookaheadElement extends p3w<qy90> {
    public final i b;
    public final Function0<Boolean> c;

    public SkipToLookaheadElement(i iVar, Function0<Boolean> function0) {
        this.b = iVar;
        this.c = function0;
    }

    @Override // defpackage.p3w
    public final androidx.compose.ui.d.c a() {
        return new qy90(this.b, this.c);
    }

    @Override // defpackage.p3w
    public final void d(androidx.compose.ui.d.c cVar) {
        qy90 qy90Var = (qy90) cVar;
        ((x5a0) qy90Var.D).setValue(this.b);
        ((x5a0) qy90Var.E).setValue(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkipToLookaheadElement)) {
            return false;
        }
        SkipToLookaheadElement skipToLookaheadElement = (SkipToLookaheadElement) obj;
        return Intrinsics.g(this.b, skipToLookaheadElement.b) && Intrinsics.g(this.c, skipToLookaheadElement.c);
    }

    public final int hashCode() {
        i iVar = this.b;
        return this.c.hashCode() + ((iVar == null ? 0 : iVar.hashCode()) * 31);
    }

    public final String toString() {
        return "SkipToLookaheadElement(scaleToBounds=" + this.b + ", isEnabled=" + this.c + ')';
    }
}
