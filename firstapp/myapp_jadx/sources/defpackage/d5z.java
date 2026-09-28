package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public interface d5z {
    static Object S(d5z d5zVar, qd4.c cVar, j6c j6cVar, Object obj, Function0 function0, Function0 function1, Function1 function2, tje0 tje0Var) {
        return d5zVar.n1(cVar, j6cVar, obj, function0, function1, function2, new b5z(0, d5zVar, d5z.class, "verifyUsingBiometric", "verifyUsingBiometric()Lkotlinx/coroutines/flow/Flow;", 0), tje0Var);
    }

    lyh<lk50<Unit>> C();

    <T> void K0(int i, T t, Function1<? super j7z.b<? extends T>, Unit> function1);

    Object P0(boolean z, v1b<? super nc4> v1bVar);

    void Y(int i, cp50 cp50Var, Function1<? super wo50.b, Unit> function1);

    void e1();

    <T> Object n1(qd4.c cVar, j6c j6cVar, T t, Function0<Unit> function0, Function0<Unit> function1, Function1<? super j7z.b<? extends T>, Unit> function2, Function0<? extends lyh<? extends lk50<Unit>>> function3, v1b<? super Unit> v1bVar);

    Object t(qd4.c cVar, j6c j6cVar, cp50 cp50Var, Function0<Unit> function0, Function0<Unit> function1, Function1<? super wo50.b, Unit> function2, Function0<? extends lyh<? extends lk50<Unit>>> function3, v1b<? super Unit> v1bVar);
}
