package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class p90 extends qlr implements Function1<v5b, emn> {
    public final /* synthetic */ mk10 a;
    public final /* synthetic */ r90 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p90(mk10 mk10Var, r90 r90Var) {
        super(1);
        this.a = mk10Var;
        this.b = r90Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final emn invoke(v5b v5bVar) {
        return new emn(this.a, new o90(this.b));
    }
}
