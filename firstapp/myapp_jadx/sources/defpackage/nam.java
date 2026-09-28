package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.a;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class nam extends siv {
    public static final AtomicInteger M = new AtomicInteger();
    public final boolean A;
    public final boolean B;
    public oam C;
    public fbm D;
    public int E;
    public boolean F;
    public volatile boolean G;
    public boolean H;
    public pcn<Integer> I;
    public boolean J;
    public long K;
    public boolean L;
    public final int k;
    public final int l;
    public final Uri m;
    public final boolean n;
    public final int o;
    public final zpc p;
    public final gqc q;
    public final oam r;
    public final boolean s;
    public final boolean t;
    public final zxf0 u;
    public final mam v;
    public final List<a> w;
    public final DrmInitData x;
    public final p6n y;
    public final nsz z;

    public nam(mam mamVar, zpc zpcVar, gqc gqcVar, a aVar, boolean z, zpc zpcVar2, gqc gqcVar2, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, zxf0 zxf0Var, DrmInitData drmInitData, oam oamVar, p6n p6nVar, nsz nszVar, boolean z6, boolean z7, sp10 sp10Var) {
        super(zpcVar, gqcVar, aVar, i, obj, j, j2, j3);
        this.A = z;
        this.o = i2;
        this.K = z3 ? j2 - j : -9223372036854775807L;
        this.l = i3;
        this.q = gqcVar2;
        this.p = zpcVar2;
        this.F = gqcVar2 != null;
        this.B = z2;
        this.m = uri;
        this.s = z5;
        this.u = zxf0Var;
        this.t = z4;
        this.v = mamVar;
        this.w = list;
        this.x = drmInitData;
        this.r = oamVar;
        this.y = p6nVar;
        this.z = nszVar;
        this.L = z6;
        this.n = z7;
        pcn.b bVar = pcn.b;
        this.I = c150.e;
        this.k = M.getAndIncrement();
    }

    public static byte[] d(String str) {
        if (fy0.b(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // nxs.d
    public final void a() {
        oam oamVar;
        this.D.getClass();
        if (this.C == null && (oamVar = this.r) != null) {
            k4h k4hVarE = ((yj5) oamVar).a.e();
            if ((k4hVarE instanceof vxg0) || (k4hVarE instanceof ezi)) {
                this.C = this.r;
                this.F = false;
            }
        }
        gqc gqcVar = this.q;
        zpc zpcVar = this.p;
        if (this.F) {
            zpcVar.getClass();
            gqcVar.getClass();
            c(zpcVar, gqcVar, this.B, false);
            this.E = 0;
            this.F = false;
        }
        if (this.G) {
            return;
        }
        if (!this.t) {
            c(this.i, this.b, this.A, true);
        }
        this.H = !this.G;
    }

    @Override // nxs.d
    public final void b() {
        this.G = true;
    }

    public final void c(zpc zpcVar, gqc gqcVar, boolean z, boolean z2) {
        gqc gqcVarB;
        boolean z3;
        long j;
        int i = this.E;
        if (z) {
            z3 = i != 0;
            gqcVarB = gqcVar;
        } else {
            long j2 = i;
            long j3 = gqcVar.g;
            gqcVarB = gqcVar.b(j2, j3 != -1 ? j3 - j2 : -1L);
            z3 = false;
        }
        try {
            jcd jcdVarG = g(zpcVar, gqcVarB, z2);
            if (z3) {
                jcdVarG.b(this.E, false);
            }
            while (!this.G && ((yj5) this.C).a.a(jcdVarG, yj5.f) == 0) {
                try {
                    try {
                    } catch (EOFException e) {
                        if ((this.d.f & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                            throw e;
                        }
                        ((yj5) this.C).a.c(0L, 0L);
                        j = jcdVarG.d;
                    }
                } catch (Throwable th) {
                    this.E = (int) (jcdVarG.d - gqcVar.f);
                    throw th;
                }
            }
            j = jcdVarG.d;
            this.E = (int) (j - gqcVar.f);
            fqc.a(zpcVar);
        } catch (Throwable th2) {
            fqc.a(zpcVar);
            throw th2;
        }
    }

    public final int e(int i) {
        ly0.f(!this.L);
        if (i >= this.I.size()) {
            return 0;
        }
        return this.I.get(i).intValue();
    }

    public final boolean f() {
        return this.K != -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final jcd g(zpc zpcVar, gqc gqcVar, boolean z) throws Throwable {
        long j;
        long jQ;
        yj5 yj5Var;
        yj5 yj5Var2;
        int i;
        int i2;
        bdd bddVar;
        a aVar;
        k4h n5Var;
        boolean zB;
        boolean z2;
        int i3;
        boolean z3;
        boolean z4;
        k4h a8wVar;
        long jA = zpcVar.a(gqcVar);
        long j2 = this.g;
        zxf0 zxf0Var = this.u;
        if (z) {
            try {
                zxf0Var.g(j2, this.s);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e) {
                throw new IOException(e);
            }
        }
        jcd jcdVar = new jcd(zpcVar, gqcVar.f, jA);
        int i4 = 0;
        if (this.C == null) {
            nsz nszVar = this.z;
            jcdVar.f = 0;
            try {
                nszVar.F(10);
                jcdVar.c(nszVar.a, 0, 10, false);
                if (nszVar.z() == 4801587) {
                    nszVar.J(3);
                    int iV = nszVar.v();
                    int i5 = iV + 10;
                    byte[] bArr = nszVar.a;
                    j = -9223372036854775807L;
                    if (i5 > bArr.length) {
                        nszVar.F(i5);
                        System.arraycopy(bArr, 0, nszVar.a, 0, 10);
                    }
                    jcdVar.c(nszVar.a, 10, iV, false);
                    uov uovVarW = this.y.w(iV, nszVar.a);
                    if (uovVarW == null) {
                        jQ = j;
                        break;
                    }
                    uov.a[] aVarArr = uovVarW.a;
                    int length = aVarArr.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= length) {
                            jQ = j;
                            break;
                        }
                        uov.a aVar2 = aVarArr[i6];
                        if (aVar2 instanceof rw20) {
                            rw20 rw20Var = (rw20) aVar2;
                            if ("com.apple.streaming.transportStreamTimestamp".equals(rw20Var.b)) {
                                System.arraycopy(rw20Var.c, 0, nszVar.a, 0, 8);
                                nszVar.I(0);
                                nszVar.H(8);
                                jQ = nszVar.q() & 8589934591L;
                                break;
                            }
                        }
                        i6++;
                    }
                } else {
                    jQ = -9223372036854775807L;
                    j = -9223372036854775807L;
                }
            } catch (EOFException unused2) {
                j = -9223372036854775807L;
            }
            jcdVar.f = 0;
            oam oamVar = this.r;
            if (oamVar != null) {
                yj5 yj5Var3 = (yj5) oamVar;
                zxf0 zxf0Var2 = yj5Var3.c;
                k4h k4hVar = yj5Var3.a;
                k4h k4hVarE = k4hVar.e();
                ly0.f(!((k4hVarE instanceof vxg0) || (k4hVarE instanceof ezi)));
                ly0.e("Can't recreate wrapped extractors. Outer type: " + k4hVar.getClass(), k4hVar.e() == k4hVar);
                if (k4hVar instanceof q0j0) {
                    a8wVar = new q0j0(yj5Var3.b.d, zxf0Var2, yj5Var3.d, yj5Var3.e);
                } else if (k4hVar instanceof em) {
                    a8wVar = new em(0);
                } else if (k4hVar instanceof n5) {
                    a8wVar = new n5();
                } else if (k4hVar instanceof r5) {
                    a8wVar = new r5();
                } else {
                    if (!(k4hVar instanceof a8w)) {
                        ib5.a("Unexpected extractor type for recreation: ".concat(k4hVar.getClass().getSimpleName()));
                        return null;
                    }
                    a8wVar = new a8w(0);
                }
                yj5Var2 = new yj5(a8wVar, yj5Var3.b, zxf0Var2, yj5Var3.d, yj5Var3.e);
                jQ = jQ;
                j2 = j2;
            } else {
                Uri uri = gqcVar.a;
                Map<String, List<String>> mapD = zpcVar.d();
                bdd bddVar2 = (bdd) this.v;
                bddVar2.getClass();
                a aVar3 = this.d;
                int iA = flh.a(aVar3.n);
                List<String> list = mapD.get("Content-Type");
                int iA2 = flh.a((list == null || list.isEmpty()) ? null : list.get(0));
                int iB = flh.b(uri);
                ArrayList arrayList = new ArrayList(7);
                bdd.a(iA, arrayList);
                bdd.a(iA2, arrayList);
                bdd.a(iB, arrayList);
                int i7 = 0;
                for (int i8 = 7; i7 < i8; i8 = 7) {
                    bdd.a(bdd.c[i7], arrayList);
                    i7++;
                }
                jcdVar.f = 0;
                k4h k4hVar2 = null;
                int i9 = 0;
                while (true) {
                    if (i9 >= arrayList.size()) {
                        jQ = jQ;
                        j2 = j2;
                        bdd bddVar3 = bddVar2;
                        k4hVar2.getClass();
                        yj5Var = new yj5(k4hVar2, aVar3, zxf0Var, bddVar3.a, bddVar3.b);
                        break;
                    }
                    int iIntValue = ((Integer) arrayList.get(i9)).intValue();
                    if (iIntValue == 0) {
                        i = i9;
                        jQ = jQ;
                        j2 = j2;
                        i2 = iIntValue;
                        bddVar = bddVar2;
                        aVar = aVar3;
                        n5Var = new n5();
                    } else if (iIntValue == 1) {
                        i = i9;
                        jQ = jQ;
                        j2 = j2;
                        i2 = iIntValue;
                        bddVar = bddVar2;
                        aVar = aVar3;
                        n5Var = new r5();
                    } else if (iIntValue == 2) {
                        i = i9;
                        jQ = jQ;
                        j2 = j2;
                        i2 = iIntValue;
                        bddVar = bddVar2;
                        aVar = aVar3;
                        n5Var = new em(0);
                    } else if (iIntValue != 7) {
                        List<a> listSingletonList = this.w;
                        ree0.a aVar4 = ree0.a.a;
                        i = i9;
                        if (iIntValue == 8) {
                            jQ = jQ;
                            j2 = j2;
                            i2 = iIntValue;
                            bddVar = bddVar2;
                            aVar = aVar3;
                            List<a> list2 = listSingletonList;
                            ree0.a aVar5 = bddVar.a;
                            boolean z5 = bddVar.b;
                            uov uovVar = aVar.l;
                            if (uovVar == null) {
                                z2 = false;
                                break;
                            }
                            int i10 = 0;
                            while (true) {
                                uov.a[] aVarArr2 = uovVar.a;
                                if (i10 >= aVarArr2.length) {
                                    z2 = false;
                                    break;
                                }
                                uov.a aVar6 = aVarArr2[i10];
                                if (aVar6 instanceof gbm) {
                                    z2 = !((gbm) aVar6).c.isEmpty();
                                    break;
                                }
                                i10++;
                            }
                            int i11 = z2 ? 4 : 0;
                            if (!z5) {
                                i11 |= 32;
                                aVar5 = aVar4;
                            }
                            if (list2 == null) {
                                pcn.b bVar = pcn.b;
                                list2 = c150.e;
                            }
                            n5Var = new ezi(aVar5, i11, zxf0Var, list2);
                        } else if (iIntValue != 11) {
                            n5Var = iIntValue != 13 ? null : new q0j0(aVar3.d, zxf0Var, bddVar2.a, bddVar2.b);
                            i2 = iIntValue;
                            bddVar = bddVar2;
                            aVar = aVar3;
                        } else {
                            j2 = j2;
                            ugd ugdVar = bddVar2.a;
                            boolean z6 = bddVar2.b;
                            if (listSingletonList != null) {
                                i3 = 48;
                            } else {
                                a.C0062a c0062a = new a.C0062a();
                                c0062a.m = gqv.m("application/cea-608");
                                listSingletonList = Collections.singletonList(new a(c0062a));
                                i3 = 16;
                            }
                            String str = aVar3.k;
                            if (TextUtils.isEmpty(str)) {
                                z3 = z6;
                            } else {
                                z4 = z6;
                                if (gqv.b(str, "audio/mp4a-latm") == null) {
                                    i3 |= 2;
                                }
                                z3 = z4;
                                if (gqv.b(str, "video/avc") == null) {
                                    i3 |= 4;
                                }
                            }
                            if (z3 != 0) {
                                z3 = z4;
                                aVar4 = ugdVar;
                            }
                            z3 = z4;
                            tid tidVar = new tid(i3, listSingletonList);
                            jQ = jQ;
                            i2 = iIntValue;
                            aVar = aVar3;
                            bddVar = bddVar2;
                            zxf0 zxf0Var3 = zxf0Var;
                            zxf0Var = zxf0Var3;
                            n5Var = new vxg0(2, !z3, aVar4, zxf0Var3, tidVar);
                        }
                    } else {
                        i = i9;
                        jQ = jQ;
                        j2 = j2;
                        i2 = iIntValue;
                        bddVar = bddVar2;
                        aVar = aVar3;
                        n5Var = new a8w(0L);
                    }
                    n5Var.getClass();
                    k4h k4hVar3 = n5Var;
                    try {
                        zB = k4hVar3.b(jcdVar);
                        i4 = 0;
                        jcdVar.f = 0;
                    } catch (EOFException unused3) {
                        i4 = 0;
                        jcdVar.f = 0;
                        zB = false;
                    } catch (Throwable th) {
                        jcdVar.f = 0;
                        throw th;
                    }
                    if (zB) {
                        yj5Var = new yj5(k4hVar3, aVar, zxf0Var, bddVar.a, bddVar.b);
                        break;
                    }
                    aVar3 = aVar;
                    if (k4hVar2 == null && (i2 == iA || i2 == iA2 || i2 == iB || i2 == 11)) {
                        k4hVar2 = k4hVar3;
                    }
                    bddVar2 = bddVar;
                    i9 = i + 1;
                    iA = iA;
                    jQ = jQ;
                    j2 = j2;
                    arrayList = arrayList;
                }
                yj5Var2 = yj5Var;
            }
            yj5 yj5Var4 = yj5Var2;
            this.C = yj5Var4;
            k4h k4hVarE2 = yj5Var4.a.e();
            if ((k4hVarE2 instanceof em) || (k4hVarE2 instanceof n5) || (k4hVarE2 instanceof r5) || (k4hVarE2 instanceof a8w)) {
                fbm fbmVar = this.D;
                long jB = jQ != j ? zxf0Var.b(jQ) : j2;
                if (fbmVar.k0 != jB) {
                    fbmVar.k0 = jB;
                    fbm.b[] bVarArr = fbmVar.K;
                    int length2 = bVarArr.length;
                    for (int i12 = i4; i12 < length2; i12++) {
                        fbm.b bVar2 = bVarArr[i12];
                        if (bVar2.F != jB) {
                            bVar2.F = jB;
                            bVar2.z = true;
                        }
                    }
                }
            } else {
                fbm fbmVar2 = this.D;
                if (fbmVar2.k0 != 0) {
                    fbmVar2.k0 = 0L;
                    fbm.b[] bVarArr2 = fbmVar2.K;
                    int length3 = bVarArr2.length;
                    for (int i13 = i4; i13 < length3; i13++) {
                        fbm.b bVar3 = bVarArr2[i13];
                        if (bVar3.F != 0) {
                            bVar3.F = 0L;
                            bVar3.z = true;
                        }
                    }
                }
            }
            this.D.M.clear();
            ((yj5) this.C).a.l(this.D);
        }
        fbm fbmVar3 = this.D;
        DrmInitData drmInitData = fbmVar3.l0;
        DrmInitData drmInitData2 = this.x;
        if (!Objects.equals(drmInitData, drmInitData2)) {
            fbmVar3.l0 = drmInitData2;
            while (true) {
                fbm.b[] bVarArr3 = fbmVar3.K;
                if (i4 >= bVarArr3.length) {
                    break;
                }
                if (fbmVar3.d0[i4]) {
                    fbm.b bVar4 = bVarArr3[i4];
                    bVar4.I = drmInitData2;
                    bVar4.z = true;
                }
                i4++;
            }
        }
        return jcdVar;
    }
}
