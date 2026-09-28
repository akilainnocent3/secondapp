package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.CustomCodeViewModel$createCustomCode$2", f = "CustomCodeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class scc extends tje0 implements Function2<Pair<? extends String, ? extends String>, v1b<? super lyh<? extends lk50<? extends Pair<? extends String, ? extends String>>>>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ bdc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public scc(bdc bdcVar, v1b<? super scc> v1bVar) {
        super(2, v1bVar);
        this.b = bdcVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        scc sccVar = new scc(this.b, v1bVar);
        sccVar.a = obj;
        return sccVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Pair<? extends String, ? extends String> pair, v1b<? super lyh<? extends lk50<? extends Pair<? extends String, ? extends String>>>> v1bVar) {
        return ((scc) create(pair, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Pair pair = (Pair) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        String str = (String) pair.a;
        String str2 = (String) pair.b;
        bdc bdcVar = this.b;
        bdcVar.getClass();
        return new or60(new vcc(bdcVar, str, str2, null));
    }
}
