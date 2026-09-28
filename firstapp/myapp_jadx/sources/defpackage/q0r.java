package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class q0r extends IOException {

    public static final class a extends q0r {
        public static final a a = new a("GiftUnavailable");
        public static final int b = 4210;

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1739115892;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "GiftUnavailable";
        }
    }
}
