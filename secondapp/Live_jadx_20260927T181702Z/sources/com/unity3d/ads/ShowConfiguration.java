package com.unity3d.ads;

import fr.n1;
import java.util.Map;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@UnityAdsExperimental
public final class ShowConfiguration {

    @m
    private final String customRewardString;

    @l
    private final Map<String, String> extras;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Builder {

        @m
        private String customRewardString;

        @l
        private Map<String, String> extras = n1.z();

        @l
        public final ShowConfiguration build() {
            return new ShowConfiguration(this.customRewardString, this.extras, null);
        }

        @l
        public final Builder withCustomRewardString(@l String customRewardString) {
            m0.p(customRewardString, "customRewardString");
            this.customRewardString = customRewardString;
            return this;
        }

        @l
        public final Builder withExtras(@l Map<String, String> extras) {
            m0.p(extras, "extras");
            this.extras = extras;
            return this;
        }
    }

    public /* synthetic */ ShowConfiguration(String str, Map map, x xVar) {
        this(str, map);
    }

    @m
    public final String getCustomRewardString() {
        return this.customRewardString;
    }

    @l
    public final Map<String, String> getExtras() {
        return this.extras;
    }

    private ShowConfiguration(String str, Map<String, String> map) {
        this.customRewardString = str;
        this.extras = map;
    }

    public /* synthetic */ ShowConfiguration(String str, Map map, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? n1.z() : map);
    }
}
