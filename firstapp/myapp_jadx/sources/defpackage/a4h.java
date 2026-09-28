package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class a4h {
    public static final <E> uf00<E> a(E... eArr) {
        n1a0 n1a0Var = n1a0.c;
        List listAsList = Arrays.asList(eArr);
        listAsList.getClass();
        return n1a0Var.addAll((Collection) listAsList);
    }

    public static final <T> qcn<T> b(Iterable<? extends T> iterable) {
        iterable.getClass();
        qcn<T> qcnVar = iterable instanceof qcn ? (qcn) iterable : null;
        return qcnVar == null ? f(iterable) : qcnVar;
    }

    public static final uf00 c(ruh ruhVar) {
        n1a0 n1a0Var = n1a0.c;
        n1a0Var.getClass();
        eh00 eh00VarBuilder = n1a0Var.builder();
        Iterator it = ruhVar.iterator();
        while (true) {
            ruh.a aVar = (ruh.a) it;
            if (!aVar.hasNext()) {
                return eh00VarBuilder.build();
            }
            eh00VarBuilder.add(aVar.next());
        }
    }

    public static final <K, V> scn<K, V> d(Map<K, ? extends V> map) {
        map.getClass();
        scn<K, V> scnVar = map instanceof scn ? (scn) map : null;
        if (scnVar != null) {
            return scnVar;
        }
        wf00.a aVar = map instanceof wf00.a ? (wf00.a) map : null;
        wf00<K, V> wf00VarBuild = aVar != null ? aVar.build() : null;
        if (wf00VarBuild != null) {
            return wf00VarBuild;
        }
        xf00 xf00Var = xf00.i;
        xf00Var.getClass();
        if (map.isEmpty()) {
            return xf00Var;
        }
        yf00 yf00Var = new yf00(xf00Var);
        yf00Var.putAll(map);
        return yf00Var.build();
    }

    public static final <T> ucn<T> e(Iterable<? extends T> iterable) {
        iterable.getClass();
        ucn<T> ucnVar = iterable instanceof ucn ? (ucn) iterable : null;
        if (ucnVar != null) {
            return ucnVar;
        }
        yg00.a aVar = iterable instanceof yg00.a ? (yg00.a) iterable : null;
        pg00 pg00VarBuild = aVar != null ? aVar.build() : null;
        if (pg00VarBuild != null) {
            return pg00VarBuild;
        }
        pg00 pg00Var = pg00.e;
        pg00Var.getClass();
        if (iterable instanceof Collection) {
            return pg00Var.c((Collection) iterable);
        }
        sg00 sg00VarD = pg00Var.d();
        p48.w(iterable, sg00VarD);
        return sg00VarD.build();
    }

    public static final <T> uf00<T> f(Iterable<? extends T> iterable) {
        iterable.getClass();
        uf00<T> uf00Var = iterable instanceof uf00 ? (uf00) iterable : null;
        if (uf00Var != null) {
            return uf00Var;
        }
        uf00.a aVar = iterable instanceof uf00.a ? (uf00.a) iterable : null;
        uf00<T> uf00VarBuild = aVar != null ? aVar.build() : null;
        if (uf00VarBuild != null) {
            return uf00VarBuild;
        }
        n1a0 n1a0Var = n1a0.c;
        n1a0Var.getClass();
        if (iterable instanceof Collection) {
            return n1a0Var.addAll((Collection) iterable);
        }
        eh00 eh00VarBuilder = n1a0Var.builder();
        p48.w(iterable, eh00VarBuilder);
        return eh00VarBuilder.build();
    }

    public static final <K, V> wf00<K, V> g(Map<K, ? extends V> map) {
        map.getClass();
        xf00 xf00Var = map instanceof xf00 ? (xf00) map : null;
        if (xf00Var != null) {
            return xf00Var;
        }
        yf00 yf00Var = map instanceof yf00 ? (yf00) map : null;
        wf00<K, V> wf00VarBuild = yf00Var != null ? yf00Var.build() : null;
        if (wf00VarBuild != null) {
            return wf00VarBuild;
        }
        xf00 xf00Var2 = xf00.i;
        xf00Var2.getClass();
        if (map.isEmpty()) {
            return xf00Var2;
        }
        yf00 yf00Var2 = new yf00(xf00Var2);
        yf00Var2.putAll(map);
        return yf00Var2.build();
    }

    public static final <T> yg00<T> h(Iterable<? extends T> iterable) {
        iterable.getClass();
        pg00 pg00Var = iterable instanceof pg00 ? (pg00) iterable : null;
        if (pg00Var != null) {
            return pg00Var;
        }
        sg00 sg00Var = iterable instanceof sg00 ? (sg00) iterable : null;
        pg00 pg00VarBuild = sg00Var != null ? sg00Var.build() : null;
        if (pg00VarBuild != null) {
            return pg00VarBuild;
        }
        pg00 pg00Var2 = pg00.e;
        pg00Var2.getClass();
        if (iterable instanceof Collection) {
            return pg00Var2.c((Collection) iterable);
        }
        sg00 sg00VarD = pg00Var2.d();
        p48.w(iterable, sg00VarD);
        return sg00VarD.build();
    }
}
