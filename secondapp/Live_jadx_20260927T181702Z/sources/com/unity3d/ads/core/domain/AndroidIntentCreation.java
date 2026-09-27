package com.unity3d.ads.core.domain;

import android.content.Intent;
import android.net.Uri;
import java.util.Map;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@s1({"SMAP\nAndroidIntentCreation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidIntentCreation.kt\ncom/unity3d/ads/core/domain/AndroidIntentCreation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,28:1\n1#2:29\n29#3:30\n215#4,2:31\n*S KotlinDebug\n*F\n+ 1 AndroidIntentCreation.kt\ncom/unity3d/ads/core/domain/AndroidIntentCreation\n*L\n16#1:30\n17#1:31,2\n*E\n"})
public final class AndroidIntentCreation implements IntentCreation {
    @Override // com.unity3d.ads.core.domain.IntentCreation
    @l
    public Intent invoke(@l String url, @m String str, @m String str2, @m Map<String, ? extends Object> map) {
        m0.p(url, "url");
        Intent intent = new Intent();
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                intent.setPackage(str);
            }
        }
        if (str2 != null) {
            if (str2.length() <= 0) {
                str2 = null;
            }
            if (str2 != null) {
                intent.setAction(str2);
            }
        }
        Uri uri = Uri.parse(url);
        m0.o(uri, "parse(this)");
        intent.setData(uri);
        if (map != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    intent.putExtra(key, (String) value);
                } else if (value instanceof Integer) {
                    intent.putExtra(key, ((Number) value).intValue());
                } else if (value instanceof Boolean) {
                    intent.putExtra(key, ((Boolean) value).booleanValue());
                } else if (value instanceof Float) {
                    intent.putExtra(key, ((Number) value).floatValue());
                } else if (value instanceof Double) {
                    intent.putExtra(key, ((Number) value).doubleValue());
                }
            }
        }
        return intent;
    }
}
