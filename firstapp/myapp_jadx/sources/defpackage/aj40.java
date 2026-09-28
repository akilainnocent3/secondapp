package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface aj40 {

    public static final class a implements aj40 {
        public final boolean a;
        public final Integer b;

        public a(Integer num, boolean z) {
            this.a = z;
            this.b = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && Intrinsics.g(this.b, aVar.b);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.a) * 31;
            Integer num = this.b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            return "Expandable(isTopDividerVisible=" + this.a + ", leadingIconResId=" + this.b + ")";
        }
    }

    public static final class b implements aj40 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -750060174;
        }

        public final String toString() {
            return "NonExpandable";
        }
    }
}
