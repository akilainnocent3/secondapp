package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.playtimecontrol.confirmation.viewmodel.EditPlayTimeConfirmationViewModel$removeTimeOut$1", f = "EditPlayTimeConfirmationViewModel.kt", l = {111}, m = "invokeSuspend", v = 2)
public final class prf extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ mrf b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public static final class a<T> implements myh {
        public final /* synthetic */ mrf a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public a(mrf mrfVar, String str, String str2) {
            this.a = mrfVar;
            this.b = str;
            this.c = str2;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            boolean z = ((lk50) obj) instanceof lk50.c;
            mrf mrfVar = this.a;
            if (z) {
                return mrfVar.a.getValue() instanceof hrf.b ? mrfVar.A1(this.b, this.c, v1bVar) : Unit.a;
            }
            b390 b390Var = mrfVar.c;
            StringUiText stringUiText = vch0.a;
            return b390Var.emit(new grf.c(new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again)), v1bVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public prf(mrf mrfVar, String str, String str2, v1b<? super prf> v1bVar) {
        super(2, v1bVar);
        this.b = mrfVar;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new prf(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((prf) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            mrf mrfVar = this.b;
            sl50 sl50Var = new sl50(bm50.a(new i750(mrfVar.v.a.I())));
            a aVar = new a(mrfVar, this.c, this.d);
            this.a = 1;
            if (sl50Var.collect(aVar, this) == y5bVar) {
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
