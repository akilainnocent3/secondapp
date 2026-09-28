package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ia2 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ia2(ka2 ka2Var, Function0 function0, int i) {
        this.c = ka2Var;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((ka2) obj3).b(this.b, (a) obj, qj40.a(7));
                return Unit.a;
            default:
                Function0 function0 = (Function0) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    d.a aVar2 = d.a.b;
                    d dVarE = j.e(aVar2, 1.0f);
                    aiv aivVarC = g75.c(ht.a.e, false);
                    int iHashCode = Long.hashCode(aVar.m());
                    ne00 ne00VarO = aVar.o();
                    d dVarC = c.c(aVar, dVarE);
                    yka.k.getClass();
                    tsr.a aVar3 = yka.a.b;
                    if (aVar.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar.D();
                    if (aVar.g()) {
                        aVar.F(aVar3);
                    } else {
                        aVar.p();
                    }
                    yka.a.b bVar = yka.a.f;
                    hlh0.a(aVar, aivVarC, bVar);
                    yka.a.d dVar = yka.a.e;
                    hlh0.a(aVar, ne00VarO, dVar);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar, iHashCode, c1350a);
                    }
                    yka.a.c cVar = yka.a.d;
                    hlh0.a(aVar, dVarC, cVar);
                    i78 i78VarA = g78.a(kw0.c, ht.a.n, aVar, 48);
                    int iHashCode2 = Long.hashCode(aVar.m());
                    ne00 ne00VarO2 = aVar.o();
                    d dVarC2 = c.c(aVar, aVar2);
                    if (aVar.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar.D();
                    if (aVar.g()) {
                        aVar.F(aVar3);
                    } else {
                        aVar.p();
                    }
                    hlh0.a(aVar, i78VarA, bVar);
                    hlh0.a(aVar, ne00VarO2, dVar);
                    if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode2))) {
                        j3c.a(iHashCode2, aVar, iHashCode2, c1350a);
                    }
                    hlh0.a(aVar, dVarC2, cVar);
                    mw90.a(cb40.a(R.string.lucky_wheel__img_lucky_wheel_prompt, new Object[0], aVar), "Free Spin on the Lucky Wheel !", j.g(j.i(aVar2, 322.0f), 1.0f), null, null, d0b.a.g, null, aVar, 1573296, 1976);
                    xya.a(wtc.b(aVar2, 36.0f, aVar, aVar2, 0.8f), false, cb40.a(R.string.lucky_wheel__spin_now, new Object[0], aVar), "spin_now", null, null, null, null, null, this.b, aVar, 3078, 498);
                    ddd0.a(wtc.b(aVar2, 8.0f, aVar, aVar2, 0.8f), false, null, null, null, false, "later", null, function0, sd9.a, aVar, 806879238, 190);
                    aVar.s();
                    aVar.s();
                } else {
                    aVar.G();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ ia2(Function0 function0, Function0 function1) {
        this.b = function0;
        this.c = function1;
    }
}
