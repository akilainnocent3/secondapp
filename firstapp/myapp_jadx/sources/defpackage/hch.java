package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public interface hch {

    public static final class a implements hch {
        public final kg50 a;

        public a(kg50 kg50Var) {
            this.a = kg50Var;
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
            return "Supported(resolvedFeatureGroup=" + this.a + ')';
        }
    }

    public static final class b implements hch {
        public static final b a = new b();
    }

    public static final class c implements hch {
        public final pnh0 a;

        public c(pnh0 pnh0Var) {
            this.a = pnh0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a.equals(((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "UnsupportedUseCase(unsupportedUseCase=" + this.a + ')';
        }
    }

    public static final class d implements hch {
        public final String a;
        public final l8l b;

        public d(String str, l8l l8lVar) {
            l8lVar.getClass();
            this.a = str;
            this.b = l8lVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a.equals(dVar.a) && Intrinsics.g(this.b, dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "UseCaseMissing(requiredUseCases=" + this.a + ", featureRequiring=" + this.b + ')';
        }
    }
}
