package defpackage;

import androidx.compose.runtime.a;
import com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class eo1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ eo1(oxj oxjVar, LobbyV2ViewModel lobbyV2ViewModel) {
        this.a = 1;
        this.b = oxjVar;
        this.c = lobbyV2ViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        oxj oxjVar;
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                go1.b((so1) obj4, (b47) obj3, (a) obj, qj40.a(1));
                break;
            case 1:
                oxj oxjVar2 = (oxj) obj4;
                LobbyV2ViewModel lobbyV2ViewModel = (LobbyV2ViewModel) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    xw4 xw4Var = (xw4) oxjVar2.K.getValue();
                    fuj fujVarQ0 = oxjVar2.q0();
                    db6 db6Var = (db6) oxjVar2.I.getValue();
                    boolean zBooleanValue = ((Boolean) ((x5a0) oxjVar2.F).getValue()).booleanValue();
                    boolean zA = aVar.A(oxjVar2);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        oxjVar = oxjVar2;
                        oxj.b bVar = new oxj.b(0, oxjVar, oxj.class, "onStackerIconClick", "onStackerIconClick()V", 0);
                        aVar.r(bVar);
                        objY = bVar;
                    } else {
                        oxjVar = oxjVar2;
                    }
                    Function0 function0 = (Function0) ((chp) objY);
                    boolean zA2 = aVar.A(oxjVar);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        oxj.c cVar = new oxj.c(1, oxjVar, oxj.class, "onBonusVaultGameClick", "onBonusVaultGameClick(Lcom/sportygames/component/vault/models/BonusVaultGame;)V", 0);
                        aVar.r(cVar);
                        objY2 = cVar;
                    }
                    Function1 function1 = (Function1) ((chp) objY2);
                    Object objY3 = aVar.y();
                    if (objY3 == c0042a) {
                        objY3 = new fxj();
                        aVar.r(objY3);
                    }
                    s8a.a(xw4Var, lobbyV2ViewModel, fujVarQ0, db6Var, zBooleanValue, function0, function1, (Function0) objY3, aVar, 12582912);
                } else {
                    aVar.G();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                b6j0.c((Function0) obj4, (h2j0) obj3, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ eo1(Object obj, int i, int i2, Object obj2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
