package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class g1y {
    public final Context a;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public IconCompat h;
    public int i;
    public int j;
    public j1y l;
    public int m;
    public int n;
    public Bundle p;
    public RemoteViews s;
    public RemoteViews t;
    public String u;
    public final boolean v;
    public final Notification w;
    public boolean x;

    @Deprecated
    public final ArrayList<String> y;
    public final ArrayList<d1y> b = new ArrayList<>();
    public final ArrayList<kh00> c = new ArrayList<>();
    public final ArrayList<d1y> d = new ArrayList<>();
    public boolean k = true;
    public boolean o = false;
    public int q = 0;
    public int r = 0;

    public static class a {
        public static AudioAttributes a(AudioAttributes.Builder builder) {
            return builder.build();
        }

        public static AudioAttributes.Builder b() {
            return new AudioAttributes.Builder();
        }

        public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i) {
            return builder.setContentType(i);
        }

        public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i) {
            return builder.setUsage(i);
        }
    }

    public g1y(Context context, String str) {
        Notification notification = new Notification();
        this.w = notification;
        this.a = context;
        this.u = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.j = 0;
        this.y = new ArrayList<>();
        this.v = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Notification notificationBuild;
        Bundle bundle;
        k1y k1yVar = new k1y(this);
        g1y g1yVar = k1yVar.c;
        j1y j1yVar = g1yVar.l;
        if (j1yVar != null) {
            j1yVar.a(k1yVar);
        }
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = k1yVar.b;
        if (i >= 26) {
            notificationBuild = builder.build();
        } else {
            Notification notificationBuild2 = builder.build();
            int i2 = k1yVar.e;
            if (i2 != 0) {
                if (notificationBuild2.getGroup() != null && (notificationBuild2.flags & 512) != 0 && i2 == 2) {
                    notificationBuild2.sound = null;
                    notificationBuild2.vibrate = null;
                    notificationBuild2.defaults &= -4;
                }
                if (notificationBuild2.getGroup() != null && (notificationBuild2.flags & 512) == 0 && i2 == 1) {
                    notificationBuild2.sound = null;
                    notificationBuild2.vibrate = null;
                    notificationBuild2.defaults &= -4;
                }
            }
            notificationBuild = notificationBuild2;
        }
        RemoteViews remoteViews = g1yVar.s;
        if (remoteViews != null) {
            notificationBuild.contentView = remoteViews;
        }
        if (j1yVar != null) {
            g1yVar.l.getClass();
        }
        if (j1yVar != null && (bundle = notificationBuild.extras) != null) {
            if (j1yVar.d) {
                bundle.putCharSequence("android.summaryText", j1yVar.c);
            }
            CharSequence charSequence = j1yVar.b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String strB = j1yVar.b();
            if (strB != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strB);
            }
        }
        return notificationBuild;
    }

    public final void c(int i) {
        Notification notification = this.w;
        notification.defaults = i;
        if ((i & 4) != 0) {
            notification.flags |= 1;
        }
    }

    public final void d(int i, boolean z) {
        Notification notification = this.w;
        if (z) {
            notification.flags = i | notification.flags;
        } else {
            notification.flags = (~i) & notification.flags;
        }
    }

    public final void e(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.b = bitmap;
            iconCompat = iconCompat2;
        }
        this.h = iconCompat;
    }

    public final void f(j1y j1yVar) {
        if (this.l != j1yVar) {
            this.l = j1yVar;
            if (j1yVar == null || j1yVar.a == this) {
                return;
            }
            j1yVar.a = this;
            f(j1yVar);
        }
    }
}
