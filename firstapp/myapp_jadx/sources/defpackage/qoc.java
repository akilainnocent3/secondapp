package defpackage;

import java.util.Arrays;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public abstract class qoc extends mn7 {
    public byte[] j;
    public volatile boolean k;

    @Override // nxs.d
    public final void a() {
        try {
            this.i.a(this.b);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.k) {
                byte[] bArrCopyOf = this.j;
                if (bArrCopyOf.length < i2 + Http2.INITIAL_MAX_FRAME_SIZE) {
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length + Http2.INITIAL_MAX_FRAME_SIZE);
                    this.j = bArrCopyOf;
                }
                i = this.i.read(bArrCopyOf, i2, Http2.INITIAL_MAX_FRAME_SIZE);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.k) {
                ((lam.a) this).l = Arrays.copyOf(this.j, i2);
            }
        } finally {
            fqc.a(this.i);
        }
    }

    @Override // nxs.d
    public final void b() {
        this.k = true;
    }
}
