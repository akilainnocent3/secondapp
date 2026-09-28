package com.sportybet.plugin.jackpot.activities;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.widgets.AspectRatioImageView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.jackpot.activities.JackpotSuccessfulPageActivity;
import com.sportybet.plugin.jackpot.data.AdsData;
import com.sportybet.plugin.jackpot.data.Order;
import defpackage.a8b;
import defpackage.azm;
import defpackage.bjb0;
import defpackage.iwh0;
import defpackage.jx1;
import defpackage.m7p;
import defpackage.mx1;
import defpackage.ntl;
import defpackage.su5;
import defpackage.uxo;
import defpackage.wae;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class JackpotSuccessfulPageActivity extends ntl {
    public static final /* synthetic */ int c = 0;
    public azm b;

    @Override // defpackage.r1k
    public final boolean onBackPressedCompat() {
        return true;
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Order order = (Order) uxo.a(getIntent(), "jackpot_order", Order.class);
        int i = 0;
        if (order == null) {
            finish();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("tab_index", 0);
            this.b.e(wae.ME_JACKPOT_BET_HISTORY, bundle2);
            return;
        }
        setContentView(R.layout.jap_activity_jackpot_successful);
        TextView textView = (TextView) findViewById(R.id.round_number);
        TextView textView2 = (TextView) findViewById(R.id.combinations);
        TextView textView3 = (TextView) findViewById(R.id.total_stake);
        findViewById(R.id.ok).setOnClickListener(new View.OnClickListener() { // from class: l7p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = JackpotSuccessfulPageActivity.c;
                this.a.finish();
            }
        });
        TextView textView4 = (TextView) findViewById(R.id.bet_history_btn);
        textView4.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, iwh0.a(this, R.drawable.jap_ic_keyboard_arrow_right_black_24dp, Color.parseColor("#0d9737")), (Drawable) null);
        textView4.setOnClickListener(new m7p(this, i));
        if (!TextUtils.isEmpty(order.periodNumber)) {
            textView.setText(order.periodNumber);
        }
        if (!TextUtils.isEmpty(order.combinations)) {
            textView2.setText(order.combinations);
        }
        if (!TextUtils.isEmpty(order.totalStake)) {
            textView3.setText(a8b.a(bjb0.P(order.totalStake, Locale.US)));
        }
        TextView textView5 = (TextView) findViewById(R.id.gift_type);
        TextView textView6 = (TextView) findViewById(R.id.gift_value);
        if (bjb0.d0(order.favorAmount) > 0.0d) {
            textView5.setVisibility(0);
            textView6.setVisibility(0);
            textView5.setText(getCMSString(order.favorType == 1 ? R.string.common_functions__cash_gift : R.string.common_functions__discount_gift, new Object[0]));
            textView6.setText(getCMSString(R.string.app_common__minus_prefix, bjb0.P(order.favorAmount, Locale.US)));
        } else {
            textView5.setVisibility(8);
            textView6.setVisibility(8);
        }
        AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) findViewById(R.id.banner_ad);
        aspectRatioImageView.setAspectRatio(0.22222222f);
        mx1 mx1Var = new mx1(aspectRatioImageView);
        su5<BaseResponse<AdsData>> su5Var = mx1Var.b;
        if (su5Var != null) {
            su5Var.cancel();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONObject().put("spotId", "orderSuccess"));
            jSONObject.put("adSpots", jSONArray);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        su5<BaseResponse<AdsData>> su5VarA = mx1Var.c.a(jSONObject.toString());
        mx1Var.b = su5VarA;
        su5VarA.G(new jx1(mx1Var));
    }
}
