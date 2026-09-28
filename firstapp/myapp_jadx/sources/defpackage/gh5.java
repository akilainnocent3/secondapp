package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.feature.playTimeControlDialog.PlayTimeControlDialogActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gh5 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gh5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                zs.b bVar = (zs.b) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    UiText uiText = bVar.d;
                    if (uiText == null) {
                        aVar.N(66094811);
                        aVar.H();
                    } else {
                        aVar.N(66094812);
                        lkf0.d(uiText.g((Context) aVar.O(AndroidCompositionLocals_androidKt.b)), null, syj.a(0L, 0L, 0L, null, null, aVar, 31).e.b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar.O(kjb0.a)).j, aVar, 0, 0, 131066);
                        aVar.H();
                    }
                } else {
                    aVar.G();
                }
                break;
            default:
                PlayTimeControlDialogActivity playTimeControlDialogActivity = (PlayTimeControlDialogActivity) obj3;
                a aVar2 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i3 = PlayTimeControlDialogActivity.c;
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    or0.a(null, false, false, null, pp8.b(-1406510755, new n1j(playTimeControlDialogActivity, i2), aVar2), aVar2, 24576);
                } else {
                    aVar2.G();
                }
                break;
        }
        return Unit.a;
    }
}
