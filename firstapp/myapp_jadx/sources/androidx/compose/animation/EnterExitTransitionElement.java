package androidx.compose.animation;

import defpackage.dtg0;
import defpackage.iwo;
import defpackage.jj0;
import defpackage.jxo;
import defpackage.p3w;
import defpackage.s9g;
import defpackage.w7g;
import defpackage.w8g;
import defpackage.x6l;
import defpackage.x7g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/EnterExitTransitionElement;", "Lp3w;", "Lw8g;", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class EnterExitTransitionElement extends p3w<w8g> {
    public final dtg0<w7g> b;
    public final dtg0<w7g>.a<jxo, jj0> c;
    public final dtg0<w7g>.a<iwo, jj0> d;
    public final dtg0<w7g>.a<iwo, jj0> e;
    public final s9g f;
    public final g g;
    public final Function0<Boolean> h;
    public final x6l i;

    public EnterExitTransitionElement(dtg0<w7g> dtg0Var, dtg0<w7g>.a<jxo, jj0> aVar, dtg0<w7g>.a<iwo, jj0> aVar2, dtg0<w7g>.a<iwo, jj0> aVar3, s9g s9gVar, g gVar, Function0<Boolean> function0, x6l x6lVar) {
        this.b = dtg0Var;
        this.c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f = s9gVar;
        this.g = gVar;
        this.h = function0;
        this.i = x6lVar;
    }

    @Override // defpackage.p3w
    public final androidx.compose.ui.d.c a() {
        return new w8g(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    @Override // defpackage.p3w
    public final void d(androidx.compose.ui.d.c cVar) {
        w8g w8gVar = (w8g) cVar;
        w8gVar.D = this.b;
        w8gVar.E = this.c;
        w8gVar.F = this.d;
        w8gVar.G = this.e;
        w8gVar.H = this.f;
        w8gVar.I = this.g;
        w8gVar.J = this.h;
        w8gVar.K = this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return Intrinsics.g(this.b, enterExitTransitionElement.b) && Intrinsics.g(this.c, enterExitTransitionElement.c) && Intrinsics.g(this.d, enterExitTransitionElement.d) && Intrinsics.g(this.e, enterExitTransitionElement.e) && Intrinsics.g(this.f, enterExitTransitionElement.f) && Intrinsics.g(this.g, enterExitTransitionElement.g) && Intrinsics.g(this.h, enterExitTransitionElement.h) && Intrinsics.g(this.i, enterExitTransitionElement.i);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        dtg0<w7g>.a<jxo, jj0> aVar = this.c;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        dtg0<w7g>.a<iwo, jj0> aVar2 = this.d;
        int iHashCode3 = (iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        dtg0<w7g>.a<iwo, jj0> aVar3 = this.e;
        return this.i.hashCode() + x7g.a((this.g.hashCode() + ((this.f.hashCode() + ((iHashCode3 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.h);
    }

    public final String toString() {
        return "EnterExitTransitionElement(transition=" + this.b + ", sizeAnimation=" + this.c + ", offsetAnimation=" + this.d + ", slideAnimation=" + this.e + ", enter=" + this.f + ", exit=" + this.g + ", isEnabled=" + this.h + ", graphicsLayerBlock=" + this.i + ')';
    }
}
