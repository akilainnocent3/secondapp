package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class hbm extends whu {
    public final mbm c;
    public final sl5 d;

    public static class a {
        public mbm a;
        public z280 b;
        public Integer c;

        public final hbm a() throws GeneralSecurityException {
            z280 z280Var;
            sl5 sl5VarA;
            mbm mbmVar = this.a;
            if (mbmVar == null || (z280Var = this.b) == null) {
                opp.a("Cannot build without parameters and/or key material");
                return null;
            }
            if (mbmVar.b != z280Var.a.a.length) {
                opp.a("Key size mismatch");
                return null;
            }
            mbm.c cVar = mbmVar.d;
            mbm.c cVar2 = mbm.c.e;
            if (cVar != cVar2 && this.c == null) {
                opp.a("Cannot create key without ID requirement with parameters with ID requirement");
                return null;
            }
            if (cVar == cVar2 && this.c != null) {
                opp.a("Cannot create key with ID requirement with parameters without ID requirement");
                return null;
            }
            if (cVar == cVar2) {
                sl5VarA = sl5.a(new byte[0]);
            } else if (cVar == mbm.c.d || cVar == mbm.c.c) {
                sl5VarA = sl5.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.c.intValue()).array());
            } else {
                if (cVar != mbm.c.b) {
                    uj5.a(this.a.d, "Unknown HmacParameters.Variant: ");
                    return null;
                }
                sl5VarA = sl5.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.c.intValue()).array());
            }
            return new hbm(this.a, sl5VarA);
        }
    }

    public hbm(mbm mbmVar, sl5 sl5Var) {
        this.c = mbmVar;
        this.d = sl5Var;
    }

    @Override // defpackage.whu
    public final sl5 X() {
        return this.d;
    }

    @Override // defpackage.whu
    public final xhu Y() {
        return this.c;
    }
}
