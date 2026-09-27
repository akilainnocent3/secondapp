package g0;

import kotlin.jvm.internal.j0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@s1({"SMAP\nLockExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockExt.kt\nandroidx/collection/internal/LockExtKt\n+ 2 Lock.jvm.kt\nandroidx/collection/internal/Lock\n*L\n1#1,29:1\n26#2:30\n*S KotlinDebug\n*F\n+ 1 LockExt.kt\nandroidx/collection/internal/LockExtKt\n*L\n27#1:30\n*E\n"})
public final class c {
    public static final <T> T a(@l b bVar, @l ds.a<? extends T> block) {
        T tInvoke;
        m0.p(bVar, "<this>");
        m0.p(block, "block");
        synchronized (bVar) {
            try {
                tInvoke = block.invoke();
                j0.d(1);
            } finally {
                j0.d(1);
                j0.c(1);
            }
        }
        return tInvoke;
    }
}
