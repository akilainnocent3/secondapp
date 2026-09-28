package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class un4 {
    public final float a = 7.0f;
    public final float b = 12.0f;
    public final float c = 2.0f;
    public final float d = 2.0f;
    public final float e = 0.4f;
    public final float f = 0.1f;
    public final float g = 0.1f;
    public final float h = 20.0f;
    public final float i = 0.78f;
    public final float j = 0.62f;
    public final float k = 0.55f;
    public final float l = 0.5f;
    public final float m = 2.75f;
    public final float n = 1.75f;
    public final float o = 3.375f;
    public final float p = 1.0f;
    public final float q = 1.0f;
    public final float r = 0.85f;
    public final float s = 0.85f;
    public final float t = 1.8f;
    public final float u = 4.6f;
    public final float v = 0.12f;
    public final float w = 0.12f;
    public final float x = 0.18f;
    public final float y = 0.22f;
    public final float z = 0.32f;
    public final float A = 0.65f;
    public final float B = 1.05f;
    public final float C = 7.0f;
    public final float D = 13.0f;
    public final float E = 0.25f;
    public final int F = 6;
    public final float G = 0.8f;
    public final float H = 0.05f;

    public un4(int i) {
    }

    public final float a() {
        return (this.a / 2.0f) - (this.c / 2.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof un4)) {
            return false;
        }
        un4 un4Var = (un4) obj;
        return Float.compare(this.a, un4Var.a) == 0 && Float.compare(this.b, un4Var.b) == 0 && Float.compare(this.c, un4Var.c) == 0 && Float.compare(this.d, un4Var.d) == 0 && Float.compare(this.e, un4Var.e) == 0 && Float.compare(this.f, un4Var.f) == 0 && Float.compare(this.g, un4Var.g) == 0 && Float.compare(this.h, un4Var.h) == 0 && Float.compare(this.i, un4Var.i) == 0 && Float.compare(this.j, un4Var.j) == 0 && Float.compare(this.k, un4Var.k) == 0 && Float.compare(this.l, un4Var.l) == 0 && Float.compare(this.m, un4Var.m) == 0 && Float.compare(this.n, un4Var.n) == 0 && Float.compare(this.o, un4Var.o) == 0 && Float.compare(this.p, un4Var.p) == 0 && Float.compare(this.q, un4Var.q) == 0 && Float.compare(this.r, un4Var.r) == 0 && Float.compare(this.s, un4Var.s) == 0 && Float.compare(this.t, un4Var.t) == 0 && Float.compare(this.u, un4Var.u) == 0 && Float.compare(this.v, un4Var.v) == 0 && Float.compare(this.w, un4Var.w) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.x, un4Var.x) == 0 && Float.compare(this.y, un4Var.y) == 0 && Float.compare(this.z, un4Var.z) == 0 && Float.compare(this.A, un4Var.A) == 0 && Float.compare(this.B, un4Var.B) == 0 && Float.compare(this.C, un4Var.C) == 0 && Float.compare(this.D, un4Var.D) == 0 && Float.compare(this.E, un4Var.E) == 0 && this.F == un4Var.F && Float.compare(this.G, un4Var.G) == 0 && Float.compare(this.H, un4Var.H) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.H) + tvh.a(this.G, gpp.a(this.F, tvh.a(this.E, tvh.a(this.D, tvh.a(this.C, tvh.a(this.B, tvh.a(this.A, tvh.a(this.z, tvh.a(this.y, tvh.a(this.x, tvh.a(0.0f, tvh.a(this.w, tvh.a(this.v, tvh.a(this.u, tvh.a(this.t, tvh.a(this.s, tvh.a(this.r, tvh.a(this.q, tvh.a(this.p, tvh.a(this.o, tvh.a(this.n, tvh.a(this.m, tvh.a(this.l, tvh.a(this.k, tvh.a(this.j, tvh.a(this.i, tvh.a(this.h, tvh.a(this.g, tvh.a(this.f, tvh.a(this.e, tvh.a(this.d, tvh.a(this.c, tvh.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BonusCupPhysicsConfig(playfieldColumns=");
        sb.append(this.a);
        sb.append(", playfieldRows=");
        sb.append(this.b);
        sb.append(", cupWidth=");
        sb.append(this.c);
        sb.append(", cupHeight=");
        sb.append(this.d);
        sb.append(", cupMoveDurationSeconds=");
        sb.append(this.e);
        sb.append(", cupSettleDurationSeconds=");
        sb.append(this.f);
        sb.append(", cupSettleTiltDurationSeconds=");
        sb.append(this.g);
        sb.append(", maxCupTiltDegrees=");
        sb.append(this.h);
        sb.append(", catchWidthRatioWhenIdle=");
        sb.append(this.i);
        sb.append(", catchWidthRatioWhenTilted=");
        sb.append(this.j);
        sb.append(", cupCatchDepthRatio=");
        sb.append(this.k);
        sb.append(", cupRimHorizontalPadding=");
        sb.append(this.l);
        sb.append(", baseGravityCellsPerSecond=");
        sb.append(this.m);
        sb.append(", normalBallInitialFallSpeed=");
        sb.append(this.n);
        sb.append(", maxBallFallSpeed=");
        sb.append(this.o);
        sb.append(", goldenBallFallSpeedMultiplier=");
        sb.append(this.p);
        sb.append(", cardFallSpeedMultiplier=");
        sb.append(this.q);
        sb.append(", ballHorizontalSpawnSpeed=");
        sb.append(this.r);
        sb.append(", wallBounceDamping=");
        sb.append(this.s);
        sb.append(", juggleImpulseX=");
        sb.append(this.t);
        sb.append(", juggleImpulseY=");
        sb.append(this.u);
        sb.append(", cupJuggleGraceSeconds=");
        sb.append(this.v);
        sb.append(", collisionCooldownSeconds=");
        sb.append(this.w);
        sb.append(", outOfPlayRowsFromBottom=0.0, ballRadius=");
        sb.append(this.x);
        sb.append(", cardHalfWidth=");
        sb.append(this.y);
        sb.append(", cardHalfHeight=");
        sb.append(this.z);
        sb.append(", firstBallSpawnDelaySeconds=");
        sb.append(this.A);
        sb.append(", ballSpawnIntervalSeconds=");
        sb.append(this.B);
        sb.append(", yellowCardSpawnIntervalSeconds=");
        sb.append(this.C);
        sb.append(", redCardSpawnIntervalSeconds=");
        sb.append(this.D);
        sb.append(", spawnJitterSeconds=");
        sb.append(this.E);
        sb.append(", maxActiveBalls=");
        sb.append(this.F);
        sb.append(", effectDurationSeconds=");
        sb.append(this.G);
        sb.append(", maxFrameDeltaSeconds=");
        return h70.a(sb, this.H, ')');
    }
}
