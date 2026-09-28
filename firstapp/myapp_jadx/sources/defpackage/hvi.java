package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.components.GiftToast;
import com.sportygames.commons.components.ProgressMeterComponent;
import com.sportygames.commons.components.SGHamburgerMenu;
import com.sportygames.sportyherov2.components.SHToastContainer;

/* JADX INFO: loaded from: classes7.dex */
public final class hvi implements g6i0 {
    public final ComposeView A;
    public final ComposeView B;
    public final ComposeView C;
    public final FrameLayout D;
    public final ProgressMeterComponent E;
    public final ComposeView F;
    public final View G;
    public final View H;
    public final ComposeView I;
    public final ComposeView J;
    public final ComposeView K;
    public final ConstraintLayout a;
    public final ComposeView b;
    public final ComposeView c;
    public final ComposeView d;
    public final DrawerLayout e;
    public final ComposeView f;
    public final ComposeView i;
    public final ComposeView v;
    public final ComposeView w;
    public final GiftToast y;
    public final SGHamburgerMenu z;

    public hvi(ConstraintLayout constraintLayout, ComposeView composeView, ComposeView composeView2, ComposeView composeView3, DrawerLayout drawerLayout, ComposeView composeView4, ComposeView composeView5, ComposeView composeView6, ComposeView composeView7, GiftToast giftToast, SGHamburgerMenu sGHamburgerMenu, ComposeView composeView8, ComposeView composeView9, ComposeView composeView10, FrameLayout frameLayout, ProgressMeterComponent progressMeterComponent, ComposeView composeView11, View view, View view2, ComposeView composeView12, ComposeView composeView13, ComposeView composeView14) {
        this.a = constraintLayout;
        this.b = composeView;
        this.c = composeView2;
        this.d = composeView3;
        this.e = drawerLayout;
        this.f = composeView4;
        this.i = composeView5;
        this.v = composeView6;
        this.w = composeView7;
        this.y = giftToast;
        this.z = sGHamburgerMenu;
        this.A = composeView8;
        this.B = composeView9;
        this.C = composeView10;
        this.D = frameLayout;
        this.E = progressMeterComponent;
        this.F = composeView11;
        this.G = view;
        this.H = view2;
        this.I = composeView12;
        this.J = composeView13;
        this.K = composeView14;
    }

