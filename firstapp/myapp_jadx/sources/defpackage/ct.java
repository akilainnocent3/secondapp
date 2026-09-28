package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface ct {

    public static final class a implements ct {
        public final m7l a;

        public a(m7l m7lVar) {
            m7lVar.getClass();
            this.a = m7lVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "AuditStatusAlertHintUiState(grayListSideFlowUiState=" + this.a + ")";
        }
    }

    public static final class b implements ct {
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
            return tug.a("PayAlertHintUiState(alertMsg=", this.a, ")");
        }
    }
}
