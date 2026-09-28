package defpackage;

import com.sportybet.android.social.data.remote.entity.AliasCodeList;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.usecase.CustomCodeUseCase$loadCustomCodeList$1", f = "CustomCodeUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class tbc extends tje0 implements gaj<lk50<? extends AliasCodeList>, lk50<? extends j8c>, v1b<? super Pair<? extends lk50<? extends AliasCodeList>, ? extends lk50<? extends j8c>>>, Object> {
    public /* synthetic */ lk50 a;
    public /* synthetic */ lk50 b;

    @Override // defpackage.gaj
    public final Object invoke(lk50<? extends AliasCodeList> lk50Var, lk50<? extends j8c> lk50Var2, v1b<? super Pair<? extends lk50<? extends AliasCodeList>, ? extends lk50<? extends j8c>>> v1bVar) {
        tbc tbcVar = new tbc(3, v1bVar);
        tbcVar.a = lk50Var;
        tbcVar.b = lk50Var2;
        return tbcVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = this.a;
        lk50 lk50Var2 = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new Pair(lk50Var, lk50Var2);
    }
}
