package defpackage;

import androidx.compose.runtime.a;
import com.sporty.android.core.model.worldcuptournament.WorldCupTeam;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class owe implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ owe(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String strA = cb40.a(R.string.common_functions__date_of_birth, new Object[0], aVar);
                    boolean zM = aVar.M(function1);
                    Object objY = aVar.y();
                    if (zM || objY == a.C0041a.a) {
                        objY = new qwe(0, function1);
                        aVar.r(objY);
                    }
                    odd0.b(0, aVar, null, strA, (Function0) objY);
                } else {
                    aVar.G();
                }
                break;
            default:
                final r320 r320Var = (r320) obj3;
                a aVar2 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    o0z.a(null, null, null, null, null, pp8.b(88005408, new Function2() { // from class: k320
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            a aVar3 = (a) obj4;
                            int iIntValue3 = ((Integer) obj5).intValue();
                            if (aVar3.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                final r320 r320Var2 = r320Var;
                                ytw ytwVarC = wyh.c(r320Var2.r0().P, aVar3, 0, 7);
                                ytw ytwVarC2 = wyh.c(r320Var2.r0().Q, aVar3, 0, 7);
                                List list = (List) ytwVarC.getValue();
                                WorldCupTeam worldCupTeam = (WorldCupTeam) ytwVarC2.getValue();
                                boolean z = r320Var2.p0() == jz7.c;
                                boolean zA = aVar3.A(r320Var2);
                                Object objY2 = aVar3.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zA || objY2 == c0042a) {
                                    r320.c cVar = new r320.c(0, r320Var2, r320.class, "dismissWorldCupTeamPicker", "dismissWorldCupTeamPicker()V", 0);
                                    aVar3.r(cVar);
                                    objY2 = cVar;
                                }
                                Function0 function0 = (Function0) ((chp) objY2);
                                boolean zA2 = aVar3.A(r320Var2);
                                Object objY3 = aVar3.y();
                                if (zA2 || objY3 == c0042a) {
                                    objY3 = new Function1() { // from class: l320
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj6) {
                                            WorldCupTeam worldCupTeam2 = (WorldCupTeam) obj6;
                                            r320 r320Var3 = r320Var2;
                                            r320Var3.n0();
                                            mz7 mz7VarR0 = r320Var3.r0();
                                            boolean zZ1 = mz7VarR0.z1(worldCupTeam2);
                                            if (zZ1) {
                                                ej5.c(o8i0.d(mz7VarR0), null, null, new vz7(mz7VarR0, worldCupTeam2, null), 3);
                                            }
                                            if (zZ1) {
                                                kz1 kz1Var = r320Var3.C;
                                                if (kz1Var == null) {
                                                    Intrinsics.n("adapter");
                                                    throw null;
                                                }
                                                kz1Var.f();
                                                r320Var3.r0().C1();
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    aVar3.r(objY3);
                                }
                                z8f0.a(list, worldCupTeam, true, z, function0, (Function1) objY3, aVar3, 384, 0);
                            } else {
                                aVar3.G();
                            }
                            return Unit.a;
                        }
                    }, aVar2), aVar2, 196608);
                } else {
                    aVar2.G();
                }
                break;
        }
        return Unit.a;
    }
}
