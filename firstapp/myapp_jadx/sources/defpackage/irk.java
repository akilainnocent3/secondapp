package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.common_ui.uitext.ResourceUiText;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.gift.gift.data.repository.GiftRepositoryImpl", f = "GiftRepositoryImpl.kt", l = {DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER}, m = "hasUsedGift", v = 2)
public final class irk extends x1b {
    public ResourceUiText a;
    public /* synthetic */ Object b;
    public final /* synthetic */ jrk c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public irk(jrk jrkVar, x1b x1bVar) {
        super(x1bVar);
        this.c = jrkVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.e(this);
    }
}
