package defpackage;

import com.sportygames.newcms.CMSRes;

/* JADX INFO: loaded from: classes7.dex */
public interface na50 extends ryo {

    public static final class a implements na50 {
        public final int a;
        public final n1a0 b;
        public final uf00 c;
        public final n1a0 d;
        public final yog.a e;

        public a(int i) {
            this.a = i;
            n1a0 n1a0Var = n1a0.c;
            this.b = n1a0Var;
            this.c = a4h.a(new ure0(new e87.a(i), false), new ure0(new e87.c(i), true));
            this.d = n1a0Var;
            this.e = new yog.a(a4h.a(new pve0(new e87.a(i))));
        }

        @Override // defpackage.na50
        public final hre0 a() {
            return null;
        }

        @Override // defpackage.na50
        public final qcn<ure0<e87>> b() {
            return this.c;
        }

        @Override // defpackage.na50
        public final qcn<ure0<uoe0>> c() {
            return this.d;
        }

        @Override // defpackage.na50
        public final qcn<ure0<mu6>> d() {
            return this.b;
        }

        @Override // defpackage.na50
        public final CMSRes e() {
            return null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        @Override // defpackage.na50
        public final yog f() {
            return this.e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return rr1.b(new StringBuilder("CancelDigging(caveIndex="), this.a, ')');
        }
    }

    public static final class b implements na50 {
        public final int a;
        public final boolean b;
        public final boolean c;
        public final n1a0 d;
        public final uf00 e;
        public final uf00 f;
        public final yog.a g;

        public b(int i, boolean z, boolean z2) {
            this.a = i;
            this.b = z;
            this.c = z2;
            gre0 fVar = z2 ? new e87.f(i) : new e87.b(i);
            this.d = n1a0.c;
            this.e = a4h.a(new ure0(new e87.d(i), false), new ure0(fVar, true));
            this.f = z ? a4h.a(new ure0(uoe0.c.a, false), new ure0(uoe0.b.a, false)) : a4h.a(new ure0(uoe0.b.a, false));
            this.g = new yog.a(a4h.a(new pve0(new e87.d(i))));
        }

        @Override // defpackage.na50
        public final hre0 a() {
            return null;
        }

        @Override // defpackage.na50
        public final qcn<ure0<e87>> b() {
            return this.e;
        }

        @Override // defpackage.na50
        public final qcn<ure0<uoe0>> c() {
            return this.f;
        }

        @Override // defpackage.na50
        public final qcn<ure0<mu6>> d() {
            return this.d;
        }

        @Override // defpackage.na50
        public final CMSRes e() {
            return null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c;
        }

