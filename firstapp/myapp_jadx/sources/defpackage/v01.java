package defpackage;

import androidx.recyclerview.widget.b;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class v01<T> {
    public final v540 a;
    public final b b;
    public final CoroutineContext c;
    public final CoroutineContext d;
    public int f;
    public final t01 h;
    public final AtomicInteger i;
    public final lyh<y78> j;
    public final AtomicReference<Function1<y78, Unit>> k;
    public final CopyOnWriteArrayList<Function1<y78, Unit>> l;
    public final p01 m;
    public final mpe0 n;
    public final o01 o;
    public final wwd0 e = xwd0.a(Boolean.FALSE);
    public final AtomicReference<mi10<T>> g = new AtomicReference<>(null);

    public v01(v540 v540Var, b bVar, CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        this.a = v540Var;
        this.b = bVar;
        this.c = coroutineContext;
        this.d = coroutineContext2;
        t01 t01Var = new t01(this, coroutineContext);
        this.h = t01Var;
        this.i = new AtomicInteger(0);
        or60 or60Var = new or60(new u01(ozh.b(new f1i(t01Var.k), -1, 2), null, this));
        pfd pfdVar = fse.a;
        this.j = ozh.c(or60Var, gku.a);
        this.k = new AtomicReference<>(null);
        this.l = new CopyOnWriteArrayList<>();
        this.m = new p01(this);
        this.n = hwr.b(n01.a);
        this.o = new o01(this);
    }
}
