package defpackage;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ncn<K, V> {
    public final Object[] a;
    public int b;

    /* JADX WARN: Illegal instructions before constructor call */
    public ncn(Object[] objArr, Comparator<?> comparator) {
        r910.a("You must provide an even number of key/value pair arguments.", objArr.length % 2 == 0);
        if (objArr.length != 0) {
            Object[] objArr2 = new Object[objArr.length];
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
            a(objArr2, 0, objArr.length, objArr, comparator);
            Object obj = null;
            int i = 0;
            for (int i2 = 0; i2 < objArr.length; i2 += 2) {
                Object obj2 = objArr[i2];
                Object obj3 = objArr[i2 + 1];
                if (obj2 != null) {
                    if (obj != null && comparator.compare(obj2, obj) == 0) {
                        i -= 2;
                    }
                    if (obj3 == null) {
                        obj = null;
                    } else {
                        int i3 = i + 1;
                        objArr[i] = obj2;
                        i += 2;
                        objArr[i3] = obj3;
                        obj = obj2;
                    }
                }
            }
            if (objArr.length != i) {
                Object[] objArr3 = new Object[i];
                System.arraycopy(objArr, 0, objArr3, 0, i);
                objArr = objArr3;
            }
        }
        this(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0042  */
    public static void a(Object[] objArr, int i, int i2, Object[] objArr2, Comparator<?> comparator) {
        int iCompare;
        if (i2 - i <= 2) {
            return;
        }
        int i3 = ((i2 + i) / 4) * 2;
        a(objArr2, i, i3, objArr, comparator);
        a(objArr2, i3, i2, objArr, comparator);
        int i4 = i;
        int i5 = i3;
        while (i < i2) {
            if (i4 >= i3 - 1) {
                objArr2[i] = objArr[i5];
                objArr2[i + 1] = objArr[i5 + 1];
                i5 += 2;
            } else {
                if (i5 < i2 - 1) {
                    Object obj = objArr[i4];
                    Object obj2 = objArr[i5];
                    if (obj == null) {
                        iCompare = obj2 == null ? 0 : -1;
                    } else {
                        iCompare = obj2 == null ? 1 : comparator.compare(obj, obj2);
                    }
                    if (iCompare > 0) {
                        objArr2[i] = objArr[i5];
                        objArr2[i + 1] = objArr[i5 + 1];
                        i5 += 2;
                    }
                }
                objArr2[i] = objArr[i4];
                objArr2[i + 1] = objArr[i4 + 1];
                i4 += 2;
            }
            i += 2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ncn) {
            return Arrays.equals(this.a, ((ncn) obj).a);
        }
        return false;
    }

    public final void forEach(BiConsumer<? super K, ? super V> biConsumer) {
        if (biConsumer == null) {
            return;
        }
        int i = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i >= objArr.length) {
                return;
            }
            biConsumer.accept(objArr[i], objArr[i + 1]);
            i += 2;
        }
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.a) ^ 1000003;
        this.b = iHashCode;
        return iHashCode;
    }

    public final boolean isEmpty() {
        return this.a.length == 0;
    }

    public final int size() {
        return this.a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        int i = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i >= objArr.length) {
                break;
            }
            Object obj = objArr[i + 1];
            String strA = obj instanceof String ? j26.a(new StringBuilder("\""), (String) obj, '\"') : obj.toString();
            sb.append(objArr[i]);
            sb.append("=");
            sb.append(strA);
            sb.append(", ");
            i += 2;
        }
        if (sb.length() > 1) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("}");
        return sb.toString();
    }

    public ncn(Object[] objArr) {
        this.a = objArr;
    }
}
