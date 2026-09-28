package androidx.compose.material3;

import androidx.compose.ui.d;
import defpackage.ee0;
import defpackage.goh;
import defpackage.mtg0;
import defpackage.p3w;
import defpackage.pkd;
import defpackage.psw;
import defpackage.tpf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/ThumbElement;", "Lp3w;", "Ltpf0;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class ThumbElement extends p3w<tpf0> {
    public final psw b;
    public final boolean c;
    public final goh<Float> d;

    public ThumbElement(psw pswVar, boolean z, goh<Float> gohVar) {
        this.b = pswVar;
        this.c = z;
        this.d = gohVar;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        tpf0 tpf0Var = new tpf0();
        tpf0Var.D = this.b;
        tpf0Var.E = this.c;
        tpf0Var.F = this.d;
        tpf0Var.J = Float.NaN;
        tpf0Var.K = Float.NaN;
        return tpf0Var;
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        tpf0 tpf0Var = (tpf0) cVar;
        tpf0Var.D = this.b;
        boolean z = tpf0Var.E;
        boolean z2 = this.c;
        if (z != z2) {
            pkd.f(tpf0Var).P();
        }
        tpf0Var.E = z2;
        tpf0Var.F = this.d;
        if (tpf0Var.I == null && !Float.isNaN(tpf0Var.K)) {
            tpf0Var.I = ee0.a(tpf0Var.K);
        }
        if (tpf0Var.H != null || Float.isNaN(tpf0Var.J)) {
            return;
        }
        tpf0Var.H = ee0.a(tpf0Var.J);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThumbElement)) {
            return false;
        }
        ThumbElement thumbElement = (ThumbElement) obj;
        return Intrinsics.g(this.b, thumbElement.b) && this.c == thumbElement.c && Intrinsics.g(this.d, thumbElement.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + mtg0.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.b + ", checked=" + this.c + ", animationSpec=" + this.d + ')';
    }
}
