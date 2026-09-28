package defpackage;

import kotlin.jvm.functions.Function2;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes8.dex */
public final class vxf0 {

    @c0d(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", l = {HttpStatusCodesKt.HTTP_PROCESSING}, m = "withTimeoutOrNull")
    public static final class a<T> extends x1b {
        public dq40 a;
        public /* synthetic */ Object b;
        public int c;

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.c |= Integer.MIN_VALUE;
            return vxf0.c(0L, null, this);
        }
    }

    public static final <U, T extends U> Object a(uxf0<U, ? super T> uxf0Var, Function2<? super v5b, ? super v1b<? super T>, ? extends Object> function2) {
        i9p.g(uxf0Var, new hte(hkd.d(uxf0Var.e.getContext()).m(uxf0Var.f, uxf0Var, uxf0Var.d)));
        return mdh0.a(uxf0Var, false, uxf0Var, function2);
    }

    public static final <T> Object b(long j, Function2<? super v5b, ? super v1b<? super T>, ? extends Object> function2, v1b<? super T> v1bVar) {
        if (j <= 0) {
            throw new txf0("Timed out immediately", null);
        }
        Object objA = a(new uxf0(j, v1bVar), function2);
        y5b y5bVar = y5b.a;
        return objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, uxf0] */
    public static final <T> Object c(long j, Function2<? super v5b, ? super v1b<? super T>, ? extends Object> function2, v1b<? super T> v1bVar) {
        a aVar;
        dq40 dq40Var;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.c = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(v1bVar);
            }
        } else {
            aVar = new a(v1bVar);
        }
        Object obj = aVar.b;
        y5b y5bVar = y5b.a;
        int i2 = aVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            if (j > 0) {
                dq40 dq40Var2 = new dq40();
                try {
                    aVar.a = dq40Var2;
                    aVar.c = 1;
                    ?? r2 = (T) new uxf0(j, aVar);
                    dq40Var2.a = r2;
                    Object objA = a(r2, function2);
                    return objA == y5bVar ? y5bVar : objA;
                } catch (txf0 e) {
                    e = e;
                    dq40Var = dq40Var2;
                }
            }
            return null;
        }
        if (i2 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dq40Var = aVar.a;
        try {
            uj50.b(obj);
            return obj;
        } catch (txf0 e2) {
            e = e2;
        }
        if (e.a != dq40Var.a) {
            throw e;
        }
        return null;
    }

    public static final <T> Object d(long j, Function2<? super v5b, ? super v1b<? super T>, ? extends Object> function2, v1b<? super T> v1bVar) {
        return c(hkd.e(j), function2, v1bVar);
    }
}
