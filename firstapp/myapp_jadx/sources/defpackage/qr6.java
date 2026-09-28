package defpackage;

import android.accounts.Account;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qr6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qr6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((rr6) obj).dismissAllowingStateLoss();
                break;
            default:
                final PreMatchEventActivity preMatchEventActivity = (PreMatchEventActivity) obj;
                int i2 = PreMatchEventActivity.a2;
                preMatchEventActivity.getAccountHelper().demandAccount(preMatchEventActivity, new tit() { // from class: sc20
                    @Override // defpackage.tit
                    public final void w(Account account, boolean z) {
                        rvu rvuVar;
                        int i3 = PreMatchEventActivity.a2;
                        if (account != null) {
                            PreMatchEventActivity preMatchEventActivity2 = preMatchEventActivity;
                            if (preMatchEventActivity2.getAccountHelper().isLogin() && (rvuVar = preMatchEventActivity2.U0) != null) {
                                ej5.c(o8i0.d(rvuVar), null, null, new vvu(rvuVar, preMatchEventActivity2.P, null), 3);
                            }
                        }
                    }
                });
                break;
        }
        return Unit.a;
    }
}
