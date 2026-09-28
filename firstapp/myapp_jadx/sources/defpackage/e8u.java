package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.LuckyNumberViewModel$6", f = "LuckyNumberViewModel.kt", l = {97}, m = "invokeSuspend", v = 2)
public final class e8u extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ f8u b;

    @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.LuckyNumberViewModel$6$1", f = "LuckyNumberViewModel.kt", l = {99}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<avq, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ f8u c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f8u f8uVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = f8uVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(avq avqVar, v1b<? super Unit> v1bVar) {
            return ((a) create(avqVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            avq avqVar = (avq) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                if (avqVar.i) {
                    f8u f8uVar = this.c;
                    wkh0 wkh0Var = f8uVar.b;
                    b390 b390Var = f8uVar.B;
                    this.b = null;
                    this.a = 1;
                    if (wkh0Var.a(b390Var, this) == y5bVar) {
                        return y5bVar;
                    }
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
    public e8u(f8u f8uVar, v1b<? super e8u> v1bVar) {
        super(2, v1bVar);
        this.b = f8uVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new e8u(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((e8u) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            f8u f8uVar = this.b;
            or60 or60Var = f8uVar.a.f.d;
            a aVar = new a(f8uVar, null);
            this.a = 1;
            if (kzh.b(or60Var, aVar, this) == y5bVar) {
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
