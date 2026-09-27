package yads;

import android.graphics.Color;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class f33 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f148954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f148955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f148956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f148957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f148958e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f148959f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f148960g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f148961h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f148962i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f148963j;

    public f33(String str, int i10, Integer num, Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.f148954a = str;
        this.f148955b = i10;
        this.f148956c = num;
        this.f148957d = num2;
        this.f148958e = f10;
        this.f148959f = z10;
        this.f148960g = z11;
        this.f148961h = z12;
        this.f148962i = z13;
        this.f148963j = i11;
    }

    public static boolean a(String str) {
        try {
            int i10 = Integer.parseInt(str);
            return i10 == 1 || i10 == -1;
        } catch (NumberFormatException e10) {
            ih1.d("SsaStyle", ih1.a("Failed to parse boolean value: '" + str + "'", e10));
            return false;
        }
    }

    public static Integer b(String str) {
        try {
            long j10 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            if (j10 > 4294967295L) {
                throw new IllegalArgumentException();
            }
            return Integer.valueOf(Color.argb(td1.a(((j10 >> 24) & 255) ^ 255), td1.a(j10 & 255), td1.a((j10 >> 8) & 255), td1.a((j10 >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            ih1.d("SsaStyle", ih1.a("Failed to parse color expression: '" + str + "'", e10));
            return null;
        }
    }
}
