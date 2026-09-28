package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class bkl0 {
    public static final zjl0 a(Object obj, Object obj2) {
        zjl0 zjl0VarB = (zjl0) obj;
        zjl0 zjl0Var = (zjl0) obj2;
        if (!zjl0Var.isEmpty()) {
            if (!zjl0VarB.a) {
                zjl0VarB = zjl0VarB.b();
            }
            zjl0VarB.d();
            if (!zjl0Var.isEmpty()) {
                zjl0VarB.putAll(zjl0Var);
            }
        }
        return zjl0VarB;
    }
}
