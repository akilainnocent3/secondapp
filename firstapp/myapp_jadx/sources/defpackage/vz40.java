package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vz40 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vz40(s050 s050Var, int i) {
        this.a = 0;
        this.b = s050Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                j050.e((s050) obj3, (a) obj, qj40.a(1));
                break;
            case 1:
                UiText uiText = (UiText) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    uiText.getClass();
                    lkf0.d(uiText.g((Context) aVar.O(AndroidCompositionLocals_androidKt.b)), null, syj.a(0L, 0L, 0L, null, null, aVar, 31).e.b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar.O(kjb0.a)).j, aVar, 0, 0, 131066);
                } else {
                    aVar.G();
                }
                break;
            default:
                Function0 function0 = (Function0) obj3;
                a aVar2 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (aVar2.q(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    odd0.b(0, aVar2, null, cb40.a(R.string.unique_codes__about_what_is_unique_booking_code_title, new Object[0], aVar2), function0);
                } else {
                    aVar2.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ vz40(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
