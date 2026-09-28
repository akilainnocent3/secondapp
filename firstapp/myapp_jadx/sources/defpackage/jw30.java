package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import com.twilio.voice.EventKeys;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
public final class jw30 extends BroadcastReceiver {
    public final /* synthetic */ gw30 a;

    public jw30(gw30 gw30Var) {
        this.a = gw30Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        intent.getClass();
        if (context != null) {
            boolean zHasExtra = intent.hasExtra("cashoutErr");
            gw30 gw30Var = this.a;
            if (zHasExtra) {
                gw30Var.D = false;
                return;
            }
            if (intent.hasExtra("enable button")) {
                boolean zL = c.l(intent.getStringExtra("number"), "1", false);
                oxi oxiVar = gw30Var.a;
                if (zL) {
                    if (oxiVar == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    oxiVar.e.setClickable(true);
                    oxi oxiVar2 = gw30Var.a;
                    if (oxiVar2 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    oxiVar2.e.setAlpha(1.0f);
                    oxi oxiVar3 = gw30Var.a;
                    if (oxiVar3 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    oxiVar3.e.setVisibility(8);
                } else {
                    if (oxiVar == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    oxiVar.f.setClickable(true);
                    oxi oxiVar4 = gw30Var.a;
                    if (oxiVar4 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    oxiVar4.f.setAlpha(1.0f);
                    oxi oxiVar5 = gw30Var.a;
                    if (oxiVar5 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    oxiVar5.f.setVisibility(8);
                }
                gw30Var.D = false;
                return;
            }
            String stringExtra = intent.getStringExtra(EventKeys.ERROR_MESSAGE);
            if (intent.getIntExtra("betIndex", 0) == 1) {
                if (stringExtra == null || stringExtra.length() != 0) {
                    oxi oxiVar6 = gw30Var.a;
                    if (oxiVar6 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    oxiVar6.e.setVisibility(0);
                    oxi oxiVar7 = gw30Var.a;
                    if (oxiVar7 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    oxiVar7.e.setClickable(true);
                    oxi oxiVar8 = gw30Var.a;
                    if (oxiVar8 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    oxiVar8.e.setAlpha(1.0f);
                    oxi oxiVar9 = gw30Var.a;
                    if (oxiVar9 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    TextView textView = oxiVar9.v;
                    textView.setTypeface(textView.getTypeface(), 1);
                    oxi oxiVar10 = gw30Var.a;
                    if (oxiVar10 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    oxiVar10.v.setText(stringExtra);
                    if (stringExtra == null || !StringsKt.M(stringExtra, "CANCEL", false)) {
                        oxi oxiVar11 = gw30Var.a;
                        if (oxiVar11 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        oxiVar11.e.setBackground(context.getDrawable(R.drawable.cashout_button_sh));
                        gw30Var.E = 1;
                    } else {
                        oxi oxiVar12 = gw30Var.a;
                        if (oxiVar12 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        oxiVar12.e.setBackground(context.getDrawable(R.drawable.sg_cancel_btn_bg));
                        gw30Var.E = 2;
                    }
                } else {
                    oxi oxiVar13 = gw30Var.a;
                    if (oxiVar13 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    oxiVar13.e.setVisibility(8);
                }
            } else if (stringExtra == null || stringExtra.length() != 0) {
                oxi oxiVar14 = gw30Var.a;
                if (oxiVar14 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                oxiVar14.f.setVisibility(0);
                oxi oxiVar15 = gw30Var.a;
                if (oxiVar15 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                oxiVar15.f.setClickable(true);
                oxi oxiVar16 = gw30Var.a;
                if (oxiVar16 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                oxiVar16.f.setAlpha(1.0f);
                oxi oxiVar17 = gw30Var.a;
                if (oxiVar17 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                TextView textView2 = oxiVar17.w;
                textView2.setTypeface(textView2.getTypeface(), 1);
                oxi oxiVar18 = gw30Var.a;
                if (oxiVar18 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                oxiVar18.w.setText(stringExtra);
                if (stringExtra == null || !StringsKt.M(stringExtra, "CANCEL", false)) {
                    oxi oxiVar19 = gw30Var.a;
                    if (oxiVar19 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    oxiVar19.f.setBackground(context.getDrawable(R.drawable.cashout_button_sh));
                    gw30Var.E = 1;
                } else {
                    oxi oxiVar20 = gw30Var.a;
                    if (oxiVar20 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    oxiVar20.f.setBackground(context.getDrawable(R.drawable.sg_cancel_btn_bg));
                    gw30Var.E = 2;
                }
            } else {
                oxi oxiVar21 = gw30Var.a;
                if (oxiVar21 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                oxiVar21.f.setVisibility(8);
            }
            oxi oxiVar22 = gw30Var.a;
            if (oxiVar22 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            if (oxiVar22.e.getVisibility() != 0) {
                oxi oxiVar23 = gw30Var.a;
                if (oxiVar23 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                if (oxiVar23.f.getVisibility() != 0) {
                    oxi oxiVar24 = gw30Var.a;
                    if (oxiVar24 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    oxiVar24.i.setVisibility(4);
                    gw30Var.D = false;
                    return;
                }
            }
            oxi oxiVar25 = gw30Var.a;
            if (oxiVar25 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            oxiVar25.i.setVisibility(0);
            gw30Var.D = true;
        }
    }
}
