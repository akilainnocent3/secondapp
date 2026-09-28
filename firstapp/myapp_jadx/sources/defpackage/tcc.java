package defpackage;

import com.sportybet.android.social.data.remote.entity.AliasCodeList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.CustomCodeViewModel$createCustomCode$3", f = "CustomCodeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class tcc extends tje0 implements Function2<lk50<? extends Pair<? extends String, ? extends String>>, v1b<? super lyh<? extends lk50<? extends AliasCodeList>>>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ bdc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tcc(bdc bdcVar, v1b<? super tcc> v1bVar) {
        super(2, v1bVar);
        this.b = bdcVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        tcc tccVar = new tcc(this.b, v1bVar);
        tccVar.a = obj;
        return tccVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends Pair<? extends String, ? extends String>> lk50Var, v1b<? super lyh<? extends lk50<? extends AliasCodeList>>> v1bVar) {
        return ((tcc) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (lk50Var instanceof lk50.c) {
            Pair pair = (Pair) ((lk50.c) lk50Var).a;
            return bm50.a(this.b.i.a((String) pair.a, (String) pair.b));
        }
        if (lk50Var instanceof lk50.a) {
            return new gzh(lk50Var);
        }
        if (lk50Var instanceof lk50.b) {
            return new gzh(lk50Var);
        }
        uhc.a();
        return null;
    }
}
