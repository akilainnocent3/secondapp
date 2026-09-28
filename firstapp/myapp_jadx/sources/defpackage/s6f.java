package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.home.MainActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class s6f extends p32 implements q6f.a {
    public g1y a;

    @Override // q6f.a
    public final void a(Context context, int i, long j, long j2) {
        g1y g1yVar = this.a;
        if (g1yVar != null) {
            g1yVar.m = 100;
            g1yVar.n = i;
            p32.h(context, 510000, g1yVar.a());
        }
    }

    @Override // q6f.a
    public final void b(Context context, CharSequence charSequence) {
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        int i = Build.VERSION.SDK_INT;
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, i >= 31 ? 201326592 : 134217728);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 1, new Intent("com.sportybet.android.DOWNLOAD_BTN_CLICKED"), i >= 31 ? 67108864 : 0);
        g1y g1yVarB = b5y.b(context, "download");
        Notification notification = g1yVarB.w;
        g1yVarB.j = 1;
        g1yVarB.e = g1y.b(charSequence);
        notification.tickerText = g1y.b(sn5.b(context, R.string.common_functions__update, new Object[0]));
        g1yVarB.d(2, true);
        notification.when = System.currentTimeMillis();
        g1yVarB.g = activity;
        g1yVarB.m = 100;
        g1yVarB.n = 0;
        if (i >= 26) {
            g1yVarB.d(8, true);
        }
        g1yVarB.b.add(new d1y.a(null, sn5.b(context, R.string.common_functions__cancel, new Object[0]), broadcast, new Bundle()).a());
        p32.h(context, 510000, g1yVarB.a());
        this.a = g1yVarB;
    }

    @Override // q6f.a
    public final void e(Context context, CharSequence charSequence, Intent intent) {
        g1y g1yVar = this.a;
        if (g1yVar != null) {
            g1yVar.e = g1y.b(charSequence);
            g1yVar.m = 0;
            g1yVar.n = 0;
            g1yVar.d(16, true);
            g1yVar.d(2, false);
            g1yVar.b.clear();
            g1yVar.g = PendingIntent.getActivity(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? 335544320 : 268435456);
            p32.h(context, 510000, g1yVar.a());
        }
    }

    @Override // q6f.a
    public final void f(Context context) {
        new t2y(context).b.cancel(null, 510000);
    }
}
