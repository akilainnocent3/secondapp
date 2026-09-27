package com.yandex.div.histogram;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface HistogramCallType {

    @l
    public static final String CALL_TYPE_COLD = "Cold";

    @l
    public static final String CALL_TYPE_COOL = "Cool";

    @l
    public static final String CALL_TYPE_WARM = "Warm";

    @l
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @l
        public static final String CALL_TYPE_COLD = "Cold";

        @l
        public static final String CALL_TYPE_COOL = "Cool";

        @l
        public static final String CALL_TYPE_WARM = "Warm";

        private Companion() {
        }
    }
}
