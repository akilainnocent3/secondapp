package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class hw2 {

    public static final class a extends hw2 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1276368565;
        }

        public final String toString() {
            return "Error";
        }
    }

    public static final class b extends hw2 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1980730319;
        }

        public final String toString() {
            return "Idle";
        }
    }

    public static final class c extends hw2 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -708873281;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class d extends hw2 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -659211736;
        }

        public final String toString() {
            return "NoData";
        }
    }

    public static final class e extends hw2 {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -704991183;
        }

        public final String toString() {
            return "RefreshLoadingFinish";
        }
    }

    public static final class f extends hw2 {
        public final ArrayList<hl30> a;

        public f(ArrayList<hl30> arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Intrinsics.g(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Success(dataList=" + this.a + ")";
        }
    }
}
