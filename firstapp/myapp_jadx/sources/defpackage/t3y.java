package defpackage;

import com.sporty.android.common_ui.uitext.StringUiText;

/* JADX INFO: loaded from: classes5.dex */
public interface t3y {

    public static final class a implements t3y {
        public final int a;
        public final StringUiText b;
        public final boolean c;

        public a(int i, StringUiText stringUiText, boolean z) {
            this.a = i;
            this.b = stringUiText;
            this.c = z;
        }

        @Override // defpackage.t3y
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
            return this.a == aVar.a && this.b.equals(aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + ((this.b.a.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Button(notificationType=");
            sb.append(this.a);
            sb.append(", displayName=");
            sb.append(this.b);
            sb.append(", shouldShowNewLabel=");
            return mq0.a(sb, this.c, ")");
        }
    }

    public static final class b implements t3y {
        public final int a;
        public final StringUiText b;
        public final boolean c;
        public final boolean d;

        public b(int i, StringUiText stringUiText, boolean z, boolean z2) {
            this.a = i;
            this.b = stringUiText;
            this.c = z;
            this.d = z2;
        }

        @Override // defpackage.t3y
        public final int a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b.equals(bVar.b) && this.c == bVar.c && this.d == bVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + mtg0.a((this.b.a.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Toggle(notificationType=");
            sb.append(this.a);
            sb.append(", displayName=");
            sb.append(this.b);
            sb.append(", isToggleOn=");
            return lng.a(", shouldShowNewLabel=", ")", sb, this.c, this.d);
        }
    }

    int a();
}
