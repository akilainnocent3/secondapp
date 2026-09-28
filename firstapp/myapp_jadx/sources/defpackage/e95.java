package defpackage;

import com.sporty.android.common.uievent.a;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.account.register.presentation.br.BrRegistrationSuccessfulViewModel$activateMission$1", f = "BrRegistrationSuccessfulViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class e95 extends tje0 implements Function2<lk50<? extends Unit>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ d95 b;
    public final /* synthetic */ d85.a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e95(d95 d95Var, d85.a aVar, v1b<? super e95> v1bVar) {
        super(2, v1bVar);
        this.b = d95Var;
        this.c = aVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        e95 e95Var = new e95(this.b, this.c, v1bVar);
        e95Var.a = obj;
        return e95Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends Unit> lk50Var, v1b<? super Unit> v1bVar) {
        return ((e95) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        g85 g85Var = this.c.a;
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean zG = Intrinsics.g(lk50Var, lk50.b.a);
        d95 d95Var = this.b;
        if (zG) {
            g85Var.getClass();
            d85.a aVar = new d85.a(g85Var, true);
            int i = d95.B;
            d95Var.C1(aVar);
        } else if (lk50Var instanceof lk50.c) {
            int i2 = d95.B;
            d95Var.getClass();
            long j = g85Var.a;
            String str = g85Var.b;
            qcn<f85> qcnVar = g85Var.c;
            UiText uiText = g85Var.f;
            qcn<cuv> qcnVar2 = g85Var.g;
            str.getClass();
            qcnVar.getClass();
            uiText.getClass();
            qcnVar2.getClass();
            d95Var.C1(new d85.a(new g85(j, str, qcnVar, true, false, uiText, qcnVar2), false));
            ku90<a> ku90Var = d95Var.z;
            StringUiText stringUiText = vch0.a;
            ku90Var.a(new a.m(new ResourceUiText(R.string.page_loyalty__mission_has_been_activated)));
            ej5.c(d95Var.w, null, null, new l95(d95Var, (String) CollectionsKt.T(z76.o.b), null), 3);
        } else {
            if (!(lk50Var instanceof lk50.a)) {
                uhc.a();
                return null;
            }
            int i3 = d95.B;
            d95Var.getClass();
            g85Var.getClass();
            d95Var.C1(new d85.a(g85Var, false));
            ku90<a> ku90Var2 = d95Var.z;
            StringUiText stringUiText2 = vch0.a;
            ku90Var2.a(new a.n(new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again)));
        }
        return Unit.a;
    }
}
