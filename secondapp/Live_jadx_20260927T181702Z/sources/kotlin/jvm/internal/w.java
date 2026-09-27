package kotlin.jvm.internal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@cs.j(name = "CollectionToArray")
@s1({"SMAP\nCollectionToArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionToArray.kt\nkotlin/jvm/internal/CollectionToArray\n*L\n1#1,88:1\n63#1,22:89\n63#1,22:111\n*S KotlinDebug\n*F\n+ 1 CollectionToArray.kt\nkotlin/jvm/internal/CollectionToArray\n*L\n22#1:89,22\n37#1:111,22\n*E\n"})
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final Object[] f102793a = new Object[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f102794b = 2147483645;

    @cs.j(name = "toArray")
    @oy.l
    @dr.p(errorSince = "2.1", warningSince = "1.9")
    @dr.o(message = "This function will be made internal in a future release")
    public static final Object[] a(@oy.l Collection<?> collection) {
        m0.p(collection, "collection");
        int size = collection.size();
        if (size == 0) {
            return f102793a;
        }
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            return f102793a;
        }
        Object[] objArrCopyOf = new Object[size];
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            objArrCopyOf[i10] = it.next();
            if (i11 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i12 = ((i11 * 3) + 1) >>> 1;
                if (i12 <= i11) {
                    i12 = f102794b;
                    if (i11 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i12);
                m0.o(objArrCopyOf, "copyOf(...)");
            } else if (!it.hasNext()) {
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i11);
                m0.o(objArrCopyOf2, "copyOf(...)");
                return objArrCopyOf2;
            }
            i10 = i11;
        }
    }

    @cs.j(name = "toArray")
    @oy.l
    @dr.p(errorSince = "2.1", warningSince = "1.9")
    @dr.o(message = "This function will be made internal in a future release")
    public static final Object[] b(@oy.l Collection<?> collection, @oy.m Object[] objArr) {
        Object[] objArrCopyOf;
        m0.p(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i10 = 0;
        if (size != 0) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    m0.n(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i11 = i10 + 1;
                    objArrCopyOf[i10] = it.next();
                    if (i11 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i12 = ((i11 * 3) + 1) >>> 1;
                        if (i12 <= i11) {
                            i12 = f102794b;
                            if (i11 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i12);
                        m0.o(objArrCopyOf, "copyOf(...)");
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf == objArr) {
                            objArr[i11] = null;
                            return objArr;
                        }
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i11);
                        m0.o(objArrCopyOf2, "copyOf(...)");
                        return objArrCopyOf2;
                    }
                    i10 = i11;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    public static final Object[] c(Collection<?> collection, ds.a<Object[]> aVar, ds.l<? super Integer, Object[]> lVar, ds.p<? super Object[], ? super Integer, Object[]> pVar) {
        int size = collection.size();
        if (size == 0) {
            return aVar.invoke();
        }
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            return aVar.invoke();
        }
        Object[] objArrInvoke = lVar.invoke(Integer.valueOf(size));
        int i10 = 0;
        ?? CopyOf = objArrInvoke;
        while (true) {
            int i11 = i10 + 1;
            CopyOf[i10] = it.next();
            if (i11 >= CopyOf.length) {
                if (!it.hasNext()) {
                    return CopyOf;
                }
                int i12 = ((i11 * 3) + 1) >>> 1;
                if (i12 <= i11) {
                    i12 = f102794b;
                    if (i11 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                CopyOf = Arrays.copyOf((Object[]) CopyOf, i12);
                m0.o(CopyOf, "copyOf(...)");
            } else if (!it.hasNext()) {
                return pVar.invoke(CopyOf, Integer.valueOf(i11));
            }
            i10 = i11;
            CopyOf = CopyOf;
        }
    }
}
