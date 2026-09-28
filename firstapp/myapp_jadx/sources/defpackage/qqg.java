package defpackage;

import com.sportybet.android.bethistory.presentation.activity.RSportsBetDetailsActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qqg implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qqg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ytw) obj).setValue(Boolean.TRUE);
                break;
            case 1:
                ((Function1) obj).invoke(vuz.d.a);
                break;
            default:
                int i2 = RSportsBetDetailsActivity.A;
                nm2 nm2Var = ((RSportsBetDetailsActivity) obj).z;
                nm2Var.getClass();
                ej5.c(o8i0.d(nm2Var), null, null, new mm2(nm2Var, null), 3);
                break;
        }
        return Unit.a;
    }
}
