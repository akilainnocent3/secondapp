package defpackage;

import com.sporty.android.common_ui.uitext.UiText;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wa {
    public final uxs a;

    public static final class a extends wa {
        public final UiText b;

        public a(UiText uiText) {
            super(uxs.ENABLE);
            this.b = uiText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b.equals(((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return xh8.a(this.b, "Failure(errorMsg=", ")");
        }
    }

    public static final class b extends wa {
        public static final b b = new b(uxs.ENABLE);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 802739842;
        }

        public final String toString() {
            return "Loaded";
        }
    }

    public static final class c extends wa {
        public static final c b = new c(uxs.LOADING);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -884864417;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class d extends wa {
        public static final d b = new d(uxs.ENABLE);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1206282534;
        }

        public final String toString() {
            return "Success";
        }
    }

    public wa(uxs uxsVar) {
        this.a = uxsVar;
    }
}
