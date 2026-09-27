package com.monetization.ads.mediation.base.model;

import java.util.Map;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class MediatedAdObjectInfo {

    @m
    private final String adContent;

    @m
    private final String adId;

    @m
    private final String adUnitId;

    @m
    private final Map<String, Object> extraData;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Builder {

        @m
        private String adContent;

        @m
        private String adId;

        @m
        private String adUnitId;

        @m
        private Map<String, ? extends Object> extraData;

        @l
        public final MediatedAdObjectInfo build() {
            return new MediatedAdObjectInfo(this.adContent, this.adUnitId, this.adId, this.extraData, null);
        }

        @l
        public final Builder setAdContent(@m String str) {
            this.adContent = str;
            return this;
        }

        @l
        public final Builder setAdId(@m String str) {
            this.adId = str;
            return this;
        }

        @l
        public final Builder setAdUnitId(@m String str) {
            this.adUnitId = str;
            return this;
        }

        @l
        public final Builder setExtraData(@m Map<String, ? extends Object> map) {
            this.extraData = map;
            return this;
        }
    }

    public /* synthetic */ MediatedAdObjectInfo(String str, String str2, String str3, Map map, x xVar) {
        this(str, str2, str3, map);
    }

    @m
    public final String getAdContent() {
        return this.adContent;
    }

    @m
    public final String getAdId() {
        return this.adId;
    }

    @m
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    @m
    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    private MediatedAdObjectInfo(String str, String str2, String str3, Map<String, ? extends Object> map) {
        this.adContent = str;
        this.adUnitId = str2;
        this.adId = str3;
        this.extraData = map;
    }
}
