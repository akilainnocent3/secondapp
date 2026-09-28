package defpackage;

import com.sportybet.android.transaction.ui.txlist.model.TxListItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public interface v8h0 {

    public static final class a implements v8h0 {
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
            return b6c.a("Empty(shouldFixStatus=", ")", this.a);
        }
    }

    public static final class b implements v8h0 {
        public final boolean a;

        public b(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return b6c.a("EmptyWithinRange(shouldFixStatus=", ")", this.a);
        }
    }

    public static final class c implements v8h0 {
        public static final c a = new c();
    }

    public static final class d implements v8h0 {
        public static final d a = new d();
    }

    public static final class e implements v8h0 {
        public static final e a = new e();
    }

    public static final class f implements v8h0 {
        public final List<TxListItem> a;
        public final boolean b;
        public final boolean c;

        /* JADX WARN: Multi-variable type inference failed */
        public f(List<? extends TxListItem> list, boolean z, boolean z2) {
            this.a = list;
            this.b = z;
            this.c = z2;
        }

        public static f a(f fVar, ArrayList arrayList) {
            boolean z = fVar.b;
            boolean z2 = fVar.c;
            fVar.getClass();
            return new f(arrayList, z, z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a.equals(fVar.a) && this.b == fVar.b && this.c == fVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + mtg0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Success(dataList=");
            sb.append(this.a);
            sb.append(", shouldFixStatus=");
            sb.append(this.b);
            sb.append(", shouldShowKycHint=");
            return mq0.a(sb, this.c, ")");
        }
    }
}
