package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class r190 {

    public static final class a extends r190 {
        public static final a a = new a();
    }

    public static final class b extends r190 {
        public static final b a = new b();
    }

    public static final class c extends r190 {
        public final String a;

        public c(String str) {
            this.a = str;
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
            return tug.a("Success(sharePreviewImageData=", this.a, ")");
        }
    }
}
