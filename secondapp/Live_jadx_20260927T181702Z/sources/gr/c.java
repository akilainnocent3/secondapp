package gr;

import com.ironsource.C4235d4;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@s1({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,722:1\n1#2:723\n*E\n"})
public final class c {
    @l
    public static final <E> E[] d(int i10) {
        if (i10 >= 0) {
            return (E[]) new Object[i10];
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    @l
    public static final <T> T[] e(@l T[] tArr, int i10) {
        m0.p(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i10);
        m0.o(tArr2, "copyOf(...)");
        return tArr2;
    }

    public static final <E> void f(@l E[] eArr, int i10) {
        m0.p(eArr, "<this>");
        eArr[i10] = null;
    }

    public static final <E> void g(@l E[] eArr, int i10, int i11) {
        m0.p(eArr, "<this>");
        while (i10 < i11) {
            f(eArr, i10);
            i10++;
        }
    }

    public static final <T> boolean h(T[] tArr, int i10, int i11, List<?> list) {
        if (i11 != list.size()) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (!m0.g(tArr[i10 + i12], list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    public static final <T> int i(T[] tArr, int i10, int i11) {
        int iHashCode = 1;
        for (int i12 = 0; i12 < i11; i12++) {
            T t10 = tArr[i10 + i12];
            iHashCode = (iHashCode * 31) + (t10 != null ? t10.hashCode() : 0);
        }
        return iHashCode;
    }

    public static final <T> String j(T[] tArr, int i10, int i11, Collection<? extends T> collection) {
        StringBuilder sb2 = new StringBuilder((i11 * 3) + 2);
        sb2.append(C4235d4.j.f61460d);
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            T t10 = tArr[i10 + i12];
            if (t10 == collection) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(t10);
            }
        }
        sb2.append(C4235d4.j.f61462e);
        String string = sb2.toString();
        m0.o(string, "toString(...)");
        return string;
    }
}
