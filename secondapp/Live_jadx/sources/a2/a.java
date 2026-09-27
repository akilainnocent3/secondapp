package a2;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f0 f3514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char f3515e = 8234;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final char f3516f = 8235;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final char f3517g = 8236;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final char f3518h = 8206;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final char f3519i = 8207;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f3520j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f3521k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f3522l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f3523m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f3524n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f3525o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f3526p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f3527q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f3528r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f3529s = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f0 f3532c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f3536f = 1792;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final byte[] f3537g = new byte[f3536f];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CharSequence f3538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f3539b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f3540c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3541d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public char f3542e;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f3537g[i10] = Character.getDirectionality(i10);
            }
        }

        public b(CharSequence charSequence, boolean z10) {
            this.f3538a = charSequence;
            this.f3539b = z10;
            this.f3540c = charSequence.length();
        }

        public static byte c(char c10) {
            return c10 < 1792 ? f3537g[c10] : Character.getDirectionality(c10);
        }

        public byte a() {
            char cCharAt = this.f3538a.charAt(this.f3541d - 1);
            this.f3542e = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f3538a, this.f3541d);
                this.f3541d -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f3541d--;
            byte bC = c(this.f3542e);
            if (!this.f3539b) {
                return bC;
            }
            char c10 = this.f3542e;
            if (c10 == '>') {
                return h();
            }
            return c10 == ';' ? f() : bC;
        }

        public byte b() {
            char cCharAt = this.f3538a.charAt(this.f3541d);
            this.f3542e = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.f3538a, this.f3541d);
                this.f3541d += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.f3541d++;
            byte bC = c(this.f3542e);
            if (!this.f3539b) {
                return bC;
            }
            char c10 = this.f3542e;
            if (c10 == '<') {
                return i();
            }
            return c10 == '&' ? g() : bC;
        }

        public int d() {
            this.f3541d = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (this.f3541d < this.f3540c && i10 == 0) {
                byte b10 = b();
                if (b10 != 0) {
                    if (b10 == 1 || b10 == 2) {
                        if (i12 == 0) {
                            return 1;
                        }
                    } else if (b10 != 9) {
                        switch (b10) {
                            case 14:
                            case 15:
                                i12++;
                                i11 = -1;
                                continue;
                            case 16:
                            case 17:
                                i12++;
                                i11 = 1;
                                continue;
                            case 18:
                                i12--;
                                i11 = 0;
                                continue;
                        }
                    }
                } else if (i12 == 0) {
                    return -1;
                }
                i10 = i12;
            }
            if (i10 == 0) {
                return 0;
            }
            if (i11 != 0) {
                return i11;
            }
            while (this.f3541d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i10 == i12) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i10 == i12) {
                            return 1;
                        }
                        break;
                    case 18:
                        i12++;
                        continue;
                    default:
                        continue;
                }
                i12--;
            }
            return 0;
        }

        public int e() {
            this.f3541d = this.f3540c;
            int i10 = 0;
            while (true) {
                int i11 = i10;
                while (this.f3541d > 0) {
                    byte bA = a();
                    if (bA == 0) {
                        if (i10 == 0) {
                            return -1;
                        }
                        if (i11 == 0) {
                        }
                    } else if (bA == 1 || bA == 2) {
                        if (i10 == 0) {
                            return 1;
                        }
                        if (i11 == 0) {
                        }
                    } else if (bA != 9) {
                        switch (bA) {
                            case 14:
                            case 15:
                                if (i11 == i10) {
                                    return -1;
                                }
                                i10--;
                                break;
                            case 16:
                            case 17:
                                if (i11 == i10) {
                                    return 1;
                                }
                                i10--;
                                break;
                            case 18:
                                i10++;
                                break;
                            default:
                                if (i11 != 0) {
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                }
                return 0;
            }
        }

        public final byte f() {
            char cCharAt;
            int i10 = this.f3541d;
            do {
                int i11 = this.f3541d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f3538a;
                int i12 = i11 - 1;
                this.f3541d = i12;
                cCharAt = charSequence.charAt(i12);
                this.f3542e = cCharAt;
                if (cCharAt == '&') {
                    return zi.c.f161636n;
                }
            } while (cCharAt != ';');
            this.f3541d = i10;
            this.f3542e = ';';
            return (byte) 13;
        }

        public final byte g() {
            char cCharAt;
            do {
                int i10 = this.f3541d;
                if (i10 >= this.f3540c) {
                    return zi.c.f161636n;
                }
                CharSequence charSequence = this.f3538a;
                this.f3541d = i10 + 1;
                cCharAt = charSequence.charAt(i10);
                this.f3542e = cCharAt;
            } while (cCharAt != ';');
            return zi.c.f161636n;
        }

        public final byte h() {
            char cCharAt;
            int i10 = this.f3541d;
            while (true) {
                int i11 = this.f3541d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f3538a;
                int i12 = i11 - 1;
                this.f3541d = i12;
                char cCharAt2 = charSequence.charAt(i12);
                this.f3542e = cCharAt2;
                if (cCharAt2 == '<') {
                    return zi.c.f161636n;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i13 = this.f3541d;
                        if (i13 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f3538a;
                        int i14 = i13 - 1;
                        this.f3541d = i14;
                        cCharAt = charSequence2.charAt(i14);
                        this.f3542e = cCharAt;
                    } while (cCharAt != cCharAt2);
                }
            }
            this.f3541d = i10;
            this.f3542e = '>';
            return (byte) 13;
        }

        public final byte i() {
            char cCharAt;
            int i10 = this.f3541d;
            while (true) {
                int i11 = this.f3541d;
                if (i11 >= this.f3540c) {
                    this.f3541d = i10;
                    this.f3542e = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f3538a;
                this.f3541d = i11 + 1;
                char cCharAt2 = charSequence.charAt(i11);
                this.f3542e = cCharAt2;
                if (cCharAt2 == '>') {
                    return zi.c.f161636n;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i12 = this.f3541d;
                        if (i12 >= this.f3540c) {
                            break;
                        }
                        CharSequence charSequence2 = this.f3538a;
                        this.f3541d = i12 + 1;
                        cCharAt = charSequence2.charAt(i12);
                        this.f3542e = cCharAt;
                    } while (cCharAt != cCharAt2);
                }
            }
        }
    }

    static {
        f0 f0Var = g0.f3559c;
        f3514d = f0Var;
        f3520j = Character.toString(f3518h);
        f3521k = Character.toString(f3519i);
        f3525o = new a(false, 2, f0Var);
        f3526p = new a(true, 2, f0Var);
    }

    public a(boolean z10, int i10, f0 f0Var) {
        this.f3530a = z10;
        this.f3531b = i10;
        this.f3532c = f0Var;
    }

    public static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    public static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0001a().a();
    }

    public static a d(Locale locale) {
        return new C0001a(locale).a();
    }

    public static a e(boolean z10) {
        return new C0001a(z10).a();
    }

    public static boolean j(Locale locale) {
        return h0.a(locale) == 1;
    }

    public boolean f() {
        return (this.f3531b & 2) != 0;
    }

    public boolean g(CharSequence charSequence) {
        return this.f3532c.isRtl(charSequence, 0, charSequence.length());
    }

    public boolean h(String str) {
        return g(str);
    }

    public boolean i() {
        return this.f3530a;
    }

    public final String k(CharSequence charSequence, f0 f0Var) {
        boolean zIsRtl = f0Var.isRtl(charSequence, 0, charSequence.length());
        if (!this.f3530a && (zIsRtl || b(charSequence) == 1)) {
            return f3520j;
        }
        if (this.f3530a) {
            return (!zIsRtl || b(charSequence) == -1) ? f3521k : "";
        }
        return "";
    }

    public final String l(CharSequence charSequence, f0 f0Var) {
        boolean zIsRtl = f0Var.isRtl(charSequence, 0, charSequence.length());
        if (!this.f3530a && (zIsRtl || a(charSequence) == 1)) {
            return f3520j;
        }
        if (this.f3530a) {
            return (!zIsRtl || a(charSequence) == -1) ? f3521k : "";
        }
        return "";
    }

    public CharSequence m(CharSequence charSequence) {
        return o(charSequence, this.f3532c, true);
    }

    public CharSequence n(CharSequence charSequence, f0 f0Var) {
        return o(charSequence, f0Var, true);
    }

    public CharSequence o(CharSequence charSequence, f0 f0Var, boolean z10) {
        if (charSequence == null) {
            return null;
        }
        boolean zIsRtl = f0Var.isRtl(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (f() && z10) {
            spannableStringBuilder.append((CharSequence) l(charSequence, zIsRtl ? g0.f3558b : g0.f3557a));
        }
        if (zIsRtl != this.f3530a) {
            spannableStringBuilder.append(zIsRtl ? f3516f : f3515e);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(f3517g);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z10) {
            spannableStringBuilder.append((CharSequence) k(charSequence, zIsRtl ? g0.f3558b : g0.f3557a));
        }
        return spannableStringBuilder;
    }

    public CharSequence p(CharSequence charSequence, boolean z10) {
        return o(charSequence, this.f3532c, z10);
    }

    public String q(String str) {
        return s(str, this.f3532c, true);
    }

    public String r(String str, f0 f0Var) {
        return s(str, f0Var, true);
    }

    public String s(String str, f0 f0Var, boolean z10) {
        if (str == null) {
            return null;
        }
        return o(str, f0Var, z10).toString();
    }

    public String t(String str, boolean z10) {
        return s(str, this.f3532c, z10);
    }

    /* JADX INFO: renamed from: a2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C0001a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f3533a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3534b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public f0 f3535c;

        public C0001a() {
            c(a.j(Locale.getDefault()));
        }

        public static a b(boolean z10) {
            return z10 ? a.f3526p : a.f3525o;
        }

        public a a() {
            return (this.f3534b == 2 && this.f3535c == a.f3514d) ? b(this.f3533a) : new a(this.f3533a, this.f3534b, this.f3535c);
        }

        public final void c(boolean z10) {
            this.f3533a = z10;
            this.f3535c = a.f3514d;
            this.f3534b = 2;
        }

        public C0001a d(f0 f0Var) {
            this.f3535c = f0Var;
            return this;
        }

        public C0001a e(boolean z10) {
            if (z10) {
                this.f3534b |= 2;
                return this;
            }
            this.f3534b &= -3;
            return this;
        }

        public C0001a(boolean z10) {
            c(z10);
        }

        public C0001a(Locale locale) {
            c(a.j(locale));
        }
    }
}
