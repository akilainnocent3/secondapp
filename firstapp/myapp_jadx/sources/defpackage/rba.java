package defpackage;

import com.sportygames.crash.models.BetData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class rba implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rba(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((ytw) obj2).setValue(Integer.valueOf((int) (((jxo) obj).a >> 32)));
                break;
            default:
                tgj tgjVar = (tgj) obj2;
                BetData betData = (BetData) obj;
                betData.getClass();
                tgjVar.e3(tgjVar.S0(), betData);
                break;
        }
        return Unit.a;
    }
}
