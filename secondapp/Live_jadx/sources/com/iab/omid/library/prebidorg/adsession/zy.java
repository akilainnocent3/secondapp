package com.iab.omid.library.prebidorg.adsession;

import com.ironsource.C4235d4;
import ml.a;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public enum zy {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED(a.f107659d),
    LOADED(C4235d4.i.f61436r),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER("other");

    private final String zz;

    zy(String str) {
        this.zz = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.zz;
    }
}
