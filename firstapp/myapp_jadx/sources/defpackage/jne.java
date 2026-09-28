package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jne implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jne(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function0) obj).invoke();
                return Unit.a;
            case 1:
                return Boolean.valueOf(((zy10) obj).i1());
            case 2:
                l560 l560Var = (l560) obj;
                eo80 eo80Var = l560Var.l0;
                float height = eo80Var != null ? eo80Var.m0.getHeight() : 0.0f;
                eo80 eo80Var2 = l560Var.l0;
                l560Var.O0(height, eo80Var2 != null ? eo80Var2.m0.getWidth() : 0.0f);
                return Unit.a;
            default:
                ((Function1) obj).invoke(i04.l.a);
                return Unit.a;
        }
    }
}
