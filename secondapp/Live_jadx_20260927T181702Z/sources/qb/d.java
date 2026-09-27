package qb;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f122113e = "GifHeaderParser";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f122114f = 255;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f122115g = 44;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f122116h = 33;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f122117i = 59;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f122118j = 249;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f122119k = 255;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f122120l = 254;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f122121m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f122122n = 28;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f122123o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f122124p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f122125q = 128;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f122126r = 64;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f122127s = 7;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f122128t = 128;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f122129u = 7;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f122130v = 2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f122131w = 10;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f122132x = 256;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f122134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f122135c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f122133a = new byte[256];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f122136d = 0;

    public void a() {
        this.f122134b = null;
        this.f122135c = null;
    }

    public final boolean b() {
        return this.f122135c.f122101b != 0;
    }

    public boolean c() {
        l();
        if (!b()) {
            j(2);
        }
        return this.f122135c.f122102c > 1;
    }

    @NonNull
    public c d() {
        if (this.f122134b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (b()) {
            return this.f122135c;
        }
        l();
        if (!b()) {
            i();
            c cVar = this.f122135c;
            if (cVar.f122102c < 0) {
                cVar.f122101b = 1;
            }
        }
        return this.f122135c;
    }

    public final int e() {
        try {
            return this.f122134b.get() & 255;
        } catch (Exception unused) {
            this.f122135c.f122101b = 1;
            return 0;
        }
    }

    public final void f() {
        this.f122135c.f122103d.f122087a = o();
        this.f122135c.f122103d.f122088b = o();
        this.f122135c.f122103d.f122089c = o();
        this.f122135c.f122103d.f122090d = o();
        int iE = e();
        boolean z10 = (iE & 128) != 0;
        int iPow = (int) Math.pow(2.0d, (iE & 7) + 1);
        b bVar = this.f122135c.f122103d;
        bVar.f122091e = (iE & 64) != 0;
        if (z10) {
            bVar.f122097k = h(iPow);
        } else {
            bVar.f122097k = null;
        }
        this.f122135c.f122103d.f122096j = this.f122134b.position();
        t();
        if (b()) {
            return;
        }
        c cVar = this.f122135c;
        cVar.f122102c++;
        cVar.f122104e.add(cVar.f122103d);
    }

    public final void g() {
        int iE = e();
        this.f122136d = iE;
        if (iE <= 0) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            try {
                int i12 = this.f122136d;
                if (i10 >= i12) {
                    return;
                }
                i11 = i12 - i10;
                this.f122134b.get(this.f122133a, i10, i11);
                i10 += i11;
            } catch (Exception e10) {
                if (Log.isLoggable(f122113e, 3)) {
                    Log.d(f122113e, "Error Reading Block n: " + i10 + " count: " + i11 + " blockSize: " + this.f122136d, e10);
                }
                this.f122135c.f122101b = 1;
                return;
            }
        }
    }

    @Nullable
    public final int[] h(int i10) {
        byte[] bArr = new byte[i10 * 3];
        int[] iArr = null;
        try {
            this.f122134b.get(bArr);
            iArr = new int[256];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = bArr[i12] & 255;
                int i14 = i12 + 2;
                int i15 = bArr[i12 + 1] & 255;
                i12 += 3;
                int i16 = i11 + 1;
                iArr[i11] = (i15 << 8) | (i13 << 16) | (-16777216) | (bArr[i14] & 255);
                i11 = i16;
            }
            return iArr;
        } catch (BufferUnderflowException e10) {
            if (Log.isLoggable(f122113e, 3)) {
                Log.d(f122113e, "Format Error Reading Color Table", e10);
            }
            this.f122135c.f122101b = 1;
            return iArr;
        }
    }

    public final void i() {
        j(Integer.MAX_VALUE);
    }

    public final void j(int i10) {
        boolean z10 = false;
        while (!z10 && !b() && this.f122135c.f122102c <= i10) {
            int iE = e();
            if (iE == 33) {
                int iE2 = e();
                if (iE2 == 1) {
                    s();
                } else if (iE2 == 249) {
                    this.f122135c.f122103d = new b();
                    k();
                } else if (iE2 == 254) {
                    s();
                } else if (iE2 != 255) {
                    s();
                } else {
                    g();
                    StringBuilder sb2 = new StringBuilder();
                    for (int i11 = 0; i11 < 11; i11++) {
                        sb2.append((char) this.f122133a[i11]);
                    }
                    if (sb2.toString().equals("NETSCAPE2.0")) {
                        n();
                    } else {
                        s();
                    }
                }
            } else if (iE == 44) {
                c cVar = this.f122135c;
                if (cVar.f122103d == null) {
                    cVar.f122103d = new b();
                }
                f();
            } else if (iE != 59) {
                this.f122135c.f122101b = 1;
            } else {
                z10 = true;
            }
        }
    }

    public final void k() {
        e();
        int iE = e();
        b bVar = this.f122135c.f122103d;
        int i10 = (iE & 28) >> 2;
        bVar.f122093g = i10;
        if (i10 == 0) {
            bVar.f122093g = 1;
        }
        bVar.f122092f = (iE & 1) != 0;
        int iO = o();
        if (iO < 2) {
            iO = 10;
        }
        b bVar2 = this.f122135c.f122103d;
        bVar2.f122095i = iO * 10;
        bVar2.f122094h = e();
        e();
    }

    public final void l() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 6; i10++) {
            sb2.append((char) e());
        }
        if (!sb2.toString().startsWith("GIF")) {
            this.f122135c.f122101b = 1;
            return;
        }
        m();
        if (!this.f122135c.f122107h || b()) {
            return;
        }
        c cVar = this.f122135c;
        cVar.f122100a = h(cVar.f122108i);
        c cVar2 = this.f122135c;
        cVar2.f122111l = cVar2.f122100a[cVar2.f122109j];
    }

    public final void m() {
        this.f122135c.f122105f = o();
        this.f122135c.f122106g = o();
        int iE = e();
        c cVar = this.f122135c;
        cVar.f122107h = (iE & 128) != 0;
        cVar.f122108i = (int) Math.pow(2.0d, (iE & 7) + 1);
        this.f122135c.f122109j = e();
        this.f122135c.f122110k = e();
    }

    public final void n() {
        do {
            g();
            byte[] bArr = this.f122133a;
            if (bArr[0] == 1) {
                this.f122135c.f122112m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f122136d <= 0) {
                return;
            }
        } while (!b());
    }

    public final int o() {
        return this.f122134b.getShort();
    }

    public final void p() {
        this.f122134b = null;
        Arrays.fill(this.f122133a, (byte) 0);
        this.f122135c = new c();
        this.f122136d = 0;
    }

    public d q(@NonNull ByteBuffer byteBuffer) {
        p();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f122134b = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f122134b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public d r(@Nullable byte[] bArr) {
        if (bArr != null) {
            q(ByteBuffer.wrap(bArr));
            return this;
        }
        this.f122134b = null;
        this.f122135c.f122101b = 2;
        return this;
    }

    public final void s() {
        int iE;
        do {
            iE = e();
            this.f122134b.position(Math.min(this.f122134b.position() + iE, this.f122134b.limit()));
        } while (iE > 0);
    }

    public final void t() {
        e();
        s();
    }
}
