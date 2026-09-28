package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
public final class vrz implements ParameterizedType {
    public final Type a;

    public vrz(Type type) {
        this.a = type;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return new Type[]{this.a};
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return null;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return BaseResponse.class;
    }
}
