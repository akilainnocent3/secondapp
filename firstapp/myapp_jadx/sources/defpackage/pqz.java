package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.d0;
import androidx.recyclerview.widget.b;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class pqz<T, VH extends RecyclerView.d0> extends RecyclerView.f<VH> {
    public boolean a;
    public final v01<T> b;
    public final lyh<y78> c;

    public pqz(v540 v540Var) {
        pfd pfdVar = fse.a;
        wcl wclVar = gku.a;
        pfd pfdVar2 = fse.a;
        wclVar.getClass();
        pfdVar2.getClass();
        v01<T> v01Var = new v01<>(v540Var, new b(this), wclVar, pfdVar2);
        this.b = v01Var;
        super.setStateRestorationPolicy(RecyclerView.f.a.c);
        w540 w540Var = (w540) this;
        registerAdapterDataObserver(new mqz(w540Var));
        i(new nqz(w540Var));
        this.c = v01Var.j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T getItem(int i) {
        Object value;
        Object value2;
        Object value3;
        v01<T> v01Var = this.b;
        wwd0 wwd0Var = v01Var.e;
        do {
            try {
                value2 = wwd0Var.getValue();
                ((Boolean) value2).getClass();
            } catch (Throwable th) {
                do {
                    value = wwd0Var.getValue();
                    ((Boolean) value).getClass();
                } while (!wwd0Var.g(value, Boolean.FALSE));
                throw th;
            }
        } while (!wwd0Var.g(value2, Boolean.TRUE));
        v01Var.f = i;
        mi10<T> mi10Var = v01Var.g.get();
        T t = mi10Var != null ? (T) g9e0.d(mi10Var, i) : (T) v01Var.h.a(i);
        do {
            value3 = wwd0Var.getValue();
            ((Boolean) value3).getClass();
        } while (!wwd0Var.g(value3, Boolean.FALSE));
        return t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        v01<T> v01Var = this.b;
        mi10<T> mi10Var = v01Var.g.get();
        return mi10Var != null ? mi10Var.a() : v01Var.h.d.a();
    }

    public final void i(Function1<? super y78, Unit> function1) {
        v01<T> v01Var = this.b;
        v01Var.getClass();
        AtomicReference<Function1<y78, Unit>> atomicReference = v01Var.k;
        if (atomicReference.get() == null) {
            p01 p01Var = v01Var.m;
            p01Var.getClass();
            atomicReference.set(p01Var);
            t01 t01Var = v01Var.h;
            t01Var.getClass();
            bsw bswVar = t01Var.e;
            bswVar.getClass();
            bswVar.a.add(p01Var);
            y78 y78Var = (y78) bswVar.b.getValue();
            if (y78Var != null) {
                p01Var.invoke(y78Var);
            }
        }
        v01Var.l.add(function1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable ids are unsupported on PagingDataAdapter.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void setStateRestorationPolicy(RecyclerView.f.a aVar) {
        aVar.getClass();
        this.a = true;
        super.setStateRestorationPolicy(aVar);
    }
}
