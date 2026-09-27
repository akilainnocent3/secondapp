package fw;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final String[] f85522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public static final byte[] f85523b;

    static {
        String[] strArr = new String[93];
        for (int i10 = 0; i10 < 32; i10++) {
            strArr[i10] = "\\u" + f(i10 >> 12) + f(i10 >> 8) + f(i10 >> 4) + f(i10);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f85522a = strArr;
        byte[] bArr = new byte[93];
        for (int i11 = 0; i11 < 32; i11++) {
            bArr[i11] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f85523b = bArr;
    }

    @oy.l
    public static final byte[] a() {
        return f85523b;
    }

    @oy.l
    public static final String[] b() {
        return f85522a;
    }

    public static final void d(@oy.l StringBuilder sb2, @oy.l String value) {
        kotlin.jvm.internal.m0.p(sb2, "<this>");
        kotlin.jvm.internal.m0.p(value, "value");
        sb2.append('\"');
        int length = value.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = value.charAt(i11);
            String[] strArr = f85522a;
            if (cCharAt < strArr.length && strArr[cCharAt] != null) {
                sb2.append((CharSequence) value, i10, i11);
                sb2.append(strArr[cCharAt]);
                i10 = i11 + 1;
            }
        }
        if (i10 != 0) {
            sb2.append((CharSequence) value, i10, value.length());
        } else {
            sb2.append(value);
        }
        sb2.append('\"');
    }

    @oy.m
    public static final Boolean e(@oy.l String str) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        if (cv.k0.c2(str, "true", true)) {
            return Boolean.TRUE;
        }
        if (cv.k0.c2(str, "false", true)) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final char f(int i10) {
        int i11 = i10 & 15;
        return (char) (i11 < 10 ? i11 + 48 : i11 + 87);
    }

    @dr.f1
    public static /* synthetic */ void c() {
    }
}
