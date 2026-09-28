package defpackage;

import android.content.Context;
import android.content.Intent;
import com.sportybet.android.sportypin.WithdrawalPinActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class s1i0 extends vd<s8d0, v1i0> {
    @Override // defpackage.vd
    public final Intent a(Object obj, Context context) {
        s8d0 s8d0Var = (s8d0) obj;
        s8d0Var.getClass();
        Intent intent = new Intent(context, (Class<?>) WithdrawalPinActivity.class);
        if (s8d0Var instanceof s8d0.a) {
            intent.putExtra("REQUEST_CODE", 1300);
            intent.putExtra("option", ((s8d0.a) s8d0Var).a.getSportyPinUsage().getUsageCode());
            intent.putExtra("EXTRA_TITLE", "Deposit");
            intent.putExtra("isWithdrawing", true);
            return intent;
        }
        if (s8d0Var instanceof s8d0.c) {
            intent.putExtra("REQUEST_CODE", 1300);
            intent.putExtra("option", ((s8d0.c) s8d0Var).a.getSportyPinUsage().getUsageCode());
            intent.putExtra("EXTRA_TITLE", "Withdraw");
            intent.putExtra("isWithdrawing", true);
            return intent;
        }
        if (s8d0Var.equals(s8d0.d.a)) {
            intent.putExtra("REQUEST_CODE", 1400);
            return intent;
        }
        if (!s8d0Var.equals(s8d0.b.a)) {
            uhc.a();
            return null;
        }
        dmj0[] dmj0VarArr = dmj0.a;
        intent.putExtra("option", 61);
        intent.putExtra("EXTRA_TITLE", "Withdraw");
        intent.putExtra("REQUEST_CODE", 1300);
        intent.putExtra("isWithdrawing", true);
        return intent;
    }

    @Override // defpackage.vd
    public final Object c(Intent intent, int i) {
        if (i != 2100) {
            return i != 2400 ? v1i0.a.a : v1i0.d.a;
        }
        return new v1i0.c(intent != null ? intent.getStringExtra("EXTRA_PIN_CODE") : null, intent != null ? intent.getStringExtra("EXTRA_FINGERPRINT_TOKEN") : null, intent != null ? intent.getStringExtra("EXTRA_PIN_TOKEN") : null, intent != null ? intent.getStringExtra("otp_code") : null, intent != null ? intent.getStringExtra("otp_token") : null);
    }
}
