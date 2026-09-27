package a0;

import android.app.NotificationManager;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import k.t0;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@t0(23)
@y0({y0.a.LIBRARY})
public class d {
    @NonNull
    public static Parcelable[] a(NotificationManager notificationManager) {
        return notificationManager.getActiveNotifications();
    }
}
