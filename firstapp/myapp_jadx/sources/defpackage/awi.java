package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.widget.ActionBar;
import com.sportybet.android.instantwin.presentation.widget.NextButtonLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class awi implements g6i0 {
    public final TextView A;
    public final ConstraintLayout a;
    public final ActionBar b;
    public final NextButtonLayout c;
    public final ComposeView d;
    public final ConstraintLayout e;
    public final RecyclerView f;
    public final ImageView i;
    public final ImageView v;
    public final msr w;
    public final ProgressBar y;
    public final TextView z;

    public awi(ConstraintLayout constraintLayout, ActionBar actionBar, NextButtonLayout nextButtonLayout, ComposeView composeView, ConstraintLayout constraintLayout2, RecyclerView recyclerView, ImageView imageView, ImageView imageView2, msr msrVar, ProgressBar progressBar, TextView textView, TextView textView2) {
        this.a = constraintLayout;
        this.b = actionBar;
        this.c = nextButtonLayout;
        this.d = composeView;
        this.e = constraintLayout2;
        this.f = recyclerView;
        this.i = imageView;
        this.v = imageView2;
        this.w = msrVar;
        this.y = progressBar;
        this.z = textView;
        this.A = textView2;
    }

    public static awi a(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_iwqk_live_score, (ViewGroup) null, false);
        int i = R.id.action_bar;
        ActionBar actionBar = (ActionBar) h5e.a(R.id.action_bar, viewInflate);
        if (actionBar != null) {
            i = R.id.button_layout;
            NextButtonLayout nextButtonLayout = (NextButtonLayout) h5e.a(R.id.button_layout, viewInflate);
            if (nextButtonLayout != null) {
                i = R.id.composeview_double_or_nothing;
                ComposeView composeView = (ComposeView) h5e.a(R.id.composeview_double_or_nothing, viewInflate);
                if (composeView != null) {
                    i = R.id.constraintlayout_winning_view;
                    ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.constraintlayout_winning_view, viewInflate);
                    if (constraintLayout != null) {
                        i = R.id.event_list;
                        RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.event_list, viewInflate);
                        if (recyclerView != null) {
                            i = R.id.imageview_livescore_show_preview;
                            ImageView imageView = (ImageView) h5e.a(R.id.imageview_livescore_show_preview, viewInflate);
                            if (imageView != null) {
                                i = R.id.img;
                                ImageView imageView2 = (ImageView) h5e.a(R.id.img, viewInflate);
                                if (imageView2 != null) {
                                    i = R.id.include_livescore_preview;
                                    View viewA = h5e.a(R.id.include_livescore_preview, viewInflate);
                                    if (viewA != null) {
                                        int i2 = R.id.constraintlayout_livescore_goal;
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.constraintlayout_livescore_goal, viewA);
                                        if (constraintLayout2 != null) {
                                            i2 = R.id.constraintlayout_livescore_opening;
                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) h5e.a(R.id.constraintlayout_livescore_opening, viewA);
                                            if (constraintLayout3 != null) {
                                                ConstraintLayout constraintLayout4 = (ConstraintLayout) viewA;
                                                i2 = R.id.constraintlayout_livescore_score;
                                                ConstraintLayout constraintLayout5 = (ConstraintLayout) h5e.a(R.id.constraintlayout_livescore_score, viewA);
                                                if (constraintLayout5 != null) {
                                                    i2 = R.id.framelayout_livescore_opening_away_team_color;
                                                    if (((FrameLayout) h5e.a(R.id.framelayout_livescore_opening_away_team_color, viewA)) != null) {
                                                        i2 = R.id.framelayout_livescore_opening_home_team_color;
                                                        if (((FrameLayout) h5e.a(R.id.framelayout_livescore_opening_home_team_color, viewA)) != null) {
                                                            i2 = R.id.group_livescore_preview_overlays;
                                                            Group group = (Group) h5e.a(R.id.group_livescore_preview_overlays, viewA);
                                                            if (group != null) {
                                                                i2 = R.id.imageview_livescore_gif;
                                                                ImageView imageView3 = (ImageView) h5e.a(R.id.imageview_livescore_gif, viewA);
                                                                if (imageView3 != null) {
                                                                    i2 = R.id.imageview_livescore_goal_team_logo;
                                                                    ImageView imageView4 = (ImageView) h5e.a(R.id.imageview_livescore_goal_team_logo, viewA);
                                                                    if (imageView4 != null) {
                                                                        i2 = R.id.imageview_livescore_hide_preview;
                                                                        ImageView imageView5 = (ImageView) h5e.a(R.id.imageview_livescore_hide_preview, viewA);
                                                                        if (imageView5 != null) {
                                                                            i2 = R.id.imageview_livescore_opening_away_team_logo;
                                                                            ImageView imageView6 = (ImageView) h5e.a(R.id.imageview_livescore_opening_away_team_logo, viewA);
                                                                            if (imageView6 != null) {
                                                                                i2 = R.id.imageview_livescore_opening_home_team_logo;
                                                                                ImageView imageView7 = (ImageView) h5e.a(R.id.imageview_livescore_opening_home_team_logo, viewA);
                                                                                if (imageView7 != null) {
                                                                                    i2 = R.id.imageview_livescore_score_away_team_logo;
                                                                                    ImageView imageView8 = (ImageView) h5e.a(R.id.imageview_livescore_score_away_team_logo, viewA);
                                                                                    if (imageView8 != null) {
                                                                                        i2 = R.id.imageview_livescore_score_home_team_logo;
                                                                                        ImageView imageView9 = (ImageView) h5e.a(R.id.imageview_livescore_score_home_team_logo, viewA);
                                                                                        if (imageView9 != null) {
                                                                                            i2 = R.id.textview_game_end_label;
                                                                                            TextView textView = (TextView) h5e.a(R.id.textview_game_end_label, viewA);
                                                                                            if (textView != null) {
                                                                                                i2 = R.id.textview_livescore_goal_count;
                                                                                                TextView textView2 = (TextView) h5e.a(R.id.textview_livescore_goal_count, viewA);
                                                                                                if (textView2 != null) {
                                                                                                    i2 = R.id.textview_livescore_goal_hint;
                                                                                                    TextView textView3 = (TextView) h5e.a(R.id.textview_livescore_goal_hint, viewA);
                                                                                                    if (textView3 != null) {
                                                                                                        i2 = R.id.textview_livescore_goal_team_name;
                                                                                                        TextView textView4 = (TextView) h5e.a(R.id.textview_livescore_goal_team_name, viewA);
                                                                                                        if (textView4 != null) {
                                                                                                            i2 = R.id.textview_livescore_opening_away_team_name;
                                                                                                            TextView textView5 = (TextView) h5e.a(R.id.textview_livescore_opening_away_team_name, viewA);
                                                                                                            if (textView5 != null) {
                                                                                                                i2 = R.id.textview_livescore_opening_home_team_name;
                                                                                                                TextView textView6 = (TextView) h5e.a(R.id.textview_livescore_opening_home_team_name, viewA);
                                                                                                                if (textView6 != null) {
                                                                                                                    i2 = R.id.textview_livescore_score;
                                                                                                                    TextView textView7 = (TextView) h5e.a(R.id.textview_livescore_score, viewA);
                                                                                                                    if (textView7 != null) {
                                                                                                                        i2 = R.id.textview_livescore_score_away_team_name;
                                                                                                                        TextView textView8 = (TextView) h5e.a(R.id.textview_livescore_score_away_team_name, viewA);
                                                                                                                        if (textView8 != null) {
                                                                                                                            i2 = R.id.textview_livescore_score_hint;
                                                                                                                            TextView textView9 = (TextView) h5e.a(R.id.textview_livescore_score_hint, viewA);
                                                                                                                            if (textView9 != null) {
                                                                                                                                i2 = R.id.textview_livescore_score_home_team_name;
                                                                                                                                TextView textView10 = (TextView) h5e.a(R.id.textview_livescore_score_home_team_name, viewA);
                                                                                                                                if (textView10 != null) {
                                                                                                                                    i2 = R.id.view_livescore_goal_background;
                                                                                                                                    View viewA2 = h5e.a(R.id.view_livescore_goal_background, viewA);
                                                                                                                                    if (viewA2 != null) {
                                                                                                                                        msr msrVar = new msr(constraintLayout4, constraintLayout2, constraintLayout3, constraintLayout4, constraintLayout5, group, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, viewA2);
                                                                                                                                        i = R.id.progress;
                                                                                                                                        ProgressBar progressBar = (ProgressBar) h5e.a(R.id.progress, viewInflate);
                                                                                                                                        if (progressBar != null) {
                                                                                                                                            i = R.id.text_win_label;
                                                                                                                                            if (((TextView) h5e.a(R.id.text_win_label, viewInflate)) != null) {
                                                                                                                                                i = R.id.textview_livescore_subtitle;
                                                                                                                                                TextView textView11 = (TextView) h5e.a(R.id.textview_livescore_subtitle, viewInflate);
                                                                                                                                                if (textView11 != null) {
                                                                                                                                                    i = R.id.tv_return_amount;
                                                                                                                                                    TextView textView12 = (TextView) h5e.a(R.id.tv_return_amount, viewInflate);
                                                                                                                                                    if (textView12 != null) {
                                                                                                                                                        return new awi((ConstraintLayout) viewInflate, actionBar, nextButtonLayout, composeView, constraintLayout, recyclerView, imageView, imageView2, msrVar, progressBar, textView11, textView12);
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
                                        bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(i2)));
                                        return null;
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
