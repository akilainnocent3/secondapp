package kr;

import cs.j;
import dr.w2;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import oy.l;
import oy.m;
import ur.f;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@j(name = "ThreadsKt")
@s1({"SMAP\nThread.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Thread.kt\nkotlin/concurrent/ThreadsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
public final class b {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ds.a<w2> f102870b;

        public a(ds.a<w2> aVar) {
            this.f102870b = aVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f102870b.invoke();
        }
    }

    @f
    public static final <T> T a(ThreadLocal<T> threadLocal, ds.a<? extends T> aVar) {
        m0.p(threadLocal, "<this>");
        m0.p(aVar, "default");
        T t10 = threadLocal.get();
        if (t10 != null) {
            return t10;
        }
        T tInvoke = aVar.invoke();
        threadLocal.set(tInvoke);
        return tInvoke;
    }

    @l
    public static final Thread b(boolean z10, boolean z11, @m ClassLoader classLoader, @m String str, int i10, @l ds.a<w2> block) {
        m0.p(block, "block");
        a aVar = new a(block);
        if (z11) {
            aVar.setDaemon(true);
        }
        if (i10 > 0) {
            aVar.setPriority(i10);
        }
        if (str != null) {
            aVar.setName(str);
        }
        if (classLoader != null) {
            aVar.setContextClassLoader(classLoader);
        }
        if (z10) {
            aVar.start();
        }
        return aVar;
    }

    public static /* synthetic */ Thread c(boolean z10, boolean z11, ClassLoader classLoader, String str, int i10, ds.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            classLoader = null;
        }
        if ((i11 & 8) != 0) {
            str = null;
        }
        if ((i11 & 16) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        String str2 = str;
        return b(z10, z11, classLoader, str2, i12, aVar);
    }
}
