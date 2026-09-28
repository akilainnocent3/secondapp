package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.room.coroutines.PassthroughConnection$withTransaction$2", f = "PassthroughConnectionPool.kt", l = {HttpStatusCodesKt.HTTP_EARLY_HINTS}, m = "invokeSuspend")
public final class puz extends tje0 implements Function1<v1b<? super Object>, Object> {
    public int a;
    public final /* synthetic */ luz b;
    public final /* synthetic */ crg0.a c;
    public final /* synthetic */ Function2<sqg0<Object>, v1b<Object>, Object> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public puz(luz luzVar, crg0.a aVar, Function2<? super sqg0<Object>, ? super v1b<Object>, ? extends Object> function2, v1b<? super puz> v1bVar) {
        super(1, v1bVar);
        this.b = luzVar;
        this.c = aVar;
        this.d = function2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new puz(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Object> v1bVar) {
        return ((puz) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            Object objE = this.b.e(this.c, this.d, this);
            return objE == y5bVar ? y5bVar : objE;
        }
        if (i == 1) {
            uj50.b(obj);
            return obj;
        }
        ib5.a("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
