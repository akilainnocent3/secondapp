package defpackage;

import com.google.android.material.bottomsheet.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i1h implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i1h(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((j1h) obj).invoke();
                return Boolean.TRUE;
            default:
                g8e g8eVar = (g8e) this.c;
                l600 l600Var = l600.b;
                ((b) obj).dismiss();
                g8eVar.invoke(l600Var);
                return Unit.a;
        }
    }
}
