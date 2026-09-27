package yads;

import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class zd2 implements ef3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ef3 f158776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ae2 f158777b;

    public zd2(ae2 ae2Var) {
        this.f158777b = ae2Var;
    }

    @Override // yads.ef3
    public final void a() {
        ef3 ef3Var = this.f158776a;
        if (ef3Var != null) {
            ef3Var.a();
        }
    }

    @Override // yads.ef3
    public final void b() {
        e72 e72Var = (e72) this.f158777b.f146776a.b();
        if (e72Var != null) {
            n52 n52Var = e72Var.f148547c;
            g72 g72Var = this.f158777b.f146778c;
            gl1 gl1Var = n52Var.f152887b;
            g72Var.getClass();
            if (gl1Var != null) {
                CheckBox muteControl = gl1Var.getMuteControl();
                if (muteControl != null) {
                    muteControl.setOnClickListener(null);
                    muteControl.setVisibility(8);
                }
                ProgressBar videoProgress = gl1Var.getVideoProgress();
                if (videoProgress != null) {
                    videoProgress.setProgress(0);
                    videoProgress.setVisibility(8);
                }
                TextView countDownProgress = gl1Var.getCountDownProgress();
                if (countDownProgress != null) {
                    countDownProgress.setText("");
                    countDownProgress.setVisibility(8);
                }
            }
        }
        ef3 ef3Var = this.f158776a;
        if (ef3Var != null) {
            ef3Var.b();
        }
    }

    @Override // yads.ef3
    public final void c() {
        e72 e72Var = (e72) this.f158777b.f146776a.b();
        if (e72Var != null) {
            this.f158777b.f146779d.a(e72Var);
        }
        ef3 ef3Var = this.f158776a;
        if (ef3Var != null) {
            ef3Var.c();
        }
    }
}
