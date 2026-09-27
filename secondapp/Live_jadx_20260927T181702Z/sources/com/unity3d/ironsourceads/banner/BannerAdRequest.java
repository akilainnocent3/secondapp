package com.unity3d.ironsourceads.banner;

import android.content.Context;
import android.os.Bundle;
import com.ironsource.C4595xc;
import com.ironsource.InterfaceC4562vd;
import com.ironsource.Z9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ironsourceads.AdSize;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class BannerAdRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    private final Context f76214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    private final String f76215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @l
    private final String f76216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @l
    private final AdSize f76217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @m
    private final Bundle f76218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @l
    private final InterfaceC4562vd f76219f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @l
    private final String f76220g;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @l
        private final Context f76221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @l
        private final String f76222b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @l
        private final String f76223c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @l
        private final AdSize f76224d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @m
        private Bundle f76225e;

        public Builder(@l Context context, @l String instanceId, @l String adm, @l AdSize size) {
            m0.p(context, "context");
            m0.p(instanceId, "instanceId");
            m0.p(adm, "adm");
            m0.p(size, "size");
            this.f76221a = context;
            this.f76222b = instanceId;
            this.f76223c = adm;
            this.f76224d = size;
        }

        @l
        public final BannerAdRequest build() {
            IronLog.API.info("instanceId: " + this.f76222b + ", size: " + this.f76224d.getSizeDescription());
            return new BannerAdRequest(this.f76221a, this.f76222b, this.f76223c, this.f76224d, this.f76225e, null);
        }

        @l
        public final String getAdm() {
            return this.f76223c;
        }

        @l
        public final Context getContext() {
            return this.f76221a;
        }

        @l
        public final String getInstanceId() {
            return this.f76222b;
        }

        @l
        public final AdSize getSize() {
            return this.f76224d;
        }

        @l
        public final Builder withExtraParams(@l Bundle extraParams) {
            m0.p(extraParams, "extraParams");
            this.f76225e = extraParams;
            return this;
        }
    }

    public /* synthetic */ BannerAdRequest(Context context, String str, String str2, AdSize adSize, Bundle bundle, x xVar) {
        this(context, str, str2, adSize, bundle);
    }

    @l
    public final String getAdId$mediationsdk_release() {
        return this.f76220g;
    }

    @l
    public final String getAdm() {
        return this.f76216c;
    }

    @l
    public final Context getContext() {
        return this.f76214a;
    }

    @m
    public final Bundle getExtraParams() {
        return this.f76218e;
    }

    @l
    public final String getInstanceId() {
        return this.f76215b;
    }

    @l
    public final InterfaceC4562vd getProviderName$mediationsdk_release() {
        return this.f76219f;
    }

    @l
    public final AdSize getSize() {
        return this.f76217d;
    }

    private BannerAdRequest(Context context, String str, String str2, AdSize adSize, Bundle bundle) {
        this.f76214a = context;
        this.f76215b = str;
        this.f76216c = str2;
        this.f76217d = adSize;
        this.f76218e = bundle;
        this.f76219f = new C4595xc(str);
        String strB = Z9.b();
        m0.o(strB, "generateMultipleUniqueInstanceId()");
        this.f76220g = strB;
    }
}
