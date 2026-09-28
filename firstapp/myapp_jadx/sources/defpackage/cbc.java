package defpackage;

import com.sporty.android.common.uievent.AlertDialogCallbackType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cbc implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cbc(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                urr urrVar = (urr) obj;
                urrVar.getClass();
                ((Function1) obj2).invoke(Integer.valueOf((int) (urrVar.a() & 4294967295L)));
                break;
            default:
                rhv rhvVar = (rhv) obj2;
                AlertDialogCallbackType alertDialogCallbackType = (AlertDialogCallbackType) obj;
                alertDialogCallbackType.getClass();
                if (alertDialogCallbackType instanceof AlertDialogCallbackType.Positive) {
                    rhvVar.N.a(Unit.a);
                    rhvVar.b.c.logout();
                }
                break;
        }
        return Unit.a;
    }
}
