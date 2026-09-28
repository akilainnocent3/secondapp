package androidx.compose.foundation.lazy.layout;

import defpackage.i3z;
import defpackage.jwr;
import defpackage.lwr;
import defpackage.mtg0;
import defpackage.mwr;
import defpackage.p3w;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierElement;", "Lp3w;", "Llwr;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class LazyLayoutBeyondBoundsModifierElement extends p3w<lwr> {
    public final mwr b;
    public final jwr c;
    public final boolean d;
    public final i3z e;

    public LazyLayoutBeyondBoundsModifierElement(mwr mwrVar, jwr jwrVar, boolean z, i3z i3zVar) {
        this.b = mwrVar;
        this.c = jwrVar;
        this.d = z;
        this.e = i3zVar;
    }

    @Override // defpackage.p3w
    public final androidx.compose.ui.d.c a() {
        lwr lwrVar = new lwr();
        lwrVar.D = this.b;
        lwrVar.E = this.c;
        lwrVar.F = this.d;
        lwrVar.G = this.e;
        return lwrVar;
    }

    @Override // defpackage.p3w
    public final void d(androidx.compose.ui.d.c cVar) {
        lwr lwrVar = (lwr) cVar;
        lwrVar.D = this.b;
        lwrVar.E = this.c;
        lwrVar.F = this.d;
        lwrVar.G = this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutBeyondBoundsModifierElement)) {
            return false;
        }
        LazyLayoutBeyondBoundsModifierElement lazyLayoutBeyondBoundsModifierElement = (LazyLayoutBeyondBoundsModifierElement) obj;
        return Intrinsics.g(this.b, lazyLayoutBeyondBoundsModifierElement.b) && Intrinsics.g(this.c, lazyLayoutBeyondBoundsModifierElement.c) && this.d == lazyLayoutBeyondBoundsModifierElement.d && this.e == lazyLayoutBeyondBoundsModifierElement.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + mtg0.a((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d);
    }
}
