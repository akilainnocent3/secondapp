package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class tgh0 extends vgh0 {
    public final /* synthetic */ Method b;

    public tgh0(Method method) {
        this.b = method;
    }

    @Override // defpackage.vgh0
    public final <T> T a(Class<T> cls) {
        String strA = kya.a(cls);
        if (strA == null) {
            return (T) this.b.invoke(null, cls, Object.class);
        }
        jb5.a("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
        return null;
    }
}
