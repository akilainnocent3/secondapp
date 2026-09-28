package defpackage;

import com.sporty.android.core.model.tracking.TrackingKind;
import com.sportybet.core.injection.opentelemetry.PageMeta;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@fae
public interface iym {
    void a(Map<String, ? extends Object> map, PageMeta pageMeta, TrackingKind trackingKind);

    void b(Map<String, ? extends Object> map);

    void c(String str, Map<String, ? extends Object> map, PageMeta pageMeta);

    void d(String str);

    void e(String str, Map<String, ? extends Object> map);

    void f(String str, PageMeta pageMeta);
}
