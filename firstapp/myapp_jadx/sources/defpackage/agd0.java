package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.FragmentContainerView;
import androidx.recyclerview.widget.RecyclerView;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.tabs.TabLayout;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.plugin.event.view.LiveEventMatchWebView;
import com.sportybet.plugin.event.view.LiveEventVideoView;
import com.sportybet.plugin.lgg.GiftGrabView;
import com.sportybet.plugin.realsports.event.LiveTimerTextView;
import com.sportybet.plugin.realsports.event.widget.LiveEventControlsHeaderView;
import com.sportybet.plugin.realsports.widget.banner.CustomSwipeRefreshLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class agd0 implements g6i0 {
    public final LiveEventMatchWebView A;
    public final LoadingView B;
    public final TabLayout C;
    public final ImageView D;
    public final ComposeView E;
    public final LinearLayout F;
    public final ConsecutiveScrollerLayout G;
    public final ComposeView H;
    public final View I;
    public final View J;
    public final RecyclerView K;
    public final ImageView L;
    public final TextView M;
    public final ConstraintLayout N;
    public final CustomSwipeRefreshLayout O;
    public final ConstraintLayout a;
    public final RelativeLayout b;
    public final View c;
    public final LiveEventControlsHeaderView d;
    public final ConstraintLayout e;
    public final GiftGrabView f;
    public final RelativeLayout i;
    public final View v;
    public final LiveEventVideoView w;
    public final LiveEventMatchWebView y;
    public final LiveEventMatchWebView z;

    public agd0(ConstraintLayout constraintLayout, RelativeLayout relativeLayout, View view, LiveEventControlsHeaderView liveEventControlsHeaderView, ConstraintLayout constraintLayout2, GiftGrabView giftGrabView, RelativeLayout relativeLayout2, View view2, LiveEventVideoView liveEventVideoView, LiveEventMatchWebView liveEventMatchWebView, LiveEventMatchWebView liveEventMatchWebView2, LiveEventMatchWebView liveEventMatchWebView3, LoadingView loadingView, TabLayout tabLayout, ImageView imageView, ComposeView composeView, LinearLayout linearLayout, ConsecutiveScrollerLayout consecutiveScrollerLayout, ComposeView composeView2, View view3, View view4, RecyclerView recyclerView, ImageView imageView2, TextView textView, ConstraintLayout constraintLayout3, CustomSwipeRefreshLayout customSwipeRefreshLayout) {
        this.a = constraintLayout;
        this.b = relativeLayout;
        this.c = view;
        this.d = liveEventControlsHeaderView;
        this.e = constraintLayout2;
        this.f = giftGrabView;
        this.i = relativeLayout2;
        this.v = view2;
        this.w = liveEventVideoView;
        this.y = liveEventMatchWebView;
        this.z = liveEventMatchWebView2;
        this.A = liveEventMatchWebView3;
        this.B = loadingView;
        this.C = tabLayout;
        this.D = imageView;
        this.E = composeView;
        this.F = linearLayout;
        this.G = consecutiveScrollerLayout;
        this.H = composeView2;
        this.I = view3;
        this.J = view4;
        this.K = recyclerView;
        this.L = imageView2;
        this.M = textView;
        this.N = constraintLayout3;
        this.O = customSwipeRefreshLayout;
    }

    public static agd0 a(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.spr_activity_event, (ViewGroup) null, false);
        int i = R.id.action_bar_container;
        View viewA = h5e.a(R.id.action_bar_container, viewInflate);
        if (viewA != null) {
            ij90.a(viewA);
            i = R.id.chat_scroll;
            RelativeLayout relativeLayout = (RelativeLayout) h5e.a(R.id.chat_scroll, viewInflate);
            if (relativeLayout != null) {
                i = R.id.delay_info_hint_container;
                if (((LinearLayout) h5e.a(R.id.delay_info_hint_container, viewInflate)) != null) {
                    i = R.id.divider;
                    View viewA2 = h5e.a(R.id.divider, viewInflate);
                    if (viewA2 != null) {
                        i = R.id.event_header_controls_layout;
                        LiveEventControlsHeaderView liveEventControlsHeaderView = (LiveEventControlsHeaderView) h5e.a(R.id.event_header_controls_layout, viewInflate);
                        if (liveEventControlsHeaderView != null) {
                            i = R.id.event_header_layout;
                            View viewA3 = h5e.a(R.id.event_header_layout, viewInflate);
                            if (viewA3 != null) {
                                int i2 = R.id.activity_img;
                                if (((ImageView) h5e.a(R.id.activity_img, viewA3)) != null) {
                                    i2 = R.id.all_open_bet_arrow;
                                    if (((ImageView) h5e.a(R.id.all_open_bet_arrow, viewA3)) != null) {
                                        i2 = R.id.all_open_bet_count;
                                        if (((TextView) h5e.a(R.id.all_open_bet_count, viewA3)) != null) {
                                            i2 = R.id.all_open_bet_title;
                                            if (((TextView) h5e.a(R.id.all_open_bet_title, viewA3)) != null) {
                                                i2 = R.id.compose_view;
                                                if (((ComposeView) h5e.a(R.id.compose_view, viewA3)) != null) {
                                                    i2 = R.id.divider2;
                                                    if (h5e.a(R.id.divider2, viewA3) != null) {
                                                        i2 = R.id.fifa_world_cup_banner;
                                                        if (((ComposeView) h5e.a(R.id.fifa_world_cup_banner, viewA3)) != null) {
                                                            i2 = R.id.league;
                                                            if (((TextView) h5e.a(R.id.league, viewA3)) != null) {
                                                                i2 = R.id.live_open_bet_c;
                                                                if (((ConstraintLayout) h5e.a(R.id.live_open_bet_c, viewA3)) != null) {
                                                                    i2 = R.id.live_open_bet_count;
                                                                    if (((TextView) h5e.a(R.id.live_open_bet_count, viewA3)) != null) {
                                                                        i2 = R.id.live_open_bet_title;
                                                                        if (((TextView) h5e.a(R.id.live_open_bet_title, viewA3)) != null) {
                                                                            i2 = R.id.match_alert_icon_image_view;
                                                                            if (((AppCompatImageView) h5e.a(R.id.match_alert_icon_image_view, viewA3)) != null) {
                                                                                i2 = R.id.match_alert_loading_view;
                                                                                if (((ProgressBar) h5e.a(R.id.match_alert_loading_view, viewA3)) != null) {
                                                                                    i2 = R.id.open_bet_arrow;
                                                                                    if (((ImageView) h5e.a(R.id.open_bet_arrow, viewA3)) != null) {
                                                                                        i2 = R.id.open_bet_c;
                                                                                        if (((ConstraintLayout) h5e.a(R.id.open_bet_c, viewA3)) != null) {
                                                                                            i2 = R.id.open_bets_container;
                                                                                            if (((FlexboxLayout) h5e.a(R.id.open_bets_container, viewA3)) != null) {
                                                                                                i2 = R.id.score11;
                                                                                                if (((TextView) h5e.a(R.id.score11, viewA3)) != null) {
                                                                                                    i2 = R.id.score12;
                                                                                                    if (((TextView) h5e.a(R.id.score12, viewA3)) != null) {
                                                                                                        i2 = R.id.score13;
                                                                                                        if (((TextView) h5e.a(R.id.score13, viewA3)) != null) {
                                                                                                            i2 = R.id.score21;
                                                                                                            if (((TextView) h5e.a(R.id.score21, viewA3)) != null) {
                                                                                                                i2 = R.id.score22;
                                                                                                                if (((TextView) h5e.a(R.id.score22, viewA3)) != null) {
                                                                                                                    i2 = R.id.score23;
                                                                                                                    if (((TextView) h5e.a(R.id.score23, viewA3)) != null) {
                                                                                                                        i2 = R.id.simulate_img;
                                                                                                                        if (((ImageView) h5e.a(R.id.simulate_img, viewA3)) != null) {
                                                                                                                            i2 = R.id.team1;
                                                                                                                            if (((TextView) h5e.a(R.id.team1, viewA3)) != null) {
                                                                                                                                i2 = R.id.team2;
                                                                                                                                if (((TextView) h5e.a(R.id.team2, viewA3)) != null) {
                                                                                                                                    i2 = R.id.time;
                                                                                                                                    if (((LiveTimerTextView) h5e.a(R.id.time, viewA3)) != null) {
                                                                                                                                        i2 = R.id.virtual_img;
                                                                                                                                        if (((AppCompatImageView) h5e.a(R.id.virtual_img, viewA3)) != null) {
                                                                                                                                            i = R.id.expandable_layout;
                                                                                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.expandable_layout, viewInflate);
                                                                                                                                            if (constraintLayout != null) {
                                                                                                                                                i = R.id.fragment_container;
                                                                                                                                                if (((FragmentContainerView) h5e.a(R.id.fragment_container, viewInflate)) != null) {
                                                                                                                                                    i = R.id.gift_grab_view;
                                                                                                                                                    GiftGrabView giftGrabView = (GiftGrabView) h5e.a(R.id.gift_grab_view, viewInflate);
                                                                                                                                                    if (giftGrabView != null) {
                                                                                                                                                        i = R.id.guideline;
                                                                                                                                                        if (((Guideline) h5e.a(R.id.guideline, viewInflate)) != null) {
                                                                                                                                                            i = R.id.hide;
                                                                                                                                                            RelativeLayout relativeLayout2 = (RelativeLayout) h5e.a(R.id.hide, viewInflate);
                                                                                                                                                            if (relativeLayout2 != null) {
                                                                                                                                                                i = R.id.hide_side_bg;
                                                                                                                                                                View viewA4 = h5e.a(R.id.hide_side_bg, viewInflate);
                                                                                                                                                                if (viewA4 != null) {
                                                                                                                                                                    i = R.id.hide_txt;
                                                                                                                                                                    if (((TextView) h5e.a(R.id.hide_txt, viewInflate)) != null) {
                                                                                                                                                                        i = R.id.image;
                                                                                                                                                                        if (((ImageView) h5e.a(R.id.image, viewInflate)) != null) {
                                                                                                                                                                            i = R.id.live_event_score_container;
                                                                                                                                                                            View viewA5 = h5e.a(R.id.live_event_score_container, viewInflate);
                                                                                                                                                                            if (viewA5 != null) {
                                                                                                                                                                                eid0.a(viewA5);
                                                                                                                                                                                i = R.id.live_event_video_view;
                                                                                                                                                                                LiveEventVideoView liveEventVideoView = (LiveEventVideoView) h5e.a(R.id.live_event_video_view, viewInflate);
                                                                                                                                                                                if (liveEventVideoView != null) {
                                                                                                                                                                                    i = R.id.live_games_view;
                                                                                                                                                                                    LiveEventMatchWebView liveEventMatchWebView = (LiveEventMatchWebView) h5e.a(R.id.live_games_view, viewInflate);
                                                                                                                                                                                    if (liveEventMatchWebView != null) {
                                                                                                                                                                                        i = R.id.live_stats_view;
                                                                                                                                                                                        LiveEventMatchWebView liveEventMatchWebView2 = (LiveEventMatchWebView) h5e.a(R.id.live_stats_view, viewInflate);
                                                                                                                                                                                        if (liveEventMatchWebView2 != null) {
                                                                                                                                                                                            i = R.id.live_tracker_view;
                                                                                                                                                                                            LiveEventMatchWebView liveEventMatchWebView3 = (LiveEventMatchWebView) h5e.a(R.id.live_tracker_view, viewInflate);
                                                                                                                                                                                            if (liveEventMatchWebView3 != null) {
                                                                                                                                                                                                i = R.id.loading_view;
                                                                                                                                                                                                LoadingView loadingView = (LoadingView) h5e.a(R.id.loading_view, viewInflate);
                                                                                                                                                                                                if (loadingView != null) {
                                                                                                                                                                                                    i = R.id.market_group_tabs;
                                                                                                                                                                                                    TabLayout tabLayout = (TabLayout) h5e.a(R.id.market_group_tabs, viewInflate);
                                                                                                                                                                                                    if (tabLayout != null) {
                                                                                                                                                                                                        i = R.id.market_search_image_view;
                                                                                                                                                                                                        ImageView imageView = (ImageView) h5e.a(R.id.market_search_image_view, viewInflate);
                                                                                                                                                                                                        if (imageView != null) {
                                                                                                                                                                                                            i = R.id.market_search_view;
                                                                                                                                                                                                            ComposeView composeView = (ComposeView) h5e.a(R.id.market_search_view, viewInflate);
                                                                                                                                                                                                            if (composeView != null) {
                                                                                                                                                                                                                i = R.id.market_tab_container;
                                                                                                                                                                                                                LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.market_tab_container, viewInflate);
                                                                                                                                                                                                                if (linearLayout != null) {
                                                                                                                                                                                                                    i = R.id.nestedscrollview;
                                                                                                                                                                                                                    ConsecutiveScrollerLayout consecutiveScrollerLayout = (ConsecutiveScrollerLayout) h5e.a(R.id.nestedscrollview, viewInflate);
                                                                                                                                                                                                                    if (consecutiveScrollerLayout != null) {
                                                                                                                                                                                                                        i = R.id.no_chat_hint;
                                                                                                                                                                                                                        if (((TextView) h5e.a(R.id.no_chat_hint, viewInflate)) != null) {
                                                                                                                                                                                                                            i = R.id.odds_filter_view;
                                                                                                                                                                                                                            ComposeView composeView2 = (ComposeView) h5e.a(R.id.odds_filter_view, viewInflate);
                                                                                                                                                                                                                            if (composeView2 != null) {
                                                                                                                                                                                                                                i = R.id.overlay_bottom;
                                                                                                                                                                                                                                View viewA6 = h5e.a(R.id.overlay_bottom, viewInflate);
                                                                                                                                                                                                                                if (viewA6 != null) {
                                                                                                                                                                                                                                    i = R.id.overlay_top;
                                                                                                                                                                                                                                    View viewA7 = h5e.a(R.id.overlay_top, viewInflate);
                                                                                                                                                                                                                                    if (viewA7 != null) {
                                                                                                                                                                                                                                        i = R.id.recycler;
                                                                                                                                                                                                                                        RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.recycler, viewInflate);
                                                                                                                                                                                                                                        if (recyclerView != null) {
                                                                                                                                                                                                                                            i = R.id.refresh_btn;
                                                                                                                                                                                                                                            ImageView imageView2 = (ImageView) h5e.a(R.id.refresh_btn, viewInflate);
                                                                                                                                                                                                                                            if (imageView2 != null) {
                                                                                                                                                                                                                                                i = R.id.right_chat_icon;
                                                                                                                                                                                                                                                TextView textView = (TextView) h5e.a(R.id.right_chat_icon, viewInflate);
                                                                                                                                                                                                                                                if (textView != null) {
                                                                                                                                                                                                                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate;
                                                                                                                                                                                                                                                    i = R.id.swipeRefresh;
                                                                                                                                                                                                                                                    CustomSwipeRefreshLayout customSwipeRefreshLayout = (CustomSwipeRefreshLayout) h5e.a(R.id.swipeRefresh, viewInflate);
                                                                                                                                                                                                                                                    if (customSwipeRefreshLayout != null) {
                                                                                                                                                                                                                                                        return new agd0(constraintLayout2, relativeLayout, viewA2, liveEventControlsHeaderView, constraintLayout, giftGrabView, relativeLayout2, viewA4, liveEventVideoView, liveEventMatchWebView, liveEventMatchWebView2, liveEventMatchWebView3, loadingView, tabLayout, imageView, composeView, linearLayout, consecutiveScrollerLayout, composeView2, viewA6, viewA7, recyclerView, imageView2, textView, constraintLayout2, customSwipeRefreshLayout);
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
                                bmy.a("Missing required view with ID: ".concat(viewA3.getResources().getResourceName(i2)));
                                return null;
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
