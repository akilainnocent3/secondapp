package yads;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class tw extends kotlin.jvm.internal.o0 implements ds.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vw f156094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri.Builder f156095c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw(vw vwVar, Uri.Builder builder) {
        super(2);
        this.f156094b = vwVar;
        this.f156095c = builder;
    }

    @Override // ds.p
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        so2 so2Var = this.f156094b.f157103a;
        Uri.Builder builder = this.f156095c;
        so2Var.getClass();
        if (str2 != null && str2.length() != 0) {
            builder.appendQueryParameter(str, str2);
        }
        return dr.w2.f79517a;
    }
}
