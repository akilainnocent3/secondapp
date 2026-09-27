package b9;

import jv.r3;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class j {
    @l
    public static final <T> or.j.b b(@l ThreadLocal<T> threadLocal, T t10) {
        m0.p(threadLocal, "<this>");
        return r3.a(threadLocal, t10);
    }

    public static final long c() {
        return Thread.currentThread().getId();
    }

    public static /* synthetic */ void a() {
    }
}
