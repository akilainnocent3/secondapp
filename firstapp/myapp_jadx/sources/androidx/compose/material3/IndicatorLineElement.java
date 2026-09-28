package androidx.compose.material3;

import androidx.compose.ui.d;
import defpackage.ej5;
import defpackage.g7f;
import defpackage.jvd0;
import defpackage.k35;
import defpackage.lff0;
import defpackage.mtg0;
import defpackage.p3w;
import defpackage.pfn;
import defpackage.psw;
import defpackage.qx80;
import defpackage.rfn;
import defpackage.tvh;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/IndicatorLineElement;", "Lp3w;", "Lpfn;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class IndicatorLineElement extends p3w<pfn> {
    public final boolean b;
    public final boolean c;
    public final psw d;
    public final lff0 e;
    public final qx80 f;
    public final float g = 2.0f;
    public final float h = 1.0f;

    public IndicatorLineElement(boolean z, boolean z2, psw pswVar, lff0 lff0Var, qx80 qx80Var) {
        this.b = z;
        this.c = z2;
        this.d = pswVar;
        this.e = lff0Var;
        this.f = qx80Var;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        return new pfn(this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        boolean z;
        pfn pfnVar = (pfn) cVar;
        boolean z2 = pfnVar.F;
        boolean z3 = this.b;
        boolean z4 = true;
        if (z2 != z3) {
            pfnVar.F = z3;
            z = true;
        } else {
            z = false;
        }
        boolean z5 = pfnVar.G;
        boolean z6 = this.c;
        if (z5 != z6) {
            pfnVar.G = z6;
            z = true;
        }
        psw pswVar = pfnVar.H;
        psw pswVar2 = this.d;
        if (pswVar != pswVar2) {
            pfnVar.H = pswVar2;
            jvd0 jvd0Var = pfnVar.L;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            pfnVar.L = ej5.c(pfnVar.d2(), null, null, new rfn(pfnVar, null), 3);
        }
        lff0 lff0Var = pfnVar.M;
        lff0 lff0Var2 = this.e;
        if (!Intrinsics.g(lff0Var, lff0Var2)) {
            pfnVar.M = lff0Var2;
            z = true;
        }
        qx80 qx80Var = pfnVar.O;
        qx80 qx80Var2 = this.f;
        if (!Intrinsics.g(qx80Var, qx80Var2)) {
            if (!Intrinsics.g(pfnVar.O, qx80Var2)) {
                pfnVar.O = qx80Var2;
                pfnVar.Q.W0();
            }
            z = true;
        }
        float f = pfnVar.I;
        float f2 = this.g;
        if (!g7f.b(f, f2)) {
            pfnVar.I = f2;
            z = true;
        }
        float f3 = pfnVar.J;
        float f4 = this.h;
        if (g7f.b(f3, f4)) {
            z4 = z;
        } else {
            pfnVar.J = f4;
        }
        if (z4) {
            pfnVar.s2();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicatorLineElement)) {
            return false;
        }
        IndicatorLineElement indicatorLineElement = (IndicatorLineElement) obj;
        return this.b == indicatorLineElement.b && this.c == indicatorLineElement.c && Intrinsics.g(this.d, indicatorLineElement.d) && Intrinsics.g(this.e, indicatorLineElement.e) && Intrinsics.g(this.f, indicatorLineElement.f) && g7f.b(this.g, indicatorLineElement.g) && g7f.b(this.h, indicatorLineElement.h);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + mtg0.a(Boolean.hashCode(this.b) * 31, 31, this.c)) * 31;
        lff0 lff0Var = this.e;
        int iHashCode2 = (iHashCode + (lff0Var == null ? 0 : lff0Var.hashCode())) * 31;
        qx80 qx80Var = this.f;
        return Float.hashCode(this.h) + tvh.a(this.g, (iHashCode2 + (qx80Var != null ? qx80Var.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IndicatorLineElement(enabled=");
        sb.append(this.b);
        sb.append(", isError=");
        sb.append(this.c);
        sb.append(", interactionSource=");
        sb.append(this.d);
        sb.append(", colors=");
        sb.append(this.e);
        sb.append(", textFieldShape=");
        sb.append(this.f);
        sb.append(", focusedIndicatorLineThickness=");
        k35.a(this.g, ", unfocusedIndicatorLineThickness=", sb);
        sb.append((Object) g7f.c(this.h));
        sb.append(')');
        return sb.toString();
    }
}
