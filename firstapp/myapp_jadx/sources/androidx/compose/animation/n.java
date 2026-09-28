package androidx.compose.animation;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import defpackage.a1s;
import defpackage.asr;
import defpackage.bxz;
import defpackage.c9z;
import defpackage.e490;
import defpackage.glt;
import defpackage.gnn;
import defpackage.grr;
import defpackage.hwr;
import defpackage.i060;
import defpackage.j90;
import defpackage.jh0;
import defpackage.lk40;
import defpackage.m90;
import defpackage.mmd;
import defpackage.qlr;
import defpackage.r6a0;
import defpackage.rtw;
import defpackage.s9g;
import defpackage.ttr;
import defpackage.urr;
import defpackage.v5b;
import defpackage.x5a0;
import defpackage.y290;
import defpackage.ytw;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class n implements l, glt {
    public static final ttr<r6a0> z = hwr.a(a1s.c, a.a);
    public final /* synthetic */ glt a;
    public final v5b b;
    public boolean c;
    public urr i;
    public urr v;
    public final ytw d = androidx.compose.runtime.m.b(Boolean.FALSE);
    public final c e = new c();
    public final d f = new d();
    public final SnapshotStateList<grr> w = new SnapshotStateList<>();
    public final rtw<Object, y290> y = new rtw<>((Object) null);

    public static final class a extends qlr implements Function0<r6a0> {
        public static final a a = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final r6a0 invoke() {
            r6a0 r6a0Var = new r6a0(m.a);
            r6a0Var.e();
            return r6a0Var;
        }
    }

    public static final class b implements l.a {
        public final i060 a;
        public final j90 b = m90.a();

        public b(i060 i060Var) {
            this.a = i060Var;
        }

        @Override // androidx.compose.animation.l.a
        public final bxz a(l.d dVar, lk40 lk40Var, asr asrVar, mmd mmdVar) {
            j90 j90Var = this.b;
            j90Var.reset();
            c9z.a(j90Var, this.a.a(lk40Var.d(), asrVar, mmdVar));
            j90Var.k(lk40Var.e());
            return j90Var;
        }
    }

    public static final class c extends qlr implements Function0<Unit> {
        public c() {
            super(0);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x004b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:16:0x004d A[LOOP:0: B:5:0x0011->B:16:0x004d, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:21:0x0050 A[EDGE_INSN: B:21:0x0050->B:17:0x0050 BREAK  A[LOOP:0: B:5:0x0011->B:16:0x004d], SYNTHETIC] */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            rtw<Object, y290> rtwVar = n.this.y;
            Object[] objArr = rtwVar.b;
            Object[] objArr2 = rtwVar.c;
            long[] jArr = rtwVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj = objArr[i4];
                                if (((y290) objArr2[i4]).f()) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                        if (i != length) {
                            break;
                        }
                        i++;
                    }
                }
            }
            return Unit.a;
        }
    }

    public static final class d extends qlr implements Function1<l, Unit> {
        public d() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0056 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:17:0x0058 A[LOOP:0: B:5:0x001e->B:17:0x0058, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:22:0x006c  */
        /* JADX WARN: Code duplicated, block: B:24:0x0079  */
        /* JADX WARN: Code duplicated, block: B:26:0x0084  */
        /* JADX WARN: Code duplicated, block: B:29:0x0090  */
        /* JADX WARN: Code duplicated, block: B:31:0x009a  */
        /* JADX WARN: Code duplicated, block: B:33:0x00a0  */
        /* JADX WARN: Code duplicated, block: B:38:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:40:0x00d2  */
        /* JADX WARN: Code duplicated, block: B:45:0x00e0  */
        /* JADX WARN: Code duplicated, block: B:47:0x00e4 A[LOOP:2: B:27:0x0085->B:47:0x00e4, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:48:0x00ea  */
        /* JADX WARN: Code duplicated, block: B:51:0x00f7  */
        /* JADX WARN: Code duplicated, block: B:54:0x0104  */
        /* JADX WARN: Code duplicated, block: B:56:0x010e  */
        /* JADX WARN: Code duplicated, block: B:58:0x0114  */
        /* JADX WARN: Code duplicated, block: B:61:0x0126 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:62:0x0128 A[LOOP:4: B:52:0x00f8->B:62:0x0128, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:65:0x0065 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:71:0x00ec A[EDGE_INSN: B:71:0x00ec->B:49:0x00ec BREAK  A[LOOP:2: B:27:0x0085->B:47:0x00e4], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:72:0x00ec A[EDGE_INSN: B:72:0x00ec->B:49:0x00ec BREAK  A[LOOP:2: B:27:0x0085->B:47:0x00e4], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:76:0x012b A[EDGE_INSN: B:76:0x012b->B:63:0x012b BREAK  A[LOOP:4: B:52:0x00f8->B:62:0x0128], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:77:0x012b A[EDGE_INSN: B:77:0x012b->B:63:0x012b BREAK  A[LOOP:4: B:52:0x00f8->B:62:0x0128], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:80:0x0120 A[SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(l lVar) {
            long j;
            char c;
            long j2;
            long j3;
            boolean z;
            char c2;
            Object[] objArr;
            Object[] objArr2;
            long[] jArr;
            int length;
            int i;
            long j4;
            int i2;
            int i3;
            Object[] objArr3;
            Object[] objArr4;
            long[] jArr2;
            int length2;
            int i4;
            long j5;
            int i5;
            int i6;
            y290 y290Var;
            boolean z2;
            n nVar = n.this;
            rtw<Object, y290> rtwVar = nVar.y;
            Object[] objArr5 = rtwVar.b;
            Object[] objArr6 = rtwVar.c;
            long[] jArr3 = rtwVar.a;
            int length3 = jArr3.length - 2;
            int i7 = 1;
            if (length3 >= 0) {
                int i8 = 0;
                j = 128;
                j2 = 255;
                loop0: while (true) {
                    long j6 = jArr3[i8];
                    c = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8 - ((~(i8 - length3)) >>> 31);
                        for (int i10 = 0; i10 < i9; i10++) {
                            if ((j6 & 255) < 128) {
                                int i11 = (i8 << 3) + i10;
                                Object obj = objArr5[i11];
                                if (((y290) objArr6[i11]).f()) {
                                    z = true;
                                    break loop0;
                                }
                            }
                            j6 >>= 8;
                        }
                        if (i9 == 8) {
                            if (i8 != length3) {
                                i8++;
                            }
                        }
                    } else if (i8 != length3) {
                        i8++;
                    }
                }
                if (z != nVar.i()) {
                    ((x5a0) nVar.d).setValue(Boolean.valueOf(z));
                    if (z) {
                        c2 = c;
                    } else {
                        objArr3 = rtwVar.b;
                        objArr4 = rtwVar.c;
                        jArr2 = rtwVar.a;
                        length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            i4 = 0;
                            while (true) {
                                j5 = jArr2[i4];
                                if ((((~j5) << c) & j5 & j3) != j3) {
                                    i5 = 8 - ((~(i4 - length2)) >>> 31);
                                    i6 = 0;
                                    while (i6 < i5) {
                                        if ((j5 & j2) < j) {
                                            int i12 = (i4 << 3) + i6;
                                            Object obj2 = objArr3[i12];
                                            y290Var = (y290) objArr4[i12];
                                            if (y290Var.k.size() > i7 || !y290Var.d()) {
                                                z2 = 0;
                                            } else {
                                                z2 = i7;
                                            }
                                            ((x5a0) y290Var.c).setValue(Boolean.valueOf(z2));
                                            y290Var.f = null;
                                            ((x5a0) y290Var.d).setValue(null);
                                        }
                                        j5 >>= 8;
                                        i6++;
                                        c = c;
                                        i7 = 1;
                                    }
                                    c2 = c;
                                    if (i5 == 8) {
                                        break;
                                    }
                                } else {
                                    c2 = c;
                                }
                                if (i4 != length2) {
                                    break;
                                }
                                i4++;
                                c = c2;
                                i7 = 1;
                            }
                        } else {
                            c2 = c;
                        }
                    }
                } else {
                    c2 = c;
                }
                objArr = rtwVar.b;
                objArr2 = rtwVar.c;
                jArr = rtwVar.a;
                length = jArr.length - 2;
                if (length >= 0) {
                    i = 0;
                    while (true) {
                        j4 = jArr[i];
                        if ((((~j4) << c2) & j4 & j3) != j3) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            i2 = 8 - ((~(i - length)) >>> 31);
                            for (i3 = 0; i3 < i2; i3++) {
                                if ((j4 & j2) < j) {
                                    int i13 = (i << 3) + i3;
                                    Object obj3 = objArr[i13];
                                    ((y290) objArr2[i13]).h();
                                }
                                j4 >>= 8;
                            }
                            if (i2 == 8) {
                                break;
                            }
                            if (i != length) {
                                break;
                            }
                            i++;
                        }
                    }
                }
                nVar.a();
                return Unit.a;
            }
            j = 128;
            c = 7;
            j2 = 255;
            j3 = -9187201950435737472L;
            z = false;
            if (z != nVar.i()) {
                ((x5a0) nVar.d).setValue(Boolean.valueOf(z));
                if (z) {
                    objArr3 = rtwVar.b;
                    objArr4 = rtwVar.c;
                    jArr2 = rtwVar.a;
                    length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        i4 = 0;
                        while (true) {
                            j5 = jArr2[i4];
                            if ((((~j5) << c) & j5 & j3) != j3) {
                                i5 = 8 - ((~(i4 - length2)) >>> 31);
                                i6 = 0;
                                while (i6 < i5) {
                                    if ((j5 & j2) < j) {
                                        int i14 = (i4 << 3) + i6;
                                        Object obj4 = objArr3[i14];
                                        y290Var = (y290) objArr4[i14];
                                        if (y290Var.k.size() > i7) {
                                            z2 = 0;
                                        } else {
                                            z2 = 0;
                                        }
                                        ((x5a0) y290Var.c).setValue(Boolean.valueOf(z2));
                                        y290Var.f = null;
                                        ((x5a0) y290Var.d).setValue(null);
                                    }
                                    j5 >>= 8;
                                    i6++;
                                    c = c;
                                    i7 = 1;
                                }
                                c2 = c;
                                if (i5 == 8) {
                                    break;
                                    break;
                                }
                            } else {
                                c2 = c;
                            }
                            if (i4 != length2) {
                                break;
                                break;
                            }
                            i4++;
                            c = c2;
                            i7 = 1;
                        }
                    } else {
                        c2 = c;
                    }
                } else {
                    c2 = c;
                }
            } else {
                c2 = c;
            }
            objArr = rtwVar.b;
            objArr2 = rtwVar.c;
            jArr = rtwVar.a;
            length = jArr.length - 2;
            if (length >= 0) {
                i = 0;
                while (true) {
                    j4 = jArr[i];
                    if ((((~j4) << c2) & j4 & j3) != j3) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        i2 = 8 - ((~(i - length)) >>> 31);
                        while (i3 < i2) {
                            if ((j4 & j2) < j) {
                                int i15 = (i << 3) + i3;
                                Object obj5 = objArr[i15];
                                ((y290) objArr2[i15]).h();
                            }
                            j4 >>= 8;
                        }
                        if (i2 == 8) {
                            break;
                            break;
                        }
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    }
                }
            }
            nVar.a();
            return Unit.a;
        }
    }

    public n(glt gltVar, v5b v5bVar) {
        this.a = gltVar;
        this.b = v5bVar;
    }

    @Override // androidx.compose.animation.l
    public final androidx.compose.ui.d A(androidx.compose.ui.d dVar, l.d dVar2, jh0 jh0Var, s9g s9gVar, g gVar, e490 e490Var, l.c cVar, l.a aVar) {
        s sVar = new s(dVar2, jh0Var.b(), o.a, this, false, aVar, e490Var);
        gnn.a aVar2 = gnn.a;
        return androidx.compose.ui.c.a(androidx.compose.ui.c.a(dVar, aVar2, sVar), aVar2, new r(jh0Var, s9gVar, gVar, dVar2, cVar));
    }

    public final void a() {
        if (this.c) {
            return;
        }
        z.getValue().d(this, this.f, this.e);
    }

    @Override // defpackage.glt
    public final urr e(urr urrVar) {
        return this.a.e(urrVar);
    }

    @Override // defpackage.glt
    public final long g(urr urrVar, urr urrVar2) {
        return this.a.g(urrVar, urrVar2);
    }

    @Override // androidx.compose.animation.l
    public final boolean i() {
        return ((Boolean) ((x5a0) this.d).getValue()).booleanValue();
    }

    @Override // androidx.compose.animation.l
    public final l.d o(String str, androidx.compose.runtime.a aVar) {
        aVar.N(799702514);
        boolean zM = aVar.M(str);
        Object objY = aVar.y();
        if (zM || objY == androidx.compose.runtime.a.C0041a.a) {
            objY = new l.d(str);
            aVar.r(objY);
        }
        l.d dVar = (l.d) objY;
        aVar.H();
        return dVar;
    }

    @Override // androidx.compose.animation.l
    public final androidx.compose.ui.d w(androidx.compose.ui.d dVar, l.d dVar2, jh0 jh0Var, e490 e490Var, u.a aVar) {
        return androidx.compose.ui.c.a(dVar, gnn.a, new s(dVar2, jh0Var.b(), t.a, this, true, aVar, e490Var));
    }

    @Override // androidx.compose.animation.l
    public final b x(i060 i060Var) {
        return new b(i060Var);
    }
}
