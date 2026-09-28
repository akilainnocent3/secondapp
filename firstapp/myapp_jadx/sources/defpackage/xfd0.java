package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sportybet.android.bookingcode.presentation.widget.BookingCodePanel;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betslip.widget.BetSlipFooter;
import com.sportybet.plugin.realsports.betslip.widget.header.BetSlipHeader;

/* JADX INFO: loaded from: classes7.dex */
public final class xfd0 implements g6i0 {
    public final TextView A;
    public final ComposeView B;
    public final AppCompatTextView C;
    public final BetSlipFooter D;
    public final BetSlipHeader E;
    public final ComposeView F;
    public final TextView G;
    public final ComposeView H;
    public final ComposeView I;
    public final ComposeView J;
    public final ComposeView K;
    public final ComposeView L;
    public final ComposeView M;
    public final ComposeView N;
    public final ConstraintLayout O;
    public final ngd0 P;
    public final View Q;
    public final FrameLayout R;
    public final RecyclerView S;
    public final ConstraintLayout T;
    public final htr U;
    public final itr V;
    public final NestedScrollView W;
    public final ProgressBar X;
    public final ImageView Y;
    public final SwipeRefreshLayout Z;
    public final ConstraintLayout a;
    public final TextView a0;
    public final FrameLayout b;
    public final TextView c;
    public final FrameLayout d;
    public final ProgressBar e;
    public final Button f;
    public final BookingCodePanel i;
    public final ConstraintLayout v;
    public final ImageView w;
    public final RelativeLayout y;
    public final TextView z;

