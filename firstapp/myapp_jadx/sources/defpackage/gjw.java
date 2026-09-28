package defpackage;

import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.b;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.multimaker.presentation.viewmodel.MultiMakerViewModel$registerUiStates$1", f = "MultiMakerViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class gjw extends tje0 implements Function2<lk50<? extends List<? extends mfb0>>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ tjw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjw(v1b v1bVar, tjw tjwVar) {
        super(2, v1bVar);
        this.b = tjwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        gjw gjwVar = new gjw(v1bVar, this.b);
        gjwVar.a = obj;
        return gjwVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends List<? extends mfb0>> lk50Var, v1b<? super Unit> v1bVar) {
        return ((gjw) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (lk50Var instanceof lk50.a) {
            tjw tjwVar = this.b;
            ku90<a> ku90Var = tjwVar.e0;
            StringUiText stringUiText = vch0.a;
            b.e(ku90Var, null, null, new ResourceUiText(R.string.multi_maker__multi_maker_disabled), null, null, null, new w6d(tjwVar, 1), 251);
        }
        return Unit.a;
    }
}
