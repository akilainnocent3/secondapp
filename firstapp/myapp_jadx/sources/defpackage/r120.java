package defpackage;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class r120 {
    public final int a;
    public final Function0<vp60> b;
    public final ReentrantLock c = new ReentrantLock();
    public int d;
    public boolean e;
    public final ava[] f;
    public final bc80 g;
    public final do7<ava> h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [E[], java.lang.Object[]] */
    public r120(int i, Function0<? extends vp60> function0) {
        this.a = i;
        this.b = function0;
        this.f = new ava[i];
        this.g = cc80.a(i);
        do7<ava> do7Var = new do7<>();
        if (i < 1) {
            hb5.a("capacity must be >= 1");
            throw null;
        }
        if (i > 1073741824) {
            hb5.a("capacity must be <= 2^30");
            throw null;
        }
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        do7Var.d = i - 1;
        do7Var.a = new Object[i];
        this.h = do7Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(x1b x1bVar) {
        n120 n120Var;
        do7<ava> do7Var = this.h;
        if (x1bVar instanceof n120) {
            n120Var = (n120) x1bVar;
            int i = n120Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                n120Var.c = i - Integer.MIN_VALUE;
            } else {
                n120Var = new n120(this, x1bVar);
            }
        } else {
            n120Var = new n120(this, x1bVar);
        }
        Object obj = n120Var.a;
        y5b y5bVar = y5b.a;
        int i2 = n120Var.c;
        bc80 bc80Var = this.g;
        if (i2 == 0) {
            uj50.b(obj);
            n120Var.c = 1;
            if (bc80Var.a(n120Var) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        try {
            ReentrantLock reentrantLock = this.c;
            reentrantLock.lock();
            try {
                if (this.e) {
                    up60.b(21, "Connection pool is closed");
                    throw null;
                }
                if (do7Var.b == do7Var.c && this.d < this.a) {
                    ava avaVar = new ava(this.b.invoke());
                    ava[] avaVarArr = this.f;
                    int i3 = this.d;
                    this.d = i3 + 1;
                    avaVarArr[i3] = avaVar;
                    do7Var.a(avaVar);
                }
                int i4 = do7Var.b;
                if (i4 == do7Var.c) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                ava[] avaVarArr2 = do7Var.a;
                ava avaVar2 = avaVarArr2[i4];
                avaVarArr2[i4] = null;
                do7Var.b = (i4 + 1) & do7Var.d;
                ava avaVar3 = avaVar2;
                reentrantLock.unlock();
                return avaVar3;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            bc80Var.c();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0055 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x006d A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:29:0x0069, B:31:0x006d, B:35:0x0075, B:39:0x007c), top: B:44:0x0069 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0073  */
    /* JADX WARN: Code duplicated, block: B:35:0x0075 A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:29:0x0069, B:31:0x006d, B:35:0x0075, B:39:0x007c), top: B:44:0x0069 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0079 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x007c A[Catch: all -> 0x0071, TRY_LEAVE, TryCatch #0 {all -> 0x0071, blocks: (B:29:0x0069, B:31:0x006d, B:35:0x0075, B:39:0x007c), top: B:44:0x0069 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0056 -> B:24:0x0058). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(long r9, defpackage.tua r11, defpackage.x1b r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof defpackage.o120
            if (r0 == 0) goto L13
            r0 = r12
            o120 r0 = (defpackage.o120) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            o120 r0 = new o120
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.d
            y5b r1 = defpackage.y5b.a
            int r2 = r0.f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L30
            long r9 = r0.a
            dq40 r11 = r0.c
            kotlin.jvm.functions.Function0 r2 = r0.b
            defpackage.uj50.b(r12)     // Catch: java.lang.Throwable -> L2e
            goto L58
        L2e:
            r12 = move-exception
            goto L64
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r4
        L36:
            defpackage.uj50.b(r12)
        L39:
            dq40 r12 = new dq40
            r12.<init>()
            p120 r2 = new p120     // Catch: java.lang.Throwable -> L62
            r2.<init>(r12, r8, r4)     // Catch: java.lang.Throwable -> L62
            r0.b = r11     // Catch: java.lang.Throwable -> L62
            r0.c = r12     // Catch: java.lang.Throwable -> L62
            r0.a = r9     // Catch: java.lang.Throwable -> L62
            r0.f = r3     // Catch: java.lang.Throwable -> L62
            long r5 = defpackage.hkd.e(r9)     // Catch: java.lang.Throwable -> L62
            java.lang.Object r2 = defpackage.vxf0.b(r5, r2, r0)     // Catch: java.lang.Throwable -> L62
            if (r2 != r1) goto L56
            return r1
        L56:
            r2 = r11
            r11 = r12
        L58:
            r12 = r11
            r11 = r2
            r2 = r0
            r0 = r4
            goto L69
        L5d:
            r7 = r2
            r2 = r11
            r11 = r12
            r12 = r7
            goto L64
        L62:
            r2 = move-exception
            goto L5d
        L64:
            r7 = r12
            r12 = r11
            r11 = r2
            r2 = r0
            r0 = r7
        L69:
            boolean r5 = r0 instanceof defpackage.txf0     // Catch: java.lang.Throwable -> L71
            if (r5 == 0) goto L73
            r11.invoke()     // Catch: java.lang.Throwable -> L71
            goto L7a
        L71:
            r9 = move-exception
            goto L7d
        L73:
            if (r0 != 0) goto L7c
            T r12 = r12.a     // Catch: java.lang.Throwable -> L71
            if (r12 == 0) goto L7a
            return r12
        L7a:
            r0 = r2
            goto L39
        L7c:
            throw r0     // Catch: java.lang.Throwable -> L71
        L7d:
            T r10 = r12.a
            ava r10 = (defpackage.ava) r10
            if (r10 == 0) goto L86
            r8.e(r10)
        L86:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r120.b(long, tua, x1b):java.lang.Object");
    }

    public final void c() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.e = true;
            for (ava avaVar : this.f) {
                if (avaVar != null) {
                    avaVar.close();
                }
            }
            Unit unit = Unit.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(StringBuilder sb) {
        do7<ava> do7Var = this.h;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            ngs ngsVarB = a.b();
            int i = (do7Var.c - do7Var.b) & do7Var.d;
            for (int i2 = 0; i2 < i; i2++) {
                if (i2 >= 0) {
                    int i3 = do7Var.c;
                    int i4 = do7Var.b;
                    int i5 = do7Var.d;
                    if (i2 < ((i3 - i4) & i5)) {
                        ava avaVar = do7Var.a[(i4 + i2) & i5];
                        avaVar.getClass();
                        ngsVarB.add(avaVar);
                    }
                }
                throw new ArrayIndexOutOfBoundsException();
            }
            ngs ngsVarA = a.a(ngsVarB);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.a + ", ");
            sb.append("permits=" + Math.max(s0o.a.getIntVolatile(this.g, xb80.f), 0) + ", ");
            sb.append("queue=(size=" + ngsVarA.getB() + ")[" + CollectionsKt.a0(ngsVarA, null, null, null, null, 63) + ']');
            sb.append(")");
            sb.append('\n');
            ava[] avaVarArr = this.f;
            int length = avaVarArr.length;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                ava avaVar2 = avaVarArr[i7];
                i6++;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\t\t[");
                sb2.append(i6);
                sb2.append("] - ");
                sb2.append(avaVar2 != null ? avaVar2.a.toString() : null);
                sb.append(sb2.toString());
                sb.append('\n');
                if (avaVar2 != null) {
                    avaVar2.g(sb);
                }
            }
            Unit unit = Unit.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void e(ava avaVar) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.h.a(avaVar);
            Unit unit = Unit.a;
            reentrantLock.unlock();
            this.g.c();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
