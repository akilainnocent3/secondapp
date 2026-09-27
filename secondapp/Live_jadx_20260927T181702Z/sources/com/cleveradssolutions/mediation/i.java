package com.cleveradssolutions.mediation;

import com.cleveradssolutions.mediation.core.u;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public interface i extends u {
    int A();

    @dr.o(message = "Use new request.unitId implementation")
    @oy.m
    String G0(@oy.l String str, int i10, @oy.m wc.f fVar, boolean z10, boolean z11);

    @oy.l
    String getIdentifier();

    @oy.l
    String getLabel();

    int getSourceId();

    @oy.l
    String k0();

    @oy.l
    String n();

    @oy.l
    m v0();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public static /* synthetic */ String b(i iVar, String str, int i10, wc.f fVar, boolean z10, boolean z11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: key");
            }
            if ((i11 & 4) != 0) {
                fVar = null;
            }
            return iVar.G0(str, i10, fVar, (i11 & 8) != 0 ? false : z10, (i11 & 16) != 0 ? false : z11);
        }

        public static /* synthetic */ void a() {
        }
    }
}