    public static hvi a(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_crash_initiated, (ViewGroup) null, false);
        int i = R.id.add_money;
        ComposeView composeView = (ComposeView) h5e.a(R.id.add_money, viewInflate);
        if (composeView != null) {
            i = R.id.bet_view;
            ComposeView composeView2 = (ComposeView) h5e.a(R.id.bet_view, viewInflate);
            if (composeView2 != null) {
                i = R.id.bet_view1;
                if (((ComposeView) h5e.a(R.id.bet_view1, viewInflate)) != null) {
                    i = R.id.bet_view1_horizontal;
                    if (((ComposeView) h5e.a(R.id.bet_view1_horizontal, viewInflate)) != null) {
                        i = R.id.bet_view_horizontal;
                        if (((ComposeView) h5e.a(R.id.bet_view_horizontal, viewInflate)) != null) {
                            i = R.id.bottom_spacer_view;
                            if (((ComposeView) h5e.a(R.id.bottom_spacer_view, viewInflate)) != null) {
                                i = R.id.cashOutToast;
                                View viewA = h5e.a(R.id.cashOutToast, viewInflate);
                                if (viewA != null) {
                                    prr.a(viewA);
                                    i = R.id.composeParent;
                                    if (((ConstraintLayout) h5e.a(R.id.composeParent, viewInflate)) != null) {
                                        i = R.id.compose_view;
                                        ComposeView composeView3 = (ComposeView) h5e.a(R.id.compose_view, viewInflate);
                                        if (composeView3 != null) {
                                            i = R.id.coord;
                                            if (((CoordinatorLayout) h5e.a(R.id.coord, viewInflate)) != null) {
                                                i = R.id.drawer_layout;
                                                DrawerLayout drawerLayout = (DrawerLayout) h5e.a(R.id.drawer_layout, viewInflate);
                                                if (drawerLayout != null) {
                                                    i = R.id.earth_view;
                                                    if (((ComposeView) h5e.a(R.id.earth_view, viewInflate)) != null) {
                                                        i = R.id.error_view;
                                                        ComposeView composeView4 = (ComposeView) h5e.a(R.id.error_view, viewInflate);
                                                        if (composeView4 != null) {
                                                            i = R.id.error_view_betcontainer;
                                                            ComposeView composeView5 = (ComposeView) h5e.a(R.id.error_view_betcontainer, viewInflate);
                                                            if (composeView5 != null) {
                                                                i = R.id.fbg;
                                                                ComposeView composeView6 = (ComposeView) h5e.a(R.id.fbg, viewInflate);
                                                                if (composeView6 != null) {
                                                                    i = R.id.fbg_layout;
                                                                    if (((FrameLayout) h5e.a(R.id.fbg_layout, viewInflate)) != null) {
                                                                        i = R.id.flContent;
                                                                        if (((FrameLayout) h5e.a(R.id.flContent, viewInflate)) != null) {
                                                                            i = R.id.games_campaign_progress;
                                                                            ComposeView composeView7 = (ComposeView) h5e.a(R.id.games_campaign_progress, viewInflate);
                                                                            if (composeView7 != null) {
                                                                                i = R.id.gift_toast_bar;
                                                                                GiftToast giftToast = (GiftToast) h5e.a(R.id.gift_toast_bar, viewInflate);
                                                                                if (giftToast != null) {
                                                                                    i = R.id.gradient_bg_view;
                                                                                    if (((ComposeView) h5e.a(R.id.gradient_bg_view, viewInflate)) != null) {
                                                                                        i = R.id.gradient_bg_view1;
                                                                                        if (((ComposeView) h5e.a(R.id.gradient_bg_view1, viewInflate)) != null) {
                                                                                            i = R.id.gradientLinear;
                                                                                            if (((ComposeView) h5e.a(R.id.gradientLinear, viewInflate)) != null) {
                                                                                                i = R.id.hamburger_menu;
                                                                                                SGHamburgerMenu sGHamburgerMenu = (SGHamburgerMenu) h5e.a(R.id.hamburger_menu, viewInflate);
                                                                                                if (sGHamburgerMenu != null) {
                                                                                                    i = R.id.keyboard_view;
                                                                                                    ComposeView composeView8 = (ComposeView) h5e.a(R.id.keyboard_view, viewInflate);
                                                                                                    if (composeView8 != null) {
                                                                                                        i = R.id.max_error;
                                                                                                        if (((ComposeView) h5e.a(R.id.max_error, viewInflate)) != null) {
                                                                                                            i = R.id.multiplier_background_view;
                                                                                                            if (((ComposeView) h5e.a(R.id.multiplier_background_view, viewInflate)) != null) {
                                                                                                                i = R.id.multiplier_onboarding_view;
                                                                                                                ComposeView composeView9 = (ComposeView) h5e.a(R.id.multiplier_onboarding_view, viewInflate);
                                                                                                                if (composeView9 != null) {
                                                                                                                    i = R.id.multiplier_view;
                                                                                                                    ComposeView composeView10 = (ComposeView) h5e.a(R.id.multiplier_view, viewInflate);
                                                                                                                    if (composeView10 != null) {
                                                                                                                        i = R.id.navigationView;
                                                                                                                        if (((NavigationView) h5e.a(R.id.navigationView, viewInflate)) != null) {
                                                                                                                            i = R.id.networkToast;
                                                                                                                            if (((SHToastContainer) h5e.a(R.id.networkToast, viewInflate)) != null) {
                                                                                                                                i = R.id.onboarding_images;
                                                                                                                                FrameLayout frameLayout = (FrameLayout) h5e.a(R.id.onboarding_images, viewInflate);
                                                                                                                                if (frameLayout != null) {
                                                                                                                                    i = R.id.progress_meter_component;
                                                                                                                                    ProgressMeterComponent progressMeterComponent = (ProgressMeterComponent) h5e.a(R.id.progress_meter_component, viewInflate);
                                                                                                                                    if (progressMeterComponent != null) {
                                                                                                                                        i = R.id.rain_claimed_toast_bar;
                                                                                                                                        View viewA2 = h5e.a(R.id.rain_claimed_toast_bar, viewInflate);
                                                                                                                                        if (viewA2 != null) {
                                                                                                                                            zo80.a(viewA2);
                                                                                                                                            i = R.id.rain_claimed_toast_bar_v2;
                                                                                                                                            View viewA3 = h5e.a(R.id.rain_claimed_toast_bar_v2, viewInflate);
                                                                                                                                            if (viewA3 != null) {
                                                                                                                                                ap80.a(viewA3);
                                                                                                                                                i = R.id.rain_error_toast;
                                                                                                                                                if (((SHToastContainer) h5e.a(R.id.rain_error_toast, viewInflate)) != null) {
                                                                                                                                                    i = R.id.rain_error_toast_v2;
                                                                                                                                                    if (((SHToastContainer) h5e.a(R.id.rain_error_toast_v2, viewInflate)) != null) {
                                                                                                                                                        i = R.id.rain_toast_bar;
                                                                                                                                                        View viewA4 = h5e.a(R.id.rain_toast_bar, viewInflate);
                                                                                                                                                        if (viewA4 != null) {
                                                                                                                                                            bp80.a(viewA4);
                                                                                                                                                            i = R.id.rain_toast_bar_v2;
                                                                                                                                                            View viewA5 = h5e.a(R.id.rain_toast_bar_v2, viewInflate);
                                                                                                                                                            if (viewA5 != null) {
                                                                                                                                                                cp80.a(viewA5);
                                                                                                                                                                i = R.id.root_overlay_container;
                                                                                                                                                                if (((ConstraintLayout) h5e.a(R.id.root_overlay_container, viewInflate)) != null) {
                                                                                                                                                                    i = R.id.round_view;
                                                                                                                                                                    ComposeView composeView11 = (ComposeView) h5e.a(R.id.round_view, viewInflate);
                                                                                                                                                                    if (composeView11 != null) {
                                                                                                                                                                        i = R.id.sj_spacer;
                                                                                                                                                                        View viewA6 = h5e.a(R.id.sj_spacer, viewInflate);
                                                                                                                                                                        if (viewA6 != null) {
                                                                                                                                                                            i = R.id.space;
                                                                                                                                                                            View viewA7 = h5e.a(R.id.space, viewInflate);
                                                                                                                                                                            if (viewA7 != null) {
                                                                                                                                                                                i = R.id.toast_view;
                                                                                                                                                                                ComposeView composeView12 = (ComposeView) h5e.a(R.id.toast_view, viewInflate);
                                                                                                                                                                                if (composeView12 != null) {
                                                                                                                                                                                    i = R.id.wallet_tooltip_view;
                                                                                                                                                                                    ComposeView composeView13 = (ComposeView) h5e.a(R.id.wallet_tooltip_view, viewInflate);
                                                                                                                                                                                    if (composeView13 != null) {
                                                                                                                                                                                        i = R.id.whole_view;
                                                                                                                                                                                        ComposeView composeView14 = (ComposeView) h5e.a(R.id.whole_view, viewInflate);
                                                                                                                                                                                        if (composeView14 != null) {
                                                                                                                                                                                            return new hvi((ConstraintLayout) viewInflate, composeView, composeView2, composeView3, drawerLayout, composeView4, composeView5, composeView6, composeView7, giftToast, sGHamburgerMenu, composeView8, composeView9, composeView10, frameLayout, progressMeterComponent, composeView11, viewA6, viewA7, composeView12, composeView13, composeView14);
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
