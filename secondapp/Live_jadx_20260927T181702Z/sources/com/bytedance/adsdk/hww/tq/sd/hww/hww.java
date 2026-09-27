package com.bytedance.adsdk.hww.tq.sd.hww;

import com.bytedance.adsdk.hww.tq.tq.hww.hnv;
import java.util.Deque;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class hww extends hu {
    @Override // com.bytedance.adsdk.hww.tq.sd.hww.hu
    public int hww(String str, int i10, Deque<com.bytedance.adsdk.hww.tq.tq.hww> deque, com.bytedance.adsdk.hww.tq.sd.hww hwwVar) {
        if (',' != hww(i10, str)) {
            return hwwVar.hww(str, i10, deque);
        }
        deque.push(new hnv(com.bytedance.adsdk.hww.tq.vy.vy.COMMA));
        return i10 + 1;
    }
}
