package defpackage;

import com.appsflyer.internal.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class k8 {

    public static final class a extends k8 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -969316603;
        }

        public final String toString() {
            return "AllFailed";
        }
    }

    public static final class b extends k8 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1433791059;
        }

        public final String toString() {
            return "Idle";
        }
    }

    public static final class c extends k8 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1947299645;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class d extends k8 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -454927957;
        }

        public final String toString() {
            return "NeedBVN";
        }
    }

    public static final class e extends k8 {
        public final List<j8> a;

        public e(List<j8> list) {
            list.getClass();
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.g(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return p.a("PartialFailed(failedAccountList=", ")", this.a);
        }
    }

    public static final class f extends k8 {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 143847306;
        }

        public final String toString() {
            return "Success";
        }
    }
}
