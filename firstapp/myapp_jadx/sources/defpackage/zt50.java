package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.sportygames.commons.components.GiftToast;
import com.sportygames.commons.components.ProgressMeterComponent;
import com.sportygames.commons.components.SGHamburgerMenu;
import com.sportygames.crash.components.header.DepositTooltipComponent;
import com.sportygames.pocketrocket.component.BetContainer;
import com.sportygames.pocketrocket.component.MultiplierContainer;
import com.sportygames.pocketrocket.component.PrAllUserBet;
import com.sportygames.pocketrocket.component.PrHeaderContainer;
import com.sportygames.pocketrocket.component.PrTopWin;
import com.sportygames.pocketrocket.component.PrUserBet;
import com.sportygames.sportyherov2.components.SHKeypadContainer;
import com.sportygames.sportyherov2.components.SHToastContainer;

/* JADX INFO: loaded from: classes7.dex */
public final class zt50 implements g6i0 {
    public final TextView A;
    public final TextView B;
    public final r820 C;
    public final ComposeView D;
    public final CardView E;
    public final DrawerLayout F;
    public final FrameLayout G;
    public final ComposeView H;
    public final GiftToast I;
    public final SGHamburgerMenu J;
    public final PrHeaderContainer K;
    public final SHKeypadContainer L;
    public final MultiplierContainer M;
    public final TextView N;
    public final SHToastContainer O;
    public final FrameLayout P;
    public final ProgressMeterComponent Q;
    public final BetContainer R;
    public final BetContainer S;
    public final ConstraintLayout T;
    public final View U;
    public final SHToastContainer V;
    public final DepositTooltipComponent W;
    public final PrTopWin X;
    public final TextView Y;
    public final PrUserBet Z;
    public final ConstraintLayout a;
    public final ConstraintLayout b;
    public final TextView c;
    public final TextView d;
    public final PrAllUserBet e;
    public final ConstraintLayout f;
    public final View i;
    public final View v;
    public final View w;
    public final ConstraintLayout y;
    public final BetContainer z;

    public zt50(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, PrAllUserBet prAllUserBet, ConstraintLayout constraintLayout3, View view, View view2, View view3, ConstraintLayout constraintLayout4, BetContainer betContainer, TextView textView3, TextView textView4, r820 r820Var, ComposeView composeView, CardView cardView, DrawerLayout drawerLayout, FrameLayout frameLayout, ComposeView composeView2, GiftToast giftToast, SGHamburgerMenu sGHamburgerMenu, PrHeaderContainer prHeaderContainer, SHKeypadContainer sHKeypadContainer, MultiplierContainer multiplierContainer, TextView textView5, SHToastContainer sHToastContainer, FrameLayout frameLayout2, ProgressMeterComponent progressMeterComponent, BetContainer betContainer2, BetContainer betContainer3, ConstraintLayout constraintLayout5, View view4, SHToastContainer sHToastContainer2, DepositTooltipComponent depositTooltipComponent, PrTopWin prTopWin, TextView textView6, PrUserBet prUserBet) {
        this.a = constraintLayout;
        this.b = constraintLayout2;
        this.c = textView;
        this.d = textView2;
        this.e = prAllUserBet;
        this.f = constraintLayout3;
        this.i = view;
        this.v = view2;
        this.w = view3;
        this.y = constraintLayout4;
        this.z = betContainer;
        this.A = textView3;
        this.B = textView4;
        this.C = r820Var;
        this.D = composeView;
        this.E = cardView;
        this.F = drawerLayout;
        this.G = frameLayout;
        this.H = composeView2;
        this.I = giftToast;
        this.J = sGHamburgerMenu;
        this.K = prHeaderContainer;
        this.L = sHKeypadContainer;
        this.M = multiplierContainer;
        this.N = textView5;
        this.O = sHToastContainer;
        this.P = frameLayout2;
        this.Q = progressMeterComponent;
        this.R = betContainer2;
        this.S = betContainer3;
        this.T = constraintLayout5;
        this.U = view4;
        this.V = sHToastContainer2;
        this.W = depositTooltipComponent;
        this.X = prTopWin;
        this.Y = textView6;
        this.Z = prUserBet;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
