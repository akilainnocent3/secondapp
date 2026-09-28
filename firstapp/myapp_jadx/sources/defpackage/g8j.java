package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g8j implements pya {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ g8j(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    @Override // defpackage.pya
    public final void accept(Object obj) {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                ((b8j) function1).invoke(obj);
                break;
            default:
                ((nu10) function1).invoke(obj);
                break;
        }
    }
}
