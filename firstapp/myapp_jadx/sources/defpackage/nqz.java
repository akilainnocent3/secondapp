package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class nqz implements Function1<y78, Unit> {
    public boolean a = true;
    public final /* synthetic */ w540 b;

    public nqz(w540 w540Var) {
        this.b = w540Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(y78 y78Var) {
        Function1<y78, Unit> function1;
        y78 y78Var2 = y78Var;
        y78Var2.getClass();
        if (this.a) {
            this.a = false;
        } else if (y78Var2.d.a instanceof hxs.c) {
            w540 w540Var = this.b;
            if (w540Var.getStateRestorationPolicy() == RecyclerView.f.a.c && !w540Var.a) {
                w540Var.setStateRestorationPolicy(RecyclerView.f.a.a);
            }
            v01<T> v01Var = w540Var.b;
            v01Var.getClass();
            CopyOnWriteArrayList<Function1<y78, Unit>> copyOnWriteArrayList = v01Var.l;
            copyOnWriteArrayList.remove(this);
            if (copyOnWriteArrayList.isEmpty() && (function1 = v01Var.k.get()) != null) {
                t01 t01Var = v01Var.h;
                t01Var.getClass();
                bsw bswVar = t01Var.e;
                bswVar.getClass();
                bswVar.a.remove(function1);
            }
        }
        return Unit.a;
    }
}
