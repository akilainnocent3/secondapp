package defpackage;

import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class dl0 implements yxd0<ruh0<?>> {
    public static final dl0 a = new dl0();

    public static int c(ruh0 ruh0Var, ptu ptuVar) {
        switch (ruh0Var.getType().ordinal()) {
            case 0:
                return cyd0.e(cl0.a, (String) ruh0Var.getValue(), ptuVar);
            case 1:
                Boolean bool = (Boolean) ruh0Var.getValue();
                int i = cl0.b.c;
                bool.getClass();
                int i2 = s08.a;
                return i + 1;
            case 2:
                Long l = (Long) ruh0Var.getValue();
                return s08.b(l.longValue()) + cl0.c.c;
            case 3:
                Double d = (Double) ruh0Var.getValue();
                int i3 = cl0.d.c;
                d.getClass();
                int i4 = s08.a;
                return i3 + 8;
            case 4:
                ek1 ek1Var = cl0.e;
                List list = (List) ruh0Var.getValue();
                int iB = ptuVar.b();
                int iC = cyd0.c(ux0.a, list, a, ptuVar);
                int iA = s08.a(iC) + ek1Var.c + iC;
                ptuVar.b[iB] = iC;
                return iA;
            case 5:
                ek1 ek1Var2 = cl0.f;
                List list2 = (List) ruh0Var.getValue();
                int iB2 = ptuVar.b();
                int iC2 = cyd0.c(lnp.a, list2, pnp.a, ptuVar);
                int iA2 = s08.a(iC2) + ek1Var2.c + iC2;
                ptuVar.b[iB2] = iC2;
                return iA2;
            case 6:
                ByteBuffer byteBuffer = (ByteBuffer) ruh0Var.getValue();
                int iRemaining = byteBuffer.remaining();
                byte[] bArr = new byte[iRemaining];
                byteBuffer.get(bArr);
                ptuVar.a(bArr);
                return s08.a(iRemaining) + iRemaining + cl0.g.c;
            default:
                hb5.a("Unsupported value type.");
                return 0;
        }
    }

    public static void d(me80 me80Var, ruh0 ruh0Var, ptu ptuVar) {
        switch (ruh0Var.getType().ordinal()) {
            case 0:
                me80Var.P(cl0.a, (String) ruh0Var.getValue(), ptuVar);
                break;
            case 1:
                me80Var.Y(cl0.b, ((Boolean) ruh0Var.getValue()).booleanValue());
                break;
            case 2:
                me80Var.h0(cl0.c, ((Long) ruh0Var.getValue()).longValue());
                break;
            case 3:
                me80Var.a0(cl0.d, ((Double) ruh0Var.getValue()).doubleValue());
                break;
            case 4:
                ek1 ek1Var = cl0.e;
                List list = (List) ruh0Var.getValue();
                me80Var.getClass();
                me80Var.z0(ek1Var, ptuVar.e());
                me80Var.G(ux0.a, list, a, ptuVar);
                me80Var.b0();
                break;
            case 5:
                ek1 ek1Var2 = cl0.f;
                List list2 = (List) ruh0Var.getValue();
                me80Var.getClass();
                me80Var.z0(ek1Var2, ptuVar.e());
                me80Var.G(lnp.a, list2, pnp.a, ptuVar);
                me80Var.b0();
                break;
            case 6:
                me80Var.Z(cl0.g, (byte[]) ptuVar.c(byte[].class));
                break;
            default:
                hb5.a("Unsupported value type.");
                break;
        }
    }

    @Override // defpackage.yxd0
    public final /* bridge */ /* synthetic */ int a(ruh0<?> ruh0Var, ptu ptuVar) {
        return c(ruh0Var, ptuVar);
    }

    @Override // defpackage.yxd0
    public final /* bridge */ /* synthetic */ void b(me80 me80Var, ruh0<?> ruh0Var, ptu ptuVar) {
        d(me80Var, ruh0Var, ptuVar);
    }
}
