package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class u4f0 {
    public static final a a = new a(3, null);

    @c0d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
    public static final class a extends tje0 implements gaj<ip20, gly, v1b<? super Unit>, Object> {
        @Override // defpackage.gaj
        public final Object invoke(ip20 ip20Var, gly glyVar, v1b<? super Unit> v1bVar) {
            long j = glyVar.a;
            return new a(3, v1bVar).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return Unit.a;
        }
    }

    @c0d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {291}, m = "awaitFirstDown")
    public static final class b extends x1b {
        public vp1 a;
        public c020 b;
        public boolean c;
        public /* synthetic */ Object d;
        public int e;

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return u4f0.a(null, false, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0047 -> B:18:0x004a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(defpackage.vp1 r5, boolean r6, defpackage.c020 r7, defpackage.v1b<? super defpackage.m020> r8) {
        /*
            boolean r0 = r8 instanceof u4f0.b
            if (r0 == 0) goto L13
            r0 = r8
            u4f0$b r0 = (u4f0.b) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            u4f0$b r0 = new u4f0$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.d
            y5b r1 = defpackage.y5b.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L31
            boolean r5 = r0.c
            c020 r6 = r0.b
            vp1 r7 = r0.a
            defpackage.uj50.b(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4a
        L31:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            r5 = 0
            return r5
        L38:
            defpackage.uj50.b(r8)
        L3b:
            r0.a = r5
            r0.b = r7
            r0.c = r6
            r0.e = r3
            java.lang.Object r8 = r5.l1(r7, r0)
            if (r8 != r1) goto L4a
            return r1
        L4a:
            b020 r8 = (defpackage.b020) r8
            boolean r2 = e(r8, r6)
            if (r2 == 0) goto L3b
            java.util.List<m020> r5 = r8.a
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u4f0.a(vp1, boolean, c020, v1b):java.lang.Object");
    }

    public static /* synthetic */ Object b(vp1 vp1Var, v1b v1bVar, int i) {
        c020 c020Var = c020.a;
        boolean z = (i & 1) != 0;
        if ((i & 2) != 0) {
            c020Var = c020.b;
        }
        return a(vp1Var, z, c020Var, v1bVar);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004c A[LOOP:0: B:19:0x004a->B:20:0x004c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x006b A[LOOP:1: B:22:0x005e->B:26:0x006b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0033 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:23:0x0060
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(defpackage.vp1 r8, defpackage.pz1 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.w4f0
            if (r0 == 0) goto L13
            r0 = r9
            w4f0 r0 = (defpackage.w4f0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            w4f0 r0 = new w4f0
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.b
            y5b r1 = defpackage.y5b.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            vp1 r8 = r0.a
            defpackage.uj50.b(r9)
            goto L40
        L29:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            r8 = 0
            return r8
        L30:
            defpackage.uj50.b(r9)
        L33:
            r0.a = r8
            r0.c = r3
            c020 r9 = defpackage.c020.b
            java.lang.Object r9 = r8.l1(r9, r0)
            if (r9 != r1) goto L40
            return r1
        L40:
            b020 r9 = (defpackage.b020) r9
            java.util.List<m020> r2 = r9.a
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L4a:
            if (r6 >= r4) goto L58
            java.lang.Object r7 = r2.get(r6)
            m020 r7 = (defpackage.m020) r7
            r7.a()
            int r6 = r6 + 1
            goto L4a
        L58:
            java.util.List<m020> r9 = r9.a
            int r2 = r9.size()
        L5e:
            if (r5 >= r2) goto L6e
            java.lang.Object r4 = r9.get(r5)
            m020 r4 = (defpackage.m020) r4
            boolean r4 = r4.d
            if (r4 == 0) goto L6b
            goto L33
        L6b:
            int r5 = r5 + 1
            goto L5e
        L6e:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u4f0.c(vp1, pz1):java.lang.Object");
    }

    public static Object d(u020 u020Var, gaj gajVar, Function1 function1, v1b v1bVar, int i) {
        if ((i & 4) != 0) {
            gajVar = a;
        }
        gaj gajVar2 = gajVar;
        if ((i & 8) != 0) {
            function1 = null;
        }
        Object objD = w5b.d(new y4f0(u020Var, gajVar2, null, null, function1, null), v1bVar);
        return objD == y5b.a ? objD : Unit.a;
    }

    public static boolean e(b020 b020Var, boolean z) {
        List<m020> list = b020Var.a;
        int size = list.size();
        int i = 0;
        while (true) {
            boolean zC = true;
            if (i >= size) {
                return true;
            }
            m020 m020Var = list.get(i);
            if (!z) {
                zC = ovo.c(m020Var);
            } else if (m020Var.b() || m020Var.h || !m020Var.d) {
                zC = false;
            }
            if (!zC) {
                return false;
            }
            i++;
        }
    }

    public static jvd0 f(v5b v5bVar, c9p c9pVar, Function2 function2) {
        return ej5.c(v5bVar, null, a6b.d, new z4f0(c9pVar, function2, null), 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, hkt$a] */
    public static final Object g(vp1 vp1Var, c020 c020Var, pz1 pz1Var) {
        a5f0 a5f0Var;
        dq40 dq40Var;
        if (pz1Var instanceof a5f0) {
            a5f0Var = (a5f0) pz1Var;
            int i = a5f0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                a5f0Var.c = i - Integer.MIN_VALUE;
            } else {
                a5f0Var = new a5f0(pz1Var);
            }
        } else {
            a5f0Var = new a5f0(pz1Var);
        }
        Object obj = a5f0Var.b;
        Object obj2 = y5b.a;
        int i2 = a5f0Var.c;
        try {
            if (i2 == 0) {
                dq40 dq40VarA = j6w.a(obj);
                dq40VarA.a = hkt.a.a;
                long jC = vp1Var.getViewConfiguration().c();
                Function2 b5f0Var = new b5f0(c020Var, dq40VarA, null);
                a5f0Var.a = dq40VarA;
                a5f0Var.c = 1;
                if (vp1Var.E0(jC, b5f0Var, a5f0Var) == obj2) {
                    return obj2;
                }
                dq40Var = dq40VarA;
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dq40Var = a5f0Var.a;
                uj50.b(obj);
            }
            return dq40Var.a;
        } catch (e020 unused) {
            return hkt.c.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    /* JADX WARN: Code duplicated, block: B:30:0x008f  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cd A[LOOP:1: B:23:0x006e->B:44:0x00cd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c7 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ad -> B:13:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object h(defpackage.vp1 r17, defpackage.c020 r18, defpackage.pz1 r19) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u4f0.h(vp1, c020, pz1):java.lang.Object");
    }
}
