package defpackage;

import androidx.swiperefreshlayout.widget.dP.LxHElgWAiSeM;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class bn extends whu {
    public final hn c;
    public final sl5 d;

    public static class a {
        public hn a;
        public z280 b;
        public Integer c;

        public final bn a() throws GeneralSecurityException {
            z280 z280Var;
            sl5 sl5VarA;
            hn hnVar = this.a;
            if (hnVar == null || (z280Var = this.b) == null) {
                opp.a("Cannot build without parameters and/or key material");
                return null;
            }
            if (hnVar.b != z280Var.a.a.length) {
                opp.a(LxHElgWAiSeM.eiKP);
                return null;
            }
            hn.b bVar = hnVar.d;
            hn.b bVar2 = hn.b.e;
            if (bVar != bVar2 && this.c == null) {
                opp.a("Cannot create key without ID requirement with parameters with ID requirement");
                return null;
            }
            if (bVar == bVar2 && this.c != null) {
                opp.a("Cannot create key with ID requirement with parameters without ID requirement");
                return null;
            }
            if (bVar == bVar2) {
                sl5VarA = sl5.a(new byte[0]);
            } else if (bVar == hn.b.d || bVar == hn.b.c) {
                sl5VarA = sl5.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.c.intValue()).array());
            } else {
                if (bVar != hn.b.b) {
                    uj5.a(this.a.d, "Unknown AesCmacParametersParameters.Variant: ");
                    return null;
                }
                sl5VarA = sl5.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.c.intValue()).array());
            }
            return new bn(this.a, sl5VarA);
        }
    }

    public bn(hn hnVar, sl5 sl5Var) {
        this.c = hnVar;
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
