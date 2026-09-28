package defpackage;

import com.sportybet.feature.payment.impl.security.nameupdate.presentation.activity.kekO.YAzniTbXHYQ;

/* JADX INFO: loaded from: classes6.dex */
public abstract class jsf implements id90 {

    /* JADX INFO: loaded from: classes2.dex */
    public static final class a extends jsf {
        public final cr10 a;
        public final int b;

        public a(cr10 cr10Var, int i) {
            cr10Var.getClass();
            this.a = cr10Var;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "NavigateToEditConfirmation(type=" + this.a + YAzniTbXHYQ.bqdWBp + this.b + ")";
        }
    }
}
