package defpackage;

import kotlin.ranges.f;

/* JADX INFO: loaded from: classes6.dex */
public interface im {

    public static final class a implements im {
        public final float a;
        public final float b;

        public a(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "Collapse(startProgress=" + this.a + ", endProgress=" + this.b + ")";
        }
    }

    public static final class b implements im {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1059013984;
        }

        public final String toString() {
            return "SequentialExpand";
        }
    }

    default float a(float f) {
        if (equals(b.a)) {
            return 0.0f;
        }
        if (!(this instanceof a)) {
            uhc.a();
            return 0.0f;
        }
        a aVar = (a) this;
        float f2 = aVar.a;
        return f.d((f - f2) / (aVar.b - f2), 0.0f, 1.0f);
    }
}
