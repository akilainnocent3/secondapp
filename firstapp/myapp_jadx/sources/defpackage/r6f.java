package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.format.Formatter;
import android.widget.RemoteViews;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.home.MainActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class r6f extends p32 implements q6f.a {
    public RemoteViews a;
    public Notification b;

    @Override // q6f.a
    public final void a(Context context, int i, long j, long j2) {
        RemoteViews remoteViews;
        Notification notification = this.b;
        if (notification == null || (remoteViews = this.a) == null) {
            return;
        }
        remoteViews.setTextViewText(R.id.tv_title, sn5.b(context, R.string.app_common__notification_progress_bar, oxc.a(Formatter.formatShortFileSize(context, j), "/", Formatter.formatShortFileSize(context, j2))));
        remoteViews.setProgressBar(R.id.progressBar1, 100, i, false);
        p32.h(context, 510000, notification);
    }

    @Override // q6f.a
    public final void b(Context context, CharSequence charSequence) {
        Intent intent = new Intent("com.sportybet.android.DOWNLOAD_BTN_CLICKED");
        int i = Build.VERSION.SDK_INT;
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 1, intent, i >= 31 ? 67108864 : 0);
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.notify_bar);
        remoteViews.setProgressBar(R.id.progressBar1, 100, 0, false);
        remoteViews.setTextViewText(R.id.btn_cancel, sn5.b(context, R.string.common_functions__cancel, new Object[0]));
        remoteViews.setImageViewResource(R.id.img_logo, R.mipmap.ic_launcher);
        remoteViews.setTextViewText(R.id.tv_title, charSequence);
        remoteViews.setOnClickPendingIntent(R.id.btn_cancel, broadcast);
        this.a = remoteViews;
        PendingIntent activity = PendingIntent.getActivity(context, 0, new Intent(context, (Class<?>) MainActivity.class), i >= 31 ? 201326592 : 134217728);
        g1y g1yVarB = b5y.b(context, "download");
        Notification notification = g1yVarB.w;
        g1yVarB.j = 1;
        notification.tickerText = g1y.b(sn5.b(context, R.string.common_functions__update, new Object[0]));
        g1yVarB.d(2, true);
        notification.when = System.currentTimeMillis();
        g1yVarB.g = activity;
        g1yVarB.s = this.a;
        if (i >= 26) {
            g1yVarB.d(8, true);
        }
        Notification notificationA = g1yVarB.a();
        this.b = notificationA;
        p32.h(context, 510000, notificationA);
    }

    @Override // q6f.a
    public final void e(Context context, CharSequence charSequence, Intent intent) {
        RemoteViews remoteViews;
        Notification notification = this.b;
        if (notification == null || (remoteViews = this.a) == null) {
            return;
        }
        remoteViews.setProgressBar(R.id.progressBar1, 100, 100, false);
        remoteViews.setViewVisibility(R.id.btn_cancel, 8);
        remoteViews.setTextViewText(R.id.tv_title, charSequence);
        notification.flags = (notification.flags | 16) & (-3);
        notification.contentIntent = PendingIntent.getActivity(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? 335544320 : 268435456);
        p32.h(context, 510000, notification);
    }

    @Override // q6f.a
    public final void f(Context context) {
        new t2y(context).b.cancel(null, 510000);
    }
}
