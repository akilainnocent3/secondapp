package defpackage;

import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class fg20 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fg20(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                tjd0 tjd0Var = ((lg20) obj).a;
                return b.k(tjd0Var.d, tjd0Var.f, tjd0Var.i, tjd0Var.c);
            default:
                ((b8b0) obj).s0();
                return Unit.a;
        }
    }
}
