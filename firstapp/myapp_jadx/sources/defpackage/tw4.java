package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class tw4 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ tw4(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                str.getClass();
                return uw4.b(str);
            default:
                jqn jqnVar = (jqn) obj;
                jqnVar.getClass();
                return jqnVar.m;
        }
    }
}
