package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class P {
    public static AdvIdentifiersResult.AdvId a(IdentifiersResult identifiersResult) {
        AdvIdentifiersResult.Details details;
        String str = identifiersResult == null ? null : identifiersResult.f98739id;
        if (identifiersResult != null) {
            switch (O.f96251a[identifiersResult.status.ordinal()]) {
                case 1:
                    details = AdvIdentifiersResult.Details.OK;
                    break;
                case 2:
                    details = AdvIdentifiersResult.Details.NO_STARTUP;
                    break;
                case 3:
                    details = AdvIdentifiersResult.Details.FEATURE_DISABLED;
                    break;
                case 4:
                    details = AdvIdentifiersResult.Details.IDENTIFIER_PROVIDER_UNAVAILABLE;
                    break;
                case 5:
                    details = AdvIdentifiersResult.Details.INVALID_ADV_ID;
                    break;
                case 6:
                    details = AdvIdentifiersResult.Details.FORBIDDEN_BY_CLIENT_CONFIG;
                    break;
                default:
                    details = AdvIdentifiersResult.Details.INTERNAL_ERROR;
                    break;
            }
        } else {
            details = AdvIdentifiersResult.Details.INTERNAL_ERROR;
        }
        return new AdvIdentifiersResult.AdvId(str, details, identifiersResult != null ? identifiersResult.errorExplanation : null);
    }
}
