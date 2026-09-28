package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.sportybet.android.globalpay.GlobalWithdrawActivity;
import com.sportybet.android.globalpay.kyc.za.b;
import com.sportygames.crash.remote.models.MultiplierResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class z2l implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z2l(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Bundle extras;
        String string;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = GlobalWithdrawActivity.y;
                Intent intent = ((GlobalWithdrawActivity) obj).getIntent();
                if (intent != null && (extras = intent.getExtras()) != null && (string = extras.getString("KYC_STATUS_KEY")) != null) {
                    b.a.getClass();
                    if (b.a.a(string) != b.i) {
                        return string;
                    }
                }
                return null;
            case 1:
                final qub0 qub0Var = (qub0) obj;
                final Long lY0 = qub0Var.y0();
                qub0Var.e4(1, new Function0() { // from class: fub0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        final qub0 qub0Var2 = qub0Var;
                        boolean z = qub0Var2.j0;
                        Long l = lY0;
                        if (z) {
                            MultiplierResponse multiplierResponse = qub0Var2.x0;
                            if (multiplierResponse != null) {
                                qub0Var2.c1().B1(multiplierResponse, qub0Var2.l2(), qub0Var2.y0, qub0Var2.h2, 1, new Function1() { // from class: lrb0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        qub0 qub0Var3 = qub0Var2;
                                        cgb.a(qub0Var3.e1(), (String) ((x5a0) qub0Var3.c1().v).getValue(), "cashout", (String) obj2);
                                        return Unit.a;
                                    }
                                }, l);
                            }
                        } else {
                            qub0Var2.v0(qub0Var2.S0(), l);
                        }
                        return Unit.a;
                    }
                });
                return Unit.a;
            case 2:
                ((znf0) obj).m0().x1();
                return Unit.a;
            default:
                ((Function1) obj).invoke(g1k0.g.a);
                return Unit.a;
        }
    }
}
