package com.sportybet.plugin.realsports.widget;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.sportybet.android.gp.tz.R;
import defpackage.oti;
import defpackage.qm80;
import defpackage.sn5;

/* JADX INFO: loaded from: classes7.dex */
public class SettleDelayHint extends RelativeLayout {
    public static final /* synthetic */ int b = 0;
    public View a;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = SettleDelayHint.b;
            Activity activityE = oti.c().e();
            if (activityE == null || activityE.isFinishing()) {
                return;
            }
            androidx.appcompat.app.b.a aVar = new androidx.appcompat.app.b.a(activityE);
            aVar.a.f = sn5.c(SettleDelayHint.this, R.string.live__this_match_may_take_up_tip, new Object[0]);
            androidx.appcompat.app.b bVarCreate = aVar.setPositiveButton(R.string.common_functions__ok, new qm80()).create();
            bVarCreate.setCanceledOnTouchOutside(true);
            bVarCreate.show();
        }
    }

    public SettleDelayHint(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        View viewFindViewById = findViewById(R.id.hint_btn);
        this.a = viewFindViewById;
        viewFindViewById.setOnClickListener(new a());
    }

    public SettleDelayHint(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SettleDelayHint(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
