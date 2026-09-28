package defpackage;

import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.home.featuredsection.FeaturedMatchView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class nfh implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nfh(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return o0b.b(((FeaturedMatchView) obj).a, R.color.text_color_brand_secondary_variable_type2_with_brand_tertiary);
            default:
                ((Function1) obj).invoke(nc40.a.a);
                return Unit.a;
        }
    }
}
