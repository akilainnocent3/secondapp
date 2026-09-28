package defpackage;

import com.appsflyer.internal.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l750 {

    public static final class a extends l750 {
        public final List<y0p> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends y0p> list) {
            list.getClass();
            this.a = list;
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
            return p.a("InlineBlock(nodes=", ")", this.a);
        }
    }

    public static final class b extends l750 {
        public final y0p.c a;

        public b(y0p.c cVar) {
            this.a = cVar;
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
            return "ListBlock(node=" + this.a + ")";
        }
    }

    public static final class c extends l750 {
        public final y0p.d a;

        public c(y0p.d dVar) {
            this.a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.g(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.a.hashCode();
        }

        public final String toString() {
            return "ParagraphBlock(node=" + this.a + ")";
        }
    }
}
