package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.domain.usecase.UpdateLotteryUseCase$invoke$2", f = "UpdateLotteryUseCase.kt", l = {50}, m = "invokeSuspend", v = 2)
public final class zjh0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ xjh0 b;
    public final /* synthetic */ a390<Unit> c;

    @c0d(c = "com.sportybet.feature.luckynumber.lobby.domain.usecase.UpdateLotteryUseCase$invoke$2$1", f = "UpdateLotteryUseCase.kt", l = {49}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<myh<? super Long>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(2, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super Long> myhVar, v1b<? super Unit> v1bVar) {
            return ((a) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            myh myhVar = (myh) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                Long l = new Long(-1L);
                this.b = null;
                this.a = 1;
                if (myhVar.emit(l, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.feature.luckynumber.lobby.domain.usecase.UpdateLotteryUseCase$invoke$2$2", f = "UpdateLotteryUseCase.kt", l = {52, 54}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<Long, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ long b;
        public final /* synthetic */ xjh0 c;
        public final /* synthetic */ a390<Unit> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xjh0 xjh0Var, a390<Unit> a390Var, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.c = xjh0Var;
            this.d = a390Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(this.c, this.d, v1bVar);
            bVar.b = ((Number) obj).longValue();
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Long l, v1b<? super Unit> v1bVar) {
            return ((b) create(Long.valueOf(l.longValue()), v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
        
            if (r5.b(r4, r10) == r2) goto L17;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                long r0 = r10.b
                y5b r2 = defpackage.y5b.a
                int r3 = r10.a
                a390<kotlin.Unit> r4 = r10.d
                xjh0 r5 = r10.c
                r6 = 2
                r7 = 1
                if (r3 == 0) goto L21
                if (r3 == r7) goto L1d
                if (r3 != r6) goto L16
                defpackage.uj50.b(r11)
                goto L40
            L16:
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r10)
                r10 = 0
                return r10
            L1d:
                defpackage.uj50.b(r11)
                goto L35
            L21:
                defpackage.uj50.b(r11)
                r8 = 0
                int r11 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
                if (r11 <= 0) goto L35
                r10.b = r0
                r10.a = r7
                java.lang.Object r11 = r5.a(r4, r10)
                if (r11 != r2) goto L35
                goto L3f
            L35:
                r10.b = r0
                r10.a = r6
                java.lang.Object r10 = r5.b(r4, r10)
                if (r10 != r2) goto L40
            L3f:
                return r2
            L40:
                kotlin.Unit r10 = kotlin.Unit.a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: zjh0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zjh0(xjh0 xjh0Var, a390<Unit> a390Var, v1b<? super zjh0> v1bVar) {
        super(2, v1bVar);
        this.b = xjh0Var;
        this.c = a390Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new zjh0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((zjh0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            xjh0 xjh0Var = this.b;
            xjh0Var.getClass();
            xzh xzhVar = new xzh(new or60(new yjh0(2, null)), new a(2, null));
            b bVar = new b(xjh0Var, this.c, null);
            this.a = 1;
            if (kzh.b(xzhVar, bVar, this) == y5bVar) {
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
