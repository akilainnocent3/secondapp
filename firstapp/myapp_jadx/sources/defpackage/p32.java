package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public class p32 {
    public static boolean g(Context context) {
        NotificationManager notificationManager = new t2y(context).b;
        if (!notificationManager.areNotificationsEnabled()) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return true;
        }
        NotificationChannel notificationChannel = i >= 26 ? notificationManager.getNotificationChannel("toolbar") : null;
        return notificationChannel == null || notificationChannel.getImportance() != 0;
    }

    public static void h(Context context, int i, Notification notification) {
        new t2y(context).a(i, notification);
    }
}
