package defpackage;

import com.sportybet.feature.loyal.LoyalJoinDialogActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class an6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ an6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((dn6) obj).dismissAllowingStateLoss();
                break;
            case 1:
                int i2 = LoyalJoinDialogActivity.b;
                ((LoyalJoinDialogActivity) obj).finish();
                break;
            default:
                h2j0 h2j0Var = (h2j0) obj;
                ej5.c(o8i0.d(h2j0Var), null, null, new i2j0(h2j0Var, null), 3);
                break;
        }
        return Unit.a;
    }
}
