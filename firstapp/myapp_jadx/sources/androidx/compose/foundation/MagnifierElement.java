package androidx.compose.foundation;

import android.view.View;
import defpackage.ajf0;
import defpackage.biu;
import defpackage.ciu;
import defpackage.f87;
import defpackage.g7f;
import defpackage.gly;
import defpackage.jj10;
import defpackage.mmd;
import defpackage.mtg0;
import defpackage.ob80;
import defpackage.p3w;
import defpackage.pkd;
import defpackage.qkd;
import defpackage.tvh;
import defpackage.zif0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/MagnifierElement;", "Lp3w;", "Lbiu;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MagnifierElement extends p3w<biu> {
    public final zif0 b;
    public final ajf0 c;
    public final float d = Float.NaN;
    public final boolean e = true;
    public final long f = 9205357640488583168L;
    public final float g = Float.NaN;
    public final float h = Float.NaN;
    public final boolean i = true;
    public final jj10 j;

    public MagnifierElement(zif0 zif0Var, ajf0 ajf0Var, jj10 jj10Var) {
        this.b = zif0Var;
        this.c = ajf0Var;
        this.j = jj10Var;
    }

    @Override // defpackage.p3w
    public final androidx.compose.ui.d.c a() {
        return new biu(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    @Override // defpackage.p3w
    public final void d(androidx.compose.ui.d.c cVar) {
        biu biuVar = (biu) cVar;
        float f = biuVar.F;
        long j = biuVar.H;
        float f2 = biuVar.I;
        boolean z = biuVar.G;
        float f3 = biuVar.J;
        boolean z2 = biuVar.K;
        jj10 jj10Var = biuVar.L;
        View view = biuVar.M;
        mmd mmdVar = biuVar.N;
        biuVar.D = this.b;
        float f4 = this.d;
        biuVar.F = f4;
        boolean z3 = this.e;
        biuVar.G = z3;
        long j2 = this.f;
        biuVar.H = j2;
        float f5 = this.g;
        biuVar.I = f5;
        float f6 = this.h;
        biuVar.J = f6;
        boolean z4 = this.i;
        biuVar.K = z4;
        biuVar.E = this.c;
        jj10 jj10Var2 = this.j;
        biuVar.L = jj10Var2;
        View viewA = qkd.a(biuVar);
        mmd mmdVar2 = pkd.f(biuVar).N;
        if (biuVar.O != null) {
            ob80<Function0<gly>> ob80Var = ciu.a;
            if (((!Float.isNaN(f4) || !Float.isNaN(f)) && f4 != f && !jj10Var2.a()) || j2 != j || !g7f.b(f5, f2) || !g7f.b(f6, f3) || z3 != z || z4 != z2 || !Intrinsics.g(jj10Var2, jj10Var) || !viewA.equals(view) || !Intrinsics.g(mmdVar2, mmdVar)) {
                biuVar.q2();
            }
        }
        biuVar.r2();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MagnifierElement) {
            MagnifierElement magnifierElement = (MagnifierElement) obj;
            if (this.b == magnifierElement.b && this.d == magnifierElement.d && this.e == magnifierElement.e && this.f == magnifierElement.f && g7f.b(this.g, magnifierElement.g) && g7f.b(this.h, magnifierElement.h) && this.i == magnifierElement.i && this.c == magnifierElement.c && Intrinsics.g(this.j, magnifierElement.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iA = mtg0.a(tvh.a(this.h, tvh.a(this.g, f87.a(mtg0.a(tvh.a(this.d, hashCode() * 961, 31), 31, this.e), this.f, 31), 31), 31), 31, this.i);
        ajf0 ajf0Var = this.c;
        return this.j.hashCode() + ((iA + (ajf0Var != null ? ajf0Var.hashCode() : 0)) * 31);
    }
}
