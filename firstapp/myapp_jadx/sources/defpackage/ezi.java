package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.DrmInitData;
import com.google.protobuf.Reader;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes.dex */
public final class ezi implements k4h {
    public static final byte[] N = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final androidx.media3.common.a O;
    public long A;
    public b B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public m4h H;
    public njg0[] I;
    public njg0[] J;
    public boolean K;
    public boolean L;
    public long M;
    public final ree0.a a;
    public final int b;
    public final List<androidx.media3.common.a> c;
    public final byte[] h;
    public final nsz i;
    public final zxf0 j;
    public final g850 o;
    public final on7 p;
    public c150 q;
    public int r;
    public int s;
    public long t;
    public int u;
    public nsz v;
    public long w;
    public int x;
    public long y;
    public long z;
    public final zpg k = new zpg();
    public final nsz l = new nsz(16);
    public final nsz e = new nsz(qbx.a);
    public final nsz f = new nsz(6);
    public final nsz g = new nsz();
    public final ArrayDeque<c8w.a> m = new ArrayDeque<>();
    public final ArrayDeque<a> n = new ArrayDeque<>();
    public final SparseArray<b> d = new SparseArray<>();

    public static final class a {
        public final long a;
        public final boolean b;
        public final int c;

        public a(int i, long j, boolean z) {
            this.a = j;
            this.b = z;
            this.c = i;
        }
    }

    public static final class b {
        public final njg0 a;
        public ojg0 d;
        public mfd e;
        public int f;
        public int g;
        public int h;
        public int i;
        public final androidx.media3.common.a j;
        public boolean m;
        public final hjg0 b = new hjg0();
        public final nsz c = new nsz();
        public final nsz k = new nsz(1);
        public final nsz l = new nsz();

        public b(njg0 njg0Var, ojg0 ojg0Var, mfd mfdVar, androidx.media3.common.a aVar) {
            this.a = njg0Var;
            this.d = ojg0Var;
            this.e = mfdVar;
            this.j = aVar;
            this.d = ojg0Var;
            this.e = mfdVar;
            njg0Var.d(aVar);
            e();
        }

        public final int a() {
            int i;
            if (this.m) {
                i = this.b.j[this.f] ? 1 : 0;
            } else {
                i = this.d.g[this.f];
            }
            return b() != null ? 1073741824 | i : i;
        }

        public final gjg0 b() {
            if (!this.m) {
                return null;
            }
            hjg0 hjg0Var = this.b;
            mfd mfdVar = hjg0Var.a;
            String str = jrh0.a;
            int i = mfdVar.a;
            gjg0 gjg0Var = hjg0Var.m;
            if (gjg0Var == null) {
                gjg0Var = this.d.a.l[i];
            }
            if (gjg0Var == null || !gjg0Var.a) {
                return null;
            }
            return gjg0Var;
        }

        public final boolean c() {
            this.f++;
            if (!this.m) {
                return false;
            }
            int i = this.g + 1;
            this.g = i;
            int[] iArr = this.b.g;
            int i2 = this.h;
            if (i != iArr[i2]) {
                return true;
            }
            this.h = i2 + 1;
            this.g = 0;
            return false;
        }

        public final int d(int i, int i2) {
            nsz nszVar;
            gjg0 gjg0VarB = b();
            if (gjg0VarB == null) {
                return 0;
            }
            int length = gjg0VarB.d;
            hjg0 hjg0Var = this.b;
            if (length != 0) {
                nszVar = hjg0Var.n;
            } else {
                byte[] bArr = gjg0VarB.e;
                String str = jrh0.a;
                int length2 = bArr.length;
                nsz nszVar2 = this.l;
                nszVar2.G(length2, bArr);
                length = bArr.length;
                nszVar = nszVar2;
            }
            boolean z = hjg0Var.k && hjg0Var.l[this.f];
            boolean z2 = z || i2 != 0;
            nsz nszVar3 = this.k;
            nszVar3.a[0] = (byte) ((z2 ? 128 : 0) | length);
            nszVar3.I(0);
            njg0 njg0Var = this.a;
            njg0Var.b(nszVar3, 1, 1);
            njg0Var.b(nszVar, length, 1);
            if (!z2) {
                return length + 1;
            }
            nsz nszVar4 = this.c;
            if (!z) {
                nszVar4.F(8);
                byte[] bArr2 = nszVar4.a;
                bArr2[0] = 0;
                bArr2[1] = 1;
                bArr2[2] = 0;
                bArr2[3] = (byte) (i2 & 255);
                bArr2[4] = (byte) ((i >> 24) & 255);
                bArr2[5] = (byte) ((i >> 16) & 255);
                bArr2[6] = (byte) ((i >> 8) & 255);
                bArr2[7] = (byte) (i & 255);
                njg0Var.b(nszVar4, 8, 1);
                return length + 9;
            }
            nsz nszVar5 = hjg0Var.n;
            int iC = nszVar5.C();
            nszVar5.J(-2);
            int i3 = (iC * 6) + 2;
            if (i2 != 0) {
                nszVar4.F(i3);
                byte[] bArr3 = nszVar4.a;
                nszVar5.h(bArr3, 0, i3);
                int i4 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
                bArr3[2] = (byte) ((i4 >> 8) & 255);
                bArr3[3] = (byte) (i4 & 255);
            } else {
                nszVar4 = nszVar5;
            }
            njg0Var.b(nszVar4, i3, 1);
            return length + 1 + i3;
        }

        public final void e() {
            hjg0 hjg0Var = this.b;
            hjg0Var.d = 0;
            hjg0Var.p = 0L;
            hjg0Var.q = false;
            hjg0Var.k = false;
            hjg0Var.o = false;
            hjg0Var.m = null;
            this.f = 0;
            this.h = 0;
            this.g = 0;
            this.i = 0;
            this.m = false;
        }
    }

    static {
        androidx.media3.common.a.C0062a c0062a = new androidx.media3.common.a.C0062a();
        c0062a.m = gqv.m("application/x-emsg");
        O = new androidx.media3.common.a(c0062a);
    }

    public ezi(ree0.a aVar, int i, zxf0 zxf0Var, List list) {
        this.a = aVar;
        this.b = i;
        this.j = zxf0Var;
        this.c = Collections.unmodifiableList(list);
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.i = new nsz(bArr);
        pcn.b bVar = pcn.b;
        this.q = c150.e;
        this.z = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.A = -9223372036854775807L;
        this.H = m4h.m;
        this.I = new njg0[0];
        this.J = new njg0[0];
        this.o = new g850(new g850.b() { // from class: dzi
            @Override // g850.b
            public final void a(long j, nsz nszVar) {
                zu6.a(j, nszVar, this.a.J);
            }
        });
        this.p = new on7();
        this.M = -1L;
    }

