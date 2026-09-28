package defpackage;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class a8e0 implements wg50<InputStream, thk> {
    public final ArrayList a;
    public final cl5 b;
    public final px0 c;

    public a8e0(ArrayList arrayList, cl5 cl5Var, px0 px0Var) {
        this.a = arrayList;
        this.b = cl5Var;
        this.c = px0Var;
    }

    @Override // defpackage.wg50
    public final boolean a(InputStream inputStream, s2z s2zVar) {
        return !((Boolean) s2zVar.c(cik.b)).booleanValue() && a.b(this.a, inputStream, this.c) == ImageHeaderParser.ImageType.GIF;
    }

    @Override // defpackage.wg50
    public final qg50<thk> b(InputStream inputStream, int i, int i2, s2z s2zVar) {
        byte[] byteArray;
        InputStream inputStream2 = inputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Http2.INITIAL_MAX_FRAME_SIZE);
        try {
            byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
            while (true) {
                int i3 = inputStream2.read(bArr);
                if (i3 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i3);
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
            }
            byteArray = null;
        }
        if (byteArray == null) {
            return null;
        }
        return this.b.b(ByteBuffer.wrap(byteArray), i, i2, s2zVar);
    }
}
