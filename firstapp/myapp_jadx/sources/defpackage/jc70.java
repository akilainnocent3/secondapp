package defpackage;

import com.sportybet.android.instantwin.presentation.scheduledfootballopenbets.a;
import com.sportygames.commons.models.GiftItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jc70 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jc70(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(a.c.a);
                break;
            default:
                ylb0 ylb0Var = (ylb0) obj;
                ((x5a0) ylb0Var.N2).setValue(Boolean.FALSE);
                ((x5a0) ylb0Var.R0().R).setValue(Boolean.TRUE);
                ylb0Var.R0().O1(new GiftItem(0.0d, "", "", "", 0.0d, 0L, 0, Double.valueOf(0.0d), null));
                break;
        }
        return Unit.a;
    }
}
