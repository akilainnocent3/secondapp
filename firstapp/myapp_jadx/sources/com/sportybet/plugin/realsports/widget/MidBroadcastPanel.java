package com.sportybet.plugin.realsports.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sporty.android.core.model.config.BroadcastConfig;
import com.sportybet.android.gp.tz.R;
import defpackage.j7g;
import defpackage.sh8;
import defpackage.sn5;
import defpackage.zch0;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class MidBroadcastPanel extends LinearLayout {
    public final View a;
    public MarqueeView b;

    public class a implements View.OnClickListener {
        public final /* synthetic */ BroadcastConfig.Info a;

        public a(BroadcastConfig.Info info) {
            this.a = info;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            sh8.c().e(this.a.getUrl());
        }
    }

    public MidBroadcastPanel(Context context) {
        super(context);
        this.a = LayoutInflater.from(context).inflate(R.layout.spr_mid_broadcast_pannel, this);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        MarqueeView marqueeView = (MarqueeView) this.a.findViewById(R.id.mid_broadcast_view);
        this.b = marqueeView;
        marqueeView.setScrollDirection(2);
        this.b.setItemViewMarginLeft(zch0.a(getContext(), 50));
    }

    public void setInfo(List<BroadcastConfig.Info> list) {
        MarqueeView marqueeView = this.b;
        marqueeView.c.removeAllViews();
        marqueeView.i = 0;
        if (list != null) {
            for (BroadcastConfig.Info info : list) {
                j7g j7gVar = new j7g();
                j7gVar.e(getContext().getColor(R.color.text_type1_primary), info.getText());
                if (!TextUtils.isEmpty(info.getUrl())) {
                    j7gVar.a(" ");
                    j7gVar.e(getContext().getColor(R.color.brand_secondary_variable_type3), sn5.c(this, R.string.common_functions__view_more_low, new Object[0]));
                }
                View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.spr_mid_marquee_text_view, (ViewGroup) null);
                TextView textView = (TextView) viewInflate.findViewById(R.id.content);
                textView.setText(j7gVar);
                if (TextUtils.isEmpty(info.getUrl())) {
                    textView.setOnClickListener(null);
                } else {
                    textView.setOnClickListener(new a(info));
                }
                this.b.a(viewInflate);
            }
        }
    }

    public void setMarqueeViewLogPrefix(String str) {
        this.b.setLogPrefix(str);
    }

    public MidBroadcastPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = LayoutInflater.from(context).inflate(R.layout.spr_mid_broadcast_pannel, this);
    }

    public MidBroadcastPanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = LayoutInflater.from(context).inflate(R.layout.spr_mid_broadcast_pannel, this);
    }
}
