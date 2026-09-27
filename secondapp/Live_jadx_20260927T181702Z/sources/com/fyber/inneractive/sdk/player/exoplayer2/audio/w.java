package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f45666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f45667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f45668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final short[] f45669f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f45670g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public short[] f45671h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f45672i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public short[] f45673j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f45674k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public short[] f45675l;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f45680q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f45681r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f45682s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f45683t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f45685v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f45686w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f45687x;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f45676m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f45677n = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f45684u = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f45678o = 1.0f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f45679p = 1.0f;

    public w(int i10, int i11) {
        this.f45664a = i10;
        this.f45665b = i11;
        this.f45666c = i10 / 400;
        int i12 = i10 / 65;
        this.f45667d = i12;
        int i13 = i12 * 2;
        this.f45668e = i13;
        this.f45669f = new short[i13];
        this.f45670g = i13;
        int i14 = i11 * i13;
        this.f45671h = new short[i14];
        this.f45672i = i13;
        this.f45673j = new short[i14];
        this.f45674k = i13;
        this.f45675l = new short[i14];
    }

    public final void a(int i10) {
        int i11 = this.f45680q + i10;
        int i12 = this.f45670g;
        if (i11 > i12) {
            int i13 = (i12 / 2) + i10 + i12;
            this.f45670g = i13;
            this.f45671h = Arrays.copyOf(this.f45671h, i13 * this.f45665b);
        }
    }

    public final void b(int i10) {
        int i11 = this.f45681r + i10;
        int i12 = this.f45672i;
        if (i11 > i12) {
            int i13 = (i12 / 2) + i10 + i12;
            this.f45672i = i13;
            this.f45673j = Arrays.copyOf(this.f45673j, i13 * this.f45665b);
        }
    }

    public final void a(short[] sArr, int i10, int i11) {
        int i12 = this.f45668e / i11;
        int i13 = this.f45665b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f45669f[i16] = (short) (i17 / i14);
        }
    }

    public final int a(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f45665b;
        int i14 = 255;
        int i15 = 1;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int i18 = 0;
            for (int i19 = 0; i19 < i11; i19++) {
                short s10 = sArr[i13 + i19];
                short s11 = sArr[i13 + i11 + i19];
                i18 += s10 >= s11 ? s10 - s11 : s11 - s10;
            }
            if (i18 * i16 < i15 * i11) {
                i16 = i11;
                i15 = i18;
            }
            if (i18 * i14 > i17 * i11) {
                i14 = i11;
                i17 = i18;
            }
            i11++;
        }
        this.f45686w = i15 / i16;
        this.f45687x = i17 / i14;
        return i16;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0253 A[LOOP:4: B:13:0x0048->B:103:0x0253, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x0175 A[EDGE_INSN: B:113:0x0175->B:65:0x0175 BREAK  A[LOOP:4: B:13:0x0048->B:103:0x0253], SYNTHETIC] */
    public final void a() {
        int iA;
        int i10;
        int iMin;
        int i11;
        int i12;
        float f10;
        int i13;
        int i14;
        int i15 = this.f45681r;
        float f11 = this.f45678o / this.f45679p;
        double d10 = f11;
        float f12 = 1.0f;
        int i16 = 1;
        if (d10 <= 1.00001d && d10 >= 0.99999d) {
            short[] sArr = this.f45671h;
            int i17 = this.f45680q;
            b(i17);
            int i18 = this.f45665b;
            System.arraycopy(sArr, 0, this.f45673j, this.f45681r * i18, i18 * i17);
            this.f45681r += i17;
            this.f45680q = 0;
        } else {
            int i19 = this.f45680q;
            if (i19 >= this.f45668e) {
                int i20 = 0;
                while (true) {
                    int i21 = this.f45683t;
                    if (i21 > 0) {
                        iMin = Math.min(this.f45668e, i21);
                        short[] sArr2 = this.f45671h;
                        b(iMin);
                        int i22 = this.f45665b;
                        System.arraycopy(sArr2, i20 * i22, this.f45673j, this.f45681r * i22, i22 * iMin);
                        this.f45681r += iMin;
                        this.f45683t -= iMin;
                    } else {
                        short[] sArr3 = this.f45671h;
                        int i23 = this.f45664a;
                        int i24 = i23 > 4000 ? i23 / 4000 : i16;
                        if (this.f45665b == i16 && i24 == i16) {
                            iA = a(sArr3, i20, this.f45666c, this.f45667d);
                        } else {
                            a(sArr3, i20, i24);
                            int iA2 = a(this.f45669f, 0, this.f45666c / i24, this.f45667d / i24);
                            if (i24 != i16) {
                                int i25 = iA2 * i24;
                                int i26 = i24 * 4;
                                int i27 = i25 - i26;
                                int i28 = i25 + i26;
                                int i29 = this.f45666c;
                                if (i27 < i29) {
                                    i27 = i29;
                                }
                                int i30 = this.f45667d;
                                if (i28 > i30) {
                                    i28 = i30;
                                }
                                if (this.f45665b == i16) {
                                    iA = a(sArr3, i20, i27, i28);
                                } else {
                                    a(sArr3, i20, i16);
                                    iA = a(this.f45669f, 0, i27, i28);
                                }
                            } else {
                                iA = iA2;
                            }
                        }
                        int i31 = this.f45686w;
                        int i32 = (i31 == 0 || (i12 = this.f45684u) == 0 || this.f45687x > i31 * 3 || i31 * 2 <= this.f45685v * 3) ? iA : i12;
                        this.f45685v = i31;
                        this.f45684u = iA;
                        if (d10 > 1.0d) {
                            short[] sArr4 = this.f45671h;
                            if (f11 >= 2.0f) {
                                i11 = (int) (i32 / (f11 - f12));
                            } else {
                                this.f45683t = (int) (((2.0f - f11) * i32) / (f11 - f12));
                                i11 = i32;
                            }
                            b(i11);
                            int i33 = i32;
                            a(i11, this.f45665b, this.f45673j, this.f45681r, sArr4, i20, sArr4, i20 + i33);
                            this.f45681r += i11;
                            f12 = f12;
                            i16 = i16;
                            i20 = i33 + i11 + i20;
                        } else {
                            int i34 = i32;
                            short[] sArr5 = this.f45671h;
                            if (f11 < 0.5f) {
                                i10 = (int) ((i34 * f11) / (f12 - f11));
                            } else {
                                this.f45683t = (int) ((((2.0f * f11) - f12) * i34) / (f12 - f11));
                                i10 = i34;
                            }
                            int i35 = i34 + i10;
                            b(i35);
                            int i36 = this.f45665b;
                            System.arraycopy(sArr5, i20 * i36, this.f45673j, this.f45681r * i36, i36 * i34);
                            int i37 = i20;
                            a(i10, this.f45665b, this.f45673j, this.f45681r + i34, sArr5, i20 + i34, sArr5, i37);
                            i20 = i37;
                            this.f45681r += i35;
                            iMin = i10;
                        }
                        if (this.f45668e + i20 > i19) {
                            break;
                        }
                        f12 = f12;
                        i16 = i16;
                    }
                    i20 += iMin;
                    if (this.f45668e + i20 > i19) {
                        break;
                        break;
                    } else {
                        f12 = f12;
                        i16 = i16;
                    }
                }
                int i38 = this.f45680q - i20;
                short[] sArr6 = this.f45671h;
                int i39 = this.f45665b;
                System.arraycopy(sArr6, i20 * i39, sArr6, 0, i39 * i38);
                this.f45680q = i38;
            }
            f10 = this.f45679p;
            if (f10 != f12 || this.f45681r == i15) {
            }
            int i40 = this.f45664a;
            int i41 = (int) (i40 / f10);
            while (true) {
                if (i41 <= 16384 && i40 <= 16384) {
                    break;
                }
                i41 /= 2;
                i40 /= 2;
            }
            int i42 = this.f45681r - i15;
            int i43 = this.f45682s + i42;
            int i44 = this.f45674k;
            if (i43 > i44) {
                int i45 = (i44 / 2) + i42 + i44;
                this.f45674k = i45;
                this.f45675l = Arrays.copyOf(this.f45675l, i45 * this.f45665b);
            }
            short[] sArr7 = this.f45673j;
            int i46 = this.f45665b;
            System.arraycopy(sArr7, i15 * i46, this.f45675l, this.f45682s * i46, i46 * i42);
            this.f45681r = i15;
            this.f45682s += i42;
            int i47 = 0;
            while (true) {
                int i48 = this.f45682s;
                int i49 = i48 - 1;
                if (i47 >= i49) {
                    if (i49 == 0) {
                        return;
                    }
                    short[] sArr8 = this.f45675l;
                    int i50 = this.f45665b;
                    System.arraycopy(sArr8, i49 * i50, sArr8, 0, (i48 - i49) * i50);
                    this.f45682s -= i49;
                    return;
                }
                while (true) {
                    i13 = this.f45676m + 1;
                    int i51 = i13 * i41;
                    i14 = this.f45677n;
                    if (i51 <= i14 * i40) {
                        break;
                    }
                    b(i16);
                    int i52 = 0;
                    while (true) {
                        int i53 = this.f45665b;
                        if (i52 < i53) {
                            short[] sArr9 = this.f45673j;
                            int i54 = (this.f45681r * i53) + i52;
                            short[] sArr10 = this.f45675l;
                            int i55 = (i47 * i53) + i52;
                            short s10 = sArr10[i55];
                            short s11 = sArr10[i55 + i53];
                            int i56 = this.f45677n * i40;
                            int i57 = this.f45676m;
                            int i58 = i57 * i41;
                            int i59 = (i57 + 1) * i41;
                            int i60 = i59 - i56;
                            int i61 = i59 - i58;
                            sArr9[i54] = (short) ((((i61 - i60) * s11) + (s10 * i60)) / i61);
                            i52++;
                        }
                    }
                    i16 = 1;
                    this.f45677n++;
                    this.f45681r++;
                }
                this.f45676m = i13;
                if (i13 == i40) {
                    this.f45676m = 0;
                    if (i14 == i41) {
                        this.f45677n = 0;
                    } else {
                        throw new IllegalStateException();
                    }
                }
                i47++;
            }
        }
        f12 = 1.0f;
        i16 = 1;
        f10 = this.f45679p;
        if (f10 != f12) {
        }
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
}
