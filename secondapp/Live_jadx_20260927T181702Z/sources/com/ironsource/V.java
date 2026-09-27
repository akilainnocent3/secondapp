package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.s1({"SMAP\nAdManagerData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdManagerData.kt\ncom/ironsource/mediationsdk/adunit/manager/adManagerData/AdManagerData\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,51:1\n288#2,2:52\n*S KotlinDebug\n*F\n+ 1 AdManagerData.kt\ncom/ironsource/mediationsdk/adunit/manager/adManagerData/AdManagerData\n*L\n36#1:52,2\n*E\n"})
public class V {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @oy.l
    public static final a f60204q = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f60205r = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final IronSource.a f60206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.m
    private final String f60207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.m
    private final List<NetworkSettings> f60208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    private final C4450p2 f60209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f60210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f60211f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f60212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f60213h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f60214i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @oy.l
    private final O0 f60215j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @oy.l
    private final I0 f60216k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f60217l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f60218m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f60219n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f60220o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f60221p;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V(@oy.l IronSource.a adUnit, @oy.m String str, @oy.m List<? extends NetworkSettings> list, @oy.l C4450p2 auctionSettings, int i10, int i11, boolean z10, int i12, int i13, @oy.l O0 loadingData, @oy.l I0 interactionData, long j10, boolean z11, boolean z12, boolean z13, boolean z14) {
        kotlin.jvm.internal.m0.p(adUnit, "adUnit");
        kotlin.jvm.internal.m0.p(auctionSettings, "auctionSettings");
        kotlin.jvm.internal.m0.p(loadingData, "loadingData");
        kotlin.jvm.internal.m0.p(interactionData, "interactionData");
        this.f60206a = adUnit;
        this.f60207b = str;
        this.f60208c = list;
        this.f60209d = auctionSettings;
        this.f60210e = i10;
        this.f60211f = i11;
        this.f60212g = z10;
        this.f60213h = i12;
        this.f60214i = i13;
        this.f60215j = loadingData;
        this.f60216k = interactionData;
        this.f60217l = j10;
        this.f60218m = z11;
        this.f60219n = z12;
        this.f60220o = z13;
        this.f60221p = z14;
    }

    public final void a(int i10) {
        this.f60210e = i10;
    }

    @oy.l
    public final IronSource.a b() {
        return this.f60206a;
    }

    public final boolean c() {
        return this.f60212g;
    }

    @oy.l
    public final C4450p2 d() {
        return this.f60209d;
    }

    public final long e() {
        return this.f60217l;
    }

    public final int f() {
        return this.f60213h;
    }

    @oy.l
    public final I0 g() {
        return this.f60216k;
    }

    @oy.l
    public final O0 h() {
        return this.f60215j;
    }

    public final int i() {
        return this.f60210e;
    }

    @oy.m
    public List<NetworkSettings> j() {
        return this.f60208c;
    }

    public final boolean k() {
        return this.f60218m;
    }

    public final boolean l() {
        return this.f60220o;
    }

    public final boolean m() {
        return this.f60221p;
    }

    public final int n() {
        return this.f60211f;
    }

    @oy.m
    public String o() {
        return this.f60207b;
    }

    public final boolean p() {
        return this.f60219n;
    }

    public final boolean q() {
        return this.f60209d.g() > 0;
    }

    @oy.l
    public final String r() {
        String str = String.format(Locale.getDefault(), "%s: %d, %s: %b, %s: %b", com.ironsource.mediationsdk.d.f62473x, Integer.valueOf(this.f60210e), com.ironsource.mediationsdk.d.f62474y, Boolean.valueOf(this.f60212g), com.ironsource.mediationsdk.d.f62475z, Boolean.valueOf(this.f60221p));
        kotlin.jvm.internal.m0.o(str, "format(\n          Locale…     showPriorityEnabled)");
        return str;
    }

    public final void a(boolean z10) {
        this.f60212g = z10;
    }

    public final void b(boolean z10) {
        this.f60221p = z10;
    }

    public final int a() {
        return this.f60214i;
    }

    @oy.m
    public final NetworkSettings a(@oy.l String instanceName) {
        kotlin.jvm.internal.m0.p(instanceName, "instanceName");
        List<NetworkSettings> listJ = j();
        Object obj = null;
        if (listJ == null) {
            return null;
        }
        for (Object obj2 : listJ) {
            if (((NetworkSettings) obj2).getProviderInstanceName().equals(instanceName)) {
                obj = obj2;
                break;
            }
        }
        return (NetworkSettings) obj;
    }

    public /* synthetic */ V(IronSource.a aVar, String str, List list, C4450p2 c4450p2, int i10, int i11, boolean z10, int i12, int i13, O0 o10, I0 i14, long j10, boolean z11, boolean z12, boolean z13, boolean z14, int i15, kotlin.jvm.internal.x xVar) {
        this(aVar, str, list, c4450p2, i10, i11, z10, i12, i13, o10, i14, j10, z11, z12, z13, (i15 & 32768) != 0 ? false : z14);
    }
}
