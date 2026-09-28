package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jzp implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jzp(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                yyp yypVar = (yyp) obj2;
                yzp yzpVar = new yzp(1, (l38) obj, l38.class, "expandWithAnimation", "expandWithAnimation(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                yypVar.getClass();
                yypVar.a = yzpVar;
                break;
            case 1:
                ((Function0) obj2).invoke();
                ((Function0) obj).invoke();
                break;
            default:
                ((Function1) obj2).invoke((String) obj);
                break;
        }
        return Unit.a;
    }
}
