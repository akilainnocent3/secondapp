package defpackage;

import androidx.compose.runtime.m;
import com.sportygames.commons.models.PromotionGiftsResponse;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class t530 extends j8i0 {
    public final rsm a;
    public final ssw<LoadingState<HTTPResponse<PromotionGiftsResponse>>> b;
    public final ssw<LoadingState<HTTPResponse<PromotionGiftsResponse>>> c;
    public final ssw<Boolean> d;
    public final ytw<Boolean> e;
    public final LinkedHashSet f;
    public boolean i;
    public final wwd0 v;
    public final v340 w;

    @c0d(c = "com.sportygames.crash.viewmodel.PromotionalGiftViewModel$getPromotionalGifts$1", f = "PromotionalGiftViewModel.kt", l = {41}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return t530.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            t530 t530Var = t530.this;
            ssw<LoadingState<HTTPResponse<PromotionGiftsResponse>>> sswVar = t530Var.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                sswVar.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
                rsm rsmVar = t530Var.a;
                this.a = 1;
                obj = rsmVar.a(this);
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
            ResultWrapper resultWrapper = (ResultWrapper) obj;
            if (resultWrapper instanceof ResultWrapper.Success) {
                sswVar.j(new LoadingState<>(Status.SUCCESS, ((ResultWrapper.Success) resultWrapper).getValue(), null, null, null, 16, null));
            } else if (resultWrapper instanceof ResultWrapper.NetworkError) {
                sswVar.j(new LoadingState<>(Status.FAILED, null, null, (ResultWrapper.NetworkError) resultWrapper, null, 16, null));
            } else {
                Status status = Status.FAILED;
                resultWrapper.getClass();
                sswVar.j(new LoadingState<>(status, null, (ResultWrapper.GenericError) resultWrapper, null, null, 16, null));
            }
            return Unit.a;
        }
    }

    public t530(rsm rsmVar) {
        rsmVar.getClass();
        this.a = rsmVar;
        this.b = new ssw<>();
        this.c = new ssw<>();
        Boolean bool = Boolean.FALSE;
        this.d = new ssw<>(bool);
        this.e = m.b(bool);
        this.f = new LinkedHashSet();
        this.i = true;
        wwd0 wwd0VarA = xwd0.a(bool);
        this.v = wwd0VarA;
        this.w = e1i.b(wwd0VarA);
    }

    public final void x1() {
        ej5.c(o8i0.d(this), null, null, new a(null), 3);
    }
}
