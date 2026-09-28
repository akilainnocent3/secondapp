package com.sportybet.plugin.jackpot.widget;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import defpackage.o7d;
import defpackage.sh8;
import defpackage.wae;

/* JADX INFO: loaded from: classes4.dex */
public class CommonTitleBar extends RelativeLayout {
    public TextView a;

    public class a implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            sh8.c().e(o7d.a(wae.HOME));
        }
    }

    public class b implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Bundle bundle = new Bundle();
            bundle.putInt("tab_index", 10);
            sh8.c().c(o7d.a(wae.ME_JACKPOT_BET_HISTORY), bundle);
        }
    }

    public CommonTitleBar(Context context) {
        super(context);
        a(context);
    }

    public final void a(Context context) {
        View.inflate(context, R.layout.jap_common_title_bar, this);
        this.a = (TextView) findViewById(R.id.back_title);
        findViewById(R.id.home_icon).setOnClickListener(new a());
        findViewById(R.id.history_icon).setOnClickListener(new b());
    }

    public void setTitle(int i) {
        this.a.setText(i);
    }

    public void setTitle(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public CommonTitleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }
}
