package defpackage;

import androidx.media3.common.a;
import com.twilio.voice.AudioFormat;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class x2z extends d8e0 {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean e(nsz nszVar, byte[] bArr) {
        if (nszVar.a() < bArr.length) {
            return false;
        }
        int i = nszVar.b;
        byte[] bArr2 = new byte[bArr.length];
        nszVar.h(bArr2, 0, bArr.length);
        nszVar.I(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // defpackage.d8e0
    public final long b(nsz nszVar) {
        byte[] bArr = nszVar.a;
        return (((long) this.i) * xxf.b(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // defpackage.d8e0
    public final boolean c(nsz nszVar, long j, d8e0.a aVar) {
        if (e(nszVar, o)) {
            byte[] bArrCopyOf = Arrays.copyOf(nszVar.a, nszVar.c);
            int i = bArrCopyOf[9] & 255;
            ArrayList arrayListA = xxf.a(bArrCopyOf);
            if (aVar.a == null) {
                a.C0062a c0062a = new a.C0062a();
                c0062a.l = gqv.m("audio/ogg");
                c0062a.m = gqv.m("audio/opus");
                c0062a.E = i;
                c0062a.F = AudioFormat.AUDIO_SAMPLE_RATE_48000;
                c0062a.p = arrayListA;
                aVar.a = new a(c0062a);
                return true;
            }
        } else {
            boolean zE = e(nszVar, p);
            a aVar2 = aVar.a;
            if (!zE) {
                ly0.g(aVar2);
                return false;
            }
            ly0.g(aVar2);
            if (!this.n) {
                this.n = true;
                nszVar.J(8);
                uov uovVarA = qoi0.a(pcn.k(qoi0.b(nszVar, false, false).a));
                if (uovVarA != null) {
                    a.C0062a c0062aA = aVar.a.a();
                    c0062aA.k = uovVarA.b(aVar.a.l);
                    aVar.a = new a(c0062aA);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // defpackage.d8e0
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = false;
        }
    }
}
