package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportygames.compose.lobbyv2.models.LobbyV2GameDetailsModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p7t implements gaj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p7t(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                LobbyV2GameDetailsModel lobbyV2GameDetailsModel = (LobbyV2GameDetailsModel) obj4;
                a aVar = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((j78) obj).getClass();
                if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    nan.a aVar2 = new nan.a((Context) aVar.O(AndroidCompositionLocals_androidKt.b));
                    aVar2.c = lobbyV2GameDetailsModel.getImageUrl();
                    fn80.a(aVar2.a(), lobbyV2GameDetailsModel.getDisplayName(), j.c(j.g(d.a.b, 1.0f), 1.0f), d0b.a.g, ht.a.e, 0.0f, null, null, null, aVar, 200064, 2000);
                } else {
                    aVar.G();
                }
                break;
            default:
                o860.b bVar = (o860.b) obj4;
                a aVar3 = (a) obj2;
                ((Integer) obj3).getClass();
                ((jh0) obj).getClass();
                Object objY = aVar3.y();
                a.C0041a.C0042a c0042a = a.C0041a.a;
                if (objY == c0042a) {
                    objY = m.b(new o860.b(0));
                    aVar3.r(objY);
                }
                ytw ytwVar = (ytw) objY;
                o860.b bVar2 = (o860.b) ytwVar.getValue();
                boolean zM = aVar3.M(bVar);
                Object objY2 = aVar3.y();
                if (zM || objY2 == c0042a) {
                    objY2 = new aa60.e(bVar, ytwVar, null);
                    aVar3.r(objY2);
                }
                xvf.e(aVar3, bVar2, (Function2) objY2);
                aa60.o((o860.b) ytwVar.getValue(), aVar3, 0);
                break;
        }
        return Unit.a;
    }
}
