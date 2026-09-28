package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nj0 {
    public static final /* synthetic */ int a = 0;

    public static final mj0 a(mj0 mj0Var) {
        mj0 mj0VarC = mj0Var.c();
        int iB = mj0VarC.b();
        for (int i = 0; i < iB; i++) {
            mj0VarC.e(i, mj0Var.a(i));
        }
        return mj0VarC;
    }

    public static final a160 b(mzo mzoVar) {
        Object objG = mzoVar.g();
        if (objG instanceof a160) {
            return (a160) objG;
        }
        return null;
    }

    public static final float c(a160 a160Var) {
        if (a160Var != null) {
            return a160Var.a;
        }
        return 0.0f;
    }
}
