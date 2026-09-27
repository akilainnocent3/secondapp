package yads;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class tc2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f155819a;

    public tc2(Context context) {
        this.f155819a = context;
    }

    public final rc2 a() {
        Object systemService = this.f155819a.getSystemService("power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        Boolean boolValueOf = powerManager != null ? Boolean.valueOf(powerManager.isInteractive()) : null;
        if (boolValueOf != null && !boolValueOf.booleanValue()) {
            return rc2.f154876c;
        }
        Object systemService2 = this.f155819a.getSystemService("keyguard");
        KeyguardManager keyguardManager = systemService2 instanceof KeyguardManager ? (KeyguardManager) systemService2 : null;
        return (keyguardManager == null || !keyguardManager.isKeyguardLocked()) ? rc2.f154877d : rc2.f154875b;
    }
}
