package defpackage;

import com.sportygames.crash.models.BetData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h810 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h810(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                kme kmeVar = (kme) obj;
                kmeVar.getClass();
                return kme.a(kmeVar, (sb00) ((Function1) obj2).invoke(kmeVar.a), null, false, false, false, false, false, false, null, 510);
            default:
                vad0 vad0Var = (vad0) obj2;
                BetData betData = (BetData) obj;
                betData.getClass();
                vad0Var.e3(vad0Var.S0(), betData);
                return Unit.a;
        }
    }
}
