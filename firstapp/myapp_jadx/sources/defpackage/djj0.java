package defpackage;

import android.content.Context;
import android.view.View;
import com.sporty.android.common_ui.widgets.d;
import com.sporty.android.common_ui.widgets.e;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class djj0 extends saj implements iaj<Integer, Integer, Integer, Integer, Unit> {
    @Override // defpackage.iaj
    public final Unit d(Integer num, Integer num2, Integer num3, Integer num4) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        int iIntValue3 = num3.intValue();
        num4.intValue();
        ijj0 ijj0Var = (ijj0) this.receiver;
        ijj0Var.getClass();
        Context contextRequireContext = ijj0Var.requireContext();
        contextRequireContext.getClass();
        e eVar = new e(contextRequireContext);
        eVar.c = d.a.C0204a.b;
        eVar.e = sn5.d(ijj0Var, R.string.page_payment__easy_account_hint, new Object[0]);
        View decorView = ijj0Var.requireActivity().getWindow().getDecorView();
        decorView.getClass();
        eVar.a(iIntValue, iIntValue2, iIntValue3, decorView);
        return Unit.a;
    }
}
