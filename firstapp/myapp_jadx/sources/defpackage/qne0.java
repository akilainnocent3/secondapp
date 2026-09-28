package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.presentation.fragment.SwitchPaymentItemDialogFragment$initViewModel$1$1", f = "SwitchPaymentItemDialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class qne0 extends tje0 implements Function2<wne0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ sne0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qne0(sne0 sne0Var, v1b<? super qne0> v1bVar) {
        super(2, v1bVar);
        this.b = sne0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        qne0 qne0Var = new qne0(this.b, v1bVar);
        qne0Var.a = obj;
        return qne0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wne0 wne0Var, v1b<? super Unit> v1bVar) {
        return ((qne0) create(wne0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Window window;
        wne0 wne0Var = (wne0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        sne0 sne0Var = this.b;
        ame ameVar = sne0Var.i;
        if (ameVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TextView textView = ameVar.c;
        boolean z = wne0Var.c;
        List<aoe0> list = wne0Var.a;
        textView.setVisibility(z ? 0 : 8);
        ame ameVar2 = sne0Var.i;
        if (ameVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ameVar2.b.setVisibility(z ? 0 : 8);
        ame ameVar3 = sne0Var.i;
        if (ameVar3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ameVar3.c.setText(sn5.d(sne0Var, wne0Var.d ? R.string.common_functions__done : R.string.common_functions__edit, new Object[0]));
        nne0 nne0Var = sne0Var.v;
        if (nne0Var == null) {
            Intrinsics.n("switchPaymentItemAdapter");
            throw null;
        }
        nne0Var.i(list);
        ame ameVar4 = sne0Var.i;
        if (ameVar4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ameVar4.d.setVisibility(wne0Var.b ? 0 : 8);
        Context context = sne0Var.getContext();
        if (context != null) {
            int size = list.size();
            int iB = z ? zch0.b(context.getResources(), HttpStatusCodesKt.HTTP_PROCESSING) : 0;
            Bundle arguments = sne0Var.getArguments();
            int iMin = Math.min((zch0.b(context.getResources(), 53) * size) + iB, arguments != null ? arguments.getBoolean("is_expanded") : false ? (int) (((double) sne0Var.getResources().getDisplayMetrics().heightPixels) * 0.8d) : zch0.b(context.getResources(), 280));
            Dialog dialog = sne0Var.getDialog();
            if (dialog != null && (window = dialog.getWindow()) != null) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.gravity = 80;
                attributes.width = -1;
                attributes.height = iMin;
                window.setAttributes(attributes);
            }
        }
        return Unit.a;
    }
}
