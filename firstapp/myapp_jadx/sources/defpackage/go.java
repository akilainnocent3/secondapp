package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class go extends xm {

    public static class a {
        public lo a;
        public z280 b;
        public Integer c;

        public final go a() throws GeneralSecurityException {
            z280 z280Var;
            lo loVar = this.a;
            if (loVar == null || (z280Var = this.b) == null) {
                opp.a("Cannot build without parameters and/or key material");
                return null;
            }
            if (loVar.b != z280Var.a.a.length) {
                opp.a("Key size mismatch");
                return null;
            }
            lo.a aVar = loVar.e;
            lo.a aVar2 = lo.a.d;
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
            } else if (aVar == lo.a.c) {
                sl5.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.c.intValue()).array());
            } else {
                if (aVar != lo.a.b) {
                    uj5.a(this.a.e, "Unknown AesGcmParameters.Variant: ");
                    return null;
                }
                sl5.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.c.intValue()).array());
            }
            return new go(8);
        }
    }
}
