package gm;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.math.BigDecimal;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 extends Number {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f87128b;

    public b0(String str) {
        this.f87128b = str;
    }

    public final BigDecimal d() {
        return e0.b(this.f87128b);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f87128b);
    }

    public final void e(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b0) {
            return this.f87128b.equals(((b0) obj).f87128b);
        }
        return false;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f87128b);
    }

    public final Object g() throws ObjectStreamException {
        return d();
    }

    public int hashCode() {
        return this.f87128b.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f87128b);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f87128b);
            }
        } catch (NumberFormatException unused2) {
            return d().intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f87128b);
        } catch (NumberFormatException unused) {
            return d().longValue();
        }
    }

    public String toString() {
        return this.f87128b;
    }
}
