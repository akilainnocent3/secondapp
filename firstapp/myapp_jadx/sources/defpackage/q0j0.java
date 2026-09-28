package defpackage;

import android.text.TextUtils;
import androidx.media3.common.a;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class q0j0 implements k4h {
    public static final Pattern i = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern j = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String a;
    public final zxf0 b;
    public final ree0.a d;
    public final boolean e;
    public m4h f;
    public int h;
    public final nsz c = new nsz();
    public byte[] g = new byte[1024];

    public q0j0(String str, zxf0 zxf0Var, ree0.a aVar, boolean z) {
        this.a = str;
        this.b = zxf0Var;
        this.d = aVar;
        this.e = z;
    }

    @Override // defpackage.k4h
    public final int a(l4h l4hVar, k620 k620Var) throws ssz {
        String strK;
        this.f.getClass();
        int length = (int) l4hVar.getLength();
        int i2 = this.h;
        byte[] bArrCopyOf = this.g;
        if (i2 == bArrCopyOf.length) {
            bArrCopyOf = Arrays.copyOf(bArrCopyOf, ((length != -1 ? length : bArrCopyOf.length) * 3) / 2);
            this.g = bArrCopyOf;
        }
        int i3 = this.h;
        int i4 = l4hVar.read(bArrCopyOf, i3, bArrCopyOf.length - i3);
        if (i4 != -1) {
            int i5 = this.h + i4;
            this.h = i5;
            if (length == -1 || i5 != length) {
                return 0;
            }
        }
        nsz nszVar = new nsz(this.g);
        s0j0.d(nszVar);
        String strK2 = nszVar.k(StandardCharsets.UTF_8);
        long jV = 0;
        long jC = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(strK2)) {
                while (true) {
                    String strK3 = nszVar.k(StandardCharsets.UTF_8);
                    if (strK3 == null) {
                        break;
                    }
                    if (s0j0.a.matcher(strK3).matches()) {
                        do {
                            strK = nszVar.k(StandardCharsets.UTF_8);
                            if (strK == null) {
                                break;
                            }
                        } while (!strK.isEmpty());
                    } else {
                        Matcher matcher2 = o0j0.a.matcher(strK3);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    d(0L);
                    return -1;
                }
                String strGroup = matcher.group(1);
                strGroup.getClass();
                long jC2 = s0j0.c(strGroup);
                String str = jrh0.a;
                long jB = this.b.b(jrh0.V((jV + jC2) - jC, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                njg0 njg0VarD = d(jB - jC2);
                byte[] bArr = this.g;
                int i6 = this.h;
                nsz nszVar2 = this.c;
                nszVar2.G(i6, bArr);
                njg0VarD.f(this.h, nszVar2);
                njg0VarD.a(jB, 1, this.h, 0, null);
                return -1;
            }
            if (strK2.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = i.matcher(strK2);
                if (!matcher3.find()) {
                    throw ssz.a(null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strK2));
                }
                Matcher matcher4 = j.matcher(strK2);
                if (!matcher4.find()) {
                    throw ssz.a(null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strK2));
                }
                String strGroup2 = matcher3.group(1);
                strGroup2.getClass();
                jC = s0j0.c(strGroup2);
                String strGroup3 = matcher4.group(1);
                strGroup3.getClass();
                long j2 = Long.parseLong(strGroup3);
                String str2 = jrh0.a;
                jV = jrh0.V(j2, 1000000L, 90000L, RoundingMode.DOWN);
            }
            strK2 = nszVar.k(StandardCharsets.UTF_8);
        }
    }

    @Override // defpackage.k4h
    public final boolean b(l4h l4hVar) {
        jcd jcdVar = (jcd) l4hVar;
        jcdVar.c(this.g, 0, 6, false);
        byte[] bArr = this.g;
        nsz nszVar = this.c;
        nszVar.G(6, bArr);
        if (s0j0.a(nszVar)) {
            return true;
        }
        jcdVar.c(this.g, 6, 3, false);
        nszVar.G(9, this.g);
        return s0j0.a(nszVar);
    }

    @Override // defpackage.k4h
    public final void c(long j2, long j3) {
        throw new IllegalStateException();
    }

    public final njg0 d(long j2) {
        njg0 njg0VarR = this.f.r(0, 3);
        a.C0062a c0062a = new a.C0062a();
        c0062a.m = gqv.m("text/vtt");
        c0062a.d = this.a;
        c0062a.r = j2;
        p0j0.a(c0062a, njg0VarR);
        this.f.n();
        return njg0VarR;
    }

    @Override // defpackage.k4h
    public final void l(m4h m4hVar) {
        if (this.e) {
            m4hVar = new see0(m4hVar, this.d);
        }
        this.f = m4hVar;
        m4hVar.k(new p480.b(-9223372036854775807L));
    }

    @Override // defpackage.k4h
    public final void release() {
    }
}
