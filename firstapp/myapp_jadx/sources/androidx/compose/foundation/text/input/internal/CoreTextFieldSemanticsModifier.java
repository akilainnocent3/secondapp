package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.d;
import defpackage.b5i;
import defpackage.bcn;
import defpackage.ey1;
import defpackage.iif0;
import defpackage.ijf0;
import defpackage.m4b;
import defpackage.mly;
import defpackage.mtg0;
import defpackage.n6s;
import defpackage.o4b;
import defpackage.p3w;
import defpackage.pkd;
import defpackage.t4b;
import defpackage.ulf0;
import defpackage.wsg0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;", "Lp3w;", "Lt4b;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CoreTextFieldSemanticsModifier extends p3w<t4b> {
    public final wsg0 b;
    public final ijf0 c;
    public final n6s d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final mly h;
    public final iif0 i;
    public final bcn j;
    public final b5i k;

    public CoreTextFieldSemanticsModifier(wsg0 wsg0Var, ijf0 ijf0Var, n6s n6sVar, boolean z, boolean z2, boolean z3, mly mlyVar, iif0 iif0Var, bcn bcnVar, b5i b5iVar) {
        this.b = wsg0Var;
        this.c = ijf0Var;
        this.d = n6sVar;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = mlyVar;
        this.i = iif0Var;
        this.j = bcnVar;
        this.k = b5iVar;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        t4b t4bVar = new t4b();
        t4bVar.F = this.b;
        t4bVar.G = this.c;
        t4bVar.H = this.d;
        t4bVar.I = this.e;
        t4bVar.J = this.f;
        t4bVar.K = this.g;
        t4bVar.L = this.h;
        iif0 iif0Var = this.i;
        t4bVar.M = iif0Var;
        t4bVar.N = this.j;
        t4bVar.O = this.k;
        iif0Var.g = new o4b(t4bVar, 0);
        return t4bVar;
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        t4b t4bVar = (t4b) cVar;
        boolean z = t4bVar.J;
        boolean z2 = z && !t4bVar.I;
        boolean z3 = t4bVar.K;
        bcn bcnVar = t4bVar.N;
        iif0 iif0Var = t4bVar.M;
        boolean z4 = this.e;
        boolean z5 = this.f;
        boolean z6 = z5 && !z4;
        t4bVar.F = this.b;
        ijf0 ijf0Var = this.c;
        t4bVar.G = ijf0Var;
        t4bVar.H = this.d;
        t4bVar.I = z4;
        t4bVar.J = z5;
        t4bVar.L = this.h;
        iif0 iif0Var2 = this.i;
        t4bVar.M = iif0Var2;
        bcn bcnVar2 = this.j;
        t4bVar.N = bcnVar2;
        t4bVar.O = this.k;
        if (z5 != z || z6 != z2 || !Intrinsics.g(bcnVar2, bcnVar) || this.g != z3 || !ulf0.c(ijf0Var.b)) {
            pkd.f(t4bVar).R();
        }
        if (Intrinsics.g(iif0Var2, iif0Var)) {
            return;
        }
        iif0Var2.g = new m4b(t4bVar, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoreTextFieldSemanticsModifier)) {
            return false;
        }
        CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier = (CoreTextFieldSemanticsModifier) obj;
        return Intrinsics.g(this.b, coreTextFieldSemanticsModifier.b) && Intrinsics.g(this.c, coreTextFieldSemanticsModifier.c) && Intrinsics.g(this.d, coreTextFieldSemanticsModifier.d) && this.e == coreTextFieldSemanticsModifier.e && this.f == coreTextFieldSemanticsModifier.f && this.g == coreTextFieldSemanticsModifier.g && Intrinsics.g(this.h, coreTextFieldSemanticsModifier.h) && Intrinsics.g(this.i, coreTextFieldSemanticsModifier.i) && Intrinsics.g(this.j, coreTextFieldSemanticsModifier.j) && Intrinsics.g(this.k, coreTextFieldSemanticsModifier.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + mtg0.a(mtg0.a(mtg0.a((this.d.hashCode() + ey1.b(this.c, this.b.hashCode() * 31, 31)) * 31, 31, this.e), 31, this.f), 31, this.g)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.b + ", value=" + this.c + ", state=" + this.d + ", readOnly=" + this.e + ", enabled=" + this.f + ", isPassword=" + this.g + ", offsetMapping=" + this.h + ", manager=" + this.i + ", imeOptions=" + this.j + ", focusRequester=" + this.k + ')';
    }
}
