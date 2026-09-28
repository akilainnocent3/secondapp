package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes8.dex */
public final class aq7 extends b3 {
    public final /* synthetic */ Method c;
    public final /* synthetic */ Class d;

    public aq7(Method method, Class cls) {
        super(3);
        this.c = method;
        this.d = cls;
    }

    @Override // defpackage.b3
    public final Object W() {
        return this.c.invoke(null, this.d, Object.class);
    }

    @Override // defpackage.b3
    public final String toString() {
        return this.d.getName();
    }
}
