package com.bytedance.adsdk.tq.hww.hww;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class tq {
    private final List<hnv> hww = new ArrayList();

    public void hww(hnv hnvVar) {
        this.hww.add(hnvVar);
    }

    public void hww(Path path) {
        for (int size = this.hww.size() - 1; size >= 0; size--) {
            com.bytedance.adsdk.tq.hu.hu.hww(path, this.hww.get(size));
        }
    }
}
