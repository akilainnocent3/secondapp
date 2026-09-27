package com.yandex.div.storage;

import com.yandex.div.histogram.DivParsingHistogramReporter;
import kotlin.jvm.internal.o0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DivStorageComponent$Companion$createInternal$1 extends o0 implements ds.a<DivParsingHistogramReporter> {
    public static final DivStorageComponent$Companion$createInternal$1 INSTANCE = new DivStorageComponent$Companion$createInternal$1();

    public DivStorageComponent$Companion$createInternal$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ds.a
    @l
    public final DivParsingHistogramReporter invoke() {
        return DivParsingHistogramReporter.Companion.getDEFAULT();
    }
}
