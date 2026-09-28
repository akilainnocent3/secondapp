package com.sportybet.android.instantwin.presentation.kickoff.betresult;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.widget.viewholder.betresult.BetResultBetViewHolder;
import com.sportybet.android.instantwin.presentation.widget.viewholder.betresult.BetResultEventViewHolder;
import com.sportybet.android.instantwin.presentation.widget.viewholder.betresult.BetResultIbEventViewHolder;
import defpackage.b5p;
import defpackage.bmy;
import defpackage.c5p;
import defpackage.dwi;
import defpackage.ge3;
import defpackage.h5e;
import defpackage.z4p;

/* JADX INFO: loaded from: classes.dex */
public class BetResultAdapter extends BaseMultiItemQuickAdapter<ge3, BaseViewHolder> {
    private final Boolean isBNG;

    public BetResultAdapter(Boolean bool) {
        super(null);
        this.isBNG = bool;
        addItemType(1, R.layout.iwqk_layout_result_event_item);
        addItemType(0, R.layout.iwqk_layout_result_event_item);
        addItemType(2, R.layout.iwqk_layout_live_score_odds_item);
        addItemType(3, R.layout.iwqk_layout_live_score_odds_item);
        addItemType(4, R.layout.iwqk_layout_result_ib_event_item);
        addItemType(5, R.layout.iwqk_layout_result_ib_event_item);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00f3 A[PHI: r7
      0x00f3: PHI (r7v2 int) = (r7v0 int), (r7v3 int), (r7v4 int), (r7v5 int) binds: [B:26:0x0063, B:28:0x006e, B:30:0x0079, B:32:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f5 A[PHI: r8
      0x00f5: PHI (r8v3 int) = (r8v0 int), (r8v4 int) binds: [B:22:0x0051, B:24:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x01aa A[PHI: r8
      0x01aa: PHI (r8v1 int) = (r8v0 int), (r8v2 int) binds: [B:68:0x014e, B:70:0x015b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, ge3 ge3Var) {
        int i = ge3Var.a;
        int i2 = R.id.home_team_name;
        int i3 = R.id.divider_line;
        int i4 = R.id.away_team_name;
        if (i == 0 || i == 1) {
            BetResultEventViewHolder betResultEventViewHolder = (BetResultEventViewHolder) baseViewHolder.itemView.getTag();
            if (betResultEventViewHolder == null) {
                View view = baseViewHolder.itemView;
                ImageView imageView = (ImageView) h5e.a(R.id.away_team_logo, view);
                if (imageView != null) {
                    TextView textView = (TextView) h5e.a(R.id.away_team_name, view);
                    if (textView != null) {
                        i4 = R.id.compose_football_score_info;
                        ComposeView composeView = (ComposeView) h5e.a(R.id.compose_football_score_info, view);
                        if (composeView != null) {
                            View viewA = h5e.a(R.id.divider_line, view);
                            if (viewA != null) {
                                ImageView imageView2 = (ImageView) h5e.a(R.id.home_team_logo, view);
                                if (imageView2 != null) {
                                    TextView textView2 = (TextView) h5e.a(R.id.home_team_name, view);
                                    if (textView2 != null) {
                                        i2 = R.id.match_info_container;
                                        if (((LinearLayout) h5e.a(R.id.match_info_container, view)) != null) {
                                            i2 = R.id.score;
                                            TextView textView3 = (TextView) h5e.a(R.id.score, view);
                                            if (textView3 != null) {
                                                betResultEventViewHolder = new BetResultEventViewHolder(new b5p((RelativeLayout) view, imageView, textView, composeView, viewA, imageView2, textView2, textView3), this.isBNG.booleanValue());
                                                baseViewHolder.itemView.setTag(betResultEventViewHolder);
                                            }
                                        }
                                    }
                                } else {
                                    i2 = R.id.home_team_logo;
                                }
                            } else {
                                i2 = R.id.divider_line;
                            }
                        } else {
                            i2 = i4;
                        }
                    } else {
                        i2 = i4;
                    }
                } else {
                    i2 = R.id.away_team_logo;
                }
                bmy.a("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
                return;
            }
            betResultEventViewHolder.setData(ge3Var);
            return;
        }
        if (i == 2 || i == 3) {
            BetResultBetViewHolder betResultBetViewHolder = (BetResultBetViewHolder) baseViewHolder.itemView.getTag();
            if (betResultBetViewHolder == null) {
                betResultBetViewHolder = new BetResultBetViewHolder(z4p.a(baseViewHolder.itemView), this.isBNG.booleanValue());
                baseViewHolder.itemView.setTag(betResultBetViewHolder);
            }
            betResultBetViewHolder.setData(ge3Var);
            return;
        }
        if (i != 4 && i != 5) {
            dwi.a(ge3Var.a, "Incorrect itemType: ");
            return;
        }
        BetResultIbEventViewHolder betResultIbEventViewHolder = (BetResultIbEventViewHolder) baseViewHolder.itemView.getTag();
        if (betResultIbEventViewHolder == null) {
            View view2 = baseViewHolder.itemView;
            ImageView imageView3 = (ImageView) h5e.a(R.id.away_team_logo, view2);
            if (imageView3 != null) {
                TextView textView4 = (TextView) h5e.a(R.id.away_team_name, view2);
                if (textView4 != null) {
                    i4 = R.id.away_team_score;
                    TextView textView5 = (TextView) h5e.a(R.id.away_team_score, view2);
                    if (textView5 != null) {
                        View viewA2 = h5e.a(R.id.divider_line, view2);
                        if (viewA2 != null) {
                            i3 = R.id.event_info;
                            if (((LinearLayout) h5e.a(R.id.event_info, view2)) != null) {
                                i3 = R.id.event_score;
                                if (((HorizontalScrollView) h5e.a(R.id.event_score, view2)) != null) {
                                    i3 = R.id.event_score_list;
                                    LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.event_score_list, view2);
                                    if (linearLayout != null) {
                                        ImageView imageView4 = (ImageView) h5e.a(R.id.home_team_logo, view2);
                                        if (imageView4 != null) {
                                            TextView textView6 = (TextView) h5e.a(R.id.home_team_name, view2);
                                            if (textView6 != null) {
                                                i2 = R.id.home_team_score;
                                                TextView textView7 = (TextView) h5e.a(R.id.home_team_score, view2);
                                                if (textView7 != null) {
                                                    i2 = R.id.left_line;
                                                    View viewA3 = h5e.a(R.id.left_line, view2);
                                                    if (viewA3 != null) {
                                                        i2 = R.id.right_line;
                                                        View viewA4 = h5e.a(R.id.right_line, view2);
                                                        if (viewA4 != null) {
                                                            i2 = R.id.txt_away_team_name;
                                                            TextView textView8 = (TextView) h5e.a(R.id.txt_away_team_name, view2);
                                                            if (textView8 != null) {
                                                                i2 = R.id.txt_home_team_name;
                                                                TextView textView9 = (TextView) h5e.a(R.id.txt_home_team_name, view2);
                                                                if (textView9 != null) {
                                                                    i2 = R.id.vs;
                                                                    if (((TextView) h5e.a(R.id.vs, view2)) != null) {
                                                                        betResultIbEventViewHolder = new BetResultIbEventViewHolder(new c5p((ConstraintLayout) view2, imageView3, textView4, textView5, viewA2, linearLayout, imageView4, textView6, textView7, viewA3, viewA4, textView8, textView9));
                                                                        baseViewHolder.itemView.setTag(betResultIbEventViewHolder);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            i2 = R.id.home_team_logo;
                                        }
                                    } else {
                                        i2 = i3;
                                    }
                                } else {
                                    i2 = i3;
                                }
                            } else {
                                i2 = i3;
                            }
                        } else {
                            i2 = i3;
                        }
                    } else {
                        i2 = i4;
                    }
                } else {
                    i2 = i4;
                }
            } else {
                i2 = R.id.away_team_logo;
            }
            bmy.a("Missing required view with ID: ".concat(view2.getResources().getResourceName(i2)));
            return;
        }
        betResultIbEventViewHolder.setData(ge3Var);
    }
}
