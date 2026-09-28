package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class ud8<Value> {
    public static final wqz.b.C1263b<Object, Object> i = new wqz.b.C1263b<>();
    public final String[] a;
    public final xbs<Value> b;
    public final xbs.a c;
    public final lv50 d;
    public final bw50 e;
    public final AtomicInteger f;
    public final AtomicBoolean g;
    public final jvd0 h;

    public ud8(String[] strArr, xbs xbsVar, xbs.a aVar) {
        this.a = strArr;
        this.b = xbsVar;
        this.c = aVar;
        lv50 lv50Var = xbsVar.c;
        this.d = lv50Var;
        this.e = xbsVar.b;
        this.f = new AtomicInteger(-1);
        this.g = new AtomicBoolean(false);
        this.h = ej5.c(lv50Var.i(), null, null, new pd8(this, null), 3);
        xbsVar.a.b(new Function0() { // from class: od8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                jvd0 jvd0Var = this.a.h;
                if (jvd0Var != null) {
                    jvd0Var.cancel((CancellationException) null);
                }
                return Unit.a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
    
        if (r8 == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(wqz.a r7, defpackage.x1b r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.rd8
            if (r0 == 0) goto L13
            r0 = r8
            rd8 r0 = (defpackage.rd8) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            rd8 r0 = new rd8
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            y5b r1 = defpackage.y5b.a
            int r2 = r0.c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L35
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            defpackage.uj50.b(r8)     // Catch: java.lang.Exception -> L71
            goto L6e
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r3
        L31:
            defpackage.uj50.b(r8)     // Catch: java.lang.Exception -> L71
            goto L59
        L35:
            defpackage.uj50.b(r8)
            java.util.concurrent.atomic.AtomicInteger r8 = r6.f
            int r8 = r8.get()
            r2 = -1
            if (r8 != r2) goto L65
            r0.c = r5     // Catch: java.lang.Exception -> L71
            lv50 r8 = r6.d     // Catch: java.lang.Exception -> L71
            v5b r8 = r8.i()     // Catch: java.lang.Exception -> L71
            j1b r8 = (defpackage.j1b) r8     // Catch: java.lang.Exception -> L71
            kotlin.coroutines.CoroutineContext r8 = r8.a     // Catch: java.lang.Exception -> L71
            qd8 r2 = new qd8     // Catch: java.lang.Exception -> L71
            r2.<init>(r6, r7, r3)     // Catch: java.lang.Exception -> L71
            java.lang.Object r8 = defpackage.ej5.d(r8, r2, r0)     // Catch: java.lang.Exception -> L71
            if (r8 != r1) goto L59
            goto L6d
        L59:
            r7 = r8
            wqz$b r7 = (wqz.b) r7     // Catch: java.lang.Exception -> L71
            java.util.concurrent.atomic.AtomicBoolean r6 = r6.g     // Catch: java.lang.Exception -> L71
            r7 = 0
            r6.compareAndSet(r7, r5)     // Catch: java.lang.Exception -> L71
            wqz$b r8 = (wqz.b) r8     // Catch: java.lang.Exception -> L71
            return r8
        L65:
            r0.c = r4     // Catch: java.lang.Exception -> L71
            java.lang.Object r8 = r6.b(r7, r8, r0)     // Catch: java.lang.Exception -> L71
            if (r8 != r1) goto L6e
        L6d:
            return r1
        L6e:
            wqz$b r8 = (wqz.b) r8     // Catch: java.lang.Exception -> L71
            return r8
        L71:
            r6 = move-exception
            wqz$b$a r7 = new wqz$b$a
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ud8.a(wqz$a, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        if (defpackage.ej5.d(r8, r9, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(wqz.a r7, int r8, defpackage.x1b r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.sd8
            if (r0 == 0) goto L13
            r0 = r9
            sd8 r0 = (defpackage.sd8) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            sd8 r0 = new sd8
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.b
            y5b r1 = defpackage.y5b.a
            int r2 = r0.d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            wqz$b r7 = r0.a
            defpackage.uj50.b(r9)
            goto L64
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r3
        L33:
            defpackage.uj50.b(r9)
            goto L47
        L37:
            defpackage.uj50.b(r9)
            r0.d = r5
            bw50 r9 = r6.e
            xbs$a r2 = r6.c
            java.lang.Object r9 = defpackage.zv50.a(r7, r9, r8, r2, r0)
            if (r9 != r1) goto L47
            goto L63
        L47:
            r7 = r9
            wqz$b r7 = (wqz.b) r7
            lv50 r8 = r6.d
            v5b r8 = r8.i()
            j1b r8 = (defpackage.j1b) r8
            kotlin.coroutines.CoroutineContext r8 = r8.a
            td8 r9 = new td8
            r9.<init>(r6, r3)
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = defpackage.ej5.d(r8, r9, r0)
            if (r8 != r1) goto L64
        L63:
            return r1
        L64:
            xbs<Value> r6 = r6.b
            h0p<kotlin.jvm.functions.Function0<kotlin.Unit>> r6 = r6.a
            boolean r6 = r6.e
            if (r6 == 0) goto L72
            wqz$b$b<java.lang.Object, java.lang.Object> r6 = defpackage.ud8.i
            r6.getClass()
            return r6
        L72:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ud8.b(wqz$a, int, x1b):java.lang.Object");
    }
}
