package com.yandex.div.core.widget;

import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface FixedLineHeightView {

    @l
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int UNDEFINED_LINE_HEIGHT = -1;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int UNDEFINED_LINE_HEIGHT = -1;

        private Companion() {
        }
    }

    int getFixedLineHeight();

    void setFixedLineHeight(int i10);
}
