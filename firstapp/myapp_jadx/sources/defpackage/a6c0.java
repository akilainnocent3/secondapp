package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.m;
import androidx.compose.ui.platform.ComposeView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.utils.LineAnimationView;
import com.sportygames.crash.models.bet.BetContainerState;
import com.sportygames.sportyherocompose.components.SHOverBetComponent;
import com.sportygames.sportyherocompose.components.SHRangeComponent;
import com.sportygames.sportyherov2.components.SHKeypadContainer;
import com.sportygames.sportyherov2.components.SideBetTabContainer;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a6c0 {
    public final ComposeView a;
    public final ComposeView b;
    public final gub0 c;
    public final pub0 d;
    public final vm2 e;
    public final uwd0<BetContainerState> f;
    public final uwd0<BetContainerState> g;
    public final ytw<b6c0> h;
    public final ytw<Boolean> i;
    public SideBetTabContainer j;
    public SHOverBetComponent k;
    public SHRangeComponent l;
    public SHKeypadContainer m;
    public SHKeypadContainer n;
    public SHKeypadContainer o;
    public SHKeypadContainer p;
    public boolean q;
    public boolean r;

    public a6c0(qub0 qub0Var, ComposeView composeView, ComposeView composeView2, ComposeView composeView3, gub0 gub0Var, pub0 pub0Var, vm2 vm2Var, wwd0 wwd0Var, wwd0 wwd0Var2, boolean z) {
        wwd0Var.getClass();
        wwd0Var2.getClass();
        this.a = composeView;
        this.b = composeView2;
        this.c = gub0Var;
        this.d = pub0Var;
        this.e = vm2Var;
        this.f = wwd0Var;
        this.g = wwd0Var2;
        this.h = m.b(b6c0.a);
        this.i = m.b(Boolean.valueOf(z));
    }

    public static void a(SideBetTabContainer sideBetTabContainer) {
        rs80 binding = sideBetTabContainer.getBinding();
        if (binding == null) {
            return;
        }
        Resources resources = sideBetTabContainer.getResources();
        float f = resources.getDisplayMetrics().density;
        int i = resources.getConfiguration().screenWidthDp;
        Integer numValueOf = Integer.valueOf(i);
        if (i <= 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : ycv.b(resources.getDisplayMetrics().widthPixels / f);
        int i2 = resources.getConfiguration().screenHeightDp;
        Integer numValueOf2 = i2 > 0 ? Integer.valueOf(i2) : null;
        int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : ycv.b(resources.getDisplayMetrics().heightPixels / f);
        if (iIntValue <= 360 || iIntValue2 <= 700) {
            int iB = ycv.b(2.5f * f);
            if (iB < 1) {
                iB = 1;
            }
            float f2 = f * 1.5f;
            for (LineAnimationView lineAnimationView : b.k(binding.e, binding.A, binding.G)) {
                lineAnimationView.setStrokeWidthPx(f2);
                ViewGroup.LayoutParams layoutParams = lineAnimationView.getLayoutParams();
                if (layoutParams.height != iB) {
                    layoutParams.height = iB;
                    lineAnimationView.setLayoutParams(layoutParams);
                }
            }
        }
    }

    public static void b(SideBetTabContainer sideBetTabContainer, b6c0 b6c0Var, boolean z) {
        boolean zG = Intrinsics.g(((x5a0) gci0.h).getValue(), Boolean.TRUE);
        boolean z2 = zG && z;
        rs80 binding = sideBetTabContainer.getBinding();
        if (binding == null) {
            return;
        }
        LineAnimationView lineAnimationView = binding.G;
        LineAnimationView lineAnimationView2 = binding.A;
        LineAnimationView lineAnimationView3 = binding.e;
        Context context = sideBetTabContainer.getContext();
        int i = R.color.sh_bet_text_enable_color_vip;
        int color = !z2 ? context.getColor(R.color.sh_bet_text_enable_color) : context.getColor(R.color.sh_bet_text_enable_color_vip);
        int color2 = context.getColor(R.color.color_CCCCCC);
        TextView textView = binding.b;
        b6c0 b6c0Var2 = b6c0.a;
        textView.setTextColor(b6c0Var == b6c0Var2 ? color : color2);
        TextView textView2 = binding.y;
        b6c0 b6c0Var3 = b6c0.b;
        textView2.setTextColor(b6c0Var == b6c0Var3 ? color : color2);
        TextView textView3 = binding.E;
        b6c0 b6c0Var4 = b6c0.c;
        if (b6c0Var != b6c0Var4) {
            color = color2;
        }
        textView3.setTextColor(color);
        lineAnimationView3.setVisibility(b6c0Var == b6c0Var2 ? 0 : 8);
        lineAnimationView2.setVisibility(b6c0Var == b6c0Var3 ? 0 : 8);
        lineAnimationView.setVisibility(b6c0Var == b6c0Var4 ? 0 : 8);
        int iOrdinal = b6c0Var.ordinal();
        if (iOrdinal == 0) {
            if (!z2) {
                i = R.color.sh_bet_text_enable_color;
            }
            lineAnimationView3.a(i);
        } else if (iOrdinal == 1) {
            if (!z2) {
                i = R.color.sh_bet_text_enable_color;
            }
            lineAnimationView2.a(i);
        } else if (iOrdinal != 2) {
            uhc.a();
            return;
        } else {
            if (!z2) {
                i = R.color.sh_bet_text_enable_color;
            }
            lineAnimationView.a(i);
        }
        boolean z3 = true;
        boolean z4 = b6c0Var == b6c0Var2;
        boolean z5 = true;
        if (b6c0Var != b6c0Var3) {
            z3 = false;
        }
        if (b6c0Var != b6c0Var4) {
            z5 = false;
        }
        sideBetTabContainer.b(z4, z3, z5, zG, z);
        sideBetTabContainer.setDividerColor(zG, z);
        sideBetTabContainer.setBg(zG, z);
        sideBetTabContainer.setCountFont(zG);
    }

    public final void c() {
        SHKeypadContainer sHKeypadContainer = this.m;
        if (sHKeypadContainer != null) {
            sHKeypadContainer.setVisibility(8);
        }
        SHKeypadContainer sHKeypadContainer2 = this.n;
        if (sHKeypadContainer2 != null) {
            sHKeypadContainer2.setVisibility(8);
        }
        SHKeypadContainer sHKeypadContainer3 = this.o;
        if (sHKeypadContainer3 != null) {
            sHKeypadContainer3.setVisibility(8);
        }
        SHKeypadContainer sHKeypadContainer4 = this.p;
        if (sHKeypadContainer4 != null) {
            sHKeypadContainer4.setVisibility(8);
        }
    }

    public final void d() {
        SHOverBetComponent sHOverBetComponent;
        SHRangeComponent sHRangeComponent;
        SHKeypadContainer sHKeypadContainer;
        SHKeypadContainer sHKeypadContainer2;
        SHKeypadContainer sHKeypadContainer3;
        SHKeypadContainer sHKeypadContainer4;
        if (this.r || (sHOverBetComponent = this.k) == null || (sHRangeComponent = this.l) == null || (sHKeypadContainer = this.m) == null || (sHKeypadContainer2 = this.n) == null || (sHKeypadContainer3 = this.o) == null || (sHKeypadContainer4 = this.p) == null) {
            return;
        }
        if (!this.q) {
            sHOverBetComponent.setupOuKeypad(sHKeypadContainer, sHKeypadContainer2);
            sHRangeComponent.setupRangeKeypad(sHKeypadContainer3, sHKeypadContainer4);
            this.q = true;
        }
        this.r = true;
        this.d.invoke();
    }

    public final void e(b6c0 b6c0Var) {
        x5a0 x5a0Var = (x5a0) this.h;
        if (x5a0Var.getValue() == b6c0Var) {
            return;
        }
        x5a0Var.setValue(b6c0Var);
        this.b.setVisibility(b6c0Var == b6c0.a ? 8 : 0);
        c();
        this.c.invoke(b6c0Var);
    }

    public final void f(boolean z) {
        ComposeView composeView = this.a;
        ViewGroup.LayoutParams layoutParams = composeView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            int dimensionPixelSize = z ? composeView.getResources().getDimensionPixelSize(R.dimen._4sdp) : 0;
            if (marginLayoutParams.topMargin != dimensionPixelSize) {
                marginLayoutParams.topMargin = dimensionPixelSize;
                composeView.setLayoutParams(marginLayoutParams);
            }
        }
        if (z) {
            return;
        }
        e(b6c0.a);
    }
}
