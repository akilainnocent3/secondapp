package defpackage;

import com.sportybet.android.globalpay.pixBtg.deposit.PixBtgDepositFragment;
import com.sportybet.plugin.myfavorite.util.MyFavoriteTypeEnum;
import com.sportybet.plugin.realsports.data.MyFavoriteMarket;
import com.sportygames.crash.models.BetData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class sv4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sv4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                tcf tcfVar = (tcf) obj;
                tcfVar.getClass();
                tcf.V1(tcfVar, (vu30) obj2, 0L, 0L, 0.0f, null, null, 0, WebSocketProtocol.PAYLOAD_SHORT);
                return Unit.a;
            case 1:
                uvw uvwVar = (uvw) obj2;
                hqc hqcVar = (hqc) obj;
                pzw pzwVar = uvwVar.z;
                if (hqcVar instanceof lqc) {
                    return new ssw(new lqc());
                }
                if (!(hqcVar instanceof nqc)) {
                    return new ssw(new kqc());
                }
                List<MyFavoriteMarket> list = (List) ((nqc) hqcVar).a;
                ArrayList arrayList = new ArrayList();
                for (MyFavoriteMarket myFavoriteMarket : list) {
                    arrayList.add(new rww(MyFavoriteTypeEnum.MARKET, myFavoriteMarket, myFavoriteMarket.id, uvwVar.D1(myFavoriteMarket.sportId, myFavoriteMarket.marketId), myFavoriteMarket.marketName));
                }
                pzwVar.b = arrayList;
                return new ssw(new nqc(pzwVar));
            case 2:
                ohp<Object>[] ohpVarArr = PixBtgDepositFragment.m0;
                ((PixBtgDepositFragment) obj2).E1().b.setError((String) obj);
                return Unit.a;
            default:
                vad0 vad0Var = (vad0) obj2;
                BetData betData = (BetData) obj;
                betData.getClass();
                vad0Var.e3(vad0Var.R0(), betData);
                return Unit.a;
        }
    }
}
