package com.unity3d.ads.core.data.datasource;

import com.unity3d.services.core.preferences.AndroidPreferences;
import com.unity3d.services.core.properties.ClientProperties;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class AndroidTcfDataSource implements TcfDataSource {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    public static final String TCF_TCSTRING_KEY = "IABTCF_TCString";

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.unity3d.ads.core.data.datasource.TcfDataSource
    @m
    public String getTcfString() {
        return AndroidPreferences.getString(ClientProperties.getAppName() + "_settings", "IABTCF_TCString");
    }
}
