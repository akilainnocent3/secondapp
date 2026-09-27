package ox;

import gi.j;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public enum b {
    UNUSED(null, null),
    GENERAL(null, null),
    DATE(new Class[]{Date.class, Number.class}, new String[]{"date", "time"}),
    NUMBER(new Class[]{Number.class}, new String[]{"number", "choice"});


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b[] f120031h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b[] f120032i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class<?>[] f120034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f120035c;

    static {
        b bVar = DATE;
        b bVar2 = NUMBER;
        f120031h = new b[]{bVar, bVar2};
        f120032i = new b[]{bVar, bVar2};
    }

    b(Class[] clsArr, String[] strArr) {
        this.f120034b = clsArr;
        this.f120035c = strArr;
    }

    public static <E> Set<E> e(E[] eArr) {
        return new HashSet(Arrays.asList(eArr));
    }

    public static b f(b bVar, b bVar2) {
        b bVar3 = UNUSED;
        if (bVar != bVar3) {
            if (bVar2 != bVar3) {
                b bVar4 = GENERAL;
                if (bVar != bVar4) {
                    if (bVar2 != bVar4) {
                        Set setE = e(bVar.f120034b);
                        setE.retainAll(e(bVar2.f120034b));
                        for (b bVar5 : f120032i) {
                            if (e(bVar5.f120034b).equals(setE)) {
                                return bVar5;
                            }
                        }
                        throw new RuntimeException();
                    }
                }
            }
            return bVar;
        }
        return bVar2;
    }

    public static boolean h(b bVar, b bVar2) {
        return f(bVar, bVar2) == bVar;
    }

    public static b i(String str) {
        String lowerCase = str.toLowerCase();
        for (b bVar : f120031h) {
            for (String str2 : bVar.f120035c) {
                if (str2.equals(lowerCase)) {
                    return bVar;
                }
            }
        }
        throw new IllegalArgumentException("Invalid format type " + lowerCase);
    }

    public static b j(b bVar, b bVar2) {
        b bVar3 = UNUSED;
        return (bVar == bVar3 || bVar2 == bVar3 || bVar == (bVar3 = GENERAL) || bVar2 == bVar3 || bVar == (bVar3 = DATE) || bVar2 == bVar3) ? bVar3 : NUMBER;
    }

    public boolean g(Class<?> cls) {
        Class<?>[] clsArr = this.f120034b;
        if (clsArr == null || cls == Void.TYPE) {
            return true;
        }
        for (Class<?> cls2 : clsArr) {
            if (cls2.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Enum
    public String toString() {
        StringBuilder sb2 = new StringBuilder(name());
        if (this.f120034b == null) {
            sb2.append(" conversion category (all types)");
        } else {
            StringJoiner stringJoinerA = lx.b.a(", ", " conversion category (one of: ", j.f86771d);
            for (Class<?> cls : this.f120034b) {
                stringJoinerA.add(cls.getCanonicalName());
            }
            sb2.append(stringJoinerA);
        }
        return sb2.toString();
    }
}
