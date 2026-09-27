package com.yandex.div.core.view2.logging.patch;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface PatchResult {

    @l
    public static final Companion Companion = Companion.$$INSTANCE;

    @l
    public static final String FAIL_NO_STATE = "Patch not performed. Cannot find state to bind";

    @l
    public static final String SUCCESS = "Div patched successfully";

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @l
        public static final String FAIL_NO_STATE = "Patch not performed. Cannot find state to bind";

        @l
        public static final String SUCCESS = "Div patched successfully";

        private Companion() {
        }
    }
}
