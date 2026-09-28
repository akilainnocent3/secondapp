package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.language.LanguageUtil$getRefreshLanguageTime$2", f = "LanguageUtil.kt", l = {88}, m = "invokeSuspend", v = 2)
public final class gmr extends tje0 implements Function2<v5b, v1b<? super Long>, Object> {
    public int a;
    public final /* synthetic */ jmr b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmr(jmr jmrVar, String str, v1b v1bVar) {
        super(2, v1bVar);
        this.b = jmrVar;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new gmr(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Long> v1bVar) {
        return ((gmr) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
        m2l m2lVar = this.b.a;
        this.a = 1;
        Object obj2 = m2lVar.a.getLong(this.c, 0L, this);
        return obj2 == y5bVar ? y5bVar : obj2;
    }
}
