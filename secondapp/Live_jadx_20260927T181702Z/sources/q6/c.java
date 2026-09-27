package q6;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteArrayOutputStream f121753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataOutputStream f121754b;

    public c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f121753a = byteArrayOutputStream;
        this.f121754b = new DataOutputStream(byteArrayOutputStream);
    }

    public static void b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] a(a aVar) {
        this.f121753a.reset();
        try {
            b(this.f121754b, aVar.f121747a);
            String str = aVar.f121748b;
            if (str == null) {
                str = "";
            }
            b(this.f121754b, str);
            this.f121754b.writeLong(aVar.f121749c);
            this.f121754b.writeLong(aVar.f121750d);
            this.f121754b.write(aVar.f121751e);
            this.f121754b.flush();
            return this.f121753a.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
