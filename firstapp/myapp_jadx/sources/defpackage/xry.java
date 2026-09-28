package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public interface xry {

    public static final class a implements xry {
        public final zuy a;
        public final boolean b;
        public final boolean c;
        public final boolean d;

        public a(zuy zuyVar, boolean z, boolean z2, boolean z3) {
            this.a = zuyVar;
            this.b = z;
            this.c = z2;
            this.d = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
        }

        @Override // defpackage.xry
        public final zuy getState() {
            return this.a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + mtg0.a(mtg0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        @Override // defpackage.xry
        public final boolean isChecked() {
            return this.d;
        }

        @Override // defpackage.xry
        public final boolean isEnabled() {
            return this.b;
        }

        @Override // defpackage.xry
        public final boolean isSupported() {
            return this.c;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InsureOneUp(state=");
            sb.append(this.a);
            sb.append(", isEnabled=");
            sb.append(this.b);
            sb.append(", isSupported=");
            return lng.a(", isChecked=", ")", sb, this.c, this.d);
        }
    }

    public static final class b implements xry {
        public final zuy a;
        public final boolean b;
        public final boolean c;
        public final boolean d;

        public b(zuy zuyVar, boolean z, boolean z2, boolean z3) {
            this.a = zuyVar;
            this.b = z;
            this.c = z2;
            this.d = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d;
        }

        @Override // defpackage.xry
        public final zuy getState() {
            return this.a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + mtg0.a(mtg0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        @Override // defpackage.xry
        public final boolean isChecked() {
            return this.d;
        }

        @Override // defpackage.xry
        public final boolean isEnabled() {
            return this.b;
        }

        @Override // defpackage.xry
        public final boolean isSupported() {
            return this.c;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InsureTwoUp(state=");
            sb.append(this.a);
            sb.append(", isEnabled=");
            sb.append(this.b);
            sb.append(", isSupported=");
            return lng.a(", isChecked=", ")", sb, this.c, this.d);
        }
    }

    zuy getState();

    boolean isChecked();

    boolean isEnabled();

    boolean isSupported();
}
