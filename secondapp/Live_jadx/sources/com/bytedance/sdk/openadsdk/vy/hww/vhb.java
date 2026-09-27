package com.bytedance.sdk.openadsdk.vy.hww;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vhb {
    public static vhb hww = new vhb();

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final Map<String, hww> f37911sd = new HashMap();

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private hww f37912tq;
    private volatile boolean vy;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class hww {
        private final int hww;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        private final int f37913tq;

        public hww(int i10, int i11) {
            this.hww = (i10 < 0 || i10 > 5) ? 3 : i10;
            this.f37913tq = i11 < 10 ? 30 : i11;
        }

        public int hww() {
            return this.hww;
        }

        public int tq() {
            return this.f37913tq;
        }
    }

    private int sd() {
        hww hwwVar = this.f37912tq;
        if (hwwVar != null) {
            return hwwVar.tq();
        }
        return 30;
    }

    private int tq() {
        hww hwwVar = this.f37912tq;
        if (hwwVar != null) {
            return hwwVar.hww();
        }
        return 3;
    }

    public void hww(hww hwwVar) {
        this.f37912tq = hwwVar;
    }

    public void hww(String str, hww hwwVar) {
        if (TextUtils.isEmpty(str) || hwwVar == null) {
            return;
        }
        this.f37911sd.put(str, hwwVar);
    }

    public int tq(String str) {
        hww hwwVar = this.f37911sd.get(str);
        if (hwwVar == null) {
            return sd();
        }
        return hwwVar.tq();
    }

    public int hww(String str) {
        if (!hww()) {
            return 4;
        }
        hww hwwVar = this.f37911sd.get(str);
        if (hwwVar == null) {
            return tq();
        }
        return hwwVar.hww();
    }

    public boolean hww() {
        return this.vy;
    }

    public void hww(boolean z10) {
        this.vy = z10;
    }
}
