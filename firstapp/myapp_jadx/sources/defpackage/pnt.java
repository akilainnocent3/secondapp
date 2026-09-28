package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public interface pnt {

    public static final class a implements pnt {
        public final String a;

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return this.a.equals(((a) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("Asset(assetName=", this.a, ")");
        }
    }

    public static final class b implements pnt {
    }

    public static final class c implements pnt {
    }

    public static final class d implements pnt {
    }

    public static final class e implements pnt {
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class f implements pnt {
        public final String a;

        public final boolean equals(Object obj) {
            if (obj instanceof f) {
                return Intrinsics.g(this.a, ((f) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("Url(url=", this.a, ")");
        }
    }
}
