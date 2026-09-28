package defpackage;

import com.sportybet.android.bookingcode.presentation.activity.HighLiabilityCodeActivity;

/* JADX INFO: loaded from: classes5.dex */
public final class vjl extends cny {
    public final /* synthetic */ HighLiabilityCodeActivity d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vjl(HighLiabilityCodeActivity highLiabilityCodeActivity) {
        super(true);
        this.d = highLiabilityCodeActivity;
    }

    @Override // defpackage.cny
    public final void b() {
        int i = HighLiabilityCodeActivity.y;
        HighLiabilityCodeActivity highLiabilityCodeActivity = this.d;
        if (!(highLiabilityCodeActivity.z1() instanceof l9s)) {
            highLiabilityCodeActivity.finish();
            return;
        }
        gkl gklVarA1 = highLiabilityCodeActivity.A1();
        gklVarA1.y1(null, ((k2a0) gklVarA1.i.getValue()).a);
        highLiabilityCodeActivity.B1();
    }
}
