package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.presentation.fragment.SwitchPaymentItemV2DialogFragment$initViewModel$1$1", f = "SwitchPaymentItemV2DialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ooe0 extends tje0 implements Function2<wne0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ loe0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooe0(loe0 loe0Var, v1b<? super ooe0> v1bVar) {
        super(2, v1bVar);
        this.b = loe0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ooe0 ooe0Var = new ooe0(this.b, v1bVar);
        ooe0Var.a = obj;
        return ooe0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wne0 wne0Var, v1b<? super Unit> v1bVar) {
        return ((ooe0) create(wne0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object next;
        Window window;
        wne0 wne0Var = (wne0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        loe0 loe0Var = this.b;
        bme bmeVar = loe0Var.y;
        if (bmeVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        Group group = bmeVar.f;
        boolean z = wne0Var.d;
        List<aoe0> list = wne0Var.a;
        group.setVisibility(z ? 0 : 8);
        bme bmeVar2 = loe0Var.y;
        if (bmeVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        bmeVar2.v.setVisibility(z ? 8 : 0);
        bme bmeVar3 = loe0Var.y;
        if (bmeVar3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        bmeVar3.b.setVisibility(z ? 8 : 0);
        bme bmeVar4 = loe0Var.y;
        if (bmeVar4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        bmeVar4.y.setVisibility(wne0Var.b ? 0 : 8);
        bme bmeVar5 = loe0Var.y;
        if (bmeVar5 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TextView textView = bmeVar5.i;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            aoe0 aoe0Var = (aoe0) next;
            if ((aoe0Var instanceof aoe0.e) && aoe0Var.b() && !((aoe0.e) aoe0Var).isDefault()) {
                break;
            }
        }
        int i = 1;
        textView.setEnabled(next != null);
        bme bmeVar6 = loe0Var.y;
        if (bmeVar6 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        RecyclerView.o layoutManager = bmeVar6.A.getLayoutManager();
        layoutManager.getClass();
        final LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        final int iC1 = linearLayoutManager.c1();
        doe0 doe0Var = loe0Var.z;
        if (doe0Var == null) {
            Intrinsics.n("switchPaymentItemV2Adapter");
            throw null;
        }
        doe0Var.i(list);
        bme bmeVar7 = loe0Var.y;
        if (bmeVar7 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        bmeVar7.A.post(new Runnable() { // from class: noe0
            @Override // java.lang.Runnable
            public final void run() {
                linearLayoutManager.w1(iC1, 0);
            }
        });
        boolean z2 = wne0Var.c;
        bme bmeVar8 = loe0Var.y;
        if (bmeVar8 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TextView textView2 = bmeVar8.d;
        textView2.setTextColor(loe0Var.requireContext().getColor(z2 ? R.color.text_type1_primary : R.color.text_disable_type1_primary));
        wvj wvjVar = new wvj(loe0Var, i);
        if (z2) {
            textView2.setOnClickListener(new y7i0(wvjVar));
        } else {
            textView2.setOnClickListener(null);
        }
        Context context = loe0Var.getContext();
        if (context != null) {
            int size = ((list.size() + 1) * zch0.b(context.getResources(), 48)) + zch0.b(context.getResources(), 56);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            loe0Var.requireActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int iMin = Math.min(size, (int) (((double) displayMetrics.heightPixels) * 0.8d));
            Dialog dialog = loe0Var.getDialog();
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
