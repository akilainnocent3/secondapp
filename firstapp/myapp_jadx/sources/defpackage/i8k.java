package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.patron.KYCBannerItem;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.featurematch.domain.GetLuckyNumberFeatureMatchUseCaseImpl$invoke$1$1", f = "GetLuckyNumberFeatureMatchUseCaseImpl.kt", l = {KYCBannerItem.STATUS_DEPRECATE, DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER, DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "emit", v = 2)
public final class i8k extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ j8k.a<Object> b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8k(j8k.a<Object> aVar, v1b<? super i8k> v1bVar) {
        super(v1bVar);
        this.b = aVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(this);
    }
}
