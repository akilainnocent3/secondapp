package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.gift.gift.data.repository.GiftRepositoryImpl$getLastApiCheckYearMonth$2", f = "GiftRepositoryImpl.kt", l = {94}, m = "invokeSuspend", v = 2)
public final class erk extends tje0 implements Function2<v5b, v1b<? super String>, Object> {
    public int a;
    public final /* synthetic */ jrk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public erk(jrk jrkVar, v1b<? super erk> v1bVar) {
        super(2, v1bVar);
        this.b = jrkVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new erk(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super String> v1bVar) {
        return ((erk) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        ldt ldtVar = this.b.b;
        this.a = 1;
        hqk hqkVar = ldtVar.a;
        Object objE = hqkVar.c.a(hqkVar, hqk.f[1]).e(this, "");
        return objE == y5bVar ? y5bVar : objE;
    }
}
