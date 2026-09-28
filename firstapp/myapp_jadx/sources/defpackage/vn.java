package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class vn extends xm {

    public static class a {
        public ao a;
        public z280 b;
        public Integer c;

        public final vn a() throws GeneralSecurityException {
            z280 z280Var;
            ao aoVar = this.a;
            if (aoVar == null || (z280Var = this.b) == null) {
                opp.a("Cannot build without parameters and/or key material");
                return null;
            }
            if (aoVar.b != z280Var.a.a.length) {
                opp.a("Key size mismatch");
                return null;
            }
            ao.a aVar = aoVar.e;
            ao.a aVar2 = ao.a.d;
            if (aVar != aVar2 && this.c == null) {
                opp.a("Cannot create key without ID requirement with parameters with ID requirement");
                return null;
            }
            if (aVar == aVar2 && this.c != null) {
                opp.a("Cannot create key with ID requirement with parameters without ID requirement");
                return null;
            }
            if (aVar == aVar2) {
                sl5.a(new byte[0]);
            } else if (aVar == ao.a.c) {
                sl5.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.c.intValue()).array());
            } else {
                if (aVar != ao.a.b) {
                    uj5.a(this.a.e, "Unknown AesEaxParameters.Variant: ");
                    return null;
                }
                sl5.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.c.intValue()).array());
            }
            return new vn(8);
        }
    }
}
