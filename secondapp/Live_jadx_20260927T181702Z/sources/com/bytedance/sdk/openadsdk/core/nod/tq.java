package com.bytedance.sdk.openadsdk.core.nod;

import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class tq {
    private static com.bytedance.sdk.openadsdk.core.nod.hww hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private String f36496tq;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class hww {
        private static final tq hww = new tq();
    }

    public long hu() {
        com.bytedance.sdk.openadsdk.core.nod.hww hwwVar = hww;
        if (hwwVar != null) {
            return hwwVar.hu();
        }
        return 0L;
    }

    public String hv() {
        com.bytedance.sdk.openadsdk.core.nod.hww hwwVar = hww;
        return hwwVar != null ? hwwVar.hv() : "";
    }

    public void hww(String str) {
        com.bytedance.sdk.openadsdk.core.nod.hww hwwVar;
        if (TextUtils.isEmpty(str) || (hwwVar = hww) == null) {
            return;
        }
        hwwVar.hww(str);
    }

    public boolean sd() {
        com.bytedance.sdk.openadsdk.core.nod.hww hwwVar = hww;
        if (hwwVar == null) {
            return false;
        }
        return hwwVar.tq();
    }

    public void tq(String str) {
        com.bytedance.sdk.openadsdk.core.nod.hww hwwVar;
        if (TextUtils.isEmpty(str) || (hwwVar = hww) == null) {
            return;
        }
        hwwVar.tq(str);
    }

    public int vgm() {
        com.bytedance.sdk.openadsdk.core.nod.hww hwwVar = hww;
        if (hwwVar != null) {
            return hwwVar.vgm();
        }
        return 1;
    }

    public String vy() {
        String strVy;
        com.bytedance.sdk.openadsdk.core.nod.hww hwwVar = hww;
        return (hwwVar == null || (strVy = hwwVar.vy()) == null) ? "" : strVy;
    }

    private tq() {
        this.f36496tq = null;
        hww = new com.bytedance.sdk.openadsdk.core.nod.hww();
    }

    public static tq tq() {
        return hww.hww;
    }

    public void hww(Map<String, Object> map) {
        com.bytedance.sdk.openadsdk.core.nod.hww hwwVar = hww;
        if (hwwVar != null) {
            hwwVar.hww(map);
        }
    }

    public void hww() {
        com.bytedance.sdk.openadsdk.core.nod.hww hwwVar = hww;
        if (hwwVar != null) {
            hwwVar.sd();
        }
    }

    public void hww(@NonNull String str, Map<String, Object> map) {
        com.bytedance.sdk.openadsdk.core.nod.hww hwwVar = hww;
        if (hwwVar != null) {
            hwwVar.hww(str, map);
        }
    }

    public Map<String, String> hww(String str, byte[] bArr) {
        com.bytedance.sdk.openadsdk.core.nod.hww hwwVar = hww;
        if (hwwVar != null) {
            return hwwVar.hww(str, bArr);
        }
        return new HashMap();
    }

    public void hww(MotionEvent motionEvent) {
        com.bytedance.sdk.openadsdk.core.nod.hww hwwVar = hww;
        if (hwwVar != null) {
            hwwVar.hww(motionEvent);
        }
    }
}
