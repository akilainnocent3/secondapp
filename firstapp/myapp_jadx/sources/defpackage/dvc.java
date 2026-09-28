package defpackage;

import com.sportybet.android.share.presentation.activity.ShareCodeActivity;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dvc implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dvc(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                lb80.c((pb80) obj, (String) ((Pair) obj2).a);
                return Unit.a;
            default:
                ShareCodeActivity shareCodeActivity = (ShareCodeActivity) obj2;
                String str = (String) obj;
                int i2 = ShareCodeActivity.j0;
                str.getClass();
                shareCodeActivity.Q = str;
                via0 via0VarA1 = shareCodeActivity.A1();
                x190 x190Var = via0VarA1.w;
                via0VarA1.w = x190Var != null ? x190.a(x190Var, null, null, null, str, false, 32511) : null;
                shareCodeActivity.N1();
                r490 r490Var = shareCodeActivity.y;
                if (r490Var != null) {
                    r490Var.Q.setChecked(true);
                    return Unit.a;
                }
                Intrinsics.n("binding");
                throw null;
        }
    }
}
