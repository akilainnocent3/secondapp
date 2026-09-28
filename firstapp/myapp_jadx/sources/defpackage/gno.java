package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface gno {

    public static final class a implements gno {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // defpackage.gno
        public final int a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return n36.a("Icon(drawableResId=", this.a, this.b, ", tintResId=", ")");
        }
    }

    public static final class b implements gno {
        public final int a;

        public b(int i) {
            this.a = i;
        }

        @Override // defpackage.gno
        public final int a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return pe4.b(this.a, "Image(drawableResId=", ")");
        }
    }

    int a();
}
