package ro;

import f6.q;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f127409a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f127410b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f127411c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f127412d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f127413e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ boolean f127414f = false;

    /* JADX INFO: renamed from: ro.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class AbstractC1223a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f127415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f127416b;

        public AbstractC1223a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b extends AbstractC1223a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int[] f127417f = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int[] f127418g = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f127419h = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f127420i = -2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f127421c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f127422d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f127423e;

        public b(int flags, byte[] output) {
            super();
            this.f127415a = output;
            this.f127423e = (flags & 8) == 0 ? f127417f : f127418g;
            this.f127421c = 0;
            this.f127422d = 0;
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00c0  */
        public boolean a(byte[] input, int offset, int len, boolean finish) {
            int i10 = this.f127421c;
            if (i10 == 6) {
                return false;
            }
            int i11 = len + offset;
            int i12 = this.f127422d;
            byte[] bArr = this.f127415a;
            int[] iArr = this.f127423e;
            int i13 = 0;
            int i14 = i12;
            int i15 = i10;
            int i16 = offset;
            while (i16 < i11) {
                if (i15 == 0) {
                    while (true) {
                        int i17 = i16 + 4;
                        if (i17 > i11 || (i14 = (iArr[input[i16] & 255] << 18) | (iArr[input[i16 + 1] & 255] << 12) | (iArr[input[i16 + 2] & 255] << 6) | iArr[input[i16 + 3] & 255]) < 0) {
                            break;
                        }
                        bArr[i13 + 2] = (byte) i14;
                        bArr[i13 + 1] = (byte) (i14 >> 8);
                        bArr[i13] = (byte) (i14 >> 16);
                        i13 += 3;
                        i16 = i17;
                    }
                    if (i16 >= i11) {
                        break;
                    }
                }
                int i18 = i16 + 1;
                int i19 = iArr[input[i16] & 255];
                if (i15 != 0) {
                    if (i15 != 1) {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                if (i15 != 4) {
                                    if (i15 == 5 && i19 != -1) {
                                        this.f127421c = 6;
                                        return false;
                                    }
                                } else if (i19 == -2) {
                                    i15++;
                                } else if (i19 != -1) {
                                    this.f127421c = 6;
                                    return false;
                                }
                            } else if (i19 >= 0) {
                                int i20 = i19 | (i14 << 6);
                                bArr[i13 + 2] = (byte) i20;
                                bArr[i13 + 1] = (byte) (i20 >> 8);
                                bArr[i13] = (byte) (i20 >> 16);
                                i13 += 3;
                                i14 = i20;
                                i15 = 0;
                            } else if (i19 == -2) {
                                bArr[i13 + 1] = (byte) (i14 >> 2);
                                bArr[i13] = (byte) (i14 >> 10);
                                i13 += 2;
                                i15 = 5;
                            } else if (i19 != -1) {
                                this.f127421c = 6;
                                return false;
                            }
                        } else if (i19 >= 0) {
                            i19 |= i14 << 6;
                            i15++;
                            i14 = i19;
                        } else if (i19 == -2) {
                            bArr[i13] = (byte) (i14 >> 4);
                            i13++;
                            i15 = 4;
                        } else if (i19 != -1) {
                            this.f127421c = 6;
                            return false;
                        }
                    } else if (i19 >= 0) {
                        i19 |= i14 << 6;
                        i15++;
                        i14 = i19;
                    } else if (i19 != -1) {
                        this.f127421c = 6;
                        return false;
                    }
                } else if (i19 >= 0) {
                    i15++;
                    i14 = i19;
                } else if (i19 != -1) {
                    this.f127421c = 6;
                    return false;
                }
                i16 = i18;
            }
            if (!finish) {
                this.f127421c = i15;
                this.f127422d = i14;
                this.f127416b = i13;
                return true;
            }
            if (i15 == 1) {
                this.f127421c = 6;
                return false;
            }
            if (i15 == 2) {
                bArr[i13] = (byte) (i14 >> 4);
                i13++;
            } else if (i15 == 3) {
                int i21 = i13 + 1;
                bArr[i13] = (byte) (i14 >> 10);
                i13 += 2;
                bArr[i21] = (byte) (i14 >> 2);
            } else if (i15 == 4) {
                this.f127421c = 6;
                return false;
            }
            this.f127421c = i15;
            this.f127416b = i13;
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c extends AbstractC1223a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f127424j = 19;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final byte[] f127425k = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, q.f83619w, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, q.A, 114, 115, 116, 117, 118, 119, rg.a.f127263w, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final byte[] f127426l = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, q.f83619w, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, q.A, 114, 115, 116, 117, 118, 119, rg.a.f127263w, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final /* synthetic */ boolean f127427m = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f127428c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f127429d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f127430e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f127431f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f127432g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f127433h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final byte[] f127434i;

        public c(int flags, byte[] output) {
            super();
            this.f127415a = output;
            this.f127431f = (flags & 1) == 0;
            boolean z10 = (flags & 2) == 0;
            this.f127432g = z10;
            this.f127433h = (flags & 4) != 0;
            this.f127434i = (flags & 8) == 0 ? f127425k : f127426l;
            this.f127428c = new byte[2];
            this.f127429d = 0;
            this.f127430e = z10 ? 19 : -1;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0050  */
        public void a(byte[] input, int offset, int len, boolean finish) {
            int i10;
            int i11;
            int i12;
            int i13;
            byte b10;
            byte b11;
            byte b12;
            int i14;
            int i15;
            byte[] bArr = this.f127434i;
            byte[] bArr2 = this.f127415a;
            int i16 = this.f127430e;
            int i17 = len + offset;
            int i18 = this.f127429d;
            char c10 = 2;
            int i19 = 0;
            if (i18 != 1) {
                if (i18 == 2 && (i15 = offset + 1) <= i17) {
                    byte[] bArr3 = this.f127428c;
                    i11 = ((bArr3[1] & 255) << 8) | ((bArr3[0] & 255) << 16) | (input[offset] & 255);
                    this.f127429d = 0;
                    i10 = i15;
                } else {
                    i10 = offset;
                    i11 = -1;
                }
            } else if (offset + 2 <= i17) {
                i10 = offset + 2;
                i11 = (input[offset + 1] & 255) | ((this.f127428c[0] & 255) << 16) | ((input[offset] & 255) << 8);
                this.f127429d = 0;
            } else {
                i10 = offset;
                i11 = -1;
            }
            if (i11 != -1) {
                bArr2[0] = bArr[(i11 >> 18) & 63];
                bArr2[1] = bArr[(i11 >> 12) & 63];
                bArr2[2] = bArr[(i11 >> 6) & 63];
                bArr2[3] = bArr[i11 & 63];
                i16--;
                if (i16 == 0) {
                    if (this.f127433h) {
                        bArr2[4] = 13;
                        i14 = 5;
                    } else {
                        i14 = 4;
                    }
                    i12 = i14 + 1;
                    bArr2[i14] = 10;
                    i16 = 19;
                } else {
                    i12 = 4;
                }
            } else {
                i12 = 0;
            }
            while (true) {
                i10 += 3;
                if (i10 > i17) {
                    break;
                }
                c10 = c10;
                int i20 = ((input[i10 + 1] & 255) << 8) | ((input[i10] & 255) << 16) | (input[i10 + 2] & 255);
                bArr2[i12] = bArr[(i20 >> 18) & 63];
                bArr2[i12 + 1] = bArr[(i20 >> 12) & 63];
                bArr2[i12 + 2] = bArr[(i20 >> 6) & 63];
                bArr2[i12 + 3] = bArr[i20 & 63];
                int i21 = i12 + 4;
                i16--;
                if (i16 == 0) {
                    if (this.f127433h) {
                        bArr2[i21] = 13;
                        i21 = i12 + 5;
                    }
                    i12 = i21 + 1;
                    bArr2[i21] = 10;
                    i16 = 19;
                } else {
                    i12 = i21;
                }
            }
            if (finish) {
                int i22 = this.f127429d;
                if (i10 - i22 == i17 - 1) {
                    if (i22 > 0) {
                        b12 = this.f127428c[0];
                        i19 = 1;
                    } else {
                        b12 = input[i10];
                    }
                    int i23 = (b12 & 255) << 4;
                    this.f127429d = i22 - i19;
                    bArr2[i12] = bArr[(i23 >> 6) & 63];
                    int i24 = i12 + 2;
                    bArr2[i12 + 1] = bArr[i23 & 63];
                    if (this.f127431f) {
                        bArr2[i24] = yr.a.f159811k;
                        i24 = i12 + 4;
                        bArr2[i12 + 3] = yr.a.f159811k;
                    }
                    if (this.f127432g) {
                        if (this.f127433h) {
                            bArr2[i24] = 13;
                            i24++;
                        }
                        i13 = i24 + 1;
                        bArr2[i24] = 10;
                        i12 = i13;
                    } else {
                        i12 = i24;
                    }
                } else if (i10 - i22 == i17 - 2) {
                    if (i22 > 1) {
                        b10 = this.f127428c[0];
                        i19 = 1;
                    } else {
                        byte b13 = input[i10];
                        i10++;
                        b10 = b13;
                    }
                    int i25 = (b10 & 255) << 10;
                    if (i22 > 0) {
                        b11 = this.f127428c[i19];
                        i19++;
                    } else {
                        b11 = input[i10];
                    }
                    int i26 = i25 | ((b11 & 255) << 2);
                    this.f127429d = i22 - i19;
                    bArr2[i12] = bArr[(i26 >> 12) & 63];
                    bArr2[i12 + 1] = bArr[(i26 >> 6) & 63];
                    int i27 = i12 + 3;
                    bArr2[i12 + 2] = bArr[i26 & 63];
                    if (this.f127431f) {
                        bArr2[i27] = yr.a.f159811k;
                        i27 = i12 + 4;
                    }
                    if (this.f127432g) {
                        if (this.f127433h) {
                            bArr2[i27] = 13;
                            i27++;
                        }
                        i13 = i27 + 1;
                        bArr2[i27] = 10;
                        i12 = i13;
                    } else {
                        i12 = i27;
                    }
                } else if (this.f127432g && i12 > 0 && i16 != 19) {
                    if (this.f127433h) {
                        bArr2[i12] = 13;
                        i12++;
                    }
                    i13 = i12 + 1;
                    bArr2[i12] = 10;
                    i12 = i13;
                }
            } else if (i10 == i17 - 1) {
                byte[] bArr4 = this.f127428c;
                int i28 = this.f127429d;
                this.f127429d = i28 + 1;
                bArr4[i28] = input[i10];
            } else if (i10 == i17 - 2) {
                byte[] bArr5 = this.f127428c;
                int i29 = this.f127429d;
                int i30 = i29 + 1;
                this.f127429d = i30;
                bArr5[i29] = input[i10];
                this.f127429d = i29 + 2;
                bArr5[i30] = input[i10 + 1];
            }
            this.f127416b = i12;
            this.f127430e = i16;
        }
    }

    public static byte[] a(String str, int flags) {
        return b(str.getBytes(), flags);
    }

    public static byte[] b(byte[] input, int flags) {
        return c(input, 0, input.length, flags);
    }

    public static byte[] c(byte[] input, int offset, int len, int flags) {
        b bVar = new b(flags, new byte[(len * 3) / 4]);
        if (!bVar.a(input, offset, len, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int i10 = bVar.f127416b;
        byte[] bArr = bVar.f127415a;
        if (i10 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        return bArr2;
    }

    public static byte[] d(byte[] input, int flags) {
        return e(input, 0, input.length, flags);
    }

    public static byte[] e(byte[] input, int offset, int len, int flags) {
        c cVar = new c(flags, null);
        int i10 = (len / 3) * 4;
        if (!cVar.f127431f) {
            int i11 = len % 3;
            if (i11 == 1) {
                i10 += 2;
            } else if (i11 == 2) {
                i10 += 3;
            }
        } else if (len % 3 > 0) {
            i10 += 4;
        }
        if (cVar.f127432g && len > 0) {
            i10 += (((len - 1) / 57) + 1) * (cVar.f127433h ? 2 : 1);
        }
        cVar.f127415a = new byte[i10];
        cVar.a(input, offset, len, true);
        return cVar.f127415a;
    }

    public static String f(byte[] input, int flags) {
        try {
            return new String(d(input, flags), "US-ASCII");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }
}
