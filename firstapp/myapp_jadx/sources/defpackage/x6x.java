package defpackage;

import com.sporty.android.core.model.pocket.withdraw.partner.RX.oAudzpbdOhCI;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface x6x {

    /* JADX INFO: loaded from: classes2.dex */
    public static final class a implements x6x {
        public final dbx a;

        public a(dbx dbxVar) {
            dbxVar.getClass();
            this.a = dbxVar;
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
            return oAudzpbdOhCI.PzLqsIfpWrK + this.a + ')';
        }

        public a() {
            this(dbx.b.a);
        }
    }

    public static final class b implements x6x {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -479113790;
        }

        public final String toString() {
            return "None";
        }
    }
}
