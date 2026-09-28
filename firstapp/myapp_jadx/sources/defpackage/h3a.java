package defpackage;

import android.content.Context;
import com.sportybet.plugin.realsports.prematch.widget.LiveTogglesContainer;
import com.sportygames.crashInitiated.model.response.DetailResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h3a implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h3a(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ytw ytwVar = (ytw) obj2;
                DetailResponse detailResponse = (DetailResponse) obj;
                if (Double.parseDouble((String) ytwVar.getValue()) < detailResponse.getMaxUserCoefficient()) {
                    ytwVar.setValue(String.valueOf(detailResponse.getMaxUserCoefficient()));
                }
                return Unit.a;
            case 1:
                Function1 function1 = (Function1) obj;
                if (((e4j) obj2).b) {
                    function1.invoke(j0j.b.a);
                } else {
                    function1.invoke(j0j.c.a);
                }
                return Unit.a;
            default:
                return LiveTogglesContainer.a((Context) obj2, (LiveTogglesContainer) obj);
        }
    }
}
