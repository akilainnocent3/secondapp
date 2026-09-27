package re;

import android.content.Context;
import android.net.wifi.WifiManager;
import androidx.annotation.Nullable;
import com.ironsource.Z3;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class f8 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f125477e = "WifiLockManager";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f125478f = "ExoPlayer:WifiLockManager";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final WifiManager f125479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public WifiManager.WifiLock f125480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f125481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f125482d;

    public f8(Context context) {
        this.f125479a = (WifiManager) context.getApplicationContext().getSystemService(Z3.f60406b);
    }

    public void a(boolean z10) {
        if (z10 && this.f125480b == null) {
            WifiManager wifiManager = this.f125479a;
            if (wifiManager == null) {
                eh.h0.n("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.f125480b = wifiLockCreateWifiLock;
                wifiLockCreateWifiLock.setReferenceCounted(false);
            }
        }
        this.f125481c = z10;
        c();
    }

    public void b(boolean z10) {
        this.f125482d = z10;
        c();
    }

    public final void c() {
        WifiManager.WifiLock wifiLock = this.f125480b;
        if (wifiLock == null) {
            return;
        }
        if (this.f125481c && this.f125482d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }
}
