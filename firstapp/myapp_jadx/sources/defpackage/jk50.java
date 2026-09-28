package defpackage;

import com.sportygames.compose.chat.data.model.HTTPResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class jk50<T> {

    public static final class a extends jk50 {
        public final Integer a;
        public final HTTPResponse<Object> b;

        public a(Integer num, HTTPResponse<Object> hTTPResponse) {
            this.a = num;
            this.b = hTTPResponse;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b);
        }

        public final int hashCode() {
            Integer num = this.a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            HTTPResponse<Object> hTTPResponse = this.b;
            return iHashCode + (hTTPResponse != null ? hTTPResponse.hashCode() : 0);
        }

        public final String toString() {
            return "GenericError(code=" + this.a + ", error=" + this.b + ')';
        }
    }

    public static final class b extends jk50 {
        public static final b a = new b();
    }

    public static final class c<T> extends jk50<T> {
        public final HTTPResponse a;

        public c(HTTPResponse hTTPResponse) {
            this.a = hTTPResponse;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.g(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            HTTPResponse hTTPResponse = this.a;
            if (hTTPResponse == null) {
                return 0;
            }
            return hTTPResponse.hashCode();
        }

        public final String toString() {
            return "Success(value=" + this.a + ')';
        }
    }
}
