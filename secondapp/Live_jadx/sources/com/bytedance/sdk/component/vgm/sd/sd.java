package com.bytedance.sdk.component.vgm.sd;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class sd {
    private hww hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private tq f35116tq;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum hww {
        DEBUG,
        INFO,
        ERROR,
        OFF
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.vgm.sd.sd$sd, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class C0335sd {
        private static final sd hww = new sd();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface tq {
    }

    public static void hww(hww hwwVar) {
        synchronized (sd.class) {
            C0335sd.hww.hww = hwwVar;
        }
    }

    private sd() {
        this.hww = hww.OFF;
        this.f35116tq = new com.bytedance.sdk.component.vgm.sd.tq();
    }
}
