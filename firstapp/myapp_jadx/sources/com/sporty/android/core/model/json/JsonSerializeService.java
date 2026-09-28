package com.sporty.android.core.model.json;

import java.io.InputStream;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
public interface JsonSerializeService {
    <T> T fromJson(InputStream inputStream, Class<T> cls);

    <T> T fromJson(InputStream inputStream, Type type);

    <T> T fromJson(String str, Class<T> cls);

    <T> T fromJson(String str, Type type);

    String toJson(Object obj);
}
