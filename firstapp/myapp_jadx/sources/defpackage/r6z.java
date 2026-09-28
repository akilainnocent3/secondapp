package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r6z implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r6z(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                g74 g74Var = (g74) obj;
                g74Var.getClass();
                ((Function1) obj2).invoke(new o6z.c(g74Var));
                break;
            default:
                Drawable drawable = (Drawable) obj2;
                tcf tcfVar = (tcf) obj;
                lc6 lc6VarA = tcfVar.F1().a();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (tcfVar.d() >> 32)), (int) Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L)));
                drawable.draw(i40.c(lc6VarA));
                break;
        }
        return Unit.a;
    }
}
