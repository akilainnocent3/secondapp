package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.onetwoup.data.repository.OneUpTwoUpConfigRepoImpl", f = "OneUpTwoUpConfigRepoImpl.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "getOneTwoUpBOConfigs", v = 2)
public final class muy extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ nuy b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public muy(nuy nuyVar, x1b x1bVar) {
        super(x1bVar);
        this.b = nuyVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
