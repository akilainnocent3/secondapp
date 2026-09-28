package defpackage;

import androidx.compose.runtime.a;
import com.sportygames.compose.chat.data.model.SendMessageRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ze7 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ze7(hh7 hh7Var, String str) {
        this.b = hh7Var;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                hh7 hh7Var = (hh7) obj4;
                String str = (String) obj3;
                String str2 = (String) obj;
                String str3 = (String) obj2;
                str2.getClass();
                str3.getClass();
                hh7Var.getClass();
                str.getClass();
                SendMessageRequest sendMessageRequest = new SendMessageRequest(str, str3, str2, null, null);
                mc80 mc80Var = (mc80) hh7Var.y.getValue();
                mc80Var.getClass();
                kzh.d(new g1i(new or60(new lc80(mc80Var, sendMessageRequest, null)), new rh7(hh7Var, null)), o8i0.d(hh7Var));
                break;
            default:
                ((Integer) obj2).getClass();
                ccf0.b((oaf0) obj4, (Function1) obj3, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ze7(oaf0 oaf0Var, Function1 function1, int i) {
        this.b = oaf0Var;
        this.c = function1;
    }
}
