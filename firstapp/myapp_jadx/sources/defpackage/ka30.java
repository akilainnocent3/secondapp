package defpackage;

import android.content.Context;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes4.dex */
public final class ka30 {
    public final Context a;
    public final ysm b;
    public final m2l c;
    public String d;
    public final tuw e;

    public ka30(Context context, ysm ysmVar, m2l m2lVar) {
        ysmVar.getClass();
        m2lVar.getClass();
        this.a = context;
        this.b = ysmVar;
        this.c = m2lVar;
        this.e = uuw.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(x1b x1bVar) {
        ia30 ia30Var;
        if (x1bVar instanceof ia30) {
            ia30Var = (ia30) x1bVar;
            int i = ia30Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ia30Var.c = i - Integer.MIN_VALUE;
            } else {
                ia30Var = new ia30(this, x1bVar);
            }
        } else {
            ia30Var = new ia30(this, x1bVar);
        }
        Object objD = ia30Var.a;
        y5b y5bVar = y5b.a;
        int i2 = ia30Var.c;
        if (i2 == 0) {
            uj50.b(objD);
            ia30Var.c = 1;
            objD = this.b.d(ia30Var);
            if (objD == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objD);
        }
        String str = ((ysm.a) objD).a;
        String packageName = this.a.getPackageName();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SecureRandom secureRandomA = o380.a();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = 0; i3 < 32; i3++) {
            stringBuffer.append(secureRandomA.nextInt(95) + 32);
        }
        String string = stringBuffer.toString();
        string.getClass();
        return t3c.a(str + packageName + jCurrentTimeMillis + t3c.a(string));
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008a A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:22:0x0044, B:45:0x0095, B:27:0x004e, B:40:0x0086, B:42:0x008a), top: B:59:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0094  */
    /* JADX WARN: Code duplicated, block: B:45:0x0095 A[Catch: all -> 0x0048, PHI: r2 r12
      0x0095: PHI (r2v10 ??) = (r2v17 ??), (r2v18 ??) binds: [B:43:0x0092, B:22:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x0095: PHI (r12v8 java.lang.Object) = (r12v7 java.lang.Object), (r12v1 java.lang.Object) binds: [B:43:0x0092, B:22:0x0044] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x0048, blocks: (B:22:0x0044, B:45:0x0095, B:27:0x004e, B:40:0x0086, B:42:0x008a), top: B:59:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00af  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [quw] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [quw] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r11v0, types: [ka30] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v9, types: [quw] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [quw] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    public final Object b(x1b x1bVar) throws Throwable {
        ja30 ja30Var;
        ?? r0;
        tuw tuwVar;
        quw quwVar;
        String str;
        quw quwVar2;
        String str2;
        wm20 wm20VarA;
        Object obj;
        ?? r1;
        ?? r12;
        if (x1bVar instanceof ja30) {
            ja30Var = (ja30) x1bVar;
            int i = ja30Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ja30Var.e = i - Integer.MIN_VALUE;
            } else {
                ja30Var = new ja30(this, x1bVar);
            }
        } else {
            ja30Var = new ja30(this, x1bVar);
        }
        Object objA = ja30Var.c;
        y5b y5bVar = y5b.a;
        ?? r2 = ja30Var.e;
        m2l m2lVar = this.c;
        try {
            try {
                if (r2 == 0) {
                    uj50.b(objA);
                    tuwVar = this.e;
                    ja30Var.a = tuwVar;
                    ja30Var.e = 1;
                    if (tuwVar.d(ja30Var) != y5bVar) {
                    }
                    quwVar = tuwVar;
                    return y5bVar;
                }
                if (r2 != 1) {
                    if (r2 == 2) {
                        quw quwVar3 = ja30Var.a;
                        uj50.b(objA);
                        quwVar2 = quwVar3;
                        str2 = (String) objA;
                        if (str2 == null) {
                            ja30Var.a = quwVar2;
                            ja30Var.e = 3;
                            objA = a(ja30Var);
                            if (objA == y5bVar) {
                                r2 = quwVar2;
                            } else {
                                r2 = quwVar2;
                                wm20VarA = m2lVar.b.a(m2lVar, m2l.e[0]);
                                ja30Var.a = r2;
                                ja30Var.b = objA;
                                ja30Var.e = 4;
                                if (wm20VarA.g(ja30Var, (String) objA) != y5bVar) {
                                    obj = objA;
                                    r1 = r2;
                                    str = (String) obj;
                                    r0 = r1;
                                }
                            }
                            quwVar = tuwVar;
                            return y5bVar;
                        }
                        r0 = quwVar2;
                        str = str2;
                        this.d = str;
                        r12 = r0;
                        r12.f(null);
                        return str;
                    }
                    if (r2 != 3) {
                        if (r2 != 4) {
                            ib5.a("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = ja30Var.b;
                        r0 = ja30Var.a;
                        try {
                            uj50.b(objA);
                            r1 = r0;
                            str = (String) obj;
                            r0 = r1;
                            this.d = str;
                            r12 = r0;
                            r12.f(null);
                            return str;
                        } catch (Throwable th) {
                            th = th;
                            r0.f(null);
                            throw th;
                        }
                    }
                    quw quwVar4 = ja30Var.a;
                    uj50.b(objA);
                    r2 = quwVar4;
                    r2 = quwVar2;
                    wm20VarA = m2lVar.b.a(m2lVar, m2l.e[0]);
                    ja30Var.a = r2;
                    ja30Var.b = objA;
                    ja30Var.e = 4;
                    if (wm20VarA.g(ja30Var, (String) objA) != y5bVar) {
                        obj = objA;
                        r1 = r2;
                        str = (String) obj;
                        r0 = r1;
                        this.d = str;
                        r12 = r0;
                        r12.f(null);
                        return str;
                    }
                    quwVar = tuwVar;
                    return y5bVar;
                }
                quw quwVar5 = ja30Var.a;
                uj50.b(objA);
                quwVar = quwVar5;
                quwVar = tuwVar;
                str = this.d;
                if (str == null) {
                    wm20 wm20VarA2 = m2lVar.b.a(m2lVar, m2l.e[0]);
                    ja30Var.a = quwVar;
                    ja30Var.e = 2;
                    Object objF = wm20VarA2.f(ja30Var);
                    if (objF != y5bVar) {
                        quwVar2 = quwVar;
                        objA = objF;
                        str2 = (String) objA;
                        if (str2 == null) {
                            ja30Var.a = quwVar2;
                            ja30Var.e = 3;
                            objA = a(ja30Var);
                            if (objA == y5bVar) {
                                r2 = quwVar2;
                            } else {
                                r2 = quwVar2;
                                wm20VarA = m2lVar.b.a(m2lVar, m2l.e[0]);
                                ja30Var.a = r2;
                                ja30Var.b = objA;
                                ja30Var.e = 4;
                                if (wm20VarA.g(ja30Var, (String) objA) != y5bVar) {
                                    obj = objA;
                                    r1 = r2;
                                    str = (String) obj;
                                    r0 = r1;
                                }
                            }
                        } else {
                            r0 = quwVar2;
                            str = str2;
                        }
                        this.d = str;
                        r12 = r0;
                    }
                    quwVar = tuwVar;
                    return y5bVar;
                }
                r12 = quwVar;
                r12.f(null);
                return str;
            } catch (Throwable th2) {
                th = th2;
                r0 = quwVar;
                r0.f(null);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            r0 = r2;
        }
    }
}
