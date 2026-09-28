package defpackage;

import android.view.View;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportygames.commons.chat.views.ChatActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class m87 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m87(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ChatActivity chatActivity = (ChatActivity) obj2;
                int i2 = ChatActivity.B0;
                ((View) obj).getClass();
                ha7 ha7Var = (ha7) chatActivity.a;
                if (ha7Var != null) {
                    ha7Var.A.o0(0);
                }
                ha7 ha7Var2 = (ha7) chatActivity.a;
                if (ha7Var2 != null) {
                    ha7Var2.M.setVisibility(8);
                }
                break;
            default:
                jr20 jr20Var = (jr20) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                jr20Var.b = OtpData.PrimaryPhone.a((OtpData.PrimaryPhone) jr20Var.B1(), oTPResult);
                break;
        }
        return Unit.a;
    }
}
