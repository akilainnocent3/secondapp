package com.google.gson;

import com.google.gson.stream.JsonWriter;
import gm.j0;
import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j {
    @Deprecated
    public j() {
    }

    public abstract j d();

    public BigDecimal e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public BigInteger f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean g() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public byte h() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    @Deprecated
    public char i() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public double j() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public float l() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int m() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public g n() {
        if (v()) {
            return (g) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    @qj.a
    public l o() {
        if (w()) {
            return (l) this;
        }
        throw new IllegalStateException("Not a JSON Null: " + this);
    }

    public m p() {
        if (x()) {
            return (m) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public p q() {
        if (y()) {
            return (p) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public long r() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public Number s() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public short t() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.setStrictness(w.LENIENT);
            j0.b(this, jsonWriter);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public String u() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean v() {
        return this instanceof g;
    }

    public boolean w() {
        return this instanceof l;
    }

    public boolean x() {
        return this instanceof m;
    }

    public boolean y() {
        return this instanceof p;
    }
}
