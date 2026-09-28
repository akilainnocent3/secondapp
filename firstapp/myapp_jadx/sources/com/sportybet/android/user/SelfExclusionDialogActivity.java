package com.sportybet.android.user;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.sporty.android.common_ui.widgets.CommonButton;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.home.MainActivity;
import defpackage.bb40;
import defpackage.d0n;
import defpackage.k9j;
import defpackage.o7d;
import defpackage.p2m;
import defpackage.psm;
import defpackage.pwx;
import defpackage.rlf;
import defpackage.sh8;
import defpackage.snb0;
import defpackage.uf80;
import defpackage.wae;
import defpackage.yrh0;
import defpackage.zux;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes6.dex */
public class SelfExclusionDialogActivity extends p2m implements zux, pwx, View.OnClickListener, k9j, bb40, rlf {
    public TextView b;
    public final SimpleDateFormat c = new SimpleDateFormat("dd MMM. yyyy HH:mm", Locale.US);
    public d0n d;
    public psm e;

    public final String A1(Date date) {
        TimeZone timeZone = new GregorianCalendar().getTimeZone();
        int rawOffset = timeZone.getRawOffset() + (timeZone.inDaylightTime(date) ? timeZone.getDSTSavings() : 0);
        return getCMSString(R.string.self_exclusion__time_zone_format, uf80.a(new StringBuilder("GMT "), rawOffset >= 0 ? "+" : "-", String.format(Locale.US, "%02d:%02d", Integer.valueOf(Math.abs(rawOffset / 3600000)), Integer.valueOf(Math.abs((rawOffset / 60000) % 60)))));
    }

    @Override // defpackage.r1k
    public final boolean onBackPressedCompat() {
        z1();
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.contact_to_customer_service) {
            this.d.b(this, snb0.SELF_EXCLUSION);
            finish();
        } else if (id == R.id.make_a_withdraw) {
            sh8.c().e(o7d.a(wae.WITHDRAW));
            finish();
        } else if (id == R.id.close || id == R.id.log_out) {
            z1();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int i2;
        super.onCreate(bundle);
        setContentView(R.layout.self_exclusion_popup_layout);
        CommonButton commonButton = (CommonButton) findViewById(R.id.contact_to_customer_service);
        CommonButton commonButton2 = (CommonButton) findViewById(R.id.make_a_withdraw);
        this.b = (TextView) findViewById(R.id.self_exclusion_end_date);
        commonButton.setOnClickListener(this);
        commonButton2.setOnClickListener(this);
        ((TextView) findViewById(R.id.log_out)).setOnClickListener(this);
        ((ImageButton) findViewById(R.id.close)).setOnClickListener(this);
        TextView textView = (TextView) findViewById(R.id.self_exclusion_title);
        TextView textView2 = (TextView) findViewById(R.id.self_exclusion_subtitle);
        TextView textView3 = (TextView) findViewById(R.id.self_exclusion_body_text);
        String stringExtra = getIntent().getStringExtra("self_exclusion_type");
        if (stringExtra == null || !stringExtra.equals("ops-exclusion")) {
            if (this.e.O()) {
                i = R.string.self_exclusion__self_exclusion_now__ZA;
                i2 = R.string.self_exclusion__your_self_exclusion_will_end_on__ZA;
            } else {
                i = R.string.self_exclusion__self_exclusion_now;
                i2 = R.string.self_exclusion__your_self_exclusion_will_end_on;
            }
            textView.setText(getCMSString(i, new Object[0]));
            textView2.setText(getCMSString(i2, new Object[0]));
            return;
        }
        textView.setText(getCMSString(R.string.self_exclusion__ops_exclusion_title, new Object[0]));
        textView2.setVisibility(8);
        commonButton.setVisibility(8);
        commonButton2.setBackground(getDrawable(R.drawable.bg_filled_brand_secondary_2_radius_with_brand_secondary_disable));
        commonButton2.setTextAppearance(R.style.H4_M);
        ViewGroup.LayoutParams layoutParams = commonButton2.getLayoutParams();
        layoutParams.getClass();
        int i3 = (int) (44.0f * commonButton2.getResources().getDisplayMetrics().density);
        int i4 = (int) (20.0f * commonButton2.getResources().getDisplayMetrics().density);
        layoutParams.height = i3;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i4;
        }
        commonButton2.setLayoutParams(layoutParams);
        commonButton2.setTextColor(getColor(R.color.brand_tertiary));
        this.b.setVisibility(8);
        textView3.setText(getCMSString(R.string.self_exclusion__ops_exclusion_body, new Object[0]));
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        String cMSString;
        super.onResume();
        TextView textView = this.b;
        SimpleDateFormat simpleDateFormat = this.c;
        try {
            TimeZone timeZone = new GregorianCalendar().getTimeZone();
            Date date = new Date(getAccountHelper().getSelfExclusionUTCTimeStamp());
            simpleDateFormat.setTimeZone(timeZone);
            cMSString = getCMSString(R.string.self_exclusion__format, simpleDateFormat.format(date), A1(date));
        } catch (Exception unused) {
            cMSString = "";
        }
        textView.setText(Html.fromHtml(cMSString));
    }

    public final void z1() {
        getAccountHelper().logout();
        finish();
        Intent intent = new Intent(getApplicationContext(), (Class<?>) MainActivity.class);
        intent.setFlags(67108864);
        yrh0.s(getApplicationContext(), intent, true);
    }
}
