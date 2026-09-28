package defpackage;

import com.sportygames.commons.remote.model.ResultWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.commons.repositories.BaseRepository$safeApiCall$2", f = "BaseRepository.kt", l = {29}, m = "invokeSuspend", v = 1)
public final class a52 extends tje0 implements Function2<v5b, v1b<? super ResultWrapper<Object>>, Object> {
    public int a;
    public final /* synthetic */ Function1<v1b<Object>, Object> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a52(Function1<? super v1b<Object>, ? extends Object> function1, v1b<? super a52> v1bVar) {
        super(2, v1bVar);
        this.b = function1;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new a52(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super ResultWrapper<Object>> v1bVar) {
        return ((a52) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            Object objA = i52.a.a(this.b, this);
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
