package androidx.compose.foundation.gestures;

import androidx.compose.ui.d;
import defpackage.br70;
import defpackage.fr70;
import defpackage.i3z;
import defpackage.mtg0;
import defpackage.p3w;
import defpackage.psw;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableElement;", "Lp3w;", "Lbr70;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ScrollableElement extends p3w<br70> {
    public final fr70 b;
    public final i3z c;
    public final boolean d;
    public final boolean e;
    public final psw f;

    public ScrollableElement(fr70 fr70Var, i3z i3zVar, boolean z, boolean z2, psw pswVar) {
        this.b = fr70Var;
        this.c = i3zVar;
        this.d = z;
        this.e = z2;
        this.f = pswVar;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        return new br70(null, null, this.f, this.c, null, this.b, this.d, this.e);
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        ((br70) cVar).B2(null, null, this.f, this.c, null, this.b, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        return Intrinsics.g(this.b, scrollableElement.b) && this.c == scrollableElement.c && this.d == scrollableElement.d && this.e == scrollableElement.e && Intrinsics.g(this.f, scrollableElement.f);
    }

    public final int hashCode() {
        int iA = mtg0.a(mtg0.a((this.c.hashCode() + (this.b.hashCode() * 31)) * 961, 31, this.d), 961, this.e);
        psw pswVar = this.f;
        return (iA + (pswVar != null ? pswVar.hashCode() : 0)) * 31;
    }
}
