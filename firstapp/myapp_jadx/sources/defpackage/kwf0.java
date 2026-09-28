package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class kwf0 implements lit, fjt, iwf0 {
    public final uqm a;
    public final des b;
    public final j1b c;
    public final psm d;
    public final qfk e;
    public final b4w f;
    public final gb90 i;
    public final wwd0 v;
    public jvd0 w;
    public boolean y;
    public jvd0 z;

    @c0d(c = "com.sportybet.android.limits.manager.TimeLimitsManagerImpl$onLogin$2", f = "TimeLimitsManagerImpl.kt", l = {95, 97}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: kwf0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.limits.manager.TimeLimitsManagerImpl$onLogin$2$1", f = "TimeLimitsManagerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C0796a extends tje0 implements Function2<mwf0, v1b<? super Unit>, Object> {
            public /* synthetic */ Object a;
            public final /* synthetic */ kwf0 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0796a(kwf0 kwf0Var, v1b<? super C0796a> v1bVar) {
                super(2, v1bVar);
                this.b = kwf0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C0796a c0796a = new C0796a(this.b, v1bVar);
                c0796a.a = obj;
                return c0796a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(mwf0 mwf0Var, v1b<? super Unit> v1bVar) {
                return ((C0796a) create(mwf0Var, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                int iIntValue;
                mwf0 mwf0Var = (mwf0) this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                fwf0 fwf0Var = mwf0Var.a;
                boolean z = mwf0Var.c;
                boolean z2 = mwf0Var.b;
                boolean zA = fwf0Var.a();
                Integer num = fwf0Var.a;
                kwf0 kwf0Var = this.b;
                if (zA && fwf0Var.f == 0 && z2 && z) {
                    jvd0 jvd0Var = kwf0Var.z;
                    if (jvd0Var != null) {
                        jvd0Var.cancel((CancellationException) null);
                    }
                    kwf0Var.i.a.e(o7d.a(wae.REACHED_LIMITS));
                } else {
                    fwf0 fwf0Var2 = mwf0Var.a;
                    Integer num2 = fwf0Var2.a;
                    if ((num2 == null && fwf0Var2.c == null) || !z2 || !z) {
                        jvd0 jvd0Var2 = kwf0Var.z;
                        if (jvd0Var2 != null) {
                            jvd0Var2.cancel((CancellationException) null);
                        }
                    } else if ((num2 != null || fwf0Var2.c != null) && z2 && z) {
                        b4w b4wVar = kwf0Var.f;
                        j1b j1bVar = kwf0Var.c;
                        Integer num3 = fwf0Var.c;
                        int iIntValue2 = 0;
                        if (num != null && num.intValue() == 0) {
                            if ((num3 == null || num3.intValue() != 0) && num3 != null) {
                                iIntValue = num3.intValue();
                                Integer num4 = fwf0Var.d;
                                if (num4 != null) {
                                    iIntValue2 = num4.intValue();
                                }
                                iIntValue2 = iIntValue - iIntValue2;
                            }
                        } else if (num != null) {
                            iIntValue = num.intValue();
                            Integer num5 = fwf0Var.b;
                            if (num5 != null) {
                                iIntValue2 = num5.intValue();
                            }
                            iIntValue2 = iIntValue - iIntValue2;
                        }
                        kwf0Var.z = ej5.c(j1bVar, null, null, new a4w(b4wVar, iIntValue2 * 60, j1bVar, fwf0Var.f, null), 3);
                    }
                }
                return Unit.a;
            }
        }

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return kwf0.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
        
            if (defpackage.kzh.b(r8, r1, r7) == r0) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r7.a
                r2 = 0
                r3 = 2
                r4 = 1
                kwf0 r5 = defpackage.kwf0.this
                if (r1 == 0) goto L1d
                if (r1 == r4) goto L19
                if (r1 != r3) goto L13
                defpackage.uj50.b(r8)
                goto L58
            L13:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                return r2
            L19:
                defpackage.uj50.b(r8)
                goto L29
            L1d:
                defpackage.uj50.b(r8)
                r7.a = r4
                java.lang.Object r8 = r5.d(r7)
                if (r8 != r0) goto L29
                goto L57
            L29:
                des r8 = r5.b
                lyh r8 = r8.k()
                wwd0 r1 = r5.v
                jwf0 r4 = new jwf0
                r6 = 3
                r4.<init>(r6, r2)
                n1i r6 = new n1i
                r6.<init>(r8, r1, r4)
                j1b r8 = r5.c
                mwf0 r1 = new mwf0
                r4 = 0
                r1.<init>(r4)
                lwd0 r4 = q490.a.b
                v340 r8 = defpackage.e1i.e(r6, r8, r4, r1)
                kwf0$a$a r1 = new kwf0$a$a
                r1.<init>(r5, r2)
                r7.a = r3
                java.lang.Object r7 = defpackage.kzh.b(r8, r1, r7)
                if (r7 != r0) goto L58
            L57:
                return r0
            L58:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kwf0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.android.limits.manager.TimeLimitsManagerImpl$onLogout$2", f = "TimeLimitsManagerImpl.kt", l = {86}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return kwf0.this.new b(v1bVar);
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
                des desVar = kwf0.this.b;
                this.a = 1;
                if (desVar.g(this) == y5bVar) {
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

    public kwf0(uqm uqmVar, des desVar, j1b j1bVar, psm psmVar, qfk qfkVar, b4w b4wVar, gb90 gb90Var) {
        uqmVar.getClass();
        desVar.getClass();
        psmVar.getClass();
        this.a = uqmVar;
        this.b = desVar;
        this.c = j1bVar;
        this.d = psmVar;
        this.e = qfkVar;
        this.f = b4wVar;
        this.i = gb90Var;
        this.v = xwd0.a(new mwf0(0));
    }

    @Override // defpackage.iwf0
    public final void a() {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.v;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, mwf0.a((mwf0) value, null, false, false, 3)));
    }

    @Override // defpackage.iwf0
    public final void b() {
        wwd0 wwd0Var;
        Object value;
        if (!this.y) {
            uqm uqmVar = this.a;
            uqmVar.addLoginEventListener(this);
            uqmVar.addLogoutEventListener(this);
            if (uqmVar.isLogin()) {
                onLogin();
            }
            this.y = true;
        }
        do {
            wwd0Var = this.v;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, mwf0.a((mwf0) value, null, false, true, 3)));
    }

    @Override // defpackage.iwf0
    public final boolean c() {
        return this.d.W();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0064 A[PHI: r12
      0x0064: PHI (r12v5 java.lang.Object) = (r12v10 java.lang.Object), (r12v1 java.lang.Object) binds: [B:20:0x0061, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0068  */
    /* JADX WARN: Code duplicated, block: B:27:0x0075  */
    /* JADX WARN: Code duplicated, block: B:32:0x008d A[DONT_INVERT, PHI: r12
      0x008d: PHI (r12v11 ??) = (r12v15 ??), (r12v12 ??) binds: [B:23:0x0066, B:31:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x008f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0066 -> B:32:0x008d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0089 -> B:31:0x008c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object d(defpackage.x1b r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.lwf0
            if (r0 == 0) goto L13
            r0 = r12
            lwf0 r0 = (defpackage.lwf0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            lwf0 r0 = new lwf0
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.b
            y5b r1 = defpackage.y5b.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2f
            int r2 = r0.a
            defpackage.uj50.b(r12)
            goto L8c
        L2f:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r11)
            r11 = 0
            return r11
        L36:
            int r2 = r0.a
            defpackage.uj50.b(r12)
            goto L78
        L3c:
            defpackage.uj50.b(r12)
            goto L64
        L40:
            defpackage.uj50.b(r12)
        L43:
            qfk r12 = r11.e
            des r2 = r12.a
            or60 r2 = r2.c()
            com.sporty.android.common_ui.uitext.ResourceUiText r6 = defpackage.vch0.b
            yzh r2 = defpackage.bm50.b(r2, r6)
            pfk r6 = new pfk
            r6.<init>(r2, r5, r12)
            sl50 r12 = new sl50
            r12.<init>(r6)
            r0.d = r5
            java.lang.Object r12 = defpackage.s0i.a(r12, r0)
            if (r12 != r1) goto L64
            goto L8b
        L64:
            boolean r12 = r12 instanceof lk50.c
            if (r12 != 0) goto L8d
            r0.a = r12
            r0.d = r4
            des r2 = r11.b
            java.lang.Object r2 = r2.a(r0)
            if (r2 != r1) goto L75
            goto L8b
        L75:
            r10 = r2
            r2 = r12
            r12 = r10
        L78:
            java.lang.Number r12 = (java.lang.Number) r12
            long r6 = r12.longValue()
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r8
            r0.a = r2
            r0.d = r3
            java.lang.Object r12 = defpackage.hkd.b(r6, r0)
            if (r12 != r1) goto L8c
        L8b:
            return r1
        L8c:
            r12 = r2
        L8d:
            if (r12 == 0) goto L43
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kwf0.d(x1b):java.lang.Object");
    }

    @Override // defpackage.lit
    public final void onLogin() {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.v;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, mwf0.a((mwf0) value, null, true, false, 5)));
        jvd0 jvd0Var = this.w;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.w = ej5.c(this.c, null, null, new a(null), 3);
    }

    @Override // defpackage.fjt
    public final void p() {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.v;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, mwf0.a((mwf0) value, null, false, false, 5)));
        jvd0 jvd0Var = this.z;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        jvd0 jvd0Var2 = this.w;
        if (jvd0Var2 != null) {
            jvd0Var2.cancel((CancellationException) null);
        }
        ej5.c(this.c, null, null, new b(null), 3);
    }
}
