package yads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class nl0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f153076h = {0, 7, 8, zi.c.f161639q};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f153077i = {0, 119, -120, -1};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f153078j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f153079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f153080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Canvas f153081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gl0 f153082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fl0 f153083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ml0 f153084f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bitmap f153085g;

    public nl0(int i10, int i11) {
        Paint paint = new Paint();
        this.f153079a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f153080b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f153081c = new Canvas();
        this.f153082d = new gl0(719, 575, 0, 719, 0, 575);
        this.f153083e = new fl0(0, a(), b(), c());
        this.f153084f = new ml0(i10, i11);
    }

    public static int a(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    public static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = a(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i10] = a(255, (i10 & 1) != 0 ? 127 : 0, (i10 & 2) != 0 ? 127 : 0, (i10 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] c() {
        int i10;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            if (i11 < 8) {
                iArr[i11] = a(63, (i11 & 1) != 0 ? 255 : 0, (i11 & 2) != 0 ? 255 : 0, (i11 & 4) == 0 ? 0 : 255);
            } else {
                int i12 = i11 & 136;
                int i13 = jj.c.f100514f;
                if (i12 == 0) {
                    int i14 = ((i11 & 1) != 0 ? 85 : 0) + ((i11 & 16) != 0 ? 170 : 0);
                    int i15 = ((i11 & 2) != 0 ? 85 : 0) + ((i11 & 32) != 0 ? 170 : 0);
                    i10 = (i11 & 4) == 0 ? 0 : 85;
                    if ((i11 & 64) == 0) {
                        i13 = 0;
                    }
                    iArr[i11] = a(255, i14, i15, i10 + i13);
                } else if (i12 == 8) {
                    int i16 = ((i11 & 1) != 0 ? 85 : 0) + ((i11 & 16) != 0 ? 170 : 0);
                    int i17 = ((i11 & 2) != 0 ? 85 : 0) + ((i11 & 32) != 0 ? 170 : 0);
                    i10 = (i11 & 4) == 0 ? 0 : 85;
                    if ((i11 & 64) == 0) {
                        i13 = 0;
                    }
                    iArr[i11] = a(127, i16, i17, i10 + i13);
                } else if (i12 == 128) {
                    iArr[i11] = a(255, ((i11 & 1) != 0 ? 43 : 0) + 127 + ((i11 & 16) != 0 ? 85 : 0), ((i11 & 2) != 0 ? 43 : 0) + 127 + ((i11 & 32) != 0 ? 85 : 0), ((i11 & 4) == 0 ? 0 : 43) + 127 + ((i11 & 64) == 0 ? 0 : 85));
                } else if (i12 == 136) {
                    iArr[i11] = a(255, ((i11 & 1) != 0 ? 43 : 0) + ((i11 & 16) != 0 ? 85 : 0), ((i11 & 2) != 0 ? 43 : 0) + ((i11 & 32) != 0 ? 85 : 0), ((i11 & 4) == 0 ? 0 : 43) + ((i11 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int[] a() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    /* JADX WARN: Code duplicated, block: B:120:0x01ec A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x0209  */
    /* JADX WARN: Code duplicated, block: B:130:0x0216  */
    /* JADX WARN: Code duplicated, block: B:132:0x0225 A[LOOP:3: B:96:0x0184->B:132:0x0225, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:156:0x0211 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static void a(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        char c10;
        ?? A;
        int iA;
        int iA2;
        byte[] bArr4;
        int i13;
        int iA3;
        int iA4;
        boolean z10;
        ?? r10;
        int i14;
        int i15;
        int iA5;
        int i16;
        Paint paint2 = paint;
        ib2 ib2Var = new ib2(bArr.length, bArr);
        int i17 = i11;
        int i18 = i12;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        while (ib2Var.b() != 0) {
            int iA6 = ib2Var.a(8);
            if (iA6 != 240) {
                int i19 = 4;
                int i20 = 2;
                int i21 = 0;
                int i22 = 1;
                switch (iA6) {
                    case 16:
                        if (i10 == 3) {
                            if (bArr5 == null) {
                                bArr3 = f153077i;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArr5;
                            }
                        } else if (i10 != 2) {
                            bArr2 = null;
                        } else if (bArr7 == null) {
                            bArr3 = f153076h;
                            bArr2 = bArr3;
                        } else {
                            bArr2 = bArr7;
                        }
                        boolean z11 = false;
                        while (true) {
                            int iA7 = ib2Var.a(2);
                            if (iA7 != 0) {
                                iA = 1;
                            } else {
                                if (ib2Var.e()) {
                                    iA2 = ib2Var.a(3) + 3;
                                    iA7 = ib2Var.a(2);
                                } else {
                                    if (ib2Var.e()) {
                                        iA = 1;
                                        c10 = 4;
                                    } else {
                                        int iA8 = ib2Var.a(2);
                                        if (iA8 != 0) {
                                            if (iA8 == 1) {
                                                c10 = 4;
                                                iA = 2;
                                            } else if (iA8 == 2) {
                                                c10 = 4;
                                                iA = ib2Var.a(4) + 12;
                                                z11 = z11;
                                                A = ib2Var.a(2);
                                            } else if (iA8 != 3) {
                                                z11 = z11;
                                                c10 = 4;
                                            } else {
                                                iA2 = ib2Var.a(8) + 29;
                                                iA7 = ib2Var.a(2);
                                            }
                                            if (iA == 0 && paint2 != null) {
                                                if (bArr2 != 0) {
                                                    A = bArr2[A];
                                                }
                                                paint2.setColor(iArr[A]);
                                                canvas.drawRect(i17, i18, i17 + iA, i18 + 1, paint2);
                                            }
                                            i17 += iA;
                                            if (z11) {
                                                paint2 = paint;
                                                z11 = z11;
                                            } else if (ib2Var.f150514c != 0) {
                                                ib2Var.f150514c = 0;
                                                ib2Var.f150513b++;
                                                ib2Var.a();
                                            }
                                        } else {
                                            c10 = 4;
                                            z11 = true;
                                        }
                                        A = 0;
                                        iA = 0;
                                        if (iA == 0) {
                                        }
                                        i17 += iA;
                                        if (z11) {
                                            paint2 = paint;
                                            z11 = z11;
                                        } else if (ib2Var.f150514c != 0) {
                                            ib2Var.f150514c = 0;
                                            ib2Var.f150513b++;
                                            ib2Var.a();
                                        }
                                    }
                                    A = 0;
                                    if (iA == 0) {
                                    }
                                    i17 += iA;
                                    if (z11) {
                                        paint2 = paint;
                                        z11 = z11;
                                    } else if (ib2Var.f150514c != 0) {
                                        ib2Var.f150514c = 0;
                                        ib2Var.f150513b++;
                                        ib2Var.a();
                                    }
                                }
                                iA = iA2;
                            }
                            z11 = z11;
                            A = iA7;
                            c10 = 4;
                            if (iA == 0) {
                            }
                            i17 += iA;
                            if (z11) {
                                paint2 = paint;
                                z11 = z11;
                            } else if (ib2Var.f150514c != 0) {
                                ib2Var.f150514c = 0;
                                ib2Var.f150513b++;
                                ib2Var.a();
                            }
                            break;
                        }
                        break;
                    case 17:
                        if (i10 == 3) {
                            bArr4 = bArr6 == null ? f153078j : bArr6;
                        } else {
                            bArr4 = null;
                        }
                        boolean z12 = false;
                        while (true) {
                            int iA9 = ib2Var.a(i19);
                            if (iA9 != 0) {
                                i13 = 1;
                                z10 = z12;
                                r10 = iA9;
                            } else if (!ib2Var.e()) {
                                int iA10 = ib2Var.a(3);
                                if (iA10 != 0) {
                                    i13 = iA10 + 2;
                                    z10 = z12;
                                    r10 = 0;
                                } else {
                                    z10 = true;
                                    r10 = 0;
                                    i13 = 0;
                                }
                            } else {
                                if (!ib2Var.e()) {
                                    iA3 = ib2Var.a(i20) + i19;
                                    iA4 = ib2Var.a(i19);
                                } else {
                                    int iA11 = ib2Var.a(i20);
                                    if (iA11 == 0) {
                                        i13 = 1;
                                    } else if (iA11 == 1) {
                                        i13 = i20;
                                    } else if (iA11 == i20) {
                                        iA3 = ib2Var.a(i19) + 9;
                                        iA4 = ib2Var.a(i19);
                                    } else if (iA11 != 3) {
                                        z10 = z12;
                                        r10 = 0;
                                        i13 = 0;
                                    } else {
                                        iA3 = ib2Var.a(8) + 25;
                                        iA4 = ib2Var.a(i19);
                                    }
                                    z10 = z12;
                                    r10 = 0;
                                }
                                i13 = iA3;
                                z10 = z12;
                                r10 = iA4;
                            }
                            if (i13 == 0 || paint2 == null) {
                                i14 = i20;
                            } else {
                                if (bArr4 != 0) {
                                    r10 = bArr4[r10];
                                }
                                paint2.setColor(iArr[r10]);
                                i14 = 2;
                                canvas.drawRect(i17, i18, i17 + i13, i18 + 1, paint2);
                            }
                            i17 += i13;
                            if (!z10) {
                                i20 = i14;
                                z12 = z10;
                                i19 = 4;
                            } else if (ib2Var.f150514c == 0) {
                                continue;
                            } else {
                                ib2Var.f150514c = 0;
                                ib2Var.f150513b++;
                                ib2Var.a();
                            }
                            break;
                        }
                        break;
                    case 18:
                        int i23 = i17;
                        int i24 = 0;
                        while (true) {
                            int iA12 = ib2Var.a(8);
                            if (iA12 != 0) {
                                i15 = i24;
                                iA5 = i22;
                            } else if (!ib2Var.e()) {
                                int iA13 = ib2Var.a(7);
                                if (iA13 != 0) {
                                    i15 = i24;
                                    iA5 = iA13;
                                    iA12 = i21;
                                } else {
                                    iA12 = i21;
                                    iA5 = iA12;
                                    i15 = i22;
                                }
                            } else {
                                i15 = i24;
                                iA5 = ib2Var.a(7);
                                iA12 = ib2Var.a(8);
                            }
                            if (iA5 == 0 || paint2 == null) {
                                i16 = i22;
                            } else {
                                paint2.setColor(iArr[iA12]);
                                i16 = i22;
                                canvas.drawRect(i23, i18, i23 + iA5, i18 + 1, paint2);
                            }
                            i23 += iA5;
                            if (i15 != 0) {
                                i17 = i23;
                                continue;
                            } else {
                                i22 = i16;
                                i24 = i15;
                                i21 = 0;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (iA6) {
                            case 32:
                                bArr7 = new byte[4];
                                while (i21 < 4) {
                                    bArr7[i21] = (byte) ib2Var.a(4);
                                    i21++;
                                }
                                break;
                            case 33:
                                bArr5 = new byte[4];
                                while (i21 < 4) {
                                    bArr5[i21] = (byte) ib2Var.a(8);
                                    i21++;
                                }
                                break;
                            case 34:
                                bArr6 = new byte[16];
                                while (i21 < 16) {
                                    bArr6[i21] = (byte) ib2Var.a(8);
                                    i21++;
                                }
                                break;
                            default:
                                continue;
                        }
                        break;
                }
            } else {
                i18 += 2;
                i17 = i11;
            }
            paint2 = paint;
        }
    }

    public static fl0 a(ib2 ib2Var, int i10) {
        int[] iArr;
        int iA;
        int i11;
        int iA2;
        int iA3;
        int iA4;
        int i12 = 8;
        int iA5 = ib2Var.a(8);
        ib2Var.c(8);
        int i13 = 2;
        int i14 = i10 - 2;
        int[] iArrA = a();
        int[] iArrB = b();
        int[] iArrC = c();
        while (i14 > 0) {
            int iA6 = ib2Var.a(i12);
            int iA7 = ib2Var.a(i12);
            if ((iA7 & 128) != 0) {
                iArr = iArrA;
            } else {
                iArr = (iA7 & 64) != 0 ? iArrB : iArrC;
            }
            if ((iA7 & 1) != 0) {
                iA3 = ib2Var.a(i12);
                iA4 = ib2Var.a(i12);
                iA = ib2Var.a(i12);
                iA2 = ib2Var.a(i12);
                i11 = i14 - 6;
            } else {
                int iA8 = ib2Var.a(6) << i13;
                int iA9 = ib2Var.a(4) << 4;
                iA = ib2Var.a(4) << 4;
                i11 = i14 - 4;
                iA2 = ib2Var.a(i13) << 6;
                iA3 = iA8;
                iA4 = iA9;
            }
            if (iA3 == 0) {
                iA2 = 255;
                iA4 = 0;
                iA = 0;
            }
            double d10 = iA3;
            int i15 = iA5;
            double d11 = iA4 - 128;
            int i16 = (int) ((1.402d * d11) + d10);
            double d12 = iA - 128;
            int i17 = (int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d));
            int i18 = (int) ((d12 * 1.772d) + d10);
            int i19 = ib3.f150516a;
            iArr[iA6] = a((byte) (255 - (iA2 & 255)), Math.max(0, Math.min(i16, 255)), Math.max(0, Math.min(i17, 255)), Math.max(0, Math.min(i18, 255)));
            i14 = i11;
            iA5 = i15;
            i12 = 8;
            i13 = 2;
        }
        return new fl0(iA5, iArrA, iArrB, iArrC);
    }

    public static hl0 a(ib2 ib2Var) {
        byte[] bArr;
        int iA = ib2Var.a(16);
        ib2Var.c(4);
        int iA2 = ib2Var.a(2);
        boolean zE = ib2Var.e();
        ib2Var.c(1);
        byte[] bArr2 = ib3.f150521f;
        if (iA2 == 1) {
            ib2Var.c(ib2Var.a(8) * 16);
        } else {
            if (iA2 == 0) {
                int iA3 = ib2Var.a(16);
                int iA4 = ib2Var.a(16);
                if (iA3 > 0) {
                    bArr2 = new byte[iA3];
                    if (ib2Var.f150514c == 0) {
                        System.arraycopy(ib2Var.f150512a, ib2Var.f150513b, bArr2, 0, iA3);
                        ib2Var.f150513b += iA3;
                        ib2Var.a();
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (iA4 > 0) {
                    bArr = new byte[iA4];
                    if (ib2Var.f150514c == 0) {
                        System.arraycopy(ib2Var.f150512a, ib2Var.f150513b, bArr, 0, iA4);
                        ib2Var.f150513b += iA4;
                        ib2Var.a();
                    } else {
                        throw new IllegalStateException();
                    }
                }
            }
            return new hl0(iA, zE, bArr2, bArr);
        }
        bArr = bArr2;
        return new hl0(iA, zE, bArr2, bArr);
    }
}
