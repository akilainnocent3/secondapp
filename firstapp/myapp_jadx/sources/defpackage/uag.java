package defpackage;

import java.io.Serializable;
import java.lang.Enum;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes8.dex */
public final class uag<T extends Enum<T>> extends q3<T> implements tag<T>, RandomAccess, Serializable {
    public final T[] b;

    public uag(T[] tArr) {
        tArr.getClass();
        this.b = tArr;
    }

    @Override // defpackage.q2
    public final int b() {
        return this.b.length;
    }

    @Override // defpackage.q2, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        return ((Enum) ay0.C(r3.ordinal(), this.b)) == r3;
    }

    @Override // java.util.List
    public final Object get(int i) {
        q3.Companion aVar = q3.INSTANCE;
        T[] tArr = this.b;
        int length = tArr.length;
        aVar.getClass();
        q3.Companion.b(i, length);
        return tArr[i];
    }

    @Override // defpackage.q3, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) ay0.C(iOrdinal, this.b)) == r3) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // defpackage.q3, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) ay0.C(iOrdinal, this.b)) == r3) {
            return iOrdinal;
        }
        return -1;
    }
}
