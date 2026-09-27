package com.unity3d.ironsourceads.rewarded;

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
public final class RewardedAdRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    private final String f76261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    private final String f76262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @m
    private final Bundle f76263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @l
    private final InterfaceC4562vd f76264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @l
    private final String f76265e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @l
        private final String f76266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @l
        private final String f76267b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @m
        private Bundle f76268c;

        public Builder(@l String instanceId, @l String adm) {
            m0.p(instanceId, "instanceId");
            m0.p(adm, "adm");
            this.f76266a = instanceId;
            this.f76267b = adm;
        }

        @l
        public final RewardedAdRequest build() {
            IronLog.API.info("instanceId: " + this.f76266a);
            return new RewardedAdRequest(this.f76266a, this.f76267b, this.f76268c, null);
        }

        @l
        public final String getAdm() {
            return this.f76267b;
        }

        @l
        public final String getInstanceId() {
            return this.f76266a;
        }

        @l
        public final Builder withExtraParams(@l Bundle extraParams) {
            m0.p(extraParams, "extraParams");
            this.f76268c = extraParams;
            return this;
        }
    }

    public /* synthetic */ RewardedAdRequest(String str, String str2, Bundle bundle, x xVar) {
        this(str, str2, bundle);
    }

    @l
    public final String getAdId$mediationsdk_release() {
        return this.f76265e;
    }

    @l
    public final String getAdm() {
        return this.f76262b;
    }

    @m
    public final Bundle getExtraParams() {
        return this.f76263c;
    }

    @l
    public final String getInstanceId() {
        return this.f76261a;
    }

    @l
    public final InterfaceC4562vd getProviderName$mediationsdk_release() {
        return this.f76264d;
    }

    private RewardedAdRequest(String str, String str2, Bundle bundle) {
        this.f76261a = str;
        this.f76262b = str2;
        this.f76263c = bundle;
        this.f76264d = new C4595xc(str);
        String strB = Z9.b();
        m0.o(strB, "generateMultipleUniqueInstanceId()");
        this.f76265e = strB;
    }
}
