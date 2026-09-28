package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.b;
import kotlin.coroutines.d;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
public abstract class k5b extends kotlin.coroutines.a implements d {
    public static final a a = new a(d.n, new j5b(0));

    public static final class a extends b<d, k5b> {
    }

    public k5b() {
        super(d.n);
    }

    @Override // kotlin.coroutines.d
    public final yre Y(x1b x1bVar) {
        return new yre(this, x1bVar);
    }

    @Override // kotlin.coroutines.d
    public final void c0(v1b<?> v1bVar) {
        Unsafe unsafe;
        long j;
        v1bVar.getClass();
        yre yreVar = (yre) v1bVar;
        do {
            unsafe = s0o.a;
            j = yre.v;
        } while (unsafe.getObjectVolatile(yreVar, j) == zre.b);
        Object objectVolatile = unsafe.getObjectVolatile(yreVar, j);
        bc6 bc6Var = objectVolatile instanceof bc6 ? (bc6) objectVolatile : null;
        if (bc6Var != null) {
            bc6Var.l();
        }
    }

    public abstract void d0(CoroutineContext coroutineContext, Runnable runnable);

    public void e0(CoroutineContext coroutineContext, Runnable runnable) {
        zre.c(this, coroutineContext, runnable);
    }

    public boolean f0(CoroutineContext coroutineContext) {
        return !(this instanceof hdh0);
    }

    public k5b g0(int i) {
        wcs.a(i);
        return new vcs(this, i);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to k5b for r3v3 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    public final <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.a<E> r4) {
        /*
            r3 = this;
            r4.getClass()
            boolean r0 = r4 instanceof kotlin.coroutines.b
            r1 = 0
            if (r0 == 0) goto L24
            kotlin.coroutines.b r4 = (kotlin.coroutines.b) r4
            kotlin.coroutines.CoroutineContext$a r0 = r3.getKey()
            r0.getClass()
            if (r0 == r4) goto L19
            kotlin.coroutines.CoroutineContext$a<?> r2 = r4.b
            if (r2 != r0) goto L18
            goto L19
        L18:
            return r1
        L19:
            kotlin.jvm.functions.Function1<kotlin.coroutines.CoroutineContext$Element, E extends B> r4 = r4.a
            java.lang.Object r3 = r4.invoke(r3)
            kotlin.coroutines.CoroutineContext$Element r3 = (kotlin.coroutines.CoroutineContext.Element) r3
            if (r3 == 0) goto L29
            return r3
        L24:
            kotlin.coroutines.d$a r0 = kotlin.coroutines.d.n
            if (r0 != r4) goto L29
            return r3
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k5b.get(kotlin.coroutines.CoroutineContext$a):kotlin.coroutines.CoroutineContext$Element");
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to k5b for r2v3 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    public final kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.a<?> r3) {
        /*
            r2 = this;
            r3.getClass()
            boolean r0 = r3 instanceof kotlin.coroutines.b
            if (r0 == 0) goto L25
            kotlin.coroutines.b r3 = (kotlin.coroutines.b) r3
            kotlin.coroutines.CoroutineContext$a r0 = r2.getKey()
            r0.getClass()
            if (r0 == r3) goto L18
            kotlin.coroutines.CoroutineContext$a<?> r1 = r3.b
            if (r1 != r0) goto L17
            goto L18
        L17:
            return r2
        L18:
            kotlin.jvm.functions.Function1<kotlin.coroutines.CoroutineContext$Element, E extends B> r3 = r3.a
            java.lang.Object r3 = r3.invoke(r2)
            kotlin.coroutines.CoroutineContext$Element r3 = (kotlin.coroutines.CoroutineContext.Element) r3
            if (r3 == 0) goto L2b
            kotlin.coroutines.e r2 = kotlin.coroutines.e.a
            return r2
        L25:
            kotlin.coroutines.d$a r0 = kotlin.coroutines.d.n
            if (r0 != r3) goto L2b
            kotlin.coroutines.e r2 = kotlin.coroutines.e.a
        L2b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k5b.minusKey(kotlin.coroutines.CoroutineContext$a):kotlin.coroutines.CoroutineContext");
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + x2d.b(this);
    }
}
