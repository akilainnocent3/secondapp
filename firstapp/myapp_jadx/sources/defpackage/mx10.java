package defpackage;

import android.content.SharedPreferences;
import com.sportygames.pocketrocket.component.BetContainer;
import com.sportygames.pocketrocket.model.response.DetailResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class mx10 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mx10(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                zy10 zy10Var = (zy10) obj2;
                String str = (String) obj;
                str.getClass();
                zt50 zt50Var = zy10Var.b;
                if (zt50Var != null) {
                    BetContainer betContainer = zt50Var.S;
                    List<DetailResponse> list = zy10Var.M;
                    if (list != null) {
                        zy10Var.u0(betContainer, zy10Var.S, list.get(0), str, "RED");
                        SharedPreferences sharedPreferences = zy10Var.w;
                        if (sharedPreferences != null && !sharedPreferences.getBoolean("ROCKET_ONE_TAP", false)) {
                            zy10Var.e = true;
                        }
                    }
                }
                break;
            default:
                j7z.b bVar = (j7z.b) obj;
                bVar.getClass();
                wwd0 wwd0Var = ((goi0) obj2).e;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, e6z.a((e6z) value, null, null, null, null, null, bVar, null, null, null, null, false, 2015)));
                break;
        }
        return Unit.a;
    }
}
