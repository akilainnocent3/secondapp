package defpackage;

import androidx.compose.foundation.lazy.layout.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class mur extends b<jur> implements lvr {
    public static final x3d d = new x3d(1);
    public final rvr a = new rvr(this);
    public final rsw<jur> b = new rsw<>();
    public boolean c;

    public mur(Function1<? super lvr, Unit> function1) {
        function1.invoke(this);
    }

    @Override // defpackage.lvr
    public final void a(final cdj cdjVar, op8 op8Var) {
        this.b.a(1, new jur(null, new Function2() { // from class: kur
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                ((Integer) obj2).getClass();
                return (s7l) cdjVar.invoke((vur) obj);
            }
        }, new vg4(1), new op8(-291643851, new lur(op8Var), true)));
        this.c = true;
    }

    @Override // defpackage.lvr
    public final void c(int i, Function1 function1, Function1 function2, op8 op8Var) {
        this.b.a(i, new jur(function1, d, function2, op8Var));
    }

    @Override // androidx.compose.foundation.lazy.layout.b
    public final rsw j() {
        return this.b;
    }
}
