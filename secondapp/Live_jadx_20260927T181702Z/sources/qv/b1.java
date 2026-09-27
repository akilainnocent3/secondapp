package qv;

import jv.j2;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@s1({"SMAP\nSynchronized.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 2 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,30:1\n16#2:31\n*S KotlinDebug\n*F\n+ 1 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n*L\n28#1:31\n*E\n"})
public final class b1 {
    @j2
    public static final <T> T a(@oy.l Object obj, @oy.l ds.a<? extends T> aVar) {
        T tInvoke;
        synchronized (obj) {
            try {
                tInvoke = aVar.invoke();
                kotlin.jvm.internal.j0.d(1);
            } finally {
                kotlin.jvm.internal.j0.d(1);
                kotlin.jvm.internal.j0.c(1);
            }
        }
        return tInvoke;
    }
}
