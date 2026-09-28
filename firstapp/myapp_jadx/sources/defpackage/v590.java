package defpackage;

import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface v590 {

    public static final class a implements v590 {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return Integer.hashCode(R.color.text_type1_primary) + (Integer.hashCode(R.drawable.more) * 31);
        }

        public final String toString() {
            return "Drawable(drawableRes=2131232658, tintColorRes=2131101791)";
        }
    }

    public static final class b implements v590 {
        public final String a;

        public b(String str) {
            str.getClass();
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("Url(url=", this.a, ")");
        }
    }
}
