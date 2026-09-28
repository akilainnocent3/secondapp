package defpackage;

import android.view.View;
import com.sportybet.plugin.realsports.betsucc.presentation.fragment.BetSuccessfulPageFragment;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ac3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ac3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                BetSuccessfulPageFragment betSuccessfulPageFragment = (BetSuccessfulPageFragment) obj;
                betSuccessfulPageFragment.c0 = BetSuccessfulPageFragment.b.c;
                u93 u93Var = betSuccessfulPageFragment.J;
                u93Var.getClass();
                ej5.c(o8i0.d(u93Var), null, null, new n93(u93Var, null), 3);
                break;
            default:
                view.getClass();
                ((u6v) obj).c.g(view);
                break;
        }
    }
}
