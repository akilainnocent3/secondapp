package yads;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class l03 implements qf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k03 f151801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gg3 f151802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f151803c;

    public /* synthetic */ l03(a91 a91Var, ua1 ua1Var) {
        this(new k03(a91Var), ua1Var.c());
    }

    @Override // yads.qf3
    public final void a(long j10, long j11) {
        gg3 gg3Var;
        wd3 adUiElements;
        gq0 gq0VarA;
        wd3 adUiElements2;
        wd3 adUiElements3;
        gq0 gq0VarA2;
        gq0 gq0VarA3;
        if (this.f151803c || (gg3Var = this.f151802b) == null) {
            return;
        }
        long j12 = gg3Var.f149608a;
        if (j11 < j12) {
            k03 k03Var = this.f151801a;
            z81 z81Var = k03Var.f151352a.f146706a;
            if (z81Var == null || (gq0VarA = z81Var.a()) == null) {
                adUiElements = null;
            } else {
                k03Var.f151353b.getClass();
                adUiElements = gq0VarA.getAdUiElements();
            }
            TextView textView = adUiElements != null ? adUiElements.f157324n : null;
            int i10 = ((int) ((j12 - j11) / ((long) 1000))) + 1;
            if (textView != null) {
                textView.setText(String.valueOf(i10));
                textView.setVisibility(0);
                return;
            }
            return;
        }
        k03 k03Var2 = this.f151801a;
        z81 z81Var2 = k03Var2.f151352a.f146706a;
        if (z81Var2 == null || (gq0VarA3 = z81Var2.a()) == null) {
            adUiElements2 = null;
        } else {
            k03Var2.f151353b.getClass();
            adUiElements2 = gq0VarA3.getAdUiElements();
        }
        TextView textView2 = adUiElements2 != null ? adUiElements2.f157324n : null;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        z81 z81Var3 = k03Var2.f151352a.f146706a;
        if (z81Var3 == null || (gq0VarA2 = z81Var3.a()) == null) {
            adUiElements3 = null;
        } else {
            k03Var2.f151353b.getClass();
            adUiElements3 = gq0VarA2.getAdUiElements();
        }
        View view = adUiElements3 != null ? adUiElements3.f157316f : null;
        if (view != null) {
            view.setVisibility(0);
            view.setEnabled(true);
        }
        this.f151803c = true;
    }

    public l03(k03 k03Var, gg3 gg3Var) {
        this.f151801a = k03Var;
        this.f151802b = gg3Var;
    }
}
