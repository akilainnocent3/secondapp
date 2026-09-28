package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.components.GiftToast;
import com.sportygames.commons.components.SGHamburgerMenu;
import com.sportygames.crash.components.ProgressMeterComponent;
import com.sportygames.sportyherocompose.utils.GlowView;
import com.sportygames.sportyherov2.components.SHToastContainer;
import eightbitlab.com.blurview.BlurView;

/* JADX INFO: loaded from: classes8.dex */
public final class gvi implements g6i0 {
    public final View A;
    public final ComposeView B;
    public final ComposeView C;
    public final prr D;
    public final ComposeView E;
    public final ConstraintLayout F;
    public final ComposeView G;
    public final DrawerLayout H;
    public final ComposeView I;
    public final ComposeView J;
    public final ComposeView K;
    public final ComposeView L;
    public final ComposeView M;
    public final ComposeView N;
    public final ComposeView O;
    public final ComposeView P;
    public final SGHamburgerMenu Q;
    public final ComposeView R;
    public final ComposeView S;
    public final ComposeView T;
    public final ComposeView U;
    public final ComposeView V;
    public final ComposeView W;
    public final FrameLayout X;
    public final ProgressMeterComponent Y;
    public final SHToastContainer Z;
    public final ConstraintLayout a;
    public final ComposeView a0;
    public final GlowView b;
    public final ComposeView b0;
    public final ComposeView c;
    public final ComposeView c0;
    public final ComposeView d;
    public final ComposeView d0;
    public final ComposeView e;
    public final BlurView e0;
    public final GlowView f;
    public final ComposeView f0;
    public final View g0;
    public final ComposeView h0;
    public final ComposeView i;
    public final ComposeView i0;
    public final View j0;
    public final View k0;
    public final View l0;
    public final View m0;
    public final ComposeView n0;
    public final BlurView o0;
    public final ComposeView p0;
    public final ComposeView q0;
    public final ComposeView r0;
    public final ComposeView s0;
    public final ComposeView t0;
    public final ComposeView u0;
    public final BlurView v;
    public final ComposeView v0;
    public final BlurView w;
    public final View w0;
    public final ConstraintLayout y;
    public final ComposeView z;

    public gvi(ConstraintLayout constraintLayout, GlowView glowView, ComposeView composeView, ComposeView composeView2, ComposeView composeView3, GlowView glowView2, ComposeView composeView4, BlurView blurView, BlurView blurView2, ConstraintLayout constraintLayout2, ComposeView composeView5, View view, ComposeView composeView6, ComposeView composeView7, prr prrVar, ComposeView composeView8, ConstraintLayout constraintLayout3, ComposeView composeView9, DrawerLayout drawerLayout, ComposeView composeView10, ComposeView composeView11, FrameLayout frameLayout, ComposeView composeView12, ComposeView composeView13, ComposeView composeView14, ComposeView composeView15, ComposeView composeView16, ComposeView composeView17, SGHamburgerMenu sGHamburgerMenu, ComposeView composeView18, ComposeView composeView19, ComposeView composeView20, ComposeView composeView21, ComposeView composeView22, ComposeView composeView23, FrameLayout frameLayout2, ProgressMeterComponent progressMeterComponent, SHToastContainer sHToastContainer, ComposeView composeView24, ComposeView composeView25, ComposeView composeView26, ComposeView composeView27, BlurView blurView3, ComposeView composeView28, View view2, ComposeView composeView29, ComposeView composeView30, View view3, View view4, View view5, View view6, ComposeView composeView31, BlurView blurView4, ComposeView composeView32, ComposeView composeView33, ComposeView composeView34, ComposeView composeView35, ComposeView composeView36, ComposeView composeView37, ComposeView composeView38, View view7) {
        this.a = constraintLayout;
        this.b = glowView;
        this.c = composeView;
        this.d = composeView2;
        this.e = composeView3;
        this.f = glowView2;
        this.i = composeView4;
        this.v = blurView;
        this.w = blurView2;
        this.y = constraintLayout2;
        this.z = composeView5;
        this.A = view;
        this.B = composeView6;
        this.C = composeView7;
        this.D = prrVar;
        this.E = composeView8;
        this.F = constraintLayout3;
        this.G = composeView9;
        this.H = drawerLayout;
        this.I = composeView10;
        this.J = composeView11;
        this.K = composeView12;
        this.L = composeView13;
        this.M = composeView14;
        this.N = composeView15;
        this.O = composeView16;
        this.P = composeView17;
        this.Q = sGHamburgerMenu;
        this.R = composeView18;
        this.S = composeView19;
        this.T = composeView20;
        this.U = composeView21;
        this.V = composeView22;
        this.W = composeView23;
        this.X = frameLayout2;
        this.Y = progressMeterComponent;
        this.Z = sHToastContainer;
        this.a0 = composeView24;
        this.b0 = composeView25;
        this.c0 = composeView26;
        this.d0 = composeView27;
        this.e0 = blurView3;
        this.f0 = composeView28;
        this.g0 = view2;
        this.h0 = composeView29;
        this.i0 = composeView30;
        this.j0 = view3;
        this.k0 = view4;
        this.l0 = view5;
        this.m0 = view6;
        this.n0 = composeView31;
        this.o0 = blurView4;
        this.p0 = composeView32;
        this.q0 = composeView33;
        this.r0 = composeView34;
        this.s0 = composeView35;
        this.t0 = composeView36;
        this.u0 = composeView37;
        this.v0 = composeView38;
        this.w0 = view7;
    }

