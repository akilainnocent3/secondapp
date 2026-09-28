package com.sporty.android.core.model.json;

import com.google.gson.reflect.TypeToken;
import defpackage.zi50;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\"\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b¢\u0006\u0002\u0010\u0005\u001a$\u0010\u0006\u001a\u0004\u0018\u0001H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b¢\u0006\u0002\u0010\u0005¨\u0006\u0007"}, d2 = {"fromJson", "T", "Lcom/sporty/android/core/model/json/JsonSerializeService;", "json", "", "(Lcom/sporty/android/core/model/json/JsonSerializeService;Ljava/lang/String;)Ljava/lang/Object;", "tryFromJson", "model"}, k = 2, mv = {2, 4, 0}, xi = 48)
public final class JsonSerializeServiceExtKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.sporty.android.core.model.json.JsonSerializeServiceExtKt$fromJson$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"com/sporty/android/core/model/json/JsonSerializeServiceExtKt$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "model"}, k = 1, mv = {2, 4, 0}, xi = 176)
    public static final class AnonymousClass1<T> extends TypeToken<T> {
    }

    public static final <T> T fromJson(JsonSerializeService jsonSerializeService, String str) {
        jsonSerializeService.getClass();
        str.getClass();
        Intrinsics.m();
        throw null;
    }

    public static final <T> T tryFromJson(JsonSerializeService jsonSerializeService, String str) {
        jsonSerializeService.getClass();
        str.getClass();
        try {
            zi50.a aVar = zi50.b;
            Intrinsics.m();
            throw null;
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            T t = (T) new zi50.b(th);
            if (t instanceof zi50.b) {
                return null;
            }
            return t;
        }
    }
}
