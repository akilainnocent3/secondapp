package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class xjh0 {
    public final i6u a;
    public final b8k b;
    public final fjr c;
    public final k5b d;

    public interface a {

        /* JADX INFO: renamed from: xjh0$a$a, reason: collision with other inner class name */
        public static final class C1292a implements a {
            public final erq a;

            public C1292a(erq erqVar) {
                this.a = erqVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1292a) && this.a.equals(((C1292a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Failed(lottery=" + this.a + ")";
            }
        }

        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1596263545;
            }

            public final String toString() {
                return "Loading";
            }
        }

        public static final class c implements a {
            public final long a;

            public c(long j) {
                this.a = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.a == ((c) obj).a;
            }

            public final int hashCode() {
                return Long.hashCode(this.a);
            }

            public final String toString() {
                return d020.a(this.a, "Success(drawTime=", ")");
            }
        }
    }

    public xjh0(i6u i6uVar, b8k b8kVar, fjr fjrVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar) {
        i6uVar.getClass();
        fjrVar.getClass();
        this.a = i6uVar;
        this.b = b8kVar;
        this.c = fjrVar;
        this.d = k5bVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0039 A[PHI: r6
      0x0039: PHI (r6v2 a390) = (r6v1 a390), (r6v3 a390) binds: [B:16:0x0036, B:25:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0056 A[PHI: r6 r7
      0x0056: PHI (r6v3 a390) = (r6v2 a390), (r6v4 a390) binds: [B:18:0x0053, B:15:0x0030] A[DONT_GENERATE, DONT_INLINE]
      0x0056: PHI (r7v8 java.lang.Object) = (r7v7 java.lang.Object), (r7v1 java.lang.Object) binds: [B:18:0x0053, B:15:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0067 -> B:17:0x0039). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(defpackage.a390 r6, defpackage.x1b r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.akh0
            if (r0 == 0) goto L13
            r0 = r7
            akh0 r0 = (defpackage.akh0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            akh0 r0 = new akh0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            y5b r1 = defpackage.y5b.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L30
            if (r2 != r3) goto L29
            a390 r6 = r0.a
            goto L36
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            r5 = 0
            return r5
        L30:
            a390 r6 = r0.a
            defpackage.uj50.b(r7)
            goto L56
        L36:
            defpackage.uj50.b(r7)
        L39:
            i6u r7 = r5.a
            ts5 r7 = r7.k
            or60 r7 = r7.e()
            yzh r7 = defpackage.bm50.a(r7)
            k5b r2 = r5.d
            lyh r7 = defpackage.ozh.c(r7, r2)
            r0.a = r6
            r0.d = r4
            java.lang.Object r7 = defpackage.bm50.p(r7, r0)
            if (r7 != r1) goto L56
            goto L69
        L56:
            lk50 r7 = (defpackage.lk50) r7
            boolean r7 = r7 instanceof lk50.c
            if (r7 == 0) goto L5f
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        L5f:
            r0.a = r6
            r0.d = r3
            java.lang.Object r7 = defpackage.s0i.a(r6, r0)
            if (r7 != r1) goto L39
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xjh0.a(a390, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(a390 a390Var, x1b x1bVar) {
        bkh0 bkh0Var;
        if (x1bVar instanceof bkh0) {
            bkh0Var = (bkh0) x1bVar;
            int i = bkh0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bkh0Var.c = i - Integer.MIN_VALUE;
            } else {
                bkh0Var = new bkh0(this, x1bVar);
            }
        } else {
            bkh0Var = new bkh0(this, x1bVar);
        }
        Object obj = bkh0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = bkh0Var.c;
        if (i2 == 0) {
            uj50.b(obj);
            ckh0 ckh0Var = new ckh0(this, a390Var, null);
            bkh0Var.c = 1;
            if (w5b.d(ckh0Var, bkh0Var) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
