package com.sportybet.plugin.realsports.activities;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.activities.SportySimPromotionDialogActivity;
import com.sportybet.plugin.realsports.betslip.widget.BetslipActivity;
import com.sportybet.plugin.realsports.data.sim.SimShareData;
import defpackage.py1;
import defpackage.sh8;

/* JADX INFO: loaded from: classes7.dex */
public class SportySimPromotionDialogActivity extends py1 {
    public static final /* synthetic */ int a = 0;

    public class a implements DialogInterface.OnDismissListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            SportySimPromotionDialogActivity.this.finish();
        }
    }

    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(DialogInterface dialogInterface) {
            SportySimPromotionDialogActivity.this.finish();
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.fade_out);
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        linearLayout.setOrientation(1);
        setContentView(linearLayout);
        androidx.appcompat.app.b.a aVar = new androidx.appcompat.app.b.a(this);
        View viewInflate = getLayoutInflater().inflate(R.layout.alert_dialog_simulate_games, (ViewGroup) null);
        aVar.setView(viewInflate);
        final androidx.appcompat.app.b bVarCreate = aVar.create();
        viewInflate.findViewById(R.id.btn_back).setOnClickListener(new View.OnClickListener() { // from class: h9d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = SportySimPromotionDialogActivity.a;
                bVarCreate.dismiss();
                this.a.finish();
            }
        });
        sh8.a().a("https://s.sporty.net/cms/ic_sim_popup_image_fcc560308f.webp", (ImageView) viewInflate.findViewById(R.id.image_sim));
        viewInflate.findViewById(R.id.btn_try).setOnClickListener(new View.OnClickListener() { // from class: i9d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = SportySimPromotionDialogActivity.a;
                boolean zIsSimulatedActive = SimShareData.INSTANCE.isSimulatedActive();
                SportySimPromotionDialogActivity sportySimPromotionDialogActivity = this.a;
                if (zIsSimulatedActive) {
                    iu2.a.j().r0(k53.SIM);
                    yrh0.s(sportySimPromotionDialogActivity, new Intent(sportySimPromotionDialogActivity, (Class<?>) BetslipActivity.class), true);
                }
                bVarCreate.dismiss();
                sportySimPromotionDialogActivity.finish();
            }
        });
        bVarCreate.setOnDismissListener(new a());
        bVarCreate.setOnCancelListener(new b());
        bVarCreate.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        bVarCreate.show();
    }
}
