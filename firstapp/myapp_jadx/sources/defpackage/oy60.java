package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes.dex */
public final class oy60 implements y2b, zg50 {
    public static final oy60 a = new oy60();

    @Override // defpackage.zg50
    public c4g a(s2z s2zVar) {
        return c4g.a;
    }

    @Override // defpackage.g4g
    public boolean b(Object obj, File file, s2z s2zVar) throws Throwable {
        try {
            fl5.d(((thk) ((qg50) obj).get()).a.a.a.d.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            return false;
        }
    }

    @Override // defpackage.y2b
    public Object convert(Object obj) {
        return Double.valueOf(((ResponseBody) obj).string());
    }
}
