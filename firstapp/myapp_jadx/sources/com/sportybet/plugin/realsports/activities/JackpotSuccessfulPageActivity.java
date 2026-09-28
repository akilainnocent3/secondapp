package com.sportybet.plugin.realsports.activities;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.b;
import com.sporty.android.common_ui.widgets.AspectRatioImageView;
import com.sporty.android.core.model.realsports.Order;
import com.sportybet.android.gp.tz.R;
import defpackage.a8b;
import defpackage.ap0;
import defpackage.bi50;
import defpackage.bjb0;
import defpackage.bwf0;
import defpackage.gr0;
import defpackage.gv5;
import defpackage.h3z;
import defpackage.iwh0;
import defpackage.ix1;
import defpackage.o7d;
import defpackage.py1;
import defpackage.sh8;
import defpackage.su5;
import defpackage.wae;
import defpackage.zch0;
import java.util.Date;
import java.util.Locale;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes7.dex */
public class JackpotSuccessfulPageActivity extends py1 implements View.OnClickListener {
    public ImageView a;
    public TextView b;
    public final h3z c = ap0.f();
    public boolean d;
    public Order e;

    @Override // defpackage.r1k
    public final boolean onBackPressedCompat() {
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.ok) {
            finish();
            return;
        }
        if (id == R.id.bet_history_btn) {
            finish();
            new Bundle().putInt("tab_index", 0);
            sh8.c().e(o7d.a(wae.ME_JACKPOT_BET_HISTORY));
            return;
        }
        if (id == R.id.match_alert_title) {
            b.a aVar = new b.a(this);
            aVar.a(R.string.component_betslip__match_alert_desc);
            aVar.setPositiveButton(R.string.common_functions__ok, null).f();
        } else if (id == R.id.match_alert) {
            boolean z = this.d;
            this.d = !z;
            ImageView imageView = this.a;
            if (z) {
                imageView.setImageDrawable(gr0.a(imageView.getContext(), R.drawable.banker_switch_off));
            } else {
                imageView.setImageDrawable(gr0.a(imageView.getContext(), R.drawable.banker_switch_on));
            }
            this.c.m(this.e.orderId, this.d ? 1 : 0).G(new a());
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.spr_activity_jackpot_successful);
        this.a = (ImageView) findViewById(R.id.match_alert);
        this.b = (TextView) findViewById(R.id.match_alert_title);
        Drawable drawableA = gr0.a(this, R.drawable.spr_info);
        if (drawableA != null) {
            drawableA.setBounds(0, 0, zch0.b(getResources(), 16), zch0.b(getResources(), 16));
        }
        this.b.setCompoundDrawables(null, null, drawableA, null);
        this.e = (Order) getIntent().getExtras().get("jackpot_order");
        TextView textView = (TextView) findViewById(R.id.time);
        TextView textView2 = (TextView) findViewById(R.id.round_number);
        TextView textView3 = (TextView) findViewById(R.id.combinations);
        TextView textView4 = (TextView) findViewById(R.id.total_stake);
        findViewById(R.id.ok).setOnClickListener(this);
        TextView textView5 = (TextView) findViewById(R.id.bet_history_btn);
        textView5.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, iwh0.a(this, R.drawable.spr_ic_keyboard_arrow_right_black_24dp, Color.parseColor("#32ce62")), (Drawable) null);
        textView5.setOnClickListener(this);
        Order order = this.e;
        if (order != null) {
            long j = order.createTime;
            if (j > 0) {
                Date date = new Date(j);
                Locale locale = Locale.US;
                locale.getClass();
                textView.setText(bwf0.l(date, "yyyy-MM-dd", locale, 0, 0));
            }
            if (!TextUtils.isEmpty(this.e.periodNumber)) {
                textView2.setText(this.e.periodNumber);
            }
            if (!TextUtils.isEmpty(this.e.combinations)) {
                textView3.setText(this.e.combinations);
            }
            if (!TextUtils.isEmpty(this.e.totalStake)) {
                textView4.setText(a8b.a(this.e.totalStake));
            }
        }
        TextView textView6 = (TextView) findViewById(R.id.gift_type);
        TextView textView7 = (TextView) findViewById(R.id.gift_value);
        if (bjb0.d0(this.e.favorAmount) > 0.0d) {
            textView6.setVisibility(0);
            textView7.setVisibility(0);
            textView6.setText(getCMSString(this.e.favorType == 1 ? R.string.common_functions__cash_gift : R.string.common_functions__discount_gift, new Object[0]));
            textView7.setText(getCMSString(R.string.app_common__minus_prefix, bjb0.P(this.e.favorAmount, Locale.US)));
        } else {
            textView6.setVisibility(8);
            textView7.setVisibility(8);
        }
        AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) findViewById(R.id.banner_ad);
        aspectRatioImageView.setAspectRatio(0.22222222f);
        new ix1(aspectRatioImageView).a();
    }

    public class a implements gv5<ResponseBody> {
        @Override // defpackage.gv5
        public final void onFailure(su5<ResponseBody> su5Var, Throwable th) {
        }

        @Override // defpackage.gv5
        public final void onResponse(su5<ResponseBody> su5Var, bi50<ResponseBody> bi50Var) {
        }
    }
}
