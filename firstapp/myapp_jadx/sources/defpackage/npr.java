package defpackage;

import androidx.compose.runtime.a;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class npr implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ npr(ku00 ku00Var, vx00 vx00Var, String str) {
        this.b = vx00Var;
        this.c = ku00Var;
        this.d = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                iqr.c((ijf0) obj5, (UiText) obj4, (Function1) obj3, (a) obj, qj40.a(1));
                break;
            default:
                vx00 vx00Var = (vx00) obj5;
                ku00 ku00Var = (ku00) obj4;
                String str = (String) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zd7.a(vx00Var, ku00Var, str, aVar, 0);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ npr(ijf0 ijf0Var, UiText uiText, Function1 function1, int i) {
        this.b = ijf0Var;
        this.c = uiText;
        this.d = function1;
    }
}
