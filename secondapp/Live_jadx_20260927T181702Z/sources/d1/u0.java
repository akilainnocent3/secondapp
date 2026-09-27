package d1;

import android.app.Notification;
import android.app.Service;
import android.os.Build;
import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f77663a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f77664b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f77665c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f77666d = 255;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f77667e = 1073745919;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(24)
    public static class a {
        @k.t
        public static void a(Service service, int i10) {
            service.stopForeground(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(29)
    public static class b {
        @k.t
        public static void a(Service service, int i10, Notification notification, int i11) {
            if (i11 == 0 || i11 == -1) {
                service.startForeground(i10, notification, i11);
            } else {
                service.startForeground(i10, notification, i11 & 255);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(34)
    public static class c {
        @k.t
        public static void a(Service service, int i10, Notification notification, int i11) {
            if (i11 == 0 || i11 == -1) {
                service.startForeground(i10, notification, i11);
            } else {
                service.startForeground(i10, notification, i11 & u0.f77667e);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public @interface d {
    }

    public static void a(@NonNull Service service, int i10, @NonNull Notification notification, int i11) {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 34) {
            c.a(service, i10, notification, i11);
        } else if (i12 >= 29) {
            b.a(service, i10, notification, i11);
        } else {
            service.startForeground(i10, notification);
        }
    }

    public static void b(@NonNull Service service, int i10) {
        if (Build.VERSION.SDK_INT >= 24) {
            a.a(service, i10);
        } else {
            service.stopForeground((i10 & 1) != 0);
        }
    }
}
