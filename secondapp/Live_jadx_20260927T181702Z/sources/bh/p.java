package bh;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, Object> f21448a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f21449b = new ArrayList();

    public static p h(p pVar, long j10) {
        return pVar.e("exo_len", j10);
    }

    public static p i(p pVar, @Nullable Uri uri) {
        return uri == null ? pVar.d("exo_redir") : pVar.f("exo_redir", uri.toString());
    }

    @qj.a
    public final p a(String str, Object obj) {
        this.f21448a.put((String) eh.a.g(str), eh.a.g(obj));
        this.f21449b.remove(str);
        return this;
    }

    public Map<String, Object> b() {
        HashMap map = new HashMap(this.f21448a);
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(map);
    }

    public List<String> c() {
        return Collections.unmodifiableList(new ArrayList(this.f21449b));
    }

    @qj.a
    public p d(String str) {
        this.f21449b.add(str);
        this.f21448a.remove(str);
        return this;
    }

    @qj.a
    public p e(String str, long j10) {
        return a(str, Long.valueOf(j10));
    }

    @qj.a
    public p f(String str, String str2) {
        return a(str, str2);
    }

    @qj.a
    public p g(String str, byte[] bArr) {
        return a(str, Arrays.copyOf(bArr, bArr.length));
    }
}
