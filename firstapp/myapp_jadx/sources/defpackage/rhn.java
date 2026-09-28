package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.RuntimeVersion;
import com.sporty.android.core.model.patron.KYCBannerItem;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.stacker.domain.usecase.InitialiseStackerGameUseCase", f = "InitialiseStackerGameUseCase.kt", l = {22, DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER, 24, KYCBannerItem.STATUS_DEPRECATE, RuntimeVersion.MINOR, 28, 29, 33, 35, DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER, DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER, 52, 56, 57, 58, 70, 71, 72}, m = "invoke", v = 1)
public final class rhn extends x1b {
    public boolean a;
    public int b;
    public int c;
    public long d;
    public String e;
    public c5c f;
    public /* synthetic */ Object i;
    public final /* synthetic */ shn v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rhn(shn shnVar, x1b x1bVar) {
        super(x1bVar);
        this.v = shnVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.a(this);
    }
}
