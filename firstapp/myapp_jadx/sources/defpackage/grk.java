package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.gift.gift.data.repository.GiftRepositoryImpl$getPendingIntroPopup$2", f = "GiftRepositoryImpl.kt", l = {HttpStatusCodesKt.HTTP_PROCESSING}, m = "invokeSuspend", v = 2)
public final class grk extends tje0 implements Function2<v5b, v1b<? super Boolean>, Object> {
    public int a;
    public final /* synthetic */ jrk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public grk(jrk jrkVar, v1b<? super grk> v1bVar) {
        super(2, v1bVar);
        this.b = jrkVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new grk(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Boolean> v1bVar) {
        return ((grk) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
        Object objE = hqkVar.d.a(hqkVar, hqk.f[2]).e(this, Boolean.FALSE);
        return objE == y5bVar ? y5bVar : objE;
    }
}
