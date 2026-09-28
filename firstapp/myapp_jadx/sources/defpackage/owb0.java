package defpackage;

import androidx.compose.ui.layout.y;
import com.sportygames.chat.remote.models.RainDetailInfoResponse;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingStateChat;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class owb0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ owb0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RainDetailInfoResponse rainDetailInfoResponse;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                q1c0 q1c0Var = (q1c0) obj2;
                LoadingStateChat loadingStateChat = (LoadingStateChat) obj;
                int i2 = q1c0.b.b[loadingStateChat.getStatus().ordinal()];
                if (i2 == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingStateChat.getData();
                    if (hTTPResponse != null && (rainDetailInfoResponse = (RainDetailInfoResponse) hTTPResponse.getData()) != null) {
                        q1c0Var.r2 = rainDetailInfoResponse;
                    }
                } else if (i2 == 2) {
                    q1c0Var.r2 = null;
                } else if (i2 != 3) {
                    uhc.a();
                    return null;
                }
                return Unit.a;
            default:
                ((y.a) obj).s((y) obj2, 0, 0, 0.0f);
                return Unit.a;
        }
    }
}
