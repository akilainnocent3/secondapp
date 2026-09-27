package oc;

import android.content.Context;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import pc.o;
import tb.f;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f118990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f118991d;

    public a(int i10, f fVar) {
        this.f118990c = i10;
        this.f118991d = fVar;
    }

    @NonNull
    public static f c(@NonNull Context context) {
        return new a(context.getResources().getConfiguration().uiMode & 48, b.c(context));
    }

    @Override // tb.f
    public void a(@NonNull MessageDigest messageDigest) {
        this.f118991d.a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f118990c).array());
    }

    @Override // tb.f
    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f118990c == aVar.f118990c && this.f118991d.equals(aVar.f118991d)) {
                return true;
            }
        }
        return false;
    }

    @Override // tb.f
    public int hashCode() {
        return o.r(this.f118991d, this.f118990c);
    }
}
