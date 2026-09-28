package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m70 implements uj10 {
    public final int b;

    public m70(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m70) && this.b == ((m70) obj).b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return rr1.b(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.b, ')');
    }
}
