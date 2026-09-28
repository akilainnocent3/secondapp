package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class rl8 {
    public static final a a = new a();
    public static final b b = new b(-1);
    public static final b c = new b(1);

    public class a extends rl8 {
        public static rl8 f(int i) {
            if (i < 0) {
                return rl8.b;
            }
            return i > 0 ? rl8.c : rl8.a;
        }

        @Override // defpackage.rl8
        public final rl8 a(int i, int i2) {
            return f(Integer.compare(i, i2));
        }

        @Override // defpackage.rl8
        public final <T> rl8 b(T t, T t2, Comparator<T> comparator) {
            return f(comparator.compare(t, t2));
        }

        @Override // defpackage.rl8
        public final rl8 c(boolean z, boolean z2) {
            return f(Boolean.compare(z, z2));
        }

        @Override // defpackage.rl8
        public final rl8 d(boolean z, boolean z2) {
            return f(Boolean.compare(z2, z));
        }

        @Override // defpackage.rl8
        public final int e() {
            return 0;
        }
    }

    public abstract rl8 a(int i, int i2);

    public abstract <T> rl8 b(T t, T t2, Comparator<T> comparator);

    public abstract rl8 c(boolean z, boolean z2);

    public abstract rl8 d(boolean z, boolean z2);

    public abstract int e();

    public static final class b extends rl8 {
        public final int d;

        public b(int i) {
            this.d = i;
        }

        @Override // defpackage.rl8
        public final int e() {
            return this.d;
        }

        @Override // defpackage.rl8
        public final rl8 a(int i, int i2) {
            return this;
        }

        @Override // defpackage.rl8
        public final rl8 c(boolean z, boolean z2) {
            return this;
        }

        @Override // defpackage.rl8
        public final rl8 d(boolean z, boolean z2) {
            return this;
        }

        @Override // defpackage.rl8
        public final <T> rl8 b(T t, T t2, Comparator<T> comparator) {
            return this;
        }
    }
}
