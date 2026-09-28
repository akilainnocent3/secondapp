package com.sportygames.roulette.activities;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.Space;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.tw_commons.data.BaseResponse;
import com.sportygames.roulette.data.BetDetail;
import com.sportygames.roulette.data.BetInfo;
import com.sportygames.roulette.data.LastBet;
import defpackage.bi50;
import defpackage.g9i0;
import defpackage.gr0;
import defpackage.gv5;
import defpackage.kf9;
import defpackage.mpe0;
import defpackage.mv1;
import defpackage.r6i0;
import defpackage.su5;
import defpackage.wz;
import defpackage.xae;
import defpackage.yyf0;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.WeakHashMap;
import okhttp3.Response;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements gv5<BaseResponse<BetDetail>> {
    public final /* synthetic */ HistoryActivity a;

    /* JADX INFO: renamed from: com.sportygames.roulette.activities.a$a, reason: collision with other inner class name */
    public class ViewOnClickListenerC0446a implements View.OnClickListener {
        public final /* synthetic */ BetDetail a;

        public ViewOnClickListenerC0446a(BetDetail betDetail) {
            this.a = betDetail;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int[] iArr = RouletteActivity.A0;
            wz.a("transactionsOpened", "Roulette", "betHistoryDetails");
            HistoryActivity historyActivity = a.this.a;
            String str = this.a.ticketId;
            int i = HistoryActivity.S;
            historyActivity.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("KEY_TICKET_ID", str);
            SportyGamesManager.getInstance().gotoSportyBet(xae.d, bundle);
        }
    }

    public class b implements View.OnClickListener {
        public final /* synthetic */ BetDetail a;

        public b(BetDetail betDetail) {
            this.a = betDetail;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int[] iArr = RouletteActivity.A0;
            wz.a("rebetClicked", "Roulette", "betHistoryModal");
            LastBet lastBet = new LastBet();
            BetDetail betDetail = this.a;
            lastBet.stake = betDetail.stake;
            lastBet.result = betDetail.result;
            lastBet.status = betDetail.status;
            lastBet.betInfoDetail = betDetail.betInfoDetail;
            HistoryActivity historyActivity = a.this.a;
            historyActivity.F.H1(lastBet);
            historyActivity.E();
        }
    }

    public a(HistoryActivity historyActivity) {
        this.a = historyActivity;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse<BetDetail>> su5Var, Throwable th) {
        HistoryActivity historyActivity = this.a;
        if (historyActivity.F.isFinishing()) {
            return;
        }
        historyActivity.O.setVisibility(8);
        RouletteActivity rouletteActivity = historyActivity.F;
        mpe0 mpe0Var = yyf0.a;
        rouletteActivity.getClass();
        yyf0.a(0, rouletteActivity, rouletteActivity.getString(R.string.sg_common_feedback__please_check_your_internet_connection_and_try_again));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x0287  */
    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse<BetDetail>> su5Var, bi50<BaseResponse<BetDetail>> bi50Var) {
        BetDetail betDetail;
        byte b2;
        TextView textView;
        TextView textView2;
        int i;
        TextView textView3;
        TextView textView4;
        int i2;
        TextView textView5;
        int i3;
        int i4;
        Response response = bi50Var.a;
        HistoryActivity historyActivity = this.a;
        RouletteActivity rouletteActivity = historyActivity.F;
        RouletteActivity rouletteActivity2 = historyActivity.F;
        if (rouletteActivity.isFinishing()) {
            return;
        }
        historyActivity.O.setVisibility(8);
        if (!response.getIsSuccessful()) {
            int iCode = response.code();
            if (iCode == 401 || iCode == 403) {
                SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                return;
            } else {
                onFailure(su5Var, null);
                return;
            }
        }
        BaseResponse<BetDetail> baseResponse = bi50Var.b;
        if (baseResponse == null || baseResponse.bizCode != 10000 || (betDetail = baseResponse.data) == null) {
            return;
        }
        historyActivity.R.setOnClickListener(new ViewOnClickListenerC0446a(betDetail));
        historyActivity.J.setText(betDetail.ticketId);
        historyActivity.I.findViewById(R.id.rebet).setOnClickListener(new b(betDetail));
        historyActivity.K.setText(rouletteActivity2.getString(R.string.sg_game_roulette__stake));
        ((TextView) historyActivity.I.findViewById(R.id.stake_value)).setText(betDetail.stake);
        historyActivity.L.setText(betDetail.result);
        try {
            TextView textView6 = historyActivity.L;
            ShapeDrawable shapeDrawableA = mv1.a(rouletteActivity2, Integer.parseInt(betDetail.result));
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            textView6.setBackground(shapeDrawableA);
        } catch (Exception unused) {
        }
        historyActivity.N.setText(new SimpleDateFormat("dd/MM HH:mm:ss", SportyGamesManager.locale).format(new Date(betDetail.placeTime)));
        if (TextUtils.isEmpty(betDetail.bonus) || "0.00".equals(betDetail.bonus)) {
            historyActivity.I.findViewById(R.id.rewards).setVisibility(8);
            historyActivity.I.findViewById(R.id.rewards_value).setVisibility(8);
        } else {
            historyActivity.I.findViewById(R.id.rewards).setVisibility(0);
            TextView textView7 = (TextView) historyActivity.I.findViewById(R.id.rewards_value);
            textView7.setVisibility(0);
            textView7.setText(betDetail.bonus);
        }
        historyActivity.M.setVisibility(0);
        int i5 = betDetail.status;
        if (i5 == 1) {
            historyActivity.M.setText(betDetail.winningAmount);
            historyActivity.M.setCompoundDrawables(historyActivity.F(), null, null, null);
            historyActivity.M.setTextColor(rouletteActivity2.getColor(R.color.win_text_color));
        } else if (i5 == 2) {
            historyActivity.M.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            historyActivity.M.setText(R.string.sg_bet_history__lost);
            historyActivity.M.setTextColor(-1);
        } else {
            TextView textView8 = historyActivity.M;
            if (i5 == 0) {
                textView8.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                historyActivity.M.setText(R.string.sg_component_wap_share_bet__running);
                historyActivity.M.setTextColor(Color.parseColor("#00d8ff"));
            } else {
                textView8.setVisibility(8);
            }
        }
        TextView textView9 = (TextView) historyActivity.I.findViewById(R.id.straight);
        View viewFindViewById = historyActivity.I.findViewById(R.id.straight_d);
        GridLayout gridLayout = (GridLayout) historyActivity.I.findViewById(R.id.straight_c);
        gridLayout.setColumnCount(2);
        textView9.setVisibility(8);
        viewFindViewById.setVisibility(8);
        gridLayout.setVisibility(8);
        textView9.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        gridLayout.removeAllViews();
        TextView textView10 = (TextView) historyActivity.I.findViewById(R.id.odd_even);
        TextView textView11 = (TextView) historyActivity.I.findViewById(R.id.odd);
        TextView textView12 = (TextView) historyActivity.I.findViewById(R.id.even);
        View viewFindViewById2 = historyActivity.I.findViewById(R.id.odd_even_d);
        textView10.setVisibility(8);
        textView11.setVisibility(8);
        textView12.setVisibility(8);
        viewFindViewById2.setVisibility(8);
        textView10.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        TextView textView13 = (TextView) historyActivity.I.findViewById(R.id.column);
        GridLayout gridLayout2 = (GridLayout) historyActivity.I.findViewById(R.id.column_grid);
        View viewFindViewById3 = historyActivity.I.findViewById(R.id.column_d);
        textView13.setVisibility(8);
        gridLayout2.setVisibility(8);
        gridLayout2.setColumnCount(2);
        gridLayout2.removeAllViews();
        viewFindViewById3.setVisibility(8);
        textView13.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        TextView textView14 = (TextView) historyActivity.I.findViewById(R.id.red_black);
        TextView textView15 = (TextView) historyActivity.I.findViewById(R.id.red);
        View view = viewFindViewById2;
        TextView textView16 = (TextView) historyActivity.I.findViewById(R.id.black);
        TextView textView17 = textView12;
        View viewFindViewById4 = historyActivity.I.findViewById(R.id.red_black_d);
        textView14.setVisibility(8);
        textView15.setVisibility(8);
        textView16.setVisibility(8);
        viewFindViewById4.setVisibility(8);
        textView14.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        TextView textView18 = textView11;
        TextView textView19 = (TextView) historyActivity.I.findViewById(R.id.low_high);
        TextView textView20 = textView10;
        TextView textView21 = (TextView) historyActivity.I.findViewById(R.id.low);
        View view2 = viewFindViewById;
        TextView textView22 = (TextView) historyActivity.I.findViewById(R.id.high);
        View viewFindViewById5 = historyActivity.I.findViewById(R.id.low_high_d);
        textView19.setVisibility(8);
        textView21.setVisibility(8);
        textView22.setVisibility(8);
        viewFindViewById5.setVisibility(8);
        textView19.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        Iterator<BetInfo> it = betDetail.betInfo.iterator();
        while (it.hasNext()) {
            BetInfo next = it.next();
            Iterator<BetInfo> it2 = it;
            String str = next.name;
            str.getClass();
            View view3 = viewFindViewById5;
            switch (str) {
                case "Low/High":
                    b2 = 0;
                    break;
                case "Odd/Even":
                    b2 = 1;
                    break;
                case "Straight":
                    b2 = 2;
                    break;
                case "Red/Black":
                    b2 = 3;
                    break;
                case "Column":
                    b2 = 4;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            TextView textView23 = textView22;
            switch (b2) {
                case 0:
                    textView9 = textView9;
                    textView21 = textView21;
                    textView = textView19;
                    textView20 = textView20;
                    view2 = view2;
                    textView16 = textView16;
                    textView.setVisibility(0);
                    if ("Low".equals(next.selection)) {
                        textView21.setVisibility(0);
                        textView21.setText(Html.fromHtml("<b>" + rouletteActivity2.getString(R.string.sg_game_roulette__low) + "</b> " + rouletteActivity2.getString(R.string.sg_app_common__var_var_brackets, SportyGamesManager.getInstance().getCountryCurrency().trim(), next.stake)));
                        if (next.winning) {
                            i = 0;
                            textView21.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.sg_rut_gou, 0);
                            textView.setCompoundDrawables(null, null, historyActivity.F(), null);
                        } else {
                            i = 0;
                            textView21.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                        }
                        textView21 = textView21;
                        textView2 = textView23;
                    } else if ("High".equals(next.selection)) {
                        textView2 = textView23;
                        textView2.setVisibility(0);
                        textView2.setText(Html.fromHtml("<b>" + rouletteActivity2.getString(R.string.sg_game_roulette__high) + "</b> " + rouletteActivity2.getString(R.string.sg_app_common__var_var_brackets, SportyGamesManager.getInstance().getCountryCurrency().trim(), next.stake)));
                        if (next.winning) {
                            i = 0;
                            textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.sg_rut_gou, 0);
                            textView.setCompoundDrawables(null, null, historyActivity.F(), null);
                        } else {
                            i = 0;
                            textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                        }
                    } else {
                        textView2 = textView23;
                        i = 0;
                    }
                    view3.setVisibility(i);
                    break;
                case 1:
                    textView20 = textView20;
                    view2 = view2;
                    textView20.setVisibility(0);
                    if ("Odd".equals(next.selection)) {
                        textView3 = textView18;
                        textView3.setVisibility(0);
                        textView3.setText(Html.fromHtml("<b>" + rouletteActivity2.getString(R.string.sg_game_roulette__odd) + "</b> " + rouletteActivity2.getString(R.string.sg_app_common__var_var_brackets, SportyGamesManager.getInstance().getCountryCurrency().trim(), next.stake)));
                        if (next.winning) {
                            i2 = 0;
                            textView3.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.sg_rut_gou, 0);
                            textView20.setCompoundDrawables(null, null, historyActivity.F(), null);
                        } else {
                            i2 = 0;
                            textView3.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                        }
                        textView4 = textView17;
                    } else {
                        textView3 = textView18;
                        if ("Even".equals(next.selection)) {
                            textView4 = textView17;
                            textView4.setVisibility(0);
                            textView4.setText(Html.fromHtml("<b>" + rouletteActivity2.getString(R.string.sg_game_roulette__even) + "</b> " + rouletteActivity2.getString(R.string.sg_app_common__var_var_brackets, SportyGamesManager.getInstance().getCountryCurrency().trim(), next.stake)));
                            if (next.winning) {
                                i2 = 0;
                                textView4.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.sg_rut_gou, 0);
                                textView20.setCompoundDrawables(null, null, historyActivity.F(), null);
                            } else {
                                i2 = 0;
                                textView4.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                            }
                        } else {
                            textView4 = textView17;
                            i2 = 0;
                        }
                    }
                    view.setVisibility(i2);
                    textView18 = textView3;
                    view = view;
                    textView17 = textView4;
                    view3 = view3;
                    textView2 = textView23;
                    textView = textView19;
                    break;
                case 2:
                    textView9.setVisibility(0);
                    gridLayout.setVisibility(0);
                    view2 = view2;
                    view2.setVisibility(0);
                    View viewInflate = LayoutInflater.from(rouletteActivity2).inflate(R.layout.sg_rut_straight, (ViewGroup) gridLayout, false);
                    TextView textView24 = (TextView) viewInflate.findViewById(R.id.ball);
                    TextView textView25 = (TextView) viewInflate.findViewById(R.id.stake);
                    textView24.setText(next.selection);
                    try {
                        ShapeDrawable shapeDrawableA2 = mv1.a(textView24.getContext(), Integer.parseInt(next.selection));
                        WeakHashMap<View, g9i0> weakHashMap2 = r6i0.a;
                        textView24.setBackground(shapeDrawableA2);
                        break;
                    } catch (Exception unused2) {
                    }
                    textView25.setText(rouletteActivity2.getString(R.string.sg_app_common__var_var_brackets, SportyGamesManager.getInstance().getCountryCurrency().trim(), next.stake));
                    if (next.winning) {
                        textView25.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.sg_rut_gou, 0);
                        textView9.setCompoundDrawables(null, null, historyActivity.F(), null);
                    }
                    GridLayout.Alignment alignment = GridLayout.FILL;
                    GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams(GridLayout.spec(Integer.MIN_VALUE, 1, alignment), GridLayout.spec(Integer.MIN_VALUE, 1, alignment, 1.0f));
                    layoutParams.setGravity(3);
                    if (gridLayout.getChildCount() >= 2) {
                        layoutParams.topMargin = kf9.a(rouletteActivity2, 8);
                    }
                    gridLayout.addView(viewInflate, layoutParams);
                    textView20 = textView20;
                    view3 = view3;
                    textView2 = textView23;
                    textView = textView19;
                    break;
                case 3:
                    textView9 = textView9;
                    textView5 = textView19;
                    textView14.setVisibility(0);
                    if (!"Red".equals(next.selection)) {
                        i3 = 0;
                        if ("Black".equals(next.selection)) {
                            textView16.setVisibility(0);
                            if (next.winning) {
                                textView16.setCompoundDrawablesWithIntrinsicBounds(gr0.a(rouletteActivity2, R.drawable.sg_rut_black), (Drawable) null, gr0.a(rouletteActivity2, R.drawable.sg_rut_gou), (Drawable) null);
                                textView14.setCompoundDrawables(null, null, historyActivity.F(), null);
                            } else {
                                textView16.setCompoundDrawablesWithIntrinsicBounds(gr0.a(rouletteActivity2, R.drawable.sg_rut_black), (Drawable) null, (Drawable) null, (Drawable) null);
                            }
                            textView16.setText(Html.fromHtml("<b>" + rouletteActivity2.getString(R.string.sg_app_common__var_var_black_brackets) + "</b> " + rouletteActivity2.getString(R.string.sg_app_common__var_var_brackets, SportyGamesManager.getInstance().getCountryCurrency().trim(), next.stake)));
                        }
                        viewFindViewById4.setVisibility(i3);
                        textView = textView5;
                        textView16 = textView16;
                        textView2 = textView23;
                    } else {
                        textView15.setVisibility(0);
                        if (next.winning) {
                            textView15.setCompoundDrawablesWithIntrinsicBounds(gr0.a(rouletteActivity2, R.drawable.sg_rut_red), (Drawable) null, gr0.a(rouletteActivity2, R.drawable.sg_rut_gou), (Drawable) null);
                            textView14.setCompoundDrawables(null, null, historyActivity.F(), null);
                        } else {
                            textView15.setCompoundDrawablesWithIntrinsicBounds(gr0.a(rouletteActivity2, R.drawable.sg_rut_red), (Drawable) null, (Drawable) null, (Drawable) null);
                        }
                        textView15.setText(Html.fromHtml("<b>" + rouletteActivity2.getString(R.string.sg_app_common__var_var_red_brackets) + "</b> " + rouletteActivity2.getString(R.string.sg_app_common__var_var_brackets, SportyGamesManager.getInstance().getCountryCurrency().trim(), next.stake)));
                    }
                    i3 = 0;
                    viewFindViewById4.setVisibility(i3);
                    textView = textView5;
                    textView16 = textView16;
                    textView2 = textView23;
                    break;
                case 4:
                    textView13.setVisibility(0);
                    if ("Column 1".equals(next.selection)) {
                        textView5 = textView19;
                        TextView textView26 = (TextView) LayoutInflater.from(rouletteActivity2).inflate(R.layout.sg_rut_column, (ViewGroup) gridLayout, false);
                        textView26.setText(Html.fromHtml("<b>" + rouletteActivity2.getString(R.string.sg_game_roulette__column1) + "</b> " + rouletteActivity2.getString(R.string.sg_app_common__var_var_brackets, SportyGamesManager.getInstance().getCountryCurrency().trim(), next.stake)));
                        textView26.setTextSize(14.0f);
                        if (next.winning) {
                            textView26.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.sg_rut_gou, 0);
                            textView13.setCompoundDrawables(null, null, historyActivity.F(), null);
                        } else {
                            textView26.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                        }
                        GridLayout.Alignment alignment2 = GridLayout.FILL;
                        textView9 = textView9;
                        GridLayout.LayoutParams layoutParams2 = new GridLayout.LayoutParams(GridLayout.spec(Integer.MIN_VALUE, 1, alignment2), GridLayout.spec(Integer.MIN_VALUE, 1, alignment2, 1.0f));
                        layoutParams2.setGravity(3);
                        if (gridLayout2.getChildCount() >= 2) {
                            layoutParams2.topMargin = kf9.a(historyActivity.getContext(), 8);
                        }
                        gridLayout2.addView(textView26, layoutParams2);
                        i4 = 0;
                        gridLayout2.setVisibility(0);
                    } else {
                        textView9 = textView9;
                        textView5 = textView19;
                        i4 = 0;
                        if ("Column 2".equals(next.selection)) {
                            TextView textView27 = (TextView) LayoutInflater.from(rouletteActivity2).inflate(R.layout.sg_rut_column, (ViewGroup) gridLayout, false);
                            textView27.setText(Html.fromHtml("<b>" + rouletteActivity2.getString(R.string.sg_game_roulette__column2) + "</b> " + rouletteActivity2.getString(R.string.sg_app_common__var_var_brackets, SportyGamesManager.getInstance().getCountryCurrency().trim(), next.stake)));
                            textView27.setTextSize(14.0f);
                            if (next.winning) {
                                textView27.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.sg_rut_gou, 0);
                                textView13.setCompoundDrawables(null, null, historyActivity.F(), null);
                            } else {
                                textView27.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                            }
                            GridLayout.Alignment alignment3 = GridLayout.FILL;
                            GridLayout.LayoutParams layoutParams3 = new GridLayout.LayoutParams(GridLayout.spec(Integer.MIN_VALUE, 1, alignment3), GridLayout.spec(Integer.MIN_VALUE, 1, alignment3, 1.0f));
                            layoutParams3.setGravity(3);
                            if (gridLayout2.getChildCount() >= 2) {
                                layoutParams3.topMargin = kf9.a(historyActivity.getContext(), 8);
                            }
                            gridLayout2.addView(textView27, layoutParams3);
                            i4 = 0;
                            gridLayout2.setVisibility(0);
                        } else if ("Column 3".equals(next.selection)) {
                            TextView textView28 = (TextView) LayoutInflater.from(rouletteActivity2).inflate(R.layout.sg_rut_column, (ViewGroup) gridLayout, false);
                            textView28.setText(Html.fromHtml("<b>" + rouletteActivity2.getString(R.string.sg_game_roulette__column3) + "</b> " + rouletteActivity2.getString(R.string.sg_app_common__var_var_brackets, SportyGamesManager.getInstance().getCountryCurrency().trim(), next.stake)));
                            textView28.setTextSize(14.0f);
                            if (next.winning) {
                                textView28.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.sg_rut_gou, 0);
                                textView13.setCompoundDrawables(null, null, historyActivity.F(), null);
                            } else {
                                textView28.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                            }
                            GridLayout.Alignment alignment4 = GridLayout.FILL;
                            GridLayout.LayoutParams layoutParams4 = new GridLayout.LayoutParams(GridLayout.spec(Integer.MIN_VALUE, 1, alignment4), GridLayout.spec(Integer.MIN_VALUE, 1, alignment4, 1.0f));
                            layoutParams4.setGravity(3);
                            if (gridLayout2.getChildCount() >= 2) {
                                layoutParams4.topMargin = kf9.a(historyActivity.getContext(), 8);
                            }
                            gridLayout2.addView(textView28, layoutParams4);
                            i4 = 0;
                            gridLayout2.setVisibility(0);
                        }
                    }
                    viewFindViewById3.setVisibility(i4);
                    textView = textView5;
                    textView16 = textView16;
                    textView2 = textView23;
                    break;
                default:
                    textView9 = textView9;
                    textView21 = textView21;
                    textView = textView19;
                    textView16 = textView16;
                    textView2 = textView23;
                    break;
            }
            if (gridLayout.isShown()) {
                while (gridLayout.getChildCount() % 2 > 0) {
                    GridLayout.Alignment alignment5 = GridLayout.FILL;
                    gridLayout.addView(new Space(gridLayout.getContext()), new GridLayout.LayoutParams(GridLayout.spec(Integer.MIN_VALUE, 1, alignment5), GridLayout.spec(Integer.MIN_VALUE, 1, alignment5, 1.0f)));
                    view3 = view3;
                    textView2 = textView2;
                    textView = textView;
                }
            }
            View view4 = view3;
            TextView textView29 = textView2;
            textView20 = textView20;
            textView16 = textView16;
            it = it2;
            viewFindViewById5 = view4;
            textView21 = textView21;
            textView19 = textView;
            textView9 = textView9;
            view2 = view2;
            textView22 = textView29;
        }
        historyActivity.I.setVisibility(0);
        historyActivity.I.setTranslationX(historyActivity.H.getWidth());
        historyActivity.I.animate().translationX(0.0f);
    }
}
