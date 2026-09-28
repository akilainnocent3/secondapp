package defpackage;

import com.sportygames.common.business.CommonGameDetails;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface iwg {

    public static final class a implements iwg {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -2098853964;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class b implements iwg {
        public final List<CommonGameDetails> a;

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return Intrinsics.g(this.a, ((b) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            List<CommonGameDetails> list = this.a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final String toString() {
            return "ShowWithData(data=" + this.a + ')';
        }
    }
}
