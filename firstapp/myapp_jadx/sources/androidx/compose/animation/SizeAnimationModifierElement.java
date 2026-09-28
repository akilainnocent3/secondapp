package androidx.compose.animation;

import com.sportybet.android.instantwin.newtork.model.response.recommendation.TL.UccrWswQGaIj;
import defpackage.fkd0;
import defpackage.ht;
import defpackage.n54;
import defpackage.p3w;
import defpackage.zw90;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/SizeAnimationModifierElement;", "Lp3w;", "Lzw90;", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class SizeAnimationModifierElement extends p3w<zw90> {
    public final fkd0 b;
    public final n54 c = ht.a.a;

    public SizeAnimationModifierElement(fkd0 fkd0Var) {
        this.b = fkd0Var;
    }

    @Override // defpackage.p3w
    public final androidx.compose.ui.d.c a() {
        return new zw90(this.b, this.c);
    }

    @Override // defpackage.p3w
    public final void d(androidx.compose.ui.d.c cVar) {
        zw90 zw90Var = (zw90) cVar;
        zw90Var.D = this.b;
        zw90Var.E = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeAnimationModifierElement)) {
            return false;
        }
        SizeAnimationModifierElement sizeAnimationModifierElement = (SizeAnimationModifierElement) obj;
        return Intrinsics.g(this.b, sizeAnimationModifierElement.b) && Intrinsics.g(this.c, sizeAnimationModifierElement.c);
    }

    public final int hashCode() {
        return (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return "SizeAnimationModifierElement(animationSpec=" + this.b + ", alignment=" + this.c + UccrWswQGaIj.RQhX;
    }
}
