package defpackage;

import com.sporty.android.core.model.patron.UserPhone;
import com.sporty.android.core.model.pocket.common.UserAdditionalPhoneConfig;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositMomoViewModel$multiPhoneEnabledFlow$1", f = "DepositMomoViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class h2e extends tje0 implements iaj<lk50<? extends UserAdditionalPhoneConfig>, lk50<? extends List<? extends UserPhone>>, ncx, v1b<? super Boolean>, Object> {
    public /* synthetic */ lk50 a;
    public /* synthetic */ lk50 b;
    public /* synthetic */ ncx c;

    @Override // defpackage.iaj
    public final Object d(lk50<? extends UserAdditionalPhoneConfig> lk50Var, lk50<? extends List<? extends UserPhone>> lk50Var2, ncx ncxVar, v1b<? super Boolean> v1bVar) {
        h2e h2eVar = new h2e(4, v1bVar);
        h2eVar.a = lk50Var;
        h2eVar.b = lk50Var2;
        h2eVar.c = ncxVar;
        return h2eVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = this.a;
        lk50 lk50Var2 = this.b;
        ncx ncxVar = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return Boolean.valueOf((lk50Var instanceof lk50.c) && (lk50Var2 instanceof lk50.c) && ((UserAdditionalPhoneConfig) ((lk50.c) lk50Var).a).getEnabled() && ncxVar.d);
    }
}
