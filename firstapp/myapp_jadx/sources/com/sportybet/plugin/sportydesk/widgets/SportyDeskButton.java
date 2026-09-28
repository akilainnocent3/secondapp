package com.sportybet.plugin.sportydesk.widgets;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.sportybet.android.gp.tz.R;
import defpackage.rnb0;

/* JADX INFO: loaded from: classes7.dex */
public class SportyDeskButton extends FrameLayout {
    public static final /* synthetic */ int b = 0;
    public final View a;

    public SportyDeskButton(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.spr_sporty_desk_button, this);
        findViewById(R.id.sporty_desk_btn_layout_id).setOnClickListener(new rnb0());
        this.a = findViewById(R.id.sporty_desk_new_message_dot);
    }

    public void setNewMessageHintVisibility(boolean z) {
        this.a.setVisibility(z ? 0 : 4);
    }
}
