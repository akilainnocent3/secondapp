package vd;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements com.fyber.inneractive.sdk.network.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f140882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f140883b;

    public d(Map map, String str) {
        this.f140882a = map;
        this.f140883b = str;
    }

    @Override // com.fyber.inneractive.sdk.network.o
    public final StringBuffer a() {
        return new StringBuffer(this.f140883b);
    }

    @Override // com.fyber.inneractive.sdk.network.o
    public final Map b() {
        return this.f140882a;
    }
}
