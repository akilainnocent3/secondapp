package yads;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ym0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteArrayOutputStream f158407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataOutputStream f158408b;

    public ym0() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f158407a = byteArrayOutputStream;
        this.f158408b = new DataOutputStream(byteArrayOutputStream);
    }

    public final byte[] a(wm0 wm0Var) {
        this.f158407a.reset();
        try {
            DataOutputStream dataOutputStream = this.f158408b;
            dataOutputStream.writeBytes(wm0Var.f157441b);
            dataOutputStream.writeByte(0);
            String str = wm0Var.f157442c;
            if (str == null) {
                str = "";
            }
            DataOutputStream dataOutputStream2 = this.f158408b;
            dataOutputStream2.writeBytes(str);
            dataOutputStream2.writeByte(0);
            this.f158408b.writeLong(wm0Var.f157443d);
            this.f158408b.writeLong(wm0Var.f157444e);
            this.f158408b.write(wm0Var.f157445f);
            this.f158408b.flush();
            return this.f158407a.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
