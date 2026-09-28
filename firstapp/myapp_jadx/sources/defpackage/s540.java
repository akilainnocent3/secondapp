package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class s540 implements Function1 {
    public final /* synthetic */ w540 a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        int iIntValue = ((Integer) obj).intValue();
        w540 w540Var = this.a;
        t640 t640VarJ = w540.j(w540Var, iIntValue);
        String str = t640VarJ != null ? t640VarJ.a : null;
        t640 t640VarJ2 = w540.j(w540Var, iIntValue);
        if (t640VarJ2 == null || t640VarJ2.h || str == null) {
            z = false;
        } else {
            w540Var.f.invoke(str);
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