    public static gvi a(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_crash, (ViewGroup) null, false);
        int i = R.id.betGlow;
        GlowView glowView = (GlowView) h5e.a(R.id.betGlow, viewInflate);
        if (glowView != null) {
            i = R.id.bet_view;
            ComposeView composeView = (ComposeView) h5e.a(R.id.bet_view, viewInflate);
            if (composeView != null) {
                i = R.id.bet_view1;
                ComposeView composeView2 = (ComposeView) h5e.a(R.id.bet_view1, viewInflate);
                if (composeView2 != null) {
                    i = R.id.bet_view1_horizontal;
                    ComposeView composeView3 = (ComposeView) h5e.a(R.id.bet_view1_horizontal, viewInflate);
                    if (composeView3 != null) {
                        i = R.id.betViewGlow;
                        GlowView glowView2 = (GlowView) h5e.a(R.id.betViewGlow, viewInflate);
                        if (glowView2 != null) {
                            i = R.id.bet_view_horizontal;
                            ComposeView composeView4 = (ComposeView) h5e.a(R.id.bet_view_horizontal, viewInflate);
                            if (composeView4 != null) {
                                i = R.id.black_gradient_bg_view;
                                if (((ComposeView) h5e.a(R.id.black_gradient_bg_view, viewInflate)) != null) {
                                    i = R.id.blur_gradient_bg_view;
                                    BlurView blurView = (BlurView) h5e.a(R.id.blur_gradient_bg_view, viewInflate);
                                    if (blurView != null) {
                                        i = R.id.blur_gradient_bg_view1;
                                        BlurView blurView2 = (BlurView) h5e.a(R.id.blur_gradient_bg_view1, viewInflate);
                                        if (blurView2 != null) {
                                            i = R.id.blur_target_container;
                                            ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.blur_target_container, viewInflate);
                                            if (constraintLayout != null) {
                                                i = R.id.bonus_notification_view;
                                                ComposeView composeView5 = (ComposeView) h5e.a(R.id.bonus_notification_view, viewInflate);
                                                if (composeView5 != null) {
                                                    i = R.id.bottom_linear_gradient;
                                                    View viewA = h5e.a(R.id.bottom_linear_gradient, viewInflate);
                                                    if (viewA != null) {
                                                        i = R.id.bottom_spacer_view;
                                                        ComposeView composeView6 = (ComposeView) h5e.a(R.id.bottom_spacer_view, viewInflate);
                                                        if (composeView6 != null) {
                                                            i = R.id.cars_speedometer_view;
                                                            ComposeView composeView7 = (ComposeView) h5e.a(R.id.cars_speedometer_view, viewInflate);
                                                            if (composeView7 != null) {
                                                                i = R.id.cashOutToast;
                                                                View viewA2 = h5e.a(R.id.cashOutToast, viewInflate);
                                                                if (viewA2 != null) {
                                                                    prr prrVarA = prr.a(viewA2);
                                                                    i = R.id.chat_compose_view;
                                                                    ComposeView composeView8 = (ComposeView) h5e.a(R.id.chat_compose_view, viewInflate);
                                                                    if (composeView8 != null) {
                                                                        i = R.id.composeParent;
                                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.composeParent, viewInflate);
                                                                        if (constraintLayout2 != null) {
                                                                            i = R.id.compose_view;
                                                                            ComposeView composeView9 = (ComposeView) h5e.a(R.id.compose_view, viewInflate);
                                                                            if (composeView9 != null) {
                                                                                i = R.id.coord;
                                                                                if (((CoordinatorLayout) h5e.a(R.id.coord, viewInflate)) != null) {
                                                                                    i = R.id.drawer_layout;
                                                                                    DrawerLayout drawerLayout = (DrawerLayout) h5e.a(R.id.drawer_layout, viewInflate);
                                                                                    if (drawerLayout != null) {
                                                                                        i = R.id.earth_view;
                                                                                        ComposeView composeView10 = (ComposeView) h5e.a(R.id.earth_view, viewInflate);
                                                                                        if (composeView10 != null) {
                                                                                            i = R.id.error_view;
                                                                                            ComposeView composeView11 = (ComposeView) h5e.a(R.id.error_view, viewInflate);
                                                                                            if (composeView11 != null) {
                                                                                                i = R.id.fbg_layout;
                                                                                                FrameLayout frameLayout = (FrameLayout) h5e.a(R.id.fbg_layout, viewInflate);
                                                                                                if (frameLayout != null) {
                                                                                                    i = R.id.fbg_view;
                                                                                                    ComposeView composeView12 = (ComposeView) h5e.a(R.id.fbg_view, viewInflate);
                                                                                                    if (composeView12 != null) {
                                                                                                        i = R.id.flContent;
                                                                                                        if (((FrameLayout) h5e.a(R.id.flContent, viewInflate)) != null) {
                                                                                                            i = R.id.games_campaign_progress;
                                                                                                            ComposeView composeView13 = (ComposeView) h5e.a(R.id.games_campaign_progress, viewInflate);
                                                                                                            if (composeView13 != null) {
                                                                                                                i = R.id.gift_toast_bar;
                                                                                                                if (((GiftToast) h5e.a(R.id.gift_toast_bar, viewInflate)) != null) {
                                                                                                                    i = R.id.gradient_bg_view;
                                                                                                                    ComposeView composeView14 = (ComposeView) h5e.a(R.id.gradient_bg_view, viewInflate);
                                                                                                                    if (composeView14 != null) {
                                                                                                                        i = R.id.gradient_bg_view1;
                                                                                                                        ComposeView composeView15 = (ComposeView) h5e.a(R.id.gradient_bg_view1, viewInflate);
                                                                                                                        if (composeView15 != null) {
                                                                                                                            i = R.id.gradientLinear;
                                                                                                                            ComposeView composeView16 = (ComposeView) h5e.a(R.id.gradientLinear, viewInflate);
                                                                                                                            if (composeView16 != null) {
                                                                                                                                i = R.id.ground_compose_view;
                                                                                                                                ComposeView composeView17 = (ComposeView) h5e.a(R.id.ground_compose_view, viewInflate);
                                                                                                                                if (composeView17 != null) {
                                                                                                                                    i = R.id.guideline_top_spacer;
                                                                                                                                    if (((Guideline) h5e.a(R.id.guideline_top_spacer, viewInflate)) != null) {
                                                                                                                                        i = R.id.hamburger_menu;
                                                                                                                                        SGHamburgerMenu sGHamburgerMenu = (SGHamburgerMenu) h5e.a(R.id.hamburger_menu, viewInflate);
                                                                                                                                        if (sGHamburgerMenu != null) {
                                                                                                                                            i = R.id.keyboard_view;
                                                                                                                                            ComposeView composeView18 = (ComposeView) h5e.a(R.id.keyboard_view, viewInflate);
                                                                                                                                            if (composeView18 != null) {
                                                                                                                                                i = R.id.multi_level_notification_view;
                                                                                                                                                ComposeView composeView19 = (ComposeView) h5e.a(R.id.multi_level_notification_view, viewInflate);
                                                                                                                                                if (composeView19 != null) {
                                                                                                                                                    i = R.id.multi_level_round_view;
                                                                                                                                                    ComposeView composeView20 = (ComposeView) h5e.a(R.id.multi_level_round_view, viewInflate);
                                                                                                                                                    if (composeView20 != null) {
                                                                                                                                                        i = R.id.multiplier_background_view;
                                                                                                                                                        ComposeView composeView21 = (ComposeView) h5e.a(R.id.multiplier_background_view, viewInflate);
                                                                                                                                                        if (composeView21 != null) {
                                                                                                                                                            i = R.id.multiplier_onboarding_view;
                                                                                                                                                            ComposeView composeView22 = (ComposeView) h5e.a(R.id.multiplier_onboarding_view, viewInflate);
                                                                                                                                                            if (composeView22 != null) {
                                                                                                                                                                i = R.id.multiplier_view;
                                                                                                                                                                ComposeView composeView23 = (ComposeView) h5e.a(R.id.multiplier_view, viewInflate);
                                                                                                                                                                if (composeView23 != null) {
                                                                                                                                                                    i = R.id.navigationView;
                                                                                                                                                                    if (((NavigationView) h5e.a(R.id.navigationView, viewInflate)) != null) {
                                                                                                                                                                        i = R.id.networkToast;
                                                                                                                                                                        if (((SHToastContainer) h5e.a(R.id.networkToast, viewInflate)) != null) {
                                                                                                                                                                            i = R.id.onboarding_images;
                                                                                                                                                                            FrameLayout frameLayout2 = (FrameLayout) h5e.a(R.id.onboarding_images, viewInflate);
                                                                                                                                                                            if (frameLayout2 != null) {
                                                                                                                                                                                i = R.id.progress_meter_component;
                                                                                                                                                                                ProgressMeterComponent progressMeterComponent = (ProgressMeterComponent) h5e.a(R.id.progress_meter_component, viewInflate);
                                                                                                                                                                                if (progressMeterComponent != null) {
                                                                                                                                                                                    i = R.id.rain_claimed_toast_bar;
                                                                                                                                                                                    View viewA3 = h5e.a(R.id.rain_claimed_toast_bar, viewInflate);
                                                                                                                                                                                    if (viewA3 != null) {
                                                                                                                                                                                        zo80.a(viewA3);
                                                                                                                                                                                        i = R.id.rain_claimed_toast_bar_v2;
                                                                                                                                                                                        View viewA4 = h5e.a(R.id.rain_claimed_toast_bar_v2, viewInflate);
                                                                                                                                                                                        if (viewA4 != null) {
                                                                                                                                                                                            ap80.a(viewA4);
                                                                                                                                                                                            i = R.id.rain_error_toast;
                                                                                                                                                                                            if (((SHToastContainer) h5e.a(R.id.rain_error_toast, viewInflate)) != null) {
                                                                                                                                                                                                i = R.id.rain_error_toast_v2;
                                                                                                                                                                                                SHToastContainer sHToastContainer = (SHToastContainer) h5e.a(R.id.rain_error_toast_v2, viewInflate);
                                                                                                                                                                                                if (sHToastContainer != null) {
                                                                                                                                                                                                    i = R.id.rain_spine_view;
                                                                                                                                                                                                    ComposeView composeView24 = (ComposeView) h5e.a(R.id.rain_spine_view, viewInflate);
                                                                                                                                                                                                    if (composeView24 != null) {
                                                                                                                                                                                                        i = R.id.rain_toast_bar;
                                                                                                                                                                                                        View viewA5 = h5e.a(R.id.rain_toast_bar, viewInflate);
                                                                                                                                                                                                        if (viewA5 != null) {
                                                                                                                                                                                                            bp80.a(viewA5);
                                                                                                                                                                                                            i = R.id.rain_toast_bar_v2;
                                                                                                                                                                                                            View viewA6 = h5e.a(R.id.rain_toast_bar_v2, viewInflate);
                                                                                                                                                                                                            if (viewA6 != null) {
                                                                                                                                                                                                                cp80.a(viewA6);
                                                                                                                                                                                                                i = R.id.round_view;
                                                                                                                                                                                                                ComposeView composeView25 = (ComposeView) h5e.a(R.id.round_view, viewInflate);
                                                                                                                                                                                                                if (composeView25 != null) {
                                                                                                                                                                                                                    i = R.id.side_bet_content_view;
                                                                                                                                                                                                                    ComposeView composeView26 = (ComposeView) h5e.a(R.id.side_bet_content_view, viewInflate);
                                                                                                                                                                                                                    if (composeView26 != null) {
                                                                                                                                                                                                                        i = R.id.side_bet_keypad_view;
                                                                                                                                                                                                                        ComposeView composeView27 = (ComposeView) h5e.a(R.id.side_bet_keypad_view, viewInflate);
                                                                                                                                                                                                                        if (composeView27 != null) {
                                                                                                                                                                                                                            i = R.id.side_bet_tab_strip_blur_bg;
                                                                                                                                                                                                                            BlurView blurView3 = (BlurView) h5e.a(R.id.side_bet_tab_strip_blur_bg, viewInflate);
                                                                                                                                                                                                                            if (blurView3 != null) {
                                                                                                                                                                                                                                i = R.id.side_bet_tab_strip_view;
                                                                                                                                                                                                                                ComposeView composeView28 = (ComposeView) h5e.a(R.id.side_bet_tab_strip_view, viewInflate);
                                                                                                                                                                                                                                if (composeView28 != null) {
                                                                                                                                                                                                                                    i = R.id.sj_spacer;
                                                                                                                                                                                                                                    View viewA7 = h5e.a(R.id.sj_spacer, viewInflate);
                                                                                                                                                                                                                                    if (viewA7 != null) {
                                                                                                                                                                                                                                        i = R.id.snow_overlay_view;
                                                                                                                                                                                                                                        ComposeView composeView29 = (ComposeView) h5e.a(R.id.snow_overlay_view, viewInflate);
                                                                                                                                                                                                                                        if (composeView29 != null) {
                                                                                                                                                                                                                                            i = R.id.snow_overlay_view1;
                                                                                                                                                                                                                                            ComposeView composeView30 = (ComposeView) h5e.a(R.id.snow_overlay_view1, viewInflate);
                                                                                                                                                                                                                                            if (composeView30 != null) {
                                                                                                                                                                                                                                                i = R.id.space;
                                                                                                                                                                                                                                                View viewA8 = h5e.a(R.id.space, viewInflate);
                                                                                                                                                                                                                                                if (viewA8 != null) {
                                                                                                                                                                                                                                                    i = R.id.space2;
                                                                                                                                                                                                                                                    View viewA9 = h5e.a(R.id.space2, viewInflate);
                                                                                                                                                                                                                                                    if (viewA9 != null) {
                                                                                                                                                                                                                                                        i = R.id.spacer_1;
                                                                                                                                                                                                                                                        View viewA10 = h5e.a(R.id.spacer_1, viewInflate);
                                                                                                                                                                                                                                                        if (viewA10 != null) {
                                                                                                                                                                                                                                                            i = R.id.toast_view;
                                                                                                                                                                                                                                                            if (((ComposeView) h5e.a(R.id.toast_view, viewInflate)) != null) {
                                                                                                                                                                                                                                                                i = R.id.top_linear_gradient;
                                                                                                                                                                                                                                                                View viewA11 = h5e.a(R.id.top_linear_gradient, viewInflate);
                                                                                                                                                                                                                                                                if (viewA11 != null) {
                                                                                                                                                                                                                                                                    i = R.id.top_list;
                                                                                                                                                                                                                                                                    ComposeView composeView31 = (ComposeView) h5e.a(R.id.top_list, viewInflate);
                                                                                                                                                                                                                                                                    if (composeView31 != null) {
                                                                                                                                                                                                                                                                        i = R.id.top_list_blur_bg;
                                                                                                                                                                                                                                                                        BlurView blurView4 = (BlurView) h5e.a(R.id.top_list_blur_bg, viewInflate);
                                                                                                                                                                                                                                                                        if (blurView4 != null) {
                                                                                                                                                                                                                                                                            i = R.id.tournament_view;
                                                                                                                                                                                                                                                                            ComposeView composeView32 = (ComposeView) h5e.a(R.id.tournament_view, viewInflate);
                                                                                                                                                                                                                                                                            if (composeView32 != null) {
                                                                                                                                                                                                                                                                                i = R.id.turbo_progress;
                                                                                                                                                                                                                                                                                ComposeView composeView33 = (ComposeView) h5e.a(R.id.turbo_progress, viewInflate);
                                                                                                                                                                                                                                                                                if (composeView33 != null) {
                                                                                                                                                                                                                                                                                    i = R.id.vip_elite_view;
                                                                                                                                                                                                                                                                                    ComposeView composeView34 = (ComposeView) h5e.a(R.id.vip_elite_view, viewInflate);
                                                                                                                                                                                                                                                                                    if (composeView34 != null) {
                                                                                                                                                                                                                                                                                        i = R.id.vip_sheet_view;
                                                                                                                                                                                                                                                                                        ComposeView composeView35 = (ComposeView) h5e.a(R.id.vip_sheet_view, viewInflate);
                                                                                                                                                                                                                                                                                        if (composeView35 != null) {
                                                                                                                                                                                                                                                                                            i = R.id.vip_tooltip;
                                                                                                                                                                                                                                                                                            ComposeView composeView36 = (ComposeView) h5e.a(R.id.vip_tooltip, viewInflate);
                                                                                                                                                                                                                                                                                            if (composeView36 != null) {
                                                                                                                                                                                                                                                                                                i = R.id.wallet_tooltip_view;
                                                                                                                                                                                                                                                                                                ComposeView composeView37 = (ComposeView) h5e.a(R.id.wallet_tooltip_view, viewInflate);
                                                                                                                                                                                                                                                                                                if (composeView37 != null) {
                                                                                                                                                                                                                                                                                                    i = R.id.whole_view;
                                                                                                                                                                                                                                                                                                    ComposeView composeView38 = (ComposeView) h5e.a(R.id.whole_view, viewInflate);
                                                                                                                                                                                                                                                                                                    if (composeView38 != null) {
                                                                                                                                                                                                                                                                                                        i = R.id.xmas_bg;
                                                                                                                                                                                                                                                                                                        View viewA12 = h5e.a(R.id.xmas_bg, viewInflate);
                                                                                                                                                                                                                                                                                                        if (viewA12 != null) {
                                                                                                                                                                                                                                                                                                            return new gvi((ConstraintLayout) viewInflate, glowView, composeView, composeView2, composeView3, glowView2, composeView4, blurView, blurView2, constraintLayout, composeView5, viewA, composeView6, composeView7, prrVarA, composeView8, constraintLayout2, composeView9, drawerLayout, composeView10, composeView11, frameLayout, composeView12, composeView13, composeView14, composeView15, composeView16, composeView17, sGHamburgerMenu, composeView18, composeView19, composeView20, composeView21, composeView22, composeView23, frameLayout2, progressMeterComponent, sHToastContainer, composeView24, composeView25, composeView26, composeView27, blurView3, composeView28, viewA7, composeView29, composeView30, viewA8, viewA9, viewA10, viewA11, composeView31, blurView4, composeView32, composeView33, composeView34, composeView35, composeView36, composeView37, composeView38, viewA12);
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
