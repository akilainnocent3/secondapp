package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class o880 {
    /* JADX WARN: Code duplicated, block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058 A[LOOP:0: B:19:0x0049->B:23:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0033 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(defpackage.vp1 r7, defpackage.pz1 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.j880
            if (r0 == 0) goto L13
            r0 = r8
            j880 r0 = (defpackage.j880) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            j880 r0 = new j880
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.b
            y5b r1 = defpackage.y5b.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            vp1 r7 = r0.a
            defpackage.uj50.b(r8)
            goto L40
        L29:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            r7 = 0
            return r7
        L30:
            defpackage.uj50.b(r8)
        L33:
            c020 r8 = defpackage.c020.b
            r0.a = r7
            r0.c = r3
            java.lang.Object r8 = r7.l1(r8, r0)
            if (r8 != r1) goto L40
            return r1
        L40:
            b020 r8 = (defpackage.b020) r8
            java.util.List<m020> r2 = r8.a
            int r4 = r2.size()
            r5 = 0
        L49:
            if (r5 >= r4) goto L5b
            java.lang.Object r6 = r2.get(r5)
            m020 r6 = (defpackage.m020) r6
            boolean r6 = defpackage.ovo.c(r6)
            if (r6 != 0) goto L58
            goto L33
        L58:
            int r5 = r5 + 1
            goto L49
        L5b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o880.a(vp1, pz1):java.lang.Object");
    }

    public static final boolean b(b020 b020Var) {
        List<m020> list = b020Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).i != 2) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:49:0x0111  */
    /* JADX WARN: Code duplicated, block: B:51:0x011d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public static final Object c(vp1 vp1Var, g6w g6wVar, as7 as7Var, b020 b020Var, pz1 pz1Var) {
        k880 k880Var;
        final w780 w780Var;
        final yp40 yp40Var;
        List<m020> list;
        int size;
        m020 m020Var;
        vp1 vp1Var2 = vp1Var;
        final g6w g6wVar2 = g6wVar;
        if (pz1Var instanceof k880) {
            k880Var = (k880) pz1Var;
            int i = k880Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                k880Var.e = i - Integer.MIN_VALUE;
            } else {
                k880Var = new k880(pz1Var);
            }
        } else {
            k880Var = new k880(pz1Var);
        }
        Object objH = k880Var.d;
        y5b y5bVar = y5b.a;
        int i2 = k880Var.e;
        int i3 = 0;
        if (i2 == 0) {
            uj50.b(objH);
            z6i0 z6i0Var = as7Var.a;
            m020 m020Var2 = as7Var.c;
            m020 m020Var3 = b020Var.a.get(0);
            if (m020Var2 == null || m020Var3.b - m020Var2.b >= z6i0Var.a()) {
                as7Var.b = 1;
            } else {
                if (gly.d(gly.e(m020Var2.c, m020Var3.c)) < y8f.k(z6i0Var, m020Var2.i)) {
                    as7Var.b++;
                } else {
                    as7Var.b = 1;
                }
            }
            as7Var.c = m020Var3;
            m020 m020Var4 = b020Var.a.get(0);
            int i4 = as7Var.b;
            t780 t780Var = w780.a.a;
            if (i4 != 1) {
                w780Var = i4 != 2 ? w780.a.c : w780.a.b;
            } else {
                w780Var = t780Var;
            }
            if (g6wVar2.c(m020Var4.c, w780Var, i4)) {
                yp40Var = new yp40();
                yp40Var.a = !w780Var.equals(t780Var);
                long j = m020Var4.a;
                Function1 function1 = new Function1() { // from class: i880
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        m020 m020Var5 = (m020) obj;
                        if (g6wVar2.b(m020Var5.c, w780Var)) {
                            m020Var5.a();
                            yp40Var.a = true;
                        }
                        return Unit.a;
                    }
                };
                k880Var.a = vp1Var2;
                k880Var.b = g6wVar2;
                k880Var.c = yp40Var;
                k880Var.e = 2;
                objH = y8f.h(vp1Var2, j, function1, k880Var);
                if (objH == y5bVar) {
                    return y5bVar;
                }
                if (((Boolean) objH).booleanValue()) {
                    list = vp1Var2.U0().a;
                    size = list.size();
                    while (i3 < size) {
                        m020Var = list.get(i3);
                        if (ovo.d(m020Var)) {
                            m020Var.a();
                        }
                        i3++;
                    }
                }
                g6wVar2.a();
            }
        } else if (i2 == 1) {
            g6w g6wVar3 = k880Var.b;
            vp1 vp1Var3 = k880Var.a;
            uj50.b(objH);
            if (((Boolean) objH).booleanValue()) {
                List<m020> list2 = vp1Var3.U0().a;
                int size2 = list2.size();
                while (i3 < size2) {
                    m020 m020Var5 = list2.get(i3);
                    if (ovo.d(m020Var5)) {
                        m020Var5.a();
                    }
                    i3++;
                }
            }
            g6wVar3.a();
        } else {
            if (i2 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            yp40 yp40Var2 = k880Var.c;
            g6wVar2 = k880Var.b;
            vp1 vp1Var4 = k880Var.a;
            uj50.b(objH);
            yp40Var = yp40Var2;
            vp1Var2 = vp1Var4;
            if (((Boolean) objH).booleanValue() && yp40Var.a) {
                list = vp1Var2.U0().a;
                size = list.size();
                while (i3 < size) {
                    m020Var = list.get(i3);
                    if (ovo.d(m020Var)) {
                        m020Var.a();
                    }
                    i3++;
                }
            }
            g6wVar2.a();
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009c, code lost:
    
        if (r15 == r1) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.vp1 r12, defpackage.fff0 r13, defpackage.b020 r14, defpackage.pz1 r15) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o880.d(vp1, fff0, b020, pz1):java.lang.Object");
    }
}
