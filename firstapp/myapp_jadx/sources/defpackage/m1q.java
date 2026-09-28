package defpackage;

import com.sportygames.commons.models.GiftItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class m1q implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m1q(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(Boolean.FALSE);
                break;
            default:
                ylb0 ylb0Var = (ylb0) obj;
                ylb0Var.S0().O1(new GiftItem(0.0d, "", "", "", 0.0d, 0L, 0, Double.valueOf(0.0d), null));
                ((x5a0) ylb0Var.N2).setValue(Boolean.FALSE);
                ((x5a0) ylb0Var.S0().R).setValue(Boolean.TRUE);
                break;
        }
        return Unit.a;
    }
}
