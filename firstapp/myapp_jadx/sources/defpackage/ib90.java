package defpackage;

import com.google.protobuf.RuntimeVersion;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class ib90 {
    public final k650 a;
    public final uqm b;
    public final k5b c;

    @c0d(c = "com.sportybet.domain.ShowReviewEntranceUseCase$shouldShow$1", f = "ShowReviewEntranceUseCase.kt", l = {RuntimeVersion.MINOR}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<myh<? super Boolean>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ h990 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h990 h990Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.d = h990Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = ib90.this.new a(this.d, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super Boolean> myhVar, v1b<? super Unit> v1bVar) {
            return ((a) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            myh myhVar = (myh) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                ib90 ib90Var = ib90.this;
                Boolean boolValueOf = Boolean.valueOf(ib90Var.a.b(this.d.a) && ib90Var.b.isLogin());
                this.b = null;
                this.a = 1;
                if (myhVar.emit(boolValueOf, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.domain.ShowReviewEntranceUseCase$shouldShow$2", f = "ShowReviewEntranceUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements gaj<myh<? super Boolean>, Throwable, v1b<? super Unit>, Object> {
        public /* synthetic */ Throwable a;

        @Override // defpackage.gaj
        public final Object invoke(myh<? super Boolean> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            b bVar = new b(3, v1bVar);
            bVar.a = th;
            return bVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Throwable th = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            itf0.a.d(String.valueOf(th), new Object[0]);
            return Unit.a;
        }
    }

    public ib90(k650 k650Var, uqm uqmVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar) {
        k650Var.getClass();
        uqmVar.getClass();
        this.a = k650Var;
        this.b = uqmVar;
        this.c = k5bVar;
    }

    public final lyh<Boolean> a(h990 h990Var) {
        return ozh.c(new yzh(new or60(new a(h990Var, null)), new b(3, null)), this.c);
    }
}
