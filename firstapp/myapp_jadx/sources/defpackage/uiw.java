package defpackage;

import com.sporty.android.common.uievent.AlertDialogCallbackType;
import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.b;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.multimaker.domain.model.MultiMakerItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.multimaker.presentation.viewmodel.MultiMakerViewModel$clickRemoveAll$1", f = "MultiMakerViewModel.kt", l = {622}, m = "invokeSuspend", v = 2)
public final class uiw extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ tjw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uiw(v1b v1bVar, tjw tjwVar) {
        super(2, v1bVar);
        this.b = tjwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new uiw(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((uiw) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        ArrayList arrayList;
        y5b y5bVar = y5b.a;
        int i = this.a;
        tjw tjwVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            Iterable iterable = (Iterable) tjwVar.M.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                do {
                    if (it.hasNext()) {
                    }
                } while (((MultiMakerItem) it.next()).d);
                ku90<a> ku90Var = tjwVar.e0;
                StringUiText stringUiText = vch0.a;
                ResourceUiText resourceUiText = new ResourceUiText(R.string.multi_maker__remove_all_alert_title);
                ResourceUiText resourceUiText2 = new ResourceUiText(R.string.multi_maker__remove_all_alert_message);
                ResourceUiText resourceUiText3 = new ResourceUiText(R.string.common_functions__cancel);
                this.a = 1;
                obj = b.f(ku90Var, resourceUiText, null, resourceUiText2, null, resourceUiText3, null, null, this, 234);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            }
            ku90<a> ku90Var2 = tjwVar.e0;
            StringUiText stringUiText2 = vch0.a;
            b.e(ku90Var2, new ResourceUiText(R.string.multi_maker__selection_locked), null, new ResourceUiText(R.string.multi_maker__please_unlock_first), null, null, null, null, 506);
            return Unit.a;
        }
        if (i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        AlertDialogCallbackType alertDialogCallbackType = (AlertDialogCallbackType) obj;
        alertDialogCallbackType.getClass();
        if (!(alertDialogCallbackType instanceof AlertDialogCallbackType.Positive)) {
            return Unit.a;
        }
        wwd0 wwd0Var = tjwVar.M;
        do {
            value = wwd0Var.getValue();
            arrayList = new ArrayList();
            for (Object obj2 : (List) value) {
                if (((MultiMakerItem) obj2).d) {
                    arrayList.add(obj2);
                }
            }
        } while (!wwd0Var.g(value, arrayList));
        if (((List) tjwVar.M.getValue()).isEmpty()) {
            tjwVar.x1(new Integer(1));
        } else if (tjwVar.F1()) {
            tjw.I1(tjwVar, false, 3);
        }
        return Unit.a;
    }
}
