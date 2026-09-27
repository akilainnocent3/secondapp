package mq;

import android.net.Uri;
import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface rj {
    @oy.m
    d8 a();

    @oy.l
    Expression<String> b();

    @oy.l
    Expression<Long> c();

    @oy.m
    i3 d();

    @oy.m
    String e();

    @oy.m
    Expression<Uri> f();

    @oy.m
    JSONObject getPayload();

    @oy.m
    Expression<Uri> getUrl();

    @oy.l
    Expression<Boolean> isEnabled();
}
