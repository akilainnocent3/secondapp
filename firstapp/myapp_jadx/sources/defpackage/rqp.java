package defpackage;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class rqp implements vm {
    public static final byte[] c = new byte[0];
    public final bnp a;
    public final vm b;

    public rqp(bnp bnpVar, vm vmVar) {
        this.a = bnpVar;
        this.b = vmVar;
    }

    @Override // defpackage.vm
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        wnv wnvVarA;
        bnp bnpVar = this.a;
        AtomicReference<mmp> atomicReference = y050.a;
        synchronized (y050.class) {
            try {
                kmp kmpVarD = y050.a.get().a(bnpVar.y()).d();
                if (!((Boolean) y050.c.get(bnpVar.y())).booleanValue()) {
                    throw new GeneralSecurityException("newKey-operation not permitted for key type " + bnpVar.y());
                }
                ql5 ql5VarZ = bnpVar.z();
                try {
                    gnp.a aVarC = kmpVarD.a.c();
                    wnv wnvVarC = aVarC.c(ql5VarZ);
                    aVarC.d(wnvVarC);
                    wnvVarA = aVarC.a(wnvVarC);
                } catch (f0p e) {
                    throw new GeneralSecurityException("Failures parsing proto of type ".concat(kmpVarD.a.c().a.getName()), e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        byte[] byteArray = ((d4) wnvVarA).toByteArray();
        byte[] bArrA = this.b.a(byteArray, c);
        byte[] bArrA2 = ((vm) y050.d(this.a.y(), byteArray)).a(bArr, bArr2);
        return ByteBuffer.allocate(bArrA.length + 4 + bArrA2.length).putInt(bArrA.length).put(bArrA).put(bArrA2).array();
    }

    @Override // defpackage.vm
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i = byteBufferWrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            byteBufferWrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            return ((vm) y050.d(this.a.y(), this.b.b(bArr3, c))).b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e) {
            e = e;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e2) {
            e = e2;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e3) {
            e = e3;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
