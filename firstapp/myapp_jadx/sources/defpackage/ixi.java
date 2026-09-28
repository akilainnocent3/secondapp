package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.sportygames.commons.components.GiftToast;
import com.sportygames.commons.components.ProgressMeterComponent;
import com.sportygames.commons.components.SGHamburgerMenu;
import com.sportygames.crash.components.header.DepositTooltipComponent;
import com.sportygames.pingpong.components.ShBetContainer;
import com.sportygames.pingpong.components.ShHeaderContainer;
import com.sportygames.pingpong.components.ShMultiplierContainer;
import com.sportygames.pingpong.components.ShRoundBetsContainer;
import com.sportygames.pingpong.components.ShRoundHistoryContainer;
import com.sportygames.sportyherov2.components.SHKeypadContainer;
import com.sportygames.sportyherov2.components.SHToastContainer;

/* JADX INFO: loaded from: classes5.dex */
public final class ixi implements g6i0 {
    public final ImageView A;
    public final ImageView B;
    public final ImageView C;
    public final ImageView D;
    public final ImageView E;
    public final ImageView F;
    public final ImageView G;
    public final ImageView H;
    public final ComposeView I;
    public final GiftToast J;
    public final SGHamburgerMenu K;
    public final ShHeaderContainer L;
    public final SHKeypadContainer M;
    public final ConstraintLayout N;
    public final ShMultiplierContainer O;
    public final SHToastContainer P;
    public final FrameLayout Q;
    public final ConstraintLayout R;
    public final ConstraintLayout S;
    public final ShRoundHistoryContainer T;
    public final ProgressMeterComponent U;
    public final ShRoundBetsContainer V;
    public final View W;
    public final SHToastContainer X;
    public final DepositTooltipComponent Y;
    public final View Z;
    public final ConstraintLayout a;
    public final ShBetContainer b;
    public final ShBetContainer c;
    public final ConstraintLayout d;
    public final View e;
    public final TextView f;
    public final TextView i;
    public final prr v;
    public final ConstraintLayout w;
    public final ComposeView y;
    public final DrawerLayout z;

    public ixi(ConstraintLayout constraintLayout, ShBetContainer shBetContainer, ShBetContainer shBetContainer2, ConstraintLayout constraintLayout2, View view, TextView textView, TextView textView2, prr prrVar, ConstraintLayout constraintLayout3, ComposeView composeView, DrawerLayout drawerLayout, FrameLayout frameLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8, ComposeView composeView2, GiftToast giftToast, SGHamburgerMenu sGHamburgerMenu, ShHeaderContainer shHeaderContainer, SHKeypadContainer sHKeypadContainer, ConstraintLayout constraintLayout4, ShMultiplierContainer shMultiplierContainer, SHToastContainer sHToastContainer, FrameLayout frameLayout2, ConstraintLayout constraintLayout5, ConstraintLayout constraintLayout6, ShRoundHistoryContainer shRoundHistoryContainer, ProgressMeterComponent progressMeterComponent, ShRoundBetsContainer shRoundBetsContainer, View view2, SHToastContainer sHToastContainer2, DepositTooltipComponent depositTooltipComponent, View view3) {
        this.a = constraintLayout;
        this.b = shBetContainer;
        this.c = shBetContainer2;
        this.d = constraintLayout2;
        this.e = view;
        this.f = textView;
        this.i = textView2;
        this.v = prrVar;
        this.w = constraintLayout3;
        this.y = composeView;
        this.z = drawerLayout;
        this.A = imageView;
        this.B = imageView2;
        this.C = imageView3;
        this.D = imageView4;
        this.E = imageView5;
        this.F = imageView6;
        this.G = imageView7;
        this.H = imageView8;
        this.I = composeView2;
        this.J = giftToast;
        this.K = sGHamburgerMenu;
        this.L = shHeaderContainer;
        this.M = sHKeypadContainer;
        this.N = constraintLayout4;
        this.O = shMultiplierContainer;
        this.P = sHToastContainer;
        this.Q = frameLayout2;
        this.R = constraintLayout5;
        this.S = constraintLayout6;
        this.T = shRoundHistoryContainer;
        this.U = progressMeterComponent;
        this.V = shRoundBetsContainer;
        this.W = view2;
        this.X = sHToastContainer2;
        this.Y = depositTooltipComponent;
        this.Z = view3;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
