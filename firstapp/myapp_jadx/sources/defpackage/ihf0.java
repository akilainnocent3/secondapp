package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class ihf0 {

    public static final class a extends ihf0 {
    }

    public static final class b extends ihf0 {
        public final n54.a a;
        public final n54.a b;

        public b(int i) {
            n54.a aVar = ht.a.m;
            this.a = aVar;
            this.b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b);
        }

        public final int hashCode() {
            return Float.hashCode(this.b.a) + tvh.a(this.a.a, Boolean.hashCode(false) * 31, 31);
        }

        public final String toString() {
            return "Attached(alwaysMinimize=false, minimizedAlignment=" + this.a + ", expandedAlignment=" + this.b + ')';
        }
    }
}
