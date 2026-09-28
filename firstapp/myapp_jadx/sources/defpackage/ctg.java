package defpackage;

import androidx.work.impl.eLa.LhMGMAwwhzjwfz;
import com.sportybet.android.instantwin.newtork.model.response.CreateEvent;
import com.sportybet.android.instantwin.newtork.model.response.MarketType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ctg {

    /* JADX INFO: loaded from: classes2.dex */
    public static final class a extends ctg {
        public final CreateEvent a;
        public final List<MarketType> b;
        public final aqn c;

        public a(CreateEvent createEvent, List<MarketType> list, aqn aqnVar) {
            list.getClass();
            this.a = createEvent;
            this.b = list;
            this.c = aqnVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + ai50.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return "Data(createEvent=" + this.a + ", marketTypes=" + this.b + LhMGMAwwhzjwfz.tsKxRAlyCB + this.c + ")";
        }
    }

    public static final class b extends ctg {
        public final Throwable a;

        public b(Throwable th) {
            th.getClass();
            this.a = th;
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
            return kox.a("Error(exception=", ")", this.a);
        }
    }

    public static final class c extends ctg {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1357864404;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class d extends ctg {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -923936185;
        }

        public final String toString() {
            return "MarketTypeEmpty";
        }
    }
}
