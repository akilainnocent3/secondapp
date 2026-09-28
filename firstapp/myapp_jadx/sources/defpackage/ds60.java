package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
public final class ds60<T> implements tu5<BaseResponse<T>, su5<zi50<? extends T>>> {
    public final Type a;
    public final wsm b;
    public final xw9 c;

    public ds60(Type type, wsm wsmVar, xw9 xw9Var) {
        wsmVar.getClass();
        xw9Var.getClass();
        this.a = type;
        this.b = wsmVar;
        this.c = xw9Var;
    }

    @Override // defpackage.tu5
    public final Type a() {
        return new vrz(this.a);
    }

    @Override // defpackage.tu5
    public final Object b(su5 su5Var) {
        return new cs60(su5Var, this.a, this.b, this.c);
    }
}
