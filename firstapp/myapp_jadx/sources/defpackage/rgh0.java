package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class rgh0 extends vgh0 {
    public final /* synthetic */ Method b;
    public final /* synthetic */ Object c;

    public rgh0(Method method, Object obj) {
        this.b = method;
        this.c = obj;
    }

    @Override // defpackage.vgh0
    public final <T> T a(Class<T> cls) {
        String strA = kya.a(cls);
        if (strA == null) {
            return (T) this.b.invoke(this.c, cls);
        }
        jb5.a("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
        return null;
    }
}