        @Override // defpackage.na50
        public final yog f() {
            return this.g;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + mtg0.a(Integer.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Digging(caveIndex=");
            sb.append(this.a);
            sb.append(", hasSymbol=");
            sb.append(this.b);
            sb.append(", isTurboMode=");
            return ruw.a(sb, this.c, ')');
        }
    }

    public static final class c implements na50 {
        public final uf00 a = a4h.a(new ure0(new mu6.a(0), true));
        public final uf00 b = a4h.a(new ure0(new e87.c(0), true));
        public final uf00 c = a4h.a(new ure0(uoe0.b.a, false, g0f0.a.a));
        public final yog.b d = yog.b.a;

        @Override // defpackage.na50
        public final hre0 a() {
            return null;
        }

        @Override // defpackage.na50
        public final qcn<ure0<e87>> b() {
            return this.b;
        }

        @Override // defpackage.na50
        public final qcn<ure0<uoe0>> c() {
            return this.c;
        }

        @Override // defpackage.na50
        public final qcn<ure0<mu6>> d() {
            return this.a;
        }

        @Override // defpackage.na50
        public final CMSRes e() {
            return null;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        @Override // defpackage.na50
        public final yog f() {
            return this.d;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        public final String toString() {
            return "Idle(caveIndex=0)";
        }
    }

    public static final class d implements na50 {
        public static final d a = new d();
        public static final n1a0 b;
        public static final n1a0 c;
        public static final uf00 d;
        public static final yog.a e;

        static {
            n1a0 n1a0Var = n1a0.c;
            b = n1a0Var;
            c = n1a0Var;
            uoe0.c cVar = uoe0.c.a;
            d = a4h.a(new ure0(cVar, false), new ure0(uoe0.b.a, false));
            e = new yog.a(a4h.a(new pve0(cVar)));
        }

        @Override // defpackage.na50
        public final hre0 a() {
            return null;
        }

        @Override // defpackage.na50
        public final qcn<ure0<e87>> b() {
            return c;
        }

        @Override // defpackage.na50
        public final qcn<ure0<uoe0>> c() {
            return d;
        }

        @Override // defpackage.na50
        public final qcn<ure0<mu6>> d() {
            return b;
        }

        @Override // defpackage.na50
        public final CMSRes e() {
            return null;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        @Override // defpackage.na50
        public final yog f() {
            return e;
        }

        public final int hashCode() {
            return 1524691983;
        }

        public final String toString() {
            return "RemoveSymbol";
        }
    }

    public static final class e implements na50 {
        public final int a;
        public final int b;
        public final uf00 c;
        public final uf00 d;
        public final n1a0 e;
        public final yog.a f;

        public e(int i, int i2) {
            this.a = i;
            this.b = i2;
            this.c = a4h.a(new ure0(new mu6.b(i), false), new ure0(new mu6.a(i2), true));
            e87.e eVar = e87.e.a;
            this.d = a4h.a(new ure0(eVar, false), new ure0(new e87.c(i2), true));
            this.e = n1a0.c;
            this.f = new yog.a(a4h.a(new pve0(eVar), new pve0(new mu6.a(i))));
        }

        @Override // defpackage.na50
        public final hre0 a() {
            return null;
        }

        @Override // defpackage.na50
        public final qcn<ure0<e87>> b() {
            return this.d;
        }

        @Override // defpackage.na50
        public final qcn<ure0<uoe0>> c() {
            return this.e;
        }

        @Override // defpackage.na50
        public final qcn<ure0<mu6>> d() {
            return this.c;
        }

        @Override // defpackage.na50
        public final CMSRes e() {
            return null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && this.b == eVar.b;
        }

        @Override // defpackage.na50
        public final yog f() {
            return this.f;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SwitchCave(fromCaveIndex=");
            sb.append(this.a);
            sb.append(", toCaveIndex=");
            return rr1.b(sb, this.b, ')');
        }
    }

    public static final class f implements na50 {
        public final int a;
        public final int b;
        public final n1a0 c = n1a0.c;
        public final uf00 d;
        public final uf00 e;
        public final yog.a f;
        public final hre0.b g;
        public final CMSRes h;

        public f(int i, int i2) {
            this.a = i;
            this.b = i2;
            this.d = i2 == 4 ? a4h.a(new ure0(new e87.g(i), false), new ure0(new e87.a(i), false), new ure0(new e87.c(i), true)) : a4h.a(new ure0(new e87.a(i), false), new ure0(new e87.c(i), true));
            this.e = a4h.a(new ure0(new uoe0.d(i2), false, new g0f0.b(i, i2)), new ure0(new uoe0.a(i2), true, new g0f0.b(i, i2)));
            this.f = new yog.a(a4h.a(new pve0(new uoe0.d(i2)), new pve0(new e87.a(i))));
            this.g = hre0.b.a;
            this.h = i2 != 0 ? (i2 == 1 || i2 == 2 || i2 == 3) ? vue0.X0.V0 : i2 != 4 ? null : vue0.X0.W0 : vue0.X0.U0;
        }

        @Override // defpackage.na50
        public final hre0 a() {
            return this.g;
        }

        @Override // defpackage.na50
        public final qcn<ure0<e87>> b() {
            return this.d;
        }

        @Override // defpackage.na50
        public final qcn<ure0<uoe0>> c() {
            return this.e;
        }

        @Override // defpackage.na50
        public final qcn<ure0<mu6>> d() {
            return this.c;
        }

        @Override // defpackage.na50
        public final CMSRes e() {
            return this.h;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a == fVar.a && this.b == fVar.b;
        }

        @Override // defpackage.na50
        public final yog f() {
            return this.f;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Winning(caveIndex=");
            sb.append(this.a);
            sb.append(", symbolIndex=");
            return rr1.b(sb, this.b, ')');
        }
    }

    hre0 a();

    qcn<ure0<e87>> b();

    qcn<ure0<uoe0>> c();

    qcn<ure0<mu6>> d();

    CMSRes e();

    yog f();
}
