package defpackage;

import com.esotericsoftware.spine.android.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class uy4 implements Function1 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    public /* synthetic */ uy4(yy4 yy4Var) {
        this.b = yy4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        fz4 fz4Var;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                yy4 yy4Var = (yy4) obj2;
                gz4 gz4VarK = yy4.k(yy4Var, ((Integer) obj).intValue());
                if (gz4VarK != null && (fz4Var = yy4Var.b) != null) {
                    fz4Var.a(new ez4.a(gz4VarK.a, gz4VarK.d.size()));
                }
                break;
            default:
                vad0.u3((b) ((ytw) obj2).getValue());
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ uy4(vad0 vad0Var, ytw ytwVar) {
        this.b = ytwVar;
    }
}
