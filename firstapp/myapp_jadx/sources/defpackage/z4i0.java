package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface z4i0 {

    public static final class a {
        public final String a;
        public final List<e3i0> b;
        public final boolean c;

        public a(String str, List list) {
            str.getClass();
            list.getClass();
            this.a = str;
            this.b = list;
            this.c = true;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + ai50.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VideoInfo(id=");
            sb.append(this.a);
            sb.append(", sources=");
            sb.append(this.b);
            sb.append(", forceLandscape=");
            return mq0.a(sb, this.c, ")");
        }
    }

    void a(float f);

    void b(boolean z);

    ExoPlayer c();

    v340 d();

    void e(boolean z);

    void f();

    void g(a aVar);

    void release();
}
