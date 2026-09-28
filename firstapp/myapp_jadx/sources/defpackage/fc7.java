package defpackage;

import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class fc7 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ fc7(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                qn70 qn70Var = (qn70) obj;
                qn70Var.getClass();
                ((wrz) obj2).getClass();
                return new msx((hxy) qn70Var.a(jq40.a(hxy.class), null, null));
            default:
                vjb0 vjb0Var = (vjb0) obj;
                UiText uiText = (UiText) obj2;
                vjb0Var.getClass();
                if (uiText == null) {
                    uiText = vch0.a;
                } else {
                    StringUiText stringUiText = vch0.a;
                }
                return vjb0.a(vjb0Var, null, null, null, null, uiText, null, null, null, null, false, 1007);
        }
    }
}
