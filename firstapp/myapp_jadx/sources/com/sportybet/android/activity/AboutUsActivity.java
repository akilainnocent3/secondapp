package com.sportybet.android.activity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.sportybet.android.activity.AboutUsActivity;
import com.sportybet.android.gp.tz.R;
import defpackage.a8b;
import defpackage.bb40;
import defpackage.bjb0;
import defpackage.cw;
import defpackage.fbh0;
import defpackage.ill;
import defpackage.iwh0;
import defpackage.k9j;
import defpackage.nae0;
import defpackage.o7d;
import defpackage.psm;
import defpackage.wae;
import defpackage.yi5;
import defpackage.yrh0;
import java.util.Calendar;

/* JADX INFO: loaded from: classes5.dex */
public class AboutUsActivity extends ill implements View.OnClickListener, k9j, bb40, cw {
    public static final /* synthetic */ int v = 0;
    public int b;
    public TextView c;
    public TextView d;
    public psm e;
    public yi5 f;
    public fbh0 i;

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (R.id.rights == id) {
            if (this.f.a().b()) {
                int i = this.b + 1;
                this.b = i;
                if (i >= 2) {
                    this.b = 0;
                    this.i.e(o7d.a(wae.DEBUG_SCREEN));
                    return;
                }
                return;
            }
            return;
        }
        if (R.id.back_icon == id) {
            getOnBackPressedDispatcher().d();
            return;
        }
        if (R.id.terms_conditions == id) {
            Bundle bundle = new Bundle();
            bundle.putString("title", getCMSString(R.string.common_helps__title_t_and_c, new Object[0]));
            this.i.c(bjb0.S("/m/help#/about/terms-and-conditions"), bundle);
            return;
        }
        if (R.id.responsible_gaming == id) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("title", getCMSString(R.string.common_helps__responsible, new Object[0]));
            this.i.c(bjb0.S("/m/help#/about/responsible-gaming"), bundle2);
            return;
        }
        if (R.id.paia == id) {
            yrh0.s(this, new Intent("android.intent.action.VIEW", Uri.parse(getCMSString(R.string.main_footer__paia_manual_url__ZA, new Object[0]))), true);
            return;
        }
        if (R.id.privacy_policy == id) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("title", getCMSString(R.string.common_helps__privacy, new Object[0]));
            this.i.c(bjb0.S("/m/help#/about/privacy-policy"), bundle3);
            return;
        }
        if (R.id.sporty_group == id) {
            Bundle bundle4 = new Bundle();
            bundle4.putString("title", getCMSString(R.string.common_helps__group, new Object[0]));
            this.i.c(bjb0.S("/m/sporty?from=sportybet_app_iframe"), bundle4);
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(R.layout.activity_about_us);
        TextView textView = (TextView) findViewById(R.id.rights);
        textView.setText(nae0.a(getCMSString(R.string.main_footer__year_copy_right, String.valueOf(Calendar.getInstance().get(1)))));
        textView.setOnClickListener(this);
        findViewById(R.id.back_icon).setOnClickListener(this);
        TextView textView2 = (TextView) findViewById(R.id.version);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f.b().a());
        if (this.f.b().i()) {
            str = " DEBUG " + this.f.b().getVersionCode();
        } else {
            str = "";
        }
        sb.append(str);
        textView2.setText(getCMSString(R.string.common_helps__version, sb.toString()));
        TextView textView3 = (TextView) findViewById(R.id.terms_conditions);
        textView3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, iwh0.a(this, R.drawable.ic_keyboard_arrow_right_black_24dp, getResources().getColor(R.color.line_type1_secondary)), (Drawable) null);
        textView3.setOnClickListener(this);
        TextView textView4 = (TextView) findViewById(R.id.responsible_gaming);
        textView4.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, iwh0.a(this, R.drawable.ic_keyboard_arrow_right_black_24dp, getResources().getColor(R.color.line_type1_secondary)), (Drawable) null);
        textView4.setOnClickListener(this);
        if (this.e.O()) {
            findViewById(R.id.paia_divider).setVisibility(0);
            TextView textView5 = (TextView) findViewById(R.id.paia);
            textView5.setVisibility(0);
            textView5.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, iwh0.a(this, R.drawable.ic_keyboard_arrow_right_black_24dp, getResources().getColor(R.color.line_type1_secondary)), (Drawable) null);
            textView5.setOnClickListener(this);
        }
        TextView textView6 = (TextView) findViewById(R.id.privacy_policy);
        textView6.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, iwh0.a(this, R.drawable.ic_keyboard_arrow_right_black_24dp, getResources().getColor(R.color.line_type1_secondary)), (Drawable) null);
        textView6.setOnClickListener(this);
        TextView textView7 = (TextView) findViewById(R.id.sporty_group);
        textView7.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, iwh0.a(this, R.drawable.ic_keyboard_arrow_right_black_24dp, getResources().getColor(R.color.line_type1_secondary)), (Drawable) null);
        textView7.setOnClickListener(this);
        findViewById(R.id.home).setOnClickListener(new View.OnClickListener() { // from class: u1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = AboutUsActivity.v;
                this.a.i.e(o7d.a(wae.HOME));
            }
        });
        this.d = (TextView) findViewById(R.id.statement);
        this.c = (TextView) findViewById(R.id.license_icon);
        if (this.e.r() || this.e.O()) {
            this.c.setVisibility(8);
            this.d.setVisibility(8);
        } else {
            this.d.setText(getCMSString(a8b.c().q(), new Object[0]));
            this.c.setCompoundDrawablesWithIntrinsicBounds(a8b.c().j(), 0, 0, 0);
            this.c.setText(a8b.c().b);
        }
    }
}
