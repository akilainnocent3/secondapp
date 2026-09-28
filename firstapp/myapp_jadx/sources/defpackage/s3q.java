package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class s3q implements Function1 {
    public final /* synthetic */ v5b a;
    public final /* synthetic */ i20 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ fkd0 d;

    public /* synthetic */ s3q(v5b v5bVar, i20 i20Var, float f, fkd0 fkd0Var) {
        this.a = v5bVar;
        this.b = i20Var;
        this.c = f;
        this.d = fkd0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ej5.c(this.a, null, null, new d4q(this.b, ((Float) obj).floatValue(), this.c, this.d, null), 3);
        return Unit.a;
    }
}
