package com.yandex.div.histogram;

import dr.w2;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class HistogramCallTypeChecker$reportedHistograms$2 extends o0 implements ds.a<ConcurrentHashMap<String, w2>> {
    public static final HistogramCallTypeChecker$reportedHistograms$2 INSTANCE = new HistogramCallTypeChecker$reportedHistograms$2();

    public HistogramCallTypeChecker$reportedHistograms$2() {
        super(0);
    }

    @Override // ds.a
    @l
    public final ConcurrentHashMap<String, w2> invoke() {
        return new ConcurrentHashMap<>();
    }
}
