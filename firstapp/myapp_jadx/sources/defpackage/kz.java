package defpackage;

import com.sporty.android.core.model.antest.CampaignVariantVO;
import defpackage.csm;
import java.lang.Enum;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.antest.repository.AnTestRepositoryImpl", f = "AnTestRepositoryImpl.kt", l = {160, 176, 177}, m = "fetchAndCacheRemoteVariant", v = 2)
public final class kz<E extends Enum<E> & csm<E>> extends x1b {
    public Function2 a;
    public String b;
    public Class c;
    public CampaignVariantVO d;
    public /* synthetic */ Object e;
    public final /* synthetic */ tz f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz(tz tzVar, x1b x1bVar) {
        super(x1bVar);
        this.f = tzVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.o(null, null, null, this);
    }
}
