package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.k;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.core.model.loyalty.RewardShowOffData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jii implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ haj b;

    public /* synthetic */ jii(haj hajVar, int i) {
        this.a = i;
        this.b = hajVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        haj hajVar = this.b;
        switch (i) {
            case 0:
                kp7 kp7Var = (kp7) obj;
                RewardShowOffData rewardShowOffData = (RewardShowOffData) obj2;
                kp7Var.getClass();
                rewardShowOffData.getClass();
                ((Function1) hajVar).invoke(new ebi.c(kp7Var, rewardShowOffData));
                return Unit.a;
            default:
                Function0 function0 = (Function0) hajVar;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    d.a aVar2 = d.a.b;
                    d dVarE = j.e(aVar2, 1.0f);
                    aiv aivVarC = g75.c(ht.a.h, false);
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
                    hlh0.a(aVar, aivVarC, yka.a.f);
                    hlh0.a(aVar, ne00VarO, yka.a.e);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar, iHashCode, c1350a);
                    }
                    hlh0.a(aVar, dVarC, yka.a.d);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (objY == c0042a) {
                        objY = k.a(0);
                        aVar.r(objY);
                    }
                    osw oswVar = (osw) objY;
                    Object objY2 = aVar.y();
                    if (objY2 == c0042a) {
                        objY2 = k.a(0);
                        aVar.r(objY2);
                    }
                    osw oswVar2 = (osw) objY2;
                    Object objY3 = aVar.y();
                    if (objY3 == c0042a) {
                        objY3 = ee0.a(0.0f);
                        aVar.r(objY3);
                    }
                    wd0 wd0Var = (wd0) objY3;
                    Integer numValueOf = Integer.valueOf(oswVar.D());
                    Integer numValueOf2 = Integer.valueOf(oswVar2.D());
                    boolean zA = aVar.A(wd0Var) | aVar.M(function0);
                    Object objY4 = aVar.y();
                    if (zA || objY4 == c0042a) {
                        aq90.a aVar4 = new aq90.a(wd0Var, function0, oswVar, oswVar2, null);
                        aVar.r(aVar4);
                        objY4 = aVar4;
                    }
                    xvf.g(numValueOf, numValueOf2, (Function2) objY4, aVar);
                    d dVarG = j.g(aVar2, 1.0f);
                    aVar.N(-1003410150);
                    aVar.N(212064437);
                    aVar.H();
                    mmd mmdVar = (mmd) aVar.O(kna.h);
                    Object objY5 = aVar.y();
                    if (objY5 == c0042a) {
                        objY5 = new niv(mmdVar);
                        aVar.r(objY5);
                    }
                    niv nivVar = (niv) objY5;
                    Object objY6 = aVar.y();
                    if (objY6 == c0042a) {
                        objY6 = new nwa();
                        aVar.r(objY6);
                    }
                    nwa nwaVar = (nwa) objY6;
                    Object objY7 = aVar.y();
                    if (objY7 == c0042a) {
                        objY7 = m.b(Boolean.FALSE);
                        aVar.r(objY7);
                    }
                    ytw ytwVar = (ytw) objY7;
                    Object objY8 = aVar.y();
                    if (objY8 == c0042a) {
                        objY8 = new twa(nwaVar);
                        aVar.r(objY8);
                    }
                    twa twaVar = (twa) objY8;
                    Object objY9 = aVar.y();
                    if (objY9 == c0042a) {
                        objY9 = m.a(Unit.a, epx.a);
                        aVar.r(objY9);
                    }
                    ytw ytwVar2 = (ytw) objY9;
                    boolean zA2 = aVar.A(nivVar) | aVar.d(257);
                    Object objY10 = aVar.y();
                    if (zA2 || objY10 == c0042a) {
                        objY10 = new aq90.g(ytwVar2, nivVar, twaVar, ytwVar);
                        aVar.r(objY10);
                    }
                    aiv aivVar = (aiv) objY10;
                    Object objY11 = aVar.y();
                    if (objY11 == c0042a) {
                        objY11 = new aq90.h(ytwVar, twaVar);
                        aVar.r(objY11);
                    }
                    Function0 function1 = (Function0) objY11;
                    boolean zA3 = aVar.A(nivVar);
                    Object objY12 = aVar.y();
                    if (zA3 || objY12 == c0042a) {
                        objY12 = new aq90.i(nivVar);
                        aVar.r(objY12);
                    }
                    lsr.a(xa80.b(dVarG, false, (Function1) objY12), pp8.b(1200550679, new aq90.j(ytwVar2, nwaVar, function1, wd0Var, oswVar, oswVar2), aVar), aivVar, aVar, 48);
                    aVar.H();
                    aVar.s();
                } else {
                    aVar.G();
                }
                return Unit.a;
        }
    }
}
