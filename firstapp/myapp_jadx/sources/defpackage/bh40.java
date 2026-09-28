package defpackage;

import com.appsflyer.internal.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class bh40 {

    /* JADX INFO: loaded from: classes5.dex */
    public static final class a extends bh40 {
        public final String a;

        public a(String str) {
            this.a = str;
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
            return tug.a("Error(message=", this.a, ")");
        }
    }

    public static final class b extends bh40 {
        public static final b a = new b();
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class c extends bh40 {
        public final List<ji40> a;

        public c(List<ji40> list) {
            this.a = list;
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
            return p.a("Success(items=", ")", this.a);
        }
    }
}
