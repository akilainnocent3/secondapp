package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class zm implements iw20<vm, vm> {
    public static final Logger a = Logger.getLogger(zm.class.getName());
    public static final zm b = new zm();

    public static class a implements vm {
        public final hw20<vm> a;
        public final f4w.a b;
        public final f4w.a c;

        public a(hw20<vm> hw20Var) {
            this.a = hw20Var;
            boolean zIsEmpty = hw20Var.c.a.isEmpty();
            h4w.a aVar = h4w.a;
            if (zIsEmpty) {
                this.b = aVar;
                this.c = aVar;
                return;
            }
            f4w f4wVar = btw.b.a.get();
            f4wVar = f4wVar == null ? btw.c : f4wVar;
            h4w.a(hw20Var);
            f4wVar.getClass();
            this.b = aVar;
            this.c = aVar;
        }

        @Override // defpackage.vm
        public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            f4w.a aVar = this.b;
            hw20.b<vm> bVar = this.a.b;
            try {
                byte[] bArr3 = bVar.c;
                byte[] bArrA = tl5.a(Arrays.copyOf(bArr3, bArr3.length), bVar.b.a(bArr, bArr2));
                int i = bVar.f;
                int length = bArr.length;
                aVar.getClass();
                return bArrA;
            } catch (GeneralSecurityException e) {
                aVar.getClass();
                throw e;
            }
        }

        @Override // defpackage.vm
        public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            int length = bArr.length;
            hw20<vm> hw20Var = this.a;
            f4w.a aVar = this.c;
            if (length > 5) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                Iterator<hw20.b<vm>> it = hw20Var.a(bArrCopyOf).iterator();
                while (it.hasNext()) {
                    try {
                        byte[] bArrB = it.next().b.b(bArrCopyOfRange, bArr2);
                        aVar.getClass();
                        return bArrB;
                    } catch (GeneralSecurityException e) {
                        zm.a.info("ciphertext prefix matches a key, but cannot decrypt: " + e);
                    }
                }
            }
            Iterator<hw20.b<vm>> it2 = hw20Var.a(u3c.a).iterator();
            while (it2.hasNext()) {
                try {
                    byte[] bArrB2 = it2.next().b.b(bArr, bArr2);
                    aVar.getClass();
                    return bArrB2;
                } catch (GeneralSecurityException unused) {
                }
            }
            aVar.getClass();
            opp.a("decryption failed");
            return null;
        }
    }

    @Override // defpackage.iw20
    public final Class<vm> a() {
        return vm.class;
    }

    @Override // defpackage.iw20
    public final Class<vm> b() {
        return vm.class;
    }

    @Override // defpackage.iw20
    public final vm c(hw20<vm> hw20Var) {
        return new a(hw20Var);
    }
}
