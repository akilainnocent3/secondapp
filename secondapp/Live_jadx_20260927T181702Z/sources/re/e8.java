package re;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class e8 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f125459e = "WakeLockManager";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f125460f = "ExoPlayer:WakeLockManager";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final PowerManager f125461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public PowerManager.WakeLock f125462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f125463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f125464d;

    public e8(Context context) {
        this.f125461a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    public void a(boolean z10) {
        if (z10 && this.f125462b == null) {
            PowerManager powerManager = this.f125461a;
            if (powerManager == null) {
                eh.h0.n("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            } else {
                PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                this.f125462b = wakeLockNewWakeLock;
                wakeLockNewWakeLock.setReferenceCounted(false);
            }
        }
        this.f125463c = z10;
        c();
    }

    public void b(boolean z10) {
        this.f125464d = z10;
        c();
    }

    @SuppressLint({"WakelockTimeout"})
    public final void c() {
        PowerManager.WakeLock wakeLock = this.f125462b;
        if (wakeLock == null) {
            return;
        }
        if (this.f125463c && this.f125464d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }
}
