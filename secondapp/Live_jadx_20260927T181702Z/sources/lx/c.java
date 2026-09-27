package lx;

import gi.j;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 lx.c, still in use, count: 1, list:
  (r0v0 lx.c) from 0x00c2: FILLED_NEW_ARRAY (r0v0 lx.c), (r1v1 lx.c), (r5v1 lx.c), (r2v2 lx.c), (r8v2 lx.c) A[WRAPPED] (LINE:195) elemType: lx.c
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class c {
    GENERAL("bBhHsS", null),
    CHAR("cC", Character.class, Byte.class, Short.class, Integer.class),
    INT("doxX", Byte.class, Short.class, Integer.class, Long.class, BigInteger.class),
    FLOAT("eEfgGaA", Float.class, Double.class, BigDecimal.class),
    TIME("tT", Long.class, Calendar.class, Date.class),
    CHAR_AND_INT(null, Byte.class, Short.class, Integer.class),
    INT_AND_TIME(null, Long.class),
    NULL(null, new Class[0]),
    UNUSED(null, null);


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final c[] f105309m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c[] f105310n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c[] f105311o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class<?>[] f105313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f105314c;

    static {
        c cVar = CHAR;
        c cVar2 = INT;
        c cVar3 = FLOAT;
        c cVar4 = TIME;
        c cVar5 = CHAR_AND_INT;
        c cVar6 = INT_AND_TIME;
        c cVar7 = NULL;
        f105309m = new c[]{cVar, cVar, cVar2, cVar3, cVar4};
        f105310n = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
        f105311o = new c[]{cVar7, cVar5, cVar6, cVar, cVar2, cVar3, cVar4};
    }

    public c(String str, Class... clsArr) {
        super(str, i);
        this.f105314c = str;
        if (clsArr == null) {
            this.f105313b = clsArr;
            return;
        }
        ArrayList arrayList = new ArrayList(clsArr.length);
        for (Class cls : clsArr) {
            arrayList.add(cls);
            Class<? extends Object> clsK = k(cls);
            if (clsK != null) {
                arrayList.add(clsK);
            }
        }
        this.f105313b = (Class[]) arrayList.toArray(new Class[0]);
    }

    public static <E> Set<E> e(E[] eArr) {
        return new HashSet(Arrays.asList(eArr));
    }

    public static c f(char c10) {
        for (c cVar : f105309m) {
            if (cVar.f105314c.contains(String.valueOf(c10))) {
                return cVar;
            }
        }
        throw new IllegalArgumentException("Bad conversion character " + c10);
    }

    public static c g(c cVar, c cVar2) {
        c cVar3 = UNUSED;
        if (cVar != cVar3) {
            if (cVar2 != cVar3) {
                c cVar4 = GENERAL;
                if (cVar != cVar4) {
                    if (cVar2 != cVar4) {
                        Set setE = e(cVar.f105313b);
                        setE.retainAll(e(cVar2.f105313b));
                        for (c cVar5 : f105310n) {
                            if (e(cVar5.f105313b).equals(setE)) {
                                return cVar5;
                            }
                        }
                        throw new RuntimeException();
                    }
                }
            }
            return cVar;
        }
        return cVar2;
    }

    public static boolean i(c cVar, c cVar2) {
        return g(cVar, cVar2) == cVar;
    }

    public static c j(c cVar, c cVar2) {
        c cVar3 = UNUSED;
        if (cVar == cVar3 || cVar2 == cVar3 || cVar == (cVar3 = GENERAL) || cVar2 == cVar3) {
            return cVar3;
        }
        c cVar4 = CHAR_AND_INT;
        if ((cVar == cVar4 && cVar2 == INT_AND_TIME) || (cVar == INT_AND_TIME && cVar2 == cVar4)) {
            return INT;
        }
        Set setE = e(cVar.f105313b);
        setE.addAll(e(cVar2.f105313b));
        for (c cVar5 : f105311o) {
            if (e(cVar5.f105313b).equals(setE)) {
                return cVar5;
            }
        }
        return GENERAL;
    }

    public static Class<? extends Object> k(Class<?> cls) {
        if (cls == Byte.class) {
            return Byte.TYPE;
        }
        if (cls == Character.class) {
            return Character.TYPE;
        }
        if (cls == Short.class) {
            return Short.TYPE;
        }
        if (cls == Integer.class) {
            return Integer.TYPE;
        }
        if (cls == Long.class) {
            return Long.TYPE;
        }
        if (cls == Float.class) {
            return Float.TYPE;
        }
        if (cls == Double.class) {
            return Double.TYPE;
        }
        if (cls == Boolean.class) {
            return Boolean.TYPE;
        }
        return null;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f105312p.clone();
    }

    public boolean h(Class<?> cls) {
        Class<?>[] clsArr = this.f105313b;
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
    @ky.d
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(name());
        sb2.append(" conversion category");
        Class<?>[] clsArr = this.f105313b;
        if (clsArr == null || clsArr.length == 0) {
            return sb2.toString();
        }
        StringJoiner stringJoinerA = b.a(", ", "(one of: ", j.f86771d);
        for (Class<?> cls : this.f105313b) {
            stringJoinerA.add(cls.getSimpleName());
        }
        sb2.append(" ");
        sb2.append(stringJoinerA);
        return sb2.toString();
    }
}
