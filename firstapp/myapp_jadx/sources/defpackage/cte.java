package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class cte extends qlr implements Function0<Unit> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ jv60 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cte(boolean z, jv60 jv60Var, String str) {
        super(0);
        this.a = z;
        this.b = jv60Var;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.a) {
            jv60 jv60Var = this.b;
            String str = this.c;
            mv60 mv60Var = jv60Var.a;
            synchronized (mv60Var.c) {
            }
        }
        return Unit.a;
    }
}
