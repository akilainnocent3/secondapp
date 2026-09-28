package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.sportytv.data.MyProgram;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class vzw {

    public static final class a extends vzw {
        public final BaseResponse<MyProgram> a;

        public a(BaseResponse<MyProgram> baseResponse) {
            this.a = baseResponse;
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
            return "MyProgramListDataExist(programListResult=" + this.a + ")";
        }
    }

    public static final class b extends vzw {
        public static final b a = new b();
    }

    public static final class c extends vzw {
        public static final c a = new c();
    }
}
