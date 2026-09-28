package defpackage;

import com.appsflyer.internal.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface uh30 {

    public static final class b implements uh30 {
        public final List<ci30> a;

        public b(List<ci30> list) {
            list.getClass();
            this.a = list;
        }

        @Override // defpackage.uh30
        public final List<ci30> a() {
            return this.a;
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
            return p.a("Blocked(selectionsSnapshot=", ")", this.a);
        }
    }

    public static final class c implements uh30 {
        public final List<ci30> a;

        public c(List<ci30> list) {
            list.getClass();
            this.a = list;
        }

        @Override // defpackage.uh30
        public final List<ci30> a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.g(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return p.a("NeedAcceptance(selectionsSnapshot=", ")", this.a);
        }
    }

    List<ci30> a();

    public static final class a implements uh30 {
        public final List<ci30> a;

        public a(List<ci30> list) {
            list.getClass();
            this.a = list;
        }

        @Override // defpackage.uh30
        public final List<ci30> a() {
            return this.a;
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
            return p.a("Accepted(selectionsSnapshot=", ")", this.a);
        }

        public a(int i) {
            this(m2g.a);
        }
    }
}
