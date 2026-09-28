package defpackage;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public final class i1y extends j1y {

    public static class a {
        public static Notification.Style a() {
            return new Notification.DecoratedCustomViewStyle();
        }
    }

    @Override // defpackage.j1y
    public final void a(k1y k1yVar) {
        k1yVar.b.setStyle(a.a());
    }

    @Override // defpackage.j1y
    public final String b() {
        return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
    }
}
