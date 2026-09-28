package defpackage;

import androidx.compose.runtime.a;
import com.sportygames.compose.lobbyv2.models.LobbyV2GameDetailsModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class zej implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zej(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                tgj tgjVar = (tgj) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tgjVar.t3(0, aVar);
                } else {
                    aVar.G();
                }
                break;
            default:
                l1z l1zVar = (l1z) obj3;
                int iIntValue2 = ((Integer) obj).intValue();
                LobbyV2GameDetailsModel lobbyV2GameDetailsModel = (LobbyV2GameDetailsModel) obj2;
                lobbyV2GameDetailsModel.getClass();
                try {
                    if (lobbyV2GameDetailsModel.getCategoryId() != 0) {
                        l1zVar.l(lobbyV2GameDetailsModel.getCategoryId(), iIntValue2);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
        }
        return Unit.a;
    }
}
