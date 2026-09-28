package defpackage;

import java.util.concurrent.RejectedExecutionException;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qv50 {

    @c0d(c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1", f = "RoomDatabase.android.kt", l = {2058}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<Object>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ Function1<v1b<Object>, Object> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super v1b<Object>, ? extends Object> function1, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = function1;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<Object> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
            if (((v5b) this.b).getCoroutineContext().get(fqg0.b) == null) {
                ib5.a("Expected a TransactionElement in the CoroutineContext but none was found.");
                return null;
            }
            this.a = 1;
            Object objInvoke = this.c.invoke(this);
            return objInvoke == y5bVar ? y5bVar : objInvoke;
        }
    }

    public static final Object a(v1b v1bVar, lv50 lv50Var, Function1 function1) {
        if (lv50Var.p() && lv50Var.t() && lv50Var.q()) {
            return function1.invoke(v1bVar);
        }
        return v1bVar.getContext().get(rv50.a) == null ? function1.invoke(v1bVar) : c(v1bVar, lv50Var, function1);
    }

    public static final Object b(lv50 lv50Var, Function1 function1, x1b x1bVar) {
        return c(x1bVar, lv50Var, new pv50(null, lv50Var, function1));
    }

    public static final Object c(v1b v1bVar, lv50 lv50Var, Function1 function1) {
        a aVar = new a(function1, null);
        fqg0 fqg0Var = (fqg0) v1bVar.getContext().get(fqg0.b);
        d dVar = fqg0Var != null ? fqg0Var.a : null;
        if (dVar != null) {
            return ej5.d(dVar, aVar, v1bVar);
        }
        bc6 bc6Var = new bc6(1, yzo.b(v1bVar));
        bc6Var.q();
        try {
            hqg0 hqg0Var = lv50Var.d;
            if (hqg0Var == null) {
                Intrinsics.n("internalTransactionExecutor");
                throw null;
            }
            hqg0Var.execute(new ov50(bc6Var, lv50Var, aVar));
            Object objO = bc6Var.o();
            y5b y5bVar = y5b.a;
            return objO;
        } catch (RejectedExecutionException e) {
            bc6Var.cancel(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e));
        }
    }
}
