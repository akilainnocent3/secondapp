package defpackage;

import com.sporty.android.common.uievent.AlertDialogCallbackType;
import com.sporty.android.common.uievent.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class w6d implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w6d(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ajx ajxVar = (ajx) obj;
                ajxVar.getClass();
                ajxVar.b = true;
                ajxVar.c = true;
                int i2 = fhx.v;
                ajxVar.a(fhx.a.a(((phx) obj2).b.j()).b.e);
                i220 i220Var = new i220();
                i220Var.b = true;
                Unit unit = Unit.a;
                ajxVar.f = i220Var.a;
                ajxVar.g = true;
                break;
            default:
                tjw tjwVar = (tjw) obj2;
                AlertDialogCallbackType alertDialogCallbackType = (AlertDialogCallbackType) obj;
                alertDialogCallbackType.getClass();
                if (alertDialogCallbackType instanceof AlertDialogCallbackType.Positive) {
                    b.b(tjwVar.e0);
                }
                break;
        }
        return Unit.a;
    }
}
