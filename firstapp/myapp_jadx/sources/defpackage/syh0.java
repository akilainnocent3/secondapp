package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.verifybet.apidata.VerifyBetData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.verifybet.viewmodel.VerifyBetViewModel$verifyCode$1", f = "VerifyBetViewModel.kt", l = {33}, m = "invokeSuspend", v = 2)
public final class syh0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ tyh0 b;
    public final /* synthetic */ String c;

    @c0d(c = "com.sportybet.android.verifybet.viewmodel.VerifyBetViewModel$verifyCode$1$1", f = "VerifyBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<myh<? super BaseResponse<VerifyBetData>>, v1b<? super Unit>, Object> {
        public final /* synthetic */ tyh0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(tyh0 tyh0Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = tyh0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<VerifyBetData>> myhVar, v1b<? super Unit> v1bVar) {
            return ((a) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.a.e.m(ryh0.e.a);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.verifybet.viewmodel.VerifyBetViewModel$verifyCode$1$2", f = "VerifyBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements gaj<myh<? super BaseResponse<VerifyBetData>>, Throwable, v1b<? super Unit>, Object> {
        public final /* synthetic */ tyh0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(tyh0 tyh0Var, v1b<? super b> v1bVar) {
            super(3, v1bVar);
            this.a = tyh0Var;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super BaseResponse<VerifyBetData>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            return new b(this.a, v1bVar).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.a.e.m(ryh0.f.a);
            return Unit.a;
        }
    }

    public static final class c<T> implements myh {
        public final /* synthetic */ tyh0 a;

        public c(tyh0 tyh0Var) {
            this.a = tyh0Var;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            ryh0 gVar;
            BaseResponse baseResponse = (BaseResponse) obj;
            vu90<ryh0> vu90Var = this.a.e;
            int i = baseResponse.bizCode;
            if (i == 10000) {
                T t = baseResponse.data;
                t.getClass();
                gVar = new ryh0.g((VerifyBetData) t);
            } else if (i == 19411) {
                String str = baseResponse.message;
                str.getClass();
                gVar = new ryh0.c(str);
            } else if (i != 21001) {
                String str2 = baseResponse.message;
                if (i != 21002) {
                    str2.getClass();
                    gVar = new ryh0.d(str2);
                } else {
                    str2.getClass();
                    gVar = new ryh0.a(str2);
                }
            } else {
                gVar = ryh0.b.a;
            }
            vu90Var.m(gVar);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public syh0(tyh0 tyh0Var, String str, v1b<? super syh0> v1bVar) {
        super(2, v1bVar);
        this.b = tyh0Var;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new syh0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((syh0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            tyh0 tyh0Var = this.b;
            yzh yzhVar = new yzh(new xzh(ozh.c(tyh0Var.d.E(this.c), tyh0Var.b), new a(tyh0Var, null)), new b(tyh0Var, null));
            c cVar = new c(tyh0Var);
            this.a = 1;
            if (yzhVar.collect(cVar, this) == y5bVar) {
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
