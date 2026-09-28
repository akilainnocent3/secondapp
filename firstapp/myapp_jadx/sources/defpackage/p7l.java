package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface p7l {

    public static final class a implements p7l {
        public final int a;

        public a(int i) {
            this.a = i;
            if (i > 0) {
                return;
            }
            zkn.a("Provided count should be larger than zero");
        }

        @Override // defpackage.p7l
        public final ArrayList a(int i, int i2) {
            int i3 = this.a;
            int i4 = i - ((i3 - 1) * i2);
            int i5 = i4 / i3;
            int i6 = i4 % i3;
            ArrayList arrayList = new ArrayList(i3);
            int i7 = 0;
            while (i7 < i3) {
                arrayList.add(Integer.valueOf((i7 < i6 ? 1 : 0) + i5));
                i7++;
            }
            return arrayList;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return this.a == ((a) obj).a;
            }
            return false;
        }

        public final int hashCode() {
            return -this.a;
        }
    }

    ArrayList a(int i, int i2);
}
