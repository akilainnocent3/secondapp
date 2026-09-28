package defpackage;

import com.sportygames.commons.models.GiftItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nzq implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nzq(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(zxq.d.a);
                break;
            default:
                x7c0 x7c0Var = (x7c0) obj;
                ((x5a0) x7c0Var.y2).setValue(Boolean.FALSE);
                ((x5a0) x7c0Var.R0().R).setValue(Boolean.TRUE);
                x7c0Var.R0().O1(new GiftItem(0.0d, "", "", "", 0.0d, 0L, 0, Double.valueOf(0.0d), null));
                break;
        }
        return Unit.a;
    }
}
