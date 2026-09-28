package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class gq40 implements y5a0 {
    public static final gq40 b = new gq40();
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public final /* synthetic */ int a = 0;

    /* JADX WARN: Code duplicated, block: B:52:0x00ee A[Catch: all -> 0x0128, TRY_LEAVE, TryCatch #1 {all -> 0x0128, blocks: (B:50:0x00e8, B:52:0x00ee), top: B:75:0x00e8 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0119 A[LOOP:0: B:75:0x00e8->B:57:0x0119, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x0148  */
    /* JADX WARN: Code duplicated, block: B:71:0x015f  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0118 A[SYNTHETIC] */
    public static final Object b(wc80 wc80Var, blh blhVar, gx0 gx0Var, cxz cxzVar, boolean z, boolean z2, pz1 pz1Var) throws Throwable {
        f fVar;
        gx0 gx0Var2;
        wc80 wc80Var2;
        boolean z3;
        blh blhVar2;
        int i;
        cxz cxzVarA;
        gx0 gx0Var3;
        cxz cxzVar2;
        gx0 gx0Var4;
        Iterator<cxz> it;
        wc80 wc80Var3;
        gx0 gx0Var5;
        cxz next;
        boolean z4;
        boolean z5;
        f fVar2;
        blh blhVar3;
        cxz cxzVar3 = cxzVar;
        boolean z6 = z2;
        if (pz1Var instanceof f) {
            fVar = (f) pz1Var;
            int i2 = fVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.y = i2 - Integer.MIN_VALUE;
            } else {
                fVar = new f(pz1Var);
            }
        } else {
            fVar = new f(pz1Var);
        }
        Object obj = fVar.w;
        y5b y5bVar = y5b.a;
        int i3 = fVar.y;
        if (i3 == 0) {
            uj50.b(obj);
            if (!z6) {
                fVar.a = wc80Var;
                fVar.b = blhVar;
                fVar.c = gx0Var;
                fVar.d = cxzVar3;
                fVar.f = z;
                fVar.i = z6;
                fVar.y = 1;
                wc80Var.b(fVar, cxzVar3);
                return y5bVar;
            }
            gx0Var2 = gx0Var;
            wc80Var2 = wc80Var;
            z3 = z;
            blhVar2 = blhVar;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        uj50.b(obj);
                        return Unit.a;
                    }
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i4 = fVar.v;
                boolean z7 = fVar.i;
                boolean z8 = fVar.f;
                it = fVar.e;
                cxz cxzVar4 = fVar.d;
                gx0Var3 = fVar.c;
                blh blhVar4 = fVar.b;
                wc80 wc80Var4 = fVar.a;
                try {
                    uj50.b(obj);
                    i = i4;
                    z3 = z8;
                    cxzVar2 = cxzVar4;
                    blhVar2 = blhVar4;
                    wc80Var3 = wc80Var4;
                    z6 = z7;
                    gx0Var4 = gx0Var3;
                    while (it.hasNext()) {
                        try {
                            next = it.next();
                            fVar.a = wc80Var3;
                            fVar.b = blhVar2;
                            fVar.c = gx0Var4;
                            fVar.d = cxzVar2;
                            fVar.e = it;
                            fVar.f = z3;
                            fVar.i = z6;
                            fVar.v = i;
                            fVar.y = 2;
                            z4 = z3;
                            gx0Var5 = gx0Var4;
                            z5 = z6;
                            fVar2 = fVar;
                            blhVar3 = blhVar2;
                            try {
                                if (b(wc80Var3, blhVar3, gx0Var5, next, z4, z5, fVar2) == y5bVar) {
                                    return y5bVar;
                                }
                                blhVar2 = blhVar3;
                                gx0Var4 = gx0Var5;
                                z3 = z4;
                                z6 = z5;
                                fVar = fVar2;
                            } catch (Throwable th) {
                                th = th;
                                gx0Var3 = gx0Var5;
                                gx0Var3.removeLast();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            gx0Var5 = gx0Var4;
                        }
                    }
                    gx0Var4.removeLast();
                    cxzVar3 = cxzVar2;
                    wc80Var2 = wc80Var3;
                    if (z6) {
                        return Unit.a;
                    }
                    fVar.a = null;
                    fVar.b = null;
                    fVar.c = null;
                    fVar.d = null;
                    fVar.e = null;
                    fVar.f = z3;
                    fVar.i = z6;
                    fVar.y = 3;
                    wc80Var2.b(fVar, cxzVar3);
                    y5b y5bVar2 = y5b.a;
                    return y5bVar;
                } catch (Throwable th3) {
                    th = th3;
                    gx0Var3.removeLast();
                    throw th;
                }
            }
            boolean z9 = fVar.i;
            boolean z10 = fVar.f;
            cxz cxzVar5 = fVar.d;
            gx0Var2 = fVar.c;
            blhVar2 = fVar.b;
            wc80Var2 = fVar.a;
            uj50.b(obj);
            z6 = z9;
            z3 = z10;
            cxzVar3 = cxzVar5;
        }
        List<cxz> listListOrNull = blhVar2.listOrNull(cxzVar3);
        if (listListOrNull == null) {
            listListOrNull = m2g.a;
        }
        if (!listListOrNull.isEmpty()) {
            cxz cxzVar6 = cxzVar3;
            i = 0;
            while (true) {
                if (z3 && gx0Var2.contains(cxzVar6)) {
                    i08.a(alh.a(cxzVar3, "symlink cycle at "));
                    return null;
                }
                cxzVar6.getClass();
                cxz cxzVar7 = blhVar2.metadata(cxzVar6).c;
                if (cxzVar7 == null) {
                    cxzVarA = null;
                } else {
                    cxz cxzVarC = cxzVar6.c();
                    cxzVarC.getClass();
                    cxzVarA = i.a(cxzVarC, cxzVar7, false);
                }
                if (cxzVarA != null) {
                    i++;
                    cxzVar6 = cxzVarA;
                } else if (z3 || i == 0) {
                    gx0Var2.addLast(cxzVar6);
                    try {
                        Iterator<cxz> it2 = listListOrNull.iterator();
                        cxzVar2 = cxzVar3;
                        gx0Var4 = gx0Var2;
                        it = it2;
                        wc80Var3 = wc80Var2;
                        while (it.hasNext()) {
                            next = it.next();
                            fVar.a = wc80Var3;
                            fVar.b = blhVar2;
                            fVar.c = gx0Var4;
                            fVar.d = cxzVar2;
                            fVar.e = it;
                            fVar.f = z3;
                            fVar.i = z6;
                            fVar.v = i;
                            fVar.y = 2;
                            z4 = z3;
                            gx0Var5 = gx0Var4;
                            z5 = z6;
                            fVar2 = fVar;
                            blhVar3 = blhVar2;
                            if (b(wc80Var3, blhVar3, gx0Var5, next, z4, z5, fVar2) == y5bVar) {
                                return y5bVar;
                            }
                            blhVar2 = blhVar3;
                            gx0Var4 = gx0Var5;
                            z3 = z4;
                            z6 = z5;
                            fVar = fVar2;
                        }
                        gx0Var4.removeLast();
                        cxzVar3 = cxzVar2;
                        wc80Var2 = wc80Var3;
                    } catch (Throwable th4) {
                        th = th4;
                        gx0Var3 = gx0Var2;
                        gx0Var3.removeLast();
                        throw th;
                    }
                }
            }
        }
        if (z6) {
            return Unit.a;
        }
        fVar.a = null;
        fVar.b = null;
        fVar.c = null;
        fVar.d = null;
        fVar.e = null;
        fVar.f = z3;
        fVar.i = z6;
        fVar.y = 3;
        wc80Var2.b(fVar, cxzVar3);
        y5b y5bVar3 = y5b.a;
        return y5bVar;
    }

    @Override // defpackage.y5a0
    public boolean a(Object obj, Object obj2) {
        return obj == obj2;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "ReferentialEqualityPolicy";
            default:
                return super.toString();
        }
    }
}
