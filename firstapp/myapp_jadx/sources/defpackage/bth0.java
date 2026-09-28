package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class bth0<T> extends psa0<T> {
    public final T a;
    public final String b;
    public final psa0.a c;
    public final r80 d;

    /* JADX WARN: Multi-variable type inference failed */
    public bth0(Object obj, psa0.a aVar, r80 r80Var) {
        aVar.getClass();
        this.a = obj;
        this.b = "wh90";
        this.c = aVar;
        this.d = r80Var;
    }

    @Override // defpackage.psa0
    public final T a() {
        return this.a;
    }

    @Override // defpackage.psa0
    public final psa0<T> b(String str, Function1<? super T, Boolean> function1) {
        function1.getClass();
        T t = this.a;
        if (function1.invoke(t).booleanValue()) {
            return this;
        }
        return new j9h(t, this.b, str, this.d, this.c);
    }
}
