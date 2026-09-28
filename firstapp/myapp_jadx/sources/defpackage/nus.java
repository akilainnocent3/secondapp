package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.repository.livestream.LiveStreamRepositoryImpl$hasCompletedFirstTimeDeposit$2", f = "LiveStreamRepositoryImpl.kt", l = {16}, m = "invokeSuspend", v = 2)
public final class nus extends tje0 implements Function2<v5b, v1b<? super Boolean>, Object> {
    public int a;
    public final /* synthetic */ pus b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nus(pus pusVar, v1b<? super nus> v1bVar) {
        super(2, v1bVar);
        this.b = pusVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new nus(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Boolean> v1bVar) {
        return ((nus) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
        jus jusVar = this.b.a;
        wm20 wm20VarA = jusVar.b.a(jusVar, jus.c[0]);
        Boolean bool = Boolean.FALSE;
        this.a = 1;
        Object objE = wm20VarA.e(this, bool);
        return objE == y5bVar ? y5bVar : objE;
    }
}
