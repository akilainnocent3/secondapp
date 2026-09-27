package com.startapp.sdk.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.startapp.json.JsonParser;
import com.startapp.json.TypeParser;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class mi<T> implements TypeParser<List<T>> {
    private static final String LOG_TAG = "mi";

    @NonNull
    private final Class<T> itemClass;

    public mi(Class cls) {
        this.itemClass = cls;
    }

    @Override // com.startapp.json.TypeParser
    @Nullable
    public List<T> parse(@NonNull Class<List<T>> cls, @Nullable Object obj) {
        int length;
        g7 liVar;
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            length = jSONArray.length();
            liVar = new ki(jSONArray);
        } else {
            if (!(obj instanceof JSONObject)) {
                return null;
            }
            JSONObject jSONObject = (JSONObject) obj;
            length = jSONObject.length();
            liVar = new li(jSONObject);
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            try {
                arrayList.add(JsonParser.fromJsonObject((JSONObject) liVar.a(Integer.valueOf(i10)), this.itemClass));
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }
}
