package defpackage;

import com.sportybet.plugin.realsports.home.featuredsection.FeaturedMatchPCBBView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ht3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ht3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int iQ;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                iQ = ((zpz) obj).q();
                break;
            default:
                iQ = zch0.a(((FeaturedMatchPCBBView) obj).a, 12);
                break;
        }
        return Integer.valueOf(iQ);
    }
}
