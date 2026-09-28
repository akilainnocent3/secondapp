package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class f8k0 extends xm {
    public static f8k0 X(j8k0.a aVar, z280 z280Var, Integer num) throws GeneralSecurityException {
        sl5 sl5Var = z280Var.a;
        j8k0.a aVar2 = j8k0.a.d;
        if (aVar != aVar2 && num == null) {
            v050.a(aVar, "For given Variant ", " the value of idRequirement must be non-null");
            return null;
        }
        if (aVar == aVar2 && num != null) {
            opp.a("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (sl5Var.a.length != 32) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + sl5Var.a.length);
        }
        if (aVar == aVar2) {
            sl5.a(new byte[0]);
        } else if (aVar == j8k0.a.c) {
            sl5.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (aVar != j8k0.a.b) {
                rcp.a(aVar, "Unknown Variant: ");
                return null;
            }
            sl5.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new f8k0(8);
    }
}
