package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class nhh implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nhh(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                bhh bhhVar = (bhh) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(1 & iIntValue, (iIntValue & 3) != 2)) {
                    lkf0.d(bhhVar.b.g((Context) aVar.O(AndroidCompositionLocals_androidKt.b)), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, aVar), aVar, 0, 0, 131070);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                final mg40 mg40Var = (mg40) obj3;
                a aVar2 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    uqm uqmVar = mg40Var.f;
                    if (uqmVar == null) {
                        Intrinsics.n("accountHelper");
                        throw null;
                    }
                    boolean zHasPersonalPage = uqmVar.hasPersonalPage();
                    boolean zA = aVar2.A(mg40Var);
                    Object objY = aVar2.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        objY = new ohh(mg40Var, 2);
                        aVar2.r(objY);
                    }
                    Function0 function0 = (Function0) objY;
                    boolean zA2 = aVar2.A(mg40Var);
                    Object objY2 = aVar2.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new Function0() { // from class: kg40
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                mg40 mg40Var2 = mg40Var;
                                ((br3) mmc.a(hp0.A, br3.class)).U().e();
                                mg40Var2.requireActivity().finish();
                                return Unit.a;
                            }
                        };
                        aVar2.r(objY2);
                    }
                    Function0 function1 = (Function0) objY2;
                    boolean zA3 = aVar2.A(mg40Var);
                    Object objY3 = aVar2.y();
                    if (zA3 || objY3 == c0042a) {
                        objY3 = new gaj() { // from class: lg40
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                String str = (String) obj4;
                                List list = (List) obj5;
                                boolean zBooleanValue = ((Boolean) obj6).booleanValue();
                                str.getClass();
                                list.getClass();
                                e eVarRequireActivity = mg40Var.requireActivity();
                                eVarRequireActivity.getClass();
                                ekl.b(eVarRequireActivity, str, list, "BOOK_BET_LOAD_CODE", true, zBooleanValue);
                                return Unit.a;
                            }
                        };
                        aVar2.r(objY3);
                    }
                    gaj gajVar = (gaj) objY3;
                    g08 g08Var = g08.BOOK_BET_LOAD_CODE;
                    jrm jrmVar = mg40Var.i;
                    if (jrmVar == null) {
                        Intrinsics.n("betItem");
                        throw null;
                    }
                    yh40.e(true, zHasPersonalPage, function0, function1, gajVar, g08Var, jrmVar, aVar2, 1572918);
                } else {
                    aVar2.G();
                }
                return Unit.a;
        }
    }
}
