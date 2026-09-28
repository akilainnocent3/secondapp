package defpackage;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class esc {
    public final Context a;
    public final String b;
    public final wfe0.c c;
    public final lv50.d d;
    public final List<lv50.b> e;
    public final boolean f;
    public final lv50.c g;
    public final Executor h;
    public final Executor i;
    public final Intent j;
    public final boolean k;
    public final boolean l;
    public final Set<Integer> m;
    public final String n;
    public final File o;
    public final Callable<InputStream> p;
    public final List<Object> q;
    public final List<Object> r;
    public final boolean s;
    public final xp60 t;
    public final CoroutineContext u;

    public esc(Context context, String str, wfe0.c cVar, lv50.d dVar, List list, boolean z, lv50.c cVar2, Executor executor, Executor executor2, Intent intent, boolean z2, boolean z3, Set set, String str2, File file, Callable callable, List list2, List list3, boolean z4, xp60 xp60Var, CoroutineContext coroutineContext) {
        context.getClass();
        executor.getClass();
        executor2.getClass();
        this.a = context;
        this.b = str;
        this.c = cVar;
        this.d = dVar;
        this.e = list;
        this.f = z;
        this.g = cVar2;
        this.h = executor;
        this.i = executor2;
        this.j = intent;
        this.k = z2;
        this.l = z3;
        this.m = set;
        this.n = str2;
        this.o = file;
        this.p = callable;
        this.q = list2;
        this.r = list3;
        this.s = z4;
        this.t = xp60Var;
        this.u = coroutineContext;
    }
}
