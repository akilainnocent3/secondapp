package defpackage;

import com.sporty.android.common.uievent.AlertDialogCallbackType;
import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.b;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ndb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ndb(Object obj, int i) {
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
                fgb fgbVar = (fgb) obj2;
                String str = (String) obj;
                str.getClass();
                if (str.length() == 0) {
                    return Unit.a;
                }
                if (!StringsKt.M(str, "user-name:", false) || msj.a.d()) {
                    fgbVar.d1().C.j(str);
                }
                return Unit.a;
            case 1:
                uv20 uv20Var = (uv20) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                uv20Var.b = OtpData.PrimaryPhone.a((OtpData.PrimaryPhone) uv20Var.B1(), oTPResult);
                return Unit.a;
            default:
                xqj0 xqj0Var = (xqj0) obj2;
                AlertDialogCallbackType alertDialogCallbackType = (AlertDialogCallbackType) obj;
                alertDialogCallbackType.getClass();
                if (alertDialogCallbackType instanceof AlertDialogCallbackType.Negative) {
                    vtw<a> vtwVar = xqj0Var.l;
                    if (vtwVar == null) {
                        Intrinsics.n("commonUiEventFlow");
                        throw null;
                    }
                    b.c(vtwVar, snb0.WITHDRAW);
                }
                return Unit.a;
        }
    }
}
