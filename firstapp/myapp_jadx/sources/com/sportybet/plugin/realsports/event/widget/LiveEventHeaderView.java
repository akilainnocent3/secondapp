package com.sportybet.plugin.realsports.event.widget;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.sporty.android.core.model.bet.edit.EditBetDlgType;
import com.sporty.android.core.model.bet.edit.ErrorDataInfo;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.openbet.presentation.activity.LiveOpenBetActivity;
import com.sportybet.plugin.event.EventActivity;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.event.LiveTimerTextView;
import com.sportybet.plugin.realsports.event.widget.LiveEventHeaderView;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import defpackage.apg;
import defpackage.c8i0;
import defpackage.fug0;
import defpackage.gr0;
import defpackage.hug0;
import defpackage.k00;
import defpackage.lkg;
import defpackage.mfb0;
import defpackage.nkd0;
import defpackage.nnf;
import defpackage.oul;
import defpackage.rdd0;
import defpackage.s2k0;
import defpackage.sn5;
import defpackage.uhc;
import defpackage.uqm;
import defpackage.v340;
import defpackage.x1k0;
import defpackage.y1k0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class LiveEventHeaderView extends oul {
    public static final /* synthetic */ int L = 0;
    public View A;
    public ComposeView B;
    public y1k0 C;
    public boolean D;
    public TextView E;
    public TextView F;
    public ImageView G;
    public ImageView H;
    public ImageView I;
    public nnf J;
    public final int K;
    public uqm c;
    public rdd0 d;
    public lkg e;
    public LiveTimerTextView f;
    public TextView i;
    public TextView v;
    public TextView[] w;
    public TextView[] y;
    public TextView z;

    public LiveEventHeaderView(Context context) {
        super(context);
        if (!isInEditMode()) {
            a();
        }
        this.D = false;
        this.K = getContext().getColor(R.color.brand_secondary_variable_type3);
    }

    public final void b(final Event event, mfb0 mfb0Var) {
        int i;
        int i2;
        Sport sport;
        Sport sport2;
        findViewById(R.id.live_open_bet_c).setOnClickListener(new View.OnClickListener() { // from class: lks
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = LiveEventHeaderView.L;
                boolean zK = iu2.k();
                LiveEventHeaderView liveEventHeaderView = this.a;
                if (zK) {
                    liveEventHeaderView.J.a(new ErrorDataInfo(EditBetDlgType.DISCARD, ""));
                    return;
                }
                lkg lkgVar = liveEventHeaderView.e;
                String str = event.eventId;
                int i4 = lkgVar.a.s0;
                str.getClass();
                EventActivity eventActivity = lkgVar.a;
                eventActivity.startActivity(new Intent(eventActivity, (Class<?>) LiveOpenBetActivity.class).addFlags(268435456).putExtra("EXTRA_LIVE_OPENBET_COUNT", i4).putExtra("EXTRA_LIVE_EVENT_ID", str));
            }
        });
        if (event.status == 0) {
            this.f.setStaticLabel(sn5.b(getContext(), R.string.common_functions__upcoming, new Object[0]));
        } else if ("sr:sport:1".equals(event.sport.id)) {
            this.f.setLiveTime(event.eventId, event.playedSeconds, event.matchStatus, event.status);
        } else if (mfb0Var != null) {
            this.f.setStaticLabel(mfb0Var.p(event.playedSeconds, event.remainingTimeInPeriod, event.matchStatus));
        }
        EventActivity eventActivity = this.e.a;
        int i3 = eventActivity.r0;
        int i4 = eventActivity.s0;
        boolean zIsLogin = this.c.isLogin();
        View view = this.A;
        if (zIsLogin) {
            view.setVisibility(0);
            this.F.setText(i3 > 99 ? "99+" : String.valueOf(i3));
            this.E.setText(i4 <= 99 ? String.valueOf(i4) : "99+");
        } else {
            view.setVisibility(8);
        }
        boolean zIsVirtualSoccer = event.isVirtualSoccer();
        TextView textView = this.z;
        if (zIsVirtualSoccer) {
            textView.setTextColor(Color.parseColor("#9CA0AB"));
        } else {
            textView.setPaintFlags(textView.getPaintFlags() | 8);
            this.z.setOnClickListener(new View.OnClickListener() { // from class: mks
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i5 = LiveEventHeaderView.L;
                    Context context = this.a.getContext();
                    Intent intent = new Intent(context, (Class<?>) PreMatchSportActivity.class);
                    ArrayList<String> arrayList = new ArrayList<>();
                    Event event2 = event;
                    arrayList.add(event2.sport.category.tournament.id);
                    intent.putStringArrayListExtra("key_tournament_ids", arrayList);
                    intent.putExtra("key_tournament_name", event2.sport.category.tournament.name);
                    intent.putExtra("key_sport_id", event2.sport.id);
                    intent.putExtra("key_sport_time", 0L);
                    intent.setFlags(335544320);
                    yrh0.s(context, intent, true);
                }
            });
            this.z.setTextColor(getResources().getColor(R.color.brand_secondary_variable_type3));
        }
        this.z.setText(apg.h(event));
        this.i.setText(event.homeTeamName);
        this.v.setText(event.awayTeamName);
        if (event.homeTeamId != null && event.homeTeamName != null && (sport2 = event.sport) != null && sport2.id != null) {
            this.i.setOnClickListener(new View.OnClickListener() { // from class: nks
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i5 = LiveEventHeaderView.L;
                    lkg lkgVar = this.a.e;
                    Event event2 = event;
                    lkgVar.b(event2.homeTeamId, event2.homeTeamName, event2.sport.id);
                }
            });
        }
        if (event.awayTeamId != null && event.awayTeamName != null && (sport = event.sport) != null && sport.id != null) {
            this.v.setOnClickListener(new View.OnClickListener() { // from class: oks
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i5 = LiveEventHeaderView.L;
                    lkg lkgVar = this.a.e;
                    Event event2 = event;
                    lkgVar.b(event2.awayTeamId, event2.awayTeamName, event2.sport.id);
                }
            });
        }
        boolean zIsVirtualSoccer2 = event.isVirtualSoccer();
        ImageView imageView = this.I;
        if (zIsVirtualSoccer2) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        boolean zA = nkd0.a.a.a(event);
        ImageView imageView2 = this.H;
        if (zA) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
        if (!event.topTeam || event.oddsBoost) {
            boolean z = event.oddsBoost;
            ImageView imageView3 = this.G;
            if (z) {
                Context context = imageView3.getContext();
                context.getClass();
                int iA = fug0.a(hug0.a, context);
                if (iA == 0) {
                    i = R.drawable.spr_odds_boost;
                } else if (iA == 1) {
                    i = R.drawable.spr_odds_boost_sw;
                } else if (iA == 2) {
                    i = R.drawable.spr_odds_boost_es_mx;
                } else if (iA == 3) {
                    i = R.drawable.spr_odds_boost_pt_br;
                } else if (iA == 4) {
                    i = R.drawable.spr_odds_boost_pt_mz;
                } else {
                    if (iA != 5) {
                        uhc.a();
                        return;
                    }
                    i = R.drawable.spr_odds_boost_fr_fr;
                }
                Drawable drawableA = gr0.a(context, i);
                this.G.setVisibility(0);
                this.G.setImageDrawable(drawableA);
            } else {
                imageView3.setVisibility(8);
            }
        } else {
            Context context2 = this.G.getContext();
            context2.getClass();
            int iA2 = fug0.a(hug0.a, context2);
            if (iA2 == 0) {
                i2 = R.drawable.spr_sports_hot;
            } else if (iA2 == 1) {
                i2 = R.drawable.spr_sports_hot_sw;
            } else if (iA2 == 2 || iA2 == 3 || iA2 == 4) {
                i2 = R.drawable.spr_sports_hot_es_mx;
            } else {
                if (iA2 != 5) {
                    uhc.a();
                    return;
                }
                i2 = R.drawable.spr_sports_hot_fr_fr;
            }
            Drawable drawableA2 = gr0.a(context2, i2);
            this.G.setVisibility(0);
            this.G.setImageDrawable(drawableA2);
        }
        this.z.setVisibility(0);
        this.f.setVisibility(0);
        for (TextView textView2 : this.w) {
            textView2.setVisibility(0);
        }
        for (TextView textView3 : this.y) {
            textView3.setVisibility(0);
        }
        this.i.setVisibility(0);
        this.v.setVisibility(0);
        if (mfb0Var != null) {
            ArrayList arrayListA = mfb0Var.A(event.setScore, event.pointScore, event.gameScore);
            int size = arrayListA.size() - 2;
            int i5 = 0;
            while (true) {
                TextView[] textViewArr = this.w;
                if (i5 >= textViewArr.length) {
                    break;
                }
                if (size >= 0) {
                    textViewArr[i5].setText((CharSequence) arrayListA.get(size));
                    this.w[i5].setVisibility(0);
                    this.y[i5].setText((CharSequence) arrayListA.get(size + 1));
                    this.y[i5].setVisibility(0);
                    if (size < 2) {
                        TextView textView4 = this.w[i5];
                        int i6 = this.K;
                        textView4.setBackgroundColor(i6);
                        this.y[i5].setBackgroundColor(i6);
                        this.w[i5].setTextColor(c8i0.d(R.color.background_type2_primary, this.i));
                        this.y[i5].setTextColor(c8i0.d(R.color.background_type2_primary, this.i));
                    }
                } else {
                    textViewArr[i5].setVisibility(8);
                    this.y[i5].setVisibility(8);
                }
                i5++;
                size -= 2;
            }
        }
        this.e.getClass();
    }

    public void setWorldCupPassBannerVisible(boolean z) {
        ComposeView composeView = this.B;
        if (composeView == null) {
            return;
        }
        boolean z2 = composeView.getVisibility() == 0;
        this.B.setVisibility(z ? 0 : 8);
        if (!z) {
            this.D = false;
        } else {
            if (z2 || ((v340) this.C.getState()).a.getValue() == x1k0.a.a || this.D) {
                return;
            }
            this.d.a(s2k0.j.a, k00.d);
            this.D = true;
        }
    }

    public LiveEventHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!isInEditMode()) {
            a();
        }
        this.D = false;
        this.K = getContext().getColor(R.color.brand_secondary_variable_type3);
    }

    public LiveEventHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.D = false;
        this.K = getContext().getColor(R.color.brand_secondary_variable_type3);
    }
}
