package defpackage;

import coil3.compose.internal.CBvK.lobGSRIlnSGJY;
import com.appsflyer.internal.p;
import com.sportygames.multilevel.common.model.LevelConfigDetailDto;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface y6s {

    public static final class a implements y6s {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return tug.a("Error(message=", this.a, ")");
        }
    }

    public static final class b implements y6s {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -203109918;
        }

        public final String toString() {
            return "Idle";
        }
    }

    public static final class c implements y6s {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -566266770;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class d implements y6s {
        public final List<LevelConfigDetailDto> a;

        public d(List<LevelConfigDetailDto> list) {
            list.getClass();
            this.a = list;
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
            return p.a(lobGSRIlnSGJY.cbxefzRHEf, ")", this.a);
        }
    }
}
