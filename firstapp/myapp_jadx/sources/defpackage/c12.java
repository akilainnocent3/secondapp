package defpackage;

import android.view.View;
import com.sportybet.plugin.realsports.event.BaseEventDetailMarketListAdapter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c12 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c12(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return BaseEventDetailMarketListAdapter.lambda$setFooterLayout$1((View.OnClickListener) obj);
            case 1:
                ((Function0) obj).invoke();
                return Unit.a;
            default:
                ((ytw) obj).setValue(Boolean.FALSE);
                return Unit.a;
        }
    }
}
