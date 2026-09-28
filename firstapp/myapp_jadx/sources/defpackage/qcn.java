package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface qcn<E> extends List<E>, Collection, dhp {

    public static final class a<E> extends q3<E> implements qcn<E> {
        public final n4 b;
        public final int c;
        public final int d;

        public a(n4 n4Var, int i, int i2) {
            this.b = n4Var;
            this.c = i;
            pwn.c(i, i2, n4Var.size());
            this.d = i2 - i;
        }

        @Override // defpackage.q2
        public final int b() {
            return this.d;
        }

        @Override // java.util.List
        public final E get(int i) {
            pwn.a(i, this.d);
            return this.b.get(this.c + i);
        }

        @Override // defpackage.q3, java.util.List
        public final List subList(int i, int i2) {
            pwn.c(i, i2, this.d);
            int i3 = this.c;
            return new a(this.b, i + i3, i3 + i2);
        }
    }
}
