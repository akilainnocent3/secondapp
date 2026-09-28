package defpackage;

import com.sportybet.plugin.realsports.data.Event;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class w8v implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w8v(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        qq80 binding;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Event event = (Event) obj;
                event.getClass();
                ((Function1) obj2).invoke(new ot70.a(event, ny70.MATCH));
                break;
            default:
                q1c0 q1c0Var = (q1c0) obj2;
                ((Boolean) obj).getClass();
                w3c0 w3c0Var = (w3c0) q1c0Var.b;
                if (w3c0Var != null && (binding = w3c0Var.d.getBinding()) != null) {
                    binding.d.setStatus(false);
                }
                ((x5a0) q1c0Var.Q1).setValue(Boolean.TRUE);
                break;
        }
        return Unit.a;
    }
}
