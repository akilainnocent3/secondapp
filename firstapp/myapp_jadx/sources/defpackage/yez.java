package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.crash.remote.models.MultiplierResponse;
import com.sportygames.crash.remote.models.TopBets;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class yez implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yez(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Context context = (Context) obj;
                context.getClass();
                return LayoutInflater.from(context).inflate(((rv30) obj2) instanceof rv30.b ? R.layout.sg_rain_claimed_notification_v2 : R.layout.sg_rain_notification_v2, (ViewGroup) null, false);
            default:
                qub0 qub0Var = (qub0) obj2;
                LoadingState loadingState = (LoadingState) obj;
                if (loadingState.getStatus() != Status.SUCCESS) {
                    return Unit.a;
                }
                HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                if (hTTPResponse == null) {
                    return Unit.a;
                }
                gvi gviVar = qub0Var.z;
                if (gviVar != null) {
                    gviVar.Y.N();
                }
                MultiplierResponse multiplierResponse = qub0Var.x0;
                if (multiplierResponse == null) {
                    return Unit.a;
                }
                long roundId = multiplierResponse.getRoundId();
                List list = (List) hTTPResponse.getData();
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        if (((TopBets) obj3).getRoundId() == roundId) {
                            arrayList.add(obj3);
                        }
                    }
                    ArrayList arrayList2 = arrayList.isEmpty() ? null : arrayList;
                    if (arrayList2 != null) {
                        qub0Var.g4(arrayList2, hTTPResponse.getTotal());
                        return Unit.a;
                    }
                }
                return Unit.a;
        }
    }
}
