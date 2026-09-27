package q5;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.annotation.Nullable;
import d5.v4;
import java.util.List;
import k.b1;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @b1
    public static final int f121697b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Notification.Builder f121698a;

    public s(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        this.f121698a = Build.VERSION.SDK_INT >= 26 ? r.a(applicationContext, str) : new Notification.Builder(applicationContext);
    }

    public Notification a(Context context, @k.u int i10, @Nullable PendingIntent pendingIntent, @Nullable String str) {
        return c(context, i10, pendingIntent, str, v4.a.f78045a);
    }

    public Notification b(Context context, @k.u int i10, @Nullable PendingIntent pendingIntent, @Nullable String str) {
        return c(context, i10, pendingIntent, str, v4.a.f78048d);
    }

    public final Notification c(Context context, @k.u int i10, @Nullable PendingIntent pendingIntent, @Nullable String str, @b1 int i11) {
        return d(context, i10, pendingIntent, str, i11, 0, 0, false, false, true);
    }

    public final Notification d(Context context, @k.u int i10, @Nullable PendingIntent pendingIntent, @Nullable String str, @b1 int i11, int i12, int i13, boolean z10, boolean z11, boolean z12) {
        this.f121698a.setSmallIcon(i10);
        this.f121698a.setContentTitle(i11 == 0 ? null : context.getResources().getString(i11));
        this.f121698a.setContentIntent(pendingIntent);
        this.f121698a.setStyle(str != null ? new Notification.BigTextStyle().bigText(str) : null);
        this.f121698a.setProgress(i12, i13, z10);
        this.f121698a.setOngoing(z11);
        this.f121698a.setShowWhen(z12);
        if (Build.VERSION.SDK_INT >= 31) {
            this.f121698a.setForegroundServiceBehavior(1);
        }
        return this.f121698a.build();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    public Notification e(Context context, @k.u int i10, @Nullable PendingIntent pendingIntent, @Nullable String str, List<a> list, int i11) {
        int i12;
        int i13;
        boolean z10;
        int i14;
        int i15;
        boolean z11;
        float fB;
        boolean z12;
        float f10 = 0.0f;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        int i16 = 0;
        boolean z18 = true;
        for (int i17 = 0; i17 < list.size(); i17++) {
            a aVar = list.get(i17);
            int i18 = aVar.f121576b;
            if (i18 == 0) {
                z15 = true;
            } else if (i18 == 2) {
                fB = aVar.b();
                if (fB != -1.0f) {
                    f10 += fB;
                    z18 = false;
                }
                if (aVar.a() > 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z16 |= z12;
                i16++;
                z14 = true;
            } else if (i18 == 5) {
                z17 = true;
            } else if (i18 == 7) {
                fB = aVar.b();
                if (fB != -1.0f) {
                    f10 += fB;
                    z18 = false;
                }
                if (aVar.a() > 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z16 |= z12;
                i16++;
                z14 = true;
            }
        }
        if (!z14) {
            if (!z15 || i11 == 0) {
                if (z17) {
                    i13 = v4.a.f78053i;
                } else {
                    i12 = 0;
                }
                z10 = true;
            } else {
                i12 = (i11 & 2) != 0 ? v4.a.f78052h : (i11 & 1) != 0 ? v4.a.f78051g : v4.a.f78050f;
                z10 = false;
            }
            if (z10) {
                if (z14) {
                    int i19 = (int) (f10 / i16);
                    if (z18 && z16) {
                        z13 = true;
                    }
                    i15 = i19;
                    z11 = z13;
                } else {
                    i15 = 0;
                    z11 = true;
                }
                i14 = 100;
            } else {
                i14 = 0;
                i15 = 0;
                z11 = false;
            }
            return d(context, i10, pendingIntent, str, i12, i14, i15, z11, true, false);
        }
        i13 = v4.a.f78047c;
        i12 = i13;
        z10 = true;
        if (z10) {
            if (z14) {
                int i110 = (int) (f10 / i16);
                if (z18) {
                    z13 = true;
                }
                i15 = i110;
                z11 = z13;
            } else {
                i15 = 0;
                z11 = true;
            }
            i14 = 100;
        } else {
            i14 = 0;
            i15 = 0;
            z11 = false;
        }
        return d(context, i10, pendingIntent, str, i12, i14, i15, z11, true, false);
    }
}
