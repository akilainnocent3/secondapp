package defpackage;

import com.sportybet.android.editbet.presentation.view.EditHistoryDetailActivity;
import e22.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c22 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c22(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = e22.e;
                return ((e22) obj).new a();
            case 1:
                int i3 = EditHistoryDetailActivity.c;
                ((EditHistoryDetailActivity) obj).finish();
                return Unit.a;
            default:
                fo80 fo80Var = ((kab0) obj).c;
                if (fo80Var != null) {
                    fo80Var.z.d();
                }
                return Unit.a;
        }
    }
}
