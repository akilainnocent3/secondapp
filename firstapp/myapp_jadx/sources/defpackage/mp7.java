package defpackage;

import android.view.View;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.sportyherocompose.components.OverUnderComponent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class mp7 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mp7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                urr urrVar = (urr) obj;
                urrVar.getClass();
                ((isw) obj2).A(Float.intBitsToFloat((int) (eb9.d(urrVar) & 4294967295L)));
                return Unit.a;
            case 1:
                zqy zqyVar = (zqy) obj2;
                LoadingState loadingState = (LoadingState) obj;
                if (enb.b.a[loadingState.getStatus().ordinal()] == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if (((hTTPResponse == null || (list = (List) hTTPResponse.getData()) == null) ? 0 : list.size()) > 0) {
                        HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState.getData();
                        List list2 = hTTPResponse2 != null ? (List) hTTPResponse2.getData() : null;
                        list2.getClass();
                        zqyVar.f0 = (ArrayList) list2;
                    }
                }
                return Unit.a;
            default:
                int i2 = OverUnderComponent.e0;
                ((View) obj).getClass();
                Function1<? super Boolean, Unit> function1 = ((OverUnderComponent) obj2).O;
                if (function1 != null) {
                    function1.invoke(Boolean.FALSE);
                    return Unit.a;
                }
                Intrinsics.n("onFbgClick");
                throw null;
        }
    }
}
