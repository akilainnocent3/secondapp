package com.chartboost.sdk.privacy.model;

import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class COPPA extends GenericDataUseConsent {

    @l
    public static final String COPPA_STANDARD = "coppa";

    @l
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public COPPA(boolean z10) {
        super(null, 1, 0 == true ? 1 : 0);
        b(COPPA_STANDARD);
        a(Boolean.valueOf(z10));
    }

    @Override // com.chartboost.sdk.privacy.model.DataUseConsent
    @l
    public Boolean getConsent() {
        Object objA = a();
        m0.n(objA, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) objA;
    }
}
