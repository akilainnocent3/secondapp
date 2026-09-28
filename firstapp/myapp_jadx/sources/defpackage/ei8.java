package defpackage;

import com.sporty.android.common.uievent.CustomAlertDialogCallbackType;
import com.sporty.android.core.model.MyLog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class ei8 implements Function1<CustomAlertDialogCallbackType, Unit> {
    public final /* synthetic */ bc6 a;

    public ei8(bc6 bc6Var) {
        this.a = bc6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(CustomAlertDialogCallbackType customAlertDialogCallbackType) {
        CustomAlertDialogCallbackType customAlertDialogCallbackType2 = customAlertDialogCallbackType;
        customAlertDialogCallbackType2.getClass();
        bc6 bc6Var = this.a;
        if (bc6Var.p() instanceof bzx) {
            zi50.a aVar = zi50.b;
            bc6Var.resumeWith(customAlertDialogCallbackType2);
        } else {
            itf0.a aVar2 = itf0.a;
            aVar2.q(MyLog.TAG_COMMON);
            aVar2.n("Continuation not active, resume not perform.", new Object[0]);
        }
        return Unit.a;
    }
}
