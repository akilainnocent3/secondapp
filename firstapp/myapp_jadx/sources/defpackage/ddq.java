package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.giftdialog.LNGiftDialogViewModel$1", f = "LNGiftDialogViewModel.kt", l = {107}, m = "invokeSuspend", v = 2)
public final class ddq extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ jdq b;

    @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.giftdialog.LNGiftDialogViewModel$1$1", f = "LNGiftDialogViewModel.kt", l = {110, 112}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<jfq, v1b<? super Unit>, Object> {
        public Boolean a;
        public jdq b;
        public boolean c;
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ jdq f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(jdq jdqVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.f = jdqVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.f, v1bVar);
            aVar.e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(jfq jfqVar, v1b<? super Unit> v1bVar) {
            return ((a) create(jfqVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x005f  */
        /* JADX WARN: Code duplicated, block: B:24:0x007e  */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
        
            if (kotlin.Unit.a == r1) goto L23;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = r10.e
                jfq r0 = (defpackage.jfq) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r10.d
                r3 = 0
                r4 = 0
                r5 = 2
                r6 = 1
                if (r2 == 0) goto L27
                if (r2 == r6) goto L1d
                if (r2 != r5) goto L17
                defpackage.uj50.b(r11)
                goto L97
            L17:
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r10)
                return r3
            L1d:
                boolean r2 = r10.c
                jdq r6 = r10.b
                java.lang.Boolean r7 = r10.a
                defpackage.uj50.b(r11)
                goto L5d
            L27:
                defpackage.uj50.b(r11)
                if (r0 == 0) goto L97
                java.math.BigDecimal r11 = r0.b
                ocq r2 = r0.c
                java.math.BigDecimal r2 = r2.e
                int r11 = r11.compareTo(r2)
                if (r11 < 0) goto L3a
                r2 = r6
                goto L3b
            L3a:
                r2 = r4
            L3b:
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
                jdq r11 = r10.f
                wwd0 r8 = r11.f
                java.lang.Boolean r9 = java.lang.Boolean.valueOf(r2)
                r10.e = r0
                r10.a = r7
                r10.b = r11
                r10.c = r2
                r10.d = r6
                r8.getClass()
                r8.k(r3, r9)
                kotlin.Unit r6 = kotlin.Unit.a
                if (r6 != r1) goto L5c
                goto L7d
            L5c:
                r6 = r11
            L5d:
                if (r2 == 0) goto L7e
                wwd0 r11 = r6.e
                ijf0 r0 = new ijf0
                r8 = 0
                r4 = 7
                r0.<init>(r3, r8, r4)
                r10.e = r3
                r10.a = r7
                r10.b = r3
                r10.c = r2
                r10.d = r5
                r11.getClass()
                r11.k(r3, r0)
                kotlin.Unit r10 = kotlin.Unit.a
                if (r10 != r1) goto L97
            L7d:
                return r1
            L7e:
                wwd0 r10 = r6.e
                java.math.BigDecimal r11 = r0.b
                java.lang.String r11 = defpackage.ukd0.a(r5, r11, r4, r4)
                ijf0 r0 = new ijf0
                int r1 = r11.length()
                long r1 = defpackage.vlf0.a(r1, r1)
                r3 = 4
                r0.<init>(r11, r1, r3)
                r10.setValue(r0)
            L97:
                kotlin.Unit r10 = kotlin.Unit.a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: ddq.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddq(jdq jdqVar, v1b<? super ddq> v1bVar) {
        super(2, v1bVar);
        this.b = jdqVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ddq(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ddq) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            jdq jdqVar = this.b;
            k1i k1iVar = jdqVar.a.g;
            a aVar = new a(jdqVar, null);
            this.a = 1;
            if (kzh.b(k1iVar, aVar, this) == y5bVar) {
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
