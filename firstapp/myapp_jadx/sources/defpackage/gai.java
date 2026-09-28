package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.footballgame.screen.FootballBannerKt$FootballBanner$1$1", f = "FootballBanner.kt", l = {78, 79, 83}, m = "invokeSuspend", v = 2)
public final class gai extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ gzg0<Float> c;
    public final /* synthetic */ Function0<Unit> d;
    public final /* synthetic */ isw e;
    public final /* synthetic */ isw f;
    public final /* synthetic */ float i;
    public final /* synthetic */ float v;
    public final /* synthetic */ ytw<jxo> w;
    public final /* synthetic */ isw y;
    public final /* synthetic */ ytw<iwo> z;

    @c0d(c = "com.sporty.android.platform.features.loyalty.footballgame.screen.FootballBannerKt$FootballBanner$1$1$2", f = "FootballBanner.kt", l = {85}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ float b;
        public final /* synthetic */ float c;
        public final /* synthetic */ float d;
        public final /* synthetic */ gzg0<Float> e;
        public final /* synthetic */ ytw<jxo> f;
        public final /* synthetic */ isw i;
        public final /* synthetic */ ytw<iwo> v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f, float f2, float f3, gzg0<Float> gzg0Var, ytw<jxo> ytwVar, isw iswVar, ytw<iwo> ytwVar2, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = f;
            this.c = f2;
            this.d = f3;
            this.e = gzg0Var;
            this.f = ytwVar;
            this.i = iswVar;
            this.v = ytwVar2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, this.e, this.f, this.i, this.v, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                float f = this.b - (this.c + ((int) (this.f.getValue().a & 4294967295L)));
                final float f2 = this.b;
                final float f3 = this.c;
                final isw iswVar = this.i;
                final ytw<jxo> ytwVar = this.f;
                final ytw<iwo> ytwVar2 = this.v;
                Function2 function2 = new Function2() { // from class: fai
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        float fFloatValue = ((Float) obj2).floatValue();
                        ((Float) obj3).getClass();
                        float fJ = iswVar.j();
                        ytw ytwVar3 = ytwVar;
                        ytwVar2.setValue(new iwo(((long) ((int) ((f2 - (zen.a((int) (((jxo) ytwVar3.getValue()).a & 4294967295L), fJ * ((int) (((jxo) ytwVar3.getValue()).a & 4294967295L)), 2.0f, fFloatValue) + ((int) (((jxo) ytwVar3.getValue()).a & 4294967295L)))) - f3))) & 4294967295L));
                        return Unit.a;
                    }
                };
                this.a = 1;
                if (sje0.c(f, this.d, 0.0f, this.e, function2, this, 4) == y5bVar) {
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

    @c0d(c = "com.sporty.android.platform.features.loyalty.footballgame.screen.FootballBannerKt$FootballBanner$1$1$3", f = "FootballBanner.kt", l = {99}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ gzg0<Float> b;
        public final /* synthetic */ isw c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(gzg0<Float> gzg0Var, isw iswVar, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = gzg0Var;
            this.c = iswVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, this.c, v1bVar);
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
                final isw iswVar = this.c;
                Function2 function2 = new Function2() { // from class: hai
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        float fFloatValue = ((Float) obj2).floatValue();
                        ((Float) obj3).floatValue();
                        iswVar.A(fFloatValue);
                        return Unit.a;
                    }
                };
                this.a = 1;
                if (sje0.c(1.0f, 0.727f, 0.0f, this.b, function2, this, 4) == y5bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gai(gzg0<Float> gzg0Var, Function0<Unit> function0, isw iswVar, isw iswVar2, float f, float f2, ytw<jxo> ytwVar, isw iswVar3, ytw<iwo> ytwVar2, v1b<? super gai> v1bVar) {
        super(2, v1bVar);
        this.c = gzg0Var;
        this.d = function0;
        this.e = iswVar;
        this.f = iswVar2;
        this.i = f;
        this.v = f2;
        this.w = ytwVar;
        this.y = iswVar3;
        this.z = ytwVar2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        gai gaiVar = new gai(this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, v1bVar);
        gaiVar.b = obj;
        return gaiVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((gai) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0091, code lost:
    
        if (defpackage.up1.b(r0, r18) == r8) goto L20;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r5 = r18
            java.lang.Object r0 = r5.b
            r7 = r0
            v5b r7 = (defpackage.v5b) r7
            y5b r8 = defpackage.y5b.a
            int r0 = r5.a
            gzg0<java.lang.Float> r3 = r5.c
            r9 = 0
            r10 = 3
            r11 = 2
            r12 = 1
            if (r0 == 0) goto L2c
            if (r0 == r12) goto L28
            if (r0 == r11) goto L24
            if (r0 != r10) goto L1e
            defpackage.uj50.b(r19)
            goto L94
        L1e:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r0)
            return r9
        L24:
            defpackage.uj50.b(r19)
            goto L53
        L28:
            defpackage.uj50.b(r19)
            goto L3c
        L2c:
            defpackage.uj50.b(r19)
            r5.b = r7
            r5.a = r12
            r0 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r0 = defpackage.hkd.b(r0, r5)
            if (r0 != r8) goto L3c
            goto L93
        L3c:
            eai r4 = new eai
            isw r0 = r5.e
            r4.<init>()
            r5.b = r7
            r5.a = r11
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            r2 = 0
            r6 = 4
            java.lang.Object r0 = defpackage.sje0.c(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r8) goto L53
            goto L93
        L53:
            isw r0 = r5.f
            float r0 = r0.j()
            r1 = r9
            gai$a r9 = new gai$a
            ytw<iwo> r2 = r5.z
            r17 = 0
            r4 = r10
            float r10 = r5.i
            r6 = r12
            float r12 = r5.v
            ytw<jxo> r14 = r5.w
            isw r15 = r5.y
            r13 = r11
            r11 = r0
            r0 = r13
            r16 = r2
            r13 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            pjd r2 = defpackage.ej5.a(r7, r1, r9, r4)
            gai$b r9 = new gai$b
            isw r10 = r5.y
            r9.<init>(r3, r10, r1)
            pjd r3 = defpackage.ej5.a(r7, r1, r9, r4)
            ojd[] r0 = new defpackage.ojd[r0]
            r7 = 0
            r0[r7] = r2
            r0[r6] = r3
            r5.b = r1
            r5.a = r4
            java.lang.Object r0 = defpackage.up1.b(r0, r5)
            if (r0 != r8) goto L94
        L93:
            return r8
        L94:
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r5.d
            r0.invoke()
            kotlin.Unit r0 = kotlin.Unit.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gai.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
