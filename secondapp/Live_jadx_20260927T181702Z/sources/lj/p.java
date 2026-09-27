package lj;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@f
@yi.b
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f104640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f104641b;

    public p(String rawValue, int radix) {
        this.f104640a = rawValue;
        this.f104641b = radix;
    }

    public static p a(String stringValue) {
        if (stringValue.length() == 0) {
            throw new NumberFormatException("empty string");
        }
        char cCharAt = stringValue.charAt(0);
        int i10 = 16;
        if (stringValue.startsWith("0x") || stringValue.startsWith("0X")) {
            stringValue = stringValue.substring(2);
        } else if (cCharAt == '#') {
            stringValue = stringValue.substring(1);
        } else if (cCharAt != '0' || stringValue.length() <= 1) {
            i10 = 10;
        } else {
            stringValue = stringValue.substring(1);
            i10 = 8;
        }
        return new p(stringValue, i10);
    }
}
