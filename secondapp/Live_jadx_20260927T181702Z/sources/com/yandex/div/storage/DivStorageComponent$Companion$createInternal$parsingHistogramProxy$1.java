package com.yandex.div.storage;

import com.yandex.div.histogram.DivParsingHistogramReporter;
import com.yandex.div.storage.templates.DivParsingHistogramProxy;
import kotlin.jvm.internal.o0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DivStorageComponent$Companion$createInternal$parsingHistogramProxy$1 extends o0 implements ds.a<DivParsingHistogramProxy> {
    final /* synthetic */ cr.c<DivParsingHistogramReporter> $parsingHistogramReporter;

    /* JADX INFO: renamed from: com.yandex.div.storage.DivStorageComponent$Companion$createInternal$parsingHistogramProxy$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class AnonymousClass1 extends o0 implements ds.a<DivParsingHistogramReporter> {
        final /* synthetic */ cr.c<DivParsingHistogramReporter> $parsingHistogramReporter;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(cr.c<DivParsingHistogramReporter> cVar) {
            super(0);
            this.$parsingHistogramReporter = cVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // ds.a
        @l
        public final DivParsingHistogramReporter invoke() {
            return this.$parsingHistogramReporter.get();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivStorageComponent$Companion$createInternal$parsingHistogramProxy$1(cr.c<DivParsingHistogramReporter> cVar) {
        super(0);
        this.$parsingHistogramReporter = cVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ds.a
    @l
    public final DivParsingHistogramProxy invoke() {
        return new DivParsingHistogramProxy(new AnonymousClass1(this.$parsingHistogramReporter));
    }
}
