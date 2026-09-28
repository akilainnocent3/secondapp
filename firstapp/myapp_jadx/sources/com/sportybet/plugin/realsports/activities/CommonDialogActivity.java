package com.sportybet.plugin.realsports.activities;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.appcompat.app.b;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.activities.CommonDialogActivity;
import defpackage.bb40;
import defpackage.o8k;
import defpackage.xol;

/* JADX INFO: loaded from: classes7.dex */
public class CommonDialogActivity extends xol implements bb40 {
    public static final /* synthetic */ int d = 0;
    public b b;
    public o8k c;

    @Override // defpackage.r1k
    public final boolean onBackPressedCompat() {
        b bVar = this.b;
        if (bVar != null) {
            bVar.dismiss();
        }
        finish();
        overridePendingTransition(0, 0);
        return true;
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        linearLayout.setOrientation(1);
        setContentView(linearLayout);
        b.a aVar = new b.a(this);
        aVar.a.f = getCMSString(R.string.component_betslip__there_cannot_be_over_vthreshold_selections_betslip_tip, String.valueOf(this.c.a()));
        aVar.c(getCMSString(R.string.common_functions__ok, new Object[0]), new DialogInterface.OnClickListener() { // from class: ed8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                int i2 = CommonDialogActivity.d;
                CommonDialogActivity commonDialogActivity = this.a;
                commonDialogActivity.finish();
                commonDialogActivity.overridePendingTransition(0, 0);
            }
        });
        b bVarCreate = aVar.create();
        this.b = bVarCreate;
        bVarCreate.setCanceledOnTouchOutside(false);
        this.b.setCancelable(false);
        this.b.show();
    }
}
