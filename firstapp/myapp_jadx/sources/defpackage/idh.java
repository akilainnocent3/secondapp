package defpackage;

import android.content.Context;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.home.featuredsection.FeaturedContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class idh implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ idh(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = FeaturedContainer.u0;
                return Integer.valueOf(((Context) obj).getResources().getDimensionPixelSize(R.dimen.featured_match_padding_start_small));
            default:
                ((ytw) obj).setValue(Boolean.TRUE);
                return Unit.a;
        }
    }
}
