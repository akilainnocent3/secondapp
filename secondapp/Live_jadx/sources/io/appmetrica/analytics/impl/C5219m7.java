package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.m7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5219m7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f97878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f97879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f97880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f97881e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f97882f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f97883g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f97884h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f97885i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f97886j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f97887k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f97888l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f97889m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f97890n;

    public C5219m7(C5069gb c5069gb) {
        this.f97877a = c5069gb.b("dId");
        this.f97878b = c5069gb.b("uId");
        this.f97879c = c5069gb.b("analyticsSdkVersionName");
        this.f97880d = c5069gb.b("kitBuildNumber");
        this.f97881e = c5069gb.b("kitBuildType");
        this.f97882f = c5069gb.b("appVer");
        this.f97883g = c5069gb.optString("app_debuggable", "0");
        this.f97884h = c5069gb.b("appBuild");
        this.f97885i = c5069gb.b("osVer");
        this.f97887k = c5069gb.b("lang");
        this.f97888l = c5069gb.b("root");
        this.f97889m = c5069gb.optString(CommonUrlParts.APP_FRAMEWORK, FrameworkDetector.framework());
        int iOptInt = c5069gb.optInt("osApiLev", -1);
        this.f97886j = iOptInt == -1 ? null : String.valueOf(iOptInt);
        int iOptInt2 = c5069gb.optInt("attribution_id", 0);
        this.f97890n = iOptInt2 > 0 ? String.valueOf(iOptInt2) : null;
    }

    public final String toString() {
        return "DbNetworkTaskConfig{deviceId='" + this.f97877a + "', uuid='" + this.f97878b + "', analyticsSdkVersionName='" + this.f97879c + "', kitBuildNumber='" + this.f97880d + "', kitBuildType='" + this.f97881e + "', appVersion='" + this.f97882f + "', appDebuggable='" + this.f97883g + "', appBuildNumber='" + this.f97884h + "', osVersion='" + this.f97885i + "', osApiLevel='" + this.f97886j + "', locale='" + this.f97887k + "', deviceRootStatus='" + this.f97888l + "', appFramework='" + this.f97889m + "', attributionId='" + this.f97890n + "'}";
    }

    public C5219m7() {
        this.f97877a = null;
        this.f97878b = null;
        this.f97879c = null;
        this.f97880d = null;
        this.f97881e = null;
        this.f97882f = null;
        this.f97883g = null;
        this.f97884h = null;
        this.f97885i = null;
        this.f97886j = null;
        this.f97887k = null;
        this.f97888l = null;
        this.f97889m = null;
        this.f97890n = null;
    }
}
