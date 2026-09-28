package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.vip.repository.ApiRepository", f = "ApiRepository.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "getStakeSafeUsageCount", v = 1)
public final class zn0 extends x1b {
    public jo0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ jo0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn0(jo0 jo0Var, x1b x1bVar) {
        super(x1bVar);
        this.c = jo0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.f(this);
    }
}
