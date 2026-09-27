package com.cleveradssolutions.mediation.core;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public interface a {
    @k.d
    void destroy();

    double getCostPerMille();

    @oy.m
    String getCreativeId();

    @oy.m
    u getExtras();

    @oy.m
    com.cleveradssolutions.mediation.api.b getListener();

    int getRevenuePrecision();

    int getSourceId();

    @oy.m
    String getSourceName();

    @oy.l
    String getUnitId();

    boolean isExpired();

    void setCostPerMille(double d10);

    void setCreativeId(@oy.m String str);

    void setExtras(@oy.m u uVar);

    void setListener(@oy.m com.cleveradssolutions.mediation.api.b bVar);

    void setRevenuePrecision(int i10);

    void setSourceId(int i10);

    void setSourceName(@oy.m String str);

    void setUnitId(@oy.l String str);
}
