package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportygames.commons.chat.views.ChatActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class l87 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l87(Object obj, int i) {
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
                if (!TextUtils.isEmpty(chatActivity.L)) {
                    ha7 ha7Var = (ha7) chatActivity.a;
                    int i3 = 0;
                    if (ha7Var != null) {
                        ha7Var.W.setVisibility(0);
                    }
                    ha7 ha7Var2 = (ha7) chatActivity.a;
                    if (ha7Var2 != null) {
                        ha7Var2.F.setVisibility(8);
                    }
                    sh7 sh7VarG1 = chatActivity.G1();
                    String str = chatActivity.L;
                    String strValueOf = String.valueOf(System.currentTimeMillis());
                    str.getClass();
                    strValueOf.getClass();
                    ej5.c(o8i0.d(sh7VarG1), null, null, new gh7(sh7VarG1, str, strValueOf, null), 3);
                    chatActivity.G1().b.f(chatActivity, new v97(new z87(chatActivity, i3)));
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
