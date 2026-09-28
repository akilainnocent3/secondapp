package defpackage;

import android.accounts.Account;
import com.sporty.android.core.model.dispatcher.ApplicationScope;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class tz implements i8, hz {
    public final odd a;
    public final a86 b;
    public final f76 c;
    public final mfz d;
    public final v5b e;
    public final AtomicLong f;
    public final Object i;
    public final tuw v;
    public final wwd0 w;
    public final v340 y;
    public final v340 z;

    @c0d(c = "com.sporty.android.core.antest.repository.AnTestRepositoryImpl$onAccountChange$1", f = "AnTestRepositoryImpl.kt", l = {281, 243}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public quw a;
        public tz b;
        public Account c;
        public long d;
        public int e;
        public final /* synthetic */ long i;
        public final /* synthetic */ Account v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, Account account, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.i = j;
            this.v = account;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return tz.this.new a(this.i, this.v, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x007d A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:27:0x0073, B:29:0x007d, B:31:0x0083, B:35:0x0089, B:36:0x0092), top: B:52:0x0073, outer: #2 }] */
        /* JADX WARN: Code duplicated, block: B:31:0x0083 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:27:0x0073, B:29:0x007d, B:31:0x0083, B:35:0x0089, B:36:0x0092), top: B:52:0x0073, outer: #2 }] */
        /* JADX WARN: Code duplicated, block: B:34:0x0088  */
        /* JADX WARN: Code duplicated, block: B:52:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) throws Throwable {
            quw quwVar;
            long j;
            Account account;
            tz tzVar;
            quw quwVar2;
            long j2;
            Account account2;
            String str;
            y5b y5bVar = y5b.a;
            int i = this.e;
            try {
                if (i == 0) {
                    uj50.b(obj);
                    tz tzVar2 = tz.this;
                    quwVar = tzVar2.v;
                    j = this.i;
                    account = this.v;
                    this.a = quwVar;
                    this.b = tzVar2;
                    this.c = account;
                    this.d = j;
                    this.e = 1;
                    if (quwVar.d(this) != y5bVar) {
                        tzVar = tzVar2;
                    }
                    return y5bVar;
                }
                if (i != 1) {
                    if (i != 2) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j2 = this.d;
                    account2 = this.c;
                    tzVar = this.b;
                    quwVar2 = this.a;
                    try {
                        uj50.b(obj);
                        synchronized (tzVar.i) {
                            try {
                                if (tzVar.f.get() == j2) {
                                    wwd0 wwd0Var = tzVar.w;
                                    if (account2 != null) {
                                        str = account2.name;
                                    } else {
                                        str = null;
                                    }
                                    ex exVar = new ex(j2, str);
                                    wwd0Var.getClass();
                                    wwd0Var.k(null, exVar);
                                }
                                Unit unit = Unit.a;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        Unit unit2 = Unit.a;
                        quwVar2.f(null);
                        return Unit.a;
                    } catch (Throwable th2) {
                        th = th2;
                        quwVar2.f(null);
                        throw th;
                    }
                }
                j = this.d;
                Account account3 = this.c;
                tzVar = this.b;
                quw quwVar3 = this.a;
                uj50.b(obj);
                account = account3;
                quwVar = quwVar3;
                if (tzVar.f.get() == j) {
                    f76 f76Var = tzVar.c;
                    this.a = quwVar;
                    this.b = tzVar;
                    this.c = account;
                    this.d = j;
                    this.e = 2;
                    try {
                        if (f76Var.a.c(this) != y5bVar) {
                            quwVar2 = quwVar;
                            j2 = j;
                            account2 = account;
                            synchronized (tzVar.i) {
                                if (tzVar.f.get() == j2) {
                                    wwd0 wwd0Var2 = tzVar.w;
                                    if (account2 != null) {
                                        str = account2.name;
                                    } else {
                                        str = null;
                                    }
                                    ex exVar2 = new ex(j2, str);
                                    wwd0Var2.getClass();
                                    wwd0Var2.k(null, exVar2);
                                }
                                Unit unit3 = Unit.a;
                            }
                        }
                        return y5bVar;
                    } catch (Throwable th3) {
                        th = th3;
                        quwVar2 = quwVar;
                        quwVar2.f(null);
                        throw th;
                    }
                }
                quwVar2 = quwVar;
                Unit unit4 = Unit.a;
                quwVar2.f(null);
                return Unit.a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @c0d(c = "com.sporty.android.core.antest.repository.AnTestRepositoryImpl", f = "AnTestRepositoryImpl.kt", l = {196, 198}, m = "reportConversion", v = 2)
    public static final class b extends x1b {
        public String a;
        public String b;
        public String c;
        public /* synthetic */ Object d;
        public int f;

        public b(v1b<? super b> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return tz.this.c(null, null, null, this);
        }
    }

    public tz(uqm uqmVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar, a86 a86Var, f76 f76Var, mfz mfzVar, @ApplicationScope v5b v5bVar) {
        uqmVar.getClass();
        a86Var.getClass();
        f76Var.getClass();
        mfzVar.getClass();
        v5bVar.getClass();
        this.a = oddVar;
        this.b = a86Var;
        this.c = f76Var;
        this.d = mfzVar;
        this.e = v5bVar;
        this.f = new AtomicLong(0L);
        this.i = new Object();
        this.v = uuw.a();
        Account account = uqmVar.getAccount();
        wwd0 wwd0VarA = xwd0.a(new ex(0L, account != null ? account.name : null));
        this.w = wwd0VarA;
        this.y = e1i.b(wwd0VarA);
        this.z = e1i.e(new yzh(uzh.b(new kfz(mfzVar.a.e())), new lfz(3, null)), v5bVar, new mwd0(5000L, Long.MAX_VALUE), Boolean.FALSE);
        uqmVar.addAccountChangeListener(this);
    }

    @Override // defpackage.hz
    public final ifz a() {
        return new ifz(new yzh(this.d.a.a(), new jfz(3, null)));
    }

    @Override // defpackage.hz
    public final v340 b() {
        return this.z;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008a, code lost:
    
        if (r13 == r0) goto L36;
     */
    @Override // defpackage.hz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r10, java.lang.String r11, java.lang.String r12, defpackage.v1b<? super kotlin.Unit> r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof tz.b
            if (r0 == 0) goto L14
            r0 = r13
            tz$b r0 = (tz.b) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f = r1
        L12:
            r8 = r0
            goto L1a
        L14:
            tz$b r0 = new tz$b
            r0.<init>(r13)
            goto L12
        L1a:
            java.lang.Object r13 = r8.d
            y5b r0 = defpackage.y5b.a
            int r1 = r8.f
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L44
            if (r1 == r3) goto L38
            if (r1 != r2) goto L32
            java.lang.String r10 = r8.a
            defpackage.uj50.b(r13)     // Catch: java.lang.Exception -> L2f
            goto L8d
        L2f:
            r0 = move-exception
            r9 = r0
            goto L90
        L32:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            return r4
        L38:
            java.lang.String r12 = r8.c
            java.lang.String r11 = r8.b
            java.lang.String r10 = r8.a
            defpackage.uj50.b(r13)     // Catch: java.lang.Exception -> L2f
        L41:
            r6 = r11
            r7 = r12
            goto L5a
        L44:
            defpackage.uj50.b(r13)
            f76 r13 = r9.c     // Catch: java.lang.Exception -> L2f
            r8.a = r10     // Catch: java.lang.Exception -> L2f
            r8.b = r11     // Catch: java.lang.Exception -> L2f
            r8.c = r12     // Catch: java.lang.Exception -> L2f
            r8.f = r3     // Catch: java.lang.Exception -> L2f
            wa6 r13 = r13.a     // Catch: java.lang.Exception -> L2f
            java.lang.Object r13 = r13.b(r10, r8)     // Catch: java.lang.Exception -> L2f
            if (r13 != r0) goto L41
            goto L8c
        L5a:
            bb6 r13 = (defpackage.bb6) r13     // Catch: java.lang.Exception -> L2f
            if (r13 == 0) goto Lb1
            boolean r11 = r13.f     // Catch: java.lang.Exception -> L2f
            if (r11 == 0) goto L63
            goto L64
        L63:
            r13 = r4
        L64:
            if (r13 == 0) goto Lb1
            a86 r9 = r9.b     // Catch: java.lang.Exception -> L2f
            int r11 = r13.b     // Catch: java.lang.Exception -> L2f
            r12 = r2
            java.lang.Integer r2 = new java.lang.Integer     // Catch: java.lang.Exception -> L2f
            r2.<init>(r11)     // Catch: java.lang.Exception -> L2f
            java.lang.String r3 = r13.a     // Catch: java.lang.Exception -> L2f
            int r11 = r13.c     // Catch: java.lang.Exception -> L2f
            r1 = r4
            java.lang.Integer r4 = new java.lang.Integer     // Catch: java.lang.Exception -> L2f
            r4.<init>(r11)     // Catch: java.lang.Exception -> L2f
            java.lang.String r5 = r13.e     // Catch: java.lang.Exception -> L2f
            r8.a = r10     // Catch: java.lang.Exception -> L2f
            r8.b = r1     // Catch: java.lang.Exception -> L2f
            r8.c = r1     // Catch: java.lang.Exception -> L2f
            r8.f = r12     // Catch: java.lang.Exception -> L2f
            fx r1 = r9.a     // Catch: java.lang.Exception -> L2f
            java.lang.Object r13 = r1.d(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L2f
            if (r13 != r0) goto L8d
        L8c:
            return r0
        L8d:
            com.sporty.android.common.network.data.BaseResponse r13 = (com.sporty.android.common.network.data.BaseResponse) r13     // Catch: java.lang.Exception -> L2f
            goto Lb1
        L90:
            itf0$a r11 = defpackage.itf0.a
            java.lang.String r12 = "SB_AN_TEST"
            r11.q(r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r10)
            java.lang.String r10 = " reportConversion exception: "
            r12.append(r10)
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r10 = 0
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r11.a(r9, r10)
        Lb1:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tz.c(java.lang.String, java.lang.String, java.lang.String, v1b):java.lang.Object");
    }

    @Override // defpackage.hz
    public final rz d(x66 x66Var) {
        x66Var.getClass();
        String str = x66Var.a;
        mfz mfzVar = this.d;
        mfzVar.getClass();
        str.getClass();
        return new rz(r0i.f(new yzh(uzh.b(new kfz(mfzVar.a.e())), new lfz(3, null)), new ffz(null, mfzVar, str)), x66Var);
    }

    @Override // defpackage.hz
    public final v340 e() {
        return this.y;
    }

    @Override // defpackage.hz
    public final Object f(String str, a4d a4dVar) {
        return this.d.a.f(str, a4dVar);
    }

    @Override // defpackage.hz
    public final Object g(boolean z, e4d e4dVar) {
        return this.d.a.b(new nfz(z), e4dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.hz
    public final Object h(String str, x1b x1bVar) {
        jz jzVar;
        if (x1bVar instanceof jz) {
            jzVar = (jz) x1bVar;
            int i = jzVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jzVar.d = i - Integer.MIN_VALUE;
            } else {
                jzVar = new jz(this, x1bVar);
            }
        } else {
            jzVar = new jz(this, x1bVar);
        }
        Object objB = jzVar.b;
        y5b y5bVar = y5b.a;
        int i2 = jzVar.d;
        boolean z = false;
        try {
            if (i2 == 0) {
                uj50.b(objB);
                f76 f76Var = this.c;
                jzVar.a = str;
                jzVar.d = 1;
                objB = f76Var.a.b(str, jzVar);
                if (objB == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = jzVar.a;
                uj50.b(objB);
            }
            bb6 bb6Var = (bb6) objB;
            if (bb6Var != null) {
                z = bb6Var.f;
            }
        } catch (Exception e) {
            itf0.a aVar = itf0.a;
            aVar.q("SB_AN_TEST");
            aVar.a(str + " canConvert exception: " + e, new Object[0]);
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0081 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r3 == r1) goto L28;
     */
    @Override // defpackage.hz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.x66 r8, boolean r9, defpackage.x1b r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.mz
            if (r0 == 0) goto L13
            r0 = r10
            mz r0 = (defpackage.mz) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            mz r0 = new mz
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.e
            y5b r1 = defpackage.y5b.a
            int r2 = r0.i
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r3) goto L31
            if (r2 != r4) goto L2b
            defpackage.uj50.b(r10)
            return r10
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r5
        L31:
            boolean r9 = r0.d
            java.lang.Class r8 = r0.c
            java.lang.String r2 = r0.b
            x66 r3 = r0.a
            defpackage.uj50.b(r10)
            r6 = r10
            r10 = r8
            r8 = r3
            r3 = r6
            goto L5b
        L41:
            defpackage.uj50.b(r10)
            java.lang.String r2 = r8.a
            java.lang.Class<E extends java.lang.Enum<E> & csm<E>> r10 = r8.c
            if (r9 == 0) goto L66
            r0.a = r8
            r0.b = r2
            r0.c = r10
            r0.d = r9
            r0.i = r3
            java.lang.Object r3 = r7.p(r2, r0)
            if (r3 != r1) goto L5b
            goto L80
        L5b:
            bb6 r3 = (defpackage.bb6) r3
            if (r3 == 0) goto L66
            java.lang.String r7 = r3.d
            java.lang.Enum r7 = defpackage.pwn.e(r10, r7)
            return r7
        L66:
            nz r10 = new nz
            r10.<init>(r7, r2, r5)
            r0.a = r5
            r0.b = r5
            r0.c = r5
            r0.d = r9
            r0.i = r4
            lz r9 = new lz
            r9.<init>(r4, r5)
            java.lang.Enum r7 = r7.o(r8, r10, r9, r0)
            if (r7 != r1) goto L81
        L80:
            return r1
        L81:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tz.i(x66, boolean, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.hz
    public final Object j(x66 x66Var, x1b x1bVar) {
        oz ozVar;
        String str;
        Class cls;
        Object objP;
        Class cls2;
        bb6 bb6Var;
        if (x1bVar instanceof oz) {
            ozVar = (oz) x1bVar;
            int i = ozVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                ozVar.i = i - Integer.MIN_VALUE;
            } else {
                ozVar = new oz(this, x1bVar);
            }
        } else {
            ozVar = new oz(this, x1bVar);
        }
        Object obj = ozVar.e;
        Object obj2 = y5b.a;
        int i2 = ozVar.i;
        if (i2 == 0) {
            uj50.b(obj);
            str = x66Var.a;
            cls = x66Var.c;
            ozVar.a = x66Var;
            ozVar.b = str;
            ozVar.c = cls;
            ozVar.i = 1;
            objP = p(str, ozVar);
            if (objP != obj2) {
            }
            return obj2;
        }
        if (i2 == 1) {
            Class cls3 = ozVar.c;
            str = ozVar.b;
            x66 x66Var2 = ozVar.a;
            uj50.b(obj);
            cls = cls3;
            x66Var = x66Var2;
            objP = obj;
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    uj50.b(obj);
                    return obj;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bb6Var = ozVar.d;
            cls2 = ozVar.c;
            uj50.b(obj);
        }
        return pwn.e(cls2, bb6Var.d);
        bb6 bb6Var2 = (bb6) objP;
        if (bb6Var2 != null) {
            boolean z = bb6Var2.f;
            int i3 = bb6Var2.b;
            int i4 = bb6Var2.c;
            ozVar.a = null;
            ozVar.b = null;
            ozVar.c = cls;
            ozVar.d = bb6Var2;
            ozVar.i = 2;
            if (n(z, i3, i4, ozVar) != obj2) {
                cls2 = cls;
                bb6Var = bb6Var2;
                return pwn.e(cls2, bb6Var.d);
            }
        } else {
            Function1 pzVar = new pz(this, str, null);
            Function2 qzVar = new qz(this, null);
            ozVar.a = null;
            ozVar.b = null;
            ozVar.c = null;
            ozVar.i = 3;
            Object objO = o(x66Var, pzVar, qzVar, ozVar);
            if (objO != obj2) {
                return objO;
            }
        }
        return obj2;
    }

    @Override // defpackage.hz
    public final Object k(String str, String str2, z3d z3dVar) {
        mfz mfzVar = this.d;
        mfzVar.getClass();
        Object objC = mfzVar.a.c(new mvh0(str, str2), z3dVar);
        return objC == y5b.a ? objC : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.hz
    public final Object l(x66 x66Var, x1b x1bVar) {
        sz szVar;
        if (x1bVar instanceof sz) {
            szVar = (sz) x1bVar;
            int i = szVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                szVar.d = i - Integer.MIN_VALUE;
            } else {
                szVar = new sz(this, x1bVar);
            }
        } else {
            szVar = new sz(this, x1bVar);
        }
        Object objP = szVar.b;
        Object obj = y5b.a;
        int i2 = szVar.d;
        if (i2 == 0) {
            uj50.b(objP);
            String str = x66Var.a;
            szVar.a = x66Var;
            szVar.d = 1;
            objP = p(str, szVar);
            if (objP == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            x66Var = szVar.a;
            uj50.b(objP);
        }
        bb6 bb6Var = (bb6) objP;
        if (bb6Var == null) {
            return Boolean.FALSE;
        }
        String str2 = bb6Var.d;
        x66Var.getClass();
        str2.getClass();
        return Boolean.valueOf(x66Var.a(str2) != null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.hz
    public final Object m(String str, String str2, String str3, x1b x1bVar) {
        vz vzVar;
        String str4;
        Exception exc;
        if (x1bVar instanceof vz) {
            vzVar = (vz) x1bVar;
            int i = vzVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                vzVar.d = i - Integer.MIN_VALUE;
            } else {
                vzVar = new vz(this, x1bVar);
            }
        } else {
            vzVar = new vz(this, x1bVar);
        }
        vz vzVar2 = vzVar;
        Object obj = vzVar2.b;
        y5b y5bVar = y5b.a;
        int i2 = vzVar2.d;
        if (i2 == 0) {
            uj50.b(obj);
            if (str3 == null) {
                itf0.a aVar = itf0.a;
                aVar.q("SB_AN_TEST");
                aVar.a(str + " reportPushNotificationConversion failed: eventName is empty", new Object[0]);
                return Unit.a;
            }
            try {
                a86 a86Var = this.b;
                vzVar2.a = str;
                vzVar2.d = 1;
                try {
                    str4 = str;
                    try {
                        if (a86Var.a.d(null, str4, null, str2, str3, null, vzVar2) == y5bVar) {
                            return y5bVar;
                        }
                    } catch (Exception e) {
                        e = e;
                        exc = e;
                        str = str4;
                        itf0.a aVar2 = itf0.a;
                        aVar2.q("SB_AN_TEST");
                        aVar2.a(str + " reportPushNotificationConversion exception: " + exc, new Object[0]);
                    }
                } catch (Exception e2) {
                    e = e2;
                    str4 = str;
                }
            } catch (Exception e3) {
                e = e3;
                exc = e;
                itf0.a aVar3 = itf0.a;
                aVar3.q("SB_AN_TEST");
                aVar3.a(str + " reportPushNotificationConversion exception: " + exc, new Object[0]);
                return Unit.a;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = vzVar2.a;
            try {
                uj50.b(obj);
            } catch (Exception e4) {
                e = e4;
                exc = e;
                itf0.a aVar4 = itf0.a;
                aVar4.q("SB_AN_TEST");
                aVar4.a(str + " reportPushNotificationConversion exception: " + exc, new Object[0]);
            }
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(boolean z, int i, int i2, x1b x1bVar) {
        iz izVar;
        if (x1bVar instanceof iz) {
            izVar = (iz) x1bVar;
            int i3 = izVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                izVar.c = i3 - Integer.MIN_VALUE;
            } else {
                izVar = new iz(this, x1bVar);
            }
        } else {
            izVar = new iz(this, x1bVar);
        }
        Object obj = izVar.a;
        y5b y5bVar = y5b.a;
        int i4 = izVar.c;
        try {
            if (i4 == 0) {
                uj50.b(obj);
                if (z) {
                    a86 a86Var = this.b;
                    izVar.c = 1;
                    if (a86Var.a.a(i, i2, izVar) == y5bVar) {
                        return y5bVar;
                    }
                }
                return Unit.a;
            }
            if (i4 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        } catch (Exception e) {
            itf0.a aVar = itf0.a;
            aVar.q("SB_AN_TEST");
            aVar.a("addVisitor e: " + e, new Object[0]);
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007e A[Catch: Exception -> 0x0057, TryCatch #0 {Exception -> 0x0057, blocks: (B:18:0x0053, B:27:0x0076, B:29:0x007e, B:30:0x0083), top: B:52:0x0053 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0083 A[Catch: Exception -> 0x0057, TRY_LEAVE, TryCatch #0 {Exception -> 0x0057, blocks: (B:18:0x0053, B:27:0x0076, B:29:0x007e, B:30:0x0083), top: B:52:0x0053 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0119, code lost:
    
        if (r5.invoke(r0, r3) == r4) goto L49;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x0083, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum o(defpackage.x66 r23, kotlin.jvm.functions.Function1 r24, kotlin.jvm.functions.Function2 r25, defpackage.x1b r26) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tz.o(x66, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, x1b):java.lang.Enum");
    }

    @Override // defpackage.i8
    public final void onAccountChange(Account account) {
        long jIncrementAndGet;
        synchronized (this.i) {
            jIncrementAndGet = this.f.incrementAndGet();
        }
        ej5.c(this.e, this.a, null, new a(jIncrementAndGet, account, null), 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p(String str, x1b x1bVar) {
        uz uzVar;
        if (x1bVar instanceof uz) {
            uzVar = (uz) x1bVar;
            int i = uzVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                uzVar.d = i - Integer.MIN_VALUE;
            } else {
                uzVar = new uz(this, x1bVar);
            }
        } else {
            uzVar = new uz(this, x1bVar);
        }
        Object objB = uzVar.b;
        y5b y5bVar = y5b.a;
        int i2 = uzVar.d;
        try {
            if (i2 == 0) {
                uj50.b(objB);
                f76 f76Var = this.c;
                uzVar.a = str;
                uzVar.d = 1;
                objB = f76Var.a.b(str, uzVar);
                if (objB == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = uzVar.a;
                uj50.b(objB);
            }
            bb6 bb6Var = (bb6) objB;
            if (bb6Var == null || bb6Var.g <= System.currentTimeMillis()) {
                return null;
            }
            return bb6Var;
        } catch (Exception e) {
            itf0.a aVar = itf0.a;
            aVar.q("SB_AN_TEST");
            aVar.f(e, str + " local read failed", new Object[0]);
            return null;
        }
    }
}
