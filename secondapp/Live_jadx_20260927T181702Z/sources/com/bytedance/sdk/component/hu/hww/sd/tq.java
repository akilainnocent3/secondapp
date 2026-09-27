package com.bytedance.sdk.component.hu.hww.sd;

import com.bytedance.sdk.component.hu.hww.hv;
import com.bytedance.sdk.component.hu.hww.ok;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class tq {
    public static void hww(AtomicLong atomicLong, int i10) {
        hv hvVarWgt = ok.vgm().wgt();
        if (hvVarWgt == null || !hvVarWgt.vgm() || atomicLong == null) {
            return;
        }
        atomicLong.getAndAdd(i10);
    }
}
