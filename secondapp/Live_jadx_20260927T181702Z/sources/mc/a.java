package mc;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class a extends e<Bitmap> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f107180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ComponentName f107181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RemoteViews f107182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f107183h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f107184i;

    public a(Context context, int i10, int i11, int i12, RemoteViews remoteViews, int... iArr) {
        super(i10, i11);
        if (iArr.length == 0) {
            throw new IllegalArgumentException("WidgetIds must have length > 0");
        }
        this.f107183h = (Context) pc.m.f(context, "Context can not be null!");
        this.f107182g = (RemoteViews) pc.m.f(remoteViews, "RemoteViews object can not be null!");
        this.f107180e = (int[]) pc.m.f(iArr, "WidgetIds can not be null!");
        this.f107184i = i12;
        this.f107181f = null;
    }

    @Override // mc.p
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void l(@NonNull Bitmap bitmap, @Nullable nc.f<? super Bitmap> fVar) {
        b(bitmap);
    }

    public final void b(@Nullable Bitmap bitmap) {
        this.f107182g.setImageViewBitmap(this.f107184i, bitmap);
        c();
    }

    public final void c() {
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(this.f107183h);
        ComponentName componentName = this.f107181f;
        if (componentName != null) {
            appWidgetManager.updateAppWidget(componentName, this.f107182g);
        } else {
            appWidgetManager.updateAppWidget(this.f107180e, this.f107182g);
        }
    }

    @Override // mc.p
    public void f(@Nullable Drawable drawable) {
        b(null);
    }

    public a(Context context, int i10, RemoteViews remoteViews, int... iArr) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i10, remoteViews, iArr);
    }

    public a(Context context, int i10, int i11, int i12, RemoteViews remoteViews, ComponentName componentName) {
        super(i10, i11);
        this.f107183h = (Context) pc.m.f(context, "Context can not be null!");
        this.f107182g = (RemoteViews) pc.m.f(remoteViews, "RemoteViews object can not be null!");
        this.f107181f = (ComponentName) pc.m.f(componentName, "ComponentName can not be null!");
        this.f107184i = i12;
        this.f107180e = null;
    }

    public a(Context context, int i10, RemoteViews remoteViews, ComponentName componentName) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i10, remoteViews, componentName);
    }
}
