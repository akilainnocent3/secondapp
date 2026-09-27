package sg.bigo.ads.core.d.b;

import androidx.annotation.NonNull;
import com.ironsource.C4235d4;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, String> f134649a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f134650b;

    public d(@NonNull String str) {
        this.f134650b = str;
    }

    public final void a(String str, int i10) {
        this.f134649a.put(str, String.valueOf(i10));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("eventId = ");
        sb2.append(this.f134650b);
        sb2.append(":");
        for (Map.Entry<String, String> entry : this.f134649a.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append(C4235d4.j.f61456b);
            sb2.append(entry.getValue());
            sb2.append(",");
        }
        return sb2.toString();
    }

    public final void a(String str, long j10) {
        this.f134649a.put(str, String.valueOf(j10));
    }

    public final void a(String str, String str2) {
        if (q.a((CharSequence) str) || q.a((CharSequence) str2)) {
            return;
        }
        this.f134649a.put(str, str2);
    }

    public final void a(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.f134649a.put(entry.getKey(), entry.getValue());
            }
        }
    }
}
