package com.bytedance.adsdk.hww.tq.sd.hww;

import com.bytedance.adsdk.hww.tq.tq.hww.omn;
import java.util.Deque;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class tq extends hu {
    @Override // com.bytedance.adsdk.hww.tq.sd.hww.hu
    public int hww(String str, int i10, Deque<com.bytedance.adsdk.hww.tq.tq.hww> deque, com.bytedance.adsdk.hww.tq.sd.hww hwwVar) {
        if ('\'' != hww(i10, str)) {
            return hwwVar.hww(str, i10, deque);
        }
        int i11 = i10 + 1;
        int length = str.length();
        int i12 = i11;
        while (i12 < length && hww(i12, str) != '\'') {
            i12++;
        }
        if (hww(i12, str) != '\'') {
            throw new com.bytedance.adsdk.hww.hww.hww("String expression not surrounded by '", str.substring(i10));
        }
        deque.push(new omn(str.substring(i11, i12)));
        return i12 + 1;
    }
}
