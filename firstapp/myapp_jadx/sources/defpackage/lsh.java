package defpackage;

import kotlin.collections.a;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class lsh {
    public static final /* synthetic */ int a = 0;

    public static yqc a(ne80 ne80Var, h950 h950Var, j1b j1bVar, Function0 function0) {
        m2g m2gVar = m2g.a;
        try {
            System.loadLibrary("datastore_shared_counter");
            m2gVar.getClass();
            return new yqc(new skh(ne80Var, new pkw(j1bVar), function0), a.c(new lpc(m2gVar, null)), h950Var, j1bVar);
        } catch (SecurityException | UnsatisfiedLinkError unused) {
            m2gVar.getClass();
            return new yqc(new skh(ne80Var, rkh.a, function0), a.c(new lpc(m2gVar, null)), h950Var, j1bVar);
        }
    }
}
