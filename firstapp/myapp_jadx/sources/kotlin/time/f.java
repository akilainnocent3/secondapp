package kotlin.time;

import defpackage.fsn;

/* JADX INFO: loaded from: classes8.dex */
public interface f {

    public static final class a implements f {
        public final String a;
        public final CharSequence b;

        public a(CharSequence charSequence, String str) {
            this.a = str;
            this.b = charSequence;
        }

        @Override // kotlin.time.f
        public final d toInstant() {
            throw new fsn(this.a + " when parsing an Instant from \"" + e.e(64, this.b) + '\"');
        }
    }

    public static final class b implements f {
        public final long a;
        public final int b;

        public b(long j, int i) {
            this.a = j;
            this.b = i;
        }

        @Override // kotlin.time.f
        public final d toInstant() {
            long j = d.c.a;
            long j2 = this.a;
            if (j2 >= j && j2 <= d.d.a) {
                return d.a.b(this.b, j2);
            }
            throw new fsn("The parsed date is outside the range representable by Instant (Unix epoch second " + j2 + ')');
        }
    }

    d toInstant();
}
