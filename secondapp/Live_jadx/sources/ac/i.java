package ac;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public interface i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final i f4725a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f4726b = new k.a().c();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements i {
        @Override // ac.i
        public Map<String, String> a() {
            return Collections.EMPTY_MAP;
        }
    }

    Map<String, String> a();
}
