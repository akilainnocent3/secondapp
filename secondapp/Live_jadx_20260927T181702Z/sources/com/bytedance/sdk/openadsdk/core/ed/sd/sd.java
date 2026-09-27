package com.bytedance.sdk.openadsdk.core.ed.sd;

import com.bytedance.sdk.component.utils.vgm;
import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class sd extends com.bytedance.sdk.openadsdk.tq.tq {
    public sd(int i10, int i11) {
        super(i10, i11);
    }

    @Override // com.bytedance.sdk.openadsdk.tq.tq, com.bytedance.sdk.openadsdk.tq.hww
    public void hww(List<File> list) {
        int size = list.size();
        if (hww(0L, size)) {
            return;
        }
        for (File file : list) {
            vgm.sd(file);
            size--;
            if (hww(file, 0L, size)) {
                return;
            }
        }
    }

    public sd(int i10, int i11, boolean z10) {
        super(i10, i11);
        this.hww = z10;
    }
}
