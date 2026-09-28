package defpackage;

import com.sportygames.commons.views.GameMainActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class alj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ alj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                nt4 nt4Var = (nt4) obj;
                int i2 = GameMainActivity.N;
                nt4Var.getClass();
                ((GameMainActivity) obj2).P1(nt4Var);
                break;
            default:
                tnu tnuVar = (tnu) obj2;
                id90 id90Var = (id90) obj;
                id90Var.getClass();
                if (id90Var instanceof zqr) {
                    tnuVar.b(((zqr) id90Var).a);
                }
                break;
        }
        return Unit.a;
    }
}
