package defpackage;

import android.content.Context;
import android.content.Intent;
import com.sportybet.android.sportypin.WithdrawalPinActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class ni80 extends vd {
    @Override // defpackage.vd
    public final Intent a(Object obj, Context context) {
        Intent intent = new Intent(context, (Class<?>) WithdrawalPinActivity.class);
        intent.putExtra("REQUEST_CODE", 1100);
        intent.putExtra("isWithdrawing", true);
        intent.putExtra("EXTRA_SHOW_TITLE_ICON", true);
        intent.putExtra("EXTRA_VERIFIED_USER", false);
        return intent;
    }

    @Override // defpackage.vd
    public final Object c(Intent intent, int i) {
        return i == 2100 ? oi80.b.a : oi80.a.a;
    }
}
