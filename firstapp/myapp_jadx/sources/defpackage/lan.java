package defpackage;

import android.graphics.Bitmap;
import android.os.Trace;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.l;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class lan extends androidx.media3.exoplayer.b {
    public final me4.a H;
    public final g5d I;
    public final ArrayDeque<a> J;
    public boolean K;
    public boolean L;
    public a M;
    public long N;
    public long O;
    public int P;
    public int Q;
    public androidx.media3.common.a R;
    public me4 S;
    public g5d T;
    public ImageOutput U;
    public Bitmap V;
    public boolean W;
    public b X;
    public b Y;
    public int Z;
    public boolean a0;

    public static final class a {
        public static final a c = new a(-9223372036854775807L, -9223372036854775807L);
        public final long a;
        public final long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }
    }

    public static class b {
        public final int a;
        public final long b;
        public Bitmap c;

        public b(int i, long j) {
            this.a = i;
            this.b = j;
        }
    }

    public lan(me4.a aVar) {
        super(4);
        this.H = aVar;
        this.U = ImageOutput.a;
        this.I = new g5d(0);
        this.M = a.c;
        this.J = new ArrayDeque<>();
        this.O = -9223372036854775807L;
        this.N = -9223372036854775807L;
        this.P = 0;
        this.Q = 1;
    }

    @Override // androidx.media3.exoplayer.b
    public final void E() {
        this.R = null;
        this.M = a.c;
        this.J.clear();
        Q();
        this.U.a();
    }

    @Override // androidx.media3.exoplayer.b
    public final void F(boolean z, boolean z2) {
        this.Q = z2 ? 1 : 0;
    }

    @Override // androidx.media3.exoplayer.b
    public final void G(long j, boolean z) {
        this.Q = Math.min(this.Q, 1);
        this.L = false;
        this.K = false;
        this.V = null;
        this.X = null;
        this.Y = null;
        this.W = false;
        this.T = null;
        me4 me4Var = this.S;
        if (me4Var != null) {
            me4Var.flush();
        }
        this.J.clear();
    }

    @Override // androidx.media3.exoplayer.b
    public final void H() {
        Q();
    }

    @Override // androidx.media3.exoplayer.b
    public final void I() {
        Q();
        this.Q = Math.min(this.Q, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // androidx.media3.exoplayer.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L(androidx.media3.common.a[] r5, long r6, long r8, ekv.b r10) {
        /*
            r4 = this;
            lan$a r5 = r4.M
            long r5 = r5.b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L31
            java.util.ArrayDeque<lan$a> r5 = r4.J
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L26
            long r6 = r4.O
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L31
            long r2 = r4.N
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L26
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 < 0) goto L26
            goto L31
        L26:
            lan$a r6 = new lan$a
            long r0 = r4.O
            r6.<init>(r0, r8)
            r5.add(r6)
            return
        L31:
            lan$a r5 = new lan$a
            r5.<init>(r0, r8)
            r4.M = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lan.L(androidx.media3.common.a[], long, long, ekv$b):void");
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x008a  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:72:0x0122  */
    /* JADX WARN: Code duplicated, block: B:74:0x013b  */
    public final boolean N(long j) throws rwg {
        boolean z;
        b bVar;
        boolean z2;
        int i;
        int i2;
        int i3;
        androidx.media3.common.a aVar;
        Bitmap bitmapCreateBitmap;
        Bitmap bitmap = this.V;
        if ((bitmap == null || this.X != null) && (this.Q != 0 || this.v == 2)) {
            ArrayDeque<a> arrayDeque = this.J;
            if (bitmap == null) {
                ly0.g(this.S);
                w9n w9nVarL = this.S.b();
                if (w9nVarL != null) {
                    if (!w9nVarL.i(4)) {
                        ly0.h(w9nVarL.d, "Non-EOS buffer came back from the decoder without bitmap.");
                        this.V = w9nVarL.d;
                        w9nVarL.k();
                        if (this.W && this.V != null && this.X != null) {
                            ly0.g(this.R);
                            androidx.media3.common.a aVar2 = this.R;
                            int i4 = aVar2.M;
                            int i5 = aVar2.N;
                            z = ((i4 != 1 && i5 == 1) || i4 == -1 || i5 == -1) ? false : true;
                            bVar = this.X;
                            if (bVar.c == null) {
                                if (z) {
                                    int i6 = bVar.a;
                                    ly0.g(this.V);
                                    int width = this.V.getWidth();
                                    androidx.media3.common.a aVar3 = this.R;
                                    ly0.g(aVar3);
                                    int i7 = width / aVar3.M;
                                    int height = this.V.getHeight();
                                    androidx.media3.common.a aVar4 = this.R;
                                    ly0.g(aVar4);
                                    int i8 = height / aVar4.N;
                                    int i9 = this.R.M;
                                    bitmapCreateBitmap = Bitmap.createBitmap(this.V, (i6 % i9) * i7, (i6 / i9) * i8, i7, i8);
                                } else {
                                    bitmapCreateBitmap = this.V;
                                    ly0.g(bitmapCreateBitmap);
                                }
                                bVar.c = bitmapCreateBitmap;
                            }
                            Bitmap bitmap2 = this.X.c;
                            ly0.g(bitmap2);
                            long j2 = this.X.b;
                            long j3 = j2 - j;
                            if (this.v == 2) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            i = this.Q;
                            if (i != 0) {
                                if (i != 1) {
                                    z2 = true;
                                } else {
                                    if (i == 3) {
                                        fm20.a();
                                        return false;
                                    }
                                    z2 = false;
                                }
                            }
                            if (!z2 || j3 < 30000) {
                                this.U.onImageAvailable(j2 - this.M.b, bitmap2);
                                b bVar2 = this.X;
                                ly0.g(bVar2);
                                long j4 = bVar2.b;
                                this.N = j4;
                                while (!arrayDeque.isEmpty() && j4 >= arrayDeque.peek().a) {
                                    this.M = arrayDeque.removeFirst();
                                }
                                this.Q = 3;
                                if (z) {
                                    b bVar3 = this.X;
                                    ly0.g(bVar3);
                                    i2 = bVar3.a;
                                    androidx.media3.common.a aVar5 = this.R;
                                    ly0.g(aVar5);
                                    i3 = aVar5.N;
                                    aVar = this.R;
                                    ly0.g(aVar);
                                    if (i2 == (i3 * aVar.M) - 1) {
                                        this.V = null;
                                    }
                                } else {
                                    this.V = null;
                                }
                                this.X = this.Y;
                                this.Y = null;
                                return true;
                            }
                        }
                    } else {
                        if (this.P == 3) {
                            Q();
                            ly0.g(this.R);
                            P();
                            return false;
                        }
                        w9nVarL.k();
                        if (arrayDeque.isEmpty()) {
                            this.L = true;
                            return false;
                        }
                    }
                }
            } else if (this.W) {
                ly0.g(this.R);
                androidx.media3.common.a aVar6 = this.R;
                int i10 = aVar6.M;
                int i11 = aVar6.N;
                if (i10 != 1) {
                }
                bVar = this.X;
                if (bVar.c == null) {
                    if (z) {
                        int i12 = bVar.a;
                        ly0.g(this.V);
                        int width2 = this.V.getWidth();
                        androidx.media3.common.a aVar7 = this.R;
                        ly0.g(aVar7);
                        int i13 = width2 / aVar7.M;
                        int height2 = this.V.getHeight();
                        androidx.media3.common.a aVar8 = this.R;
                        ly0.g(aVar8);
                        int i14 = height2 / aVar8.N;
                        int i15 = this.R.M;
                        bitmapCreateBitmap = Bitmap.createBitmap(this.V, (i12 % i15) * i13, (i12 / i15) * i14, i13, i14);
                    } else {
                        bitmapCreateBitmap = this.V;
                        ly0.g(bitmapCreateBitmap);
                    }
                    bVar.c = bitmapCreateBitmap;
                }
                Bitmap bitmap3 = this.X.c;
                ly0.g(bitmap3);
                long j5 = this.X.b;
                long j6 = j5 - j;
                if (this.v == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                i = this.Q;
                if (i != 0) {
                    if (i != 1) {
                        z2 = true;
                    } else {
                        if (i == 3) {
                            fm20.a();
                            return false;
                        }
                        z2 = false;
                    }
                }
                if (!z2) {
                }
                this.U.onImageAvailable(j5 - this.M.b, bitmap3);
                b bVar4 = this.X;
                ly0.g(bVar4);
                long j7 = bVar4.b;
                this.N = j7;
                while (!arrayDeque.isEmpty()) {
                    this.M = arrayDeque.removeFirst();
                }
                this.Q = 3;
                if (z) {
                    b bVar5 = this.X;
                    ly0.g(bVar5);
                    i2 = bVar5.a;
                    androidx.media3.common.a aVar9 = this.R;
                    ly0.g(aVar9);
                    i3 = aVar9.N;
                    aVar = this.R;
                    ly0.g(aVar);
                    if (i2 == (i3 * aVar.M) - 1) {
                        this.V = null;
                    }
                } else {
                    this.V = null;
                }
                this.X = this.Y;
                this.Y = null;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0030 A[PHI: r3
      0x0030: PHI (r3v3 g5d) = (r3v2 g5d), (r3v13 g5d) binds: [B:15:0x0021, B:17:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0038  */
    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0079  */
    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    /* JADX WARN: Code duplicated, block: B:41:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:80:0x0104  */
    /* JADX WARN: Code duplicated, block: B:83:0x0115  */
    /* JADX WARN: Code duplicated, block: B:85:0x011a  */
    /* JADX WARN: Code duplicated, block: B:87:0x012b  */
    /* JADX WARN: Code duplicated, block: B:88:0x012e  */
    /* JADX WARN: Code duplicated, block: B:91:0x013a  */
    public final boolean O(long j) {
        g5d g5dVar;
        int iM;
        ByteBuffer byteBuffer;
        g5d g5dVar2;
        boolean z;
        g5d g5dVar3;
        long j2;
        boolean z2;
        b bVar;
        boolean z3;
        androidx.media3.common.a aVar;
        boolean z4;
        boolean z5;
        androidx.media3.common.a aVar2;
        int i;
        g5d g5dVar4;
        if (!this.W || this.X == null) {
            yti ytiVar = this.c;
            ytiVar.a();
            me4 me4Var = this.S;
            if (me4Var != null && this.P != 3 && !this.K) {
                g5d g5dVar5 = this.T;
                if (g5dVar5 == null) {
                    g5dVar5 = (g5d) me4Var.e();
                    this.T = g5dVar5;
                    if (g5dVar5 != null) {
                        g5dVar = g5dVar5;
                        if (this.P == 2) {
                            g5dVar.a = 4;
                            me4 me4Var2 = this.S;
                            ly0.g(me4Var2);
                            me4Var2.f(this.T);
                            this.T = null;
                            this.P = 3;
                            return false;
                        }
                        iM = M(ytiVar, g5dVar5, 0);
                        if (iM != -5) {
                            androidx.media3.common.a aVar3 = ytiVar.b;
                            ly0.g(aVar3);
                            this.R = aVar3;
                            this.a0 = true;
                            this.P = 2;
                            return true;
                        }
                        if (iM != -4) {
                            this.T.m();
                            byteBuffer = this.T.d;
                            if (byteBuffer != null || byteBuffer.remaining() <= 0) {
                                g5dVar2 = this.T;
                                ly0.g(g5dVar2);
                                if (g5dVar2.i(4)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = true;
                            }
                            if (z) {
                                g5d g5dVar6 = this.T;
                                ly0.g(g5dVar6);
                                g5dVar6.b = this.R;
                                me4 me4Var3 = this.S;
                                ly0.g(me4Var3);
                                g5d g5dVar7 = this.T;
                                ly0.g(g5dVar7);
                                me4Var3.f(g5dVar7);
                                this.Z = 0;
                            }
                            g5dVar3 = this.T;
                            ly0.g(g5dVar3);
                            if (g5dVar3.i(4)) {
                                this.W = true;
                            } else {
                                int i2 = this.Z;
                                j2 = g5dVar3.f;
                                this.Y = new b(i2, j2);
                                this.Z = i2 + 1;
                                if (this.W) {
                                    this.X = this.Y;
                                    this.Y = null;
                                } else {
                                    if (j2 - 30000 <= j || j > 30000 + j2) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    bVar = this.X;
                                    if (bVar != null || bVar.b > j || j >= j2) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    aVar = this.R;
                                    ly0.g(aVar);
                                    if (aVar.M != -1 || (i = (aVar2 = this.R).N) == -1 || i2 == (i * aVar2.M) - 1) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (!z2 || z3 || z4) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    this.W = z5;
                                    if (z3 || z2) {
                                        this.X = this.Y;
                                        this.Y = null;
                                    }
                                }
                            }
                            g5dVar4 = this.T;
                            ly0.g(g5dVar4);
                            if (g5dVar4.i(4)) {
                                this.K = true;
                                this.T = null;
                                return false;
                            }
                            long j3 = this.O;
                            g5d g5dVar8 = this.T;
                            ly0.g(g5dVar8);
                            this.O = Math.max(j3, g5dVar8.f);
                            if (z) {
                                this.T = null;
                            } else {
                                g5d g5dVar9 = this.T;
                                ly0.g(g5dVar9);
                                g5dVar9.j();
                            }
                            return !this.W;
                        }
                        if (iM != -3) {
                            fm20.a();
                            return false;
                        }
                    }
                } else {
                    g5dVar = g5dVar5;
                    if (this.P == 2) {
                        g5dVar.a = 4;
                        me4 me4Var4 = this.S;
                        ly0.g(me4Var4);
                        me4Var4.f(this.T);
                        this.T = null;
                        this.P = 3;
                        return false;
                    }
                    iM = M(ytiVar, g5dVar5, 0);
                    if (iM != -5) {
                        androidx.media3.common.a aVar4 = ytiVar.b;
                        ly0.g(aVar4);
                        this.R = aVar4;
                        this.a0 = true;
                        this.P = 2;
                        return true;
                    }
                    if (iM != -4) {
                        this.T.m();
                        byteBuffer = this.T.d;
                        if (byteBuffer != null) {
                            g5dVar2 = this.T;
                            ly0.g(g5dVar2);
                            if (g5dVar2.i(4)) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            g5dVar2 = this.T;
                            ly0.g(g5dVar2);
                            if (g5dVar2.i(4)) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (z) {
                            g5d g5dVar10 = this.T;
                            ly0.g(g5dVar10);
                            g5dVar10.b = this.R;
                            me4 me4Var5 = this.S;
                            ly0.g(me4Var5);
                            g5d g5dVar11 = this.T;
                            ly0.g(g5dVar11);
                            me4Var5.f(g5dVar11);
                            this.Z = 0;
                        }
                        g5dVar3 = this.T;
                        ly0.g(g5dVar3);
                        if (g5dVar3.i(4)) {
                            this.W = true;
                        } else {
                            int i3 = this.Z;
                            j2 = g5dVar3.f;
                            this.Y = new b(i3, j2);
                            this.Z = i3 + 1;
                            if (this.W) {
                                this.X = this.Y;
                                this.Y = null;
                            } else {
                                if (j2 - 30000 <= j) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                bVar = this.X;
                                if (bVar != null) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                }
                                aVar = this.R;
                                ly0.g(aVar);
                                if (aVar.M != -1) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                if (z2) {
                                    z5 = true;
                                } else {
                                    z5 = true;
                                }
                                this.W = z5;
                                if (z3) {
                                    this.X = this.Y;
                                    this.Y = null;
                                } else {
                                    this.X = this.Y;
                                    this.Y = null;
                                }
                            }
                        }
                        g5dVar4 = this.T;
                        ly0.g(g5dVar4);
                        if (g5dVar4.i(4)) {
                            this.K = true;
                            this.T = null;
                            return false;
                        }
                        long j4 = this.O;
                        g5d g5dVar12 = this.T;
                        ly0.g(g5dVar12);
                        this.O = Math.max(j4, g5dVar12.f);
                        if (z) {
                            this.T = null;
                        } else {
                            g5d g5dVar13 = this.T;
                            ly0.g(g5dVar13);
                            g5dVar13.j();
                        }
                        return !this.W;
                    }
                    if (iM != -3) {
                        fm20.a();
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final void P() throws rwg {
        if (this.a0) {
            androidx.media3.common.a aVar = this.R;
            aVar.getClass();
            me4.a aVar2 = this.H;
            int iA = aVar2.a(aVar);
            if (iA != l.k(4, 0, 0, 0) && iA != l.k(3, 0, 0, 0)) {
                throw D(new r8n("Provided decoder factory can't create decoder for format."), this.R, false, 4005);
            }
            me4 me4Var = this.S;
            if (me4Var != null) {
                me4Var.release();
            }
            this.S = new me4(aVar2.a);
            this.a0 = false;
        }
    }

    public final void Q() {
        this.T = null;
        this.P = 0;
        this.O = -9223372036854775807L;
        me4 me4Var = this.S;
        if (me4Var != null) {
            me4Var.release();
            this.S = null;
        }
    }

    @Override // androidx.media3.exoplayer.b, androidx.media3.exoplayer.k
    public final boolean b() {
        return this.L;
    }

    @Override // androidx.media3.exoplayer.l
    public final int d(androidx.media3.common.a aVar) {
        return this.H.a(aVar);
    }

    @Override // androidx.media3.exoplayer.k, androidx.media3.exoplayer.l
    public final String getName() {
        return "ImageRenderer";
    }

    @Override // androidx.media3.exoplayer.k
    public final void h(long j, long j2) throws rwg {
        if (this.L) {
            return;
        }
        if (this.R == null) {
            yti ytiVar = this.c;
            ytiVar.a();
            g5d g5dVar = this.I;
            g5dVar.j();
            int iM = M(ytiVar, g5dVar, 2);
            if (iM != -5) {
                if (iM == -4) {
                    ly0.f(g5dVar.i(4));
                    this.K = true;
                    this.L = true;
                    return;
                }
                return;
            }
            androidx.media3.common.a aVar = ytiVar.b;
            ly0.g(aVar);
            this.R = aVar;
            this.a0 = true;
        }
        if (this.S == null) {
            P();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (N(j)) {
            }
            while (O(j)) {
            }
            Trace.endSection();
        } catch (r8n e) {
            throw D(e, null, false, 4003);
        }
    }

    @Override // androidx.media3.exoplayer.k
    public final boolean isReady() {
        int i = this.Q;
        if (i != 3) {
            return i == 0 && this.W;
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.b, androidx.media3.exoplayer.j.b
    public final void m(int i, Object obj) {
        if (i != 15) {
            return;
        }
        ImageOutput imageOutput = obj instanceof ImageOutput ? (ImageOutput) obj : null;
        if (imageOutput == null) {
            imageOutput = ImageOutput.a;
        }
        this.U = imageOutput;
    }
}
