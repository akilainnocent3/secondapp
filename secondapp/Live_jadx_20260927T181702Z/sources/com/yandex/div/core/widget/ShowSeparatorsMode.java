package com.yandex.div.core.widget;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface ShowSeparatorsMode {

    @l
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int NONE = 0;
    public static final int SHOW_AT_END = 4;
    public static final int SHOW_AT_START = 1;
    public static final int SHOW_BETWEEN = 2;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int NONE = 0;
        public static final int SHOW_AT_END = 4;
        public static final int SHOW_AT_START = 1;
        public static final int SHOW_BETWEEN = 2;

        private Companion() {
        }
    }
}
