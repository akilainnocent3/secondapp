package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.b0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3550b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f56025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f56026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f56027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f56028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f56029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C3862n9 f56030f;

    public C3550b0(WeakReference adUnitEventListener, String adtype, boolean z10) {
        kotlin.jvm.internal.m0.p(adUnitEventListener, "adUnitEventListener");
        kotlin.jvm.internal.m0.p(adtype, "adtype");
        this.f56025a = adUnitEventListener;
        this.f56026b = adtype;
        this.f56027c = z10;
        this.f56028d = new AtomicBoolean(false);
        this.f56029e = String.valueOf(kotlin.jvm.internal.m1.d(C3550b0.class).K());
    }

    public final void a(C3699gk c3699gk) {
        Gh gh2;
        C3724hk c3724hk;
        AtomicBoolean atomicBoolean;
        if (!this.f56028d.getAndSet(true)) {
            Qi qi2 = Qi.f55375a;
            String str = this.f56026b;
            Boolean boolValueOf = Boolean.valueOf(this.f56027c);
            qi2.getClass();
            Qi.a(str, boolValueOf);
            AbstractC3680g1 abstractC3680g1 = (AbstractC3680g1) this.f56025a.get();
            if (abstractC3680g1 != null) {
                abstractC3680g1.a(c3699gk);
            } else if (c3699gk != null) {
                c3699gk.b();
            }
            C3862n9 c3862n9 = this.f56030f;
            if (c3862n9 != null) {
                c3862n9.a(this.f56029e, "==== CHECKPOINT REACHED - IMPRESSION FIRED ====");
            }
            C3862n9 c3862n10 = this.f56030f;
            if (c3862n10 == null || (gh2 = c3862n10.f57087a) == null) {
                return;
            }
            gh2.a();
            return;
        }
        C3862n9 c3862n11 = this.f56030f;
        if (c3862n11 != null) {
            c3862n11.c(this.f56029e, "skipping as Impression is already Called");
        }
        if (c3699gk != null) {
            C3953r1 c3953r1 = c3699gk.f56525a;
            if (c3953r1 == null || (c3724hk = c3953r1.f57498b) == null || (atomicBoolean = c3724hk.f56603a) == null || !atomicBoolean.getAndSet(true)) {
                LinkedHashMap linkedHashMapA = c3699gk.a();
                linkedHashMapA.put("networkType", C4107x5.m());
                linkedHashMapA.put("errorCode", (short) 2179);
                String str2 = c3699gk.f56528d;
                if (str2 == null) {
                    str2 = "";
                }
                linkedHashMapA.put("impressionId", str2);
                Wj wj2 = Wj.f55736a;
                Wj.b("AdImpressionSuccessful", linkedHashMapA, EnumC3544ak.SDK);
            }
        }
    }
}
