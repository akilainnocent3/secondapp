package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xy1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xy1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ooa0 ooa0Var;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                yy1 yy1Var = (yy1) obj;
                boolean zBooleanValue = ((Boolean) yy1Var.c.getValue()).booleanValue();
                w9e w9eVar = yy1Var.b;
                return zBooleanValue ? uzh.b(new n1i(yy1Var.c(), w9eVar.j, new yy1.a(3, yy1Var, yy1.class, "combineAlerts", "combineAlerts(Ljava/lang/Object;Lcom/sporty/android/common_ui/uitext/UiText;)Lcom/sporty/android/common_ui/uitext/UiText;", 4))) : w9eVar.j;
            default:
                t4b t4bVar = (t4b) obj;
                n6s n6sVar = t4bVar.H;
                b5i b5iVar = t4bVar.O;
                boolean z = t4bVar.I;
                if (!n6sVar.b()) {
                    b5i.b(b5iVar);
                } else if (!z && (ooa0Var = n6sVar.c) != null) {
                    ooa0Var.a();
                }
                return Boolean.TRUE;
        }
    }
}
