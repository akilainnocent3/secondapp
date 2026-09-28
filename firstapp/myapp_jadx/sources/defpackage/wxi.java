package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sportygames.commons.components.BetChipContainerSpin2Win;
import com.sportygames.commons.components.GiftToast;
import com.sportygames.commons.components.ProgressMeterComponent;
import com.sportygames.commons.components.SGHamburgerMenu;
import com.sportygames.commons.components.SgErrorToastContainer;
import com.sportygames.spin2win.components.Spin2WinButtonBoard;
import com.sportygames.spin2win.components.Spin2WinHeader;
import com.sportygames.spin2win.components.Spin2WinNumberBoard;
import com.sportygames.spin2win.components.Spin2WinWheel;

/* JADX INFO: loaded from: classes6.dex */
public final class wxi implements g6i0 {
    public final ComposeView A;
    public final ConstraintLayout B;
    public final GiftToast C;
    public final Guideline D;
    public final SGHamburgerMenu E;
    public final ImageView F;
    public final View G;
    public final ConstraintLayout H;
    public final TextView I;
    public final Spin2WinNumberBoard J;
    public final FrameLayout K;
    public final TextView L;
    public final ProgressMeterComponent M;
    public final TextView N;
    public final ConstraintLayout O;
    public final Group P;
    public final ConstraintLayout Q;
    public final TextView R;
    public final TextView S;
    public final TextView T;
    public final TextView U;
    public final TextView V;
    public final TextView W;
    public final TextView X;
    public final TextView Y;
    public final TextView Z;
    public final ConstraintLayout a;
    public final ConstraintLayout a0;
    public final ConstraintLayout b;
    public final Group b0;
    public final BetChipContainerSpin2Win c;
    public final Spin2WinWheel c0;
    public final RecyclerView d;
    public final CardView d0;
    public final Group e;
    public final ConstraintLayout f;
    public final Spin2WinButtonBoard i;
    public final ConstraintLayout v;
    public final DrawerLayout w;
    public final SgErrorToastContainer y;
    public final Spin2WinHeader z;

    public wxi(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, BetChipContainerSpin2Win betChipContainerSpin2Win, RecyclerView recyclerView, Group group, ConstraintLayout constraintLayout3, Spin2WinButtonBoard spin2WinButtonBoard, ConstraintLayout constraintLayout4, DrawerLayout drawerLayout, SgErrorToastContainer sgErrorToastContainer, Spin2WinHeader spin2WinHeader, ComposeView composeView, ConstraintLayout constraintLayout5, GiftToast giftToast, Guideline guideline, SGHamburgerMenu sGHamburgerMenu, ImageView imageView, View view, ConstraintLayout constraintLayout6, TextView textView, Spin2WinNumberBoard spin2WinNumberBoard, FrameLayout frameLayout, TextView textView2, ProgressMeterComponent progressMeterComponent, TextView textView3, ConstraintLayout constraintLayout7, Group group2, ConstraintLayout constraintLayout8, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, ConstraintLayout constraintLayout9, Group group3, Spin2WinWheel spin2WinWheel, CardView cardView) {
        this.a = constraintLayout;
        this.b = constraintLayout2;
        this.c = betChipContainerSpin2Win;
        this.d = recyclerView;
        this.e = group;
        this.f = constraintLayout3;
        this.i = spin2WinButtonBoard;
        this.v = constraintLayout4;
        this.w = drawerLayout;
        this.y = sgErrorToastContainer;
        this.z = spin2WinHeader;
        this.A = composeView;
        this.B = constraintLayout5;
        this.C = giftToast;
        this.D = guideline;
        this.E = sGHamburgerMenu;
        this.F = imageView;
        this.G = view;
        this.H = constraintLayout6;
        this.I = textView;
        this.J = spin2WinNumberBoard;
        this.K = frameLayout;
        this.L = textView2;
        this.M = progressMeterComponent;
        this.N = textView3;
        this.O = constraintLayout7;
        this.P = group2;
        this.Q = constraintLayout8;
        this.R = textView4;
        this.S = textView5;
        this.T = textView6;
        this.U = textView7;
        this.V = textView8;
        this.W = textView9;
        this.X = textView10;
        this.Y = textView11;
        this.Z = textView12;
        this.a0 = constraintLayout9;
        this.b0 = group3;
        this.c0 = spin2WinWheel;
        this.d0 = cardView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
