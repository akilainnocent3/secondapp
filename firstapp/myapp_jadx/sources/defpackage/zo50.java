package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.sporty.android.platform.features.newotp.channel.reverse.EmptyActivity;
import com.sportybet.android.gp.tz.R;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zo50 {
    public final int a = new AtomicInteger((int) System.currentTimeMillis()).incrementAndGet();

    public final void a(Context context, String str, String str2) {
        context.getClass();
        str2.getClass();
        if (o0b.a(context, "android.permission.POST_NOTIFICATIONS") == 0) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                yo50.a();
                NotificationChannel notificationChannel = new NotificationChannel("reversed_otp", "Reversed OTP", 4);
                Object systemService = context.getSystemService("notification");
                systemService.getClass();
                ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
            }
            g1y g1yVar = new g1y(context, "reversed_otp");
            g1yVar.w.icon = R.drawable.ic_notification;
            g1yVar.q = context.getColor(R.color.brand_primary);
            g1yVar.e = g1y.b(str);
            g1yVar.d(16, true);
            g1yVar.f = g1y.b(str2);
            g1yVar.j = 1;
            PendingIntent activity = PendingIntent.getActivity(context, 9999, new Intent(context, (Class<?>) EmptyActivity.class), i >= 31 ? 201326592 : 134217728);
            activity.getClass();
            g1yVar.g = activity;
            new t2y(context).a(this.a, g1yVar.a());
        }
    }
}
