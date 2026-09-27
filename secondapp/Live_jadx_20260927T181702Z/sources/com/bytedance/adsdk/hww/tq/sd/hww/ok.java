package com.bytedance.adsdk.hww.tq.sd.hww;

import com.bytedance.adsdk.hww.tq.tq.hww.wgt;
import java.util.Deque;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class ok extends hu {
    @Override // com.bytedance.adsdk.hww.tq.sd.hww.hu
    public int hww(String str, int i10, Deque<com.bytedance.adsdk.hww.tq.tq.hww> deque, com.bytedance.adsdk.hww.tq.sd.hww hwwVar) {
        if (!com.bytedance.adsdk.hww.tq.hv.hww.vy(hww(i10, str))) {
            return hwwVar.hww(str, i10, deque);
        }
        int i11 = i10 + 1;
        String str2 = new String(new char[]{hww(i10, str), hww(i11, str)});
        if (com.bytedance.adsdk.hww.tq.vy.sd.hww(str2) != null) {
            deque.push(new wgt(com.bytedance.adsdk.hww.tq.vy.sd.hww(str2)));
            return i10 + 2;
        }
        String strValueOf = String.valueOf(hww(i10, str));
        if (com.bytedance.adsdk.hww.tq.vy.sd.hww(strValueOf) != null) {
            deque.push(new wgt(com.bytedance.adsdk.hww.tq.vy.sd.hww(strValueOf)));
            return i11;
        }
        throw new IllegalArgumentException("Unrecognized:" + strValueOf + "examine:" + str.substring(0, i10));
    }
}
