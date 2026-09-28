package defpackage;

import com.sporty.android.core.model.security.sportypin.WithdrawalPinStatusInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.account.verifiedemailchange.notice.EmailChangeNoticeViewModel$fetchSportyPinStatus$1", f = "EmailChangeNoticeViewModel.kt", l = {77}, m = "invokeSuspend", v = 2)
public final class eyf extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ gyf b;

    public static final class a<T> implements myh {
        public final /* synthetic */ gyf a;

        public a(gyf gyfVar) {
            this.a = gyfVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            Object value;
            WithdrawalPinStatusInfo withdrawalPinStatusInfo = (WithdrawalPinStatusInfo) obj;
            wwd0 wwd0Var = this.a.e;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, dyf.a((dyf) value, null, withdrawalPinStatusInfo.getSportyPinStatus(), 1)));
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyf(gyf gyfVar, v1b<? super eyf> v1bVar) {
        super(2, v1bVar);
        this.b = gyfVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new eyf(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((eyf) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            gyf gyfVar = this.b;
            vl50 vl50VarF = bm50.f(gyfVar.b.i0(pu0.c.a));
            a aVar = new a(gyfVar);
            this.a = 1;
            if (vl50VarF.collect(aVar, this) == y5bVar) {
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
