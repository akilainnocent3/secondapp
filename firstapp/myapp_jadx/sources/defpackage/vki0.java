package defpackage;

import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public abstract class vki0 {
    public final int a;
    public final String b;
    public final boolean c;

    public static final class a extends vki0 {
        public static final a d = new a(R.string.page_virtuals_lobby__game, "game", false);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -241349489;
        }

        public final String toString() {
            return "Game";
        }
    }

    public vki0(int i, String str, boolean z) {
        this.a = i;
        this.b = str;
        this.c = z;
    }

    public static final class b extends vki0 {
        public final boolean d;

        public b(boolean z) {
            super(R.string.page_loyalty__mission, "mission", z);
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.d == ((b) obj).d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d);
        }

        public final String toString() {
            return b6c.a("Mission(hasNewMission=", ")", this.d);
        }

        public b() {
            this(false);
        }
    }
}
