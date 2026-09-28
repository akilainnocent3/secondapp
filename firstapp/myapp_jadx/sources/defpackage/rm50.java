package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public interface rm50 {
    public static final a a = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final Regex b = new Regex("^sr:match:[a-zA-Z0-9_|-]+$");
        public static final Regex c = new Regex("^[a-zA-Z0-9_|-]{6,}$");
        public static final Regex d = new Regex("^\\d{4,5}$");

        public static rm50 a(String str) {
            String string = StringsKt.t0(str).toString();
            if (b.f(string)) {
                return new b(string);
            }
            if (d.f(string)) {
                return new c(string);
            }
            if (c.f(string)) {
                return new b("sr:match:".concat(string));
            }
            return null;
        }
    }

    public static final class b implements rm50 {
        public final String b;

        public b(String str) {
            str.getClass();
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.g(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return tug.a("EventId(value=", this.b, ")");
        }
    }

    public static final class c implements rm50 {
        public final String b;

        public c(String str) {
            str.getClass();
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.g(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return tug.a("GameId(value=", this.b, ")");
        }
    }
}
