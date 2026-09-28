package defpackage;

import com.sportybet.android.social.data.remote.entity.AliasCodeList;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.usecase.CustomCodeUseCase$loadCustomCodeList$2", f = "CustomCodeUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ubc extends tje0 implements gaj<Pair<? extends lk50<? extends AliasCodeList>, ? extends lk50<? extends j8c>>, lk50<? extends sbc.a>, v1b<? super bxg0<? extends lk50<? extends AliasCodeList>, ? extends lk50<? extends j8c>, ? extends lk50<? extends sbc.a>>>, Object> {
    public /* synthetic */ Pair a;
    public /* synthetic */ lk50 b;

    @Override // defpackage.gaj
    public final Object invoke(Pair<? extends lk50<? extends AliasCodeList>, ? extends lk50<? extends j8c>> pair, lk50<? extends sbc.a> lk50Var, v1b<? super bxg0<? extends lk50<? extends AliasCodeList>, ? extends lk50<? extends j8c>, ? extends lk50<? extends sbc.a>>> v1bVar) {
        ubc ubcVar = new ubc(3, v1bVar);
        ubcVar.a = pair;
        ubcVar.b = lk50Var;
        return ubcVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Pair pair = this.a;
        lk50 lk50Var = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new bxg0((lk50) pair.a, (lk50) pair.b, lk50Var);
    }
}
