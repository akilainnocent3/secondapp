package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.Status;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class bfb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bfb(Object obj, int i) {
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
                fgb fgbVar = (fgb) obj2;
                LoadingState loadingState = (LoadingState) obj;
                if (fgb.b.a[loadingState.getStatus().ordinal()] == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if (((hTTPResponse == null || (list = (List) hTTPResponse.getData()) == null) ? 0 : list.size()) > 0) {
                        HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState.getData();
                        List list2 = hTTPResponse2 != null ? (List) hTTPResponse2.getData() : null;
                        list2.getClass();
                        fgbVar.K0 = (ArrayList) list2;
                    }
                }
                if (loadingState.getStatus() != Status.RUNNING) {
                    fgbVar.P1 = true;
                    String str = fgbVar.Q1;
                    if (str != null) {
                        fgbVar.N0(str);
                        fgbVar.Q1 = null;
                    }
                }
                break;
            default:
                urr urrVar = (urr) obj;
                urrVar.getClass();
                ((osw) obj2).k(ycv.b(Float.intBitsToFloat((int) (urrVar.i0(0L) >> 32))));
                break;
        }
        return Unit.a;
    }
}
