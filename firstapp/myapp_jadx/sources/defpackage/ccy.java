package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class ccy<E> {
    public Object[] a;
    public int b;

    public static final class a extends qlr implements Function1<E, CharSequence> {
        public final /* synthetic */ ccy<E> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ccy<E> ccyVar) {
            super(1);
            this.a = ccyVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(Object obj) {
            return obj == this.a ? "(this)" : String.valueOf(obj);
        }
    }

    public final E a() {
        if (!d()) {
            return (E) this.a[0];
        }
        ibh0.a("ObjectList is empty.");
        return null;
    }

    public final E b(int i) {
        if (i >= 0 && i < this.b) {
            return (E) this.a[i];
        }
        f(i);
        throw null;
    }

    public final int c(E e) {
        Object[] objArr = this.a;
        int i = 0;
        if (e == null) {
            int i2 = this.b;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i3 = this.b;
        while (i < i3) {
            if (e.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean d() {
        return this.b == 0;
    }

    public final boolean e() {
        return this.b != 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ccy) {
            ccy ccyVar = (ccy) obj;
            int i = ccyVar.b;
            int i2 = this.b;
            if (i == i2) {
                Object[] objArr = this.a;
                Object[] objArr2 = ccyVar.a;
                IntRange intRangeN = f.n(0, i2);
                int i3 = intRangeN.a;
                int i4 = intRangeN.b;
                if (i3 > i4) {
                    return true;
                }
                while (Intrinsics.g(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final void f(int i) {
        StringBuilder sbA = efe0.a(i, "Index ", " must be in 0..");
        sbA.append(this.b - 1);
        throw new IndexOutOfBoundsException(sbA.toString());
    }

    public final int hashCode() {
        Object[] objArr = this.a;
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        a aVar = new a(this);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                return sb.toString();
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) aVar.invoke(obj));
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }
}
