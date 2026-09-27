package com.bytedance.adsdk.tq.hww.tq;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class ok {
    private final List<hww<com.bytedance.adsdk.tq.sd.tq.khx, Path>> hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final List<com.bytedance.adsdk.tq.sd.tq.ok> f32084sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final List<hww<Integer, Integer>> f32085tq;

    public ok(List<com.bytedance.adsdk.tq.sd.tq.ok> list) {
        this.f32084sd = list;
        this.hww = new ArrayList(list.size());
        this.f32085tq = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.hww.add(list.get(i10).tq().hww());
            this.f32085tq.add(list.get(i10).sd().hww());
        }
    }

    public List<com.bytedance.adsdk.tq.sd.tq.ok> hww() {
        return this.f32084sd;
    }

    public List<hww<Integer, Integer>> sd() {
        return this.f32085tq;
    }

    public List<hww<com.bytedance.adsdk.tq.sd.tq.khx, Path>> tq() {
        return this.hww;
    }
}
