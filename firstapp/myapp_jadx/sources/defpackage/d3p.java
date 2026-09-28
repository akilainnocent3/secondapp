package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d3p<T> extends q3<T> {
    public final int b;
    public final int c;
    public final ArrayList d;

    public d3p(ArrayList arrayList, int i, int i2) {
        this.b = i;
        this.c = i2;
        this.d = arrayList;
    }

    @Override // defpackage.q2
    public final int b() {
        return this.d.size() + this.b + this.c;
    }

    @Override // java.util.List
    public final T get(int i) {
        int i2 = this.b;
        if (i < 0 || i >= i2) {
            ArrayList arrayList = this.d;
            if (i < arrayList.size() + i2 && i2 <= i) {
                return (T) arrayList.get(i - i2);
            }
            int size = arrayList.size() + i2;
            if (i >= b() || size > i) {
                ks40.a(b(), efe0.a(i, "Illegal attempt to access index ", " in ItemSnapshotList of size "));
                return null;
            }
        }
        return null;
    }
}
