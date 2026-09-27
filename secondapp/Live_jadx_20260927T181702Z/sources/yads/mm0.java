package yads;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class mm0 extends kotlin.jvm.internal.o0 implements ds.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ om0 f152540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri.Builder f152541c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mm0(om0 om0Var, Uri.Builder builder) {
        super(2);
        this.f152540b = om0Var;
        this.f152541c = builder;
    }

    @Override // ds.p
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        om0 om0Var = this.f152540b;
        Uri.Builder builder = this.f152541c;
        om0Var.getClass();
        if (str2 != null && str2.length() != 0) {
            builder.appendQueryParameter(str, str2);
        }
        return dr.w2.f79517a;
    }
}
