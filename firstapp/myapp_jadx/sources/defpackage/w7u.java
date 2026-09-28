package defpackage;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes8.dex */
public final class w7u implements tu5<Object, Object> {
    public final tu5<Object, Object> a;
    public final String b;
    public final rdd0 c;

    public w7u(tu5<Object, Object> tu5Var, String str, rdd0 rdd0Var) {
        rdd0Var.getClass();
        this.a = tu5Var;
        this.b = str;
        this.c = rdd0Var;
    }

    @Override // defpackage.tu5
    public final Type a() {
        Type typeA = this.a.a();
        typeA.getClass();
        return typeA;
    }

    @Override // defpackage.tu5
    public final Object b(su5<Object> su5Var) {
        Object objB = this.a.b(new v7u(su5Var, this.b, this.c));
        objB.getClass();
        return objB;
    }
}
