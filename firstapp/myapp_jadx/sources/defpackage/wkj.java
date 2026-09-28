package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class wkj implements itm, ytm {
    public final htm a;
    public final kzm b;
    public final v5b c;
    public final wwd0 d;
    public jvd0 e;
    public ymd0 f;
    public int g;
    public boolean h;

    @c0d(c = "com.sportygames.stacker.domain.manager.game.GameLogicManager", f = "GameLogicManager.kt", l = {146, 157, 159}, m = "startNewRound", v = 1)
    public static final class a extends x1b {
        public ymd0 a;
        public int b;
        public /* synthetic */ Object c;
        public int e;

        public a(v1b<? super a> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return wkj.this.a(this);
        }
    }

    public wkj(htm htmVar, kzm kzmVar, v5b v5bVar) {
        htmVar.getClass();
        kzmVar.getClass();
        v5bVar.getClass();
        this.a = htmVar;
        this.b = kzmVar;
        this.c = v5bVar;
        this.d = xwd0.a(new zmd0((ArrayList) null, (ArrayList) null, (ArrayList) null, 0.0d, (String) null, 63));
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0094  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0136, code lost:
    
        if (r11.a.h(r12, r0) == r1) goto L67;
     */
    @Override // defpackage.itm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.v1b<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wkj.a(v1b):java.lang.Object");
    }

    @Override // defpackage.itm
    public final Unit b(String str) {
        this.d.k(null, new zmd0((ArrayList) null, (ArrayList) null, (ArrayList) null, 0.0d, str, 31));
        Unit unit = Unit.a;
        y5b y5bVar = y5b.a;
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:35:0x011a  */
    /* JADX WARN: Code duplicated, block: B:39:0x013a A[Catch: IndexOutOfBoundsException -> 0x0158, TryCatch #0 {IndexOutOfBoundsException -> 0x0158, blocks: (B:37:0x0122, B:39:0x013a, B:42:0x0144, B:43:0x0148, B:45:0x014e), top: B:63:0x0122 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0144 A[Catch: IndexOutOfBoundsException -> 0x0158, TryCatch #0 {IndexOutOfBoundsException -> 0x0158, blocks: (B:37:0x0122, B:39:0x013a, B:42:0x0144, B:43:0x0148, B:45:0x014e), top: B:63:0x0122 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x014e A[Catch: IndexOutOfBoundsException -> 0x0158, TRY_LEAVE, TryCatch #0 {IndexOutOfBoundsException -> 0x0158, blocks: (B:37:0x0122, B:39:0x013a, B:42:0x0144, B:43:0x0148, B:45:0x014e), top: B:63:0x0122 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0176  */
    /* JADX WARN: Code duplicated, block: B:63:0x0122 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0176 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:? A[LOOP:0: B:43:0x0148->B:67:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0026  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0113, code lost:
    
        if (r15.f(r12, r11) == r9) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0170, code lost:
    
        if (h(r11) == r9) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0194, code lost:
    
        if (r15.h(r0, r11) == r9) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01b4, code lost:
    
        if (b(r21) == r9) goto L59;
     */
    @Override // defpackage.itm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(boolean r20, java.lang.String r21, long r22, int r24, int r25, java.util.List r26, java.util.List r27, int r28, defpackage.x1b r29) {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wkj.c(boolean, java.lang.String, long, int, int, java.util.List, java.util.List, int, x1b):java.lang.Object");
    }

    @Override // defpackage.itm
    public final int d() {
        List<mf4> list = ((zmd0) this.d.getValue()).a.get(this.g);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            mf4 mf4Var = (mf4) obj;
            if (m()) {
                if (!(mf4Var instanceof r1g)) {
                    arrayList.add(obj);
                }
            } else if (!(mf4Var instanceof r1g)) {
                nld0 nld0Var = mf4Var instanceof nld0 ? (nld0) mf4Var : null;
                if ((nld0Var != null ? nld0Var.a : null) != old0.d) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList.size();
    }

    @Override // defpackage.itm
    public final Unit e() {
        jvd0 jvd0Var = this.e;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.e = null;
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0085 A[PHI: r12
      0x0085: PHI (r12v5 boolean) = (r12v4 boolean), (r12v7 boolean) binds: [B:27:0x0082, B:18:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
    
        if (r11.b.a(r13, r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009f, code lost:
    
        if (b(r12) == r1) goto L36;
     */
    @Override // defpackage.itm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r12, defpackage.ymd0 r13, defpackage.x1b r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.rkj
            if (r0 == 0) goto L13
            r0 = r14
            rkj r0 = (defpackage.rkj) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            rkj r0 = new rkj
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.b
            y5b r1 = defpackage.y5b.a
            int r2 = r0.d
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L48
            if (r2 == r7) goto L42
            if (r2 == r6) goto L3c
            if (r2 == r5) goto L38
            if (r2 != r4) goto L32
            defpackage.uj50.b(r14)
            goto La2
        L32:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r11)
            return r3
        L38:
            defpackage.uj50.b(r14)
            goto L94
        L3c:
            boolean r12 = r0.a
            defpackage.uj50.b(r14)
            goto L85
        L42:
            boolean r12 = r0.a
            defpackage.uj50.b(r14)
            goto L70
        L48:
            defpackage.uj50.b(r14)
            int r14 = r13.b
            int r2 = r13.c
            java.util.List<cpd0> r8 = r13.d
            m2g r9 = defpackage.m2g.a
            htm r10 = r11.a
            boolean r14 = r10.c(r14, r2, r8, r9)
            if (r14 == 0) goto L97
            r11.f = r13
            zmd0 r12 = r10.d(r12, r13)
            r0.a = r14
            r0.d = r7
            wwd0 r13 = r11.d
            r13.k(r3, r12)
            kotlin.Unit r12 = kotlin.Unit.a
            if (r12 != r1) goto L6f
            goto La1
        L6f:
            r12 = r14
        L70:
            kotlin.time.b$a r13 = kotlin.time.b.b
            r13 = 500(0x1f4, float:7.0E-43)
            rgf r14 = defpackage.rgf.MILLISECONDS
            long r13 = kotlin.time.c.h(r13, r14)
            r0.a = r12
            r0.d = r6
            java.lang.Object r13 = defpackage.hkd.c(r13, r0)
            if (r13 != r1) goto L85
            goto La1
        L85:
            mmd0 r13 = defpackage.mmd0.a
            r0.a = r12
            r0.d = r5
            kzm r11 = r11.b
            java.lang.Object r11 = r11.a(r13, r0)
            if (r11 != r1) goto L94
            goto La1
        L94:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        L97:
            r0.a = r14
            r0.d = r4
            kotlin.Unit r11 = r11.b(r12)
            if (r11 != r1) goto La2
        La1:
            return r1
        La2:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wkj.f(java.lang.String, ymd0, x1b):java.lang.Object");
    }

    @Override // defpackage.itm
    public final int g() {
        return this.g + 1;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
    
        if (r12 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b8, code lost:
    
        if (r11.a.h(r11, r0) == r1) goto L39;
     */
    @Override // defpackage.itm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.x1b r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.vkj
            if (r0 == 0) goto L13
            r0 = r12
            vkj r0 = (defpackage.vkj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            vkj r0 = new vkj
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.a
            y5b r1 = defpackage.y5b.a
            int r2 = r0.c
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3d
            if (r2 == r6) goto L39
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            defpackage.uj50.b(r12)
            goto Lbb
        L2f:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r11)
            return r3
        L35:
            defpackage.uj50.b(r12)
            goto L71
        L39:
            defpackage.uj50.b(r12)
            goto L5f
        L3d:
            defpackage.uj50.b(r12)
            int r12 = r11.g
            ymd0 r2 = r11.f
            if (r2 == 0) goto L49
            int r2 = r2.b
            goto L4a
        L49:
            r2 = 0
        L4a:
            if (r12 >= r2) goto La7
            kotlin.time.b$a r12 = kotlin.time.b.b
            r12 = 100
            rgf r2 = defpackage.rgf.MILLISECONDS
            long r7 = kotlin.time.c.h(r12, r2)
            r0.c = r6
            java.lang.Object r12 = defpackage.hkd.c(r7, r0)
            if (r12 != r1) goto L5f
            goto Lba
        L5f:
            mmd0 r12 = defpackage.mmd0.i
            r0.c = r5
            kzm r2 = r11.b
            java.lang.Object r12 = r2.a(r12, r0)
            if (r12 != r1) goto L6c
            goto L6e
        L6c:
            kotlin.Unit r12 = kotlin.Unit.a
        L6e:
            if (r12 != r1) goto L71
            goto Lba
        L71:
            ymd0 r12 = r11.f
            if (r12 == 0) goto La4
            java.util.List<cpd0> r12 = r12.d
            int r0 = r11.g
            java.lang.Object r0 = r12.get(r0)
            cpd0 r0 = (defpackage.cpd0) r0
            float r7 = r0.c
            int r0 = r11.g
            java.lang.Object r0 = r12.get(r0)
            cpd0 r0 = (defpackage.cpd0) r0
            boolean r8 = r0.b
            int r0 = r11.g
            java.lang.Object r12 = r12.get(r0)
            cpd0 r12 = (defpackage.cpd0) r12
            int r9 = r12.a
            ukj r5 = new ukj
            r10 = 0
            r6 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            v5b r11 = r6.c
            jvd0 r11 = defpackage.ej5.c(r11, r3, r3, r5, r4)
            r6.e = r11
        La4:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        La7:
            r6 = r11
            wwd0 r11 = r6.d
            java.lang.Object r11 = r11.getValue()
            zmd0 r11 = (defpackage.zmd0) r11
            r0.c = r4
            htm r12 = r6.a
            java.lang.Object r11 = r12.h(r11, r0)
            if (r11 != r1) goto Lbb
        Lba:
            return r1
        Lbb:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wkj.h(x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0049  */
    @Override // defpackage.itm
    public final int i() {
        boolean z;
        List<mf4> list = ((zmd0) this.d.getValue()).a.get(this.g);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            mf4 mf4Var = (mf4) obj;
            if (m()) {
                z = mf4Var instanceof r1g;
            } else if (mf4Var instanceof r1g) {
                z = true;
            } else {
                nld0 nld0Var = mf4Var instanceof nld0 ? (nld0) mf4Var : null;
                if ((nld0Var != null ? nld0Var.a : null) == old0.d) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (!z) {
                break;
            }
            arrayList.add(obj);
        }
        return arrayList.size();
    }

    @Override // defpackage.ytm
    public final wwd0 invoke() {
        return this.d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c5, code lost:
    
        if (r12 == r1) goto L40;
     */
    @Override // defpackage.itm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.x1b r13) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wkj.j(x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
    
        if (r2.emit(r12, r0) == r1) goto L22;
     */
    @Override // defpackage.itm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.x1b r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof defpackage.qkj
            if (r0 == 0) goto L13
            r0 = r13
            qkj r0 = (defpackage.qkj) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            qkj r0 = new qkj
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.c
            y5b r1 = defpackage.y5b.a
            int r2 = r0.e
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            defpackage.uj50.b(r13)
            goto L7a
        L2b:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r12)
            return r3
        L31:
            zmd0 r12 = r0.b
            wwd0 r2 = r0.a
            defpackage.uj50.b(r13)
            r5 = r12
            goto L60
        L3a:
            defpackage.uj50.b(r13)
            wwd0 r2 = r12.d
            java.lang.Object r13 = r2.getValue()
            zmd0 r13 = (defpackage.zmd0) r13
            int r6 = r12.g
            java.lang.Object r7 = r2.getValue()
            zmd0 r7 = (defpackage.zmd0) r7
            java.util.List<java.util.List<mf4>> r7 = r7.a
            r0.a = r2
            r0.b = r13
            r0.e = r5
            htm r12 = r12.a
            java.lang.Object r12 = r12.g(r6, r0, r7)
            if (r12 != r1) goto L5e
            goto L79
        L5e:
            r5 = r13
            r13 = r12
        L60:
            r6 = r13
            java.util.List r6 = (java.util.List) r6
            r9 = 0
            r11 = 62
            r7 = 0
            r8 = 0
            zmd0 r12 = defpackage.zmd0.a(r5, r6, r7, r8, r9, r11)
            r0.a = r3
            r0.b = r3
            r0.e = r4
            java.lang.Object r12 = r2.emit(r12, r0)
            if (r12 != r1) goto L7a
        L79:
            return r1
        L7a:
            kotlin.Unit r12 = kotlin.Unit.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wkj.k(x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0061 A[LOOP:1: B:19:0x0061->B:41:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:24:0x0091  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c4, code lost:
    
        if (r1 == r3) goto L31;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00c4 -> B:13:0x0035). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.x1b r20) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wkj.l(x1b):java.lang.Object");
    }

    public final boolean m() {
        List<mf4> list = ((zmd0) this.d.getValue()).a.get(this.g);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!(((mf4) obj) instanceof r1g)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            mf4 mf4Var = (mf4) obj2;
            nld0 nld0Var = mf4Var instanceof nld0 ? (nld0) mf4Var : null;
            if ((nld0Var != null ? nld0Var.a : null) != old0.d) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.itm
    public final void reset() {
        this.g = 0;
        this.h = false;
        jvd0 jvd0Var = this.e;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
    }
}
