package com.startapp.sdk.adsbase.adrules;

import com.startapp.json.TypeInfo;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class AdaptMetaData implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final transient AdaptMetaData f74295a = new AdaptMetaData();

    @TypeInfo(complex = true)
    private AdRules adRules = new AdRules();
    private String adaptMetaDataUpdateVersion = "5.3.0";

    private AdaptMetaData() {
    }

    public static AdaptMetaData b() {
        return f74295a;
    }

    public final AdRules a() {
        return this.adRules;
    }
}
