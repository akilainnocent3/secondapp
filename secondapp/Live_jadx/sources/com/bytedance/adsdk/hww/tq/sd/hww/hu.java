package com.bytedance.adsdk.hww.tq.sd.hww;

import java.util.Deque;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class hu {
    public char hww(int i10, String str) {
        if (i10 >= str.length()) {
            return (char) 26;
        }
        return str.charAt(i10);
    }

    public abstract int hww(String str, int i10, Deque<com.bytedance.adsdk.hww.tq.tq.hww> deque, com.bytedance.adsdk.hww.tq.sd.hww hwwVar);

    public int tq(int i10, String str) {
        while (com.bytedance.adsdk.hww.tq.hv.hww.hww(hww(i10, str))) {
            i10++;
        }
        return i10;
    }
}
