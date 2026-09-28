package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ela implements gaj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ela(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                d dVar = (d) obj;
                a aVar = (a) obj2;
                ((Integer) obj3).getClass();
                dVar.getClass();
                aVar.N(393497119);
                d dVarN = dVar.n(androidx.compose.ui.platform.d.a(dVar, ((Enum) obj4).name()));
                aVar.H();
                return dVarN;
            default:
                g1f g1fVar = (g1f) obj4;
                a aVar2 = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((e160) obj).getClass();
                if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    i78 i78VarA = g78.a(new kw0.i(2.0f, false, new jw0(ht.a.k)), ht.a.n, aVar2, 54);
                    int iHashCode = Long.hashCode(aVar2.m());
                    ne00 ne00VarO = aVar2.o();
                    d.a aVar3 = d.a.b;
                    d dVarC = c.c(aVar2, aVar3);
                    yka.k.getClass();
                    tsr.a aVar4 = yka.a.b;
                    if (aVar2.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar2.D();
                    if (aVar2.g()) {
                        aVar2.F(aVar4);
                    } else {
                        aVar2.p();
                    }
                    hlh0.a(aVar2, i78VarA, yka.a.f);
                    hlh0.a(aVar2, ne00VarO, yka.a.e);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                    }
                    hlh0.a(aVar2, dVarC, yka.a.d);
                    String strA = cb40.a(R.string.page_instant_virtual__don_back_to_game, new Object[0], aVar2);
                    qyd0 qyd0Var = kjb0.a;
                    imf0 imf0Var = ((ijb0) aVar2.O(qyd0Var)).g;
                    qyd0 qyd0Var2 = oib0.a;
                    lkf0.d(strA, null, ((lib0) aVar2.O(qyd0Var2)).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var, aVar2, 0, 0, 131066);
                    lkf0.d(g1fVar.d.g((Context) aVar2.O(AndroidCompositionLocals_androidKt.b)), g3w.h(aVar3, "double_or_nothing_final_result_amount_summary_text"), ((lib0) aVar2.O(qyd0Var2)).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar2.O(qyd0Var)).n, aVar2, 48, 0, 131064);
                    aVar2.s();
                } else {
                    aVar2.G();
                }
                return Unit.a;
        }
    }
}
