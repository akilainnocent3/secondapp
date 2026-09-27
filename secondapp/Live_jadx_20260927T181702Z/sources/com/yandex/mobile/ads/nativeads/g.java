package com.yandex.mobile.ads.nativeads;

import fr.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m0;
import yads.j02;
import yads.r12;
import yads.v22;
import yads.w02;
import yads.z12;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class g extends d implements SliderAd {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v22 f76955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f76956f;

    public g(v22 v22Var, f fVar) {
        super(v22Var);
        this.f76955e = v22Var;
        this.f76956f = fVar;
    }

    @Override // com.yandex.mobile.ads.nativeads.SliderAd
    public final void bindSliderAd(NativeAdViewBinder nativeAdViewBinder) throws j02 {
        this.f76956f.getClass();
        r12 r12VarA = f.a(nativeAdViewBinder);
        v22 v22Var = this.f76955e;
        v22Var.getClass();
        v22Var.a(r12VarA.f154712c, v22Var.Q, new z12(r12VarA));
    }

    @Override // com.yandex.mobile.ads.nativeads.d
    public final boolean equals(Object obj) {
        return (obj instanceof g) && m0.g(((g) obj).f76955e, this.f76955e);
    }

    @Override // com.yandex.mobile.ads.nativeads.SliderAd
    public final List getNativeAds() {
        ArrayList arrayListI = this.f76955e.i();
        ArrayList arrayList = new ArrayList(i0.d0(arrayListI, 10));
        Iterator it = arrayListI.iterator();
        while (it.hasNext()) {
            arrayList.add(new d((w02) it.next()));
        }
        return arrayList;
    }

    @Override // com.yandex.mobile.ads.nativeads.d
    public final int hashCode() {
        return this.f76955e.hashCode();
    }
}
