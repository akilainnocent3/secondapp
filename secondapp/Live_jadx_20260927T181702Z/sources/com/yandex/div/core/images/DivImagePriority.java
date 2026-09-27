package com.yandex.div.core.images;

import er.e;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@e(er.a.SOURCE)
@Retention(RetentionPolicy.SOURCE)
public @interface DivImagePriority {

    @l
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int IMAGES_PRIORITY_DEFAULT = 0;
    public static final int IMAGES_PRIORITY_PRELOAD = -1;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int IMAGES_PRIORITY_DEFAULT = 0;
        public static final int IMAGES_PRIORITY_PRELOAD = -1;

        private Companion() {
        }
    }
}
