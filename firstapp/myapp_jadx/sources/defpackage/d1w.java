package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d1w implements Function2<a, Integer, Unit> {
    public final /* synthetic */ long A;
    public final /* synthetic */ long B;
    public final /* synthetic */ Function2<a, Integer, Unit> C;
    public final /* synthetic */ Function2<a, Integer, g8j0> D;
    public final /* synthetic */ op8 E;
    public final /* synthetic */ long a;
    public final /* synthetic */ Function0<Unit> b;
    public final /* synthetic */ j590 c;
    public final /* synthetic */ w1w d;
    public final /* synthetic */ wd0<Float, ij0> e;
    public final /* synthetic */ v5b f;
    public final /* synthetic */ Function1<Float, Unit> i;
    public final /* synthetic */ d v;
    public final /* synthetic */ float w;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ qx80 z;

    public d1w(long j, Function0 function0, j590 j590Var, w1w w1wVar, wd0 wd0Var, v5b v5bVar, Function1 function1, d dVar, float f, boolean z, qx80 qx80Var, long j2, long j3, Function2 function2, Function2 function3, op8 op8Var) {
        this.a = j;
        this.b = function0;
        this.c = j590Var;
        this.d = w1wVar;
        this.e = wd0Var;
        this.f = v5bVar;
        this.i = function1;
        this.v = dVar;
        this.w = f;
        this.y = z;
        this.z = qx80Var;
        this.A = j2;
        this.B = j3;
        this.C = function2;
        this.D = function3;
        this.E = op8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            d dVarA = v8j0.a(j.e(d.a.b, 1.0f));
            Object objY = aVar2.y();
            if (objY == a.C0041a.a) {
                objY = new m14(1);
                aVar2.r(objY);
            }
            d dVarB = xa80.b(dVarA, false, (Function1) objY);
            aiv aivVarC = g75.c(ht.a.a, false);
            int I = aVar2.I();
            ne00 ne00VarO = aVar2.o();
            d dVarC = c.c(aVar2, dVarB);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            if (aVar2.k() == null) {
                l2a.b();
                throw null;
            }
            aVar2.D();
            if (aVar2.g()) {
                aVar2.F(aVar3);
            } else {
                aVar2.p();
            }
            hlh0.a(aVar2, aivVarC, yka.a.f);
            hlh0.a(aVar2, ne00VarO, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(I))) {
                j3c.a(I, aVar2, I, c1350a);
            }
            hlh0.a(aVar2, dVarC, yka.a.d);
            j590 j590Var = this.c;
            boolean z = ((k590) j590Var.e.h.getValue()) != k590.a;
            boolean z2 = this.d.c;
            long j = this.a;
            Function0<Unit> function0 = this.b;
            v1w.d(j, function0, z, z2, aVar2, 0);
            v1w.c(this.e, this.f, function0, this.i, this.v, j590Var, this.w, this.y, this.z, this.A, this.B, 0.0f, this.C, this.D, this.E, aVar2, 70);
            aVar2.s();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
