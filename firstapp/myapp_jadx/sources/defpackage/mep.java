package defpackage;

import com.google.gson.reflect.TypeToken;
import com.sporty.android.core.model.json.JsonSerializeService;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
public final class mep implements JsonSerializeService {
    public static final eal a = new eal();

    @Override // com.sporty.android.core.model.json.JsonSerializeService
    public final <T> T fromJson(InputStream inputStream, Class<T> cls) {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        try {
            eal ealVar = a;
            ealVar.getClass();
            T t = (T) ealVar.d(inputStreamReader, TypeToken.get((Class) cls));
            try {
                return t;
            } catch (IOException e) {
                return t;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            try {
                return null;
            } catch (IOException e3) {
                return null;
            }
        } finally {
            try {
                inputStreamReader.close();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
        }
    }

    @Override // com.sporty.android.core.model.json.JsonSerializeService
    public final String toJson(Object obj) {
        return a.j(obj);
    }

    @Override // com.sporty.android.core.model.json.JsonSerializeService
    public final <T> T fromJson(String str, Type type) {
        return (T) a.f(str, type);
    }

    @Override // com.sporty.android.core.model.json.JsonSerializeService
    public final <T> T fromJson(String str, Class<T> cls) {
        return (T) a.e(str, cls);
    }

    @Override // com.sporty.android.core.model.json.JsonSerializeService
    public final <T> T fromJson(InputStream inputStream, Type type) {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        try {
            eal ealVar = a;
            ealVar.getClass();
            T t = (T) ealVar.d(inputStreamReader, TypeToken.get(type));
            try {
                return t;
            } catch (IOException e) {
                return t;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            try {
                return null;
            } catch (IOException e3) {
                return null;
            }
        } finally {
            try {
                inputStreamReader.close();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
        }
    }
}
