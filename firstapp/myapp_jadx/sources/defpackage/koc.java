package defpackage;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes8.dex */
public final class koc extends q12<joc> {
    public final float b;
    public final float c;
    public final bwf d;
    public final bwf e;
    public final float f;
    public final float g;
    public final float h;
    public final kmj i;
    public float o;
    public float p;
    public final float q;
    public float r;
    public joc s;
    public int t;
    public final fw u;
    public final fw v;
    public final fw w;
    public float x;
    public float y;
    public boolean z = true;
    public final DecelerateInterpolator j = new DecelerateInterpolator();
    public final LinearInterpolator k = new LinearInterpolator();
    public final AccelerateInterpolator l = new AccelerateInterpolator();
    public final AccelerateInterpolator n = new AccelerateInterpolator();
    public final BounceInterpolator m = new BounceInterpolator();

    public koc(float f, float f2, float f3, float f4, float f5, bwf bwfVar, float f6, bwf bwfVar2, kmj kmjVar) {
        this.b = f;
        this.c = f2;
        this.f = f3;
        this.g = f4;
        this.h = f5;
        this.d = bwfVar;
        this.q = f6;
        this.e = bwfVar2;
        this.i = kmjVar;
        this.u = new fw(kmjVar.a() - 90, kmjVar.a());
        this.v = new fw(kmjVar.b(), kmjVar.a() - 540);
        this.w = new fw(kmjVar.b(), kmjVar.a());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:44:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:52:0x016e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0184 A[PHI: r7
      0x0184: PHI (r7v9 float) = (r7v1 float), (r7v2 float) binds: [B:53:0x0182, B:56:0x018c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x0188  */
    /* JADX WARN: Code duplicated, block: B:58:0x018f  */
    @Override // defpackage.q12
    public final joc b(long j, long j2) {
        String str;
        float f;
        float f2;
        float f3;
        float f4;
        joc jocVar;
        kmj kmjVar = this.i;
        if (j >= kmjVar.b()) {
            if (this.z) {
                this.z = false;
                this.s = c(kmjVar.b(), "can_collision");
            } else {
                int i = this.t;
                if (i == 0) {
                    ib5.a("no collision result");
                    return null;
                }
                if (i == 10) {
                    str = "hit_target_center";
                } else if (i == 11) {
                    str = "hit_target_edge";
                } else if (i == 20) {
                    str = "hit_goalkeeper";
                } else if (i == 22) {
                    str = "hit_frame_net";
                } else if (i == 23) {
                    str = "hit_nothing";
                } else if (i != 50) {
                    str = i != 51 ? "hit_frame_edge" : "hit_defense_obj_ufo";
                } else {
                    str = "hit_defense_obj_lightning";
                }
                int iHashCode = str.hashCode();
                fw fwVar = this.u;
                switch (iHashCode) {
                    case -1759562497:
                        str.equals("hit_target_edge");
                        float fB = (j - kmjVar.b()) / 900.0f;
                        float f5 = this.s.b;
                        f = this.r;
                        f2 = f5 + f;
                        f3 = this.g;
                        if (f2 > f3) {
                            f4 = f3;
                            f = 0.0f;
                        } else {
                            f3 = this.f;
                            if (f2 < f3) {
                                f4 = f3;
                                f = 0.0f;
                            } else {
                                f4 = f2;
                            }
                        }
                        float f6 = this.p;
                        jocVar = new joc(str, f4, (this.m.getInterpolation(fB) * (this.h - f6)) + f6, this.s.d, fwVar.a(j).floatValue(), this.s.f + f, false);
                        break;
                    case -377168095:
                        if (!str.equals("hit_nothing")) {
                            float fB2 = (j - kmjVar.b()) / 900.0f;
                            float f7 = this.s.b;
                            f = this.r;
                            f2 = f7 + f;
                            f3 = this.g;
                            if (f2 > f3) {
                                f4 = f3;
                                f = 0.0f;
                            } else {
                                f3 = this.f;
                                if (f2 < f3) {
                                    f4 = f3;
                                    f = 0.0f;
                                } else {
                                    f4 = f2;
                                }
                            }
                            float f8 = this.p;
                            jocVar = new joc(str, f4, (this.m.getInterpolation(fB2) * (this.h - f8)) + f8, this.s.d, fwVar.a(j).floatValue(), this.s.f + f, false);
                        } else {
                            joc jocVar2 = this.s;
                            float f9 = (this.r * 0.5f) + jocVar2.b;
                            float f10 = jocVar2.c;
                            float f11 = jocVar2.d;
                            jocVar = new joc(str, f9, (0.1f * f11) + f10, f11 * 0.98f, fwVar.a(j).floatValue(), this.s.f + this.r, true);
                        }
                        break;
                    case 378250507:
                        if (!str.equals("hit_defense_obj_ufo")) {
                            float fB3 = (j - kmjVar.b()) / 900.0f;
                            float f12 = this.s.b;
                            f = this.r;
                            f2 = f12 + f;
                            f3 = this.g;
                            if (f2 > f3) {
                                f4 = f3;
                                f = 0.0f;
                            } else {
                                f3 = this.f;
                                if (f2 < f3) {
                                    f4 = f3;
                                    f = 0.0f;
                                } else {
                                    f4 = f2;
                                }
                            }
                            float f13 = this.p;
                            jocVar = new joc(str, f4, (this.m.getInterpolation(fB3) * (this.h - f13)) + f13, this.s.d, fwVar.a(j).floatValue(), this.s.f + f, false);
                        } else {
                            jocVar = new joc(str, this.s.b, this.x - (Math.abs(this.y - this.x) * this.n.getInterpolation((j - kmjVar.b()) / 900.0f)), this.s.d, this.w.a(j).floatValue(), this.s.f, false);
                        }
                        break;
                    case 1125003643:
                        if (!str.equals("hit_frame_edge")) {
                            float fB4 = (j - kmjVar.b()) / 900.0f;
                            float f14 = this.s.b;
                            f = this.r;
                            f2 = f14 + f;
                            f3 = this.g;
                            if (f2 > f3) {
                                f4 = f3;
                                f = 0.0f;
                            } else {
                                f3 = this.f;
                                if (f2 < f3) {
                                    f4 = f3;
                                    f = 0.0f;
                                } else {
                                    f4 = f2;
                                }
                            }
                            float f15 = this.p;
                            jocVar = new joc(str, f4, (this.m.getInterpolation(fB4) * (this.h - f15)) + f15, this.s.d, fwVar.a(j).floatValue(), this.s.f + f, false);
                        } else {
                            joc jocVar3 = this.s;
                            jocVar = new joc(str, jocVar3.b + this.r, jocVar3.c, jocVar3.d * 1.02f, fwVar.a(j).floatValue(), this.s.f + this.r, true);
                        }
                        break;
                    case 1221446423:
                        str.equals("hit_target_center");
                        float fB5 = (j - kmjVar.b()) / 900.0f;
                        float f16 = this.s.b;
                        f = this.r;
                        f2 = f16 + f;
                        f3 = this.g;
                        if (f2 > f3) {
                            f4 = f3;
                            f = 0.0f;
                        } else {
                            f3 = this.f;
                            if (f2 < f3) {
                                f4 = f3;
                                f = 0.0f;
                            } else {
                                f4 = f2;
                            }
                        }
                        float f17 = this.p;
                        jocVar = new joc(str, f4, (this.m.getInterpolation(fB5) * (this.h - f17)) + f17, this.s.d, fwVar.a(j).floatValue(), this.s.f + f, false);
                        break;
                    case 1283225119:
                        str.equals("hit_frame_net");
                        float fB6 = (j - kmjVar.b()) / 900.0f;
                        float f18 = this.s.b;
                        f = this.r;
                        f2 = f18 + f;
                        f3 = this.g;
                        if (f2 > f3) {
                            f4 = f3;
                            f = 0.0f;
                        } else {
                            f3 = this.f;
                            if (f2 < f3) {
                                f4 = f3;
                                f = 0.0f;
                            } else {
                                f4 = f2;
                            }
                        }
                        float f19 = this.p;
                        jocVar = new joc(str, f4, (this.m.getInterpolation(fB6) * (this.h - f19)) + f19, this.s.d, fwVar.a(j).floatValue(), this.s.f + f, false);
                        break;
                    case 1345710065:
                        if (!str.equals("hit_goalkeeper")) {
                            float fB7 = (j - kmjVar.b()) / 900.0f;
                            float f110 = this.s.b;
                            f = this.r;
                            f2 = f110 + f;
                            f3 = this.g;
                            if (f2 > f3) {
                                f4 = f3;
                                f = 0.0f;
                            } else {
                                f3 = this.f;
                                if (f2 < f3) {
                                    f4 = f3;
                                    f = 0.0f;
                                } else {
                                    f4 = f2;
                                }
                            }
                            float f111 = this.p;
                            jocVar = new joc(str, f4, (this.m.getInterpolation(fB7) * (this.h - f111)) + f111, this.s.d, fwVar.a(j).floatValue(), this.s.f + f, false);
                        } else {
                            joc jocVar4 = this.s;
                            jocVar = new joc(str, jocVar4.b + this.r, jocVar4.c, jocVar4.d * 1.02f, fwVar.a(j).floatValue(), this.s.f + this.r, true);
                        }
                        break;
                    case 2121823767:
                        if (!str.equals("hit_defense_obj_lightning")) {
                            float fB8 = (j - kmjVar.b()) / 900.0f;
                            float f112 = this.s.b;
                            f = this.r;
                            f2 = f112 + f;
                            f3 = this.g;
                            if (f2 > f3) {
                                f4 = f3;
                                f = 0.0f;
                            } else {
                                f3 = this.f;
                                if (f2 < f3) {
                                    f4 = f3;
                                    f = 0.0f;
                                } else {
                                    f4 = f2;
                                }
                            }
                            float f113 = this.p;
                            jocVar = new joc(str, f4, (this.m.getInterpolation(fB8) * (this.h - f113)) + f113, this.s.d, fwVar.a(j).floatValue(), this.s.f + f, false);
                        } else {
                            joc jocVar5 = this.s;
                            jocVar = new joc(str, jocVar5.b, jocVar5.c, jocVar5.d, this.v.a(j).floatValue(), this.s.f, false);
                        }
                        break;
                    default:
                        float fB9 = (j - kmjVar.b()) / 900.0f;
                        float f114 = this.s.b;
                        f = this.r;
                        f2 = f114 + f;
                        f3 = this.g;
                        if (f2 > f3) {
                            f4 = f3;
                            f = 0.0f;
                        } else {
                            f3 = this.f;
                            if (f2 < f3) {
                                f4 = f3;
                                f = 0.0f;
                            } else {
                                f4 = f2;
                            }
                        }
                        float f115 = this.p;
                        jocVar = new joc(str, f4, (this.m.getInterpolation(fB9) * (this.h - f115)) + f115, this.s.d, fwVar.a(j).floatValue(), this.s.f + f, false);
                        break;
                }
                this.s = jocVar;
            }
            if (j > kmjVar.a()) {
                this.s = new joc("touchdown", this.o, this.p, this.q, 0.0f, 0.0f, false);
            }
        } else {
            this.s = c(j, "flying");
        }
        return this.s;
    }

    public final joc c(long j, String str) {
        float f = (j - this.i.b) / 300.0f;
        bwf bwfVar = this.d;
        float interpolation = (this.k.getInterpolation(f) * (this.o - bwfVar.a())) + bwfVar.a();
        float interpolation2 = (this.j.getInterpolation(f) * (this.p - bwfVar.b())) + bwfVar.b();
        float interpolation3 = (this.l.getInterpolation(f) * (this.q - bwfVar.i())) + bwfVar.i();
        joc jocVar = this.s;
        this.r = jocVar != null ? interpolation - jocVar.b : 0.0f;
        return new joc(str, interpolation, interpolation2, interpolation3, 1.0f, 0.0f, true);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataBallGenerator{initVelocity=");
        sb.append(this.b);
        sb.append(", initAngle=");
        sb.append(this.c);
        sb.append(", initBall=");
        sb.append(this.d);
        sb.append(", frame=");
        sb.append(this.e);
        sb.append(", dropMinX=");
        sb.append(this.f);
        sb.append(", dropMaxX=");
        sb.append(this.g);
        sb.append(", dropMaxY=");
        sb.append(this.h);
        sb.append(", gameParameters=");
        sb.append(this.i);
        sb.append(", flyingY=");
        sb.append(this.j);
        sb.append(", flyingX=");
        sb.append(this.k);
        sb.append(", flyingSize=");
        sb.append(this.l);
        sb.append(", dropY=");
        sb.append(this.m);
        sb.append(", toCX=");
        sb.append(this.o);
        sb.append(", toCY=");
        sb.append(this.p);
        sb.append(", toSize=");
        sb.append(this.q);
        sb.append(", lastFlyingDx=");
        sb.append(this.r);
        sb.append(", dataBall=");
        sb.append(this.s);
        sb.append(", collisionResult=");
        sb.append(this.t);
        sb.append(", fadeOutEffect=");
        sb.append(this.u);
        sb.append(", checkCollision=");
        return ruw.a(sb, this.z, '}');
    }
}
