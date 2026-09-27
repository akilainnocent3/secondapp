package hc;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import tb.l;
import vb.v;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class d implements l<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f88138a = "GifEncoder";

    @Override // tb.l
    @NonNull
    public tb.c a(@NonNull tb.i iVar) {
        return tb.c.SOURCE;
    }

    @Override // tb.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull v<c> vVar, @NonNull File file, @NonNull tb.i iVar) throws Throwable {
        try {
            pc.a.f(vVar.get().e(), file);
            return true;
        } catch (IOException e10) {
            if (!Log.isLoggable(f88138a, 5)) {
                return false;
            }
            Log.w(f88138a, "Failed to encode GIF drawable data", e10);
            return false;
        }
    }
}
