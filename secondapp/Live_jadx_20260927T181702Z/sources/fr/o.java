package fr;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class o {
    @oy.l
    public static final <T> T[] a(@oy.l T[] reference, int i10) {
        kotlin.jvm.internal.m0.p(reference, "reference");
        Object objNewInstance = Array.newInstance(reference.getClass().getComponentType(), i10);
        kotlin.jvm.internal.m0.n(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (T[]) ((Object[]) objNewInstance);
    }

    @cs.j(name = "contentDeepHashCode")
    @dr.f1
    @dr.l1(version = "1.3")
    public static final <T> int b(@oy.m T[] tArr) {
        return Arrays.deepHashCode(tArr);
    }

    @dr.l1(version = "1.3")
    public static final void c(int i10, int i11) {
        if (i10 <= i11) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is greater than size (" + i11 + ").");
    }

    public static final /* synthetic */ <T> T[] d(T[] tArr) {
        if (tArr != null) {
            return tArr;
        }
        kotlin.jvm.internal.m0.y(0, "T");
        return (T[]) new Object[0];
    }

    @ur.f
    public static final String e(byte[] bArr, Charset charset) {
        kotlin.jvm.internal.m0.p(bArr, "<this>");
        kotlin.jvm.internal.m0.p(charset, "charset");
        return new String(bArr, charset);
    }

    public static final /* synthetic */ <T> T[] f(Collection<? extends T> collection) {
        kotlin.jvm.internal.m0.p(collection, "<this>");
        kotlin.jvm.internal.m0.y(0, "T?");
        return (T[]) collection.toArray(new Object[0]);
    }
}
