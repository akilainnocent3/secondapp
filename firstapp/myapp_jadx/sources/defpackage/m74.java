package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class m74 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m74(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                f00 f00Var = vgb0.a;
                vgb0.a("click_bio_login_icon");
                ((f9) obj).invoke();
                return Unit.a;
            case 1:
                yoa.a aVar = (yoa.a) obj;
                yoa yoaVar = yoa.this;
                wrh.a.C1264a c1264a = aVar.a;
                synchronized (yoaVar) {
                    yoaVar.a.remove(c1264a);
                }
                return Unit.a;
            default:
                nn40 nn40Var = (nn40) obj;
                nn40Var.K0();
                nn40Var.L0();
                return Unit.a;
        }
    }
}
