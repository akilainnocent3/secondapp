package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class hxa {
    public static float a(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static /* synthetic */ void b(StringBuilder sb, Object obj) {
        sb.append(" at path ");
        sb.append(obj);
        throw new lcp(sb.toString());
    }

    public static void c(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }
}
