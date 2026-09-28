package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u7l extends wil {
    public String A0;
    public int B0;
    public r7l n0;
    public int o0;
    public int p0;
    public int q0;
    public int r0;
    public int s0;
    public int t0;
    public int u0;
    public float v0;
    public float w0;
    public String x0;
    public String y0;
    public String z0;

    public u7l(rwd0 rwd0Var, rwd0.d dVar) {
        super(rwd0Var, dVar);
        this.o0 = 0;
        this.p0 = 0;
        this.q0 = 0;
        this.r0 = 0;
        if (dVar == rwd0.d.v) {
            this.t0 = 1;
        } else if (dVar == rwd0.d.w) {
            this.u0 = 1;
        }
    }

    @Override // defpackage.wil, defpackage.rwa, defpackage.eq40, defpackage.e6h
    public final void apply() {
        s();
        r7l r7lVar = this.n0;
        int i = this.s0;
        r7lVar.getClass();
        if ((i == 0 || i == 1) && r7lVar.V0 != i) {
            r7lVar.V0 = i;
        }
        int i2 = this.t0;
        if (i2 != 0) {
            r7l r7lVar2 = this.n0;
            if (i2 > 50) {
                r7lVar2.getClass();
            } else if (r7lVar2.M0 != i2) {
                r7lVar2.M0 = i2;
                r7lVar2.m0();
                r7lVar2.i0();
            }
        }
        int i3 = this.u0;
        if (i3 != 0) {
            r7l r7lVar3 = this.n0;
            if (i3 > 50) {
                r7lVar3.getClass();
            } else if (r7lVar3.O0 != i3) {
                r7lVar3.O0 = i3;
                r7lVar3.m0();
                r7lVar3.i0();
            }
        }
        float f = this.v0;
        if (f != 0.0f) {
            r7l r7lVar4 = this.n0;
            if (f < 0.0f) {
                r7lVar4.getClass();
            } else if (r7lVar4.P0 != f) {
                r7lVar4.P0 = f;
            }
        }
        float f2 = this.w0;
        if (f2 != 0.0f) {
            r7l r7lVar5 = this.n0;
            if (f2 < 0.0f) {
                r7lVar5.getClass();
            } else if (r7lVar5.Q0 != f2) {
                r7lVar5.Q0 = f2;
            }
        }
        String str = this.x0;
        if (str != null && !str.isEmpty()) {
            r7l r7lVar6 = this.n0;
            String str2 = this.x0;
            String str3 = r7lVar6.R0;
            if (str3 == null || !str3.equals(str2)) {
                r7lVar6.R0 = str2;
            }
        }
        String str4 = this.y0;
        if (str4 != null && !str4.isEmpty()) {
            r7l r7lVar7 = this.n0;
            String str5 = this.y0;
            String str6 = r7lVar7.S0;
            if (str6 == null || !str6.equals(str5)) {
                r7lVar7.S0 = str5;
            }
        }
        String str7 = this.z0;
        if (str7 != null && !str7.isEmpty()) {
            r7l r7lVar8 = this.n0;
            String str8 = this.z0;
            String str9 = r7lVar8.T0;
            if (str9 == null || !str9.equals(str8.toString())) {
                r7lVar8.K0 = false;
                r7lVar8.T0 = str8.toString();
            }
        }
        String str10 = this.A0;
        if (str10 != null && !str10.isEmpty()) {
            r7l r7lVar9 = this.n0;
            String str11 = this.A0;
            String str12 = r7lVar9.U0;
            if (str12 == null || !str12.equals(str11)) {
                r7lVar9.K0 = false;
                r7lVar9.U0 = str11;
            }
        }
        r7l r7lVar10 = this.n0;
        r7lVar10.a1 = this.B0;
        int i4 = this.o0;
        r7lVar10.z0 = i4;
        r7lVar10.B0 = i4;
        r7lVar10.C0 = i4;
        r7lVar10.A0 = this.p0;
        r7lVar10.x0 = this.q0;
        r7lVar10.y0 = this.r0;
        r();
    }

    @Override // defpackage.wil
    public final yil s() {
        r7l r7lVar = this.n0;
        if (r7lVar != null) {
            return r7lVar;
        }
        r7l r7lVar2 = new r7l();
        this.n0 = r7lVar2;
        return r7lVar2;
    }
}
