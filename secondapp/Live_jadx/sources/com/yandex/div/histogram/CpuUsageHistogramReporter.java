package com.yandex.div.histogram;

import com.yandex.div.histogram.util.Cancelable;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface CpuUsageHistogramReporter {
    @l
    @k.d
    Cancelable startReporting(@l String str, int i10);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class NoOp implements CpuUsageHistogramReporter {
        @Override // com.yandex.div.histogram.CpuUsageHistogramReporter
        @l
        public Cancelable startReporting(@l String str, int i10) {
            return new Cancelable() { // from class: com.yandex.div.histogram.a
                @Override // com.yandex.div.histogram.util.Cancelable
                public final void cancel() {
                    CpuUsageHistogramReporter.NoOp.startReporting$lambda$0();
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void startReporting$lambda$0() {
        }
    }
}
