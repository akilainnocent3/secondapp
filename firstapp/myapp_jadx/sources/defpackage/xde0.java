package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class xde0<T> implements myh<T> {
    public final myh<T> a;
    public final ks5 b;

    public xde0(myh myhVar, ks5 ks5Var) {
        this.a = myhVar;
        this.b = ks5Var;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        if (((defpackage.xde0) r8).c(r0) == r1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.x1b r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.wde0
            if (r0 == 0) goto L13
            r0 = r9
            wde0 r0 = (defpackage.wde0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            wde0 r0 = new wde0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.c
            y5b r1 = defpackage.y5b.a
            int r2 = r0.e
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            defpackage.uj50.b(r9)
            goto L72
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r3
        L31:
            kr60 r8 = r0.b
            xde0 r2 = r0.a
            defpackage.uj50.b(r9)     // Catch: java.lang.Throwable -> L39
            goto L5a
        L39:
            r9 = move-exception
            goto L7c
        L3b:
            defpackage.uj50.b(r9)
            kr60 r9 = new kr60
            myh<T> r2 = r8.a
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            r9.<init>(r2, r6)
            ks5 r2 = r8.b     // Catch: java.lang.Throwable -> L78
            r0.a = r8     // Catch: java.lang.Throwable -> L78
            r0.b = r9     // Catch: java.lang.Throwable -> L78
            r0.e = r5     // Catch: java.lang.Throwable -> L78
            java.lang.Object r2 = r2.invoke(r9, r0)     // Catch: java.lang.Throwable -> L78
            if (r2 != r1) goto L58
            goto L71
        L58:
            r2 = r8
            r8 = r9
        L5a:
            r8.releaseIntercepted()
            myh<T> r8 = r2.a
            boolean r9 = r8 instanceof defpackage.xde0
            if (r9 == 0) goto L75
            xde0 r8 = (defpackage.xde0) r8
            r0.a = r3
            r0.b = r3
            r0.e = r4
            java.lang.Object r8 = r8.c(r0)
            if (r8 != r1) goto L72
        L71:
            return r1
        L72:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L75:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L78:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        L7c:
            r8.releaseIntercepted()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xde0.c(x1b):java.lang.Object");
    }

    @Override // defpackage.myh
    public final Object emit(T t, v1b<? super Unit> v1bVar) {
        return this.a.emit(t, v1bVar);
    }
}
