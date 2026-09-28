package defpackage;

import com.sportybet.core.domain.model.ApplicableCategoryIds;
import com.sportybet.core.gift.domain.DobGift;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljve;", "Lj8i0;", "gift"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class jve extends j8i0 {
    public final gx20 a;
    public final oh80 b;
    public final mgb0 c;
    public final fbe d;
    public final DobGift e;
    public final wwd0 f;
    public final v340 i;
    public final ku90<com.sportybet.feature.gift.giftreceived.presentation.dobreceived.a> v;
    public final t340 w;

    @c0d(c = "com.sportybet.feature.gift.giftreceived.presentation.dobreceived.DobGiftReceivedViewModel$1", f = "DobGiftReceivedViewModel.kt", l = {48, 58}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public jve a;
        public DobGift b;
        public int c;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return jve.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
        
            if (r4.x1(r1, r14) == r0) goto L21;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r14.c
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L27
                if (r1 == r4) goto L1f
                if (r1 != r3) goto L19
                com.sportybet.core.gift.domain.DobGift r0 = r14.b
                vue r0 = (defpackage.vue) r0
                jve r14 = r14.a
                com.sportybet.core.gift.domain.DobGift r14 = (com.sportybet.core.gift.domain.DobGift) r14
                defpackage.uj50.b(r15)
                goto L7b
            L19:
                java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r14)
                return r2
            L1f:
                com.sportybet.core.gift.domain.DobGift r1 = r14.b
                jve r4 = r14.a
                defpackage.uj50.b(r15)
                goto L42
            L27:
                defpackage.uj50.b(r15)
                jve r15 = defpackage.jve.this
                com.sportybet.core.gift.domain.DobGift r1 = r15.e
                if (r1 == 0) goto L7b
                gx20 r5 = r15.a
                r14.a = r15
                r14.b = r1
                r14.c = r4
                java.lang.Object r4 = r5.a(r1, r14)
                if (r4 != r0) goto L3f
                goto L7a
            L3f:
                r13 = r4
                r4 = r15
                r15 = r13
            L42:
                vue r15 = (defpackage.vue) r15
                wwd0 r5 = r4.f
            L46:
                java.lang.Object r6 = r5.getValue()
                r7 = r6
                ive r7 = (defpackage.ive) r7
                java.lang.String r8 = r15.a
                java.lang.String r9 = r15.c
                java.lang.String r10 = r15.b
                java.util.List<java.lang.Integer> r11 = r15.d
                android.os.Parcelable$Creator<com.sportybet.core.domain.model.ApplicableCategoryIds> r12 = com.sportybet.core.domain.model.ApplicableCategoryIds.CREATOR
                r11.getClass()
                r7.getClass()
                r8.getClass()
                r9.getClass()
                ive r7 = new ive
                r7.<init>(r8, r9, r10, r11)
                boolean r6 = r5.g(r6, r7)
                if (r6 == 0) goto L46
                r14.a = r2
                r14.b = r2
                r14.c = r3
                java.lang.Object r14 = r4.x1(r1, r14)
                if (r14 != r0) goto L7b
            L7a:
                return r0
            L7b:
                kotlin.Unit r14 = kotlin.Unit.a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: jve.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public jve(gx20 gx20Var, oh80 oh80Var, mgb0 mgb0Var, fbe fbeVar, vu60 vu60Var) {
        gx20Var.getClass();
        oh80Var.getClass();
        mgb0Var.getClass();
        vu60Var.getClass();
        this.a = gx20Var;
        this.b = oh80Var;
        this.c = mgb0Var;
        this.d = fbeVar;
        this.e = (DobGift) vu60Var.b("dob_gift_domain_model");
        wwd0 wwd0VarA = xwd0.a(new ive("https://s.sporty.net/cms/img_birthday_verified_gift_25bd4b1400.png", "GHS", "888", ApplicableCategoryIds.b));
        this.f = wwd0VarA;
        this.i = e1i.b(wwd0VarA);
        ku90<com.sportybet.feature.gift.giftreceived.presentation.dobreceived.a> ku90Var = new ku90<>();
        this.v = ku90Var;
        this.w = e1i.a(ku90Var);
        ej5.c(o8i0.d(this), null, null, new a(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        if (r9.a(r11, r10, r0) == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x1(com.sportybet.core.gift.domain.DobGift r10, defpackage.x1b r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.kve
            if (r0 == 0) goto L13
            r0 = r11
            kve r0 = (defpackage.kve) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            kve r0 = new kve
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.c
            y5b r1 = defpackage.y5b.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2f
            defpackage.uj50.b(r11)
            zi50 r11 = (defpackage.zi50) r11
            java.lang.Object r9 = r11.a
            goto L76
        L2f:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            return r5
        L35:
            oh80 r9 = r0.b
            java.lang.String r10 = r0.a
            defpackage.uj50.b(r11)
            goto L63
        L3d:
            defpackage.uj50.b(r11)
            long r6 = java.lang.System.currentTimeMillis()
            bwf0 r11 = defpackage.bwf0.a
            java.lang.String r11 = r11.x(r6)
            boolean r10 = r10.a
            if (r10 != 0) goto L79
            r0.a = r11
            oh80 r10 = r9.b
            r0.b = r10
            r0.e = r4
            mgb0 r9 = r9.c
            java.lang.Object r9 = r9.getLastUserId(r0)
            if (r9 != r1) goto L5f
            goto L75
        L5f:
            r8 = r11
            r11 = r9
            r9 = r10
            r10 = r8
        L63:
            java.lang.String r11 = (java.lang.String) r11
            if (r11 != 0) goto L69
            java.lang.String r11 = ""
        L69:
            r0.a = r5
            r0.b = r5
            r0.e = r3
            java.lang.Object r9 = r9.a(r11, r10, r0)
            if (r9 != r1) goto L76
        L75:
            return r1
        L76:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        L79:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jve.x1(com.sportybet.core.gift.domain.DobGift, x1b):java.lang.Object");
    }
}
