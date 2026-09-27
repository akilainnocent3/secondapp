package x4;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.PowerManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class i2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f144318f = "WakeLockManager";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f144319g = "ExoPlayer:WakeLockManager";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f144320h = 1000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f144321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f144322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f144323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f144324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f144325e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f144326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public PowerManager.WakeLock f144327b;

        public a(Context context) {
            this.f144326a = context;
        }

        public final void d(final AtomicBoolean atomicBoolean) {
            if (atomicBoolean.get()) {
                new Thread(new Runnable() { // from class: x4.h2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f144314b.e(atomicBoolean);
                    }
                }, "ExoPlayer:WakeLockManager").start();
            }
        }

        public final synchronized void e(AtomicBoolean atomicBoolean) {
            PowerManager.WakeLock wakeLock;
            if (atomicBoolean.get() && (wakeLock = this.f144327b) != null) {
                wakeLock.release();
            }
        }

        @SuppressLint({"WakelockTimeout"})
        public final synchronized void f(boolean z10, boolean z11) {
            if (z10) {
                if (this.f144327b == null) {
                    if (this.f144326a.checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        d0.n("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) this.f144326a.getSystemService("power");
                    if (powerManager == null) {
                        d0.n("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    } else {
                        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                        this.f144327b = wakeLockNewWakeLock;
                        wakeLockNewWakeLock.setReferenceCounted(false);
                    }
                }
            }
            if (this.f144327b == null) {
                return;
            }
            if (i2.h(z10, z11)) {
                this.f144327b.acquire();
            } else {
                this.f144327b.release();
            }
        }
    }

    public i2(Context context, Looper looper, l lVar) {
        this.f144321a = new a(context.getApplicationContext());
        this.f144322b = lVar.createHandler(looper, null);
        this.f144323c = lVar.createHandler(Looper.getMainLooper(), null);
    }

    public static /* synthetic */ void a(i2 i2Var, AtomicBoolean atomicBoolean, boolean z10, boolean z11) {
        i2Var.getClass();
        atomicBoolean.set(false);
        i2Var.f144321a.f(z10, z11);
    }

    public static boolean h(boolean z10, boolean z11) {
        return z10 && z11;
    }

    public final void e(final boolean z10, final boolean z11) {
        if (h(z10, z11)) {
            this.f144322b.post(new Runnable() { // from class: x4.e2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f144275b.f144321a.f(z10, z11);
                }
            });
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.f144323c.postDelayed(new Runnable() { // from class: x4.f2
            @Override // java.lang.Runnable
            public final void run() {
                this.f144291b.f144321a.d(atomicBoolean);
            }
        }, 1000L);
        this.f144322b.post(new Runnable() { // from class: x4.g2
            @Override // java.lang.Runnable
            public final void run() {
                i2.a(this.f144306b, atomicBoolean, z10, z11);
            }
        });
    }

    public void f(boolean z10) {
        if (this.f144324d == z10) {
            return;
        }
        this.f144324d = z10;
        e(z10, this.f144325e);
    }

    public void g(boolean z10) {
        if (this.f144325e == z10) {
            return;
        }
        this.f144325e = z10;
        if (this.f144324d) {
            e(true, z10);
        }
    }
}
