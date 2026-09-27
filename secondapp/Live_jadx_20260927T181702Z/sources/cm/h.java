package cm;

import dr.q;
import dw.e0;
import dw.g2;
import dw.k1;
import dw.l2;
import dw.p0;
import dw.w2;
import dw.y0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import zv.b0;
import zv.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@b0
public final class h {

    @oy.l
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.m
    public final Boolean f24886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.m
    public final Double f24887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.m
    public final Integer f24888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.m
    public final Integer f24889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.m
    public final Long f24890e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @dr.o(level = q.HIDDEN, message = "This synthesized declaration should not be used directly")
    public /* synthetic */ class a implements p0<h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public static final a f24891a;

        @oy.l
        private static final bw.f descriptor;

        static {
            a aVar = new a();
            f24891a = aVar;
            l2 l2Var = new l2("com.google.firebase.sessions.settings.SessionConfigs", aVar, 5);
            l2Var.o("sessionsEnabled", false);
            l2Var.o("sessionSamplingRate", false);
            l2Var.o("sessionTimeoutSeconds", false);
            l2Var.o("cacheDurationSeconds", false);
            l2Var.o("cacheUpdatedTimeSeconds", false);
            descriptor = l2Var;
        }

        @Override // zv.e
        @oy.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h deserialize(@oy.l cw.f decoder) {
            int i10;
            Boolean bool;
            Double d10;
            Integer num;
            Integer num2;
            Long l10;
            m0.p(decoder, "decoder");
            bw.f fVar = descriptor;
            cw.d dVarB = decoder.b(fVar);
            Boolean bool2 = null;
            if (dVarB.h()) {
                Boolean bool3 = (Boolean) dVarB.u(fVar, 0, dw.i.f79576a, null);
                Double d11 = (Double) dVarB.u(fVar, 1, e0.f79544a, null);
                y0 y0Var = y0.f79707a;
                Integer num3 = (Integer) dVarB.u(fVar, 2, y0Var, null);
                bool = bool3;
                num2 = (Integer) dVarB.u(fVar, 3, y0Var, null);
                l10 = (Long) dVarB.u(fVar, 4, k1.f79598a, null);
                num = num3;
                d10 = d11;
                i10 = 31;
            } else {
                boolean z10 = true;
                int i11 = 0;
                Double d12 = null;
                Integer num4 = null;
                Integer num5 = null;
                Long l11 = null;
                while (z10) {
                    int iZ = dVarB.z(fVar);
                    if (iZ == -1) {
                        z10 = false;
                    } else if (iZ == 0) {
                        bool2 = (Boolean) dVarB.u(fVar, 0, dw.i.f79576a, bool2);
                        i11 |= 1;
                    } else if (iZ == 1) {
                        d12 = (Double) dVarB.u(fVar, 1, e0.f79544a, d12);
                        i11 |= 2;
                    } else if (iZ == 2) {
                        num4 = (Integer) dVarB.u(fVar, 2, y0.f79707a, num4);
                        i11 |= 4;
                    } else if (iZ == 3) {
                        num5 = (Integer) dVarB.u(fVar, 3, y0.f79707a, num5);
                        i11 |= 8;
                    } else {
                        if (iZ != 4) {
                            throw new t0(iZ);
                        }
                        l11 = (Long) dVarB.u(fVar, 4, k1.f79598a, l11);
                        i11 |= 16;
                    }
                }
                i10 = i11;
                bool = bool2;
                d10 = d12;
                num = num4;
                num2 = num5;
                l10 = l11;
            }
            dVarB.c(fVar);
            return new h(i10, bool, d10, num, num2, l10, null);
        }

