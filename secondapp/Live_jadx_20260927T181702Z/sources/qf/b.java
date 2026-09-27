package qf;

import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteArrayOutputStream f122172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataOutputStream f122173b;

    public b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f122172a = byteArrayOutputStream;
        this.f122173b = new DataOutputStream(byteArrayOutputStream);
    }

    public static void b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] a(EventMessage eventMessage) {
        this.f122172a.reset();
        try {
            b(this.f122173b, eventMessage.f48447b);
            String str = eventMessage.f48448c;
            if (str == null) {
                str = "";
            }
            b(this.f122173b, str);
            this.f122173b.writeLong(eventMessage.f48449d);
            this.f122173b.writeLong(eventMessage.f48450e);
            this.f122173b.write(eventMessage.f48451f);
            this.f122173b.flush();
            return this.f122172a.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
