package com.fyber.inneractive.sdk.config.enums;

import com.ironsource.C4235d4;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public enum UnitDisplayType {
    INTERSTITIAL("interstitial", false),
    LANDSCAPE(C4235d4.i.C, true),
    MRECT("mrect", false),
    BANNER("banner", false),
    REWARDED("rewarded", false),
    NATIVE("typenative", false),
    SQUARE("square", true),
    VERTICAL("vertical", true),
    DEFAULT("default", false);

    private static final Map<String, UnitDisplayType> CONSTANTS = new HashMap();
    private final boolean deprecated;
    private String stringValue;

    static {
        for (UnitDisplayType unitDisplayType : values()) {
            CONSTANTS.put(unitDisplayType.stringValue, unitDisplayType);
        }
    }

    UnitDisplayType(String str, boolean z10) {
        this.stringValue = str;
        this.deprecated = z10;
    }

    public static UnitDisplayType fromValue(String str) {
        UnitDisplayType unitDisplayType = str != null ? CONSTANTS.get(str.toLowerCase(Locale.US)) : null;
        return unitDisplayType != null ? unitDisplayType : DEFAULT;
    }

    public boolean isDeprecated() {
        return this.deprecated;
    }

    public boolean isFullscreenUnit() {
        return this == INTERSTITIAL || this == REWARDED;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.stringValue;
    }

    public String value() {
        return this.stringValue;
    }
}
