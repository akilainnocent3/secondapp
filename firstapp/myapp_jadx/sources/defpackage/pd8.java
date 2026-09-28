package defpackage;

import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.room.paging.CommonLimitOffsetImpl$1", f = "LimitOffsetPagingSource.kt", l = {84}, m = "invokeSuspend")
public final class pd8 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ud8<Object> b;

    public static final class a<T> implements myh {
        public final /* synthetic */ ud8<Object> a;

        public a(ud8<Object> ud8Var) {
            this.a = ud8Var;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            ud8<Object> ud8Var = this.a;
            xbs<Object> xbsVar = ud8Var.b;
            if (xbsVar.a.e) {
                throw new CancellationException("PagingSource is invalid");
            }
            if (ud8Var.g.get()) {
                xbsVar.c();
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd8(ud8<Object> ud8Var, v1b<? super pd8> v1bVar) {
        super(2, v1bVar);
        this.b = ud8Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new pd8(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((pd8) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ud8<Object> ud8Var = this.b;
            o0p o0pVarJ = ud8Var.d.j();
            String[] strArr = ud8Var.a;
            lyh<Set<String>> lyhVarA = o0pVarJ.a((String[]) Arrays.copyOf(strArr, strArr.length), false);
            a aVar = new a(ud8Var);
            this.a = 1;
            if (((d3) lyhVarA).collect(aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
