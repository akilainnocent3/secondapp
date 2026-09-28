package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.common_ui.widgets.CustomProgressButton;
import com.sporty.android.common_ui.widgets.IconTextSelectorButton;
import com.sportybet.feature.payment.impl.deposit.presentation.widget.AmountQuickAddingButtonGroup;
import com.sportybet.feature.payment.impl.deposit.presentation.widget.QuickInputItemListView;

/* JADX INFO: loaded from: classes6.dex */
public final class bvi implements g6i0 {
    public final TextView A;
    public final TextView B;
    public final AmountQuickAddingButtonGroup C;
    public final ComposeView D;
    public final LinearLayout E;
    public final TextView F;
    public final IconTextSelectorButton G;
    public final CustomProgressButton H;
    public final QuickInputItemListView I;
    public final LinearLayout J;
    public final TextView K;
    public final LinearLayout a;
    public final ClearEditText b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final TextView i;
    public final ConstraintLayout v;
    public final TextView w;
    public final TextView y;
    public final IconTextSelectorButton z;

    public bvi(LinearLayout linearLayout, ClearEditText clearEditText, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, ConstraintLayout constraintLayout, TextView textView6, TextView textView7, IconTextSelectorButton iconTextSelectorButton, TextView textView8, TextView textView9, AmountQuickAddingButtonGroup amountQuickAddingButtonGroup, ComposeView composeView, LinearLayout linearLayout2, TextView textView10, IconTextSelectorButton iconTextSelectorButton2, CustomProgressButton customProgressButton, QuickInputItemListView quickInputItemListView, LinearLayout linearLayout3, TextView textView11) {
        this.a = linearLayout;
        this.b = clearEditText;
        this.c = textView;
        this.d = textView2;
        this.e = textView3;
        this.f = textView4;
        this.i = textView5;
        this.v = constraintLayout;
        this.w = textView6;
        this.y = textView7;
        this.z = iconTextSelectorButton;
        this.A = textView8;
        this.B = textView9;
        this.C = amountQuickAddingButtonGroup;
        this.D = composeView;
        this.E = linearLayout2;
        this.F = textView10;
        this.G = iconTextSelectorButton2;
        this.H = customProgressButton;
        this.I = quickInputItemListView;
        this.J = linearLayout3;
        this.K = textView11;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
