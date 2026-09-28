package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class asw extends qlr implements Function1<y78, y78> {
    public final /* synthetic */ kxs a;
    public final /* synthetic */ bsw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asw(kxs kxsVar, bsw bswVar) {
        super(1);
        this.a = kxsVar;
        this.b = bswVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final y78 invoke(y78 y78Var) {
        jxs jxsVar;
        y78 y78Var2 = y78Var;
        if (y78Var2 == null || (jxsVar = y78Var2.d) == null) {
            jxsVar = jxs.f;
        }
        jxs jxsVarA = null;
        jxs jxsVar2 = y78Var2 != null ? y78Var2.e : null;
        jxsVar.getClass();
        kxs kxsVar = this.a;
        kxsVar.getClass();
        int iOrdinal = kxsVar.ordinal();
        if (iOrdinal == 0) {
            jxsVarA = jxs.a(jxsVar, 6);
        } else if (iOrdinal == 1) {
            jxsVarA = jxs.a(jxsVar, 5);
        } else if (iOrdinal == 2) {
            jxsVarA = jxs.a(jxsVar, 3);
        } else {
            uhc.a();
        }
        this.b.getClass();
        return bsw.b(y78Var2, jxsVarA, jxsVar2);
    }
}
