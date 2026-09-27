package com.yandex.div.histogram;

import dr.i0;
import dr.k0;
import dr.w2;
import java.util.concurrent.ConcurrentHashMap;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class HistogramCallTypeChecker {

    @l
    private final i0 reportedHistograms$delegate = k0.b(HistogramCallTypeChecker$reportedHistograms$2.INSTANCE);

    private final ConcurrentHashMap<String, w2> getReportedHistograms() {
        return (ConcurrentHashMap) this.reportedHistograms$delegate.getValue();
    }

    public final boolean addReported(@l String str) {
        return !getReportedHistograms().containsKey(str) && getReportedHistograms().putIfAbsent(str, w2.f79517a) == null;
    }
}
