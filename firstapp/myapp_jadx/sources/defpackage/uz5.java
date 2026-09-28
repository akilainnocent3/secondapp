package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class uz5 {

    public static final class a extends tz5 {
        public final ArrayList a = new ArrayList();

        public a(List<tz5> list) {
            for (tz5 tz5Var : list) {
                if (!(tz5Var instanceof b)) {
                    this.a.add(tz5Var);
                }
            }
        }

        @Override // defpackage.tz5
        public final void a(int i) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((tz5) obj).a(i);
            }
        }

        @Override // defpackage.tz5
        public final void b(int i, e06 e06Var) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((tz5) obj).b(i, e06Var);
            }
        }

        @Override // defpackage.tz5
        public final void c(int i, vz5 vz5Var) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((tz5) obj).c(i, vz5Var);
            }
        }

        @Override // defpackage.tz5
        public final void d(int i) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((tz5) obj).d(i);
            }
        }
    }

    public static tz5 a(tz5... tz5VarArr) {
        List listAsList = Arrays.asList(tz5VarArr);
        if (listAsList.isEmpty()) {
            return new b();
        }
        return listAsList.size() == 1 ? (tz5) listAsList.get(0) : new a(listAsList);
    }

    public static final class b extends tz5 {
        @Override // defpackage.tz5
        public final void d(int i) {
        }

        @Override // defpackage.tz5
        public final void b(int i, e06 e06Var) {
        }

        @Override // defpackage.tz5
        public final void c(int i, vz5 vz5Var) {
        }
    }
}
