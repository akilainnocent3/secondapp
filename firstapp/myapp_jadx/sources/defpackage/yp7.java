package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes8.dex */
public final class yp7 extends b3 {
    public final /* synthetic */ Method c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Class e;

    public yp7(Method method, Object obj, Class cls) {
        super(3);
        this.c = method;
        this.d = obj;
        this.e = cls;
    }

    @Override // defpackage.b3
    public final Object W() {
        return this.c.invoke(this.d, this.e);
    }

    @Override // defpackage.b3
    public final String toString() {
        return this.e.getName();
    }
}
