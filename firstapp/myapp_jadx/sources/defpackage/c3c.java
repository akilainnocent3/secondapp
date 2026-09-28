package defpackage;

import androidx.compose.ui.layout.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class c3c {
    public static final /* synthetic */ int a = 0;

    public static final class a extends c3c {
        public final androidx.compose.foundation.layout.b.a b;

        public a(androidx.compose.foundation.layout.b.a aVar) {
            this.b = aVar;
        }

        @Override // defpackage.c3c
        public final int a(int i, asr asrVar, y yVar, int i2) {
            int iF0 = yVar.f0(this.b.a);
            if (iF0 == Integer.MIN_VALUE) {
                return 0;
            }
            int i3 = i2 - iF0;
            return asrVar == asr.b ? i - i3 : i3;
        }

        @Override // defpackage.c3c
        public final Integer b(y yVar) {
            return Integer.valueOf(yVar.f0(this.b.a));
        }
    }

    public static final class b extends c3c {
        public static final /* synthetic */ int b = 0;

        static {
            new b();
        }

        @Override // defpackage.c3c
        public final int a(int i, asr asrVar, y yVar, int i2) {
            return i / 2;
        }
    }

    public static final class c extends c3c {
        public static final /* synthetic */ int b = 0;

        static {
            new c();
        }

        @Override // defpackage.c3c
        public final int a(int i, asr asrVar, y yVar, int i2) {
            if (asrVar == asr.a) {
                return i;
            }
            return 0;
        }
    }

    public static final class d extends c3c {
        public final ht.b b;

        public d(n54.a aVar) {
            this.b = aVar;
        }

        @Override // defpackage.c3c
        public final int a(int i, asr asrVar, y yVar, int i2) {
            return this.b.a(0, i, asrVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.g(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "HorizontalCrossAxisAlignment(horizontal=" + this.b + ')';
        }
    }

    public static final class e extends c3c {
        public static final /* synthetic */ int b = 0;

        static {
            new e();
        }

        @Override // defpackage.c3c
        public final int a(int i, asr asrVar, y yVar, int i2) {
            if (asrVar == asr.a) {
                return 0;
            }
            return i;
        }
    }

    public static final class f extends c3c {
        public final ht.c b;

        public f(n54.b bVar) {
            this.b = bVar;
        }

        @Override // defpackage.c3c
        public final int a(int i, asr asrVar, y yVar, int i2) {
            return this.b.a(0, i);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Intrinsics.g(this.b, ((f) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "VerticalCrossAxisAlignment(vertical=" + this.b + ')';
        }
    }

    static {
        int i = b.b;
        int i2 = e.b;
        int i3 = c.b;
    }

    public abstract int a(int i, asr asrVar, y yVar, int i2);

    public Integer b(y yVar) {
        return null;
    }
}
