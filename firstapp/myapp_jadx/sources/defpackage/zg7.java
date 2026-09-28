package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public abstract class zg7 {

    public static final class a extends zg7 {
        public final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return ruw.a(new StringBuilder("ShowToast(isNickNameValidateIssue="), this.a, ')');
        }
    }
}
