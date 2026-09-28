package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.chat.data.repository.BaseRepository$safeApiCall$2", f = "BaseRepository.kt", l = {29}, m = "invokeSuspend", v = 1)
public final class b52 extends tje0 implements Function2<v5b, v1b<? super jk50<Object>>, Object> {
    public int a;
    public final /* synthetic */ j52 b;
    public final /* synthetic */ Function1<v1b<Object>, Object> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b52(j52 j52Var, v1b v1bVar, Function1 function1) {
        super(2, v1bVar);
        this.b = j52Var;
        this.c = function1;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new b52(this.b, v1bVar, this.c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super jk50<Object>> v1bVar) {
        return ((b52) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            Object objA = this.b.a(this.c, this);
            return objA == y5bVar ? y5bVar : objA;
        }
        if (i == 1) {
            uj50.b(obj);
            return obj;
        }
        ib5.a("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
