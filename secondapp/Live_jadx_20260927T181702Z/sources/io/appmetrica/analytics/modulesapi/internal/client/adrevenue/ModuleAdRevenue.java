package io.appmetrica.analytics.modulesapi.internal.client.adrevenue;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class ModuleAdRevenue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BigDecimal f98820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Currency f98821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ModuleAdType f98822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f98823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f98824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f98825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f98826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f98827h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f98828i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f98829j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f98830k;

    public ModuleAdRevenue(@l BigDecimal bigDecimal, @l Currency currency, @m ModuleAdType moduleAdType, @m String str, @m String str2, @m String str3, @m String str4, @m String str5, @m String str6, @m Map<String, String> map, boolean z10) {
        this.f98820a = bigDecimal;
        this.f98821b = currency;
        this.f98822c = moduleAdType;
        this.f98823d = str;
        this.f98824e = str2;
        this.f98825f = str3;
        this.f98826g = str4;
        this.f98827h = str5;
        this.f98828i = str6;
        this.f98829j = map;
        this.f98830k = z10;
    }

    @m
    public final String getAdNetwork() {
        return this.f98823d;
    }

    @m
    public final String getAdPlacementId() {
        return this.f98826g;
    }

    @m
    public final String getAdPlacementName() {
        return this.f98827h;
    }

    @l
    public final BigDecimal getAdRevenue() {
        return this.f98820a;
    }

    @m
    public final ModuleAdType getAdType() {
        return this.f98822c;
    }

    @m
    public final String getAdUnitId() {
        return this.f98824e;
    }

    @m
    public final String getAdUnitName() {
        return this.f98825f;
    }

    public final boolean getAutoCollected() {
        return this.f98830k;
    }

    @l
    public final Currency getCurrency() {
        return this.f98821b;
    }

    @m
    public final Map<String, String> getPayload() {
        return this.f98829j;
    }

    @m
    public final String getPrecision() {
        return this.f98828i;
    }

    public /* synthetic */ ModuleAdRevenue(BigDecimal bigDecimal, Currency currency, ModuleAdType moduleAdType, String str, String str2, String str3, String str4, String str5, String str6, Map map, boolean z10, int i10, x xVar) {
        this(bigDecimal, currency, (i10 & 4) != 0 ? null : moduleAdType, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : str4, (i10 & 128) != 0 ? null : str5, (i10 & 256) != 0 ? null : str6, (i10 & 512) != 0 ? null : map, (i10 & 1024) != 0 ? true : z10);
    }
}
