package com.bytedance.adsdk.hww.tq.sd.hww;

import com.bytedance.adsdk.hww.tq.tq.hww.kv;
import java.util.Deque;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class sd extends hu {
    @Override // com.bytedance.adsdk.hww.tq.sd.hww.hu
    public int hww(String str, int i10, Deque<com.bytedance.adsdk.hww.tq.tq.hww> deque, com.bytedance.adsdk.hww.tq.sd.hww hwwVar) {
        char cHww = hww(i10, str);
        return (com.bytedance.adsdk.hww.tq.hv.hww.tq(cHww) || cHww == '$') ? hww(str, i10, deque) : hwwVar.hww(str, i10, deque);
    }

    private int hww(String str, int i10, Deque<com.bytedance.adsdk.hww.tq.tq.hww> deque) {
        int i11;
        int i12 = 0;
        while (true) {
            i11 = i12 + i10;
            char cHww = hww(i11, str);
            if (!com.bytedance.adsdk.hww.tq.hv.hww.tq(cHww) && !com.bytedance.adsdk.hww.tq.hv.hww.sd(cHww) && '.' != cHww && '[' != cHww && ']' != cHww && '_' != cHww && '$' != cHww) {
                break;
            }
            i12++;
        }
        String strSubstring = str.substring(i10, i11);
        if (com.bytedance.adsdk.hww.tq.vy.hww.hww(strSubstring) != null) {
            deque.push(new com.bytedance.adsdk.hww.tq.tq.hww.vgm(strSubstring));
            return i11;
        }
        deque.push(new kv(strSubstring));
        return i11;
    }
}
