package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class sgh0 extends vgh0 {
    public final /* synthetic */ Method b;
    public final /* synthetic */ int c;

    public sgh0(int i, Method method) {
        this.b = method;
        this.c = i;
    }

    @Override // defpackage.vgh0
    public final <T> T a(Class<T> cls) {
        String strA = kya.a(cls);
        if (strA == null) {
            return (T) this.b.invoke(null, cls, Integer.valueOf(this.c));
        }
        jb5.a("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
        return null;
    }
}
