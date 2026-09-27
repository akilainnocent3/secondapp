package com.cleveradssolutions.mediation.core;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public interface k extends i {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public static /* synthetic */ String a(k kVar, String str, boolean z10, boolean z11, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUnitId");
            }
            if ((i10 & 1) != 0) {
                str = "id";
            }
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            if ((i10 & 4) != 0) {
                z11 = false;
            }
            return kVar.p(str, z10, z11);
        }
    }

    @oy.l
    t Q();

    @oy.m
    String getBidResponse();

    @oy.l
    com.cleveradssolutions.sdk.c getFormat();

    @oy.l
    String getUnitId();

    double h();

    @dr.o(message = "Use unitId and getStrParameter instead")
    @oy.m
    String p(@oy.l String str, boolean z10, boolean z11);

    @oy.l
    y y();

    @oy.l
    o z0();
}
