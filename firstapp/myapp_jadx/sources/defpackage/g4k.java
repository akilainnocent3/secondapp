package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class g4k implements ptm {
    public final mum a;
    public final b5 b;

    public g4k(mum mumVar, b5 b5Var) {
        mumVar.getClass();
        b5Var.getClass();
        this.a = mumVar;
        this.b = b5Var;
    }

    @Override // defpackage.ptm
    public final Object a(String str, sy00 sy00Var) {
        Object objG = this.a.g(str, sy00Var);
        return objG == y5b.a ? objG : Unit.a;
    }

    @Override // defpackage.ptm
    public final ku00 invoke() {
        String strD;
        String nullableUserId;
        mum mumVar = this.a;
        String strJ = mumVar.j();
        if (strJ == null || (strD = mumVar.d()) == null || (nullableUserId = this.b.getNullableUserId()) == null) {
            return null;
        }
        return new ku00(strJ, strD, nullableUserId);
    }
}
