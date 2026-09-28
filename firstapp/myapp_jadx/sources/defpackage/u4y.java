package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes.dex */
public final class u4y extends ujc<Bitmap> {
    public final RemoteViews d;
    public final Context e;
    public final int f;
    public final Notification i;

    public u4y(hp0 hp0Var, RemoteViews remoteViews, Notification notification, int i) {
        super(Integer.MIN_VALUE, Integer.MIN_VALUE);
        gm20.c(hp0Var, "Context must not be null!");
        this.e = hp0Var;
        gm20.c(notification, "Notification object can not be null!");
        this.i = notification;
        this.d = remoteViews;
        this.f = i;
    }

    @Override // defpackage.d5f0
    public final void e(Object obj) {
        f((Bitmap) obj);
    }

    public final void f(Bitmap bitmap) {
        this.d.setImageViewBitmap(R.id.push_image, bitmap);
        NotificationManager notificationManager = (NotificationManager) this.e.getSystemService("notification");
        gm20.c(notificationManager, "Argument must not be null");
        notificationManager.notify(null, this.f, this.i);
    }

    @Override // defpackage.d5f0
    public final void h(Drawable drawable) {
        f(null);
    }
}
