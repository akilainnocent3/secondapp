package defpackage;

import com.sportygames.pocketrocket.model.response.GameSocektResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class l76 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l76(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        GameSocektResponse.Info info;
        GameSocektResponse.Info.InfoDetails red;
        String multiplier;
        zt50 zt50Var;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return Float.valueOf(((Number) ((twd0) obj).getValue()).floatValue());
            case 1:
                ((Function1) obj).invoke(z8x.e.a);
                return Unit.a;
            default:
                zy10 zy10Var = (zy10) obj;
                GameSocektResponse gameSocektResponse = zy10Var.Q;
                if (gameSocektResponse != null && (info = gameSocektResponse.getInfo()) != null && (red = info.getRED()) != null && (multiplier = red.getMultiplier()) != null && (zt50Var = zy10Var.b) != null) {
                    zy10Var.F0(zt50Var.S, multiplier, "RED");
                }
                return Unit.a;
        }
    }
}
