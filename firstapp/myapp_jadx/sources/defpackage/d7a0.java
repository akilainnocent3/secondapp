package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d7a0 {
    public final float a;
    public final float b;
    public final c8n c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final float h;

    public d7a0(float f, float f2, c8n c8nVar, int i, int i2, int i3, int i4, float f3) {
        this.a = f;
        this.b = f2;
        this.c = c8nVar;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7a0)) {
            return false;
        }
        d7a0 d7a0Var = (d7a0) obj;
        return Float.compare(this.a, d7a0Var.a) == 0 && Float.compare(this.b, d7a0Var.b) == 0 && Intrinsics.g(this.c, d7a0Var.c) && this.d == d7a0Var.d && this.e == d7a0Var.e && this.f == d7a0Var.f && this.g == d7a0Var.g && Float.compare(this.h, d7a0Var.h) == 0;
    }

    public final int hashCode() {
        int iA = tvh.a(this.b, Float.hashCode(this.a) * 31, 31);
        c8n c8nVar = this.c;
        return Float.hashCode(this.h) + mtg0.a(mtg0.a(mtg0.a(gpp.a(15, gpp.a(255, gpp.a(150, gpp.a(this.g, gpp.a(this.f, gpp.a(this.e, gpp.a(this.d, (iA + (c8nVar == null ? 0 : c8nVar.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31), 31, true), 31, false), 31, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SnowParams(width=");
        sb.append(this.a);
        sb.append(", height=");
        sb.append(this.b);
        sb.append(", bitmap=");
        sb.append(this.c);
        sb.append(", sizeMinCirclePx=");
        sb.append(this.d);
        sb.append(", sizeMaxCirclePx=");
        d5d.a(sb, this.e, ", sizeMinSnowflakePx=", this.f, ", sizeMaxSnowflakePx=");
        sb.append(this.g);
        sb.append(", alphaMin=150, alphaMax=255, angleMax=15, shouldRecycle=true, fadingEnabled=false, alreadyFalling=false, baseSpeed=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
