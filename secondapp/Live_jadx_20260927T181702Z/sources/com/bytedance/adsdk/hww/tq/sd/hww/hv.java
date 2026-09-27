package com.bytedance.adsdk.hww.tq.sd.hww;

import java.util.Deque;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class hv extends hu {
    @Override // com.bytedance.adsdk.hww.tq.sd.hww.hu
    public int hww(String str, int i10, Deque<com.bytedance.adsdk.hww.tq.tq.hww> deque, com.bytedance.adsdk.hww.tq.sd.hww hwwVar) {
        char cHww;
        int i11 = i10;
        while (true) {
            cHww = hww(i11, str);
            if (!com.bytedance.adsdk.hww.tq.hv.hww.tq(cHww) && !com.bytedance.adsdk.hww.tq.hv.hww.sd(cHww)) {
                break;
            }
            i11++;
        }
        if (cHww != '(') {
            return hwwVar.hww(str, i10, deque);
        }
        deque.push(new com.bytedance.adsdk.hww.tq.tq.hww.nod(str.substring(i10, i11)));
        return i11 + 1;
    }
}
