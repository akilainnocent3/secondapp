package defpackage;

import com.sporty.android.core.model.dispatcher.ApplicationScope;
import com.sporty.android.core.model.service.CountryCodeName;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Laz40;", "Lj8i0;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class az40 extends j8i0 {
    public final ku90<com.sporty.android.common.uievent.a> A;
    public final t340 B;
    public final hv0 a;
    public final rdd0 b;
    public final mya c;
    public final yqm d;
    public final v5b e;
    public final boolean f;
    public final boolean i;
    public jvd0 v;
    public int w;
    public final wwd0 y;
    public final v340 z;

    @c0d(c = "com.sporty.android.platform.features.account.register.presentation.RegistrationSuccessfulViewModel$1", f = "RegistrationSuccessfulViewModel.kt", l = {75, 78, 80}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ul b;
        public final /* synthetic */ az40 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ul ulVar, az40 az40Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = ulVar;
            this.c = az40Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x008d, code lost:
        
            if (r3.x1(r22) == r1) goto L28;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                r22 = this;
                r0 = r22
                y5b r1 = defpackage.y5b.a
                int r2 = r0.a
                az40 r3 = r0.c
                ul r4 = r0.b
                r5 = 3
                r6 = 2
                r7 = 1
                if (r2 == 0) goto L2d
                if (r2 == r7) goto L27
                if (r2 == r6) goto L21
                if (r2 != r5) goto L1a
                defpackage.uj50.b(r23)
                goto L90
            L1a:
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r0)
                r0 = 0
                return r0
            L21:
                defpackage.uj50.b(r23)
                r2 = r5
                goto L87
            L27:
                defpackage.uj50.b(r23)
                r2 = r23
                goto L3d
            L2d:
                defpackage.uj50.b(r23)
                wm20 r2 = r4.a()
                r0.a = r7
                java.lang.Object r2 = r2.f(r0)
                if (r2 != r1) goto L3d
                goto L8f
            L3d:
                r17 = r2
                java.lang.String r17 = (java.lang.String) r17
                if (r17 == 0) goto L79
                wwd0 r2 = r3.y
            L45:
                java.lang.Object r7 = r2.getValue()
                r8 = r7
                r7 = r8
                zy40 r7 = (defpackage.zy40) r7
                r19 = 0
                r20 = 7167(0x1bff, float:1.0043E-41)
                r9 = r8
                r8 = 0
                r10 = r9
                r9 = 0
                r11 = r10
                r10 = 0
                r12 = r11
                r11 = 0
                r13 = r12
                r12 = 0
                r14 = r13
                r13 = 0
                r15 = r14
                r14 = 0
                r16 = r15
                r15 = 0
                r18 = r16
                r16 = 0
                r21 = r18
                r18 = 0
                r5 = r21
                zy40 r7 = defpackage.zy40.a(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                boolean r5 = r2.g(r5, r7)
                if (r5 == 0) goto L77
                goto L79
            L77:
                r5 = 3
                goto L45
            L79:
                wm20 r2 = r4.a()
                r0.a = r6
                java.lang.Object r2 = r2.a(r0)
                if (r2 != r1) goto L86
                goto L8f
            L86:
                r2 = 3
            L87:
                r0.a = r2
                java.lang.Object r0 = r3.x1(r0)
                if (r0 != r1) goto L90
            L8f:
                return r1
            L90:
                kotlin.Unit r0 = kotlin.Unit.a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: az40.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[js40.values().length];
            try {
                js40 js40Var = js40.CURRENT;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    @c0d(c = "com.sporty.android.platform.features.account.register.presentation.RegistrationSuccessfulViewModel$onApplyReferralCode$2", f = "RegistrationSuccessfulViewModel.kt", l = {167, 177}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return az40.this.new c(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x00a7, code lost:
        
            if (r2.a.emit(r4, r23) == r1) goto L26;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                r23 = this;
                r0 = r23
                y5b r1 = defpackage.y5b.a
                int r2 = r0.a
                r3 = 2
                az40 r4 = defpackage.az40.this
                r5 = 0
                r6 = 1
                if (r2 == 0) goto L22
                if (r2 == r6) goto L1c
                if (r2 != r3) goto L16
                defpackage.uj50.b(r24)
                goto Laa
            L16:
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r0)
                return r5
            L1c:
                defpackage.uj50.b(r24)
                r2 = r24
                goto L51
            L22:
                defpackage.uj50.b(r24)
                hv0 r2 = r4.a
                v340 r7 = r4.z
                uwd0<T> r7 = r7.a
                java.lang.Object r7 = r7.getValue()
                zy40 r7 = (defpackage.zy40) r7
                ijf0 r7 = r7.c
                nk0 r7 = r7.a
                java.lang.String r7 = r7.b
                r0.a = r6
                lyz r2 = r2.a
                or60 r2 = r2.F(r7)
                com.sporty.android.common_ui.uitext.ResourceUiText r6 = defpackage.vch0.b
                yzh r2 = defpackage.bm50.c(r2, r6)
                sl50 r6 = new sl50
                r6.<init>(r2)
                java.lang.Object r2 = defpackage.s0i.a(r6, r0)
                if (r2 != r1) goto L51
                goto La9
            L51:
                lk50 r2 = (defpackage.lk50) r2
                boolean r6 = r2 instanceof lk50.c
                wwd0 r7 = r4.y
            L57:
                java.lang.Object r8 = r7.getValue()
                r9 = r8
                zy40 r9 = (defpackage.zy40) r9
                boolean r10 = r2 instanceof lk50.a
                if (r10 == 0) goto L66
                r10 = r2
                lk50$a r10 = (lk50.a) r10
                goto L67
            L66:
                r10 = r5
            L67:
                if (r10 == 0) goto L6d
                com.sporty.android.common_ui.uitext.UiText r10 = r10.b
                r12 = r10
                goto L6e
            L6d:
                r12 = r5
            L6e:
                r15 = r6 ^ 1
                r21 = 0
                r22 = 8087(0x1f97, float:1.1332E-41)
                r10 = 0
                r11 = 0
                r13 = 0
                r14 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                zy40 r9 = defpackage.zy40.a(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                boolean r8 = r7.g(r8, r9)
                if (r8 == 0) goto L57
                if (r6 == 0) goto Laa
                ku90<com.sporty.android.common.uievent.a> r2 = r4.A
                com.sporty.android.common.uievent.a$n r4 = new com.sporty.android.common.uievent.a$n
                com.sporty.android.common_ui.uitext.StringUiText r5 = defpackage.vch0.a
                com.sporty.android.common_ui.uitext.ResourceUiText r5 = new com.sporty.android.common_ui.uitext.ResourceUiText
                r6 = 2132023692(0x7f14198c, float:1.968584E38)
                r5.<init>(r6)
                r4.<init>(r5)
                r0.a = r3
                b390 r2 = r2.a
                java.lang.Object r0 = r2.emit(r4, r0)
                if (r0 != r1) goto Laa
            La9:
                return r1
            Laa:
                kotlin.Unit r0 = kotlin.Unit.a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: az40.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.platform.features.account.register.presentation.RegistrationSuccessfulViewModel$startCountdown$1", f = "RegistrationSuccessfulViewModel.kt", l = {128}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public int b;

        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return az40.this.new d(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0071 A[LOOP:0: B:11:0x0027->B:18:0x0071, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:21:0x005a A[EDGE_INSN: B:21:0x005a->B:13:0x005a BREAK  A[LOOP:0: B:11:0x0027->B:18:0x0071], SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0067 -> B:17:0x0068). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                r22 = this;
                r0 = r22
                y5b r1 = defpackage.y5b.a
                int r2 = r0.b
                r3 = -1
                az40 r4 = defpackage.az40.this
                r5 = 1
                if (r2 == 0) goto L1d
                if (r2 != r5) goto L16
                int r2 = r0.a
                defpackage.uj50.b(r23)
                r21 = r3
                goto L68
            L16:
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r0)
                r0 = 0
                return r0
            L1d:
                defpackage.uj50.b(r23)
                int r2 = r4.w
                r15 = r2
            L23:
                if (r3 >= r15) goto L74
                wwd0 r2 = r4.y
            L27:
                java.lang.Object r6 = r2.getValue()
                r7 = r6
                r6 = r7
                zy40 r6 = (defpackage.zy40) r6
                r18 = 0
                r19 = 7679(0x1dff, float:1.076E-41)
                r8 = r7
                r7 = 0
                r9 = r8
                r8 = 0
                r10 = r9
                r9 = 0
                r11 = r10
                r10 = 0
                r12 = r11
                r11 = 0
                r13 = r12
                r12 = 0
                r14 = r13
                r13 = 0
                r16 = r14
                r14 = 0
                r17 = r16
                r16 = 0
                r20 = r17
                r17 = 0
                r21 = r3
                r3 = r20
                zy40 r6 = defpackage.zy40.a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                boolean r3 = r2.g(r3, r6)
                if (r3 == 0) goto L71
                r0.a = r15
                r0.b = r5
                r2 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r2 = defpackage.hkd.b(r2, r0)
                if (r2 != r1) goto L67
                return r1
            L67:
                r2 = r15
            L68:
                int r3 = r2 + (-1)
                r4.w = r3
                int r15 = r2 + (-1)
                r3 = r21
                goto L23
            L71:
                r3 = r21
                goto L27
            L74:
                kotlin.Unit r0 = kotlin.Unit.a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: az40.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public az40(hv0 hv0Var, ul ulVar, psm psmVar, rdd0 rdd0Var, mya myaVar, yqm yqmVar, @ApplicationScope v5b v5bVar) {
        ulVar.getClass();
        psmVar.getClass();
        rdd0Var.getClass();
        yqmVar.getClass();
        v5bVar.getClass();
        this.a = hv0Var;
        this.b = rdd0Var;
        this.c = myaVar;
        this.d = yqmVar;
        this.e = v5bVar;
        this.f = psmVar.x();
        this.i = kotlin.collections.b.k(CountryCodeName.NIGERIA, CountryCodeName.GHANA, CountryCodeName.TANZANIA, CountryCodeName.ZAMBIA).contains(psmVar.getCountryCode());
        this.w = 5;
        wwd0 wwd0VarA = xwd0.a(new zy40(js40.CURRENT, psmVar.F(), new ijf0((String) null, 0L, 7), null, false, false, true, false, false, 5, "", false, new is40(15)));
        this.y = wwd0VarA;
        this.z = e1i.b(wwd0VarA);
        ku90<com.sporty.android.common.uievent.a> ku90Var = new ku90<>();
        this.A = ku90Var;
        this.B = e1i.a(ku90Var);
        ej5.c(o8i0.d(this), null, null, new a(ulVar, this, null), 3);
        y1();
    }

    public final void A1(pdd0 pdd0Var, k00... k00VarArr) {
        pdd0Var.getClass();
        this.b.a(pdd0Var, (k00[]) Arrays.copyOf(k00VarArr, k00VarArr.length));
    }

    public final void B1(pdd0 pdd0Var, k00... k00VarArr) {
        pdd0Var.getClass();
        if (this.f) {
            this.b.a(pdd0Var, (k00[]) Arrays.copyOf(k00VarArr, k00VarArr.length));
        }
    }

    public final void C1() {
        if (((zy40) this.y.getValue()).h) {
            jvd0 jvd0Var = this.v;
            if (jvd0Var == null || !jvd0Var.isActive()) {
                this.v = ej5.c(o8i0.d(this), null, null, new d(null), 3);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object x1(x1b x1bVar) {
        bz40 bz40Var;
        Object value;
        int length;
        if (x1bVar instanceof bz40) {
            bz40Var = (bz40) x1bVar;
            int i = bz40Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bz40Var.c = i - Integer.MIN_VALUE;
            } else {
                bz40Var = new bz40(this, x1bVar);
            }
        } else {
            bz40Var = new bz40(this, x1bVar);
        }
        Object objA = bz40Var.a;
        y5b y5bVar = y5b.a;
        int i2 = bz40Var.c;
        wwd0 wwd0Var = this.y;
        if (i2 == 0) {
            uj50.b(objA);
            if (!((zy40) wwd0Var.getValue()).b) {
                return Unit.a;
            }
            bz40Var.c = 1;
            objA = this.c.a(bz40Var);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objA);
        }
        String str = (String) objA;
        if (str == null) {
            return Unit.a;
        }
        do {
            value = wwd0Var.getValue();
            length = str.length();
        } while (!wwd0Var.g(value, zy40.a((zy40) value, null, new ijf0(str, vlf0.a(length, length), 4), null, true, false, false, false, false, 0, null, false, null, 8171)));
        z1();
        return Unit.a;
    }

    public final void y1() {
        Object value;
        boolean z = this.i;
        wwd0 wwd0Var = this.y;
        boolean z2 = z || ((zy40) wwd0Var.getValue()).a == js40.COUNTDOWN;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, zy40.a((zy40) value, null, null, null, false, false, false, z2, false, 0, null, false, null, 8063)));
        if (z2) {
            C1();
        }
    }

    public final void z1() {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.y;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, zy40.a((zy40) value, null, null, null, false, true, false, false, false, 0, null, false, null, 8159)));
        ej5.c(o8i0.d(this), null, null, new c(null), 3);
    }
}
