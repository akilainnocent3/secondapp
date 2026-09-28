package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class pk1 extends wf80.f {
    public final ijd a;
    public final List<ijd> b;
    public final int c;
    public final int d;
    public final dhf e;

    public static final class a extends wf80.f.a {
        public ijd a;
        public List<ijd> b;
        public Integer c;
        public Integer d;
        public dhf e;

        public final pk1 a() {
            String strConcat = this.a == null ? " surface" : "";
            if (this.b == null) {
                strConcat = strConcat.concat(" sharedSurfaces");
            }
            if (this.c == null) {
                strConcat = strConcat.concat(" mirrorMode");
            }
            if (this.d == null) {
                strConcat = strConcat.concat(" surfaceGroupId");
            }
            if (this.e == null) {
                strConcat = strConcat.concat(" dynamicRange");
            }
            if (strConcat.isEmpty()) {
                return new pk1(this.a, this.b, this.c.intValue(), this.d.intValue(), this.e);
            }
            ib5.a("Missing required properties:".concat(strConcat));
            return null;
        }
    }

    public pk1(ijd ijdVar, List list, int i, int i2, dhf dhfVar) {
        this.a = ijdVar;
        this.b = list;
        this.c = i;
        this.d = i2;
        this.e = dhfVar;
    }

    @Override // wf80.f
    public final dhf b() {
        return this.e;
    }

    @Override // wf80.f
    public final int c() {
        return this.c;
    }

    @Override // wf80.f
    public final String d() {
        return null;
    }

    @Override // wf80.f
    public final List<ijd> e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wf80.f)) {
            return false;
        }
        wf80.f fVar = (wf80.f) obj;
        return this.a.equals(fVar.f()) && this.b.equals(fVar.e()) && fVar.d() == null && this.c == fVar.c() && this.d == fVar.g() && this.e.equals(fVar.b());
    }

    @Override // wf80.f
    public final ijd f() {
        return this.a;
    }

    @Override // wf80.f
    public final int g() {
        return this.d;
    }

    public final int hashCode() {
        return this.e.hashCode() ^ ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * (-721379959)) ^ this.c) * 1000003) ^ this.d) * 1000003);
    }

    public final String toString() {
        return "OutputConfig{surface=" + this.a + ", sharedSurfaces=" + this.b + ", physicalCameraId=null, mirrorMode=" + this.c + ", surfaceGroupId=" + this.d + ", dynamicRange=" + this.e + "}";
    }
}
