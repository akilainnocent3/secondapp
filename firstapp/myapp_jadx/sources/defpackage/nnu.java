package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.customCode.manage.viewmodel.ManageCustomCodeViewModel$deleteCustomCode$1", f = "ManageCustomCodeViewModel.kt", l = {72}, m = "invokeSuspend", v = 2)
public final class nnu extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ rnu b;
    public final /* synthetic */ gdc c;

    public static final class a<T> implements myh {
        public final /* synthetic */ rnu a;
        public final /* synthetic */ gdc b;

        public a(rnu rnuVar, gdc gdcVar) {
            this.a = rnuVar;
            this.b = gdcVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            boolean zIsSuccessful = ((BaseResponse) obj).isSuccessful();
            rnu rnuVar = this.a;
            if (zIsSuccessful) {
                return rnuVar.c.emit(new knu.a(this.b.b), v1bVar);
            }
            b390 b390Var = rnuVar.c;
            StringUiText stringUiText = vch0.a;
            return b390Var.emit(new rb90(new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again_later)), v1bVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nnu(rnu rnuVar, gdc gdcVar, v1b<? super nnu> v1bVar) {
        super(2, v1bVar);
        this.b = rnuVar;
        this.c = gdcVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new nnu(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((nnu) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            rnu rnuVar = this.b;
            eac eacVar = rnuVar.e;
            gdc gdcVar = this.c;
            lyh<BaseResponse<Void>> lyhVarC = eacVar.c(gdcVar.a);
            a aVar = new a(rnuVar, gdcVar);
            this.a = 1;
            if (lyhVarC.collect(aVar, this) == y5bVar) {
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
