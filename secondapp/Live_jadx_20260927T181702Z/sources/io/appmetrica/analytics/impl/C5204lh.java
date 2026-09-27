package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.lh, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5204lh extends O5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f97822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f97823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f97824f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f97825g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f97826h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f97827i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Boolean f97828j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InterfaceC5126ih f97829k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC5178kh f97830l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f97831m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f97832n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f97833o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f97834p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List f97835q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f97836r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f97837s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f97838t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f97839u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f97840v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f97841w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Set f97842x = new HashSet();

    public C5204lh(Y4 y10) {
        this.f97830l = y10;
    }

    public final void a(int i10) {
        this.f97836r = i10;
    }

    public final void b(List<String> list) {
        this.f97835q = list;
    }

    public final String c() {
        return this.f97831m;
    }

    public final void d(boolean z10) {
        this.f97822d = z10;
    }

    public final void e(boolean z10) {
        this.f97826h = z10;
    }

    public final void f(boolean z10) {
        this.f97832n = z10;
    }

    public final boolean g() {
        return this.f97839u;
    }

    @NonNull
    public final String h() {
        return (String) WrapUtils.getOrDefault(this.f97834p, "");
    }

    public final boolean i() {
        return this.f97829k.a(this.f97828j);
    }

    public final int j() {
        return this.f97825g;
    }

    public final long k() {
        return this.f97840v;
    }

    public final int l() {
        return this.f97827i;
    }

    public final long m() {
        return this.f97837s;
    }

    public final long n() {
        return this.f97838t;
    }

    public final List<String> o() {
        return this.f97835q;
    }

    public final int p() {
        return this.f97824f;
    }

    public final boolean q() {
        return this.f97833o;
    }

    public final boolean r() {
        return this.f97823e;
    }

    public final boolean s() {
        return this.f97822d;
    }

    public final boolean t() {
        return this.f97832n;
    }

    @Override // io.appmetrica.analytics.impl.O5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public final String toString() {
        return "ReportRequestConfig{mLocationTracking=" + this.f97822d + ", mFirstActivationAsUpdate=" + this.f97823e + ", mSessionTimeout=" + this.f97824f + ", mDispatchPeriod=" + this.f97825g + ", mLogEnabled=" + this.f97826h + ", mMaxReportsCount=" + this.f97827i + ", dataSendingEnabledFromArguments=" + this.f97828j + ", dataSendingStrategy=" + this.f97829k + ", mPreloadInfoSendingStrategy=" + this.f97830l + ", mApiKey='" + this.f97831m + "', mPermissionsCollectingEnabled=" + this.f97832n + ", mFeaturesCollectingEnabled=" + this.f97833o + ", mClidsFromStartupResponse='" + this.f97834p + "', mReportHosts=" + this.f97835q + ", mAttributionId=" + this.f97836r + ", mPermissionsCollectingIntervalSeconds=" + this.f97837s + ", mPermissionsForceSendIntervalSeconds=" + this.f97838t + ", mClidsFromClientMatchClidsFromStartupRequest=" + this.f97839u + ", mMaxReportsInDbCount=" + this.f97840v + ", mCertificates=" + this.f97841w + "} " + super.toString();
    }

    public final boolean u() {
        return isIdentifiersValid() && !mo.a((Collection) this.f97835q) && this.f97839u;
    }

    public final boolean v() {
        return ((Y4) this.f97830l).B();
    }

    public final void a(long j10) {
        this.f97840v = j10;
    }

    public final void b(long j10) {
        this.f97837s = j10;
    }

    public final void c(long j10) {
        this.f97838t = j10;
    }

    public final void d(int i10) {
        this.f97824f = i10;
    }

    @NonNull
    public final Set<String> e() {
        return this.f97842x;
    }

    @Nullable
    public final List<String> f() {
        return this.f97841w;
    }

    public final void a(@NonNull List<String> list) {
        this.f97841w = list;
    }

    public final void b(boolean z10) {
        this.f97833o = z10;
    }

    public final void c(boolean z10) {
        this.f97823e = z10;
    }

    public final int d() {
        return this.f97836r;
    }

    public final void a(@Nullable Boolean bool, @NonNull InterfaceC5126ih interfaceC5126ih) {
        this.f97828j = bool;
        this.f97829k = interfaceC5126ih;
    }

    public final void b(int i10) {
        this.f97825g = i10;
    }

    public final void c(int i10) {
        this.f97827i = i10;
    }

    public final void a(boolean z10) {
        this.f97839u = z10;
    }

    public final void a(@NonNull Set<String> set) {
        this.f97842x = set;
    }
}
