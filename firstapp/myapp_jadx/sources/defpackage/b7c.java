package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.bookingcode.presentation.activity.CustomCodeComposeUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b7c implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b7c(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                return CustomCodeComposeUtil.r((CustomCodeComposeUtil) obj5, (ytw) obj4, (ytw) obj3, (gdc) obj, (jz0) obj2);
            default:
                ruq ruqVar = (ruq) obj5;
                d dVar = (d) obj4;
                final Function1 function1 = (Function1) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    cuq cuqVar = ruqVar.a;
                    if (Intrinsics.g(cuqVar, cuq.a.a)) {
                        aVar.N(140784966);
                        quq.b(0, aVar);
                        aVar.H();
                    } else if (Intrinsics.g(cuqVar, cuq.b.a)) {
                        aVar.N(140787208);
                        d dVarE = j.e(dVar, 1.0f);
                        long j = j58.l;
                        qyd0 qyd0Var = oib0.a;
                        long j2 = ((lib0) aVar.O(qyd0Var)).c0;
                        long j3 = ((lib0) aVar.O(qyd0Var)).o;
                        long j4 = ((lib0) aVar.O(qyd0Var)).q;
                        boolean zM = aVar.M(function1);
                        Object objY = aVar.y();
                        if (zM || objY == a.C0041a.a) {
                            objY = new Function0() { // from class: juq
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function1.invoke(buq.e.a);
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY);
                        }
                        e7q.a(dVarE, j, j2, j3, j4, (Function0) objY, aVar, 48, 0);
                        aVar.H();
                    } else if (Intrinsics.g(cuqVar, cuq.c.a)) {
                        aVar.N(140801467);
                        d dVarE2 = j.e(dVar, 1.0f);
                        aiv aivVarC = g75.c(ht.a.e, false);
                        int iHashCode = Long.hashCode(aVar.m());
                        ne00 ne00VarO = aVar.o();
                        d dVarC = c.c(aVar, dVarE2);
                        yka.k.getClass();
                        tsr.a aVar2 = yka.a.b;
                        if (aVar.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar.D();
                        if (aVar.g()) {
                            aVar.F(aVar2);
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
                        q330.a(j.r(d.a.b, 39.0f), ((lib0) aVar.O(oib0.a)).c0, 4.5f, 0L, 0, 0.0f, aVar, 390, 56);
                        aVar.s();
                        aVar.H();
                    } else {
                        if (!(cuqVar instanceof cuq.d)) {
                            throw rg.a(140783537, aVar);
                        }
                        aVar.N(140815205);
                        ntq.a(dVar, (cuq.d) cuqVar, function1, aVar, 0);
                        aVar.H();
                    }
                } else {
                    aVar.G();
                }
                return Unit.a;
        }
    }
}
