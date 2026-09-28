package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import defpackage.efe0;
import defpackage.hb5;
import defpackage.hce0;
import defpackage.lpd0;

/* JADX INFO: loaded from: classes.dex */
public interface o0 {

    public static class a implements o0 {
        public SparseArray<y> a;
        public int b;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.o0$a$a, reason: collision with other inner class name */
        public class C0072a implements b {
            public final SparseIntArray a = new SparseIntArray(1);
            public final SparseIntArray b = new SparseIntArray(1);
            public final y c;

            public C0072a(y yVar) {
                this.c = yVar;
            }

            @Override // androidx.recyclerview.widget.o0.b
            public final int a(int i) {
                SparseIntArray sparseIntArray = this.b;
                int iIndexOfKey = sparseIntArray.indexOfKey(i);
                if (iIndexOfKey >= 0) {
                    return sparseIntArray.valueAt(iIndexOfKey);
                }
                lpd0.a(efe0.a(i, "requested global type ", " does not belong to the adapter:"), this.c.c);
                return 0;
            }

            @Override // androidx.recyclerview.widget.o0.b
            public final int b(int i) {
                SparseIntArray sparseIntArray = this.a;
                int iIndexOfKey = sparseIntArray.indexOfKey(i);
                if (iIndexOfKey > -1) {
                    return sparseIntArray.valueAt(iIndexOfKey);
                }
                a aVar = a.this;
                int i2 = aVar.b;
                aVar.b = i2 + 1;
                aVar.a.put(i2, this.c);
                sparseIntArray.put(i, i2);
                this.b.put(i2, i);
                return i2;
            }
        }

        @Override // androidx.recyclerview.widget.o0
        public final y a(int i) {
            y yVar = this.a.get(i);
            if (yVar != null) {
                return yVar;
            }
            hb5.a(hce0.a(i, "Cannot find the wrapper for global view type "));
            return null;
        }

        @Override // androidx.recyclerview.widget.o0
        public final b b(y yVar) {
            return new C0072a(yVar);
        }
    }

    public interface b {
        int a(int i);

        int b(int i);
    }

    y a(int i);

    b b(y yVar);
}
