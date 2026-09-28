package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class jg4 extends qlr implements Function1<a7l, Unit> {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ qx80 d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg4(float f, float f2, int i, qx80 qx80Var, boolean z) {
        super(1);
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = qx80Var;
        this.e = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(a7l a7lVar) {
        a7l a7lVar2 = a7lVar;
        float fC1 = a7lVar2.C1(this.a);
        float fC2 = a7lVar2.C1(this.b);
        a7lVar2.v0((fC1 <= 0.0f || fC2 <= 0.0f) ? null : new hg4(this.c, fC1, fC2));
        qx80 qx80Var = this.d;
        if (qx80Var == null) {
            qx80Var = zk40.a;
        }
        a7lVar2.A1(qx80Var);
        a7lVar2.l(this.e);
        return Unit.a;
    }
}
