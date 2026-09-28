package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.crashInitiated.model.response.CrashInitiatedCoeffListResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class skb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ skb(Object obj, int i) {
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
                zqy zqyVar = (zqy) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = enb.b.a[loadingState.getStatus().ordinal()];
                if (i2 == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse != null && (list = (List) hTTPResponse.getData()) != null) {
                        if (list.size() > 0) {
                            ((CrashInitiatedCoeffListResponse) list.get(0)).getHouseCoefficient();
                        }
                        ((x5a0) zqyVar.s0().C).setValue(list);
                    }
                } else if (i2 != 2 && i2 != 3) {
                    uhc.a();
                    return null;
                }
                return Unit.a;
            default:
                ((Function1) ((chp) obj2)).invoke(new yxk.a(((Boolean) obj).booleanValue()));
                return Unit.a;
        }
    }
}
