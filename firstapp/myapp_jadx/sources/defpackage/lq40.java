package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class lq40 {

    public static abstract class a {
        public static final a a;

        /* JADX INFO: renamed from: lq40$a$a, reason: collision with other inner class name */
        public class C0831a extends a {
            public final /* synthetic */ Method b;

            public C0831a(Method method) {
                this.b = method;
            }

            @Override // lq40.a
            public final boolean a(Object obj, AccessibleObject accessibleObject) {
                try {
                    return ((Boolean) this.b.invoke(accessibleObject, obj)).booleanValue();
                } catch (Exception e) {
                    jk40.a("Failed invoking canAccess", e);
                    return false;
                }
            }
        }

        public class b extends a {
            @Override // lq40.a
            public final boolean a(Object obj, AccessibleObject accessibleObject) {
                return true;
            }
        }

        static {
            a c0831a;
            if (c8p.a >= 9) {
                try {
                    c0831a = new C0831a(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
                } catch (NoSuchMethodException unused) {
                    c0831a = null;
                }
            } else {
                c0831a = null;
            }
            if (c0831a == null) {
                c0831a = new b();
            }
            a = c0831a;
        }

        public abstract boolean a(Object obj, AccessibleObject accessibleObject);
    }

    public static kq40.a a(Class cls, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kq40.a aVarA = ((kq40) it.next()).a();
            if (aVarA != kq40.a.b) {
                return aVarA;
            }
        }
        return kq40.a.a;
    }
}
