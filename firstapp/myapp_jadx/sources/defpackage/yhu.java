package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class yhu implements iw20<uhu, uhu> {
    public static final Logger a = Logger.getLogger(yhu.class.getName());
    public static final byte[] b = {0};
    public static final yhu c = new yhu();

    public static class a implements uhu {
        public final hw20<uhu> a;
        public final f4w.a b;
        public final f4w.a c;

        public a(hw20<uhu> hw20Var) {
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

        @Override // defpackage.uhu
        public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            int length = bArr.length;
            f4w.a aVar = this.c;
            if (length <= 5) {
                aVar.getClass();
                opp.a("tag too short");
                return;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            hw20<uhu> hw20Var = this.a;
            for (hw20.b<uhu> bVar : hw20Var.a(bArrCopyOf)) {
                try {
                    bVar.b.a(bArrCopyOfRange, bVar.e.equals(uaz.LEGACY) ? tl5.a(bArr2, yhu.b) : bArr2);
                    aVar.getClass();
                    return;
                } catch (GeneralSecurityException e) {
                    yhu.a.info("tag prefix matches a key, but cannot verify: " + e);
                }
            }
            Iterator<hw20.b<uhu>> it = hw20Var.a(u3c.a).iterator();
            while (it.hasNext()) {
                try {
                    it.next().b.a(bArr, bArr2);
                    aVar.getClass();
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            aVar.getClass();
            opp.a("invalid MAC");
        }

        @Override // defpackage.uhu
        public final byte[] b(byte[] bArr) throws GeneralSecurityException {
            f4w.a aVar = this.b;
            hw20.b<uhu> bVar = this.a.b;
            if (bVar.e.equals(uaz.LEGACY)) {
                bArr = tl5.a(bArr, yhu.b);
            }
            try {
                byte[] bArr2 = bVar.c;
                byte[] bArrA = tl5.a(Arrays.copyOf(bArr2, bArr2.length), bVar.b.b(bArr));
                int i = bVar.f;
                aVar.getClass();
                return bArrA;
            } catch (GeneralSecurityException e) {
                aVar.getClass();
                throw e;
            }
        }
    }

    @Override // defpackage.iw20
    public final Class<uhu> a() {
        return uhu.class;
    }

    @Override // defpackage.iw20
    public final Class<uhu> b() {
        return uhu.class;
    }

    @Override // defpackage.iw20
    public final uhu c(hw20<uhu> hw20Var) throws GeneralSecurityException {
        Iterator<List<hw20.b<uhu>>> it = hw20Var.a.values().iterator();
        while (it.hasNext()) {
            for (hw20.b<uhu> bVar : it.next()) {
                b3 b3Var = bVar.h;
                if (b3Var instanceof whu) {
                    whu whuVar = (whu) b3Var;
                    byte[] bArr = bVar.c;
                    sl5 sl5VarA = sl5.a(Arrays.copyOf(bArr, bArr.length));
                    if (!sl5VarA.equals(whuVar.X())) {
                        StringBuilder sb = new StringBuilder("Mac Key with parameters ");
                        sb.append(whuVar.Y());
                        sl5 sl5VarX = whuVar.X();
                        sb.append(" has wrong output prefix (");
                        sb.append(sl5VarX);
                        sb.append(") instead of (");
                        sb.append(sl5VarA);
                        sb.append(")");
                        throw new GeneralSecurityException(sb.toString());
                    }
                }
            }
        }
        return new a(hw20Var);
    }
}
