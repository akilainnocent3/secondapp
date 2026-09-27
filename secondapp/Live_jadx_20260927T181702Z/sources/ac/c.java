package ac;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class c implements tb.d<ByteBuffer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f4690a = "ByteBufferEncoder";

    @Override // tb.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull ByteBuffer byteBuffer, @NonNull File file, @NonNull tb.i iVar) throws Throwable {
        try {
            pc.a.f(byteBuffer, file);
            return true;
        } catch (IOException e10) {
            if (!Log.isLoggable(f4690a, 3)) {
                return false;
            }
            Log.d(f4690a, "Failed to write data", e10);
            return false;
        }
    }
}
