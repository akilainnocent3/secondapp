package x4;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
@SuppressLint({"InlinedApi"})
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f144431a = -1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f144432b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f144433c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f144434d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f144435e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f144436f = 4;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public static void a(Context context, String str, @k.b1 int i10, @k.b1 int i11, int i12) {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) zi.l0.E((NotificationManager) context.getSystemService(com.google.firebase.messaging.e.f52306b));
            r0.a();
            NotificationChannel notificationChannelA = a0.j.a(str, context.getString(i10), i12);
            if (i11 != 0) {
                notificationChannelA.setDescription(context.getString(i11));
            }
            notificationManager.createNotificationChannel(notificationChannelA);
        }
    }

    public static void b(Context context, int i10, @Nullable Notification notification) {
        NotificationManager notificationManager = (NotificationManager) zi.l0.E((NotificationManager) context.getSystemService(com.google.firebase.messaging.e.f52306b));
        if (notification != null) {
            notificationManager.notify(i10, notification);
        } else {
            notificationManager.cancel(i10);
        }
    }
}
