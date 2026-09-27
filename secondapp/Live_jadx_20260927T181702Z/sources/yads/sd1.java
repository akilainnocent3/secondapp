package yads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class sd1 extends AbstractList implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f155387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f155388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f155389d;

    public sd1(int i10, int i11, int[] iArr) {
        this.f155387b = iArr;
        this.f155388c = i10;
        this.f155389d = i11;
    }

    public final int[] a() {
        return Arrays.copyOfRange(this.f155387b, this.f155388c, this.f155389d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int[] iArr = this.f155387b;
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f155388c;
        int i11 = this.f155389d;
        while (i10 < i11) {
            if (iArr[i10] == iIntValue) {
                return i10 != -1;
            }
            i10++;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sd1)) {
            return super.equals(obj);
        }
        sd1 sd1Var = (sd1) obj;
        int i10 = this.f155389d - this.f155388c;
        if (sd1Var.f155389d - sd1Var.f155388c != i10) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f155387b[this.f155388c + i11] != sd1Var.f155387b[sd1Var.f155388c + i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        ng2.a(i10, this.f155389d - this.f155388c);
        return Integer.valueOf(this.f155387b[this.f155388c + i10]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = this.f155388c; i11 < this.f155389d; i11++) {
            i10 = (i10 * 31) + this.f155387b[i11];
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001e  */
    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.f155387b;
            int iIntValue = ((Integer) obj).intValue();
            int i10 = this.f155388c;
            int i11 = this.f155389d;
            while (i10 < i11) {
                if (iArr[i10] != iIntValue) {
                    i10++;
                } else if (i10 >= 0) {
                    return i10 - this.f155388c;
                }
            }
            i10 = -1;
            if (i10 >= 0) {
                return i10 - this.f155388c;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.f155387b;
            int iIntValue = ((Integer) obj).intValue();
            int i10 = this.f155388c;
            int i11 = this.f155389d - 1;
            while (i11 >= i10) {
                if (iArr[i11] != iIntValue) {
                    i11--;
                } else if (i11 >= 0) {
                    return i11 - this.f155388c;
                }
            }
            i11 = -1;
            if (i11 >= 0) {
                return i11 - this.f155388c;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        Integer num = (Integer) obj;
        ng2.a(i10, this.f155389d - this.f155388c);
        int[] iArr = this.f155387b;
        int i11 = this.f155388c + i10;
        int i12 = iArr[i11];
        num.getClass();
        iArr[i11] = num.intValue();
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f155389d - this.f155388c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i10, int i11) {
        ng2.a(i10, i11, this.f155389d - this.f155388c);
        if (i10 == i11) {
            return Collections.EMPTY_LIST;
        }
        int[] iArr = this.f155387b;
        int i12 = this.f155388c;
        return new sd1(i10 + i12, i12 + i11, iArr);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.f155389d - this.f155388c) * 5);
        sb2.append(fw.b.f85384k);
        sb2.append(this.f155387b[this.f155388c]);
        int i10 = this.f155388c;
        while (true) {
            i10++;
            if (i10 >= this.f155389d) {
                sb2.append(fw.b.f85385l);
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(this.f155387b[i10]);
        }
    }
}
