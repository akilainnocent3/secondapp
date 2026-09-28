package defpackage;

import com.google.protobuf.Reader;

/* JADX INFO: loaded from: classes.dex */
public final class ls5<T> {
    public final puh<T> a;
    public final b390 b;
    public final yde0 c;
    public final jvd0 d;
    public final or60 e;

    public ls5(lyh lyhVar, et7 et7Var) {
        lyhVar.getClass();
        this.a = new puh<>();
        b390 b390VarA = d390.a(1, Reader.READ_DONE, pb5.a);
        this.b = b390VarA;
        this.c = new yde0(b390VarA, new ks5(this, null));
        jvd0 jvd0VarC = ej5.c(et7Var, null, a6b.b, new is5(lyhVar, this, null), 1);
        jvd0VarC.invokeOnCompletion(new js5(this));
        this.d = jvd0VarC;
        this.e = new or60(new hs5(this, null));
    }
}
