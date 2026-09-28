package defpackage;

import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class alf0 implements Function1 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        jlf0 jlf0VarB;
        ora0 ora0Var;
        nk0.d dVar = (nk0.d) obj;
        T t = dVar.a;
        if (!(t instanceof rfs) || (jlf0VarB = ((rfs) t).b()) == null || (jlf0VarB.a == null && jlf0VarB.b == null && jlf0VarB.c == null && jlf0VarB.d == null)) {
            return b.f(dVar);
        }
        T t2 = dVar.a;
        t2.getClass();
        jlf0 jlf0VarB2 = ((rfs) t2).b();
        if (jlf0VarB2 == null || (ora0Var = jlf0VarB2.a) == null) {
            ora0Var = new ora0(0L, 0L, (t9i) null, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        }
        return b.f(dVar, new nk0.d(dVar.b, dVar.c, ora0Var));
    }
}
