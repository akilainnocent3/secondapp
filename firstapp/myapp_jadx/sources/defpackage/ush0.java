package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ush0 {

    public static final class a implements Function1 {
        public static final a a = new a();

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return null;
        }
    }

    public static final tcg a(nan nanVar, Throwable th) {
        u7n u7nVarInvoke;
        if (th instanceof i5y) {
            Function1<nan, u7n> function1 = nanVar.p;
            nan.b bVar = nanVar.v;
            u7nVarInvoke = function1.invoke(nanVar);
            if (u7nVarInvoke == null) {
                u7nVarInvoke = bVar.j.invoke(nanVar);
            }
            if (u7nVarInvoke == null && (u7nVarInvoke = nanVar.o.invoke(nanVar)) == null) {
                u7nVarInvoke = bVar.i.invoke(nanVar);
            }
        } else {
            u7nVarInvoke = nanVar.o.invoke(nanVar);
            if (u7nVarInvoke == null) {
                u7nVarInvoke = nanVar.v.i.invoke(nanVar);
            }
        }
        return new tcg(u7nVarInvoke, nanVar, th);
    }
}
