package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r540 implements Function1 {
    public final /* synthetic */ w540 a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        int iIntValue = ((Integer) obj).intValue();
        w540 w540Var = this.a;
        t640 t640VarJ = w540.j(w540Var, iIntValue);
        if (t640VarJ == null || (str = t640VarJ.a) == null) {
            return Unit.a;
        }
        t640 t640VarJ2 = w540.j(w540Var, iIntValue);
        if (t640VarJ2 == null || !t640VarJ2.h) {
            w540Var.e.invoke(str);
        } else {
            w540Var.i.invoke(str);
        }
        return Unit.a;
    }
}
