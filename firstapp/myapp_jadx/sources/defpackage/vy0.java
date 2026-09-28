package defpackage;

import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import com.sportygames.pocketrocket.model.response.GameSocektResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class vy0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vy0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        GameSocektResponse.Info info;
        GameSocektResponse.Info.InfoDetails blue;
        String multiplier;
        zt50 zt50Var;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                AssetsInfo assetsInfo = (AssetsInfo) obj;
                assetsInfo.getClass();
                assetsInfo.balance = ((Long) obj2).longValue();
                return assetsInfo;
            default:
                zy10 zy10Var = (zy10) obj2;
                GameSocektResponse gameSocektResponse = zy10Var.Q;
                if (gameSocektResponse != null && (info = gameSocektResponse.getInfo()) != null && (blue = info.getBLUE()) != null && (multiplier = blue.getMultiplier()) != null && (zt50Var = zy10Var.b) != null) {
                    zy10Var.F0(zt50Var.z, multiplier, "BLUE");
                }
                wz.a("ChatCashout", "Pocket Rockets", "BLUE");
                return Unit.a;
        }
    }
}
