package defpackage;

import android.content.SharedPreferences;
import coil3.compose.internal.CBvK.lobGSRIlnSGJY;
import com.sportygames.pocketrocket.component.BetContainer;
import com.sportygames.pocketrocket.model.response.DetailResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m56 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m56(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((mmd) obj).getClass();
                return new iwo(((long) ycv.b(((Number) ((wd0) obj2).d()).floatValue())) << 32);
            default:
                zy10 zy10Var = (zy10) obj2;
                String str = (String) obj;
                str.getClass();
                zt50 zt50Var = zy10Var.b;
                if (zt50Var != null) {
                    BetContainer betContainer = zt50Var.z;
                    List<DetailResponse> list = zy10Var.M;
                    if (list != null) {
                        zy10Var.u0(betContainer, zy10Var.W, list.get(2), str, lobGSRIlnSGJY.xSioIHqvbVRDp);
                        SharedPreferences sharedPreferences = zy10Var.w;
                        if (sharedPreferences != null && !sharedPreferences.getBoolean("ROCKET_ONE_TAP", false)) {
                            zy10Var.f = true;
                        }
                    }
                }
                return Unit.a;
        }
    }
}
