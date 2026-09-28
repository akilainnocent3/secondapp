package defpackage;

import com.sporty.android.sportytv.ui.SportyTvFragment;

/* JADX INFO: loaded from: classes5.dex */
public final class ted0 extends cny {
    public final /* synthetic */ SportyTvFragment d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ted0(SportyTvFragment sportyTvFragment) {
        super(true);
        this.d = sportyTvFragment;
    }

    @Override // defpackage.cny
    public final void b() {
        SportyTvFragment sportyTvFragment = this.d;
        if (sportyTvFragment.Q) {
            sportyTvFragment.w0();
        } else {
            sportyTvFragment.requireActivity().finish();
        }
    }
}
