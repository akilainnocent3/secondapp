package com.ironsource.mediationsdk;

import com.ironsource.C4259ea;
import com.ironsource.C4287g2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final IronSource.a f62677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private final ArrayList<C4287g2> f62678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f62679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    private String f62680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f62681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.l
    private Map<String, Object> f62682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oy.l
    private List<String> f62683g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f62684h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @oy.m
    private h f62685i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @oy.m
    private C4259ea f62686j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @oy.l
    private String f62687k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @oy.m
    private ISBannerSize f62688l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f62689m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f62690n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f62691o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @oy.m
    private String f62692p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @oy.m
    private String f62693q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @oy.m
    private Boolean f62694r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @oy.m
    private Double f62695s;

    public i(@oy.l IronSource.a adUnit) {
        m0.p(adUnit, "adUnit");
        this.f62677a = adUnit;
        this.f62678b = new ArrayList<>();
        this.f62680d = "";
        this.f62682f = new HashMap();
        this.f62683g = new ArrayList();
        this.f62684h = -1;
        this.f62687k = "";
    }

    @oy.l
    public final IronSource.a a() {
        return this.f62677a;
    }

    public final void b(boolean z10) {
        this.f62681e = z10;
    }

    @oy.l
    public final IronSource.a c() {
        return this.f62677a;
    }

    public final void d(@oy.l String str) {
        m0.p(str, "<set-?>");
        this.f62687k = str;
    }

    @oy.m
    public final h e() {
        return this.f62685i;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f62677a == ((i) obj).f62677a;
    }

    @oy.m
    public final ISBannerSize f() {
        return this.f62688l;
    }

    @oy.m
    public final Double g() {
        return this.f62695s;
    }

    @oy.l
    public final Map<String, Object> h() {
        return this.f62682f;
    }

    public int hashCode() {
        return this.f62677a.hashCode();
    }

    @oy.l
    public final String j() {
        return this.f62680d;
    }

    @oy.l
    public final ArrayList<C4287g2> k() {
        return this.f62678b;
    }

    @oy.l
    public final List<String> l() {
        return this.f62683g;
    }

    @oy.m
    public final C4259ea n() {
        return this.f62686j;
    }

    public final int o() {
        return this.f62684h;
    }

    public final boolean p() {
        return this.f62690n;
    }

    public final boolean q() {
        return this.f62691o;
    }

    @oy.l
    public final String r() {
        return this.f62687k;
    }

    public final boolean s() {
        return this.f62689m;
    }

    public final boolean t() {
        return this.f62681e;
    }

    @oy.l
    public String toString() {
        return "AuctionRequestParams(adUnit=" + this.f62677a + gi.j.f86771d;
    }

    @oy.m
    public final Boolean u() {
        return this.f62694r;
    }

    public final boolean v() {
        return this.f62679c;
    }

    @oy.l
    public final i a(@oy.l IronSource.a adUnit) {
        m0.p(adUnit, "adUnit");
        return new i(adUnit);
    }

    public final void b(@oy.m String str) {
        this.f62692p = str;
    }

    public final void c(boolean z10) {
        this.f62679c = z10;
    }

    public final void d(boolean z10) {
        this.f62690n = z10;
    }

    public final void e(boolean z10) {
        this.f62691o = z10;
    }

    public static /* synthetic */ i a(i iVar, IronSource.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = iVar.f62677a;
        }
        return iVar.a(aVar);
    }

    @oy.m
    public final String b() {
        return this.f62693q;
    }

    public final void c(@oy.l String str) {
        m0.p(str, "<set-?>");
        this.f62680d = str;
    }

    @oy.m
    public final String d() {
        return this.f62692p;
    }

    public final void a(@oy.l C4287g2 instanceInfo) {
        m0.p(instanceInfo, "instanceInfo");
        this.f62678b.add(instanceInfo);
    }

    public final void a(@oy.l Map<String, Object> map) {
        m0.p(map, "<set-?>");
        this.f62682f = map;
    }

    public final void a(@oy.l List<String> list) {
        m0.p(list, "<set-?>");
        this.f62683g = list;
    }

    public final void a(int i10) {
        this.f62684h = i10;
    }

    public final void a(@oy.m h hVar) {
        this.f62685i = hVar;
    }

    public final void a(@oy.m C4259ea c4259ea) {
        this.f62686j = c4259ea;
    }

    public final void a(@oy.m ISBannerSize iSBannerSize) {
        this.f62688l = iSBannerSize;
    }

    public final void a(boolean z10) {
        this.f62689m = z10;
    }

    public final void a(@oy.m String str) {
        this.f62693q = str;
    }

    public final void a(@oy.m Boolean bool) {
        this.f62694r = bool;
    }

    public final void a(@oy.m Double d10) {
        this.f62695s = d10;
    }

    @dr.o(message = "Use instancesInfo instead")
    public static /* synthetic */ void i() {
    }

    @dr.o(message = "Use instancesInfo instead")
    public static /* synthetic */ void m() {
    }
}
