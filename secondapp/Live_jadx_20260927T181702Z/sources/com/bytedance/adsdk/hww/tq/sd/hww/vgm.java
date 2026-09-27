package com.bytedance.adsdk.hww.tq.sd.hww;

import com.bytedance.adsdk.hww.tq.tq.hww.weu;
import java.util.Deque;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class vgm extends hu {
    private boolean hww(String str, int i10, Deque<com.bytedance.adsdk.hww.tq.tq.hww> deque) {
        if ('-' != hww(i10, str)) {
            return com.bytedance.adsdk.hww.tq.hv.hww.sd(hww(i10, str));
        }
        if (deque.peek() != null && !com.bytedance.adsdk.hww.tq.vy.sd.hww(deque.peek().hww())) {
            return false;
        }
        if (com.bytedance.adsdk.hww.tq.hv.hww.sd(hww(i10 + 1, str))) {
            return true;
        }
        throw new IllegalArgumentException("Unrecognized - symbol, not a negative number or operator, problem range:" + str.substring(0, i10));
    }

    @Override // com.bytedance.adsdk.hww.tq.sd.hww.hu
    public int hww(String str, int i10, Deque<com.bytedance.adsdk.hww.tq.tq.hww> deque, com.bytedance.adsdk.hww.tq.sd.hww hwwVar) {
        char cHww;
        if (!hww(str, i10, deque)) {
            return hwwVar.hww(str, i10, deque);
        }
        int i11 = hww(i10, str) == '-' ? i10 + 1 : i10;
        boolean z10 = false;
        while (true) {
            cHww = hww(i11, str);
            if (!com.bytedance.adsdk.hww.tq.hv.hww.sd(cHww) && (z10 || cHww != '.')) {
                break;
            }
            i11++;
            if (cHww == '.') {
                z10 = true;
            }
        }
        if (cHww != '.') {
            deque.push(new weu(str.substring(i10, i11)));
            return i11;
        }
        throw new IllegalArgumentException("Illegal negative number format, problem interval:" + str.substring(i10, i11));
    }
}
