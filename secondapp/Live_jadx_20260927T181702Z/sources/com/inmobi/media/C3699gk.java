package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdSet;
import com.yandex.div.core.DivActionHandler;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.gk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3699gk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3953r1 f56525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f56526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f56527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f56528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f56529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f56530f;

    public C3699gk(C3953r1 c3953r1, String str, String str2, String str3, String markupType) {
        kotlin.jvm.internal.m0.p(markupType, "markupType");
        this.f56525a = c3953r1;
        this.f56526b = str;
        this.f56527c = str2;
        this.f56528d = str3;
        this.f56529e = markupType;
    }

    public final LinkedHashMap a() {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C3953r1 c3953r1 = this.f56525a;
        if (c3953r1 != null) {
            linkedHashMap.put("adType", c3953r1.f57497a.l());
        }
        C3953r1 c3953r2 = this.f56525a;
        if (c3953r2 != null) {
            linkedHashMap.put("plId", Long.valueOf(c3953r2.f57497a.f56877l.f57863a));
        }
        C3953r1 c3953r3 = this.f56525a;
        if (c3953r3 != null && (str = c3953r3.f57497a.f56877l.f57868f) != null) {
            linkedHashMap.put("plType", str);
        }
        C3953r1 c3953r4 = this.f56525a;
        String str2 = null;
        if (c3953r4 != null) {
            AdSet adSetR = c3953r4.f57497a.r();
            Boolean boolValueOf = adSetR != null ? Boolean.valueOf(adSetR.isRewarded()) : null;
            if (boolValueOf != null) {
                linkedHashMap.put("isRewarded", boolValueOf);
            }
        }
        String str3 = this.f56527c;
        if (str3 != null) {
            linkedHashMap.put("creativeId", str3);
        }
        String str4 = this.f56526b;
        if (str4 != null) {
            linkedHashMap.put("creativeType", str4);
        }
        linkedHashMap.put("markupType", this.f56529e);
        String str5 = this.f56530f;
        if (str5 != null) {
            str2 = str5;
        } else {
            kotlin.jvm.internal.m0.S("triggerSource");
        }
        linkedHashMap.put(DivActionHandler.DivActionReason.TRIGGER, str2);
        C3953r1 c3953r5 = this.f56525a;
        if (c3953r5 != null && c3953r5.a().length() > 0) {
            linkedHashMap.put("metadataBlob", this.f56525a.a());
        }
        return linkedHashMap;
    }

    public final void b() {
        C3724hk c3724hk;
        AtomicBoolean atomicBoolean;
        C3953r1 c3953r1 = this.f56525a;
        if (c3953r1 == null || (c3724hk = c3953r1.f57498b) == null || (atomicBoolean = c3724hk.f56603a) == null || !atomicBoolean.getAndSet(true)) {
            LinkedHashMap linkedHashMapA = a();
            linkedHashMapA.put("networkType", C4107x5.m());
            linkedHashMapA.put("errorCode", (short) 2177);
            String str = this.f56528d;
            if (str == null) {
                str = "";
            }
            linkedHashMapA.put("impressionId", str);
            Wj wj2 = Wj.f55736a;
            Wj.b("AdImpressionSuccessful", linkedHashMapA, EnumC3544ak.SDK);
        }
    }

    public final void c() {
        C3724hk c3724hk;
        AtomicBoolean atomicBoolean;
        C3953r1 c3953r1 = this.f56525a;
        if (c3953r1 == null || (c3724hk = c3953r1.f57498b) == null || (atomicBoolean = c3724hk.f56603a) == null || !atomicBoolean.getAndSet(true)) {
            LinkedHashMap linkedHashMapA = a();
            linkedHashMapA.put("networkType", C4107x5.m());
            linkedHashMapA.put("errorCode", (short) 0);
            String str = this.f56528d;
            if (str == null) {
                str = "";
            }
            linkedHashMapA.put("impressionId", str);
            Wj wj2 = Wj.f55736a;
            Wj.b("AdImpressionSuccessful", linkedHashMapA, EnumC3544ak.SDK);
        }
    }
}
