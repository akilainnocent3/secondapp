package mc;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import k.x0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class l extends e<Bitmap> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RemoteViews f107214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f107215f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f107216g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f107217h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Notification f107218i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f107219j;

    @x0("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    public l(Context context, int i10, RemoteViews remoteViews, Notification notification, int i11) {
        this(context, i10, remoteViews, notification, i11, null);
    }

    @x0("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    private void b(@Nullable Bitmap bitmap) {
        this.f107214e.setImageViewBitmap(this.f107219j, bitmap);
        c();
    }

    @x0("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    private void c() {
        ((NotificationManager) pc.m.e((NotificationManager) this.f107215f.getSystemService(com.google.firebase.messaging.e.f52306b))).notify(this.f107217h, this.f107216g, this.f107218i);
    }

    @Override // mc.p
    @x0("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void l(@NonNull Bitmap bitmap, @Nullable nc.f<? super Bitmap> fVar) {
        b(bitmap);
    }

    @Override // mc.p
    @x0("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    public void f(@Nullable Drawable drawable) {
        b(null);
    }

    @x0("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    public l(Context context, int i10, RemoteViews remoteViews, Notification notification, int i11, String str) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i10, remoteViews, notification, i11, str);
    }

    @x0("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    public l(Context context, int i10, int i11, int i12, RemoteViews remoteViews, Notification notification, int i13, String str) {
        super(i10, i11);
        this.f107215f = (Context) pc.m.f(context, "Context must not be null!");
        this.f107218i = (Notification) pc.m.f(notification, "Notification object can not be null!");
        this.f107214e = (RemoteViews) pc.m.f(remoteViews, "RemoteViews object can not be null!");
        this.f107219j = i12;
        this.f107216g = i13;
        this.f107217h = str;
    }
}
