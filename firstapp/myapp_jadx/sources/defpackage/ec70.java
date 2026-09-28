package defpackage;

import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public interface ec70 {

    public static final class a implements ec70 {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return Integer.hashCode(R.color.icon_primary) + (Integer.hashCode(R.drawable.ic__feature__match_status_not_started) * 31);
        }

        public final String toString() {
            return "Icon(drawableResId=2131231730, tintResId=2131100373)";
        }
    }

    public static final class b implements ec70 {
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
