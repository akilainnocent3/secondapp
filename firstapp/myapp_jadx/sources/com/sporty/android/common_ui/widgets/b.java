package com.sporty.android.common_ui.widgets;

import android.view.View;
import com.sportybet.plugin.realsports.betsucc.presentation.fragment.BetSuccessfulPageFragment;
import defpackage.ej5;
import defpackage.n93;
import defpackage.o8i0;
import defpackage.u93;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements View.OnClickListener {
    public final /* synthetic */ GenericPairButton a;

    public b(GenericPairButton genericPairButton) {
        this.a = genericPairButton;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        GenericPairButton.a aVar = this.a.H;
        if (aVar != null) {
            BetSuccessfulPageFragment betSuccessfulPageFragment = ((com.sportybet.plugin.realsports.betsucc.presentation.fragment.a) aVar).a;
            betSuccessfulPageFragment.c0 = BetSuccessfulPageFragment.b.a;
            u93 u93Var = betSuccessfulPageFragment.J;
            u93Var.getClass();
            ej5.c(o8i0.d(u93Var), null, null, new n93(u93Var, null), 3);
        }
    }
}
