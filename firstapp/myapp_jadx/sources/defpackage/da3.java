package defpackage;

import android.view.View;
import com.sportybet.plugin.jackpot.data.JackpotElement;
import com.sportybet.plugin.realsports.betsucc.presentation.fragment.BetSuccessfulPageFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class da3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ da3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                yrh0.e(((BetSuccessfulPageFragment) obj).Q.shareCode);
                break;
            default:
                sh8.c().c(er30.d + sa8.a(((JackpotElement) obj).eventId) + "&h2h=1", mll0.a("title", "Statistics"));
                break;
        }
    }
}
