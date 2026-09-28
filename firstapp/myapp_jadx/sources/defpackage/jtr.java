package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import com.sportybet.plugin.realsports.betslip.simulate.SimulateAutoBetPanel;

/* JADX INFO: loaded from: classes7.dex */
public final class jtr implements g6i0 {
    public final SimulateAutoBetPanel a;
    public final AppCompatImageButton b;
    public final AppCompatImageButton c;
    public final TextView d;

    public jtr(SimulateAutoBetPanel simulateAutoBetPanel, AppCompatImageButton appCompatImageButton, AppCompatImageButton appCompatImageButton2, AppCompatImageView appCompatImageView, TextView textView) {
        this.a = simulateAutoBetPanel;
        this.b = appCompatImageButton;
        this.c = appCompatImageButton2;
        this.d = textView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
