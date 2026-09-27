package x4;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Looper;
import com.ironsource.Z3;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class n2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f144393f = "WifiLockManager";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f144394g = "ExoPlayer:WifiLockManager";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f144395h = 1000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f144396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f144397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f144398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f144399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f144400e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f144401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public WifiManager.WifiLock f144402b;

        public a(Context context) {
            this.f144401a = context;
        }

        public final void c(final AtomicBoolean atomicBoolean) {
            if (atomicBoolean.get()) {
                new Thread(new Runnable() { // from class: x4.m2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f144379b.d(atomicBoolean);
                    }
                }, "ExoPlayer:WifiLockManager").start();
            }
        }

        public final synchronized void d(AtomicBoolean atomicBoolean) {
            WifiManager.WifiLock wifiLock;
            if (atomicBoolean.get() && (wifiLock = this.f144402b) != null) {
                wifiLock.release();
            }
        }

        public void e(boolean z10, boolean z11) {
            if (z10 && this.f144402b == null) {
                if (this.f144401a.checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                    d0.n("WifiLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                    return;
                }
                WifiManager wifiManager = (WifiManager) this.f144401a.getApplicationContext().getSystemService(Z3.f60406b);
                if (wifiManager == null) {
                    d0.n("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                    return;
                } else {
                    WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                    this.f144402b = wifiLockCreateWifiLock;
                    wifiLockCreateWifiLock.setReferenceCounted(false);
                }
            }
            if (this.f144402b == null) {
                return;
            }
            if (n2.h(z10, z11)) {
                this.f144402b.acquire();
            } else {
                this.f144402b.release();
            }
        }
    }

    public n2(Context context, Looper looper, l lVar) {
        this.f144396a = new a(context.getApplicationContext());
        this.f144397b = lVar.createHandler(looper, null);
        this.f144398c = lVar.createHandler(Looper.getMainLooper(), null);
    }

    public static /* synthetic */ void a(n2 n2Var, AtomicBoolean atomicBoolean, boolean z10, boolean z11) {
        n2Var.getClass();
        atomicBoolean.set(false);
        n2Var.f144396a.e(z10, z11);
    }

    public static boolean h(boolean z10, boolean z11) {
        return z10 && z11;
    }

    public final void e(final boolean z10, final boolean z11) {
        if (h(z10, z11)) {
            this.f144397b.post(new Runnable() { // from class: x4.j2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f144339b.f144396a.e(z10, z11);
                }
            });
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.f144398c.postDelayed(new Runnable() { // from class: x4.k2
            @Override // java.lang.Runnable
            public final void run() {
                this.f144346b.f144396a.c(atomicBoolean);
            }
        }, 1000L);
        this.f144397b.post(new Runnable() { // from class: x4.l2
            @Override // java.lang.Runnable
            public final void run() {
                n2.a(this.f144349b, atomicBoolean, z10, z11);
            }
        });
    }

    public void f(boolean z10) {
        if (this.f144399d == z10) {
            return;
        }
        this.f144399d = z10;
        e(z10, this.f144400e);
    }

    public void g(boolean z10) {
        if (this.f144400e == z10) {
            return;
        }
        this.f144400e = z10;
        if (this.f144399d) {
            e(true, z10);
        }
    }
}
