package defpackage;

import com.sportybet.plugin.sportypicks.domain.model.Kjqv.DZsoPoBl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface sx70 {

    public static final class b implements sx70 {
        public static final b a = new b();
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class d implements sx70, f {
        public final qcn<String> a;

        public d(qcn<String> qcnVar) {
            qcnVar.getClass();
            this.a = qcnVar;
        }

        @Override // sx70.f
        public final int a() {
            return this.a.size();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.g(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return vf5.a(this.a, DZsoPoBl.SgzvQHznyivNL, ")");
        }
    }

    public interface f {
        int a();
    }

    public static final class a implements f, sx70 {
        public final qcn<s4q> a;
        public final int b;

        public a(qcn<s4q> qcnVar) {
            qcnVar.getClass();
            this.a = qcnVar;
            this.b = qcnVar.size();
        }

        @Override // sx70.f
        public final int a() {
            return this.b;
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
            return vf5.a(this.a, "Country(countries=", ")");
        }

        public a(int i) {
            this(n1a0.c);
        }

        public a() {
            this(0);
        }
    }

    public static final class c implements f, sx70 {
        public final qcn<hsq> a;
        public final int b;

        public c(qcn<hsq> qcnVar) {
            qcnVar.getClass();
            this.a = qcnVar;
            this.b = qcnVar.size();
        }

        @Override // sx70.f
        public final int a() {
            return this.b;
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
            return vf5.a(this.a, "NextDraw(lotteries=", ")");
        }

        public c(int i) {
            this(n1a0.c);
        }

        public c() {
            this(0);
        }
    }

    public static final class e implements f, sx70 {
        public final qcn<dar> a;
        public final int b;

        public e(qcn<dar> qcnVar) {
            qcnVar.getClass();
            this.a = qcnVar;
            this.b = qcnVar.size();
        }

        @Override // sx70.f
        public final int a() {
            return this.b;
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
            return vf5.a(this.a, "Results(results=", ")");
        }

        public e(int i) {
            this(n1a0.c);
        }

        public e() {
            this(0);
        }
    }
}
