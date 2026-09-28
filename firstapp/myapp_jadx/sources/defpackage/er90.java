package defpackage;

import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public interface er90 {

    public static final class a implements er90 {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return Integer.hashCode(R.color.icon_brand_sub_primary_d_base) + (Integer.hashCode(R.drawable.ic__feature__won) * 31);
        }

        public final String toString() {
            return "Icon(drawableResId=2131231740, tintResId=2131100357)";
        }
    }

    public static final class b implements er90 {
        public final int a;

        public b(int i) {
            this.a = i;
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
}
