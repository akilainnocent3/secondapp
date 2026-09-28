package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.sportybet.android.crash.UserCrashActivity;
import com.sportybet.android.crash.UserCrashNoticeActivity;

/* JADX INFO: loaded from: classes5.dex */
public final class crb implements erb {
    public final yi5 a;

    public crb(yi5 yi5Var) {
        this.a = yi5Var;
    }

    @Override // defpackage.erb
    public final void a(Context context) {
        context.getClass();
        Intent intent = new Intent(context, (Class<?>) UserCrashActivity.class);
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    @Override // defpackage.erb
    public final void b(Context context, String str, String str2) {
        context.getClass();
        Bundle bundle = new Bundle();
        bundle.putSerializable("KEY_TITLE", str);
        bundle.putSerializable("KEY_INFO", str2);
        Intent intent = new Intent(context, (Class<?>) UserCrashNoticeActivity.class);
        intent.setFlags(268435456);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    @Override // defpackage.erb
    public final boolean isSideLoading(Context context) {
        context.getClass();
        String strA = ui8.a(context);
        if (this.a.b().j()) {
            return strA == null || !strA.equals("com.android.vending");
        }
        return false;
    }
}
