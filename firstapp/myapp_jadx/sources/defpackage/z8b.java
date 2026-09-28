package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class z8b implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ z8b(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ps6 ps6Var = (ps6) obj;
                ps6Var.getClass();
                return Boolean.valueOf(ps6Var.b == 2);
            case 1:
                llh0 llh0Var = (llh0) obj;
                llh0Var.getClass();
                return llh0Var.getClass().getName();
            default:
                String str = obj != null ? (String) obj : null;
                str.getClass();
                return new rmh0(str);
        }
    }
}
