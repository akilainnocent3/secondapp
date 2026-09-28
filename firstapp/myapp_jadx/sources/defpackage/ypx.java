package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.customCode.newCode.viewmodel.NewCustomCodeViewModel$editCustomCode$1", f = "NewCustomCodeViewModel.kt", l = {93}, m = "invokeSuspend", v = 2)
public final class ypx extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ cqx b;
    public final /* synthetic */ String c;

    public static final class a<T> implements myh {
        public final /* synthetic */ cqx a;

        public a(cqx cqxVar) {
            this.a = cqxVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            cqx cqxVar = this.a;
            wwd0 wwd0Var = cqxVar.a;
            wpx wpxVarA = wpx.a((wpx) cqxVar.b.a.getValue(), null, null, null, null, null, false, false, false, false, 479);
            wwd0Var.getClass();
            wwd0Var.k(null, wpxVarA);
            boolean zIsSuccessful = ((BaseResponse) obj).isSuccessful();
            b390 b390Var = cqxVar.c;
            if (zIsSuccessful) {
                return b390Var.emit(vpx.a.a, v1bVar);
            }
            StringUiText stringUiText = vch0.a;
            return b390Var.emit(new rb90(new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again_later)), v1bVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ypx(cqx cqxVar, String str, v1b<? super ypx> v1bVar) {
        super(2, v1bVar);
        this.b = cqxVar;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ypx(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ypx) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            cqx cqxVar = this.b;
            Integer num = ((wpx) cqxVar.a.getValue()).c;
            if (num != null) {
                lyh<BaseResponse<Void>> lyhVarH = cqxVar.e.h(num.intValue(), this.c);
                a aVar = new a(cqxVar);
                this.a = 1;
                if (lyhVarH.collect(aVar, this) == y5bVar) {
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
