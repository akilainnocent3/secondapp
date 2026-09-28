package defpackage;

import com.sporty.android.core.model.dispatcher.ApplicationScope;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u350 {
    public final psm a;
    public final x450 b;
    public final d450 c;
    public final yqm d;
    public final v5b e;
    public final tuw f;

    @c0d(c = "com.sportybet.feature.remixbet.antest.RemixBetAnTestManager$reportAddToBetslip$1", f = "RemixBetAnTestManager.kt", l = {92}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return u350.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                yqm yqmVar = u350.this.d;
                x66<nfj0> x66Var = z76.w;
                String str = x66Var.a;
                String str2 = (String) CollectionsKt.n0(x66Var.b);
                this.a = 1;
                if (yqmVar.c(str, str2, null, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    static {
        ohp<Object>[] ohpVarArr = d450.e;
        int i = x450.b;
    }

    public u350(psm psmVar, x450 x450Var, d450 d450Var, yqm yqmVar, @ApplicationScope v5b v5bVar) {
        psmVar.getClass();
        yqmVar.getClass();
        v5bVar.getClass();
        this.a = psmVar;
        this.b = x450Var;
        this.c = d450Var;
        this.d = yqmVar;
        this.e = v5bVar;
        this.f = uuw.a();
    }

    public static a a(a aVar, boolean z, boolean z2) {
        return new a(aVar.a, aVar.b && !z, (!aVar.c || z || z2) ? false : true, aVar.d, aVar.e);
    }

    public static a e(nfj0 nfj0Var) {
        int iOrdinal = nfj0Var.ordinal();
        boolean z = false;
        boolean z2 = true;
        if (iOrdinal == 0) {
            return new a(z, z2, z2, 16);
        }
        int i = 24;
        if (iOrdinal == 1) {
            return new a(z2, z2, z2, i);
        }
        int i2 = 8;
        if (iOrdinal == 2) {
            return new a(z2, z, z, i2);
        }
        if (iOrdinal == 3) {
            return new a(z, z2, z2, i);
        }
        if (iOrdinal == 4) {
            return new a(z, z, z, i2);
        }
        uhc.a();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(boolean z, x1b x1bVar) {
        v350 v350Var;
        if (x1bVar instanceof v350) {
            v350Var = (v350) x1bVar;
            int i = v350Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                v350Var.d = i - Integer.MIN_VALUE;
            } else {
                v350Var = new v350(this, x1bVar);
            }
        } else {
            v350Var = new v350(this, x1bVar);
        }
        Object obj = v350Var.b;
        y5b y5bVar = y5b.a;
        int i2 = v350Var.d;
        if (i2 == 0) {
            uj50.b(obj);
            d450 d450Var = this.c;
            wm20 wm20VarA = d450Var.c.a(d450Var, d450.e[1]);
            Boolean bool = Boolean.TRUE;
            v350Var.a = z;
            v350Var.d = 1;
            if (wm20VarA.g(v350Var, bool) != y5bVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = v350Var.a;
        uj50.b(obj);
        if (!z) {
            return Unit.a;
        }
        v350Var.a = z;
        v350Var.d = 2;
        d450 d450Var2 = this.b.a;
        Object objG = d450Var2.b.a(d450Var2, d450.e[0]).g(v350Var, Boolean.TRUE);
        return objG == y5bVar ? y5bVar : objG;
    }

    public final void c() {
        ej5.c(this.e, null, null, new b(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ff A[Catch: all -> 0x008e, TryCatch #3 {all -> 0x008e, blocks: (B:73:0x015c, B:75:0x0160, B:77:0x0164, B:61:0x0125, B:65:0x0131, B:67:0x0135, B:69:0x013e, B:68:0x013a, B:31:0x0089, B:52:0x00e9, B:54:0x00ff, B:57:0x0107), top: B:105:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0120  */
    /* JADX WARN: Code duplicated, block: B:60:0x0122  */
    /* JADX WARN: Code duplicated, block: B:63:0x012d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:67:0x0135 A[Catch: all -> 0x008e, TryCatch #3 {all -> 0x008e, blocks: (B:73:0x015c, B:75:0x0160, B:77:0x0164, B:61:0x0125, B:65:0x0131, B:67:0x0135, B:69:0x013e, B:68:0x013a, B:31:0x0089, B:52:0x00e9, B:54:0x00ff, B:57:0x0107), top: B:105:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x013a A[Catch: all -> 0x008e, TryCatch #3 {all -> 0x008e, blocks: (B:73:0x015c, B:75:0x0160, B:77:0x0164, B:61:0x0125, B:65:0x0131, B:67:0x0135, B:69:0x013e, B:68:0x013a, B:31:0x0089, B:52:0x00e9, B:54:0x00ff, B:57:0x0107), top: B:105:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0157  */
    /* JADX WARN: Code duplicated, block: B:72:0x0158  */
    /* JADX WARN: Code duplicated, block: B:75:0x0160 A[Catch: all -> 0x008e, TryCatch #3 {all -> 0x008e, blocks: (B:73:0x015c, B:75:0x0160, B:77:0x0164, B:61:0x0125, B:65:0x0131, B:67:0x0135, B:69:0x013e, B:68:0x013a, B:31:0x0089, B:52:0x00e9, B:54:0x00ff, B:57:0x0107), top: B:105:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0164 A[Catch: all -> 0x008e, TRY_LEAVE, TryCatch #3 {all -> 0x008e, blocks: (B:73:0x015c, B:75:0x0160, B:77:0x0164, B:61:0x0125, B:65:0x0131, B:67:0x0135, B:69:0x013e, B:68:0x013a, B:31:0x0089, B:52:0x00e9, B:54:0x00ff, B:57:0x0107), top: B:105:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x017e  */
    /* JADX WARN: Code duplicated, block: B:83:0x018c A[Catch: all -> 0x0057, TRY_LEAVE, TryCatch #1 {all -> 0x0057, blocks: (B:18:0x004c, B:81:0x0184, B:83:0x018c), top: B:101:0x004c }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b8  */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x006f: MOVE (r2 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:112), block:B:26:0x006f */
    public final Object d(x1b x1bVar) throws Throwable {
        w350 w350Var;
        quw quwVar;
        quw quwVar2;
        quw quwVar3;
        Object objA;
        quw quwVar4;
        boolean zBooleanValue;
        Object objF;
        quw quwVar5;
        boolean z;
        boolean zG;
        a aVarA;
        Object objF2;
        boolean z2;
        boolean zG2;
        x66<nfj0> x66Var;
        yzh yzhVarJ;
        Object objC;
        boolean z3;
        boolean z4;
        nfj0 nfj0Var;
        Object objH;
        boolean z5;
        boolean z6;
        boolean z7;
        quw quwVar6;
        nfj0 nfj0Var2;
        wm20 wm20VarA;
        Boolean bool;
        nfj0 nfj0Var3;
        psm psmVar = this.a;
        d450 d450Var = this.c;
        rkd rkdVar = d450Var.d;
        if (x1bVar instanceof w350) {
            w350Var = (w350) x1bVar;
            int i = w350Var.y;
            if ((i & Integer.MIN_VALUE) != 0) {
                w350Var.y = i - Integer.MIN_VALUE;
            } else {
                w350Var = new w350(this, x1bVar);
            }
        } else {
            w350Var = new w350(this, x1bVar);
        }
        Object obj = w350Var.v;
        y5b y5bVar = y5b.a;
        int i2 = w350Var.y;
        yqm yqmVar = this.d;
        try {
            switch (i2) {
                case 0:
                    uj50.b(obj);
                    quwVar3 = this.f;
                    w350Var.a = quwVar3;
                    w350Var.y = 1;
                    if (quwVar3.d(w350Var) != y5bVar) {
                        try {
                            x450 x450Var = this.b;
                            w350Var.a = quwVar3;
                            w350Var.y = 2;
                            objA = x450Var.a(w350Var);
                            if (objA != y5bVar) {
                                quw quwVar7 = quwVar3;
                                obj = objA;
                                quwVar4 = quwVar7;
                                zBooleanValue = ((Boolean) obj).booleanValue();
                                wm20 wm20VarA2 = d450Var.c.a(d450Var, d450.e[1]);
                                w350Var.a = quwVar4;
                                w350Var.e = zBooleanValue;
                                w350Var.y = 3;
                                objF = wm20VarA2.f(w350Var);
                                if (objF != y5bVar) {
                                    quwVar5 = quwVar4;
                                    z = zBooleanValue;
                                    obj = objF;
                                    zG = Intrinsics.g(obj, Boolean.TRUE);
                                    aVarA = a(e(nfj0.CONTROL), z, zG);
                                    if (!psmVar.n() || psmVar.x()) {
                                        wm20 wm20VarA3 = rkdVar.a(d450Var, d450.e[2]);
                                        w350Var.a = quwVar5;
                                        w350Var.b = aVarA;
                                        w350Var.e = z;
                                        w350Var.f = zG;
                                        w350Var.y = 4;
                                        objF2 = wm20VarA3.f(w350Var);
                                        if (objF2 == y5bVar) {
                                            z2 = zG;
                                            obj = objF2;
                                            zG2 = Intrinsics.g(obj, Boolean.TRUE);
                                            if (!zG2 || !z) {
                                                x66Var = z76.w;
                                                if (zG2) {
                                                    yzhVarJ = yqmVar.m(x66Var, true);
                                                } else {
                                                    yzhVarJ = yqmVar.j(x66Var);
                                                }
                                                vl50 vl50VarF = bm50.f(yzhVarJ);
                                                w350Var.a = quwVar5;
                                                w350Var.b = null;
                                                w350Var.c = x66Var;
                                                w350Var.e = z;
                                                w350Var.f = z2;
                                                w350Var.i = zG2;
                                                w350Var.y = 5;
                                                objC = s0i.c(vl50VarF, w350Var);
                                                if (objC != y5bVar) {
                                                    z3 = z;
                                                    z4 = zG2;
                                                    obj = objC;
                                                    nfj0Var = (nfj0) obj;
                                                    if (nfj0Var == null) {
                                                        nfj0Var = nfj0.CONTROL;
                                                    }
                                                    if (z4) {
                                                        quwVar2 = quwVar5;
                                                    } else {
                                                        String str = x66Var.a;
                                                        w350Var.a = quwVar5;
                                                        w350Var.b = null;
                                                        w350Var.c = null;
                                                        w350Var.d = nfj0Var;
                                                        w350Var.e = z3;
                                                        w350Var.f = z2;
                                                        w350Var.i = z4;
                                                        w350Var.y = 6;
                                                        objH = yqmVar.h(str, w350Var);
                                                        if (objH != y5bVar) {
                                                            nfj0 nfj0Var4 = nfj0Var;
                                                            z5 = z4;
                                                            z6 = z2;
                                                            z7 = z3;
                                                            quwVar6 = quwVar5;
                                                            nfj0Var2 = nfj0Var4;
                                                            if (((Boolean) objH).booleanValue()) {
                                                                wm20VarA = rkdVar.a(d450Var, d450.e[2]);
                                                                bool = Boolean.TRUE;
                                                                w350Var.a = quwVar6;
                                                                w350Var.b = null;
                                                                w350Var.c = null;
                                                                w350Var.d = nfj0Var2;
                                                                w350Var.e = z7;
                                                                w350Var.f = z6;
                                                                w350Var.i = z5;
                                                                w350Var.y = 7;
                                                                if (wm20VarA.g(w350Var, bool) != y5bVar) {
                                                                    nfj0Var3 = nfj0Var2;
                                                                    quwVar2 = quwVar6;
                                                                    z3 = z7;
                                                                    nfj0Var = nfj0Var3;
                                                                }
                                                            } else {
                                                                nfj0Var = nfj0Var2;
                                                                quwVar2 = quwVar6;
                                                                z3 = z7;
                                                            }
                                                            z2 = z6;
                                                        }
                                                    }
                                                    aVarA = a(e(nfj0Var), z3, z2);
                                                    quwVar5 = quwVar2;
                                                }
                                            }
                                        }
                                    }
                                    quwVar5.f(null);
                                    return aVarA;
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            quwVar2 = quwVar3;
                            quwVar2.f(null);
                            throw th;
                        }
                    }
                    return y5bVar;
                case 1:
                    quw quwVar8 = w350Var.a;
                    uj50.b(obj);
                    quwVar3 = quwVar8;
                    x450 x450Var2 = this.b;
                    w350Var.a = quwVar3;
                    w350Var.y = 2;
                    objA = x450Var2.a(w350Var);
                    if (objA != y5bVar) {
                        quw quwVar9 = quwVar3;
                        obj = objA;
                        quwVar4 = quwVar9;
                        zBooleanValue = ((Boolean) obj).booleanValue();
                        wm20 wm20VarA4 = d450Var.c.a(d450Var, d450.e[1]);
                        w350Var.a = quwVar4;
                        w350Var.e = zBooleanValue;
                        w350Var.y = 3;
                        objF = wm20VarA4.f(w350Var);
                        if (objF != y5bVar) {
                            quwVar5 = quwVar4;
                            z = zBooleanValue;
                            obj = objF;
                            zG = Intrinsics.g(obj, Boolean.TRUE);
                            aVarA = a(e(nfj0.CONTROL), z, zG);
                            if (!psmVar.n()) {
                            }
                            wm20 wm20VarA5 = rkdVar.a(d450Var, d450.e[2]);
                            w350Var.a = quwVar5;
                            w350Var.b = aVarA;
                            w350Var.e = z;
                            w350Var.f = zG;
                            w350Var.y = 4;
                            objF2 = wm20VarA5.f(w350Var);
                            if (objF2 == y5bVar) {
                                z2 = zG;
                                obj = objF2;
                                zG2 = Intrinsics.g(obj, Boolean.TRUE);
                                if (!zG2) {
                                }
                                x66Var = z76.w;
                                if (zG2) {
                                    yzhVarJ = yqmVar.m(x66Var, true);
                                } else {
                                    yzhVarJ = yqmVar.j(x66Var);
                                }
                                vl50 vl50VarF2 = bm50.f(yzhVarJ);
                                w350Var.a = quwVar5;
                                w350Var.b = null;
                                w350Var.c = x66Var;
                                w350Var.e = z;
                                w350Var.f = z2;
                                w350Var.i = zG2;
                                w350Var.y = 5;
                                objC = s0i.c(vl50VarF2, w350Var);
                                if (objC != y5bVar) {
                                    z3 = z;
                                    z4 = zG2;
                                    obj = objC;
                                    nfj0Var = (nfj0) obj;
                                    if (nfj0Var == null) {
                                        nfj0Var = nfj0.CONTROL;
                                    }
                                    if (z4) {
                                        String str2 = x66Var.a;
                                        w350Var.a = quwVar5;
                                        w350Var.b = null;
                                        w350Var.c = null;
                                        w350Var.d = nfj0Var;
                                        w350Var.e = z3;
                                        w350Var.f = z2;
                                        w350Var.i = z4;
                                        w350Var.y = 6;
                                        objH = yqmVar.h(str2, w350Var);
                                        if (objH != y5bVar) {
                                            nfj0 nfj0Var5 = nfj0Var;
                                            z5 = z4;
                                            z6 = z2;
                                            z7 = z3;
                                            quwVar6 = quwVar5;
                                            nfj0Var2 = nfj0Var5;
                                            if (((Boolean) objH).booleanValue()) {
                                                wm20VarA = rkdVar.a(d450Var, d450.e[2]);
                                                bool = Boolean.TRUE;
                                                w350Var.a = quwVar6;
                                                w350Var.b = null;
                                                w350Var.c = null;
                                                w350Var.d = nfj0Var2;
                                                w350Var.e = z7;
                                                w350Var.f = z6;
                                                w350Var.i = z5;
                                                w350Var.y = 7;
                                                if (wm20VarA.g(w350Var, bool) != y5bVar) {
                                                    nfj0Var3 = nfj0Var2;
                                                    quwVar2 = quwVar6;
                                                    z3 = z7;
                                                    nfj0Var = nfj0Var3;
                                                }
                                            } else {
                                                nfj0Var = nfj0Var2;
                                                quwVar2 = quwVar6;
                                                z3 = z7;
                                            }
                                            z2 = z6;
                                        }
                                    } else {
                                        quwVar2 = quwVar5;
                                    }
                                    aVarA = a(e(nfj0Var), z3, z2);
                                    quwVar5 = quwVar2;
                                    quwVar5.f(null);
                                    return aVarA;
                                }
                            }
                        }
                        break;
                    }
                    return y5bVar;
                case 2:
                    quwVar4 = w350Var.a;
                    try {
                        uj50.b(obj);
                        zBooleanValue = ((Boolean) obj).booleanValue();
                        wm20 wm20VarA6 = d450Var.c.a(d450Var, d450.e[1]);
                        w350Var.a = quwVar4;
                        w350Var.e = zBooleanValue;
                        w350Var.y = 3;
                        objF = wm20VarA6.f(w350Var);
                        if (objF != y5bVar) {
                            quwVar5 = quwVar4;
                            z = zBooleanValue;
                            obj = objF;
                            zG = Intrinsics.g(obj, Boolean.TRUE);
                            aVarA = a(e(nfj0.CONTROL), z, zG);
                            if (!psmVar.n()) {
                            }
                            wm20 wm20VarA7 = rkdVar.a(d450Var, d450.e[2]);
                            w350Var.a = quwVar5;
                            w350Var.b = aVarA;
                            w350Var.e = z;
                            w350Var.f = zG;
                            w350Var.y = 4;
                            objF2 = wm20VarA7.f(w350Var);
                            if (objF2 == y5bVar) {
                                z2 = zG;
                                obj = objF2;
                                zG2 = Intrinsics.g(obj, Boolean.TRUE);
                                if (!zG2) {
                                }
                                x66Var = z76.w;
                                if (zG2) {
                                    yzhVarJ = yqmVar.m(x66Var, true);
                                } else {
                                    yzhVarJ = yqmVar.j(x66Var);
                                }
                                vl50 vl50VarF3 = bm50.f(yzhVarJ);
                                w350Var.a = quwVar5;
                                w350Var.b = null;
                                w350Var.c = x66Var;
                                w350Var.e = z;
                                w350Var.f = z2;
                                w350Var.i = zG2;
                                w350Var.y = 5;
                                objC = s0i.c(vl50VarF3, w350Var);
                                if (objC != y5bVar) {
                                    z3 = z;
                                    z4 = zG2;
                                    obj = objC;
                                    nfj0Var = (nfj0) obj;
                                    if (nfj0Var == null) {
                                        nfj0Var = nfj0.CONTROL;
                                    }
                                    if (z4) {
                                        String str3 = x66Var.a;
                                        w350Var.a = quwVar5;
                                        w350Var.b = null;
                                        w350Var.c = null;
                                        w350Var.d = nfj0Var;
                                        w350Var.e = z3;
                                        w350Var.f = z2;
                                        w350Var.i = z4;
                                        w350Var.y = 6;
                                        objH = yqmVar.h(str3, w350Var);
                                        if (objH != y5bVar) {
                                            nfj0 nfj0Var6 = nfj0Var;
                                            z5 = z4;
                                            z6 = z2;
                                            z7 = z3;
                                            quwVar6 = quwVar5;
                                            nfj0Var2 = nfj0Var6;
                                            if (((Boolean) objH).booleanValue()) {
                                                wm20VarA = rkdVar.a(d450Var, d450.e[2]);
                                                bool = Boolean.TRUE;
                                                w350Var.a = quwVar6;
                                                w350Var.b = null;
                                                w350Var.c = null;
                                                w350Var.d = nfj0Var2;
                                                w350Var.e = z7;
                                                w350Var.f = z6;
                                                w350Var.i = z5;
                                                w350Var.y = 7;
                                                if (wm20VarA.g(w350Var, bool) != y5bVar) {
                                                    nfj0Var3 = nfj0Var2;
                                                    quwVar2 = quwVar6;
                                                    z3 = z7;
                                                    nfj0Var = nfj0Var3;
                                                }
                                            } else {
                                                nfj0Var = nfj0Var2;
                                                quwVar2 = quwVar6;
                                                z3 = z7;
                                            }
                                            z2 = z6;
                                        }
                                    } else {
                                        quwVar2 = quwVar5;
                                    }
                                    aVarA = a(e(nfj0Var), z3, z2);
                                    quwVar5 = quwVar2;
                                    quwVar5.f(null);
                                    return aVarA;
                                }
                            }
                            break;
                        }
                        return y5bVar;
                    } catch (Throwable th2) {
                        quwVar2 = quwVar4;
                        th = th2;
                        quwVar2.f(null);
                        throw th;
                    }
                case 3:
                    z = w350Var.e;
                    quwVar5 = w350Var.a;
                    try {
                        uj50.b(obj);
                        zG = Intrinsics.g(obj, Boolean.TRUE);
                        aVarA = a(e(nfj0.CONTROL), z, zG);
                        if (!psmVar.n()) {
                            break;
                        }
                        wm20 wm20VarA8 = rkdVar.a(d450Var, d450.e[2]);
                        w350Var.a = quwVar5;
                        w350Var.b = aVarA;
                        w350Var.e = z;
                        w350Var.f = zG;
                        w350Var.y = 4;
                        objF2 = wm20VarA8.f(w350Var);
                        if (objF2 == y5bVar) {
                            z2 = zG;
                            obj = objF2;
                            zG2 = Intrinsics.g(obj, Boolean.TRUE);
                            if (!zG2) {
                            }
                            x66Var = z76.w;
                            if (zG2) {
                                yzhVarJ = yqmVar.m(x66Var, true);
                            } else {
                                yzhVarJ = yqmVar.j(x66Var);
                            }
                            vl50 vl50VarF4 = bm50.f(yzhVarJ);
                            w350Var.a = quwVar5;
                            w350Var.b = null;
                            w350Var.c = x66Var;
                            w350Var.e = z;
                            w350Var.f = z2;
                            w350Var.i = zG2;
                            w350Var.y = 5;
                            objC = s0i.c(vl50VarF4, w350Var);
                            if (objC != y5bVar) {
                                z3 = z;
                                z4 = zG2;
                                obj = objC;
                                nfj0Var = (nfj0) obj;
                                if (nfj0Var == null) {
                                    nfj0Var = nfj0.CONTROL;
                                }
                                if (z4) {
                                    String str4 = x66Var.a;
                                    w350Var.a = quwVar5;
                                    w350Var.b = null;
                                    w350Var.c = null;
                                    w350Var.d = nfj0Var;
                                    w350Var.e = z3;
                                    w350Var.f = z2;
                                    w350Var.i = z4;
                                    w350Var.y = 6;
                                    objH = yqmVar.h(str4, w350Var);
                                    if (objH != y5bVar) {
                                        nfj0 nfj0Var7 = nfj0Var;
                                        z5 = z4;
                                        z6 = z2;
                                        z7 = z3;
                                        quwVar6 = quwVar5;
                                        nfj0Var2 = nfj0Var7;
                                        if (((Boolean) objH).booleanValue()) {
                                            wm20VarA = rkdVar.a(d450Var, d450.e[2]);
                                            bool = Boolean.TRUE;
                                            w350Var.a = quwVar6;
                                            w350Var.b = null;
                                            w350Var.c = null;
                                            w350Var.d = nfj0Var2;
                                            w350Var.e = z7;
                                            w350Var.f = z6;
                                            w350Var.i = z5;
                                            w350Var.y = 7;
                                            if (wm20VarA.g(w350Var, bool) != y5bVar) {
                                                nfj0Var3 = nfj0Var2;
                                                quwVar2 = quwVar6;
                                                z3 = z7;
                                                nfj0Var = nfj0Var3;
                                            }
                                        } else {
                                            nfj0Var = nfj0Var2;
                                            quwVar2 = quwVar6;
                                            z3 = z7;
                                        }
                                        z2 = z6;
                                    }
                                } else {
                                    quwVar2 = quwVar5;
                                }
                                aVarA = a(e(nfj0Var), z3, z2);
                                quwVar5 = quwVar2;
                                quwVar5.f(null);
                                return aVarA;
                            }
                        }
                        return y5bVar;
                    } catch (Throwable th3) {
                        th = th3;
                        quwVar2 = quwVar5;
                        quwVar2.f(null);
                        throw th;
                    }
                case 4:
                    boolean z8 = w350Var.f;
                    boolean z9 = w350Var.e;
                    a aVar = w350Var.b;
                    quw quwVar10 = w350Var.a;
                    uj50.b(obj);
                    z2 = z8;
                    z = z9;
                    aVarA = aVar;
                    quwVar5 = quwVar10;
                    zG2 = Intrinsics.g(obj, Boolean.TRUE);
                    if (!zG2) {
                    }
                    x66Var = z76.w;
                    if (zG2) {
                        yzhVarJ = yqmVar.m(x66Var, true);
                    } else {
                        yzhVarJ = yqmVar.j(x66Var);
                    }
                    vl50 vl50VarF5 = bm50.f(yzhVarJ);
                    w350Var.a = quwVar5;
                    w350Var.b = null;
                    w350Var.c = x66Var;
                    w350Var.e = z;
                    w350Var.f = z2;
                    w350Var.i = zG2;
                    w350Var.y = 5;
                    objC = s0i.c(vl50VarF5, w350Var);
                    if (objC != y5bVar) {
                        z3 = z;
                        z4 = zG2;
                        obj = objC;
                        nfj0Var = (nfj0) obj;
                        if (nfj0Var == null) {
                            nfj0Var = nfj0.CONTROL;
                        }
                        if (z4) {
                            String str5 = x66Var.a;
                            w350Var.a = quwVar5;
                            w350Var.b = null;
                            w350Var.c = null;
                            w350Var.d = nfj0Var;
                            w350Var.e = z3;
                            w350Var.f = z2;
                            w350Var.i = z4;
                            w350Var.y = 6;
                            objH = yqmVar.h(str5, w350Var);
                            if (objH != y5bVar) {
                                nfj0 nfj0Var8 = nfj0Var;
                                z5 = z4;
                                z6 = z2;
                                z7 = z3;
                                quwVar6 = quwVar5;
                                nfj0Var2 = nfj0Var8;
                                if (((Boolean) objH).booleanValue()) {
                                    wm20VarA = rkdVar.a(d450Var, d450.e[2]);
                                    bool = Boolean.TRUE;
                                    w350Var.a = quwVar6;
                                    w350Var.b = null;
                                    w350Var.c = null;
                                    w350Var.d = nfj0Var2;
                                    w350Var.e = z7;
                                    w350Var.f = z6;
                                    w350Var.i = z5;
                                    w350Var.y = 7;
                                    if (wm20VarA.g(w350Var, bool) != y5bVar) {
                                        nfj0Var3 = nfj0Var2;
                                        quwVar2 = quwVar6;
                                        z3 = z7;
                                        nfj0Var = nfj0Var3;
                                    }
                                } else {
                                    nfj0Var = nfj0Var2;
                                    quwVar2 = quwVar6;
                                    z3 = z7;
                                }
                                z2 = z6;
                            }
                        } else {
                            quwVar2 = quwVar5;
                        }
                        aVarA = a(e(nfj0Var), z3, z2);
                        quwVar5 = quwVar2;
                        quwVar5.f(null);
                        return aVarA;
                    }
                    return y5bVar;
                case 5:
                    z4 = w350Var.i;
                    z2 = w350Var.f;
                    boolean z10 = w350Var.e;
                    x66<nfj0> x66Var2 = w350Var.c;
                    quw quwVar11 = w350Var.a;
                    uj50.b(obj);
                    z3 = z10;
                    quwVar5 = quwVar11;
                    x66Var = x66Var2;
                    nfj0Var = (nfj0) obj;
                    if (nfj0Var == null) {
                        nfj0Var = nfj0.CONTROL;
                    }
                    if (z4) {
                        String str6 = x66Var.a;
                        w350Var.a = quwVar5;
                        w350Var.b = null;
                        w350Var.c = null;
                        w350Var.d = nfj0Var;
                        w350Var.e = z3;
                        w350Var.f = z2;
                        w350Var.i = z4;
                        w350Var.y = 6;
                        objH = yqmVar.h(str6, w350Var);
                        if (objH != y5bVar) {
                            nfj0 nfj0Var9 = nfj0Var;
                            z5 = z4;
                            z6 = z2;
                            z7 = z3;
                            quwVar6 = quwVar5;
                            nfj0Var2 = nfj0Var9;
                            if (((Boolean) objH).booleanValue()) {
                                wm20VarA = rkdVar.a(d450Var, d450.e[2]);
                                bool = Boolean.TRUE;
                                w350Var.a = quwVar6;
                                w350Var.b = null;
                                w350Var.c = null;
                                w350Var.d = nfj0Var2;
                                w350Var.e = z7;
                                w350Var.f = z6;
                                w350Var.i = z5;
                                w350Var.y = 7;
                                if (wm20VarA.g(w350Var, bool) != y5bVar) {
                                    nfj0Var3 = nfj0Var2;
                                    quwVar2 = quwVar6;
                                    z3 = z7;
                                    nfj0Var = nfj0Var3;
                                }
                            } else {
                                nfj0Var = nfj0Var2;
                                quwVar2 = quwVar6;
                                z3 = z7;
                            }
                            z2 = z6;
                        }
                        return y5bVar;
                    }
                    quwVar2 = quwVar5;
                    aVarA = a(e(nfj0Var), z3, z2);
                    quwVar5 = quwVar2;
                    quwVar5.f(null);
                    return aVarA;
                case 6:
                    boolean z11 = w350Var.i;
                    boolean z12 = w350Var.f;
                    boolean z13 = w350Var.e;
                    nfj0 nfj0Var10 = w350Var.d;
                    quwVar6 = w350Var.a;
                    try {
                        uj50.b(obj);
                        z5 = z11;
                        z6 = z12;
                        z7 = z13;
                        nfj0Var2 = nfj0Var10;
                        objH = obj;
                        if (((Boolean) objH).booleanValue()) {
                            wm20VarA = rkdVar.a(d450Var, d450.e[2]);
                            bool = Boolean.TRUE;
                            w350Var.a = quwVar6;
                            w350Var.b = null;
                            w350Var.c = null;
                            w350Var.d = nfj0Var2;
                            w350Var.e = z7;
                            w350Var.f = z6;
                            w350Var.i = z5;
                            w350Var.y = 7;
                            if (wm20VarA.g(w350Var, bool) != y5bVar) {
                                nfj0Var3 = nfj0Var2;
                                quwVar2 = quwVar6;
                                z3 = z7;
                                nfj0Var = nfj0Var3;
                            }
                            return y5bVar;
                        }
                        nfj0Var = nfj0Var2;
                        quwVar2 = quwVar6;
                        z3 = z7;
                        z2 = z6;
                        aVarA = a(e(nfj0Var), z3, z2);
                        quwVar5 = quwVar2;
                        quwVar5.f(null);
                        return aVarA;
                    } catch (Throwable th4) {
                        th = th4;
                        quwVar2 = quwVar6;
                        quwVar2.f(null);
                        throw th;
                    }
                case 7:
                    z6 = w350Var.f;
                    z7 = w350Var.e;
                    nfj0Var3 = w350Var.d;
                    quwVar2 = w350Var.a;
                    try {
                        uj50.b(obj);
                        z3 = z7;
                        nfj0Var = nfj0Var3;
                        z2 = z6;
                        aVarA = a(e(nfj0Var), z3, z2);
                        quwVar5 = quwVar2;
                        quwVar5.f(null);
                        return aVarA;
                    } catch (Throwable th5) {
                        th = th5;
                        quwVar2.f(null);
                        throw th;
                    }
                default:
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (Throwable th6) {
            th = th6;
            quwVar2 = quwVar;
        }
    }

    public static final class a {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;

        public /* synthetic */ a(boolean z, boolean z2, boolean z3, int i) {
            this(z, z2, z3, (i & 8) == 0, (i & 16) == 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + mtg0.a(mtg0.a(mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sbA = cwz.a("Configuration(showTicketDetailButton=", ", showRemixBetTutorial=", ", showRemixBetRedDot=", this.a, this.b);
            nng.a(", useControlButtonLayout=", ", dismissTutorialOnWinningRemixBetClick=", sbA, this.c, this.d);
            return mq0.a(sbA, this.e, ")");
        }

        public a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
            this.e = z5;
        }
    }
}
