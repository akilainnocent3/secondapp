package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class y8f {
    public static final float a = 0.125f / 18.0f;

    /* JADX WARN: Code duplicated, block: B:24:0x0073  */
    /* JADX WARN: Code duplicated, block: B:27:0x0085 A[LOOP:0: B:23:0x0071->B:27:0x0085, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x0089 A[EDGE_INSN: B:54:0x0089->B:29:0x0089 BREAK  A[LOOP:0: B:23:0x0071->B:27:0x0085], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0062 -> B:22:0x0067). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(defpackage.vp1 r17, long r18, defpackage.x1b r20) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y8f.a(vp1, long, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00be  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d5 A[LOOP:0: B:26:0x00bc->B:30:0x00d5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x00e1 A[EDGE_INSN: B:69:0x00e1->B:32:0x00e1 BREAK  A[LOOP:0: B:26:0x00bc->B:30:0x00d5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0170 -> B:63:0x0176). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(defpackage.vp1 r19, long r20, int r22, defpackage.p8f r23, defpackage.pz1 r24) {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y8f.b(vp1, long, int, p8f, pz1):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [dq40] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r11v3, types: [T, m020] */
    public static final Object c(vp1 vp1Var, long j, pz1 pz1Var) {
        j8f j8fVar;
        m020 m020Var;
        yp40 yp40Var;
        Object obj;
        if (pz1Var instanceof j8f) {
            j8fVar = (j8f) pz1Var;
            int i = j8fVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                j8fVar.e = i - Integer.MIN_VALUE;
            } else {
                j8fVar = new j8f(pz1Var);
            }
        } else {
            j8fVar = new j8f(pz1Var);
        }
        Object obj2 = j8fVar.d;
        Object obj3 = y5b.a;
        int i2 = j8fVar.e;
        try {
            if (i2 == 0) {
                uj50.b(obj2);
                if (!j(vp1Var.U0(), j)) {
                    List<m020> list = vp1Var.U0().a;
                    int size = list.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            m020Var = null;
                            break;
                        }
                        m020Var = list.get(i3);
                        if (k020.a(m020Var.a, j)) {
                            break;
                        }
                        i3++;
                    }
                    m020 m020Var2 = m020Var;
                    if (m020Var2 != 0) {
                        dq40 dq40Var = new dq40();
                        dq40 dq40Var2 = new dq40();
                        dq40Var2.a = m020Var2;
                        long jC = vp1Var.getViewConfiguration().c();
                        yp40 yp40Var2 = new yp40();
                        Function2 k8fVar = new k8f(yp40Var2, dq40Var2, dq40Var, null);
                        j8fVar.a = m020Var2;
                        j8fVar.b = dq40Var;
                        j8fVar.c = yp40Var2;
                        j8fVar.e = 1;
                        if (vp1Var.E0(jC, k8fVar, j8fVar) == obj3) {
                            return obj3;
                        }
                        yp40Var = yp40Var2;
                        j = dq40Var;
                        obj = m020Var2;
                    }
                }
                return null;
            }
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            yp40Var = j8fVar.c;
            dq40 dq40Var3 = j8fVar.b;
            m020 m020Var3 = j8fVar.a;
            uj50.b(obj2);
            j = dq40Var3;
            obj = m020Var3;
            if (yp40Var.a) {
                m020 m020Var4 = (m020) j.a;
                return m020Var4 == null ? obj : m020Var4;
            }
            return null;
        } catch (e020 unused) {
            m020 m020Var5 = (m020) j.a;
            return m020Var5 == null ? obj : m020Var5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00be  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d5 A[LOOP:0: B:26:0x00bc->B:30:0x00d5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x00e1 A[EDGE_INSN: B:69:0x00e1->B:32:0x00e1 BREAK  A[LOOP:0: B:26:0x00bc->B:30:0x00d5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0173 -> B:63:0x0179). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object d(defpackage.vp1 r19, long r20, int r22, defpackage.s8f r23, defpackage.pz1 r24) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y8f.d(vp1, long, int, s8f, pz1):java.lang.Object");
    }

    public static final Object e(u020 u020Var, final Function1<? super gly, Unit> function1, Function0<Unit> function0, Function0<Unit> function2, Function2<? super m020, ? super gly, Unit> function3, v1b<? super Unit> v1bVar) {
        Object objB = dqi.b(u020Var, new m8f(new b8f(), new cq40(), null, new gaj() { // from class: z7f
            @Override // defpackage.gaj
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                function1.invoke(new gly(((m020) obj2).c));
                return Unit.a;
            }
        }, function3, function2, new a8f(0, function0), null), v1bVar);
        y5b y5bVar = y5b.a;
        if (objB != y5bVar) {
            objB = Unit.a;
        }
        return objB == y5bVar ? objB : Unit.a;
    }

    public static Object g(u020 u020Var, j3e0 j3e0Var, Function2 function2, v1b v1bVar, int i) {
        c8f c8fVar = new c8f();
        Function0 d8fVar = j3e0Var;
        if ((i & 2) != 0) {
            d8fVar = new d8f();
        }
        Object objB = dqi.b(u020Var, new u8f(c8fVar, function2, d8fVar, new e8f(0), null), v1bVar);
        return objB == y5b.a ? objB : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object h(defpackage.vp1 r4, long r5, kotlin.jvm.functions.Function1 r7, defpackage.pz1 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.v8f
            if (r0 == 0) goto L13
            r0 = r8
            v8f r0 = (defpackage.v8f) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            v8f r0 = new v8f
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.c
            y5b r1 = defpackage.y5b.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            kotlin.jvm.functions.Function1 r4 = r0.b
            vp1 r5 = r0.a
            defpackage.uj50.b(r8)
            r7 = r4
            r4 = r5
            goto L44
        L2d:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r4)
            r4 = 0
            return r4
        L34:
            defpackage.uj50.b(r8)
        L37:
            r0.a = r4
            r0.b = r7
            r0.d = r3
            java.lang.Object r8 = a(r4, r5, r0)
            if (r8 != r1) goto L44
            return r1
        L44:
            m020 r8 = (defpackage.m020) r8
            if (r8 != 0) goto L4b
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4b:
            boolean r5 = defpackage.ovo.e(r8)
            if (r5 == 0) goto L54
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L54:
            r7.invoke(r8)
            long r5 = r8.a
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y8f.h(vp1, long, kotlin.jvm.functions.Function1, pz1):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0089  */
    /* JADX WARN: Code duplicated, block: B:28:0x009d A[LOOP:0: B:24:0x0087->B:28:0x009d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x00a7 A[EDGE_INSN: B:73:0x00a7->B:30:0x00a7 BREAK  A[LOOP:0: B:24:0x0087->B:28:0x009d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0078 -> B:23:0x007e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object i(defpackage.vp1 r17, long r18, kotlin.jvm.functions.Function1 r20, defpackage.pz1 r21) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y8f.i(vp1, long, kotlin.jvm.functions.Function1, pz1):java.lang.Object");
    }

    public static final boolean j(b020 b020Var, long j) {
        m020 m020Var;
        List<m020> list = b020Var.a;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                m020Var = null;
                break;
            }
            m020Var = list.get(i);
            if (k020.a(m020Var.a, j)) {
                break;
            }
            i++;
        }
        m020 m020Var2 = m020Var;
        if (m020Var2 != null && m020Var2.d) {
            z = true;
        }
        return true ^ z;
    }

    public static final float k(z6i0 z6i0Var, int i) {
        return i == 2 ? z6i0Var.h() * a : z6i0Var.h();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0089  */
    /* JADX WARN: Code duplicated, block: B:28:0x009d A[LOOP:0: B:24:0x0087->B:28:0x009d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x00a7 A[EDGE_INSN: B:73:0x00a7->B:30:0x00a7 BREAK  A[LOOP:0: B:24:0x0087->B:28:0x009d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0078 -> B:23:0x007e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object l(defpackage.vp1 r17, long r18, defpackage.t8f r20, defpackage.pz1 r21) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y8f.l(vp1, long, t8f, pz1):java.lang.Object");
    }
}
