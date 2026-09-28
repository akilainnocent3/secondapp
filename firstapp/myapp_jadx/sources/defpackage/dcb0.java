package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;
import com.sportygames.commons.components.BetBoxContainer;
import com.sportygames.commons.components.BetChipContainer;
import com.sportygames.commons.components.ChipSlider;
import com.sportygames.commons.components.GameHeader;
import com.sportygames.commons.components.GiftToast;
import com.sportygames.commons.components.ProgressMeterComponent;
import com.sportygames.commons.components.SGHamburgerMenu;
import com.sportygames.commons.components.WalletText;
import com.sportygames.spindabottle.components.RoundResult;
import nl.dionsegijn.konfetti.xml.KonfettiView;

/* JADX INFO: loaded from: classes6.dex */
public final class dcb0 implements g6i0 {
    public final AppCompatTextView A;
    public final ConstraintLayout B;
    public final GameHeader C;
    public final ComposeView D;
    public final GiftToast E;
    public final SGHamburgerMenu F;
    public final ConstraintLayout G;
    public final NavigationView H;
    public final TextView I;
    public final FrameLayout J;
    public final TextView K;
    public final TextView L;
    public final ProgressMeterComponent M;
    public final TextView N;
    public final ConstraintLayout O;
    public final ConstraintLayout P;
    public final ImageView Q;
    public final TextView R;
    public final ConstraintLayout S;
    public final View T;
    public final View U;
    public final View V;
    public final View W;
    public final View X;
    public final WalletText Y;
    public final CoordinatorLayout a;
    public final TextView b;
    public final BetBoxContainer c;
    public final BetChipContainer d;
    public final KonfettiView e;
    public final ConstraintLayout f;
    public final ChipSlider i;
    public final ImageView v;
    public final TextView w;
    public final DrawerLayout y;
    public final RoundResult z;

    public dcb0(CoordinatorLayout coordinatorLayout, TextView textView, BetBoxContainer betBoxContainer, BetChipContainer betChipContainer, KonfettiView konfettiView, ConstraintLayout constraintLayout, ChipSlider chipSlider, ImageView imageView, TextView textView2, DrawerLayout drawerLayout, RoundResult roundResult, AppCompatTextView appCompatTextView, ConstraintLayout constraintLayout2, GameHeader gameHeader, ComposeView composeView, GiftToast giftToast, SGHamburgerMenu sGHamburgerMenu, ConstraintLayout constraintLayout3, NavigationView navigationView, TextView textView3, FrameLayout frameLayout, TextView textView4, TextView textView5, ProgressMeterComponent progressMeterComponent, TextView textView6, ConstraintLayout constraintLayout4, ConstraintLayout constraintLayout5, ImageView imageView2, TextView textView7, ConstraintLayout constraintLayout6, View view, View view2, View view3, View view4, View view5, WalletText walletText) {
        this.a = coordinatorLayout;
        this.b = textView;
        this.c = betBoxContainer;
        this.d = betChipContainer;
        this.e = konfettiView;
        this.f = constraintLayout;
        this.i = chipSlider;
        this.v = imageView;
        this.w = textView2;
        this.y = drawerLayout;
        this.z = roundResult;
        this.A = appCompatTextView;
        this.B = constraintLayout2;
        this.C = gameHeader;
        this.D = composeView;
        this.E = giftToast;
        this.F = sGHamburgerMenu;
        this.G = constraintLayout3;
        this.H = navigationView;
        this.I = textView3;
        this.J = frameLayout;
        this.K = textView4;
        this.L = textView5;
        this.M = progressMeterComponent;
        this.N = textView6;
        this.O = constraintLayout4;
        this.P = constraintLayout5;
        this.Q = imageView2;
        this.R = textView7;
        this.S = constraintLayout6;
        this.T = view;
        this.U = view2;
        this.V = view3;
        this.W = view4;
        this.X = view5;
        this.Y = walletText;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
