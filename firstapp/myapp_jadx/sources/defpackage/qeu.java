package defpackage;

import androidx.compose.runtime.a;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qeu implements Function2 {
    public final /* synthetic */ int a = 0;

    public /* synthetic */ qeu() {
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                sdu sduVar = (sdu) obj;
                UiText uiText = (UiText) obj2;
                sduVar.getClass();
                if (uiText == null) {
                    uiText = vch0.a;
                } else {
                    StringUiText stringUiText = vch0.a;
                }
                return sdu.a(sduVar, null, null, null, null, null, null, uiText, null, null, null, null, null, null, null, null, false, 130943);
            default:
                ((Integer) obj2).getClass();
                qd70.a(qj40.a(1), (a) obj);
                return Unit.a;
        }
    }

    public /* synthetic */ qeu(int i) {
    }
}
