package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public class y8h0 {
    public static Collection a(Object obj) {
        if ((obj instanceof dhp) && !(obj instanceof ehp)) {
            f(obj, "kotlin.collections.MutableCollection");
            throw null;
        }
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            Intrinsics.j(e, y8h0.class.getName());
            throw e;
        }
    }

    public static List b(Object obj) {
        if ((obj instanceof dhp) && !(obj instanceof fhp)) {
            f(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            Intrinsics.j(e, y8h0.class.getName());
            throw e;
        }
    }

    public static Map c(Object obj) {
        if ((obj instanceof dhp) && !(obj instanceof ghp)) {
            f(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            Intrinsics.j(e, y8h0.class.getName());
            throw e;
        }
    }

    public static void d(int i, Object obj) {
        if (obj == null || e(i, obj)) {
            return;
        }
        f(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static boolean e(int i, Object obj) {
        int arity;
        if (obj instanceof haj) {
            if (obj instanceof qaj) {
                arity = ((qaj) obj).getArity();
            } else if (obj instanceof Function0) {
                arity = 0;
            } else if (obj instanceof Function1) {
                arity = 1;
            } else if (obj instanceof Function2) {
                arity = 2;
            } else if (obj instanceof gaj) {
                arity = 3;
            } else if (obj instanceof iaj) {
                arity = 4;
            } else if (obj instanceof jaj) {
                arity = 5;
            } else if (obj instanceof kaj) {
                arity = 6;
            } else if (obj instanceof laj) {
                arity = 7;
            } else if (obj instanceof maj) {
                arity = 8;
            } else if (obj instanceof naj) {
                arity = 9;
            } else if (obj instanceof r9j) {
                arity = 10;
            } else if (obj instanceof s9j) {
                arity = 11;
            } else if (obj instanceof t9j) {
                arity = 12;
            } else if (obj instanceof u9j) {
                arity = 13;
            } else if (obj instanceof v9j) {
                arity = 14;
            } else if (obj instanceof w9j) {
                arity = 15;
            } else if (obj instanceof x9j) {
                arity = 16;
            } else if (obj instanceof y9j) {
                arity = 17;
            } else if (obj instanceof z9j) {
                arity = 18;
            } else if (obj instanceof aaj) {
                arity = 19;
            } else if (obj instanceof caj) {
                arity = 20;
            } else if (obj instanceof daj) {
                arity = 21;
            } else {
                arity = obj instanceof eaj ? 22 : -1;
            }
            if (arity == i) {
                return true;
            }
        }
        return false;
    }

    public static void f(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(tug.a(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        Intrinsics.j(classCastException, y8h0.class.getName());
        throw classCastException;
    }
}
