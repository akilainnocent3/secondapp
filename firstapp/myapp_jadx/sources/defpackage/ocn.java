package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface ocn<E> extends List<E>, Collection, dhp {

    public static final class a<E> extends q3<E> implements ocn<E> {
        public final ocn<E> b;
        public final int c;
        public final int d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(ocn<? extends E> ocnVar, int i, int i2) {
            this.b = ocnVar;
            this.c = i;
            xhs.c(i, i2, ocnVar.size());
            this.d = i2 - i;
        }

        @Override // defpackage.q2
        public final int b() {
            return this.d;
        }

        @Override // java.util.List
        public final E get(int i) {
            xhs.a(i, this.d);
            return this.b.get(this.c + i);
        }

        @Override // defpackage.q3, java.util.List
        public final List subList(int i, int i2) {
            xhs.c(i, i2, this.d);
            int i3 = this.c;
            return new a(this.b, i + i3, i3 + i2);
        }
    }
}
