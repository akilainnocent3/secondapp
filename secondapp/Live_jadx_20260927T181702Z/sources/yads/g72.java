package yads;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class g72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ai3 f149434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w52 f149435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f149436c;

    public /* synthetic */ g72(p52 p52Var, ai3 ai3Var) {
        this(ai3Var, new w52(p52Var));
    }

    public final void a(gl1 gl1Var) {
        if (gl1Var != null) {
            final CheckBox muteControl = gl1Var.getMuteControl();
            if (muteControl != null) {
                muteControl.setOnClickListener(new View.OnClickListener() { // from class: yads.z04
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        g72.a(this.f158556b, muteControl, view);
                    }
                });
                muteControl.setVisibility(this.f149434a.f146823b ? 0 : 8);
            }
            ProgressBar videoProgress = gl1Var.getVideoProgress();
            if (videoProgress != null) {
                videoProgress.setVisibility(this.f149434a.f146824c ? 8 : 0);
            }
            TextView countDownProgress = gl1Var.getCountDownProgress();
            if (countDownProgress != null) {
                countDownProgress.setText("");
                countDownProgress.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    public g72(ai3 ai3Var, w52 w52Var) {
        double dDoubleValue;
        this.f149434a = ai3Var;
        this.f149435b = w52Var;
        Double dA = ai3Var.a();
        if (dA == null) {
            dDoubleValue = 1.0d;
        } else {
            dA = (dA.doubleValue() > 0.0d ? 1 : (dA.doubleValue() == 0.0d ? 0 : -1)) == 0 ? null : dA;
            if (dA != null) {
                dDoubleValue = dA.doubleValue();
            } else {
                dDoubleValue = 1.0d;
            }
        }
        this.f149436c = dDoubleValue;
    }

    public static final void a(g72 g72Var, CheckBox checkBox, View view) {
        double d10 = !checkBox.isChecked() ? g72Var.f149436c : 0.0d;
        w52 w52Var = g72Var.f149435b;
        w52Var.getClass();
        w52Var.f157211a.setVolume((float) d10);
    }
}
