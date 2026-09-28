package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.components.GiftToast;
import com.sportygames.commons.components.ProgressMeterComponent;
import com.sportygames.commons.components.SGHamburgerMenu;
import com.sportygames.commons.components.WalletText;
import eightbitlab.com.blurview.BlurView;

/* JADX INFO: loaded from: classes7.dex */
public final class djh implements g6i0 {
    public final ComposeView A;
    public final GiftToast B;
    public final SGHamburgerMenu C;
    public final ConstraintLayout D;
    public final NavigationView E;
    public final FrameLayout F;
    public final ProgressMeterComponent G;
    public final AppCompatTextView H;
    public final WalletText I;
    public final CoordinatorLayout a;
    public final BlurView b;
    public final ConstraintLayout c;
    public final DrawerLayout d;
    public final yih e;
    public final zih f;
    public final ComposeView i;
    public final ajh v;
    public final bjh w;
    public final cjh y;
    public final FrameLayout z;

    public djh(CoordinatorLayout coordinatorLayout, BlurView blurView, ConstraintLayout constraintLayout, DrawerLayout drawerLayout, yih yihVar, zih zihVar, ComposeView composeView, ajh ajhVar, bjh bjhVar, cjh cjhVar, FrameLayout frameLayout, ComposeView composeView2, GiftToast giftToast, SGHamburgerMenu sGHamburgerMenu, ConstraintLayout constraintLayout2, NavigationView navigationView, FrameLayout frameLayout2, ProgressMeterComponent progressMeterComponent, AppCompatTextView appCompatTextView, WalletText walletText) {
        this.a = coordinatorLayout;
        this.b = blurView;
        this.c = constraintLayout;
        this.d = drawerLayout;
        this.e = yihVar;
        this.f = zihVar;
        this.i = composeView;
        this.v = ajhVar;
        this.w = bjhVar;
        this.y = cjhVar;
        this.z = frameLayout;
        this.A = composeView2;
        this.B = giftToast;
        this.C = sGHamburgerMenu;
        this.D = constraintLayout2;
        this.E = navigationView;
        this.F = frameLayout2;
        this.G = progressMeterComponent;
        this.H = appCompatTextView;
        this.I = walletText;
    }

