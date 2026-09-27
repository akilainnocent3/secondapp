package yads;

import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class qn3 implements gl1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y12 f154531a;

    public qn3(y12 y12Var) {
        this.f154531a = y12Var;
    }

    @Override // yads.gl1
    public final TextView getCountDownProgress() {
        return null;
    }

    @Override // yads.gl1
    public final CheckBox getMuteControl() {
        lm2 lm2Var = this.f154531a.f158098c;
        ns.o oVar = y12.f158095g[2];
        return (CheckBox) lm2Var.f152056a.get();
    }

    @Override // yads.gl1
    public final ProgressBar getVideoProgress() {
        lm2 lm2Var = this.f154531a.f158099d;
        ns.o oVar = y12.f158095g[3];
        return (ProgressBar) lm2Var.f152056a.get();
    }
}
