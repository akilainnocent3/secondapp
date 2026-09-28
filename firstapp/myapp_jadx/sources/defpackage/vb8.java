package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vb8 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ vb8(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                pb80 pb80Var = (pb80) obj;
                pb80Var.getClass();
                mb80.a(pb80Var);
                return Unit.a;
            default:
                String str = (String) obj;
                str.getClass();
                return c.q(StringsKt.t0(str).toString(), '-', ':');
        }
    }
}