    public static DrmInitData f(ArrayList arrayList) {
        UUID[] uuidArr;
        i830 i830Var;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        ArrayList arrayList2 = null;
        while (i2 < size) {
            c8w.b bVar = (c8w.b) arrayList.get(i2);
            if (bVar.a == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = bVar.b.a;
                nsz nszVar = new nsz(bArr);
                if (nszVar.c < 32) {
                    i830Var = null;
                } else {
                    nszVar.I(i);
                    int iA = nszVar.a();
                    int iJ = nszVar.j();
                    if (iJ != iA) {
                        cft.g("PsshAtomUtil", "Advertised atom size (" + iJ + ") does not match buffer size: " + iA);
                    } else {
                        int iJ2 = nszVar.j();
                        if (iJ2 != 1886614376) {
                            h08.a(iJ2, "Atom type is not pssh: ", "PsshAtomUtil");
                        } else {
                            int iE = l75.e(nszVar.j());
                            if (iE > 1) {
                                h08.a(iE, "Unsupported pssh version: ", "PsshAtomUtil");
                            } else {
                                UUID uuid = new UUID(nszVar.q(), nszVar.q());
                                if (iE == 1) {
                                    int iA2 = nszVar.A();
                                    uuidArr = new UUID[iA2];
                                    int i3 = i;
                                    while (i3 < iA2) {
                                        UUID[] uuidArr2 = uuidArr;
                                        int i4 = i3;
                                        uuidArr2[i4] = new UUID(nszVar.q(), nszVar.q());
                                        i3 = i4 + 1;
                                        uuidArr = uuidArr2;
                                    }
                                } else {
                                    uuidArr = null;
                                }
                                int iA3 = nszVar.A();
                                int iA4 = nszVar.a();
                                if (iA3 != iA4) {
                                    cft.g("PsshAtomUtil", "Atom data size (" + iA3 + ") does not match the bytes left: " + iA4);
                                } else {
                                    byte[] bArr2 = new byte[iA3];
                                    nszVar.h(bArr2, 0, iA3);
                                    i830Var = new i830(uuid, iE, bArr2, uuidArr);
                                }
                            }
                        }
                    }
                    i830Var = null;
                }
                UUID uuid2 = i830Var == null ? null : i830Var.a;
                if (uuid2 == null) {
                    cft.g("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new DrmInitData.SchemeData(uuid2, null, "video/mp4", bArr));
                }
            }
            i2++;
            i = 0;
        }
        if (arrayList2 == null) {
            return null;
        }
        return new DrmInitData(null, false, (DrmInitData.SchemeData[]) arrayList2.toArray(new DrmInitData.SchemeData[0]));
    }

    public static void g(nsz nszVar, int i, hjg0 hjg0Var) throws ssz {
        nszVar.I(i + 8);
        int iJ = nszVar.j();
        byte[] bArr = l75.a;
        if ((iJ & 1) != 0) {
            throw ssz.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iJ & 2) != 0;
        int iA = nszVar.A();
        if (iA == 0) {
            Arrays.fill(hjg0Var.l, 0, hjg0Var.e, false);
            return;
        }
        int i2 = hjg0Var.e;
        nsz nszVar2 = hjg0Var.n;
        if (iA != i2) {
            StringBuilder sbA = efe0.a(iA, "Senc sample count ", " is different from fragment sample count");
            sbA.append(hjg0Var.e);
            throw ssz.a(null, sbA.toString());
        }
        Arrays.fill(hjg0Var.l, 0, iA, z);
        nszVar2.F(nszVar.a());
        hjg0Var.k = true;
        hjg0Var.o = true;
        nszVar.h(nszVar2.a, 0, nszVar2.c);
        nszVar2.I(0);
        hjg0Var.o = false;
    }

    public static Pair h(long j, nsz nszVar) throws ssz {
        long jB;
        long jB2;
        nsz nszVar2 = nszVar;
        nszVar2.I(8);
        int iE = l75.e(nszVar2.j());
        nszVar2.J(4);
        long jY = nszVar2.y();
        if (iE == 0) {
            jB = nszVar2.y();
            jB2 = nszVar2.y();
        } else {
            jB = nszVar2.B();
            jB2 = nszVar2.B();
        }
        long j2 = jB2 + j;
        String str = jrh0.a;
        long jV = jrh0.V(jB, 1000000L, jY, RoundingMode.DOWN);
        nszVar2.J(2);
        int iC = nszVar2.C();
        int[] iArr = new int[iC];
        long[] jArr = new long[iC];
        long[] jArr2 = new long[iC];
        long[] jArr3 = new long[iC];
        long j3 = j2;
        long j4 = jV;
        int i = 0;
        while (i < iC) {
            int iJ = nszVar2.j();
            if ((Integer.MIN_VALUE & iJ) != 0) {
                throw ssz.a(null, "Unhandled indirect reference");
            }
            long jY2 = nszVar2.y();
            iArr[i] = iJ & Reader.READ_DONE;
            jArr[i] = j3;
            jArr3[i] = j4;
            jB += jY2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long jV2 = jrh0.V(jB, 1000000L, jY, RoundingMode.DOWN);
            jArr4[i] = jV2 - jArr5[i];
            nszVar2.J(4);
            j3 += (long) iArr[i];
            i++;
            iC = iC;
            nszVar2 = nszVar;
            j4 = jV2;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(jV), new nn7(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0205  */
    /* JADX WARN: Code duplicated, block: B:137:0x0288  */
    /* JADX WARN: Code duplicated, block: B:529:0x0295 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    @Override // defpackage.k4h
    public final int a(l4h l4hVar, k620 k620Var) throws ssz {
        g850 g850Var;
        nsz nszVar;
        ArrayDeque<a> arrayDeque;
        int i;
        zxf0 zxf0Var;
        b bVar;
        boolean z;
        int i2;
        b bVar2;
        int i3;
        int i4;
        String str;
        String str2;
        int iC;
        int i5;
        int i6;
        int iD;
        int i7;
        String strR;
        String strR2;
        long jV;
        long j;
        long jA;
        long j2;
        long jY;
        l4h l4hVar2 = l4hVar;
        while (true) {
            int i8 = this.r;
            ArrayDeque<c8w.a> arrayDeque2 = this.m;
            g850Var = this.o;
            nszVar = this.i;
            on7 on7Var = this.p;
            SparseArray<b> sparseArray = this.d;
            boolean z2 = true;
            if (i8 != 0) {
                arrayDeque = this.n;
                i = this.b;
                zxf0Var = this.j;
                if (i8 != 1) {
                    long j3 = Long.MAX_VALUE;
                    if (i8 != 2) {
                        bVar = this.B;
                        if (bVar != null) {
                            z = true;
                            i2 = 8;
                            break;
                        }
                        int size = sparseArray.size();
                        int i9 = 0;
                        b bVar3 = null;
                        while (i9 < size) {
                            b bVarValueAt = sparseArray.valueAt(i9);
                            boolean z3 = z2;
                            boolean z4 = bVarValueAt.m;
                            hjg0 hjg0Var = bVarValueAt.b;
                            if (z4) {
                                i7 = size;
                            } else {
                                i7 = size;
                                if (bVarValueAt.f != bVarValueAt.d.b) {
                                }
                                i9++;
                                z2 = z3;
                                size = i7;
                            }
                            if (!z4 || bVarValueAt.h != hjg0Var.d) {
                                long j4 = !z4 ? bVarValueAt.d.c[bVarValueAt.f] : hjg0Var.f[bVarValueAt.h];
                                if (j4 < j3) {
                                    bVar3 = bVarValueAt;
                                    j3 = j4;
                                }
                            }
                            i9++;
                            z2 = z3;
                            size = i7;
                        }
                        z = z2;
                        i2 = 8;
                        if (bVar3 != null) {
                            int position = (int) ((!bVar3.m ? bVar3.d.c[bVar3.f] : bVar3.b.f[bVar3.h]) - l4hVar2.getPosition());
                            if (position < 0) {
                                cft.g("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                position = 0;
                            }
                            l4hVar2.l(position);
                            this.B = bVar3;
                            bVar = bVar3;
                            break;
                        }
                        int position2 = (int) (this.w - l4hVar2.getPosition());
                        if (position2 < 0) {
                            throw ssz.a(null, "Offset to end of mdat was negative.");
                        }
                        l4hVar2.l(position2);
                        d();
                    } else {
                        int size2 = sparseArray.size();
                        b bVarValueAt2 = null;
                        for (int i10 = 0; i10 < size2; i10++) {
                            hjg0 hjg0Var2 = sparseArray.valueAt(i10).b;
                            if (hjg0Var2.o) {
                                long j5 = hjg0Var2.c;
                                if (j5 < j3) {
                                    bVarValueAt2 = sparseArray.valueAt(i10);
                                    j3 = j5;
                                }
                            }
                        }
                        if (bVarValueAt2 == null) {
                            this.r = 3;
                        } else {
                            int position3 = (int) (j3 - l4hVar2.getPosition());
                            if (position3 < 0) {
                                throw ssz.a(null, "Offset to encryption data was negative.");
                            }
                            l4hVar2.l(position3);
                            hjg0 hjg0Var3 = bVarValueAt2.b;
                            nsz nszVar2 = hjg0Var3.n;
                            l4hVar2.readFully(nszVar2.a, 0, nszVar2.c);
                            nszVar2.I(0);
                            hjg0Var3.o = false;
                        }
                    }
                } else {
                    int i11 = (int) (this.t - ((long) this.u));
                    nsz nszVar3 = this.v;
                    if (nszVar3 != null) {
                        l4hVar2.readFully(nszVar3.a, 8, i11);
                        int i12 = this.s;
                        c8w.b bVar4 = new c8w.b(i12, nszVar3);
                        if (!arrayDeque2.isEmpty()) {
                            arrayDeque2.peek().c.add(bVar4);
                        } else if (i12 == 1936286840) {
                            Pair pairH = h(l4hVar2.getPosition(), nszVar3);
                            on7Var.a((nn7) pairH.second);
                            if (!this.K) {
                                this.A = ((Long) pairH.first).longValue();
                                this.H.k((p480) pairH.second);
                                this.K = true;
                            } else if ((i & 256) != 0 && !this.L && on7Var.a.size() > 1) {
                                this.M = l4hVar2.getPosition();
                            }
                        } else if (i12 == 1701671783 && this.I.length != 0) {
                            nszVar3.I(8);
                            int iE = l75.e(nszVar3.j());
                            if (iE == 0) {
                                strR = nszVar3.r();
                                strR.getClass();
                                strR2 = nszVar3.r();
                                strR2.getClass();
                                long jY2 = nszVar3.y();
                                long jY3 = nszVar3.y();
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                long jV2 = jrh0.V(jY3, 1000000L, jY2, roundingMode);
                                long j6 = this.A;
                                long j7 = j6 != -9223372036854775807L ? j6 + jV2 : -9223372036854775807L;
                                jV = jrh0.V(nszVar3.y(), 1000L, jY2, roundingMode);
                                long j8 = j7;
                                j = jV2;
                                jA = j8;
                                j2 = -9223372036854775807L;
                                jY = nszVar3.y();
                            } else if (iE != 1) {
                                h08.a(iE, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor");
                            } else {
                                long jY4 = nszVar3.y();
                                long jB = nszVar3.B();
                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                jA = jrh0.V(jB, 1000000L, jY4, roundingMode2);
                                long jV3 = jrh0.V(nszVar3.y(), 1000L, jY4, roundingMode2);
                                long jY5 = nszVar3.y();
                                strR = nszVar3.r();
                                strR.getClass();
                                strR2 = nszVar3.r();
                                strR2.getClass();
                                j2 = -9223372036854775807L;
                                jY = jY5;
                                jV = jV3;
                                j = -9223372036854775807L;
                            }
                            byte[] bArr = new byte[nszVar3.a()];
                            nszVar3.h(bArr, 0, nszVar3.a());
                            zpg zpgVar = this.k;
                            DataOutputStream dataOutputStream = zpgVar.b;
                            ByteArrayOutputStream byteArrayOutputStream = zpgVar.a;
                            byteArrayOutputStream.reset();
                            try {
                                dataOutputStream.writeBytes(strR);
                                dataOutputStream.writeByte(0);
                                dataOutputStream.writeBytes(strR2);
                                dataOutputStream.writeByte(0);
                                dataOutputStream.writeLong(jV);
                                dataOutputStream.writeLong(jY);
                                dataOutputStream.write(bArr);
                                dataOutputStream.flush();
                                nsz nszVar4 = new nsz(byteArrayOutputStream.toByteArray());
                                int iA = nszVar4.a();
                                for (njg0 njg0Var : this.I) {
                                    nszVar4.I(0);
                                    njg0Var.f(iA, nszVar4);
                                }
                                if (jA == j2) {
                                    arrayDeque.addLast(new a(iA, j, true));
                                    this.x += iA;
                                } else if (!arrayDeque.isEmpty()) {
                                    arrayDeque.addLast(new a(iA, jA, false));
                                    this.x += iA;
                                } else if (zxf0Var == null || zxf0Var.e()) {
                                    if (zxf0Var != null) {
                                        jA = zxf0Var.a(jA);
                                    }
                                    long j9 = jA;
                                    for (njg0 njg0Var2 : this.I) {
                                        njg0Var2.a(j9, 1, iA, 0, null);
                                    }
                                } else {
                                    arrayDeque.addLast(new a(iA, jA, false));
                                    this.x += iA;
                                }
                            } catch (IOException e) {
                                gqm.a(e);
                                return 0;
                            }
                        }
                        l4hVar2 = l4hVar;
                    } else {
                        l4hVar2.l(i11);
                    }
                    j(l4hVar2.getPosition());
                }
            } else {
                int i13 = this.u;
                long length = 0;
                nsz nszVar5 = this.l;
                if (i13 == 0) {
                    if (!l4hVar2.f(nszVar5.a, 0, 8, true)) {
                        long j10 = this.M;
                        if (j10 == -1) {
                            g850Var.b(0);
                            return -1;
                        }
                        k620Var.a = j10;
                        this.M = -1L;
                        m4h m4hVar = this.H;
                        on7Var.getClass();
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        for (nn7 nn7Var : on7Var.a.values()) {
                            arrayList.add(nn7Var.b);
                            arrayList2.add(nn7Var.c);
                            arrayList3.add(nn7Var.d);
                            arrayList4.add(nn7Var.e);
                        }
                        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
                        for (int[] iArr2 : iArr) {
                            length += (long) iArr2.length;
                        }
                        int i14 = (int) length;
                        im20.c(length == ((long) i14), "the total number of elements (%s) in the arrays must fit in an int", length);
                        int[] iArr3 = new int[i14];
                        int length2 = 0;
                        for (int[] iArr4 : iArr) {
                            System.arraycopy(iArr4, 0, iArr3, length2, iArr4.length);
                            length2 += iArr4.length;
                        }
                        m4hVar.k(new nn7(iArr3, vkt.a((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), vkt.a((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), vkt.a((long[][]) arrayList4.toArray(new long[arrayList4.size()][]))));
                        this.L = true;
                        return 1;
                    }
                    this.u = 8;
                    nszVar5.I(0);
                    this.t = nszVar5.y();
                    this.s = nszVar5.j();
                }
                long j11 = this.t;
                if (j11 == 1) {
                    l4hVar2.readFully(nszVar5.a, 8, 8);
                    this.u += 8;
                    this.t = nszVar5.B();
                } else if (j11 == 0) {
                    long length3 = l4hVar2.getLength();
                    if (length3 == -1 && !arrayDeque2.isEmpty()) {
                        length3 = arrayDeque2.peek().b;
                    }
                    if (length3 != -1) {
                        this.t = (length3 - l4hVar2.getPosition()) + ((long) this.u);
                    }
                }
                long j12 = this.t;
                long j13 = this.u;
                if (j12 < j13) {
                    throw ssz.c("Atom size less than header length (unsupported).");
                }
                if (this.M != -1) {
                    if (this.s == 1936286840) {
                        nszVar.F((int) j12);
                        System.arraycopy(nszVar5.a, 0, nszVar.a, 0, 8);
                        l4hVar2.readFully(nszVar.a, 8, (int) (this.t - ((long) this.u)));
                        on7Var.a((nn7) h(l4hVar2.h(), nszVar).second);
                    } else {
                        l4hVar2.b((int) (j12 - j13), true);
                    }
                    d();
                } else {
                    long position4 = l4hVar2.getPosition() - ((long) this.u);
                    int i15 = this.s;
                    if ((i15 == 1836019558 || i15 == 1835295092) && !this.K) {
                        this.H.k(new p480.b(this.z, position4));
                        this.K = true;
                    }
                    if (this.s == 1836019558) {
                        int size3 = sparseArray.size();
                        for (int i16 = 0; i16 < size3; i16++) {
                            hjg0 hjg0Var4 = sparseArray.valueAt(i16).b;
                            hjg0Var4.getClass();
                            hjg0Var4.c = position4;
                            hjg0Var4.b = position4;
                        }
                    }
                    int i17 = this.s;
                    if (i17 == 1835295092) {
                        this.B = null;
                        this.w = position4 + this.t;
                        this.r = 2;
                    } else if (i17 == 1836019574 || i17 == 1953653099 || i17 == 1835297121 || i17 == 1835626086 || i17 == 1937007212 || i17 == 1836019558 || i17 == 1953653094 || i17 == 1836475768 || i17 == 1701082227 || i17 == 1835365473) {
                        long position5 = l4hVar2.getPosition();
                        long j14 = this.t;
                        long j15 = (position5 + j14) - 8;
                        if (j14 != this.u && this.s == 1835365473) {
                            nszVar.F(8);
                            l4hVar2.m(nszVar.a, 0, 8);
                            l75.a(nszVar);
                            l4hVar2.l(nszVar.b);
                            l4hVar2.e();
                        }
                        arrayDeque2.push(new c8w.a(this.s, j15));
                        if (this.t == this.u) {
                            j(j15);
                        } else {
                            d();
                        }
                    } else if (i17 == 1751411826 || i17 == 1835296868 || i17 == 1836476516 || i17 == 1936286840 || i17 == 1937011556 || i17 == 1937011827 || i17 == 1668576371 || i17 == 1937011555 || i17 == 1937011578 || i17 == 1937013298 || i17 == 1937007471 || i17 == 1668232756 || i17 == 1937011571 || i17 == 1952867444 || i17 == 1952868452 || i17 == 1953196132 || i17 == 1953654136 || i17 == 1953658222 || i17 == 1886614376 || i17 == 1935763834 || i17 == 1935763823 || i17 == 1936027235 || i17 == 1970628964 || i17 == 1935828848 || i17 == 1936158820 || i17 == 1701606260 || i17 == 1835362404 || i17 == 1701671783 || i17 == 1969517665 || i17 == 1801812339 || i17 == 1768715124) {
                        if (this.u != 8) {
                            throw ssz.c("Leaf atom defines extended atom size (unsupported).");
                        }
                        if (this.t > 2147483647L) {
                            throw ssz.c("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        nsz nszVar6 = new nsz((int) this.t);
                        System.arraycopy(nszVar5.a, 0, nszVar6.a, 0, 8);
                        this.v = nszVar6;
                        this.r = 1;
                    } else {
                        if (this.t > 2147483647L) {
                            throw ssz.c("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.v = null;
                        this.r = 1;
                    }
                }
            }
        }
        njg0 njg0Var3 = bVar.a;
        hjg0 hjg0Var5 = bVar.b;
        String str3 = "video/avc";
        if (this.r == 3) {
            this.C = !bVar.m ? bVar.d.d[bVar.f] : hjg0Var5.h[bVar.f];
            androidx.media3.common.a aVar = bVar.d.a.g;
            this.F = !((!Objects.equals(aVar.n, "video/avc") ? !(!Objects.equals(aVar.n, "video/hevc") || (i & 128) == 0) : (i & 64) != 0) ? false : z);
            if (bVar.f < bVar.i) {
                l4hVar2.l(this.C);
                gjg0 gjg0VarB = bVar.b();
                if (gjg0VarB != null) {
                    nsz nszVar7 = hjg0Var5.n;
                    int i18 = gjg0VarB.d;
                    if (i18 != 0) {
                        nszVar7.J(i18);
                    }
                    int i19 = bVar.f;
                    if (hjg0Var5.k && hjg0Var5.l[i19]) {
                        nszVar7.J(nszVar7.C() * 6);
                    }
                }
                if (!bVar.c()) {
                    this.B = null;
                }
                this.r = 3;
                return 0;
            }
            if (bVar.d.a.h == z) {
                this.C -= 8;
                l4hVar2.l(i2);
            }
            boolean zEquals = "audio/ac4".equals(bVar.d.a.g.n);
            int i20 = this.C;
            if (zEquals) {
                this.D = bVar.d(i20, 7);
                t5.a(this.C, nszVar);
                njg0Var3.f(7, nszVar);
                iD = this.D + 7;
                this.D = iD;
                i6 = 0;
            } else {
                i6 = 0;
                iD = bVar.d(i20, 0);
                this.D = iD;
            }
            this.C += iD;
            this.r = 4;
            this.E = i6;
        }
        ojg0 ojg0Var = bVar.d;
        fjg0 fjg0Var = ojg0Var.a;
        String str4 = "video/hevc";
        long jA2 = bVar.m ? hjg0Var5.i[bVar.f] : ojg0Var.f[bVar.f];
        if (zxf0Var != null) {
            jA2 = zxf0Var.a(jA2);
        }
        int i21 = fjg0Var.k;
        androidx.media3.common.a aVar2 = fjg0Var.g;
        if (i21 == 0) {
            bVar2 = bVar;
            while (true) {
                int i22 = this.D;
                int i23 = this.C;
                if (i22 >= i23) {
                    break;
                }
                this.D += njg0Var3.c(l4hVar2, i23 - i22, false);
            }
        } else {
            nsz nszVar8 = this.f;
            byte[] bArr2 = nszVar8.a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i24 = 4 - i21;
            while (true) {
                bVar2 = bVar;
                if (this.D >= this.C) {
                    break;
                }
                int i25 = this.E;
                if (i25 == 0) {
                    if (this.J.length > 0 || !this.F) {
                        int iD2 = qbx.d(aVar2);
                        if (i21 + iD2 <= this.C - this.D) {
                            i5 = iD2;
                        } else {
                            i5 = 0;
                        }
                    } else {
                        i5 = 0;
                    }
                    l4hVar2.readFully(bArr2, i24, i21 + i5);
                    nszVar8.I(0);
                    int iJ = nszVar8.j();
                    if (iJ < 0) {
                        throw ssz.a(null, "Invalid NAL length");
                    }
                    this.E = iJ - i5;
                    nsz nszVar9 = this.e;
                    i3 = i21;
                    nszVar9.I(0);
                    njg0Var3.f(4, nszVar9);
                    this.D += 4;
                    this.C += i24;
                    if (this.J.length <= 0 || i5 <= 0) {
                        i4 = i24;
                        str = str3;
                        str2 = str4;
                    } else {
                        byte b2 = bArr2[4];
                        String str5 = aVar2.n;
                        i4 = i24;
                        String str6 = aVar2.k;
                        if (Objects.equals(str5, str3) || gqv.b(str6, str3) != null) {
                            str = str3;
                            if ((b2 & 31) == 6) {
                                str2 = str4;
                            }
                            this.G = z;
                            njg0Var3.f(i5, nszVar8);
                            this.D += i5;
                            if (i5 <= 0 && !this.F && qbx.c(bArr2, i5, aVar2)) {
                                this.F = true;
                            }
                        } else {
                            str = str3;
                        }
                        str2 = str4;
                        boolean z5 = (Objects.equals(aVar2.n, str2) || gqv.b(str6, str2) != null) && ((b2 & 126) >> 1) == 39;
                        this.G = z5;
                        njg0Var3.f(i5, nszVar8);
                        this.D += i5;
                        if (i5 <= 0) {
                        }
                    }
                    this.G = z5;
                    njg0Var3.f(i5, nszVar8);
                    this.D += i5;
                    if (i5 <= 0) {
                    }
                } else {
                    i3 = i21;
                    i4 = i24;
                    str = str3;
                    str2 = str4;
                    if (this.G) {
                        nsz nszVar10 = this.g;
                        nszVar10.F(i25);
                        l4hVar2.readFully(nszVar10.a, 0, this.E);
                        njg0Var3.f(this.E, nszVar10);
                        int i26 = this.E;
                        int iL = qbx.l(nszVar10.c, nszVar10.a);
                        nszVar10.I(0);
                        nszVar10.H(iL);
                        int i27 = aVar2.p;
                        if (i27 == -1) {
                            if (g850Var.e != 0) {
                                g850Var.c(0);
                            }
                        } else if (g850Var.e != i27) {
                            g850Var.c(i27);
                        }
                        g850Var.a(jA2, nszVar10);
                        if ((bVar2.a() & 4) != 0) {
                            g850Var.b(0);
                        }
                        iC = i26;
                    } else {
                        iC = njg0Var3.c(l4hVar2, i25, false);
                    }
                    this.D += iC;
                    this.E -= iC;
                }
                str4 = str2;
                i24 = i4;
                bVar = bVar2;
                i21 = i3;
                str3 = str;
            }
        }
        int iA2 = bVar2.a();
        if (!this.F) {
            iA2 |= 67108864;
        }
        int i28 = iA2;
        gjg0 gjg0VarB2 = bVar2.b();
        long j16 = jA2;
        njg0Var3.a(j16, i28, this.C, 0, gjg0VarB2 != null ? gjg0VarB2.c : null);
        while (!arrayDeque.isEmpty()) {
            a aVarRemoveFirst = arrayDeque.removeFirst();
            this.x -= aVarRemoveFirst.c;
            long jA3 = aVarRemoveFirst.a;
            if (aVarRemoveFirst.b) {
                jA3 += j16;
            }
            if (zxf0Var != null) {
                jA3 = zxf0Var.a(jA3);
            }
            long j17 = jA3;
            for (njg0 njg0Var4 : this.I) {
                njg0Var4.a(j17, 1, aVarRemoveFirst.c, this.x, null);
            }
        }
        if (!bVar2.c()) {
            this.B = null;
        }
        this.r = 3;
        return 0;
    }

    @Override // defpackage.k4h
    public final boolean b(l4h l4hVar) {
        c150 c150VarN;
        w6a0 w6a0VarB = x6a0.b(l4hVar, true, false);
        if (w6a0VarB != null) {
            c150VarN = pcn.n(w6a0VarB);
        } else {
            pcn.b bVar = pcn.b;
            c150VarN = c150.e;
        }
        this.q = c150VarN;
        return w6a0VarB == null;
    }

    @Override // defpackage.k4h
    public final void c(long j, long j2) {
        SparseArray<b> sparseArray = this.d;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray.valueAt(i).e();
        }
        this.n.clear();
        this.x = 0;
        this.o.d.clear();
        this.y = j2;
        this.m.clear();
        d();
    }

    public final void d() {
        this.r = 0;
        this.u = 0;
    }

    @Override // defpackage.k4h
    public final List i() {
        return this.q;
    }

    /* JADX WARN: Code duplicated, block: B:163:0x042b  */
    /* JADX WARN: Code duplicated, block: B:272:0x0654  */
    public final void j(long j) throws ssz {
        uov uovVar;
        int i;
        long j2;
        mfd mfdVar;
        int i2;
        mfd mfdVar2;
        ArrayList arrayList;
        int i3;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i4;
        int i5;
        byte[] bArr;
        int i6;
        boolean z;
        while (true) {
            ArrayDeque<c8w.a> arrayDeque = this.m;
            if (arrayDeque.isEmpty() || arrayDeque.peek().b != j) {
                break;
            }
            c8w.a aVarPop = arrayDeque.pop();
            int i7 = aVarPop.a;
            ArrayList arrayList4 = aVarPop.d;
            ArrayList arrayList5 = aVarPop.c;
            int i8 = this.b;
            int i9 = 12;
            SparseArray<b> sparseArray = this.d;
            if (i7 == 1836019574) {
                DrmInitData drmInitDataF = f(arrayList5);
                c8w.a aVarB = aVarPop.b(1836475768);
                aVarB.getClass();
                SparseArray sparseArray2 = new SparseArray();
                ArrayList arrayList6 = aVarB.c;
                int size = arrayList6.size();
                int i10 = 0;
                long jY = -9223372036854775807L;
                while (i10 < size) {
                    c8w.b bVar = (c8w.b) arrayList6.get(i10);
                    int i11 = bVar.a;
                    nsz nszVar = bVar.b;
                    if (i11 == 1953654136) {
                        nszVar.I(i9);
                        arrayList = arrayList6;
                        Pair pairCreate = Pair.create(Integer.valueOf(nszVar.j()), new mfd(nszVar.j() - 1, nszVar.j(), nszVar.j(), nszVar.j()));
                        sparseArray2.put(((Integer) pairCreate.first).intValue(), (mfd) pairCreate.second);
                    } else {
                        arrayList = arrayList6;
                        if (i11 == 1835362404) {
                            nszVar.I(8);
                            jY = l75.e(nszVar.j()) == 0 ? nszVar.y() : nszVar.B();
                        }
                    }
                    i10++;
                    arrayList6 = arrayList;
                    i9 = 12;
                }
                int i12 = 0;
                c8w.a aVarB2 = aVarPop.b(1835365473);
                uov uovVarF = aVarB2 != null ? l75.f(aVarB2) : null;
                hyj hyjVar = new hyj();
                c8w.b bVarC = aVarPop.c(1969517665);
                if (bVarC != null) {
                    uov uovVarK = l75.k(bVarC);
                    hyjVar.b(uovVarK);
                    uovVar = uovVarK;
                } else {
                    uovVar = null;
                }
                c8w.b bVarC2 = aVarPop.c(1836476516);
                bVarC2.getClass();
                uov uovVar2 = new uov(l75.g(bVarC2.b));
                ArrayList arrayListJ = l75.j(aVarPop, hyjVar, jY, drmInitDataF, (i8 & 16) != 0, false, new czi());
                int size2 = arrayListJ.size();
                if (sparseArray.size() == 0) {
                    String strA = ws8.a(arrayListJ);
                    int i13 = 0;
                    while (i13 < size2) {
                        ojg0 ojg0Var = (ojg0) arrayListJ.get(i13);
                        fjg0 fjg0Var = ojg0Var.a;
                        m4h m4hVar = this.H;
                        int i14 = fjg0Var.b;
                        int i15 = fjg0Var.a;
                        String str = strA;
                        androidx.media3.common.a aVar = fjg0Var.g;
                        long j3 = fjg0Var.e;
                        njg0 njg0VarR = m4hVar.r(i13, i14);
                        njg0VarR.getClass();
                        int i16 = i13;
                        androidx.media3.common.a.C0062a c0062aA = aVar.a();
                        ArrayList arrayList7 = arrayListJ;
                        c0062aA.l = gqv.m(str);
                        if (i14 == 1) {
                            int i17 = hyjVar.a;
                            i = size2;
                            j2 = j3;
                            if (i17 != -1 && (i2 = hyjVar.b) != -1) {
                                c0062aA.H = i17;
                                c0062aA.I = i2;
                            }
                        } else {
                            i = size2;
                            j2 = j3;
                        }
                        epv.g(i14, uovVarF, c0062aA, aVar.l, uovVar, uovVar2);
                        if (sparseArray2.size() == 1) {
                            mfdVar = (mfd) sparseArray2.valueAt(i12);
                        } else {
                            mfdVar = (mfd) sparseArray2.get(i15);
                            mfdVar.getClass();
                        }
                        sparseArray.put(i15, new b(njg0VarR, ojg0Var, mfdVar, new androidx.media3.common.a(c0062aA)));
                        this.z = Math.max(this.z, j2);
                        i13 = i16 + 1;
                        strA = str;
                        arrayListJ = arrayList7;
                        size2 = i;
                        i12 = 0;
                    }
                    this.H.n();
                } else {
                    ArrayList arrayList8 = arrayListJ;
                    ly0.f(sparseArray.size() == size2);
                    int i18 = 0;
                    while (i18 < size2) {
                        ArrayList arrayList9 = arrayList8;
                        ojg0 ojg0Var2 = (ojg0) arrayList9.get(i18);
                        int i19 = ojg0Var2.a.a;
                        b bVar2 = sparseArray.get(i19);
                        if (sparseArray2.size() == 1) {
                            mfdVar2 = (mfd) sparseArray2.valueAt(0);
                        } else {
                            mfdVar2 = (mfd) sparseArray2.get(i19);
                            mfdVar2.getClass();
                        }
                        bVar2.d = ojg0Var2;
                        bVar2.e = mfdVar2;
                        bVar2.a.d(bVar2.j);
                        bVar2.e();
                        i18++;
                        arrayList8 = arrayList9;
                    }
                }
            } else if (i7 == 1836019558) {
                int size3 = arrayList4.size();
                int i20 = 0;
                while (i20 < size3) {
                    c8w.a aVar2 = (c8w.a) arrayList4.get(i20);
                    if (aVar2.a == 1953653094) {
                        c8w.b bVarC3 = aVar2.c(1952868452);
                        ArrayList arrayList10 = aVar2.c;
                        bVarC3.getClass();
                        nsz nszVar2 = bVarC3.b;
                        nszVar2.I(8);
                        int iJ = nszVar2.j();
                        byte[] bArr2 = l75.a;
                        b bVar3 = sparseArray.get(nszVar2.j());
                        if (bVar3 == null) {
                            size3 = size3;
                            bVar3 = null;
                        } else {
                            hjg0 hjg0Var = bVar3.b;
                            if ((iJ & 1) != 0) {
                                long jB = nszVar2.B();
                                hjg0Var.b = jB;
                                hjg0Var.c = jB;
                            }
                            mfd mfdVar3 = bVar3.e;
                            hjg0Var.a = new mfd((iJ & 2) != 0 ? nszVar2.j() - 1 : mfdVar3.a, (iJ & 8) != 0 ? nszVar2.j() : mfdVar3.b, (iJ & 16) != 0 ? nszVar2.j() : mfdVar3.c, (iJ & 32) != 0 ? nszVar2.j() : mfdVar3.d);
                        }
                        if (bVar3 != null) {
                            hjg0 hjg0Var2 = bVar3.b;
                            long j4 = hjg0Var2.p;
                            boolean z2 = hjg0Var2.q;
                            bVar3.e();
                            bVar3.m = true;
                            c8w.b bVarC4 = aVar2.c(1952867444);
                            if (bVarC4 == null || (i8 & 2) != 0) {
                                hjg0Var2.p = j4;
                                hjg0Var2.q = z2;
                            } else {
                                nsz nszVar3 = bVarC4.b;
                                nszVar3.I(8);
                                hjg0Var2.p = l75.e(nszVar3.j()) == 1 ? nszVar3.B() : nszVar3.y();
                                hjg0Var2.q = true;
                            }
                            int size4 = arrayList10.size();
                            int i21 = 0;
                            int i22 = 0;
                            int i23 = 0;
                            while (true) {
                                i5 = 1953658222;
                                if (i21 >= size4) {
                                    break;
                                }
                                c8w.b bVar4 = (c8w.b) arrayList10.get(i21);
                                int i24 = i20;
                                if (bVar4.a == 1953658222) {
                                    nsz nszVar4 = bVar4.b;
                                    nszVar4.I(12);
                                    int iA = nszVar4.A();
                                    if (iA > 0) {
                                        i23 += iA;
                                        i22++;
                                    }
                                }
                                i21++;
                                i20 = i24;
                            }
                            i3 = i20;
                            bVar3.h = 0;
                            bVar3.g = 0;
                            bVar3.f = 0;
                            hjg0Var2.d = i22;
                            hjg0Var2.e = i23;
                            if (hjg0Var2.g.length < i22) {
                                hjg0Var2.f = new long[i22];
                                hjg0Var2.g = new int[i22];
                            }
                            if (hjg0Var2.h.length < i23) {
                                int i25 = (i23 * 125) / 100;
                                hjg0Var2.h = new int[i25];
                                hjg0Var2.i = new long[i25];
                                hjg0Var2.j = new boolean[i25];
                                hjg0Var2.l = new boolean[i25];
                            }
                            int i26 = 0;
                            int i27 = 0;
                            int i28 = 0;
                            while (true) {
                                long j5 = 0;
                                if (i26 >= size4) {
                                    arrayList2 = arrayList4;
                                    arrayList3 = arrayList5;
                                    i4 = i8;
                                    fjg0 fjg0Var2 = bVar3.d.a;
                                    mfd mfdVar4 = hjg0Var2.a;
                                    mfdVar4.getClass();
                                    gjg0 gjg0Var = fjg0Var2.l[mfdVar4.a];
                                    c8w.b bVarC5 = aVar2.c(1935763834);
                                    if (bVarC5 != null) {
                                        gjg0Var.getClass();
                                        nsz nszVar5 = bVarC5.b;
                                        int i29 = gjg0Var.d;
                                        nszVar5.I(8);
                                        int iJ2 = nszVar5.j();
                                        byte[] bArr3 = l75.a;
                                        if ((iJ2 & 1) == 1) {
                                            nszVar5.J(8);
                                        }
                                        int iW = nszVar5.w();
                                        int iA2 = nszVar5.A();
                                        if (iA2 > hjg0Var2.e) {
                                            StringBuilder sbA = efe0.a(iA2, "Saiz sample count ", " is greater than fragment sample count");
                                            sbA.append(hjg0Var2.e);
                                            throw ssz.a(null, sbA.toString());
                                        }
                                        if (iW == 0) {
                                            boolean[] zArr = hjg0Var2.l;
                                            i6 = 0;
                                            for (int i30 = 0; i30 < iA2; i30++) {
                                                int iW2 = nszVar5.w();
                                                i6 += iW2;
                                                zArr[i30] = iW2 > i29;
                                            }
                                            z = false;
                                        } else {
                                            boolean z3 = iW > i29;
                                            i6 = iW * iA2;
                                            z = false;
                                            Arrays.fill(hjg0Var2.l, 0, iA2, z3);
                                        }
                                        Arrays.fill(hjg0Var2.l, iA2, hjg0Var2.e, z);
                                        if (i6 > 0) {
                                            hjg0Var2.n.F(i6);
                                            hjg0Var2.k = true;
                                            hjg0Var2.o = true;
                                        }
                                    }
                                    c8w.b bVarC6 = aVar2.c(1935763823);
                                    if (bVarC6 != null) {
                                        nsz nszVar6 = bVarC6.b;
                                        nszVar6.I(8);
                                        int iJ3 = nszVar6.j();
                                        byte[] bArr4 = l75.a;
                                        if ((iJ3 & 1) == 1) {
                                            nszVar6.J(8);
                                        }
                                        int iA3 = nszVar6.A();
                                        if (iA3 != 1) {
                                            throw ssz.a(null, "Unexpected saio entry count: " + iA3);
                                        }
                                        hjg0Var2.c += l75.e(iJ3) == 0 ? nszVar6.y() : nszVar6.B();
                                    }
                                    c8w.b bVarC7 = aVar2.c(1936027235);
                                    if (bVarC7 != null) {
                                        g(bVarC7.b, 0, hjg0Var2);
                                    }
                                    String str2 = gjg0Var != null ? gjg0Var.b : null;
                                    nsz nszVar7 = null;
                                    nsz nszVar8 = null;
                                    for (int i31 = 0; i31 < arrayList10.size(); i31++) {
                                        c8w.b bVar5 = (c8w.b) arrayList10.get(i31);
                                        nsz nszVar9 = bVar5.b;
                                        int i32 = bVar5.a;
                                        if (i32 == 1935828848) {
                                            nszVar9.I(12);
                                            if (nszVar9.j() == 1936025959) {
                                                nszVar7 = nszVar9;
                                            }
                                        } else if (i32 == 1936158820) {
                                            nszVar9.I(12);
                                            if (nszVar9.j() == 1936025959) {
                                                nszVar8 = nszVar9;
                                            }
                                        }
                                    }
                                    if (nszVar7 != null && nszVar8 != null) {
                                        nszVar7.I(8);
                                        int iE = l75.e(nszVar7.j());
                                        nszVar7.J(4);
                                        if (iE == 1) {
                                            nszVar7.J(4);
                                        }
                                        if (nszVar7.j() != 1) {
                                            throw ssz.c("Entry count in sbgp != 1 (unsupported).");
                                        }
                                        nszVar8.I(8);
                                        int iE2 = l75.e(nszVar8.j());
                                        nszVar8.J(4);
                                        if (iE2 == 1) {
                                            if (nszVar8.y() == 0) {
                                                throw ssz.c("Variable length description in sgpd found (unsupported)");
                                            }
                                        } else if (iE2 >= 2) {
                                            nszVar8.J(4);
                                        }
                                        if (nszVar8.y() != 1) {
                                            throw ssz.c("Entry count in sgpd != 1 (unsupported).");
                                        }
                                        nszVar8.J(1);
                                        int iW3 = nszVar8.w();
                                        int i33 = (iW3 & 240) >> 4;
                                        int i34 = iW3 & 15;
                                        boolean z4 = nszVar8.w() == 1;
                                        if (z4) {
                                            int iW4 = nszVar8.w();
                                            byte[] bArr5 = new byte[16];
                                            nszVar8.h(bArr5, 0, 16);
                                            if (iW4 == 0) {
                                                int iW5 = nszVar8.w();
                                                byte[] bArr6 = new byte[iW5];
                                                nszVar8.h(bArr6, 0, iW5);
                                                bArr = bArr6;
                                            } else {
                                                bArr = null;
                                            }
                                            hjg0Var2.k = true;
                                            hjg0Var2.m = new gjg0(z4, str2, iW4, bArr5, i33, i34, bArr);
                                        }
                                    }
                                    int size5 = arrayList10.size();
                                    for (int i35 = 0; i35 < size5; i35++) {
                                        c8w.b bVar6 = (c8w.b) arrayList10.get(i35);
                                        if (bVar6.a == 1970628964) {
                                            nsz nszVar10 = bVar6.b;
                                            nszVar10.I(8);
                                            byte[] bArr7 = this.h;
                                            nszVar10.h(bArr7, 0, 16);
                                            if (Arrays.equals(bArr7, N)) {
                                                g(nszVar10, 16, hjg0Var2);
                                            }
                                        }
                                    }
                                    break;
                                }
                                c8w.b bVar7 = (c8w.b) arrayList10.get(i26);
                                if (bVar7.a == i5) {
                                    int i36 = i27 + 1;
                                    nsz nszVar11 = bVar7.b;
                                    nszVar11.I(8);
                                    int iJ4 = nszVar11.j();
                                    byte[] bArr8 = l75.a;
                                    fjg0 fjg0Var3 = bVar3.d.a;
                                    mfd mfdVar5 = hjg0Var2.a;
                                    String str3 = jrh0.a;
                                    hjg0Var2.g[i27] = nszVar11.A();
                                    long[] jArr = hjg0Var2.f;
                                    long j6 = hjg0Var2.b;
                                    jArr[i27] = j6;
                                    if ((iJ4 & 1) != 0) {
                                        jArr[i27] = j6 + ((long) nszVar11.j());
                                    }
                                    boolean z5 = (iJ4 & 4) != 0;
                                    int iJ5 = mfdVar5.d;
                                    if (z5) {
                                        iJ5 = nszVar11.j();
                                    }
                                    boolean z6 = z5;
                                    boolean z7 = (iJ4 & 256) != 0;
                                    boolean z8 = (iJ4 & 512) != 0;
                                    boolean z9 = (iJ4 & 1024) != 0;
                                    boolean z10 = (iJ4 & 2048) != 0;
                                    boolean z11 = z9;
                                    long[] jArr2 = fjg0Var3.i;
                                    int i37 = iJ5;
                                    long[] jArr3 = fjg0Var3.j;
                                    if (jArr2 != null && jArr2.length == 1 && jArr3 != null) {
                                        long j7 = jArr2[0];
                                        if (j7 == 0) {
                                            j5 = jArr3[0];
                                        } else {
                                            long j8 = fjg0Var3.d;
                                            RoundingMode roundingMode = RoundingMode.DOWN;
                                            if (jrh0.V(j7, 1000000L, j8, roundingMode) + jrh0.V(jArr3[0], 1000000L, fjg0Var3.c, roundingMode) >= fjg0Var3.e) {
                                                j5 = jArr3[0];
                                            }
                                        }
                                    }
                                    int[] iArr = hjg0Var2.h;
                                    long[] jArr4 = hjg0Var2.i;
                                    boolean[] zArr2 = hjg0Var2.j;
                                    boolean z12 = fjg0Var3.b == 2 && (i8 & 1) != 0;
                                    int i38 = hjg0Var2.g[i27] + i28;
                                    long j9 = fjg0Var3.c;
                                    long j10 = hjg0Var2.p;
                                    while (i28 < i38) {
                                        int iJ6 = z7 ? nszVar11.j() : mfdVar5.b;
                                        boolean z13 = z12;
                                        if (iJ6 < 0) {
                                            throw ssz.a(null, "Unexpected negative value: " + iJ6);
                                        }
                                        int iJ7 = z8 ? nszVar11.j() : mfdVar5.c;
                                        if (iJ7 < 0) {
                                            throw ssz.a(null, "Unexpected negative value: " + iJ7);
                                        }
                                        int iJ8 = z11 ? nszVar11.j() : (i28 == 0 && z6) ? i37 : mfdVar5.d;
                                        long jV = jrh0.V((((long) (z10 ? nszVar11.j() : 0)) + j10) - j5, 1000000L, j9, RoundingMode.DOWN);
                                        jArr4[i28] = jV;
                                        if (!hjg0Var2.q) {
                                            jArr4[i28] = jV + bVar3.d.h;
                                        }
                                        iArr[i28] = iJ7;
                                        zArr2[i28] = ((iJ8 >> 16) & 1) == 0 && (!z13 || i28 == 0);
                                        j10 += (long) iJ6;
                                        i28++;
                                        z12 = z13;
                                        i38 = i38;
                                        mfdVar5 = mfdVar5;
                                    }
                                    hjg0Var2.p = j10;
                                    i27 = i36;
                                    i28 = i38;
                                }
                                i26++;
                                arrayList4 = arrayList4;
                                arrayList5 = arrayList5;
                                size4 = size4;
                                i8 = i8;
                                i5 = 1953658222;
                            }
                        } else {
                            i3 = i20;
                            arrayList2 = arrayList4;
                            arrayList3 = arrayList5;
                            i4 = i8;
                        }
                    } else {
                        size3 = size3;
                        i3 = i20;
                        arrayList2 = arrayList4;
                        arrayList3 = arrayList5;
                        i4 = i8;
                    }
                    i20 = i3 + 1;
                    size3 = size3;
                    arrayList4 = arrayList2;
                    arrayList5 = arrayList3;
                    i8 = i4;
                }
                DrmInitData drmInitDataF2 = f(arrayList5);
                if (drmInitDataF2 != null) {
                    int size6 = sparseArray.size();
                    for (int i39 = 0; i39 < size6; i39++) {
                        b bVarValueAt = sparseArray.valueAt(i39);
                        fjg0 fjg0Var4 = bVarValueAt.d.a;
                        mfd mfdVar6 = bVarValueAt.b.a;
                        String str4 = jrh0.a;
                        gjg0 gjg0Var2 = fjg0Var4.l[mfdVar6.a];
                        DrmInitData drmInitDataA = drmInitDataF2.a(gjg0Var2 != null ? gjg0Var2.b : null);
                        androidx.media3.common.a.C0062a c0062aA2 = bVarValueAt.j.a();
                        c0062aA2.q = drmInitDataA;
                        bVarValueAt.a.d(new androidx.media3.common.a(c0062aA2));
                    }
                }
                if (this.y != -9223372036854775807L) {
                    int size7 = sparseArray.size();
                    for (int i40 = 0; i40 < size7; i40++) {
                        b bVarValueAt2 = sparseArray.valueAt(i40);
                        long j11 = this.y;
                        int i41 = bVarValueAt2.f;
                        while (true) {
                            hjg0 hjg0Var3 = bVarValueAt2.b;
                            if (i41 >= hjg0Var3.e || hjg0Var3.i[i41] > j11) {
                                break;
                            }
                            if (hjg0Var3.j[i41]) {
                                bVarValueAt2.i = i41;
                            }
                            i41++;
                        }
                    }
                    this.y = -9223372036854775807L;
                }
            } else if (!arrayDeque.isEmpty()) {
                arrayDeque.peek().d.add(aVarPop);
            }
        }
        d();
    }

    @Override // defpackage.k4h
    public final void l(m4h m4hVar) {
        int i;
        int i2 = this.b;
        if ((i2 & 32) == 0) {
            m4hVar = new see0(m4hVar, this.a);
        }
        this.H = m4hVar;
        d();
        njg0[] njg0VarArr = new njg0[2];
        this.I = njg0VarArr;
        int i3 = 100;
        int i4 = 0;
        if ((i2 & 4) != 0) {
            njg0VarArr[0] = this.H.r(100, 5);
            i = 1;
            i3 = HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS;
        } else {
            i = 0;
        }
        njg0[] njg0VarArr2 = (njg0[]) jrh0.Q(i, this.I);
        this.I = njg0VarArr2;
        for (njg0 njg0Var : njg0VarArr2) {
            njg0Var.d(O);
        }
        List<androidx.media3.common.a> list = this.c;
        this.J = new njg0[list.size()];
        while (i4 < this.J.length) {
            njg0 njg0VarR = this.H.r(i3, 3);
            njg0VarR.d(list.get(i4));
            this.J[i4] = njg0VarR;
            i4++;
            i3++;
        }
    }

    @Override // defpackage.k4h
    public final void release() {
    }
}
