package defpackage;

import com.sportybet.android.virtual.presentation.activity.MatchEventDetailActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class szu implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ szu(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int iK;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = MatchEventDetailActivity.U;
                ((MatchEventDetailActivity) obj).I1().c();
                return Unit.a;
            default:
                zpz zpzVar = (zpz) obj;
                boolean zC = zpzVar.k.c();
                osw oswVar = zpzVar.s;
                if (zC) {
                    u5a0 u5a0Var = (u5a0) oswVar;
                    if (u5a0Var.D() != -1) {
                        iK = u5a0Var.D();
                    } else {
                        float fAbs = Math.abs(zpzVar.l());
                        mmd mmdVar = zpzVar.q;
                        npz npzVar = eqz.a;
                        if (fAbs >= Math.abs(Math.min(mmdVar.C1(56.0f), zpzVar.o() / 2.0f) / zpzVar.o())) {
                            boolean zBooleanValue = ((Boolean) ((x5a0) zpzVar.G).getValue()).booleanValue();
                            int i3 = zpzVar.e;
                            iK = zBooleanValue ? i3 + 1 : i3;
                        } else {
                            iK = zpzVar.k();
                        }
                    }
                } else {
                    iK = zpzVar.k();
                }
                return Integer.valueOf(zpzVar.j(iK));
        }
    }
}
