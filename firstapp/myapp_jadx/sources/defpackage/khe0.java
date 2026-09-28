package defpackage;

import androidx.compose.material3.MinimumInteractiveModifier;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class khe0 implements Function2<a, Integer, Unit> {
    public final /* synthetic */ d a;
    public final /* synthetic */ qx80 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ float d;
    public final /* synthetic */ l35 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ psw i;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ Function0<Unit> w;
    public final /* synthetic */ float y;
    public final /* synthetic */ op8 z;

    public khe0(d dVar, qx80 qx80Var, long j, float f, l35 l35Var, boolean z, psw pswVar, boolean z2, Function0 function0, float f2, op8 op8Var) {
        this.a = dVar;
        this.b = qx80Var;
        this.c = j;
        this.d = f;
        this.e = l35Var;
        this.f = z;
        this.i = pswVar;
        this.v = z2;
        this.w = function0;
        this.y = f2;
        this.z = op8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            mjm mjmVar = zxo.a;
            d dVarA = fk7.a(androidx.compose.foundation.selection.a.a(ihe0.d(this.a.n(MinimumInteractiveModifier.b), this.b, ihe0.e(this.c, this.d, aVar2), this.e, ((mmd) aVar2.O(kna.h)).C1(this.y)), this.f, this.i, ut50.b(0.0f, 7, 0L, false), this.v, null, this.w));
            aiv aivVarC = g75.c(ht.a.a, true);
            int I = aVar2.I();
            ne00 ne00VarO = aVar2.o();
            d dVarC = c.c(aVar2, dVarA);
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
            fc0.a(0, this.z, aVar2);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
