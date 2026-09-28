package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.github.ybq.android.spinkit.SpinKitView;
import com.sportygames.commons.components.GiftToast;
import com.sportygames.commons.components.ProgressMeterComponent;
import com.sportygames.commons.components.SGHamburgerMenu;
import com.sportygames.commons.components.SgErrorToastContainer;
import com.sportygames.spinmatch.components.BetChips;
import com.sportygames.spinmatch.components.BetConfig;
import com.sportygames.spinmatch.components.RoundResult;
import com.sportygames.spinmatch.components.SMHeaderContainer;
import com.sportygames.spinmatch.components.WheelLayout;
import com.sportygames.sportyherov2.components.SHToastContainer;
import nl.dionsegijn.konfetti.xml.KonfettiView;

/* JADX INFO: loaded from: classes6.dex */
public final class fo80 implements g6i0 {
    public final SgErrorToastContainer A;
    public final TextView B;
    public final ConstraintLayout C;
    public final ComposeView D;
    public final GiftToast E;
    public final SGHamburgerMenu F;
    public final SMHeaderContainer G;
    public final ImageView H;
    public final ConstraintLayout I;
    public final KonfettiView J;
    public final TextView K;
    public final FrameLayout L;
    public final ConstraintLayout M;
    public final ProgressMeterComponent N;
    public final TextView O;
    public final ConstraintLayout P;
    public final RoundResult Q;
    public final TextView R;
    public final ConstraintLayout S;
    public final SpinKitView T;
    public final ConstraintLayout U;
    public final ImageView V;
    public final ConstraintLayout W;
    public final TextView X;
    public final View Y;
    public final View Z;
    public final ConstraintLayout a;
    public final View a0;
    public final TextView b;
    public final View b0;
    public final BetConfig c;
    public final WheelLayout c0;
    public final ConstraintLayout d;
    public final SHToastContainer d0;
    public final TextView e;
    public final TextView e0;
    public final TextView f;
    public final BetChips i;
    public final ConstraintLayout v;
    public final ImageView w;
    public final TextView y;
    public final DrawerLayout z;

    public fo80(ConstraintLayout constraintLayout, TextView textView, BetConfig betConfig, ConstraintLayout constraintLayout2, TextView textView2, TextView textView3, BetChips betChips, ConstraintLayout constraintLayout3, ImageView imageView, TextView textView4, DrawerLayout drawerLayout, SgErrorToastContainer sgErrorToastContainer, TextView textView5, ConstraintLayout constraintLayout4, ComposeView composeView, GiftToast giftToast, SGHamburgerMenu sGHamburgerMenu, SMHeaderContainer sMHeaderContainer, ImageView imageView2, ConstraintLayout constraintLayout5, KonfettiView konfettiView, TextView textView6, FrameLayout frameLayout, ConstraintLayout constraintLayout6, ProgressMeterComponent progressMeterComponent, TextView textView7, ConstraintLayout constraintLayout7, RoundResult roundResult, TextView textView8, ConstraintLayout constraintLayout8, SpinKitView spinKitView, ConstraintLayout constraintLayout9, ImageView imageView3, ConstraintLayout constraintLayout10, TextView textView9, View view, View view2, View view3, View view4, WheelLayout wheelLayout, SHToastContainer sHToastContainer, TextView textView10) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = betConfig;
        this.d = constraintLayout2;
        this.e = textView2;
        this.f = textView3;
        this.i = betChips;
        this.v = constraintLayout3;
        this.w = imageView;
        this.y = textView4;
        this.z = drawerLayout;
        this.A = sgErrorToastContainer;
        this.B = textView5;
        this.C = constraintLayout4;
        this.D = composeView;
        this.E = giftToast;
        this.F = sGHamburgerMenu;
        this.G = sMHeaderContainer;
        this.H = imageView2;
        this.I = constraintLayout5;
        this.J = konfettiView;
        this.K = textView6;
        this.L = frameLayout;
        this.M = constraintLayout6;
        this.N = progressMeterComponent;
        this.O = textView7;
        this.P = constraintLayout7;
        this.Q = roundResult;
        this.R = textView8;
        this.S = constraintLayout8;
        this.T = spinKitView;
        this.U = constraintLayout9;
        this.V = imageView3;
        this.W = constraintLayout10;
        this.X = textView9;
        this.Y = view;
        this.Z = view2;
        this.a0 = view3;
        this.b0 = view4;
        this.c0 = wheelLayout;
        this.d0 = sHToastContainer;
        this.e0 = textView10;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
