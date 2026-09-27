package com.google.gson;

import gm.e0;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f52564b;

    public p(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f52564b = bool;
    }

    public static boolean B(p pVar) {
        Object obj = pVar.f52564b;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public boolean A() {
        return this.f52564b instanceof Boolean;
    }

    public boolean C() {
        return this.f52564b instanceof Number;
    }

    public boolean D() {
        return this.f52564b instanceof String;
    }

    @Override // com.google.gson.j
    public BigDecimal e() {
        Object obj = this.f52564b;
        return obj instanceof BigDecimal ? (BigDecimal) obj : e0.b(u());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f52564b == null) {
            return pVar.f52564b == null;
        }
        if (B(this) && B(pVar)) {
            if ((this.f52564b instanceof BigInteger) || (pVar.f52564b instanceof BigInteger)) {
                return f().equals(pVar.f());
            }
            return s().longValue() == pVar.s().longValue();
        }
        Object obj2 = this.f52564b;
        if (obj2 instanceof Number) {
            Object obj3 = pVar.f52564b;
            if (obj3 instanceof Number) {
                if ((obj2 instanceof BigDecimal) && (obj3 instanceof BigDecimal)) {
                    return e().compareTo(pVar.e()) == 0;
                }
                double dJ = j();
                double dJ2 = pVar.j();
                return dJ == dJ2 || (Double.isNaN(dJ) && Double.isNaN(dJ2));
            }
        }
        return obj2.equals(pVar.f52564b);
    }

    @Override // com.google.gson.j
    public BigInteger f() {
        Object obj = this.f52564b;
        if (obj instanceof BigInteger) {
            return (BigInteger) obj;
        }
        return B(this) ? BigInteger.valueOf(s().longValue()) : e0.c(u());
    }

    @Override // com.google.gson.j
    public boolean g() {
        return A() ? ((Boolean) this.f52564b).booleanValue() : Boolean.parseBoolean(u());
    }

    @Override // com.google.gson.j
    public byte h() {
        return C() ? s().byteValue() : Byte.parseByte(u());
    }

    public int hashCode() {
        long jDoubleToLongBits;
        if (this.f52564b == null) {
            return 31;
        }
        if (B(this)) {
            jDoubleToLongBits = s().longValue();
        } else {
            Object obj = this.f52564b;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(s().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    @Override // com.google.gson.j
    @Deprecated
    public char i() {
        String strU = u();
        if (strU.isEmpty()) {
            throw new UnsupportedOperationException("String value is empty");
        }
        return strU.charAt(0);
    }

    @Override // com.google.gson.j
    public double j() {
        return C() ? s().doubleValue() : Double.parseDouble(u());
    }

    @Override // com.google.gson.j
    public float l() {
        return C() ? s().floatValue() : Float.parseFloat(u());
    }

    @Override // com.google.gson.j
    public int m() {
        return C() ? s().intValue() : Integer.parseInt(u());
    }

    @Override // com.google.gson.j
    public long r() {
        return C() ? s().longValue() : Long.parseLong(u());
    }

    @Override // com.google.gson.j
    public Number s() {
        Object obj = this.f52564b;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new gm.b0((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    @Override // com.google.gson.j
    public short t() {
        return C() ? s().shortValue() : Short.parseShort(u());
    }

    @Override // com.google.gson.j
    public String u() {
        Object obj = this.f52564b;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (C()) {
            return s().toString();
        }
        if (A()) {
            return ((Boolean) this.f52564b).toString();
        }
        throw new AssertionError("Unexpected value type: " + this.f52564b.getClass());
    }

    public p(Number number) {
        Objects.requireNonNull(number);
        this.f52564b = number;
    }

    public p(String str) {
        Objects.requireNonNull(str);
        this.f52564b = str;
    }

    public p(Character ch2) {
        Objects.requireNonNull(ch2);
        this.f52564b = ch2.toString();
    }

    @Override // com.google.gson.j
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public p d() {
        return this;
    }
}
