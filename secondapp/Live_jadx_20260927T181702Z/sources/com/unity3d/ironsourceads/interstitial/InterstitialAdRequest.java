package com.unity3d.ironsourceads.interstitial;

import android.os.Bundle;
import com.ironsource.C4595xc;
import com.ironsource.InterfaceC4562vd;
import com.ironsource.Z9;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class InterstitialAdRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    private final String f76248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    private final String f76249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @m
    private final Bundle f76250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @l
    private final InterfaceC4562vd f76251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @l
    private final String f76252e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @l
        private final String f76253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @l
        private final String f76254b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @m
        private Bundle f76255c;

        public Builder(@l String instanceId, @l String adm) {
            m0.p(instanceId, "instanceId");
            m0.p(adm, "adm");
            this.f76253a = instanceId;
            this.f76254b = adm;
        }

        @l
        public final InterstitialAdRequest build() {
            IronLog.API.info("instanceId: " + this.f76253a);
            return new InterstitialAdRequest(this.f76253a, this.f76254b, this.f76255c, null);
        }

        @l
        public final String getAdm() {
            return this.f76254b;
        }

        @l
        public final String getInstanceId() {
            return this.f76253a;
        }

        @l
        public final Builder withExtraParams(@l Bundle extraParams) {
            m0.p(extraParams, "extraParams");
            this.f76255c = extraParams;
            return this;
        }
    }

    public /* synthetic */ InterstitialAdRequest(String str, String str2, Bundle bundle, x xVar) {
        this(str, str2, bundle);
    }

    @l
    public final String getAdId$mediationsdk_release() {
        return this.f76252e;
    }

    @l
    public final String getAdm() {
        return this.f76249b;
    }

    @m
    public final Bundle getExtraParams() {
        return this.f76250c;
    }

    @l
    public final String getInstanceId() {
        return this.f76248a;
    }

    @l
    public final InterfaceC4562vd getProviderName$mediationsdk_release() {
        return this.f76251d;
    }

    private InterstitialAdRequest(String str, String str2, Bundle bundle) {
        this.f76248a = str;
        this.f76249b = str2;
        this.f76250c = bundle;
        this.f76251d = new C4595xc(str);
        String strB = Z9.b();
        m0.o(strB, "generateMultipleUniqueInstanceId()");
        this.f76252e = strB;
    }
}
