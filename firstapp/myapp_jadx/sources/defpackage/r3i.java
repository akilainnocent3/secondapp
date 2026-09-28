package defpackage;

import androidx.media3.common.a;
import androidx.recyclerview.widget.r;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.twilio.voice.AudioFormat;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class r3i implements k4h {
    public final nsz a = new nsz(4);
    public final nsz b = new nsz(9);
    public final nsz c = new nsz(11);
    public final nsz d = new nsz();
    public final uo70 e;
    public m4h f;
    public int g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public e41 o;
    public x5i0 p;

    public r3i() {
        uo70 uo70Var = new uo70(new dre());
        uo70Var.b = -9223372036854775807L;
        uo70Var.c = new long[0];
        uo70Var.d = new long[0];
        this.e = uo70Var;
        this.g = 1;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:144:0x039a  */
    /* JADX WARN: Code duplicated, block: B:145:0x039e  */
    /* JADX WARN: Code duplicated, block: B:184:0x03aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0168  */
    /* JADX WARN: Code duplicated, block: B:58:0x0170  */
    /* JADX WARN: Code duplicated, block: B:94:0x028a  */
    /* JADX WARN: Code duplicated, block: B:99:0x029f  */
    @Override // defpackage.k4h
    public final int a(l4h l4hVar, k620 k620Var) throws ssz {
        long j;
        long j2;
        int i;
        boolean z;
        boolean z2;
        long j3;
        int i2;
        ly0.g(this.f);
        while (true) {
            int i3 = this.g;
            boolean z3 = true;
            if (i3 == 1) {
                nsz nszVar = this.b;
                if (!l4hVar.f(nszVar.a, 0, 9, true)) {
                    return -1;
                }
                nszVar.I(0);
                nszVar.J(4);
                int iW = nszVar.w();
                boolean z4 = (iW & 4) != 0;
                boolean z5 = (iW & 1) != 0;
                if (z4 && this.o == null) {
                    this.o = new e41(this.f.r(8, 1));
                }
                if (z5 && this.p == null) {
                    i2 = 2;
                    this.p = new x5i0(this.f.r(9, 2));
                } else {
                    i2 = 2;
                }
                this.f.n();
                this.j = nszVar.j() - 5;
                this.g = i2;
            } else if (i3 == 2) {
                l4hVar.l(this.j);
                this.j = 0;
                this.g = 3;
            } else if (i3 == 3) {
                nsz nszVar2 = this.c;
                if (!l4hVar.f(nszVar2.a, 0, 11, true)) {
                    return -1;
                }
                nszVar2.I(0);
                this.k = nszVar2.w();
                this.l = nszVar2.z();
                this.m = nszVar2.z();
                this.m = (((long) (nszVar2.w() << 24)) | this.m) * 1000;
                nszVar2.J(3);
                this.g = 4;
            } else {
                if (i3 != 4) {
                    fm20.a();
                    return 0;
                }
                boolean z6 = this.h;
                uo70 uo70Var = this.e;
                if (z6) {
                    j = this.i + this.m;
                } else {
                    if (uo70Var.b == -9223372036854775807L) {
                        j2 = 0;
                    } else {
                        j = this.m;
                    }
                    i = this.k;
                    if (i == 8 || this.o == null) {
                        int i4 = 4;
                        if (i != 9 && this.p != null) {
                            if (!this.n) {
                                this.f.k(new p480.b(-9223372036854775807L));
                                this.n = true;
                            }
                            x5i0 x5i0Var = this.p;
                            nsz nszVarD = d(l4hVar);
                            x5i0Var.getClass();
                            int iW2 = nszVarD.w();
                            int i5 = (iW2 >> 4) & 15;
                            int i6 = iW2 & 15;
                            if (i6 != 7) {
                                throw new f4f0.a(hce0.a(i6, "Video format not supported: "));
                            }
                            x5i0Var.g = i5;
                            if (i5 != 5) {
                                nsz nszVar3 = x5i0Var.b;
                                njg0 njg0Var = x5i0Var.a;
                                nsz nszVar4 = x5i0Var.c;
                                int iW3 = nszVarD.w();
                                byte[] bArr = nszVarD.a;
                                int i7 = nszVarD.b;
                                int i8 = i7 + 1;
                                nszVarD.b = i8;
                                int i9 = ((bArr[i7] & 255) << 24) >> 8;
                                int i10 = i7 + 2;
                                nszVarD.b = i10;
                                int i11 = ((bArr[i8] & 255) << 8) | i9;
                                nszVarD.b = i7 + 3;
                                long j4 = (((long) (i11 | (bArr[i10] & 255))) * 1000) + j2;
                                if (iW3 != 0 || x5i0Var.e) {
                                    if (iW3 == 1 && x5i0Var.e) {
                                        int i12 = x5i0Var.g == 1 ? 1 : 0;
                                        if (x5i0Var.f || i12 != 0) {
                                            byte[] bArr2 = nszVar4.a;
                                            bArr2[0] = 0;
                                            bArr2[1] = 0;
                                            bArr2[2] = 0;
                                            int i13 = 4 - x5i0Var.d;
                                            int i14 = 0;
                                            while (nszVarD.a() > 0) {
                                                nszVarD.h(nszVar4.a, i13, x5i0Var.d);
                                                nszVar4.I(0);
                                                int iA = nszVar4.A();
                                                nszVar3.I(0);
                                                njg0Var.f(i4, nszVar3);
                                                njg0Var.f(iA, nszVarD);
                                                i14 = i14 + 4 + iA;
                                                i4 = 4;
                                            }
                                            x5i0Var.a.a(j4, i12, i14, 0, null);
                                            x5i0Var.f = true;
                                            z2 = true;
                                        }
                                    }
                                    z = z2;
                                    z3 = true;
                                } else {
                                    byte[] bArr3 = new byte[nszVarD.a()];
                                    nsz nszVar5 = new nsz(bArr3);
                                    nszVarD.h(bArr3, 0, nszVarD.a());
                                    cp1 cp1VarA = cp1.a(nszVar5);
                                    x5i0Var.d = cp1VarA.b;
                                    a.C0062a c0062a = new a.C0062a();
                                    c0062a.l = gqv.m("video/x-flv");
                                    c0062a.m = gqv.m("video/avc");
                                    c0062a.j = cp1VarA.l;
                                    c0062a.t = cp1VarA.c;
                                    c0062a.u = cp1VarA.d;
                                    c0062a.z = cp1VarA.k;
                                    c0062a.p = cp1VarA.a;
                                    p0j0.a(c0062a, njg0Var);
                                    x5i0Var.e = true;
                                }
                                z2 = false;
                                if (z2) {
                                }
                                z3 = true;
                            }
                        } else if (i == 18 || this.n) {
                            l4hVar.l(this.l);
                            z = false;
                            z3 = false;
                        } else {
                            nsz nszVarD2 = d(l4hVar);
                            if (nszVarD2.w() == 2 && "onMetaData".equals(uo70.c(nszVarD2)) && nszVarD2.a() != 0 && nszVarD2.w() == 8) {
                                HashMap<String, Object> mapB = uo70.b(nszVarD2);
                                Object obj = mapB.get(AnalyticsParam.KEY_BI_DURATION);
                                if (obj instanceof Double) {
                                    double dDoubleValue = ((Double) obj).doubleValue();
                                    if (dDoubleValue > 0.0d) {
                                        uo70Var.b = (long) (dDoubleValue * 1000000.0d);
                                    }
                                }
                                Object obj2 = mapB.get("keyframes");
                                if (obj2 instanceof Map) {
                                    Map map = (Map) obj2;
                                    Object obj3 = map.get("filepositions");
                                    Object obj4 = map.get("times");
                                    if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                        List list = (List) obj3;
                                        List list2 = (List) obj4;
                                        int size = list2.size();
                                        uo70Var.c = new long[size];
                                        uo70Var.d = new long[size];
                                        for (int i15 = 0; i15 < size; i15++) {
                                            Object obj5 = list.get(i15);
                                            Object obj6 = list2.get(i15);
                                            if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                                uo70Var.c = new long[0];
                                                uo70Var.d = new long[0];
                                                break;
                                            }
                                            uo70Var.c[i15] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                                            uo70Var.d[i15] = ((Double) obj5).longValue();
                                        }
                                    }
                                }
                            }
                            long j5 = uo70Var.b;
                            if (j5 != -9223372036854775807L) {
                                this.f.k(new efn(j5, uo70Var.d, uo70Var.c));
                                this.n = true;
                            }
                        }
                        z3 = true;
                    } else {
                        if (!this.n) {
                            this.f.k(new p480.b(-9223372036854775807L));
                            this.n = true;
                        }
                        e41 e41Var = this.o;
                        nsz nszVarD3 = d(l4hVar);
                        njg0 njg0Var2 = e41Var.a;
                        if (e41Var.b) {
                            nszVarD3.J(1);
                        } else {
                            int iW4 = nszVarD3.w();
                            int i16 = (iW4 >> 4) & 15;
                            e41Var.d = i16;
                            if (i16 == 2) {
                                int i17 = e41.e[(iW4 >> 2) & 3];
                                a.C0062a c0062a2 = new a.C0062a();
                                c0062a2.l = gqv.m("video/x-flv");
                                c0062a2.m = gqv.m("audio/mpeg");
                                c0062a2.E = 1;
                                c0062a2.F = i17;
                                p0j0.a(c0062a2, njg0Var2);
                                e41Var.c = true;
                            } else if (i16 == 7 || i16 == 8) {
                                String str = i16 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                                a.C0062a c0062a3 = new a.C0062a();
                                c0062a3.l = gqv.m("video/x-flv");
                                c0062a3.m = gqv.m(str);
                                c0062a3.E = 1;
                                c0062a3.F = AudioFormat.AUDIO_SAMPLE_RATE_8000;
                                p0j0.a(c0062a3, njg0Var2);
                                e41Var.c = true;
                            } else if (i16 != 10) {
                                throw new f4f0.a("Audio format not supported: " + e41Var.d);
                            }
                            e41Var.b = true;
                        }
                        njg0 njg0Var3 = e41Var.a;
                        if (e41Var.d == 2) {
                            int iA2 = nszVarD3.a();
                            njg0Var3.f(iA2, nszVarD3);
                            e41Var.a.a(j2, 1, iA2, 0, null);
                        } else {
                            int iW5 = nszVarD3.w();
                            if (iW5 == 0 && !e41Var.c) {
                                int iA3 = nszVarD3.a();
                                byte[] bArr4 = new byte[iA3];
                                nszVarD3.h(bArr4, 0, iA3);
                                s1.a aVarB = s1.b(new msz(iA3, bArr4), false);
                                a.C0062a c0062a4 = new a.C0062a();
                                c0062a4.l = gqv.m("video/x-flv");
                                c0062a4.m = gqv.m("audio/mp4a-latm");
                                c0062a4.j = aVarB.c;
                                c0062a4.E = aVarB.b;
                                c0062a4.F = aVarB.a;
                                c0062a4.p = Collections.singletonList(bArr4);
                                p0j0.a(c0062a4, njg0Var3);
                                e41Var.c = true;
                            } else if (e41Var.d != 10 || iW5 == 1) {
                                int iA4 = nszVarD3.a();
                                njg0Var3.f(iA4, nszVarD3);
                                e41Var.a.a(j2, 1, iA4, 0, null);
                            }
                            z = false;
                        }
                        z = true;
                    }
                    if (!this.h && z) {
                        this.h = true;
                        if (uo70Var.b == -9223372036854775807L) {
                            j3 = -this.m;
                        } else {
                            j3 = 0;
                        }
                        this.i = j3;
                    }
                    this.j = 4;
                    this.g = 2;
                    if (z3) {
                        return 0;
                    }
                }
                j2 = j;
                i = this.k;
                if (i == 8) {
                    int i18 = 4;
                    if (i != 9) {
                        if (i == 18) {
                        }
                        l4hVar.l(this.l);
                        z = false;
                        z3 = false;
                    } else {
                        if (i == 18) {
                        }
                        l4hVar.l(this.l);
                        z = false;
                        z3 = false;
                    }
                } else {
                    int i19 = 4;
                    if (i != 9) {
                        if (i == 18) {
                        }
                        l4hVar.l(this.l);
                        z = false;
                        z3 = false;
                    } else {
                        if (i == 18) {
                        }
                        l4hVar.l(this.l);
                        z = false;
                        z3 = false;
                    }
                }
                if (!this.h) {
                    this.h = true;
                    if (uo70Var.b == -9223372036854775807L) {
                        j3 = -this.m;
                    } else {
                        j3 = 0;
                    }
                    this.i = j3;
                }
                this.j = 4;
                this.g = 2;
                if (z3) {
                    return 0;
                }
            }
        }
    }

    @Override // defpackage.k4h
    public final boolean b(l4h l4hVar) throws EOFException, InterruptedIOException {
        nsz nszVar = this.a;
        jcd jcdVar = (jcd) l4hVar;
        jcdVar.c(nszVar.a, 0, 3, false);
        nszVar.I(0);
        if (nszVar.z() == 4607062) {
            jcdVar.c(nszVar.a, 0, 2, false);
            nszVar.I(0);
            if ((nszVar.C() & r.d.DEFAULT_SWIPE_ANIMATION_DURATION) == 0) {
                jcdVar.c(nszVar.a, 0, 4, false);
                nszVar.I(0);
                int iJ = nszVar.j();
                jcdVar.f = 0;
                jcdVar.n(iJ, false);
                jcdVar.c(nszVar.a, 0, 4, false);
                nszVar.I(0);
                if (nszVar.j() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.k4h
    public final void c(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    public final nsz d(l4h l4hVar) {
        int i = this.l;
        nsz nszVar = this.d;
        byte[] bArr = nszVar.a;
        if (i > bArr.length) {
            nszVar.G(0, new byte[Math.max(bArr.length * 2, i)]);
        } else {
            nszVar.I(0);
        }
        nszVar.H(this.l);
        l4hVar.readFully(nszVar.a, 0, this.l);
        return nszVar;
    }

    @Override // defpackage.k4h
    public final void l(m4h m4hVar) {
        this.f = m4hVar;
    }

    @Override // defpackage.k4h
    public final void release() {
    }
}
