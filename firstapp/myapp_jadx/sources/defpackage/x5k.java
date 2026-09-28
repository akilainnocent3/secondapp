package defpackage;

import com.google.protobuf.DescriptorProtos;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.plugin.realsports.marketing.domain.GetEligibleMarketingActivitiesUseCase", f = "GetEligibleMarketingActivitiesUseCase.kt", l = {DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER, 38}, m = "invoke-IoAF18A", v = 2)
public final class x5k extends x1b {
    public w5k a;
    public q500 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ w5k d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5k(w5k w5kVar, x1b x1bVar) {
        super(x1bVar);
        this.d = w5kVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        Serializable serializableA = this.d.a(this);
        return serializableA == y5b.a ? serializableA : new zi50(serializableA);
    }
}
