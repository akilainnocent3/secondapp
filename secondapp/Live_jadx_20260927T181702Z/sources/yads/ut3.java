package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ut3 extends kotlin.jvm.internal.o0 implements ds.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vt3 f156591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f156592c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ut3(vt3 vt3Var, ArrayList arrayList) {
        super(0);
        this.f156591b = vt3Var;
        this.f156592c = arrayList;
    }

    @Override // ds.a
    public final Object invoke() {
        this.f156591b.f157088a.onAdsLoaded(this.f156592c);
        return dr.w2.f79517a;
    }
}
