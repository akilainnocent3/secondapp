package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import androidx.navigation.fragment.NavHostFragment;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class t94 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t94(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        a.C0041a.C0042a c0042a = a.C0041a.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                final y94 y94Var = (y94) obj4;
                final yfx yfxVar = (yfx) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zA = aVar.A(y94Var) | aVar.A(yfxVar);
                    Object objY = aVar.y();
                    if (zA || objY == c0042a) {
                        objY = new Function0() { // from class: u94
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                if (y94Var.isAdded()) {
                                    yfxVar.k();
                                }
                                return Unit.a;
                            }
                        };
                        aVar.r(objY);
                    }
                    Function0 function0 = (Function0) objY;
                    boolean zA2 = aVar.A(y94Var);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new v94(y94Var, 0);
                        aVar.r(objY2);
                    }
                    Function0 function1 = (Function0) objY2;
                    boolean zA3 = aVar.A(y94Var) | aVar.A(yfxVar);
                    Object objY3 = aVar.y();
                    if (zA3 || objY3 == c0042a) {
                        objY3 = new Function1() { // from class: w94
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                final String str;
                                long jLongValue = ((Long) obj5).longValue();
                                y94 y94Var2 = y94Var;
                                if (y94Var2.isAdded()) {
                                    yfx yfxVarA = NavHostFragment.a.a(y94Var2);
                                    yfxVarA.getClass();
                                    try {
                                        yfxVarA.c();
                                        str = "bio_auth_entry_route";
                                    } catch (IllegalArgumentException unused) {
                                        str = "bio_auth_verify_identity_route/{bio_auth_verify_identity_purpose}";
                                    }
                                    zix zixVarA = bjx.a(new r8a(1, new Function1() { // from class: x94
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj6) {
                                            ajx ajxVar = (ajx) obj6;
                                            ajxVar.getClass();
                                            ajxVar.b(str);
                                            ajxVar.a(-1);
                                            i220 i220Var = new i220();
                                            i220Var.a = true;
                                            Unit unit = Unit.a;
                                            ajxVar.f = true;
                                            ajxVar.g = i220Var.b;
                                            return Unit.a;
                                        }
                                    }));
                                    yfx yfxVar2 = yfxVar;
                                    yfxVar2.getClass();
                                    yfx.i(yfxVar2, avg.a(jLongValue, "bio_auth_verification_successful_route/"), zixVarA, 4);
                                }
                                return Unit.a;
                            }
                        };
                        aVar.r(objY3);
                    }
                    ka4.a(function0, function1, (Function1) objY3, null, aVar, 0);
                } else {
                    aVar.G();
                }
                break;
            default:
                jqc0 jqc0Var = (jqc0) obj4;
                Function1 function2 = (Function1) obj3;
                a aVar2 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    String strA = cb40.a(R.string.page_instant_virtual__pick_any_two_teams_to_create_your_dream_football_match, new Object[0], aVar2);
                    d dVarG = h.g(g3w.k(d.a.b, jqc0Var.b == kqc0.a), 8.0f, 4.0f);
                    boolean zM = aVar2.M(function2);
                    Object objY4 = aVar2.y();
                    if (zM || objY4 == c0042a) {
                        objY4 = new er40(function2, 1);
                        aVar2.r(objY4);
                    }
                    Function0 function3 = (Function0) objY4;
                    boolean zM2 = aVar2.M(function2);
                    Object objY5 = aVar2.y();
                    if (zM2 || objY5 == c0042a) {
                        objY5 = new ybw(function2, 1);
                        aVar2.r(objY5);
                    }
                    iqc0.b(dVarG, 1, strA, null, function3, (Function0) objY5, 0L, aVar2, 432, 144);
                } else {
                    aVar2.G();
                }
                break;
        }
        return Unit.a;
    }
}
