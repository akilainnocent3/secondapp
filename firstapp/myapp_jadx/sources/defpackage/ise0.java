package defpackage;

import com.google.protobuf.Reader;
import com.sportygames.newcms.CMSRes;
import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ise0 extends j8i0 {
    public final t340 A;
    public final b390 B;
    public LinkedHashMap C;
    public final en20 a;
    public boolean b;
    public int c;
    public final wwd0 d;
    public final v340 e;
    public final v340 f;
    public int i;
    public final v340 v;
    public final v340 w;
    public boolean y;
    public final b390 z;

    public static final class a implements lyh<Integer> {
        public final /* synthetic */ wwd0 a;

        /* JADX INFO: renamed from: ise0$a$a, reason: collision with other inner class name */
        public static final class C0695a<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: ise0$a$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.goldmine.ui.animationpanel.TGAnimationViewModel$special$$inlined$map$1$2", f = "TGAnimationViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C0696a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0696a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return C0695a.this.emit(null, this);
                }
            }

            public C0695a(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C0696a c0696a;
                if (v1bVar instanceof C0696a) {
                    c0696a = (C0696a) v1bVar;
                    int i = c0696a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0696a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0696a = new C0696a(v1bVar);
                    }
                } else {
                    c0696a = new C0696a(v1bVar);
                }
                Object obj2 = c0696a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0696a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    Integer num = new Integer(((dse0) obj).a);
                    c0696a.b = 1;
                    if (this.a.emit(num, c0696a) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj2);
                }
                return Unit.a;
            }
        }

        public a(wwd0 wwd0Var) {
            this.a = wwd0Var;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super Integer> myhVar, v1b v1bVar) throws Throwable {
            this.a.collect(new C0695a(myhVar), v1bVar);
            return y5b.a;
        }
    }

    public static final class b implements lyh<mze0> {
        public final /* synthetic */ wwd0 a;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: ise0$b$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.goldmine.ui.animationpanel.TGAnimationViewModel$special$$inlined$map$2$2", f = "TGAnimationViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C0697a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0697a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C0697a c0697a;
                if (v1bVar instanceof C0697a) {
                    c0697a = (C0697a) v1bVar;
                    int i = c0697a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0697a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0697a = new C0697a(v1bVar);
                    }
                } else {
                    c0697a = new C0697a(v1bVar);
                }
                Object obj2 = c0697a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0697a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    mze0 mze0Var = ((dse0) obj).g;
                    c0697a.b = 1;
                    if (this.a.emit(mze0Var, c0697a) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj2);
                }
                return Unit.a;
            }
        }

        public b(wwd0 wwd0Var) {
            this.a = wwd0Var;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super mze0> myhVar, v1b v1bVar) throws Throwable {
            this.a.collect(new a(myhVar), v1bVar);
            return y5b.a;
        }
    }

    public ise0(en20 en20Var) {
        en20Var.getClass();
        this.a = en20Var;
        wwd0 wwd0VarA = xwd0.a(new dse0(0));
        this.d = wwd0VarA;
        a aVar = new a(wwd0VarA);
        et7 et7VarD = o8i0.d(this);
        kwd0 kwd0Var = q490.a.a;
        this.e = e1i.e(aVar, et7VarD, kwd0Var, 0);
        this.f = e1i.e(new b(wwd0VarA), o8i0.d(this), kwd0Var, mze0.c.a);
        this.i = -1;
        this.v = e1i.e(en20Var.getBooleanByFlow("key - TG- turbo mode", false), o8i0.d(this), kwd0Var, Boolean.FALSE);
        this.w = e1i.e(en20Var.getBooleanByFlow("key-TG-sound", true), o8i0.d(this), kwd0Var, Boolean.TRUE);
        pb5 pb5Var = pb5.c;
        b390 b390VarB = d390.b(0, 500, pb5Var, 1);
        this.z = b390VarB;
        this.A = e1i.a(b390VarB);
        this.B = d390.b(0, Reader.READ_DONE, pb5Var, 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object A1(yog yogVar, x1b x1bVar) {
        jse0 jse0Var;
        if (x1bVar instanceof jse0) {
            jse0Var = (jse0) x1bVar;
            int i = jse0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jse0Var.c = i - Integer.MIN_VALUE;
            } else {
                jse0Var = new jse0(this, x1bVar);
            }
        } else {
            jse0Var = new jse0(this, x1bVar);
        }
        Object obj = jse0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = jse0Var.c;
        if (i2 == 0) {
            uj50.b(obj);
            if (Intrinsics.g(yogVar, yog.b.a)) {
                return Unit.a;
            }
            if (!(yogVar instanceof yog.a)) {
                uhc.a();
                return null;
            }
            qcn<pve0> qcnVar = ((yog.a) yogVar).a;
            int iA = jpu.a(l48.r(qcnVar, 10));
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            for (pve0 pve0Var : qcnVar) {
                linkedHashMap.put(new sjd(pve0Var.a.a(), pve0Var.b), em8.a());
            }
            this.C = linkedHashMap;
            Collection collectionValues = linkedHashMap.values();
            jse0Var.c = 1;
            if (up1.a(collectionValues, jse0Var) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        this.C = null;
        return Unit.a;
    }

    public final void x1(cse0 cse0Var) {
        cm8 cm8Var;
        if (!(cse0Var instanceof cse0.a)) {
            if (cse0Var instanceof cse0.b) {
                this.d.setValue(((cse0.b) cse0Var).a);
                return;
            } else {
                uhc.a();
                return;
            }
        }
        try {
            zi50.a aVar = zi50.b;
            sjd sjdVar = new sjd(((cse0.a) cse0Var).a, ((cse0.a) cse0Var).b);
            LinkedHashMap linkedHashMap = this.C;
            if (linkedHashMap == null || (cm8Var = (cm8) linkedHashMap.get(sjdVar)) == null) {
                return;
            }
            cm8Var.G(Unit.a);
        } catch (Throwable unused) {
            zi50.a aVar2 = zi50.b;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ab, code lost:
    
        if (A1(r12, r0) == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y1(defpackage.na50 r12, defpackage.x1b r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.ese0
            if (r0 == 0) goto L13
            r0 = r13
            ese0 r0 = (defpackage.ese0) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            ese0 r0 = new ese0
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.f
            y5b r1 = defpackage.y5b.a
            int r2 = r0.v
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L45
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2c
            defpackage.uj50.b(r13)
            goto Lae
        L2c:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r11)
            return r5
        L32:
            int r12 = r0.e
            int r2 = r0.d
            java.util.Iterator r6 = r0.c
            java.lang.Iterable r7 = r0.b
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            na50 r8 = r0.a
            defpackage.uj50.b(r13)
            r10 = r8
            r8 = r12
            r12 = r10
            goto L69
        L45:
            defpackage.uj50.b(r13)
            qcn r13 = r12.d()
            qcn r2 = r12.b()
            qcn r6 = r12.c()
            r7 = 3
            qcn[] r7 = new defpackage.qcn[r7]
            r8 = 0
            r7[r8] = r13
            r7[r4] = r2
            r7[r3] = r6
            java.util.List r13 = kotlin.collections.b.k(r7)
            java.util.Iterator r2 = r13.iterator()
            r7 = r13
            r6 = r2
            r2 = r8
        L69:
            boolean r13 = r6.hasNext()
            if (r13 == 0) goto L92
            java.lang.Object r13 = r6.next()
            qcn r13 = (defpackage.qcn) r13
            hre0$a r9 = new hre0$a
            r9.<init>(r13)
            r0.a = r12
            r13 = r7
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            r0.b = r13
            r0.c = r6
            r0.d = r2
            r0.e = r8
            r0.v = r4
            b390 r13 = r11.z
            java.lang.Object r13 = r13.emit(r9, r0)
            if (r13 != r1) goto L69
            goto Lad
        L92:
            com.sportygames.newcms.CMSRes r13 = r12.e()
            if (r13 == 0) goto L9b
            r11.z1(r13)
        L9b:
            yog r12 = r12.f()
            r0.a = r5
            r0.b = r5
            r0.c = r5
            r0.v = r3
            java.lang.Object r11 = r11.A1(r12, r0)
            if (r11 != r1) goto Lae
        Lad:
            return r1
        Lae:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ise0.y1(na50, x1b):java.lang.Object");
    }

    public final void z1(CMSRes cMSRes) {
        if (((Boolean) this.w.a.getValue()).booleanValue()) {
            this.z.a(new hre0.c(cMSRes));
        }
    }
}
