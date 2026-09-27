package da;

import android.util.Log;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    public static final a f78643a = new a();

    @Override // da.f
    public void a(@l String tag, @l String message) {
        m0.p(tag, "tag");
        m0.p(message, "message");
        Log.d(tag, message);
    }
}
