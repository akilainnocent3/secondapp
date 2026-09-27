package com.bytedance.adsdk.tq;

import android.util.Pair;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class jpb {
    private boolean hww = false;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final Set<Object> f32099tq = new hww();

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final Map<String, com.bytedance.adsdk.tq.hu.vy> f32098sd = new HashMap();
    private final Comparator<Pair<String, Float>> vy = new Comparator<Pair<String, Float>>() { // from class: com.bytedance.adsdk.tq.jpb.1
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
        public int compare(Pair<String, Float> pair, Pair<String, Float> pair2) {
            float fFloatValue = ((Float) pair.second).floatValue();
            float fFloatValue2 = ((Float) pair2.second).floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    };

    public void hww(boolean z10) {
        this.hww = z10;
    }

    public void hww(String str, float f10) {
        if (this.hww) {
            com.bytedance.adsdk.tq.hu.vy vyVar = this.f32098sd.get(str);
            if (vyVar == null) {
                vyVar = new com.bytedance.adsdk.tq.hu.vy();
                this.f32098sd.put(str, vyVar);
            }
            vyVar.hww(f10);
            if (str.equals("__container")) {
                Iterator<Object> it = this.f32099tq.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }
}
