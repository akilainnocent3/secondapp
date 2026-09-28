package defpackage;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l74 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l74(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                wwd0 wwd0Var = ((aa) obj).C;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, q74.a((q74) value, null, false, null, null, false, null, null, 0L, 251)));
                f00 f00Var = vgb0.a;
                vgb0.a("show_bio_login_prompt");
                return Unit.a;
            case 1:
                irh irhVar = ((wrh) obj).a.get();
                Task<b> taskB = irhVar.d.b();
                Task<b> taskB2 = irhVar.e.b();
                Object objContinueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{taskB, taskB2}).continueWithTask(irhVar.c, new drh(irhVar, taskB, taskB2));
                objContinueWithTask.getClass();
                return objContinueWithTask;
            default:
                ((nn40) obj).u0();
                return Unit.a;
        }
    }
}
