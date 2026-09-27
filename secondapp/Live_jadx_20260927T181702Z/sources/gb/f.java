package gb;

import android.util.Log;
import com.airbnb.lottie.e1;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class f implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set<String> f86366a = new HashSet();

    @Override // com.airbnb.lottie.e1
    public void a(String str) {
        b(str, null);
    }

    @Override // com.airbnb.lottie.e1
    public void b(String str, Throwable th2) {
        Set<String> set = f86366a;
        if (set.contains(str)) {
            return;
        }
        Log.w(com.airbnb.lottie.f.f24988b, str, th2);
        set.add(str);
    }

    @Override // com.airbnb.lottie.e1
    public void c(String str, Throwable th2) {
        if (com.airbnb.lottie.f.f24987a) {
            Log.d(com.airbnb.lottie.f.f24988b, str, th2);
        }
    }

    @Override // com.airbnb.lottie.e1
    public void debug(String str) {
        c(str, null);
    }

    @Override // com.airbnb.lottie.e1
    public void error(String str, Throwable th2) {
        if (com.airbnb.lottie.f.f24987a) {
            Log.d(com.airbnb.lottie.f.f24988b, str, th2);
        }
    }
}
