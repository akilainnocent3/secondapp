package defpackage;

import androidx.compose.runtime.a;
import androidx.fragment.app.e;
import com.sportygames.vip.data.VipPerks;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class cws implements gaj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cws(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                e eVarRequireActivity = ((iws) obj4).requireActivity();
                eVarRequireActivity.getClass();
                ekl.b(eVarRequireActivity, (String) obj, (List) obj2, "LOAD_CODE_FROM_CODEHUB", true, zBooleanValue);
                break;
            default:
                a aVar = (a) obj2;
                ((Integer) obj3).getClass();
                ((jh0) obj).getClass();
                List<String> howItWorks = ((VipPerks) obj4).getHowItWorks();
                if (howItWorks == null) {
                    howItWorks = m2g.a;
                }
                vdi0.b(0, aVar, null, howItWorks);
                break;
        }
        return Unit.a;
    }
}
