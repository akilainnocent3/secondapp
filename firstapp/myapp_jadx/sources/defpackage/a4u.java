package defpackage;

import com.sporty.android.core.model.loyalty.LoyaltyActivityData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.LoyaltyViewModel$selectDefaultTab$1", f = "LoyaltyViewModel.kt", l = {652, 662}, m = "invokeSuspend", v = 2)
public final class a4u extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ b3u b;
    public final /* synthetic */ lk50<List<LoyaltyActivityData>> c;
    public final /* synthetic */ jwv d;

    @c0d(c = "com.sporty.android.platform.features.loyalty.home.LoyaltyViewModel$selectDefaultTab$1$activitySuccess$1", f = "LoyaltyViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<lk50<? extends List<? extends LoyaltyActivityData>>, v1b<? super Boolean>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ lk50<List<LoyaltyActivityData>> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(lk50<? extends List<LoyaltyActivityData>> lk50Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = lk50Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.b, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends List<? extends LoyaltyActivityData>> lk50Var, v1b<? super Boolean> v1bVar) {
            return ((a) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lk50<List<LoyaltyActivityData>> lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return Boolean.valueOf(lk50Var == this.b);
        }
    }

    @c0d(c = "com.sporty.android.platform.features.loyalty.home.LoyaltyViewModel$selectDefaultTab$1$activitySuccess$2", f = "LoyaltyViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<lk50<? extends List<? extends LoyaltyActivityData>>, v1b<? super Boolean>, Object> {
        public /* synthetic */ Object a;

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(2, v1bVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends List<? extends LoyaltyActivityData>> lk50Var, v1b<? super Boolean> v1bVar) {
            return ((b) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lk50 lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return Boolean.valueOf(lk50Var instanceof lk50.c);
        }
    }

    @c0d(c = "com.sporty.android.platform.features.loyalty.home.LoyaltyViewModel$selectDefaultTab$1$missionState$1", f = "LoyaltyViewModel.kt", l = {665}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super jwv>, Object> {
        public int a;
        public final /* synthetic */ b3u b;
        public final /* synthetic */ jwv c;

        @c0d(c = "com.sporty.android.platform.features.loyalty.home.LoyaltyViewModel$selectDefaultTab$1$missionState$1$1", f = "LoyaltyViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements Function2<jwv, v1b<? super Boolean>, Object> {
            public /* synthetic */ Object a;
            public final /* synthetic */ jwv b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(jwv jwvVar, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.b = jwvVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(this.b, v1bVar);
                aVar.a = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(jwv jwvVar, v1b<? super Boolean> v1bVar) {
                return ((a) create(jwvVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                jwv jwvVar = (jwv) this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                return Boolean.valueOf(jwvVar == this.b);
            }
        }

        @c0d(c = "com.sporty.android.platform.features.loyalty.home.LoyaltyViewModel$selectDefaultTab$1$missionState$1$2", f = "LoyaltyViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class b extends tje0 implements Function2<jwv, v1b<? super Boolean>, Object> {
            public /* synthetic */ Object a;

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                b bVar = new b(2, v1bVar);
                bVar.a = obj;
                return bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(jwv jwvVar, v1b<? super Boolean> v1bVar) {
                return ((b) create(jwvVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                jwv jwvVar = (jwv) this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                return Boolean.valueOf(!jwvVar.a.isEmpty());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b3u b3uVar, jwv jwvVar, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.b = b3uVar;
            this.c = jwvVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new c(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super jwv> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    uj50.b(obj);
                    return obj;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            f0i f0iVar = new f0i(this.b.b0, new a(this.c, null));
            b bVar = new b(2, null);
            this.a = 1;
            Object objB = s0i.b(f0iVar, bVar, this);
            return objB == y5bVar ? y5bVar : objB;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a4u(b3u b3uVar, lk50<? extends List<LoyaltyActivityData>> lk50Var, jwv jwvVar, v1b<? super a4u> v1bVar) {
        super(2, v1bVar);
        this.b = b3uVar;
        this.c = lk50Var;
        this.d = jwvVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new a4u(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((a4u) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
    
        if (r9 == r2) goto L31;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            b3u r0 = r8.b
            f0u r1 = r0.c
            y5b r2 = defpackage.y5b.a
            int r3 = r8.a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L20
            if (r3 == r5) goto L1c
            if (r3 != r4) goto L16
            defpackage.uj50.b(r9)
            goto L91
        L16:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r6
        L1c:
            defpackage.uj50.b(r9)
            goto L3f
        L20:
            defpackage.uj50.b(r9)
            wwd0 r9 = r0.P
            a4u$a r3 = new a4u$a
            lk50<java.util.List<com.sporty.android.core.model.loyalty.LoyaltyActivityData>> r7 = r8.c
            r3.<init>(r7, r6)
            f0i r7 = new f0i
            r7.<init>(r9, r3)
            a4u$b r9 = new a4u$b
            r9.<init>(r4, r6)
            r8.a = r5
            java.lang.Object r9 = defpackage.s0i.b(r7, r9, r8)
            if (r9 != r2) goto L3f
            goto L90
        L3f:
            lk50 r9 = (defpackage.lk50) r9
            boolean r3 = r0.R1()
            if (r3 == 0) goto L4a
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L4a:
            r9.getClass()
            lk50$c r9 = (lk50.c) r9
            T r9 = r9.a
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto L5c
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto L5c
            goto L7f
        L5c:
            java.util.Iterator r9 = r9.iterator()
        L60:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L7f
            java.lang.Object r3 = r9.next()
            com.sporty.android.core.model.loyalty.LoyaltyActivityData r3 = (com.sporty.android.core.model.loyalty.LoyaltyActivityData) r3
            int r3 = r3.getStatus()
            r5 = 3
            if (r3 != r5) goto L60
            tyt$b r8 = new tyt$b
            r9 = 0
            r8.<init>(r9)
            r1.a(r8)
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L7f:
            a4u$c r9 = new a4u$c
            jwv r3 = r8.d
            r9.<init>(r0, r3, r6)
            r8.a = r4
            r3 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r9 = defpackage.vxf0.c(r3, r9, r8)
            if (r9 != r2) goto L91
        L90:
            return r2
        L91:
            jwv r9 = (defpackage.jwv) r9
            if (r9 == 0) goto La5
            boolean r8 = r0.R1()
            if (r8 != 0) goto La5
            tyt$c r8 = new tyt$c
            boolean r9 = r9.b
            r8.<init>(r9)
            r1.a(r8)
        La5:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a4u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
