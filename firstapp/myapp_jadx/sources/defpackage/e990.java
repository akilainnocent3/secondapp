package defpackage;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e990 {
    public final brk a;

    public e990(brk brkVar, sq20 sq20Var, sq20 sq20Var2) {
        brkVar.getClass();
        this.a = brkVar;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00af A[PHI: r12
      0x00af: PHI (r12v14 java.lang.Object) = (r12v13 java.lang.Object), (r12v1 java.lang.Object) binds: [B:36:0x00ac, B:18:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object a(x1b x1bVar) {
        c990 c990Var;
        String str;
        lk50 lk50Var;
        boolean zBooleanValue;
        boolean z;
        int i;
        if (x1bVar instanceof c990) {
            c990Var = (c990) x1bVar;
            int i2 = c990Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c990Var.e = i2 - Integer.MIN_VALUE;
            } else {
                c990Var = new c990(this, x1bVar);
            }
        } else {
            c990Var = new c990(this, x1bVar);
        }
        Object objB = c990Var.c;
        y5b y5bVar = y5b.a;
        int i3 = c990Var.e;
        brk brkVar = this.a;
        if (i3 == 0) {
            uj50.b(objB);
            Calendar calendar = Calendar.getInstance();
            str = String.format(Locale.ROOT, "%04d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(2) + 1)}, 2));
            c990Var.a = str;
            c990Var.e = 1;
            objB = brkVar.b(c990Var);
            if (objB != y5bVar) {
            }
            return y5bVar;
        }
        if (i3 == 1) {
            str = c990Var.a;
            uj50.b(objB);
        } else {
            if (i3 == 2) {
                uj50.b(objB);
                return objB;
            }
            if (i3 == 3) {
                uj50.b(objB);
                c990Var.a = null;
                c990Var.e = 4;
                objB = brkVar.e(c990Var);
                if (objB != y5bVar) {
                    lk50Var = (lk50) objB;
                    if (lk50Var instanceof lk50.c) {
                        zBooleanValue = ((Boolean) ((lk50.c) lk50Var).a).booleanValue();
                    } else {
                        if (lk50Var instanceof lk50.a) {
                            itf0.a aVar = itf0.a;
                            aVar.q("GiftIntro");
                            aVar.f(((lk50.a) lk50Var).a, "API check failed, treating as not used", new Object[0]);
                        }
                        zBooleanValue = false;
                    }
                    z = !zBooleanValue;
                    c990Var.a = null;
                    c990Var.b = z ? 1 : 0;
                    c990Var.e = 5;
                    if (brkVar.a(z, c990Var) != y5bVar) {
                        i = z ? 1 : 0;
                    }
                }
                return y5bVar;
            }
            if (i3 == 4) {
                uj50.b(objB);
                lk50Var = (lk50) objB;
                if (lk50Var instanceof lk50.c) {
                    zBooleanValue = ((Boolean) ((lk50.c) lk50Var).a).booleanValue();
                } else {
                    if (lk50Var instanceof lk50.a) {
                        itf0.a aVar2 = itf0.a;
                        aVar2.q("GiftIntro");
                        aVar2.f(((lk50.a) lk50Var).a, "API check failed, treating as not used", new Object[0]);
                    }
                    zBooleanValue = false;
                }
                z = !zBooleanValue;
                c990Var.a = null;
                c990Var.b = z ? 1 : 0;
                c990Var.e = 5;
                if (brkVar.a(z, c990Var) != y5bVar) {
                    i = z ? 1 : 0;
                }
                return y5bVar;
            }
            if (i3 != 5) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = c990Var.b;
            uj50.b(objB);
        }
        return Boolean.valueOf(i != 0);
        if (Intrinsics.g(str, (String) objB)) {
            c990Var.a = null;
            c990Var.e = 2;
            Object objM = brkVar.m(c990Var);
            if (objM != y5bVar) {
                return objM;
            }
        } else {
            c990Var.a = null;
            c990Var.e = 3;
            if (brkVar.g(str, c990Var) != y5bVar) {
                c990Var.a = null;
                c990Var.e = 4;
                objB = brkVar.e(c990Var);
                if (objB != y5bVar) {
                    lk50Var = (lk50) objB;
                    if (lk50Var instanceof lk50.c) {
                        zBooleanValue = ((Boolean) ((lk50.c) lk50Var).a).booleanValue();
                    } else {
                        if (lk50Var instanceof lk50.a) {
                            itf0.a aVar3 = itf0.a;
                            aVar3.q("GiftIntro");
                            aVar3.f(((lk50.a) lk50Var).a, "API check failed, treating as not used", new Object[0]);
                        }
                        zBooleanValue = false;
                    }
                    z = !zBooleanValue;
                    c990Var.a = null;
                    c990Var.b = z ? 1 : 0;
                    c990Var.e = 5;
                    if (brkVar.a(z, c990Var) != y5bVar) {
                        i = z ? 1 : 0;
                        return Boolean.valueOf(i != 0);
                    }
                }
            }
        }
        return y5bVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0069  */
    /* JADX WARN: Code duplicated, block: B:29:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x006e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0071  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:
    
        if (r9 == r1) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.x1b r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.d990
            if (r0 == 0) goto L13
            r0 = r9
            d990 r0 = (defpackage.d990) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            d990 r0 = new d990
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.b
            y5b r1 = defpackage.y5b.a
            int r2 = r0.d
            brk r3 = r8.a
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L40
            if (r2 == r6) goto L3c
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2f
            defpackage.uj50.b(r9)
            goto L7c
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            r8 = 0
            return r8
        L36:
            int r8 = r0.a
            defpackage.uj50.b(r9)
            goto L61
        L3c:
            defpackage.uj50.b(r9)
            goto L4c
        L40:
            defpackage.uj50.b(r9)
            r0.d = r6
            java.lang.Object r9 = r3.k(r0)
            if (r9 != r1) goto L4c
            goto L7b
        L4c:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            r9 = r9 ^ r6
            r0.a = r9
            r0.d = r5
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L5e
            goto L7b
        L5e:
            r7 = r9
            r9 = r8
            r8 = r7
        L61:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L6c
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        L6c:
            if (r8 == 0) goto L71
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            return r8
        L71:
            r0.a = r8
            r0.d = r4
            java.lang.Object r9 = r3.f(r0)
            if (r9 != r1) goto L7c
        L7b:
            return r1
        L7c:
            java.lang.Number r9 = (java.lang.Number) r9
            long r8 = r9.longValue()
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 <= 0) goto L99
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r8
            r8 = 15552000000(0x39ef8b000, double:7.683708924E-314)
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r8 >= 0) goto L99
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        L99:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e990.b(x1b):java.lang.Object");
    }
}
