package androidx.compose.animation;

import androidx.compose.ui.layout.y;
import defpackage.asr;
import defpackage.biv;
import defpackage.dtg0;
import defpackage.f0b;
import defpackage.fz60;
import defpackage.goh;
import defpackage.gsz;
import defpackage.ht;
import defpackage.ix90;
import defpackage.jj0;
import defpackage.jx90;
import defpackage.jxo;
import defpackage.p3w;
import defpackage.qlr;
import defpackage.rsr;
import defpackage.rtw;
import defpackage.twd0;
import defpackage.vhv;
import defpackage.yi0;
import defpackage.ytw;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AnimatedContentTransitionScopeImpl<S> implements d<S> {
    public final dtg0<S> a;
    public ht b;
    public final ytw c = androidx.compose.runtime.m.b(new jxo(0));
    public final rtw<S, twd0<jxo>> d = fz60.b();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierElement;", "S", "Lp3w;", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$b;", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SizeModifierElement<S> extends p3w<b<S>> {
        public final dtg0<S>.a<jxo, jj0> b;
        public final ytw c;
        public final AnimatedContentTransitionScopeImpl<S> d;

        public SizeModifierElement(dtg0.a aVar, ytw ytwVar, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
            this.b = aVar;
            this.c = ytwVar;
            this.d = animatedContentTransitionScopeImpl;
        }

        @Override // defpackage.p3w
        public final androidx.compose.ui.d.c a() {
            b bVar = new b();
            bVar.D = this.b;
            bVar.E = this.c;
            bVar.F = this.d;
            bVar.G = -9223372034707292160L;
            return bVar;
        }

        @Override // defpackage.p3w
        public final void d(androidx.compose.ui.d.c cVar) {
            b bVar = (b) cVar;
            bVar.D = this.b;
            bVar.E = this.c;
            bVar.F = this.d;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof SizeModifierElement)) {
                return false;
            }
            SizeModifierElement sizeModifierElement = (SizeModifierElement) obj;
            return Intrinsics.g(sizeModifierElement.b, this.b) && Intrinsics.g(sizeModifierElement.c, this.c);
        }

        public final int hashCode() {
            int iHashCode = this.d.hashCode() * 31;
            dtg0<S>.a<jxo, jj0> aVar = this.b;
            return this.c.hashCode() + ((iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31);
        }
    }

    public static final class b<S> extends rsr {
        public dtg0<S>.a<jxo, jj0> D;
        public ytw E;
        public AnimatedContentTransitionScopeImpl<S> F;
        public long G;

        public static final class a extends qlr implements Function1<y.a, Unit> {
            public final /* synthetic */ b<S> a;
            public final /* synthetic */ y b;
            public final /* synthetic */ long c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b<S> bVar, y yVar, long j) {
                super(1);
                this.a = bVar;
                this.b = yVar;
                this.c = j;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(y.a aVar) {
                ht htVar = this.a.F.b;
                y yVar = this.b;
                y.a.x(aVar, yVar, htVar.a((((long) yVar.b) & 4294967295L) | (((long) yVar.a) << 32), this.c, asr.a));
                return Unit.a;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.animation.AnimatedContentTransitionScopeImpl$b$b, reason: collision with other inner class name */
        public static final class C0034b extends qlr implements Function1<dtg0.b<S>, goh<jxo>> {
            public final /* synthetic */ b<S> a;
            public final /* synthetic */ long b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0034b(b<S> bVar, long j) {
                super(1);
                this.a = bVar;
                this.b = j;
            }

            @Override // kotlin.jvm.functions.Function1
            public final goh<jxo> invoke(Object obj) {
                long j;
                goh<jxo> gohVarB;
                dtg0.b bVar = (dtg0.b) obj;
                Object objC = bVar.c();
                b<S> bVar2 = this.a;
                if (Intrinsics.g(objC, bVar2.F.c())) {
                    j = jxo.b(bVar2.G, -9223372034707292160L) ? this.b : bVar2.G;
                } else {
                    twd0<jxo> twd0VarD = bVar2.F.d.d((S) bVar.c());
                    j = twd0VarD != null ? twd0VarD.getValue().a : 0L;
                }
                twd0<jxo> twd0VarD2 = bVar2.F.d.d((S) bVar.a());
                long j2 = twd0VarD2 != null ? twd0VarD2.getValue().a : 0L;
                ix90 ix90Var = (ix90) bVar2.E.getValue();
                return (ix90Var == null || (gohVarB = ix90Var.b(j, j2)) == null) ? yi0.d(0.0f, 400.0f, null, 5) : gohVarB;
            }
        }

        public static final class c extends qlr implements Function1<S, jxo> {
            public final /* synthetic */ b<S> a;
            public final /* synthetic */ long b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b<S> bVar, long j) {
                super(1);
                this.a = bVar;
                this.b = j;
            }

            @Override // kotlin.jvm.functions.Function1
            public final jxo invoke(Object obj) {
                long j;
                b<S> bVar = this.a;
                if (Intrinsics.g(obj, bVar.F.c())) {
                    j = jxo.b(bVar.G, -9223372034707292160L) ? this.b : bVar.G;
                } else {
                    twd0<jxo> twd0VarD = bVar.F.d.d(obj);
                    j = twd0VarD != null ? twd0VarD.getValue().a : 0L;
                }
                return new jxo(j);
            }
        }

        public b() {
            throw null;
        }

        @Override // defpackage.psr
        public final biv e(androidx.compose.ui.layout.t tVar, vhv vhvVar, long j) {
            long j2;
            y yVarD0 = vhvVar.d0(j);
            if (tVar.q0()) {
                j2 = (((long) yVarD0.a) << 32) | (((long) yVarD0.b) & 4294967295L);
            } else {
                dtg0<S>.a<jxo, jj0> aVar = this.D;
                int i = yVarD0.a;
                if (aVar == null) {
                    j2 = (((long) i) << 32) | (((long) yVarD0.b) & 4294967295L);
                    this.G = j2;
                } else {
                    long j3 = (((long) yVarD0.b) & 4294967295L) | (((long) i) << 32);
                    dtg0.a.C0505a c0505aA = aVar.a(new C0034b(this, j3), new c(this, j3));
                    this.F.getClass();
                    j2 = ((jxo) c0505aA.getValue()).a;
                    this.G = ((jxo) c0505aA.getValue()).a;
                }
            }
            return androidx.compose.ui.layout.t.z1(tVar, (int) (j2 >> 32), (int) (4294967295L & j2), new a(this, yVarD0, j2));
        }

        @Override // androidx.compose.ui.d.c
        public final void j2() {
            this.G = -9223372034707292160L;
        }
    }

    public AnimatedContentTransitionScopeImpl(dtg0 dtg0Var, ht htVar) {
        this.a = dtg0Var;
        this.b = htVar;
    }

    @Override // dtg0.b
    public final S a() {
        return this.a.f().a();
    }

    @Override // androidx.compose.animation.d
    public final f0b b(f0b f0bVar, jx90 jx90Var) {
        f0bVar.d = jx90Var;
        return f0bVar;
    }

    @Override // dtg0.b
    public final S c() {
        return this.a.f().c();
    }

    public static final class a implements gsz {
        public final ytw b;

        public a(boolean z) {
            this.b = androidx.compose.runtime.m.b(Boolean.valueOf(z));
        }

        @Override // defpackage.gsz
        public final Object v() {
            return this;
        }
    }
}
