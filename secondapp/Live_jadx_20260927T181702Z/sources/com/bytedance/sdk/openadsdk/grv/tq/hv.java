package com.bytedance.sdk.openadsdk.grv.tq;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.kub;
import com.bytedance.sdk.openadsdk.core.model.za;
import com.bytedance.sdk.openadsdk.utils.qt;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hv {
    private static final Map<Integer, tq> hww = new ConcurrentHashMap();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class hww {
        public int hww;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        public int f37197tq = -1;

        public hww(int i10) {
            this.hww = i10;
        }
    }

    public static void hww(View view, kub kubVar, hww hwwVar) {
        if (view == null || kubVar == null || kubVar.btm()) {
            return;
        }
        boolean zSd = sd(kubVar);
        if (za.tq(kubVar) && hwwVar != null) {
            hwwVar.hww = -1;
        }
        hww(hww(view, kubVar, zSd, hwwVar));
    }

    private static boolean sd(kub kubVar) {
        if (kubVar == null) {
            return false;
        }
        String strHww = qt.hww(kubVar);
        return ((!"open_ad".equals(strHww) && !"fullscreen_interstitial_ad".equals(strHww) && !"rewarded_video".equals(strHww)) || za.tq(kubVar) || kubVar.eb() == 5 || kubVar.eb() == 33 || !kub.hv(kubVar) || kubVar.rt() == null) ? false : true;
    }

    public static void tq(Integer num) {
        hww.remove(num);
    }

    public static Integer tq(kub kubVar) {
        return Integer.valueOf((kubVar.jfy() + kubVar.uy()).hashCode());
    }

    private static tq hww(View view, kub kubVar, boolean z10, hww hwwVar) {
        if (view == null || kubVar == null || kubVar.uy() == null) {
            return null;
        }
        Integer numTq = tq(kubVar);
        Map<Integer, tq> map = hww;
        if (map.containsKey(numTq)) {
            tq tqVar = map.get(numTq);
            if (tqVar != null) {
                tqVar.hww(view);
            }
            return tqVar;
        }
        tq tqVarHww = tq.hww(z10, numTq, view, kubVar, hwwVar);
        map.put(numTq, tqVarHww);
        return tqVarHww;
    }

    private static void hww(tq tqVar) {
        if (tqVar == null) {
            return;
        }
        tqVar.hww();
    }

    public static void hww(kub kubVar, int i10) {
        if (kubVar == null || kubVar.uy() == null) {
            return;
        }
        hww(hww.get(tq(kubVar)), i10);
    }

    public static void hww(tq tqVar, int i10) {
        if (tqVar == null) {
            return;
        }
        tqVar.hww(i10);
    }

    public static void hww(kub kubVar) {
        if (kubVar == null || kubVar.uy() == null) {
            return;
        }
        Integer numTq = tq(kubVar);
        Map<Integer, tq> map = hww;
        tq tqVar = map.get(numTq);
        if (tqVar != null) {
            tqVar.nod();
        }
        tq(numTq);
        if (map.size() <= 0) {
            vgm.hww();
        }
    }

    public static tq hww(Integer num) {
        return hww.get(num);
    }
}
