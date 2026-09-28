package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class zk4 implements rrm {
    public final yn4 a;
    public final srm b;
    public final prm c;
    public final qrm d;
    public final qym e;
    public final tuw f;
    public final wwd0 g;
    public long h;
    public boolean i;
    public boolean j;
    public boolean k;

    public static final class a {
        public final il4 a;
        public final List<tn4> b;

        public a(il4 il4Var, List<tn4> list) {
            il4Var.getClass();
            list.getClass();
            this.a = il4Var;
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("EngineUpdateResult(state=");
            sb.append(this.a);
            sb.append(", pendingEvents=");
            return o8i.a(sb, this.b, ')');
        }
    }

    @c0d(c = "com.sportygames.bonuscup.domain.manager.BonusCupGameManager", f = "BonusCupGameManager.kt", l = {152, 162, 165, 180, 183, 185}, m = "onEventAcknowledged", v = 1)
    public static final class b extends x1b {
        public fm4 a;
        public il4 b;
        public long c;
        public /* synthetic */ Object d;
        public int f;

        public b(v1b<? super b> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return zk4.this.g(null, this);
        }
    }

    @c0d(c = "com.sportygames.bonuscup.domain.manager.BonusCupGameManager", f = "BonusCupGameManager.kt", l = {134, 146, 148}, m = "onSpawnReceived", v = 1)
    public static final class c extends x1b {
        public yp40 a;
        public a b;
        public /* synthetic */ Object c;
        public int e;

        public c(v1b<? super c> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return zk4.this.c(null, this);
        }
    }

    public zk4(yn4 yn4Var, srm srmVar, prm prmVar, qrm qrmVar, qym qymVar) {
        yn4Var.getClass();
        srmVar.getClass();
        prmVar.getClass();
        qrmVar.getClass();
        qymVar.getClass();
        this.a = yn4Var;
        this.b = srmVar;
        this.c = prmVar;
        this.d = qrmVar;
        this.e = qymVar;
        this.f = uuw.a();
        this.g = xwd0.a(yn4Var.A);
        this.h = -1L;
    }

    @Override // defpackage.rrm
    public final v340 a() {
        return e1i.b(this.g);
    }

    @Override // defpackage.rrm
    public final Object b(tje0 tje0Var) {
        Object objN = n(new vk4(this, 0), tje0Var);
        return objN == y5b.a ? objN : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
    
        if (m(r9, r0) == r1) goto L31;
     */
    @Override // defpackage.rrm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(final defpackage.fm4 r9, defpackage.v1b<? super kotlin.Unit> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof zk4.c
            if (r0 == 0) goto L13
            r0 = r10
            zk4$c r0 = (zk4.c) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            zk4$c r0 = new zk4$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.c
            y5b r1 = defpackage.y5b.a
            int r2 = r0.e
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L40
            if (r2 == r5) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2e
            defpackage.uj50.b(r10)
            goto L83
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r6
        L34:
            zk4$a r9 = r0.b
            defpackage.uj50.b(r10)
            goto L73
        L3a:
            yp40 r9 = r0.a
            defpackage.uj50.b(r10)
            goto L5b
        L40:
            defpackage.uj50.b(r10)
            yp40 r10 = new yp40
            r10.<init>()
            qk4 r2 = new qk4
            r2.<init>()
            r0.a = r10
            r0.e = r5
            java.lang.Object r9 = r8.n(r2, r0)
            if (r9 != r1) goto L58
            goto L82
        L58:
            r7 = r10
            r10 = r9
            r9 = r7
        L5b:
            zk4$a r10 = (zk4.a) r10
            boolean r9 = r9.a
            if (r9 == 0) goto L74
            ep4 r9 = defpackage.ep4.b
            r0.a = r6
            r0.b = r10
            r0.e = r4
            qym r2 = r8.e
            java.lang.Object r9 = r2.a(r9, r0)
            if (r9 != r1) goto L72
            goto L82
        L72:
            r9 = r10
        L73:
            r10 = r9
        L74:
            il4 r9 = r10.a
            r0.a = r6
            r0.b = r6
            r0.e = r3
            java.lang.Object r8 = r8.m(r9, r0)
            if (r8 != r1) goto L83
        L82:
            return r1
        L83:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zk4.c(fm4, v1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009d, code lost:
    
        if (m(r14, r0) == r1) goto L48;
     */
    @Override // defpackage.rrm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(final float r13, defpackage.x1b r14) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zk4.d(float, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if (l(r9, r0) == r1) goto L21;
     */
    @Override // defpackage.rrm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(final defpackage.oh4 r9, defpackage.x1b r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.bl4
            if (r0 == 0) goto L13
            r0 = r10
            bl4 r0 = (defpackage.bl4) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            bl4 r0 = new bl4
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.b
            y5b r1 = defpackage.y5b.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            defpackage.uj50.b(r10)
            goto L68
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r5
        L31:
            oh4 r9 = r0.a
            defpackage.uj50.b(r10)
            goto L5b
        L37:
            defpackage.uj50.b(r10)
            r6 = -1
            r8.h = r6
            r10 = 0
            r8.i = r10
            r8.j = r10
            r8.k = r10
            prm r10 = r8.c
            java.lang.String r10 = r10.b()
            sk4 r2 = new sk4
            r2.<init>()
            r0.a = r9
            r0.d = r4
            java.lang.Object r10 = r8.n(r2, r0)
            if (r10 != r1) goto L5b
            goto L67
        L5b:
            long r9 = r9.a
            r0.a = r5
            r0.d = r3
            java.lang.Object r8 = r8.l(r9, r0)
            if (r8 != r1) goto L68
        L67:
            return r1
        L68:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zk4.e(oh4, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (m(r6, r0) == r1) goto L21;
     */
    @Override // defpackage.rrm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.km4 r6, defpackage.x1b r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.el4
            if (r0 == 0) goto L13
            r0 = r7
            el4 r0 = (defpackage.el4) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            el4 r0 = new el4
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            y5b r1 = defpackage.y5b.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            defpackage.uj50.b(r7)
            goto L54
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            r5 = 0
            return r5
        L31:
            defpackage.uj50.b(r7)
            goto L47
        L35:
            defpackage.uj50.b(r7)
            yk4 r7 = new yk4
            r2 = 0
            r7.<init>(r2, r5, r6)
            r0.c = r4
            java.lang.Object r7 = r5.n(r7, r0)
            if (r7 != r1) goto L47
            goto L53
        L47:
            zk4$a r7 = (zk4.a) r7
            il4 r6 = r7.a
            r0.c = r3
            java.lang.Object r5 = r5.m(r6, r0)
            if (r5 != r1) goto L54
        L53:
            return r1
        L54:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zk4.f(km4, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006f A[PHI: r6
      0x006f: PHI (r6v3 fm4) = (r6v1 fm4), (r6v6 fm4) binds: [B:22:0x006c, B:16:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    /* JADX WARN: Code duplicated, block: B:29:0x0084 A[PHI: r7
      0x0084: PHI (r7v10 java.lang.Object) = (r7v9 java.lang.Object), (r7v1 java.lang.Object) binds: [B:27:0x0081, B:15:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0096 A[PHI: r6
      0x0096: PHI (r6v8 il4) = (r6v7 il4), (r6v13 il4) binds: [B:30:0x0093, B:14:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b4 A[PHI: r2
      0x00b4: PHI (r2v4 long) = (r2v3 long), (r2v3 long), (r2v5 long) binds: [B:33:0x00a0, B:35:0x00b1, B:13:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c1, code lost:
    
        if (l(r2, r0) == r1) goto L39;
     */
    @Override // defpackage.rrm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.fm4 r6, defpackage.v1b<? super kotlin.Unit> r7) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zk4.g(fm4, v1b):java.lang.Object");
    }

    @Override // defpackage.rrm
    public final Object h(final Integer num, mhn mhnVar) {
        this.h = -1L;
        this.i = false;
        this.j = false;
        this.k = false;
        final String strB = this.c.b();
        Object objN = n(new Function0() { // from class: rk4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.a.a.h(num, null, null, 0, strB);
            }
        }, mhnVar);
        return objN == y5b.a ? objN : Unit.a;
    }

    @Override // defpackage.rrm
    public final il4 i() {
        return il4.a.a(31, this.c.b());
    }

    @Override // defpackage.rrm
    public final Object j(kq4 kq4Var) {
        Object objN = n(new wk4(this, 0), kq4Var);
        return objN == y5b.a ? objN : Unit.a;
    }

    @Override // defpackage.rrm
    public final Object k(final oh4 oh4Var, nhn nhnVar) {
        this.h = -1L;
        this.i = false;
        this.j = false;
        this.k = false;
        final String strB = this.c.b();
        Object objN = n(new Function0() { // from class: pk4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                yn4 yn4Var = this.a.a;
                oh4 oh4Var2 = oh4Var;
                return yn4Var.h(oh4Var2.f, oh4Var2.c, oh4Var2.d, oh4Var2.e, strB);
            }
        }, nhnVar);
        return objN == y5b.a ? objN : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        if (r6.d.a(r9, r2, r0) == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(long r7, defpackage.x1b r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.al4
            if (r0 == 0) goto L13
            r0 = r9
            al4 r0 = (defpackage.al4) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            al4 r0 = new al4
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.b
            y5b r1 = defpackage.y5b.a
            int r2 = r0.d
            srm r3 = r6.b
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2c
            defpackage.uj50.b(r9)
            goto L60
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            r6 = 0
            return r6
        L33:
            long r7 = r0.a
            defpackage.uj50.b(r9)
            goto L47
        L39:
            defpackage.uj50.b(r9)
            r0.a = r7
            r0.d = r5
            java.lang.Object r9 = r3.g(r7, r0)
            if (r9 != r1) goto L47
            goto L5f
        L47:
            si4 r9 = (defpackage.si4) r9
            if (r9 == 0) goto L63
            java.lang.Double r9 = r9.c
            prm r2 = r6.c
            java.lang.String r2 = r2.b()
            r0.a = r7
            r0.d = r4
            qrm r6 = r6.d
            java.lang.Object r6 = r6.a(r9, r2, r0)
            if (r6 != r1) goto L60
        L5f:
            return r1
        L60:
            r3.a()
        L63:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zk4.l(long, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007f  */
    /* JADX WARN: Code duplicated, block: B:27:0x008e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0092  */
    /* JADX WARN: Code duplicated, block: B:30:0x0095  */
    /* JADX WARN: Code duplicated, block: B:31:0x0098  */
    /* JADX WARN: Code duplicated, block: B:32:0x009b  */
    /* JADX WARN: Code duplicated, block: B:33:0x009e  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00ba -> B:41:0x00bd). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object m(defpackage.il4 r13, defpackage.x1b r14) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zk4.m(il4, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(Function0 function0, x1b x1bVar) {
        fl4 fl4Var;
        tuw tuwVar;
        List list;
        if (x1bVar instanceof fl4) {
            fl4Var = (fl4) x1bVar;
            int i = fl4Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                fl4Var.e = i - Integer.MIN_VALUE;
            } else {
                fl4Var = new fl4(this, x1bVar);
            }
        } else {
            fl4Var = new fl4(this, x1bVar);
        }
        Object obj = fl4Var.c;
        y5b y5bVar = y5b.a;
        int i2 = fl4Var.e;
        if (i2 == 0) {
            uj50.b(obj);
            fl4Var.a = function0;
            tuwVar = this.f;
            fl4Var.b = tuwVar;
            fl4Var.e = 1;
            if (tuwVar.d(fl4Var) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tuw tuwVar2 = fl4Var.b;
            Function0 function1 = fl4Var.a;
            uj50.b(obj);
            tuwVar = tuwVar2;
            function0 = function1;
        }
        try {
            il4 il4Var = (il4) function0.invoke();
            ArrayList arrayList = this.a.e;
            if (arrayList.isEmpty()) {
                list = m2g.a;
            } else {
                List listA0 = CollectionsKt.A0(arrayList);
                arrayList.clear();
                list = listA0;
            }
            this.g.setValue(il4Var);
            return new a(il4Var, list);
        } finally {
            tuwVar.f(null);
        }
    }
}