        @Override // zv.d0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(@oy.l cw.h encoder, @oy.l h value) {
            m0.p(encoder, "encoder");
            m0.p(value, "value");
            bw.f fVar = descriptor;
            cw.e eVarB = encoder.b(fVar);
            h.m(value, eVarB, fVar);
            eVarB.c(fVar);
        }

        @Override // dw.p0
        @oy.l
        public final zv.j<?>[] childSerializers() {
            zv.j<?> jVarV = aw.a.v(dw.i.f79576a);
            zv.j<?> jVarV2 = aw.a.v(e0.f79544a);
            y0 y0Var = y0.f79707a;
            return new zv.j[]{jVarV, jVarV2, aw.a.v(y0Var), aw.a.v(y0Var), aw.a.v(k1.f79598a)};
        }

        @Override // zv.j, zv.d0, zv.e
        @oy.l
        public final bw.f getDescriptor() {
            return descriptor;
        }

        @Override // dw.p0
        @oy.l
        public zv.j<?>[] typeParametersSerializers() {
            return p0.a.a(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {
        public b() {
        }

        @oy.l
        public final zv.j<h> serializer() {
            return a.f24891a;
        }

        public /* synthetic */ b(x xVar) {
            this();
        }
    }

    public /* synthetic */ h(int i10, Boolean bool, Double d10, Integer num, Integer num2, Long l10, w2 w2Var) {
        if (31 != (i10 & 31)) {
            g2.b(i10, 31, a.f24891a.getDescriptor());
        }
        this.f24886a = bool;
        this.f24887b = d10;
        this.f24888c = num;
        this.f24889d = num2;
        this.f24890e = l10;
    }

    public static /* synthetic */ h g(h hVar, Boolean bool, Double d10, Integer num, Integer num2, Long l10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = hVar.f24886a;
        }
        if ((i10 & 2) != 0) {
            d10 = hVar.f24887b;
        }
        if ((i10 & 4) != 0) {
            num = hVar.f24888c;
        }
        if ((i10 & 8) != 0) {
            num2 = hVar.f24889d;
        }
        if ((i10 & 16) != 0) {
            l10 = hVar.f24890e;
        }
        Long l11 = l10;
        Integer num3 = num;
        return hVar.f(bool, d10, num3, num2, l11);
    }

    @cs.o
    public static final /* synthetic */ void m(h hVar, cw.e eVar, bw.f fVar) {
        eVar.i(fVar, 0, dw.i.f79576a, hVar.f24886a);
        eVar.i(fVar, 1, e0.f79544a, hVar.f24887b);
        y0 y0Var = y0.f79707a;
        eVar.i(fVar, 2, y0Var, hVar.f24888c);
        eVar.i(fVar, 3, y0Var, hVar.f24889d);
        eVar.i(fVar, 4, k1.f79598a, hVar.f24890e);
    }

    @oy.m
    public final Boolean a() {
        return this.f24886a;
    }

    @oy.m
    public final Double b() {
        return this.f24887b;
    }

    @oy.m
    public final Integer c() {
        return this.f24888c;
    }

    @oy.m
    public final Integer d() {
        return this.f24889d;
    }

    @oy.m
    public final Long e() {
        return this.f24890e;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return m0.g(this.f24886a, hVar.f24886a) && m0.g(this.f24887b, hVar.f24887b) && m0.g(this.f24888c, hVar.f24888c) && m0.g(this.f24889d, hVar.f24889d) && m0.g(this.f24890e, hVar.f24890e);
    }

    @oy.l
    public final h f(@oy.m Boolean bool, @oy.m Double d10, @oy.m Integer num, @oy.m Integer num2, @oy.m Long l10) {
        return new h(bool, d10, num, num2, l10);
    }

    @oy.m
    public final Integer h() {
        return this.f24889d;
    }

    public int hashCode() {
        Boolean bool = this.f24886a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d10 = this.f24887b;
        int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Integer num = this.f24888c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f24889d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l10 = this.f24890e;
        return iHashCode4 + (l10 != null ? l10.hashCode() : 0);
    }

    @oy.m
    public final Long i() {
        return this.f24890e;
    }

    @oy.m
    public final Double j() {
        return this.f24887b;
    }

    @oy.m
    public final Integer k() {
        return this.f24888c;
    }

    @oy.m
    public final Boolean l() {
        return this.f24886a;
    }

    @oy.l
    public String toString() {
        return "SessionConfigs(sessionsEnabled=" + this.f24886a + ", sessionSamplingRate=" + this.f24887b + ", sessionTimeoutSeconds=" + this.f24888c + ", cacheDurationSeconds=" + this.f24889d + ", cacheUpdatedTimeSeconds=" + this.f24890e + ')';
    }

    public h(@oy.m Boolean bool, @oy.m Double d10, @oy.m Integer num, @oy.m Integer num2, @oy.m Long l10) {
        this.f24886a = bool;
        this.f24887b = d10;
        this.f24888c = num;
        this.f24889d = num2;
        this.f24890e = l10;
    }
}
