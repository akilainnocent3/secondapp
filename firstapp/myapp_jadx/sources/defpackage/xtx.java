package defpackage;

import com.sportygames.pocketrocket.model.response.GameSocektResponse;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xtx implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xtx(Object obj, int i) {
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
                ((Function1) obj).invoke(new z8x.d(false));
                break;
            case 1:
                Function1 function1 = (Function1) obj;
                function1.invoke(i04.m.a);
                function1.invoke(new i04.i(q7e0.m.a, a.c(k00.d)));
                break;
            default:
                zy10 zy10Var = (zy10) obj;
                GameSocektResponse gameSocektResponse = zy10Var.Q;
                if (gameSocektResponse != null && (info = gameSocektResponse.getInfo()) != null && (red = info.getRED()) != null && (multiplier = red.getMultiplier()) != null && (zt50Var = zy10Var.b) != null) {
                    zy10Var.F0(zt50Var.R, multiplier, "PURPLE");
                }
                break;
        }
        return Unit.a;
    }
}
