package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public abstract class pel0 extends eal0 {
    public static final WeakReference d = new WeakReference(null);
    public WeakReference c;

    public pel0(byte[] bArr) {
        super(bArr);
        this.c = d;
    }

    public abstract byte[] Z();

    @Override // defpackage.eal0
    public final byte[] d() {
        byte[] bArrZ;
        synchronized (this) {
            try {
                bArrZ = (byte[]) this.c.get();
                if (bArrZ == null) {
                    bArrZ = Z();
                    this.c = new WeakReference(bArrZ);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrZ;
    }
}
