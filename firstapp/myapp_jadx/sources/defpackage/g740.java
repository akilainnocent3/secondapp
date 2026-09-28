package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bethistory.presentation.viewmodel.RealBetHistoryViewModel$clickBulkDeleteButton$1", f = "RealBetHistoryViewModel.kt", l = {366}, m = "invokeSuspend", v = 2)
public final class g740 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ d740 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g740(v1b v1bVar, d740 d740Var) {
        super(2, v1bVar);
        this.b = d740Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new g740(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((g740) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        d740 d740Var = this.b;
        v340 v340Var = d740Var.H;
        wwd0 wwd0Var = d740Var.J;
        wwd0 wwd0Var2 = d740Var.I;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            wwd0Var2.setValue(tzs.b.a);
            wwd0Var.setValue(c330.b.a);
            Iterable iterable = (Iterable) v340Var.a.getValue();
            this.a = 1;
            if (d740Var.B1(iterable, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        List list = (List) v340Var.a.getValue();
        boolean z = !list.isEmpty();
        StringUiText stringUiText = vch0.a;
        c330.a aVar = new c330.a(new ResourceUiText(R.string.wap_home__delete).h(!list.isEmpty() ? new StringUiText(pe4.b(list.size(), " (", ")")) : vch0.a), z);
        wwd0Var.getClass();
        wwd0Var.k(null, aVar);
        wwd0Var2.setValue(tzs.a.a);
        return Unit.a;
    }
}