    public static djh a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.fh_fragment, viewGroup, false);
        int i = R.id.blurBg;
        BlurView blurView = (BlurView) h5e.a(R.id.blurBg, viewInflate);
        if (blurView != null) {
            i = R.id.container;
            ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.container, viewInflate);
            if (constraintLayout != null) {
                i = R.id.drawer_layout;
                DrawerLayout drawerLayout = (DrawerLayout) h5e.a(R.id.drawer_layout, viewInflate);
                if (drawerLayout != null) {
                    i = R.id.fhcBase;
                    View viewA = h5e.a(R.id.fhcBase, viewInflate);
                    if (viewA != null) {
                        int i2 = R.id.chipRvParent;
                        View viewA2 = h5e.a(R.id.chipRvParent, viewA);
                        if (viewA2 != null) {
                            i2 = R.id.chipRvView;
                            View viewA3 = h5e.a(R.id.chipRvView, viewA);
                            if (viewA3 != null) {
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) viewA;
                                i2 = R.id.ivBg;
                                if (((AppCompatImageView) h5e.a(R.id.ivBg, viewA)) != null) {
                                    i2 = R.id.ivLeaf1;
                                    AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.ivLeaf1, viewA);
                                    if (appCompatImageView != null) {
                                        i2 = R.id.ivLeaf2;
                                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.ivLeaf2, viewA);
                                        if (appCompatImageView2 != null) {
                                            i2 = R.id.ivLeaf3;
                                            if (((AppCompatImageView) h5e.a(R.id.ivLeaf3, viewA)) != null) {
                                                i2 = R.id.ivLeaf4;
                                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) h5e.a(R.id.ivLeaf4, viewA);
                                                if (appCompatImageView3 != null) {
                                                    i2 = R.id.layRipple1;
                                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) h5e.a(R.id.layRipple1, viewA);
                                                    if (constraintLayout3 != null) {
                                                        i2 = R.id.layRipple2;
                                                        ConstraintLayout constraintLayout4 = (ConstraintLayout) h5e.a(R.id.layRipple2, viewA);
                                                        if (constraintLayout4 != null) {
                                                            i2 = R.id.layRipple3;
                                                            ConstraintLayout constraintLayout5 = (ConstraintLayout) h5e.a(R.id.layRipple3, viewA);
                                                            if (constraintLayout5 != null) {
                                                                i2 = R.id.layRipple4;
                                                                ConstraintLayout constraintLayout6 = (ConstraintLayout) h5e.a(R.id.layRipple4, viewA);
                                                                if (constraintLayout6 != null) {
                                                                    i2 = R.id.viewSuccessBg;
                                                                    View viewA4 = h5e.a(R.id.viewSuccessBg, viewA);
                                                                    if (viewA4 != null) {
                                                                        yih yihVar = new yih(constraintLayout2, viewA2, viewA3, constraintLayout2, appCompatImageView, appCompatImageView2, appCompatImageView3, constraintLayout3, constraintLayout4, constraintLayout5, constraintLayout6, viewA4);
                                                                        i = R.id.fhcBetFbg;
                                                                        View viewA5 = h5e.a(R.id.fhcBetFbg, viewInflate);
                                                                        if (viewA5 != null) {
                                                                            int i3 = R.id.bgGiftBox;
                                                                            AppCompatImageView appCompatImageView4 = (AppCompatImageView) h5e.a(R.id.bgGiftBox, viewA5);
                                                                            if (appCompatImageView4 != null) {
                                                                                ConstraintLayout constraintLayout7 = (ConstraintLayout) viewA5;
                                                                                i3 = R.id.ivClose;
                                                                                AppCompatImageView appCompatImageView5 = (AppCompatImageView) h5e.a(R.id.ivClose, viewA5);
                                                                                if (appCompatImageView5 != null) {
                                                                                    i3 = R.id.ivGiftClosed;
                                                                                    AppCompatImageView appCompatImageView6 = (AppCompatImageView) h5e.a(R.id.ivGiftClosed, viewA5);
                                                                                    if (appCompatImageView6 != null) {
                                                                                        i3 = R.id.ivGiftOpened;
                                                                                        AppCompatImageView appCompatImageView7 = (AppCompatImageView) h5e.a(R.id.ivGiftOpened, viewA5);
                                                                                        if (appCompatImageView7 != null) {
                                                                                            i3 = R.id.tvGiftAmount;
                                                                                            AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.tvGiftAmount, viewA5);
                                                                                            if (appCompatTextView != null) {
                                                                                                zih zihVar = new zih(constraintLayout7, appCompatImageView4, constraintLayout7, appCompatImageView5, appCompatImageView6, appCompatImageView7, appCompatTextView);
                                                                                                i = R.id.fhcComposeBetSlider;
                                                                                                ComposeView composeView = (ComposeView) h5e.a(R.id.fhcComposeBetSlider, viewInflate);
                                                                                                if (composeView != null) {
                                                                                                    i = R.id.fhcKnife;
                                                                                                    View viewA6 = h5e.a(R.id.fhcKnife, viewInflate);
                                                                                                    if (viewA6 != null) {
                                                                                                        int i4 = R.id.bottom;
                                                                                                        View viewA7 = h5e.a(R.id.bottom, viewA6);
                                                                                                        if (viewA7 != null) {
                                                                                                            i4 = R.id.bottomCopy;
                                                                                                            View viewA8 = h5e.a(R.id.bottomCopy, viewA6);
                                                                                                            if (viewA8 != null) {
                                                                                                                i4 = R.id.guideLine;
                                                                                                                View viewA9 = h5e.a(R.id.guideLine, viewA6);
                                                                                                                if (viewA9 != null) {
                                                                                                                    i4 = R.id.ivKnife;
                                                                                                                    AppCompatImageView appCompatImageView8 = (AppCompatImageView) h5e.a(R.id.ivKnife, viewA6);
                                                                                                                    if (appCompatImageView8 != null) {
                                                                                                                        i4 = R.id.ivKnifeLayout;
                                                                                                                        AppCompatImageView appCompatImageView9 = (AppCompatImageView) h5e.a(R.id.ivKnifeLayout, viewA6);
                                                                                                                        if (appCompatImageView9 != null) {
                                                                                                                            i4 = R.id.ivTrailAngle;
                                                                                                                            View viewA10 = h5e.a(R.id.ivTrailAngle, viewA6);
                                                                                                                            if (viewA10 != null) {
                                                                                                                                i4 = R.id.ivTrailing;
                                                                                                                                View viewA11 = h5e.a(R.id.ivTrailing, viewA6);
                                                                                                                                if (viewA11 != null) {
                                                                                                                                    i4 = R.id.knifeContainer;
                                                                                                                                    ConstraintLayout constraintLayout8 = (ConstraintLayout) h5e.a(R.id.knifeContainer, viewA6);
                                                                                                                                    if (constraintLayout8 != null) {
                                                                                                                                        i4 = R.id.knifePosition;
                                                                                                                                        View viewA12 = h5e.a(R.id.knifePosition, viewA6);
                                                                                                                                        if (viewA12 != null) {
                                                                                                                                            i4 = R.id.layoutKnifeCenter;
                                                                                                                                            View viewA13 = h5e.a(R.id.layoutKnifeCenter, viewA6);
                                                                                                                                            if (viewA13 != null) {
                                                                                                                                                ejh ejhVarA = ejh.a(viewA13);
                                                                                                                                                i4 = R.id.layoutKnifeLeft;
                                                                                                                                                View viewA14 = h5e.a(R.id.layoutKnifeLeft, viewA6);
                                                                                                                                                if (viewA14 != null) {
                                                                                                                                                    ejh ejhVarA2 = ejh.a(viewA14);
                                                                                                                                                    i4 = R.id.layoutKnifeRight;
                                                                                                                                                    View viewA15 = h5e.a(R.id.layoutKnifeRight, viewA6);
                                                                                                                                                    if (viewA15 != null) {
                                                                                                                                                        ejh ejhVarA3 = ejh.a(viewA15);
                                                                                                                                                        i4 = R.id.lyKnifeArea;
                                                                                                                                                        ConstraintLayout constraintLayout9 = (ConstraintLayout) h5e.a(R.id.lyKnifeArea, viewA6);
                                                                                                                                                        if (constraintLayout9 != null) {
                                                                                                                                                            i4 = R.id.mid;
                                                                                                                                                            View viewA16 = h5e.a(R.id.mid, viewA6);
                                                                                                                                                            if (viewA16 != null) {
                                                                                                                                                                i4 = R.id.offsetKnifeBottom;
                                                                                                                                                                View viewA17 = h5e.a(R.id.offsetKnifeBottom, viewA6);
                                                                                                                                                                if (viewA17 != null) {
                                                                                                                                                                    i4 = R.id.topGuide;
                                                                                                                                                                    View viewA18 = h5e.a(R.id.topGuide, viewA6);
                                                                                                                                                                    if (viewA18 != null) {
                                                                                                                                                                        i4 = R.id.trailingLineContainer;
                                                                                                                                                                        ConstraintLayout constraintLayout10 = (ConstraintLayout) h5e.a(R.id.trailingLineContainer, viewA6);
                                                                                                                                                                        if (constraintLayout10 != null) {
                                                                                                                                                                            i4 = R.id.trailingLineTop;
                                                                                                                                                                            View viewA19 = h5e.a(R.id.trailingLineTop, viewA6);
                                                                                                                                                                            if (viewA19 != null) {
                                                                                                                                                                                i4 = R.id.viewTBottom;
                                                                                                                                                                                View viewA20 = h5e.a(R.id.viewTBottom, viewA6);
                                                                                                                                                                                if (viewA20 != null) {
                                                                                                                                                                                    ajh ajhVar = new ajh((ConstraintLayout) viewA6, viewA7, viewA8, viewA9, appCompatImageView8, appCompatImageView9, viewA10, viewA11, constraintLayout8, viewA12, ejhVarA, ejhVarA2, ejhVarA3, constraintLayout9, viewA16, viewA17, viewA18, constraintLayout10, viewA19, viewA20);
                                                                                                                                                                                    i = R.id.fhcResults;
                                                                                                                                                                                    View viewA21 = h5e.a(R.id.fhcResults, viewInflate);
                                                                                                                                                                                    if (viewA21 != null) {
                                                                                                                                                                                        int i5 = R.id.gift_amount;
                                                                                                                                                                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) h5e.a(R.id.gift_amount, viewA21);
                                                                                                                                                                                        if (appCompatTextView2 != null) {
                                                                                                                                                                                            i5 = R.id.gift_icon;
                                                                                                                                                                                            if (((AppCompatImageView) h5e.a(R.id.gift_icon, viewA21)) != null) {
                                                                                                                                                                                                i5 = R.id.gift_minus_saperator_tv;
                                                                                                                                                                                                if (((AppCompatTextView) h5e.a(R.id.gift_minus_saperator_tv, viewA21)) != null) {
                                                                                                                                                                                                    i5 = R.id.gift_round_detail;
                                                                                                                                                                                                    ConstraintLayout constraintLayout11 = (ConstraintLayout) h5e.a(R.id.gift_round_detail, viewA21);
                                                                                                                                                                                                    if (constraintLayout11 != null) {
                                                                                                                                                                                                        i5 = R.id.ivCutLeft;
                                                                                                                                                                                                        AppCompatImageView appCompatImageView10 = (AppCompatImageView) h5e.a(R.id.ivCutLeft, viewA21);
                                                                                                                                                                                                        if (appCompatImageView10 != null) {
                                                                                                                                                                                                            i5 = R.id.ivCutRight;
                                                                                                                                                                                                            AppCompatImageView appCompatImageView11 = (AppCompatImageView) h5e.a(R.id.ivCutRight, viewA21);
                                                                                                                                                                                                            if (appCompatImageView11 != null) {
                                                                                                                                                                                                                i5 = R.id.ivSplash;
                                                                                                                                                                                                                AppCompatImageView appCompatImageView12 = (AppCompatImageView) h5e.a(R.id.ivSplash, viewA21);
                                                                                                                                                                                                                if (appCompatImageView12 != null) {
                                                                                                                                                                                                                    i5 = R.id.ivWheel;
                                                                                                                                                                                                                    AppCompatImageView appCompatImageView13 = (AppCompatImageView) h5e.a(R.id.ivWheel, viewA21);
                                                                                                                                                                                                                    if (appCompatImageView13 != null) {
                                                                                                                                                                                                                        i5 = R.id.layFireFlies;
                                                                                                                                                                                                                        ConstraintLayout constraintLayout12 = (ConstraintLayout) h5e.a(R.id.layFireFlies, viewA21);
                                                                                                                                                                                                                        if (constraintLayout12 != null) {
                                                                                                                                                                                                                            i5 = R.id.layoutMultiplier;
                                                                                                                                                                                                                            if (((ConstraintLayout) h5e.a(R.id.layoutMultiplier, viewA21)) != null) {
                                                                                                                                                                                                                                i5 = R.id.lySuccessTexts;
                                                                                                                                                                                                                                ConstraintLayout constraintLayout13 = (ConstraintLayout) h5e.a(R.id.lySuccessTexts, viewA21);
                                                                                                                                                                                                                                if (constraintLayout13 != null) {
                                                                                                                                                                                                                                    i5 = R.id.multiplierSvgContainer;
                                                                                                                                                                                                                                    ConstraintLayout constraintLayout14 = (ConstraintLayout) h5e.a(R.id.multiplierSvgContainer, viewA21);
                                                                                                                                                                                                                                    if (constraintLayout14 != null) {
                                                                                                                                                                                                                                        i5 = R.id.total_win_amount;
                                                                                                                                                                                                                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) h5e.a(R.id.total_win_amount, viewA21);
                                                                                                                                                                                                                                        if (appCompatTextView3 != null) {
                                                                                                                                                                                                                                            i5 = R.id.total_win_icon;
                                                                                                                                                                                                                                            if (((AppCompatImageView) h5e.a(R.id.total_win_icon, viewA21)) != null) {
                                                                                                                                                                                                                                                i5 = R.id.tvAtMultiplier;
                                                                                                                                                                                                                                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) h5e.a(R.id.tvAtMultiplier, viewA21);
                                                                                                                                                                                                                                                if (appCompatTextView4 != null) {
                                                                                                                                                                                                                                                    i5 = R.id.tvConnecting;
                                                                                                                                                                                                                                                    AppCompatTextView appCompatTextView5 = (AppCompatTextView) h5e.a(R.id.tvConnecting, viewA21);
                                                                                                                                                                                                                                                    if (appCompatTextView5 != null) {
                                                                                                                                                                                                                                                        i5 = R.id.tvErrorBetterLuck;
                                                                                                                                                                                                                                                        AppCompatTextView appCompatTextView6 = (AppCompatTextView) h5e.a(R.id.tvErrorBetterLuck, viewA21);
                                                                                                                                                                                                                                                        if (appCompatTextView6 != null) {
                                                                                                                                                                                                                                                            i5 = R.id.tvErrorMissed;
                                                                                                                                                                                                                                                            AppCompatTextView appCompatTextView7 = (AppCompatTextView) h5e.a(R.id.tvErrorMissed, viewA21);
                                                                                                                                                                                                                                                            if (appCompatTextView7 != null) {
                                                                                                                                                                                                                                                                i5 = R.id.tvMultiplier;
                                                                                                                                                                                                                                                                AppCompatTextView appCompatTextView8 = (AppCompatTextView) h5e.a(R.id.tvMultiplier, viewA21);
                                                                                                                                                                                                                                                                if (appCompatTextView8 != null) {
                                                                                                                                                                                                                                                                    i5 = R.id.tvWonAmount;
                                                                                                                                                                                                                                                                    AppCompatTextView appCompatTextView9 = (AppCompatTextView) h5e.a(R.id.tvWonAmount, viewA21);
                                                                                                                                                                                                                                                                    if (appCompatTextView9 != null) {
                                                                                                                                                                                                                                                                        i5 = R.id.tvYouWon;
                                                                                                                                                                                                                                                                        AppCompatTextView appCompatTextView10 = (AppCompatTextView) h5e.a(R.id.tvYouWon, viewA21);
                                                                                                                                                                                                                                                                        if (appCompatTextView10 != null) {
                                                                                                                                                                                                                                                                            i5 = R.id.viewSplash;
                                                                                                                                                                                                                                                                            AppCompatImageView appCompatImageView14 = (AppCompatImageView) h5e.a(R.id.viewSplash, viewA21);
                                                                                                                                                                                                                                                                            if (appCompatImageView14 != null) {
                                                                                                                                                                                                                                                                                bjh bjhVar = new bjh((ConstraintLayout) viewA21, appCompatTextView2, constraintLayout11, appCompatImageView10, appCompatImageView11, appCompatImageView12, appCompatImageView13, constraintLayout12, constraintLayout13, constraintLayout14, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, appCompatTextView7, appCompatTextView8, appCompatTextView9, appCompatTextView10, appCompatImageView14);
                                                                                                                                                                                                                                                                                i = R.id.fhcToolbar;
                                                                                                                                                                                                                                                                                View viewA22 = h5e.a(R.id.fhcToolbar, viewInflate);
                                                                                                                                                                                                                                                                                if (viewA22 != null) {
                                                                                                                                                                                                                                                                                    ConstraintLayout constraintLayout15 = (ConstraintLayout) viewA22;
                                                                                                                                                                                                                                                                                    int i6 = R.id.ham;
                                                                                                                                                                                                                                                                                    if (((AppCompatImageView) h5e.a(R.id.ham, viewA22)) != null) {
                                                                                                                                                                                                                                                                                        i6 = R.id.ivBack;
                                                                                                                                                                                                                                                                                        ConstraintLayout constraintLayout16 = (ConstraintLayout) h5e.a(R.id.ivBack, viewA22);
                                                                                                                                                                                                                                                                                        if (constraintLayout16 != null) {
                                                                                                                                                                                                                                                                                            i6 = R.id.ivChat;
                                                                                                                                                                                                                                                                                            AppCompatImageView appCompatImageView15 = (AppCompatImageView) h5e.a(R.id.ivChat, viewA22);
                                                                                                                                                                                                                                                                                            if (appCompatImageView15 != null) {
                                                                                                                                                                                                                                                                                                i6 = R.id.ivHamburger;
                                                                                                                                                                                                                                                                                                ConstraintLayout constraintLayout17 = (ConstraintLayout) h5e.a(R.id.ivHamburger, viewA22);
                                                                                                                                                                                                                                                                                                if (constraintLayout17 != null) {
                                                                                                                                                                                                                                                                                                    i6 = R.id.redMark;
                                                                                                                                                                                                                                                                                                    AppCompatImageView appCompatImageView16 = (AppCompatImageView) h5e.a(R.id.redMark, viewA22);
                                                                                                                                                                                                                                                                                                    if (appCompatImageView16 != null) {
                                                                                                                                                                                                                                                                                                        i6 = R.id.tvGameName;
                                                                                                                                                                                                                                                                                                        AppCompatTextView appCompatTextView11 = (AppCompatTextView) h5e.a(R.id.tvGameName, viewA22);
                                                                                                                                                                                                                                                                                                        if (appCompatTextView11 != null) {
                                                                                                                                                                                                                                                                                                            cjh cjhVar = new cjh(constraintLayout15, constraintLayout15, constraintLayout16, appCompatImageView15, constraintLayout17, appCompatImageView16, appCompatTextView11);
                                                                                                                                                                                                                                                                                                            i = R.id.flContent;
                                                                                                                                                                                                                                                                                                            FrameLayout frameLayout = (FrameLayout) h5e.a(R.id.flContent, viewInflate);
                                                                                                                                                                                                                                                                                                            if (frameLayout != null) {
                                                                                                                                                                                                                                                                                                                i = R.id.games_campaign_progress;
                                                                                                                                                                                                                                                                                                                ComposeView composeView2 = (ComposeView) h5e.a(R.id.games_campaign_progress, viewInflate);
                                                                                                                                                                                                                                                                                                                if (composeView2 != null) {
                                                                                                                                                                                                                                                                                                                    i = R.id.gift_toast_bar;
                                                                                                                                                                                                                                                                                                                    GiftToast giftToast = (GiftToast) h5e.a(R.id.gift_toast_bar, viewInflate);
                                                                                                                                                                                                                                                                                                                    if (giftToast != null) {
                                                                                                                                                                                                                                                                                                                        i = R.id.hamburger_menu;
                                                                                                                                                                                                                                                                                                                        SGHamburgerMenu sGHamburgerMenu = (SGHamburgerMenu) h5e.a(R.id.hamburger_menu, viewInflate);
                                                                                                                                                                                                                                                                                                                        if (sGHamburgerMenu != null) {
                                                                                                                                                                                                                                                                                                                            i = R.id.layBlurParent;
                                                                                                                                                                                                                                                                                                                            ConstraintLayout constraintLayout18 = (ConstraintLayout) h5e.a(R.id.layBlurParent, viewInflate);
                                                                                                                                                                                                                                                                                                                            if (constraintLayout18 != null) {
                                                                                                                                                                                                                                                                                                                                i = R.id.navigationView;
                                                                                                                                                                                                                                                                                                                                NavigationView navigationView = (NavigationView) h5e.a(R.id.navigationView, viewInflate);
                                                                                                                                                                                                                                                                                                                                if (navigationView != null) {
                                                                                                                                                                                                                                                                                                                                    i = R.id.onboarding_images;
                                                                                                                                                                                                                                                                                                                                    FrameLayout frameLayout2 = (FrameLayout) h5e.a(R.id.onboarding_images, viewInflate);
                                                                                                                                                                                                                                                                                                                                    if (frameLayout2 != null) {
                                                                                                                                                                                                                                                                                                                                        i = R.id.progress_meter_component;
                                                                                                                                                                                                                                                                                                                                        ProgressMeterComponent progressMeterComponent = (ProgressMeterComponent) h5e.a(R.id.progress_meter_component, viewInflate);
                                                                                                                                                                                                                                                                                                                                        if (progressMeterComponent != null) {
                                                                                                                                                                                                                                                                                                                                            i = R.id.tvAddMoney;
                                                                                                                                                                                                                                                                                                                                            AppCompatTextView appCompatTextView12 = (AppCompatTextView) h5e.a(R.id.tvAddMoney, viewInflate);
                                                                                                                                                                                                                                                                                                                                            if (appCompatTextView12 != null) {
                                                                                                                                                                                                                                                                                                                                                i = R.id.wallet_textView;
                                                                                                                                                                                                                                                                                                                                                WalletText walletText = (WalletText) h5e.a(R.id.wallet_textView, viewInflate);
                                                                                                                                                                                                                                                                                                                                                if (walletText != null) {
                                                                                                                                                                                                                                                                                                                                                    return new djh((CoordinatorLayout) viewInflate, blurView, constraintLayout, drawerLayout, yihVar, zihVar, composeView, ajhVar, bjhVar, cjhVar, frameLayout, composeView2, giftToast, sGHamburgerMenu, constraintLayout18, navigationView, frameLayout2, progressMeterComponent, appCompatTextView12, walletText);
                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    bmy.a("Missing required view with ID: ".concat(viewA22.getResources().getResourceName(i6)));
                                                                                                                                                                                                                                                                                    return null;
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                        bmy.a("Missing required view with ID: ".concat(viewA21.getResources().getResourceName(i5)));
                                                                                                                                                                                        return null;
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        bmy.a("Missing required view with ID: ".concat(viewA6.getResources().getResourceName(i4)));
                                                                                                        return null;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            bmy.a("Missing required view with ID: ".concat(viewA5.getResources().getResourceName(i3)));
                                                                            return null;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(i2)));
                        return null;
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
