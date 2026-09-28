package defpackage;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface hoa {

    public static abstract class a<T> {
        public static wg1 a(Class cls, String str) {
            return new wg1(str, cls, null);
        }

        public abstract String b();

        public abstract Object c();

        public abstract Class<T> d();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        public static final /* synthetic */ b[] e;

        static {
            b bVar = new b("ALWAYS_OVERRIDE", 0);
            a = bVar;
            b bVar2 = new b("HIGH_PRIORITY_REQUIRED", 1);
            b = bVar2;
            b bVar3 = new b("REQUIRED", 2);
            c = bVar3;
            b bVar4 = new b("OPTIONAL", 3);
            d = bVar4;
            e = new b[]{bVar, bVar2, bVar3, bVar4};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) e.clone();
        }
    }

    static w2z N(hoa hoaVar, hoa hoaVar2) {
        if (hoaVar == null && hoaVar2 == null) {
            return w2z.P;
        }
        ftw ftwVarW = hoaVar2 != null ? ftw.W(hoaVar2) : ftw.V();
        if (hoaVar != null) {
            Iterator<a<?>> it = hoaVar.c().iterator();
            while (it.hasNext()) {
                s(ftwVarW, hoaVar2, hoaVar, it.next());
            }
        }
        return w2z.U(ftwVarW);
    }

    static void s(ftw ftwVar, hoa hoaVar, hoa hoaVar2, a<?> aVar) {
        if (!Objects.equals(aVar, x9n.s)) {
            ftwVar.X(aVar, hoaVar2.f(aVar), hoaVar2.d(aVar));
            return;
        }
        xf50 xf50Var = (xf50) hoaVar2.b(aVar, null);
        xf50 xf50Var2 = (xf50) hoaVar.b(aVar, null);
        b bVarF = hoaVar2.f(aVar);
        if (xf50Var == null) {
            xf50Var = xf50Var2;
        } else if (xf50Var2 != null) {
            jy0 jy0Var = xf50Var2.a;
            yf50 yf50Var = xf50Var2.b;
            jy0 jy0Var2 = xf50Var.a;
            if (jy0Var2 != null) {
                jy0Var = jy0Var2;
            }
            yf50 yf50Var2 = xf50Var.b;
            if (yf50Var2 != null) {
                yf50Var = yf50Var2;
            }
            xf50Var = new xf50(jy0Var, yf50Var);
        }
        ftwVar.X(aVar, bVarF, xf50Var);
    }

    Set<b> a(a<?> aVar);

    <ValueT> ValueT b(a<ValueT> aVar, ValueT valuet);

    Set<a<?>> c();

    <ValueT> ValueT d(a<ValueT> aVar);

    boolean e(a<?> aVar);

    b f(a<?> aVar);

    <ValueT> ValueT g(a<ValueT> aVar, b bVar);

    void h(gf6 gf6Var);
}
