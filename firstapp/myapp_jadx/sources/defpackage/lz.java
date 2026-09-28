package defpackage;

import com.sporty.android.core.model.antest.CampaignVariantVO;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.antest.repository.AnTestRepositoryImpl$fetchAndCacheRemoteVariant$2", f = "AnTestRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class lz extends tje0 implements Function2<CampaignVariantVO, v1b<? super Unit>, Object> {
    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new lz(2, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CampaignVariantVO campaignVariantVO, v1b<? super Unit> v1bVar) {
        return ((lz) create(campaignVariantVO, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return Unit.a;
    }
}
