package defpackage;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public final class f1y extends j1y {
    public CharSequence e;

    @Override // defpackage.j1y
    public final void a(k1y k1yVar) {
        Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(k1yVar.b).setBigContentTitle(this.b).bigText(this.e);
        if (this.d) {
            bigTextStyleBigText.setSummaryText(this.c);
        }
    }

    @Override // defpackage.j1y
    public final String b() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
