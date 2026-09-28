package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.loyalty.TierDobConfig;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.domain.usecase.GetDobBenefitCardItemUseCase", f = "GetDobBenefitCardItemUseCase.kt", l = {DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "retrieve", v = 2)
public final class s5k extends x1b {
    public krf0 a;
    public TierDobConfig b;
    public TierDobConfig c;
    public /* synthetic */ Object d;
    public final /* synthetic */ t5k e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5k(t5k t5kVar, x1b x1bVar) {
        super(x1bVar);
        this.e = t5kVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(null, null, null, this);
    }
}
