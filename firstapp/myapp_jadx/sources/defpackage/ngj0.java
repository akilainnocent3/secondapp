package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public enum ngj0 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(pl5.b),
    ENUM(null),
    MESSAGE(null);

    public final Object a;

    ngj0(Serializable serializable) {
        this.a = serializable;
    }
}