    public xfd0(ConstraintLayout constraintLayout, FrameLayout frameLayout, TextView textView, FrameLayout frameLayout2, ProgressBar progressBar, Button button, BookingCodePanel bookingCodePanel, ConstraintLayout constraintLayout2, ImageView imageView, RelativeLayout relativeLayout, TextView textView2, TextView textView3, ComposeView composeView, AppCompatTextView appCompatTextView, BetSlipFooter betSlipFooter, BetSlipHeader betSlipHeader, ComposeView composeView2, TextView textView4, ComposeView composeView3, ComposeView composeView4, ComposeView composeView5, ComposeView composeView6, ComposeView composeView7, ComposeView composeView8, ComposeView composeView9, ConstraintLayout constraintLayout3, ngd0 ngd0Var, View view, FrameLayout frameLayout3, RecyclerView recyclerView, ConstraintLayout constraintLayout4, htr htrVar, itr itrVar, NestedScrollView nestedScrollView, ProgressBar progressBar2, ImageView imageView2, SwipeRefreshLayout swipeRefreshLayout, TextView textView5) {
        this.a = constraintLayout;
        this.b = frameLayout;
        this.c = textView;
        this.d = frameLayout2;
        this.e = progressBar;
        this.f = button;
        this.i = bookingCodePanel;
        this.v = constraintLayout2;
        this.w = imageView;
        this.y = relativeLayout;
        this.z = textView2;
        this.A = textView3;
        this.B = composeView;
        this.C = appCompatTextView;
        this.D = betSlipFooter;
        this.E = betSlipHeader;
        this.F = composeView2;
        this.G = textView4;
        this.H = composeView3;
        this.I = composeView4;
        this.J = composeView5;
        this.K = composeView6;
        this.L = composeView7;
        this.M = composeView8;
        this.N = composeView9;
        this.O = constraintLayout3;
        this.P = ngd0Var;
        this.Q = view;
        this.R = frameLayout3;
        this.S = recyclerView;
        this.T = constraintLayout4;
        this.U = htrVar;
        this.V = itrVar;
        this.W = nestedScrollView;
        this.X = progressBar2;
        this.Y = imageView2;
        this.Z = swipeRefreshLayout;
        this.a0 = textView5;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x02f8 A[PHI: r1
      0x02f8: PHI (r1v2 int) = 
      (r1v1 int)
      (r1v4 int)
      (r1v5 int)
      (r1v6 int)
      (r1v7 int)
      (r1v8 int)
      (r1v9 int)
      (r1v10 int)
      (r1v11 int)
      (r1v12 int)
      (r1v13 int)
      (r1v14 int)
      (r1v15 int)
      (r1v16 int)
      (r1v17 int)
      (r1v18 int)
      (r1v19 int)
      (r1v20 int)
      (r1v21 int)
      (r1v22 int)
      (r1v23 int)
      (r1v24 int)
      (r1v25 int)
      (r1v26 int)
      (r1v27 int)
      (r1v28 int)
      (r1v29 int)
      (r1v30 int)
      (r1v31 int)
      (r1v32 int)
      (r1v33 int)
      (r1v45 int)
      (r1v46 int)
      (r1v47 int)
      (r1v48 int)
      (r1v49 int)
     binds: [B:3:0x0016, B:5:0x0021, B:7:0x002c, B:9:0x0037, B:11:0x0043, B:13:0x004f, B:15:0x005b, B:17:0x0067, B:19:0x0073, B:21:0x007f, B:23:0x008b, B:25:0x0097, B:27:0x00a3, B:29:0x00b0, B:31:0x00bd, B:33:0x00ca, B:35:0x00d7, B:37:0x00e4, B:39:0x00f1, B:41:0x00fe, B:43:0x010b, B:45:0x0116, B:47:0x0123, B:49:0x0130, B:51:0x013d, B:53:0x014a, B:55:0x0157, B:57:0x0164, B:59:0x0171, B:61:0x017e, B:63:0x0187, B:85:0x021b, B:87:0x0228, B:89:0x0235, B:91:0x0240, B:93:0x024c] A[DONT_GENERATE, DONT_INLINE]] */
    public static xfd0 a(LayoutInflater layoutInflater) {
        xfd0 xfd0Var;
        View viewInflate = layoutInflater.inflate(R.layout.spr_activity_betslip, (ViewGroup) null, false);
        int i = R.id.banker;
        if (((TextView) h5e.a(R.id.banker, viewInflate)) != null) {
            i = R.id.banker_container;
            if (((ConstraintLayout) h5e.a(R.id.banker_container, viewInflate)) != null) {
                i = R.id.banker_help;
                if (((ImageView) h5e.a(R.id.banker_help, viewInflate)) != null) {
                    i = R.id.banker_switch;
                    if (((ToggleButton) h5e.a(R.id.banker_switch, viewInflate)) != null) {
                        i = R.id.betslip_background;
                        FrameLayout frameLayout = (FrameLayout) h5e.a(R.id.betslip_background, viewInflate);
                        if (frameLayout != null) {
                            i = R.id.betslip_prerequisite_error;
                            TextView textView = (TextView) h5e.a(R.id.betslip_prerequisite_error, viewInflate);
                            if (textView != null) {
                                i = R.id.betslip_prerequisite_overlay;
                                FrameLayout frameLayout2 = (FrameLayout) h5e.a(R.id.betslip_prerequisite_overlay, viewInflate);
                                if (frameLayout2 != null) {
                                    i = R.id.betslip_prerequisite_progress;
                                    ProgressBar progressBar = (ProgressBar) h5e.a(R.id.betslip_prerequisite_progress, viewInflate);
                                    if (progressBar != null) {
                                        i = R.id.betslip_prerequisite_retry;
                                        Button button = (Button) h5e.a(R.id.betslip_prerequisite_retry, viewInflate);
                                        if (button != null) {
                                            i = R.id.booking_panel;
                                            BookingCodePanel bookingCodePanel = (BookingCodePanel) h5e.a(R.id.booking_panel, viewInflate);
                                            if (bookingCodePanel != null) {
                                                i = R.id.boost_button;
                                                ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.boost_button, viewInflate);
                                                if (constraintLayout != null) {
                                                    i = R.id.boost_checkbox;
                                                    ImageView imageView = (ImageView) h5e.a(R.id.boost_checkbox, viewInflate);
                                                    if (imageView != null) {
                                                        i = R.id.boost_container;
                                                        RelativeLayout relativeLayout = (RelativeLayout) h5e.a(R.id.boost_container, viewInflate);
                                                        if (relativeLayout != null) {
                                                            i = R.id.boost_hint;
                                                            TextView textView2 = (TextView) h5e.a(R.id.boost_hint, viewInflate);
                                                            if (textView2 != null) {
                                                                i = R.id.boost_text;
                                                                TextView textView3 = (TextView) h5e.a(R.id.boost_text, viewInflate);
                                                                if (textView3 != null) {
                                                                    i = R.id.bs_add_selection;
                                                                    ComposeView composeView = (ComposeView) h5e.a(R.id.bs_add_selection, viewInflate);
                                                                    if (composeView != null) {
                                                                        i = R.id.bs_edit_bet_min_view;
                                                                        AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.bs_edit_bet_min_view, viewInflate);
                                                                        if (appCompatTextView != null) {
                                                                            i = R.id.bs_footer_parent;
                                                                            BetSlipFooter betSlipFooter = (BetSlipFooter) h5e.a(R.id.bs_footer_parent, viewInflate);
                                                                            if (betSlipFooter != null) {
                                                                                i = R.id.bs_header_parent;
                                                                                BetSlipHeader betSlipHeader = (BetSlipHeader) h5e.a(R.id.bs_header_parent, viewInflate);
                                                                                if (betSlipHeader != null) {
                                                                                    i = R.id.bs_related_bets;
                                                                                    ComposeView composeView2 = (ComposeView) h5e.a(R.id.bs_related_bets, viewInflate);
                                                                                    if (composeView2 != null) {
                                                                                        i = R.id.changes_warning;
                                                                                        TextView textView4 = (TextView) h5e.a(R.id.changes_warning, viewInflate);
                                                                                        if (textView4 != null) {
                                                                                            i = R.id.compose_view;
                                                                                            if (((ComposeView) h5e.a(R.id.compose_view, viewInflate)) != null) {
                                                                                                i = R.id.composeview_sim_gift_edit_dialog;
                                                                                                ComposeView composeView3 = (ComposeView) h5e.a(R.id.composeview_sim_gift_edit_dialog, viewInflate);
                                                                                                if (composeView3 != null) {
                                                                                                    i = R.id.composeview_sim_gift_selector;
                                                                                                    ComposeView composeView4 = (ComposeView) h5e.a(R.id.composeview_sim_gift_selector, viewInflate);
                                                                                                    if (composeView4 != null) {
                                                                                                        i = R.id.composeview_simulation_bet_history;
                                                                                                        ComposeView composeView5 = (ComposeView) h5e.a(R.id.composeview_simulation_bet_history, viewInflate);
                                                                                                        if (composeView5 != null) {
                                                                                                            i = R.id.composeview_simulation_how_to_play;
                                                                                                            ComposeView composeView6 = (ComposeView) h5e.a(R.id.composeview_simulation_how_to_play, viewInflate);
                                                                                                            if (composeView6 != null) {
                                                                                                                i = R.id.composeview_simulation_settlement;
                                                                                                                ComposeView composeView7 = (ComposeView) h5e.a(R.id.composeview_simulation_settlement, viewInflate);
                                                                                                                if (composeView7 != null) {
                                                                                                                    i = R.id.composeview_simulation_speed_controller;
                                                                                                                    ComposeView composeView8 = (ComposeView) h5e.a(R.id.composeview_simulation_speed_controller, viewInflate);
                                                                                                                    if (composeView8 != null) {
                                                                                                                        i = R.id.composeview_simulation_ticket_details;
                                                                                                                        ComposeView composeView9 = (ComposeView) h5e.a(R.id.composeview_simulation_ticket_details, viewInflate);
                                                                                                                        if (composeView9 != null) {
                                                                                                                            i = R.id.container;
                                                                                                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.container, viewInflate);
                                                                                                                            if (constraintLayout2 != null) {
                                                                                                                                i = R.id.footer_button;
                                                                                                                                View viewA = h5e.a(R.id.footer_button, viewInflate);
                                                                                                                                if (viewA != null) {
                                                                                                                                    int i2 = R.id.accept_changes_btn;
                                                                                                                                    Button button2 = (Button) h5e.a(R.id.accept_changes_btn, viewA);
                                                                                                                                    if (button2 != null) {
                                                                                                                                        i2 = R.id.accept_changes_btn_progress_bar;
                                                                                                                                        ProgressBar progressBar2 = (ProgressBar) h5e.a(R.id.accept_changes_btn_progress_bar, viewA);
                                                                                                                                        if (progressBar2 != null) {
                                                                                                                                            i2 = R.id.edit_bet_place_btn;
                                                                                                                                            Button button3 = (Button) h5e.a(R.id.edit_bet_place_btn, viewA);
                                                                                                                                            if (button3 != null) {
                                                                                                                                                i2 = R.id.ll_place_bet_loading_view;
                                                                                                                                                LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.ll_place_bet_loading_view, viewA);
                                                                                                                                                if (linearLayout != null) {
                                                                                                                                                    i2 = R.id.place_bet_btn;
                                                                                                                                                    Button button4 = (Button) h5e.a(R.id.place_bet_btn, viewA);
                                                                                                                                                    if (button4 != null) {
                                                                                                                                                        i2 = R.id.progress;
                                                                                                                                                        ProgressBar progressBar3 = (ProgressBar) h5e.a(R.id.progress, viewA);
                                                                                                                                                        if (progressBar3 != null) {
                                                                                                                                                            i2 = R.id.require_manual_change_selection_text_view;
                                                                                                                                                            TextView textView5 = (TextView) h5e.a(R.id.require_manual_change_selection_text_view, viewA);
                                                                                                                                                            if (textView5 != null) {
                                                                                                                                                                i2 = R.id.share;
                                                                                                                                                                TextView textView6 = (TextView) h5e.a(R.id.share, viewA);
                                                                                                                                                                if (textView6 != null) {
                                                                                                                                                                    i2 = R.id.share_ctl;
                                                                                                                                                                    FrameLayout frameLayout3 = (FrameLayout) h5e.a(R.id.share_ctl, viewA);
                                                                                                                                                                    if (frameLayout3 != null) {
                                                                                                                                                                        i2 = R.id.sim_place_bet_btn;
                                                                                                                                                                        Button button5 = (Button) h5e.a(R.id.sim_place_bet_btn, viewA);
                                                                                                                                                                        if (button5 != null) {
                                                                                                                                                                            ngd0 ngd0Var = new ngd0((ConstraintLayout) viewA, button2, progressBar2, button3, linearLayout, button4, progressBar3, textView5, textView6, frameLayout3, button5);
                                                                                                                                                                            i = R.id.footer_button_progressing_mask;
                                                                                                                                                                            View viewA2 = h5e.a(R.id.footer_button_progressing_mask, viewInflate);
                                                                                                                                                                            if (viewA2 != null) {
                                                                                                                                                                                i = R.id.grey_container;
                                                                                                                                                                                FrameLayout frameLayout4 = (FrameLayout) h5e.a(R.id.grey_container, viewInflate);
                                                                                                                                                                                if (frameLayout4 != null) {
                                                                                                                                                                                    i = R.id.id_recyclerview;
                                                                                                                                                                                    RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.id_recyclerview, viewInflate);
                                                                                                                                                                                    if (recyclerView != null) {
                                                                                                                                                                                        i = R.id.img_container;
                                                                                                                                                                                        if (((FrameLayout) h5e.a(R.id.img_container, viewInflate)) != null) {
                                                                                                                                                                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) viewInflate;
                                                                                                                                                                                            i = R.id.layout_sim_empty;
                                                                                                                                                                                            View viewA3 = h5e.a(R.id.layout_sim_empty, viewInflate);
                                                                                                                                                                                            if (viewA3 != null) {
                                                                                                                                                                                                htr htrVar = new htr((ConstraintLayout) viewA3);
                                                                                                                                                                                                View viewA4 = h5e.a(R.id.layout_sim_sync_notice, viewInflate);
                                                                                                                                                                                                if (viewA4 != null) {
                                                                                                                                                                                                    int i3 = R.id.sim_one_selection_desc;
                                                                                                                                                                                                    xfd0Var = null;
                                                                                                                                                                                                    TextView textView7 = (TextView) h5e.a(R.id.sim_one_selection_desc, viewA4);
                                                                                                                                                                                                    if (textView7 != null) {
                                                                                                                                                                                                        i3 = R.id.sim_sync_desc;
                                                                                                                                                                                                        if (((TextView) h5e.a(R.id.sim_sync_desc, viewA4)) != null) {
                                                                                                                                                                                                            itr itrVar = new itr((ConstraintLayout) viewA4, textView7);
                                                                                                                                                                                                            int i4 = R.id.multi_guideline;
                                                                                                                                                                                                            if (((Guideline) h5e.a(R.id.multi_guideline, viewInflate)) != null) {
                                                                                                                                                                                                                i4 = R.id.nestedscrollview;
                                                                                                                                                                                                                NestedScrollView nestedScrollView = (NestedScrollView) h5e.a(R.id.nestedscrollview, viewInflate);
                                                                                                                                                                                                                if (nestedScrollView != null) {
                                                                                                                                                                                                                    i4 = R.id.results_loading_progress;
                                                                                                                                                                                                                    ProgressBar progressBar4 = (ProgressBar) h5e.a(R.id.results_loading_progress, viewInflate);
                                                                                                                                                                                                                    if (progressBar4 != null) {
                                                                                                                                                                                                                        i4 = R.id.rotate_clock;
                                                                                                                                                                                                                        ImageView imageView2 = (ImageView) h5e.a(R.id.rotate_clock, viewInflate);
                                                                                                                                                                                                                        if (imageView2 != null) {
                                                                                                                                                                                                                            i4 = R.id.selection_layout;
                                                                                                                                                                                                                            if (((LinearLayout) h5e.a(R.id.selection_layout, viewInflate)) != null) {
                                                                                                                                                                                                                                i4 = R.id.swipe;
                                                                                                                                                                                                                                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) h5e.a(R.id.swipe, viewInflate);
                                                                                                                                                                                                                                if (swipeRefreshLayout != null) {
                                                                                                                                                                                                                                    i4 = R.id.type_underline;
                                                                                                                                                                                                                                    TextView textView8 = (TextView) h5e.a(R.id.type_underline, viewInflate);
                                                                                                                                                                                                                                    if (textView8 != null) {
                                                                                                                                                                                                                                        return new xfd0(constraintLayout3, frameLayout, textView, frameLayout2, progressBar, button, bookingCodePanel, constraintLayout, imageView, relativeLayout, textView2, textView3, composeView, appCompatTextView, betSlipFooter, betSlipHeader, composeView2, textView4, composeView3, composeView4, composeView5, composeView6, composeView7, composeView8, composeView9, constraintLayout2, ngd0Var, viewA2, frameLayout4, recyclerView, constraintLayout3, htrVar, itrVar, nestedScrollView, progressBar4, imageView2, swipeRefreshLayout, textView8);
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            i = i4;
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                    bmy.a("Missing required view with ID: ".concat(viewA4.getResources().getResourceName(i3)));
                                                                                                                                                                                                    return null;
                                                                                                                                                                                                }
                                                                                                                                                                                                xfd0Var = null;
                                                                                                                                                                                                i = R.id.layout_sim_sync_notice;
                                                                                                                                                                                            } else {
                                                                                                                                                                                                xfd0Var = null;
                                                                                                                                                                                            }
                                                                                                                                                                                        } else {
                                                                                                                                                                                            xfd0Var = null;
                                                                                                                                                                                        }
                                                                                                                                                                                    } else {
                                                                                                                                                                                        xfd0Var = null;
                                                                                                                                                                                    }
                                                                                                                                                                                } else {
                                                                                                                                                                                    xfd0Var = null;
                                                                                                                                                                                }
                                                                                                                                                                            } else {
                                                                                                                                                                                xfd0Var = null;
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
                                                                                                                                xfd0Var = null;
                                                                                                                            } else {
                                                                                                                                xfd0Var = null;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            xfd0Var = null;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        xfd0Var = null;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    xfd0Var = null;
                                                                                                                }
                                                                                                            } else {
                                                                                                                xfd0Var = null;
                                                                                                            }
                                                                                                        } else {
                                                                                                            xfd0Var = null;
                                                                                                        }
                                                                                                    } else {
                                                                                                        xfd0Var = null;
                                                                                                    }
                                                                                                } else {
                                                                                                    xfd0Var = null;
                                                                                                }
                                                                                            } else {
                                                                                                xfd0Var = null;
                                                                                            }
                                                                                        } else {
                                                                                            xfd0Var = null;
                                                                                        }
                                                                                    } else {
                                                                                        xfd0Var = null;
                                                                                    }
                                                                                } else {
                                                                                    xfd0Var = null;
                                                                                }
                                                                            } else {
                                                                                xfd0Var = null;
                                                                            }
                                                                        } else {
                                                                            xfd0Var = null;
                                                                        }
                                                                    } else {
                                                                        xfd0Var = null;
                                                                    }
                                                                } else {
                                                                    xfd0Var = null;
                                                                }
                                                            } else {
                                                                xfd0Var = null;
                                                            }
                                                        } else {
                                                            xfd0Var = null;
                                                        }
                                                    } else {
                                                        xfd0Var = null;
                                                    }
                                                } else {
                                                    xfd0Var = null;
                                                }
                                            } else {
                                                xfd0Var = null;
                                            }
                                        } else {
                                            xfd0Var = null;
                                        }
                                    } else {
                                        xfd0Var = null;
                                    }
                                } else {
                                    xfd0Var = null;
                                }
                            } else {
                                xfd0Var = null;
                            }
                        } else {
                            xfd0Var = null;
                        }
                    } else {
                        xfd0Var = null;
                    }
                } else {
                    xfd0Var = null;
                }
            } else {
                xfd0Var = null;
            }
        } else {
            xfd0Var = null;
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return xfd0Var;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
