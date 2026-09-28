package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.RuntimeVersion;
import com.sporty.android.core.model.patron.KYCBannerItem;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.domain.usecase.status.GetStatusUseCase", f = "GetStatusUseCase.kt", l = {21, 22, KYCBannerItem.STATUS_DEPRECATE, RuntimeVersion.MINOR, 32, 38, DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER, DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER, 67}, m = "invoke", v = 1)
public final class kek extends x1b {
    public tye a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ nek d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kek(nek nekVar, x1b x1bVar) {
        super(x1bVar);
        this.d = nekVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
