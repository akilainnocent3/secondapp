package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.loyalty.LoyaltyUseCase$isEnableLoyalty$1", f = "LoyaltyUseCase.kt", l = {71}, m = "invokeSuspend", v = 2)
public final class l2u extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ u2u b;
    public final /* synthetic */ Function1<Boolean, Unit> c;

    @c0d(c = "com.sportybet.android.loyalty.LoyaltyUseCase$isEnableLoyalty$1$1", f = "LoyaltyUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Boolean>, Object> {
        public final /* synthetic */ u2u a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, u2u u2uVar) {
            super(2, v1bVar);
            this.a = u2uVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(v1bVar, this.a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Boolean> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return Boolean.valueOf(this.a.a());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l2u(u2u u2uVar, Function1<? super Boolean, Unit> function1, v1b<? super l2u> v1bVar) {
        super(2, v1bVar);
        this.b = u2uVar;
        this.c = function1;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new l2u(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((l2u) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            u2u u2uVar = this.b;
            k5b k5bVar = u2uVar.a;
            a aVar = new a(null, u2uVar);
            this.a = 1;
            obj = ej5.d(k5bVar, aVar, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        this.c.invoke((Boolean) obj);
        return Unit.a;
    }
}
