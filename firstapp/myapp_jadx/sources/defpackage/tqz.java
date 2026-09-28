package defpackage;

import android.os.Build;
import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.paging.PagingDataPresenter$collectFrom$2", f = "PagingDataPresenter.kt", l = {121}, m = "invokeSuspend")
public final class tqz extends tje0 implements Function1<v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ rqz<Object> b;
    public final /* synthetic */ kqz<Object> c;

    public static final class a<T> implements myh {
        public final /* synthetic */ rqz<T> a;
        public final /* synthetic */ kqz<T> b;

        public a(rqz<T> rqzVar, kqz<T> kqzVar) {
            this.a = rqzVar;
            this.b = kqzVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            xmz xmzVar = (xmz) obj;
            if (Build.ID != null && Log.isLoggable("Paging", 2)) {
                Log.v("Paging", "Collected " + xmzVar, null);
            }
            rqz<T> rqzVar = this.a;
            Object objD = ej5.d(rqzVar.a, new sqz(xmzVar, rqzVar, this.b, null), v1bVar);
            return objD == y5b.a ? objD : Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tqz(rqz<Object> rqzVar, kqz<Object> kqzVar, v1b<? super tqz> v1bVar) {
        super(1, v1bVar);
        this.b = rqzVar;
        this.c = kqzVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new tqz(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Unit> v1bVar) {
        return ((tqz) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            kqz<Object> kqzVar = this.c;
            rch0 rch0Var = kqzVar.b;
            rqz<Object> rqzVar = this.b;
            rch0 rch0Var2 = rqzVar.c;
            rqzVar.c = rch0Var;
            if (rch0Var2 instanceof rqz.b) {
                rqz.b bVar = (rqz.b) rch0Var2;
                if (bVar.a) {
                    rch0Var.retry();
                }
                if (bVar.b) {
                    rch0Var.c();
                }
            }
            lyh<xmz<Object>> lyhVar = kqzVar.a;
            a aVar = new a(rqzVar, kqzVar);
            this.a = 1;
            if (lyhVar.collect(aVar, this) == y5bVar) {
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
