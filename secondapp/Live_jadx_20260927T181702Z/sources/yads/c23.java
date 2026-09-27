package yads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class c23 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f147497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f147498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f147499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f147500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f147501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f147502f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f147503g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f147504h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final short[] f147505i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public short[] f147506j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f147507k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public short[] f147508l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f147509m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public short[] f147510n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f147511o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f147512p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f147513q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f147514r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f147515s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f147516t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f147517u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f147518v;

    public c23(int i10, int i11, float f10, float f11, int i12) {
        this.f147497a = i10;
        this.f147498b = i11;
        this.f147499c = f10;
        this.f147500d = f11;
        this.f147501e = i10 / i12;
        this.f147502f = i10 / 400;
        int i13 = i10 / 65;
        this.f147503g = i13;
        int i14 = i13 * 2;
        this.f147504h = i14;
        this.f147505i = new short[i14];
        int i15 = i14 * i11;
        this.f147506j = new short[i15];
        this.f147508l = new short[i15];
        this.f147510n = new short[i15];
    }

    public final void a(short[] sArr, int i10, int i11) {
        int i12 = this.f147504h / i11;
        int i13 = this.f147498b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f147505i[i16] = (short) (i17 / i14);
        }
    }

    public final short[] b(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f147498b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final int a(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f147498b;
        int i14 = 255;
        int i15 = 1;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int iAbs = 0;
            for (int i18 = 0; i18 < i11; i18++) {
                iAbs += Math.abs(sArr[i13 + i18] - sArr[(i13 + i11) + i18]);
            }
            if (iAbs * i16 < i15 * i11) {
                i16 = i11;
                i15 = iAbs;
            }
            if (iAbs * i14 > i17 * i11) {
                i14 = i11;
                i17 = iAbs;
            }
            i11++;
        }
        this.f147517u = i15 / i16;
        this.f147518v = i17 / i14;
        return i16;
    }

    public static void a(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr3[i17] * i19) + ((i10 - i19) * sArr2[i18])) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0262 A[LOOP:4: B:13:0x004c->B:100:0x0262, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:110:0x018f A[EDGE_INSN: B:110:0x018f->B:65:0x018f BREAK  A[LOOP:4: B:13:0x004c->B:100:0x0262], SYNTHETIC] */
    public final void a() {
        float f10;
        int iA;
        int iMin;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.f147509m;
        float f11 = this.f147499c;
        float f12 = this.f147500d;
        float f13 = f11 / f12;
        float f14 = this.f147501e * f12;
        double d10 = f13;
        int i16 = 1;
        if (d10 <= 1.00001d && d10 >= 0.99999d) {
            short[] sArr = this.f147506j;
            int i17 = this.f147507k;
            short[] sArrB = b(this.f147508l, i15, i17);
            this.f147508l = sArrB;
            int i18 = this.f147498b;
            System.arraycopy(sArr, 0, sArrB, this.f147509m * i18, i18 * i17);
            this.f147509m += i17;
            this.f147507k = 0;
        } else {
            int i19 = this.f147507k;
            if (i19 >= this.f147504h) {
                int i20 = 0;
                while (true) {
                    int i21 = this.f147514r;
                    if (i21 > 0) {
                        iMin = Math.min(this.f147504h, i21);
                        short[] sArr2 = this.f147506j;
                        short[] sArrB2 = b(this.f147508l, this.f147509m, iMin);
                        this.f147508l = sArrB2;
                        int i22 = this.f147498b;
                        f10 = 1.0f;
                        System.arraycopy(sArr2, i20 * i22, sArrB2, this.f147509m * i22, i22 * iMin);
                        this.f147509m += iMin;
                        this.f147514r -= iMin;
                        i10 = i20;
                    } else {
                        f10 = 1.0f;
                        short[] sArr3 = this.f147506j;
                        int i23 = this.f147497a;
                        int i24 = i23 > 4000 ? i23 / 4000 : i16;
                        if (this.f147498b == i16 && i24 == i16) {
                            iA = a(sArr3, i20, this.f147502f, this.f147503g);
                        } else {
                            a(sArr3, i20, i24);
                            int iA2 = a(this.f147505i, 0, this.f147502f / i24, this.f147503g / i24);
                            if (i24 != i16) {
                                int i25 = iA2 * i24;
                                int i26 = i24 * 4;
                                int i27 = i25 - i26;
                                int i28 = i25 + i26;
                                int i29 = this.f147502f;
                                if (i27 < i29) {
                                    i27 = i29;
                                }
                                int i30 = this.f147503g;
                                if (i28 > i30) {
                                    i28 = i30;
                                }
                                if (this.f147498b == i16) {
                                    iA = a(sArr3, i20, i27, i28);
                                } else {
                                    a(sArr3, i20, i16);
                                    iA = a(this.f147505i, 0, i27, i28);
                                }
                            } else {
                                iA = iA2;
                            }
                        }
                        int i31 = this.f147517u;
                        int i32 = (i31 == 0 || (i12 = this.f147515s) == 0 || this.f147518v > i31 * 3 || i31 * 2 <= this.f147516t * 3) ? iA : i12;
                        this.f147516t = i31;
                        this.f147515s = iA;
                        if (d10 > 1.0d) {
                            short[] sArr4 = this.f147506j;
                            if (f13 >= 2.0f) {
                                i11 = (int) (i32 / (f13 - 1.0f));
                            } else {
                                this.f147514r = (int) (((2.0f - f13) * i32) / (f13 - 1.0f));
                                i11 = i32;
                            }
                            short[] sArrB3 = b(this.f147508l, this.f147509m, i11);
                            this.f147508l = sArrB3;
                            int i33 = i32;
                            int i34 = i20;
                            a(i11, this.f147498b, sArrB3, this.f147509m, sArr4, i34, sArr4, i20 + i33);
                            this.f147509m += i11;
                            i16 = i16;
                            i20 = i33 + i11 + i34;
                        } else {
                            int i35 = i20;
                            int i36 = i32;
                            short[] sArr5 = this.f147506j;
                            if (f13 < 0.5f) {
                                iMin = (int) ((i36 * f13) / (1.0f - f13));
                            } else {
                                this.f147514r = (int) ((((2.0f * f13) - 1.0f) * i36) / (1.0f - f13));
                                iMin = i36;
                            }
                            int i37 = i36 + iMin;
                            short[] sArrB4 = b(this.f147508l, this.f147509m, i37);
                            this.f147508l = sArrB4;
                            int i38 = this.f147498b;
                            System.arraycopy(sArr5, i35 * i38, sArrB4, this.f147509m * i38, i38 * i36);
                            a(iMin, this.f147498b, this.f147508l, this.f147509m + i36, sArr5, i35 + i36, sArr5, i35);
                            i10 = i35;
                            this.f147509m += i37;
                        }
                        if (this.f147504h + i20 > i19) {
                            break;
                        } else {
                            i16 = i16;
                        }
                    }
                    i20 = i10 + iMin;
                    if (this.f147504h + i20 > i19) {
                        break;
                        break;
                    }
                    i16 = i16;
                }
                int i39 = this.f147507k - i20;
                short[] sArr6 = this.f147506j;
                int i40 = this.f147498b;
                System.arraycopy(sArr6, i20 * i40, sArr6, 0, i40 * i39);
                this.f147507k = i39;
            }
            if (f14 != f10 || this.f147509m == i15) {
            }
            int i41 = this.f147497a;
            int i42 = (int) (i41 / f14);
            while (true) {
                if (i42 <= 16384 && i41 <= 16384) {
                    break;
                }
                i42 /= 2;
                i41 /= 2;
            }
            int i43 = this.f147509m - i15;
            short[] sArrB5 = b(this.f147510n, this.f147511o, i43);
            this.f147510n = sArrB5;
            short[] sArr7 = this.f147508l;
            int i44 = this.f147498b;
            System.arraycopy(sArr7, i15 * i44, sArrB5, this.f147511o * i44, i44 * i43);
            this.f147509m = i15;
            this.f147511o += i43;
            int i45 = 0;
            while (true) {
                int i46 = this.f147511o;
                int i47 = i46 - 1;
                if (i45 >= i47) {
                    if (i47 == 0) {
                        return;
                    }
                    short[] sArr8 = this.f147510n;
                    int i48 = this.f147498b;
                    System.arraycopy(sArr8, i47 * i48, sArr8, 0, (i46 - i47) * i48);
                    this.f147511o -= i47;
                    return;
                }
                while (true) {
                    i13 = this.f147512p + 1;
                    int i49 = i13 * i42;
                    i14 = this.f147513q;
                    if (i49 <= i14 * i41) {
                        break;
                    }
                    this.f147508l = b(this.f147508l, this.f147509m, i16);
                    int i50 = 0;
                    while (true) {
                        int i51 = this.f147498b;
                        if (i50 < i51) {
                            short[] sArr9 = this.f147508l;
                            int i52 = (this.f147509m * i51) + i50;
                            short[] sArr10 = this.f147510n;
                            int i53 = (i45 * i51) + i50;
                            short s10 = sArr10[i53];
                            short s11 = sArr10[i53 + i51];
                            int i54 = this.f147513q * i41;
                            int i55 = this.f147512p;
                            int i56 = i55 * i42;
                            int i57 = (i55 + 1) * i42;
                            int i58 = i57 - i54;
                            int i59 = i57 - i56;
                            sArr9[i52] = (short) ((((i59 - i58) * s11) + (s10 * i58)) / i59);
                            i50++;
                        }
                    }
                    i16 = 1;
                    this.f147513q++;
                    this.f147509m++;
                }
                this.f147512p = i13;
                if (i13 == i41) {
                    this.f147512p = 0;
                    if (i14 == i42) {
                        this.f147513q = 0;
                    } else {
                        throw new IllegalStateException();
                    }
                }
                i45++;
            }
        }
        i16 = 1;
        f10 = 1.0f;
        if (f14 != f10) {
        }
    }
}
