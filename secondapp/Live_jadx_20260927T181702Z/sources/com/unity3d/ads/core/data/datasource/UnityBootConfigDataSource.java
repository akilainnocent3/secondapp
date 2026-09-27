package com.unity3d.ads.core.data.datasource;

import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface UnityBootConfigDataSource {

    @l
    public static final String BUILD_GUID = "build-guid";

    @l
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @l
        public static final String BUILD_GUID = "build-guid";

        private Companion() {
        }
    }

    @m
    String getValue(@l String str);
}
