package defpackage;

import java.util.BitSet;
import java.util.Objects;
import java.util.StringJoiner;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes8.dex */
public abstract class hnh implements m21 {
    public final Object[] a;
    public final int b;
    public final int c;

    public static class a extends hnh {
        public final BitSet d;

        public a(Object[] objArr, int i, int i2, BitSet bitSet) {
            super(i, i2, objArr);
            this.d = bitSet;
        }

        @Override // defpackage.hnh
        public final boolean a(int i) {
            return !this.d.get(i / 2);
        }
    }

    public static class b extends hnh {
        public final int d;

        public b(Object[] objArr, int i, int i2, int i3) {
            super(i, i2, objArr);
            this.d = i3;
        }

        @Override // defpackage.hnh
        public final boolean a(int i) {
            return (this.d & (1 << (i / 2))) == 0;
        }
    }

    public hnh(int i, int i2, Object[] objArr) {
        this.a = objArr;
        this.b = i;
        this.c = i2;
    }

    public abstract boolean a(int i);

    @Override // defpackage.m21
    public final <T> T e(e21<T> e21Var) {
        if (e21Var == null) {
            return null;
        }
        int i = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i >= objArr.length) {
                return null;
            }
            if (e21Var.equals(objArr[i]) && a(i)) {
                return (T) objArr[i + 1];
            }
            i += 2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof hnh)) {
            hnh hnhVar = (hnh) obj;
            Object[] objArr = hnhVar.a;
            if (this.c != hnhVar.c) {
                return false;
            }
            int i = 0;
            int i2 = 0;
            while (true) {
                Object[] objArr2 = this.a;
                boolean z = i >= objArr2.length;
                boolean z2 = i2 >= objArr.length;
                if (z || a(i)) {
                    if (z2 || hnhVar.a(i2)) {
                        if (z && z2) {
                            return true;
                        }
                        if (z == z2 && Objects.equals(objArr2[i], objArr[i2]) && Objects.equals(objArr2[i + 1], objArr[i2 + 1])) {
                            i += 2;
                        }
                    }
                    i2 += 2;
                } else {
                    i += 2;
                }
            }
        }
        return false;
    }

    @Override // defpackage.m21
    public final void forEach(BiConsumer<? super e21<?>, ? super Object> biConsumer) {
        int i = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i >= objArr.length) {
                return;
            }
            if (a(i)) {
                biConsumer.accept((e21) objArr[i], objArr[i + 1]);
            }
            i += 2;
        }
    }

    public final int hashCode() {
        return this.b;
    }

    @Override // defpackage.m21
    public final boolean isEmpty() {
        return false;
    }

    @Override // defpackage.m21
    public final int size() {
        return this.c;
    }

    @Override // defpackage.m21
    public final xw0 toBuilder() {
        xw0 xw0Var = new xw0();
        int i = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i >= objArr.length) {
                return xw0Var;
            }
            if (a(i)) {
                xw0Var.b((e21) objArr[i], objArr[i + 1]);
            }
            i += 2;
        }
    }

    public final String toString() {
        StringJoiner stringJoiner = new StringJoiner(",", "FilteredAttributes{", "}");
        int i = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i >= objArr.length) {
                return stringJoiner.toString();
            }
            if (a(i)) {
                stringJoiner.add(((e21) objArr[i]).getKey() + "=" + objArr[i + 1]);
            }
            i += 2;
        }
    }
}
