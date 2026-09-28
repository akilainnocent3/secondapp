package defpackage;

import com.sporty.android.common.uievent.AlertDialogCallbackType;
import com.sporty.android.common.uievent.b;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ijw implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ijw(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                tjw tjwVar = (tjw) obj2;
                AlertDialogCallbackType alertDialogCallbackType = (AlertDialogCallbackType) obj;
                alertDialogCallbackType.getClass();
                if (alertDialogCallbackType instanceof AlertDialogCallbackType.Positive) {
                    b.b(tjwVar.e0);
                }
                break;
            default:
                m410 m410Var = (m410) obj2;
                String str = (String) obj;
                str.getClass();
                ixi ixiVar = (ixi) m410Var.b;
                if (ixiVar != null) {
                    ixiVar.X.setVisibility(0);
                }
                ixi ixiVar2 = (ixi) m410Var.b;
                if (ixiVar2 != null) {
                    ixiVar2.X.setMessageandBG(R.color.error_toast, str);
                }
                break;
        }
        return Unit.a;
    }
}
