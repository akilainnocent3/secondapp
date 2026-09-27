package of;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class f implements b {
    @Override // of.b
    @Nullable
    public final Metadata a(d dVar) {
        ByteBuffer byteBuffer = (ByteBuffer) eh.a.g(dVar.f159198e);
        eh.a.a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (dVar.f()) {
            return null;
        }
        return b(dVar, byteBuffer);
    }

    @Nullable
    public abstract Metadata b(d dVar, ByteBuffer byteBuffer);
}
