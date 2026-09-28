package defpackage;

import com.sporty.android.core.model.cashout.CashOutInfo;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qs6 {
    public final wp6 a;
    public final LinkedHashMap b;

    public qs6(wp6 wp6Var) {
        wp6Var.getClass();
        this.a = wp6Var;
        this.b = new LinkedHashMap();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int a(String str, String str2) {
        LinkedHashMap linkedHashMap = this.b;
        a aVar = (a) linkedHashMap.get(str);
        int i = 0;
        ?? r0 = (((aVar != null ? aVar.a : null) == null || Intrinsics.g(aVar.a, str2)) && aVar != null) ? aVar.b : 0;
        a aVar2 = (a) linkedHashMap.get(str);
        if (aVar2 == null) {
            aVar2 = new a(i);
        }
        linkedHashMap.put(str, a.a(aVar2, str2, r0, null, 4));
        return r0;
    }

    public static final class a {
        public final String a;
        public final boolean b;
        public final CashOutInfo c;

        public a(String str, boolean z, CashOutInfo cashOutInfo) {
            this.a = str;
            this.b = z;
            this.c = cashOutInfo;
        }

        public static a a(a aVar, String str, boolean z, CashOutInfo cashOutInfo, int i) {
            if ((i & 1) != 0) {
                str = aVar.a;
            }
            if ((i & 2) != 0) {
                z = aVar.b;
            }
            if ((i & 4) != 0) {
                cashOutInfo = aVar.c;
            }
            return new a(str, z, cashOutInfo);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && this.b == aVar.b && Intrinsics.g(this.c, aVar.c);
        }

        public final int hashCode() {
            String str = this.a;
            int iA = mtg0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
            CashOutInfo cashOutInfo = this.c;
            return iA + (cashOutInfo != null ? cashOutInfo.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbA = z620.a("UnavailableTracking(metricsType=", this.a, ", isClicked=", ", cashOutInfo=", this.b);
            sbA.append(this.c);
            sbA.append(")");
            return sbA.toString();
        }

        public /* synthetic */ a(int i) {
            this(null, false, null);
        }

        public a() {
            this(0);
        }
    }
}
