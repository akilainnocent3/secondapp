package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class u28 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u28(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                r28 r28Var = (r28) obj2;
                a7l a7lVar = (a7l) obj;
                a7lVar.getClass();
                float f = r28Var.b;
                a7lVar.k(f);
                a7lVar.v(f);
                a7lVar.b(r28Var.c);
                break;
            default:
                ((View) obj).getClass();
                kn1 kn1VarF1 = ((q1c0) obj2).f1();
                ej5.c(o8i0.d(kn1VarF1), null, null, new on1(kn1VarF1, null), 3);
                break;
        }
        return Unit.a;
    }
}
