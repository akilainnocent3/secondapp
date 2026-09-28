package defpackage;

import androidx.window.layout.oKr.TEFcJcMqR;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class t7z {

    public static final class a extends t7z {
        public final aak a;

        public a(aak aakVar) {
            this.a = aakVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "FailFetch(from=" + this.a + ")";
        }
    }

    public static final class b extends t7z {
        public final aak a;
        public final List<Selection> b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(aak aakVar, List<? extends Selection> list) {
            list.getClass();
            this.a = aakVar;
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && Intrinsics.g(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ShowLoading(from=" + this.a + ", origin=" + this.b + ")";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class c extends t7z {
        public final List<Event> a;
        public final aak b;
        public final List<Selection> c;
        public final long d;
        public final long e;

        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends Event> list, aak aakVar, List<? extends Selection> list2, long j, long j2) {
            list.getClass();
            list2.getClass();
            this.a = list;
            this.b = aakVar;
            this.c = list2;
            this.d = j;
            this.e = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && this.b == cVar.b && Intrinsics.g(this.c, cVar.c) && this.d == cVar.d && this.e == cVar.e;
        }

        public final int hashCode() {
            return Long.hashCode(this.e) + f87.a(ai50.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), this.d, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuccessFetch(events=");
            sb.append(this.a);
            sb.append(TEFcJcMqR.EMbaBKVV);
            sb.append(this.b);
            sb.append(", origin=");
            sb.append(this.c);
            sb.append(", requestTime=");
            sb.append(this.d);
            return zug.a(this.e, ", responseTime=", ")", sb);
        }
    }
}
