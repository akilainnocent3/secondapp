package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class zrw extends qlr implements Function1<y78, y78> {
    public final /* synthetic */ jxs a;
    public final /* synthetic */ jxs b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zrw(bsw bswVar, jxs jxsVar, jxs jxsVar2) {
        super(1);
        this.a = jxsVar;
        this.b = jxsVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final y78 invoke(y78 y78Var) {
        return bsw.b(y78Var, this.a, this.b);
    }
}
