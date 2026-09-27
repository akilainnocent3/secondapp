package androidx.work;

import android.app.Notification;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Notification f20293c;

    public k(int notificationId, @NonNull Notification notification) {
        this(notificationId, notification, 0);
    }

    public int a() {
        return this.f20292b;
    }

    @NonNull
    public Notification b() {
        return this.f20293c;
    }

    public int c() {
        return this.f20291a;
    }

    public boolean equals(Object o10) {
        if (this == o10) {
            return true;
        }
        if (o10 == null || k.class != o10.getClass()) {
            return false;
        }
        k kVar = (k) o10;
        if (this.f20291a == kVar.f20291a && this.f20292b == kVar.f20292b) {
            return this.f20293c.equals(kVar.f20293c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f20291a * 31) + this.f20292b) * 31) + this.f20293c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f20291a + ", mForegroundServiceType=" + this.f20292b + ", mNotification=" + this.f20293c + fw.b.f85383j;
    }

    public k(int notificationId, @NonNull Notification notification, int foregroundServiceType) {
        this.f20291a = notificationId;
        this.f20293c = notification;
        this.f20292b = foregroundServiceType;
    }
}
