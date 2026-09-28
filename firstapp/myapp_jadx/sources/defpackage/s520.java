package defpackage;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Ls520;", "Lj8i0;", "a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class s520 extends j8i0 {
    public final rym a;
    public final sym b;
    public final wwd0 c;
    public final v340 d;

    public s520(rym rymVar, sym symVar) {
        Object value;
        rymVar.getClass();
        symVar.getClass();
        this.a = rymVar;
        this.b = symVar;
        wwd0 wwd0VarA = xwd0.a(new a(0));
        this.c = wwd0VarA;
        this.d = e1i.b(wwd0VarA);
        do {
            value = wwd0VarA.getValue();
        } while (!wwd0VarA.g(value, a.a((a) value, 0, null, null, null, this.b.isEnabled(), 15)));
        x1();
    }

    public final void x1() {
        wwd0 wwd0Var;
        Object value;
        rym rymVar;
        do {
            wwd0Var = this.c;
            value = wwd0Var.getValue();
            rymVar = this.a;
        } while (!wwd0Var.g(value, a.a((a) value, 0, rymVar.e(), rymVar.a(), rymVar.f(), false, 17)));
    }

    public static final class a {
        public final int a;
        public final List<m420> b;
        public final u420 c;
        public final String d;
        public final boolean e;

        public a(int i, List<m420> list, u420 u420Var, String str, boolean z) {
            list.getClass();
            u420Var.getClass();
            this.a = i;
            this.b = list;
            this.c = u420Var;
            this.d = str;
            this.e = z;
        }

        public static a a(a aVar, int i, List list, u420 u420Var, String str, boolean z, int i2) {
            if ((i2 & 1) != 0) {
                i = aVar.a;
            }
            int i3 = i;
            if ((i2 & 2) != 0) {
                list = aVar.b;
            }
            List list2 = list;
            if ((i2 & 4) != 0) {
                u420Var = aVar.c;
            }
            u420 u420Var2 = u420Var;
            if ((i2 & 8) != 0) {
                str = aVar.d;
            }
            String str2 = str;
            if ((i2 & 16) != 0) {
                z = aVar.e;
            }
            aVar.getClass();
            list2.getClass();
            u420Var2.getClass();
            return new a(i3, list2, u420Var2, str2, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && Intrinsics.g(this.b, aVar.b) && Intrinsics.g(this.c, aVar.c) && Intrinsics.g(this.d, aVar.d) && this.e == aVar.e;
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + ai50.a(Integer.hashCode(this.a) * 31, 31, this.b)) * 31;
            String str = this.d;
            return Boolean.hashCode(this.e) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UiState(enqueueDelaySec=");
            sb.append(this.a);
            sb.append(", queuedItems=");
            sb.append(this.b);
            sb.append(", currentPage=");
            sb.append(this.c);
            sb.append(", currentlyDisplayedKey=");
            sb.append(this.d);
            sb.append(", overlayEnabled=");
            return mq0.a(sb, this.e, ")");
        }

        public a() {
            this(0);
        }

        public a(int i) {
            this(0, m2g.a, u420.i.a, null, false);
        }
    }
}
