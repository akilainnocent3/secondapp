package defpackage;

import android.opengl.GLSurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
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
import com.sportygames.evenodd.components.RoundResult;
import nl.dionsegijn.konfetti.xml.KonfettiView;

/* JADX INFO: loaded from: classes7.dex */
public final class jhg implements g6i0 {
    public final ImageView A;
    public final ImageView B;
    public final ImageView C;
    public final DrawerLayout D;
    public final RoundResult E;
    public final AppCompatTextView F;
    public final TextView G;
    public final ConstraintLayout H;
    public final ConstraintLayout I;
    public final GameHeader J;
    public final ComposeView K;
    public final GiftToast L;
    public final SGHamburgerMenu M;
    public final ImageView N;
    public final ImageView O;
    public final View P;
    public final NavigationView Q;
    public final TextView R;
    public final TextView S;
    public final FrameLayout T;
    public final TextView U;
    public final TextView V;
    public final ProgressMeterComponent W;
    public final TextView X;
    public final ConstraintLayout Y;
    public final ConstraintLayout Z;
    public final CoordinatorLayout a;
    public final KonfettiView a0;
    public final TextView b;
    public final View b0;
    public final BetBoxContainer c;
    public final View c0;
    public final BetChipContainer d;
    public final WalletText d0;
    public final RelativeLayout e;
    public final ConstraintLayout f;
    public final ChipSlider i;
    public final ConstraintLayout v;
    public final GLSurfaceView w;
    public final GLSurfaceView y;
    public final GLSurfaceView z;

    public jhg(CoordinatorLayout coordinatorLayout, TextView textView, BetBoxContainer betBoxContainer, BetChipContainer betChipContainer, RelativeLayout relativeLayout, ConstraintLayout constraintLayout, ChipSlider chipSlider, ConstraintLayout constraintLayout2, GLSurfaceView gLSurfaceView, GLSurfaceView gLSurfaceView2, GLSurfaceView gLSurfaceView3, ImageView imageView, ImageView imageView2, ImageView imageView3, DrawerLayout drawerLayout, RoundResult roundResult, AppCompatTextView appCompatTextView, TextView textView2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, GameHeader gameHeader, ComposeView composeView, GiftToast giftToast, SGHamburgerMenu sGHamburgerMenu, ImageView imageView4, ImageView imageView5, View view, NavigationView navigationView, TextView textView3, TextView textView4, FrameLayout frameLayout, TextView textView5, TextView textView6, ProgressMeterComponent progressMeterComponent, TextView textView7, ConstraintLayout constraintLayout5, ConstraintLayout constraintLayout6, KonfettiView konfettiView, View view2, View view3, WalletText walletText) {
        this.a = coordinatorLayout;
        this.b = textView;
        this.c = betBoxContainer;
        this.d = betChipContainer;
        this.e = relativeLayout;
        this.f = constraintLayout;
        this.i = chipSlider;
        this.v = constraintLayout2;
        this.w = gLSurfaceView;
        this.y = gLSurfaceView2;
        this.z = gLSurfaceView3;
        this.A = imageView;
        this.B = imageView2;
        this.C = imageView3;
        this.D = drawerLayout;
        this.E = roundResult;
        this.F = appCompatTextView;
        this.G = textView2;
        this.H = constraintLayout3;
        this.I = constraintLayout4;
        this.J = gameHeader;
        this.K = composeView;
        this.L = giftToast;
        this.M = sGHamburgerMenu;
        this.N = imageView4;
        this.O = imageView5;
        this.P = view;
        this.Q = navigationView;
        this.R = textView3;
        this.S = textView4;
        this.T = frameLayout;
        this.U = textView5;
        this.V = textView6;
        this.W = progressMeterComponent;
        this.X = textView7;
        this.Y = constraintLayout5;
        this.Z = constraintLayout6;
        this.a0 = konfettiView;
        this.b0 = view2;
        this.c0 = view3;
        this.d0 = walletText;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
