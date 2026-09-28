package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportygames.compose.lobbyv2.models.LobbyV2GameDetailsModel;
import com.sportygames.compose.lobbyv2.models.LobbyV2HomeItemModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d8a implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d8a(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                db6 db6Var = (db6) obj4;
                ytw ytwVar = (ytw) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    d dVarC = j.c(d.a.b, 1.0f);
                    String str = db6Var.c;
                    if (str == null) {
                        str = "Campaign";
                    }
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (objY == c0042a) {
                        objY = new e8a(ytwVar, 0);
                        aVar.r(objY);
                    }
                    Function0 function0 = (Function0) objY;
                    boolean zA = aVar.A(db6Var);
                    Object objY2 = aVar.y();
                    if (zA || objY2 == c0042a) {
                        objY2 = new f8a(db6Var, 0);
                        aVar.r(objY2);
                    }
                    Function0 function1 = (Function0) objY2;
                    boolean zA2 = aVar.A(db6Var);
                    Object objY3 = aVar.y();
                    if (zA2 || objY3 == c0042a) {
                        objY3 = new g8a(db6Var, 0);
                        aVar.r(objY3);
                    }
                    t66.a(dVarC, db6Var, str, function0, function1, (Function0) objY3, aVar, 3078);
                } else {
                    aVar.G();
                }
                break;
            default:
                int iIntValue2 = ((Integer) obj).intValue();
                LobbyV2GameDetailsModel lobbyV2GameDetailsModel = (LobbyV2GameDetailsModel) obj2;
                lobbyV2GameDetailsModel.getClass();
                ((l1z) obj4).i(lobbyV2GameDetailsModel.getDisplayName(), "lobby_home", iIntValue2, ((LobbyV2HomeItemModel) obj3).getKey(), lobbyV2GameDetailsModel.getGameId$SGLibrary_sportybetRelease());
                break;
        }
        return Unit.a;
    }
}
