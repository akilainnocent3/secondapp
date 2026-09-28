package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class yk5 implements g4g<ByteBuffer> {
    @Override // defpackage.g4g
    public final boolean b(ByteBuffer byteBuffer, File file, s2z s2zVar) throws Throwable {
        try {
            fl5.d(byteBuffer, file);
            return true;
        } catch (IOException e) {
            if (!Log.isLoggable("ByteBufferEncoder", 3)) {
                return false;
            }
            Log.d("ByteBufferEncoder", "Failed to write data", e);
            return false;
        }
    }
}
