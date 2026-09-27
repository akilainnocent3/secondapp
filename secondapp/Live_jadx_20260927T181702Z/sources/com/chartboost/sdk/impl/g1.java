package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.privacy.model.COPPA;
import com.chartboost.sdk.privacy.model.DataUseConsent;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f38963a;

    public g1(Context context) {
        kotlin.jvm.internal.m0.p(context, "context");
        this.f38963a = context;
    }

    public final boolean a() {
        try {
            DataUseConsent dataUseConsent = Chartboost.getDataUseConsent(this.f38963a, COPPA.COPPA_STANDARD);
            Object consent = dataUseConsent != null ? dataUseConsent.getConsent() : null;
            Boolean bool = consent instanceof Boolean ? (Boolean) consent : null;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
