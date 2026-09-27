package com.yandex.div.histogram;

import com.yandex.div.core.annotations.PublicApi;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@PublicApi
public interface HistogramFilter {

    @l
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @l
        private static final HistogramFilter ON = new HistogramFilter() { // from class: com.yandex.div.histogram.d
            @Override // com.yandex.div.histogram.HistogramFilter
            public final boolean report(String str) {
                return HistogramFilter.Companion.ON$lambda$0(str);
            }
        };

        @l
        private static final HistogramFilter OFF = new HistogramFilter() { // from class: com.yandex.div.histogram.e
            @Override // com.yandex.div.histogram.HistogramFilter
            public final boolean report(String str) {
                return HistogramFilter.Companion.OFF$lambda$1(str);
            }
        };

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean OFF$lambda$1(String str) {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean ON$lambda$0(String str) {
            return true;
        }

        @l
        public final HistogramFilter getOFF() {
            return OFF;
        }

        @l
        public final HistogramFilter getON() {
            return ON;
        }
    }

    boolean report(@m String str);
}
