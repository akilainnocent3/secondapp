package defpackage;

import com.sporty.android.platform.features.security.newdevicelogin.securityaction.SecurityActionActivity;
import com.sportybet.android.bethistory.presentation.activity.RSportsBetTicketDetailsActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class doq implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ doq(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(jmq.e.a);
                break;
            case 1:
                int i2 = RSportsBetTicketDetailsActivity.s0;
                ds30 ds30Var = ((RSportsBetTicketDetailsActivity) obj).q0;
                ds30Var.getClass();
                ej5.c(o8i0.d(ds30Var), null, null, new cs30(ds30Var, null), 3);
                break;
            default:
                int i3 = SecurityActionActivity.f;
                ((SecurityActionActivity) obj).finish();
                break;
        }
        return Unit.a;
    }
}
