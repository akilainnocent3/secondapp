package yads;

import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class v20 implements gl1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckBox f156718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProgressBar f156719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f156720c;

    public v20(CheckBox checkBox, ProgressBar progressBar, TextView textView) {
        this.f156718a = checkBox;
        this.f156719b = progressBar;
        this.f156720c = textView;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v20)) {
            return false;
        }
        v20 v20Var = (v20) obj;
        return kotlin.jvm.internal.m0.g(this.f156718a, v20Var.f156718a) && kotlin.jvm.internal.m0.g(this.f156719b, v20Var.f156719b) && kotlin.jvm.internal.m0.g(this.f156720c, v20Var.f156720c);
    }

    @Override // yads.gl1
    public final TextView getCountDownProgress() {
        return this.f156720c;
    }

    @Override // yads.gl1
    public final CheckBox getMuteControl() {
        return this.f156718a;
    }

    @Override // yads.gl1
    public final ProgressBar getVideoProgress() {
        return this.f156719b;
    }

    public final int hashCode() {
        CheckBox checkBox = this.f156718a;
        int iHashCode = (checkBox == null ? 0 : checkBox.hashCode()) * 31;
        ProgressBar progressBar = this.f156719b;
        int iHashCode2 = (iHashCode + (progressBar == null ? 0 : progressBar.hashCode())) * 31;
        TextView textView = this.f156720c;
        return iHashCode2 + (textView != null ? textView.hashCode() : 0);
    }

    public final String toString() {
        return "CustomControlsContainer(muteControl=" + this.f156718a + ", videoProgress=" + this.f156719b + ", countDownProgress=" + this.f156720c + gi.j.f86771d;
    }
}
