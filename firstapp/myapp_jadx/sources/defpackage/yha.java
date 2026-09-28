package defpackage;

import android.os.Bundle;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class yha implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yha(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                m28 m28Var = (m28) obj;
                m28Var.B.m(m28Var.i.d());
                return Unit.a;
            default:
                Bundle arguments = ((r320) obj).getArguments();
                Serializable serializable = arguments != null ? arguments.getSerializable("code_hub_type") : null;
                jz7 jz7Var = serializable instanceof jz7 ? (jz7) serializable : null;
                return jz7Var == null ? jz7.a : jz7Var;
        }
    }
}
