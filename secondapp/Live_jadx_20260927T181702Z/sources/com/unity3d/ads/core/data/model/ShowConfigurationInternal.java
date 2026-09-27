package com.unity3d.ads.core.data.model;

import fr.n1;
import java.util.Map;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ShowConfigurationInternal {

    @m
    private final String customRewardString;

    @l
    private final Map<String, String> extras;

    /* JADX WARN: Multi-variable type inference failed */
    public ShowConfigurationInternal() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShowConfigurationInternal copy$default(ShowConfigurationInternal showConfigurationInternal, String str, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = showConfigurationInternal.customRewardString;
        }
        if ((i10 & 2) != 0) {
            map = showConfigurationInternal.extras;
        }
        return showConfigurationInternal.copy(str, map);
    }

    @m
    public final String component1() {
        return this.customRewardString;
    }

    @l
    public final Map<String, String> component2() {
        return this.extras;
    }

    @l
    public final ShowConfigurationInternal copy(@m String str, @l Map<String, String> extras) {
        m0.p(extras, "extras");
        return new ShowConfigurationInternal(str, extras);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowConfigurationInternal)) {
            return false;
        }
        ShowConfigurationInternal showConfigurationInternal = (ShowConfigurationInternal) obj;
        return m0.g(this.customRewardString, showConfigurationInternal.customRewardString) && m0.g(this.extras, showConfigurationInternal.extras);
    }

    @m
    public final String getCustomRewardString() {
        return this.customRewardString;
    }

    @l
    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public int hashCode() {
        String str = this.customRewardString;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.extras.hashCode();
    }

    @l
    public String toString() {
        return "ShowConfigurationInternal(customRewardString=" + this.customRewardString + ", extras=" + this.extras + ')';
    }

    public ShowConfigurationInternal(@m String str, @l Map<String, String> extras) {
        m0.p(extras, "extras");
        this.customRewardString = str;
        this.extras = extras;
    }

    public /* synthetic */ ShowConfigurationInternal(String str, Map map, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? n1.z() : map);
    }
}
