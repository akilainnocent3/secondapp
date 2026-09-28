package defpackage;

import androidx.compose.ui.layout.y;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class x230 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x230(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        Object value3;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                y yVar = (y) obj2;
                y.a aVar = (y.a) obj;
                aVar.getClass();
                if (yVar != null) {
                    y.a.A(aVar, yVar, (-yVar.a) / 2, 0);
                }
                return Unit.a;
            default:
                LoadingState loadingState = (LoadingState) obj;
                loadingState.getClass();
                wwd0 wwd0Var = ((fpb0) obj2).h.a;
                int i2 = fpb0.a.a[loadingState.getStatus().ordinal()];
                if (i2 == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    List list = hTTPResponse != null ? (List) hTTPResponse.getData() : null;
                    if (list == null || list.isEmpty()) {
                        do {
                            value = wwd0Var.getValue();
                        } while (!wwd0Var.g(value, xqb0.a((xqb0) value, wqb0.c, vqb0.b.a, null, 4)));
                    } else {
                        do {
                            value2 = wwd0Var.getValue();
                        } while (!wwd0Var.g(value2, xqb0.a((xqb0) value2, wqb0.c, list.isEmpty() ? vqb0.b.a : new vqb0.f(list), null, 4)));
                    }
                } else if (i2 == 2) {
                    do {
                        value3 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value3, xqb0.a((xqb0) value3, wqb0.c, vqb0.b.a, null, 4)));
                } else if (i2 != 3) {
                    uhc.a();
                    return null;
                }
                return Unit.a;
        }
    }
}
