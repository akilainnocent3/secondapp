package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.sporty.android.common.uievent.b;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.multimaker.domain.model.MultiMakerItem;
import com.sportybet.android.multimaker.presentation.activity.MultiMakerActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class afw implements rhw {
    public final /* synthetic */ MultiMakerActivity a;

    @c0d(c = "com.sportybet.android.multimaker.presentation.activity.MultiMakerActivity$setupEventList$1$onClickSuspend$2", f = "MultiMakerActivity.kt", l = {418}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public PopupWindow a;
        public int b;
        public final /* synthetic */ MultiMakerActivity c;
        public final /* synthetic */ View d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MultiMakerActivity multiMakerActivity, View view, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = multiMakerActivity;
            this.d = view;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            PopupWindow popupWindow;
            y5b y5bVar = y5b.a;
            int i = this.b;
            if (i == 0) {
                uj50.b(obj);
                PopupWindow popupWindow2 = this.c.A;
                if (popupWindow2 != null) {
                    if (popupWindow2.isShowing()) {
                        popupWindow2.dismiss();
                    }
                    View view = this.d;
                    popupWindow2.showAsDropDown(view, view.getMeasuredWidth() / 2, 0, 8388613);
                    this.a = popupWindow2;
                    this.b = 1;
                    if (hkd.b(2000L, this) == y5bVar) {
                        return y5bVar;
                    }
                    popupWindow = popupWindow2;
                }
                return Unit.a;
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            popupWindow = this.a;
            uj50.b(obj);
            popupWindow.dismiss();
            return Unit.a;
        }
    }

    public afw(MultiMakerActivity multiMakerActivity) {
        this.a = multiMakerActivity;
    }

    @Override // defpackage.rhw
    public final void a(String str, boolean z) {
        boolean z2;
        int i = MultiMakerActivity.E;
        tjw tjwVarZ1 = this.a.z1();
        wwd0 wwd0Var = tjwVarZ1.M;
        while (true) {
            Object value = wwd0Var.getValue();
            List<MultiMakerItem> list = (List) value;
            ArrayList arrayList = new ArrayList(l48.r(list, 10));
            for (MultiMakerItem multiMakerItemA : list) {
                if (sd9.d(multiMakerItemA).equals(str)) {
                    z2 = z;
                    multiMakerItemA = MultiMakerItem.a(multiMakerItemA, null, null, null, z2, false, 23);
                } else {
                    z2 = z;
                }
                arrayList.add(multiMakerItemA);
                z = z2;
            }
            boolean z3 = z;
            if (wwd0Var.g(value, arrayList)) {
                wwd0 wwd0Var2 = tjwVarZ1.P;
                Boolean bool = Boolean.FALSE;
                wwd0Var2.getClass();
                wwd0Var2.k(null, bool);
                return;
            }
            z = z3;
        }
    }

    @Override // defpackage.rhw
    public final void b(String str) {
        Object next;
        Object value;
        ArrayList arrayList;
        int i = MultiMakerActivity.E;
        tjw tjwVarZ1 = this.a.z1();
        wwd0 wwd0Var = tjwVarZ1.M;
        Iterator it = ((Iterable) wwd0Var.getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!sd9.d((MultiMakerItem) next).equals(str));
        MultiMakerItem multiMakerItem = (MultiMakerItem) next;
        if (Intrinsics.g(multiMakerItem != null ? Boolean.valueOf(multiMakerItem.d) : null, Boolean.TRUE)) {
            ku90<com.sporty.android.common.uievent.a> ku90Var = tjwVarZ1.e0;
            StringUiText stringUiText = vch0.a;
            b.e(ku90Var, new ResourceUiText(R.string.multi_maker__selection_locked), null, new ResourceUiText(R.string.multi_maker__please_unlock_first), null, null, null, null, 506);
            return;
        }
        do {
            value = wwd0Var.getValue();
            arrayList = new ArrayList();
            for (Object obj : (List) value) {
                if (!sd9.d((MultiMakerItem) obj).equals(str)) {
                    arrayList.add(obj);
                }
            }
        } while (!wwd0Var.g(value, arrayList));
        wwd0 wwd0Var2 = tjwVarZ1.N;
        Integer numValueOf = Integer.valueOf(((List) wwd0Var.getValue()).size());
        wwd0Var2.getClass();
        wwd0Var2.k(null, numValueOf);
        if (((List) wwd0Var.getValue()).isEmpty()) {
            tjwVarZ1.x1(1);
        } else if (tjwVarZ1.F1()) {
            tjw.I1(tjwVarZ1, false, 3);
        }
        wwd0 wwd0Var3 = tjwVarZ1.P;
        Boolean bool = Boolean.FALSE;
        wwd0Var3.getClass();
        wwd0Var3.k(null, bool);
    }

    @Override // defpackage.rhw
    public final void c(View view) {
        MultiMakerActivity multiMakerActivity = this.a;
        if (multiMakerActivity.A == null) {
            View viewInflate = LayoutInflater.from(multiMakerActivity).inflate(R.layout.spr_betslip_hint, (ViewGroup) null, false);
            if (viewInflate == null) {
                bmy.a("rootView");
                return;
            }
            TextView textView = (TextView) viewInflate;
            textView.setText(multiMakerActivity.getText(R.string.multi_maker__this_market_is_suspended));
            Drawable drawableA = gr0.a(multiMakerActivity, R.drawable.mm_hint);
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            textView.setBackground(drawableA);
            textView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            PopupWindow popupWindow = new PopupWindow(textView, textView.getMeasuredWidth(), textView.getMeasuredHeight());
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
            popupWindow.setFocusable(true);
            popupWindow.setOutsideTouchable(true);
            multiMakerActivity.A = popupWindow;
        }
        ebs.a(multiMakerActivity.getLifecycle()).b(new a(multiMakerActivity, view, null));
    }
}
