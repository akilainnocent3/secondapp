package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface y2v {

    public static final class a implements y2v {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("ShowBetBuilderDiscardDialogIfNeeded(eventId=", this.a, ")");
        }
    }
}
