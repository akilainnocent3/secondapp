package defpackage;

import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public abstract class kyf0 {
    public final int a;

    public static final class a extends kyf0 {
        public static final a b = new a(R.color.icon_brand_main);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1582437338;
        }

        public final String toString() {
            return "Brand";
        }
    }

    public static final class b extends kyf0 {
        public static final b b = new b(R.color.accent_yellow_400);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 59437959;
        }

        public final String toString() {
            return "Highlight";
        }
    }

    public kyf0(int i) {
        this.a = i;
    }
}
