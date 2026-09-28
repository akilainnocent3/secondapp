package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class s65 extends qlr implements Function1<Boolean, lk40> {
    public final /* synthetic */ t65 a;
    public final /* synthetic */ lk40 b;
    public final /* synthetic */ lk40 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s65(t65 t65Var, lk40 lk40Var, lk40 lk40Var2) {
        super(1);
        this.a = t65Var;
        this.b = lk40Var;
        this.c = lk40Var2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final lk40 invoke(Boolean bool) {
        return bool.booleanValue() == ((Boolean) ((x5a0) this.a.b.d).getValue()).booleanValue() ? this.b : this.c;
    }
}
