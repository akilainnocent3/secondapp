package defpackage;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class w5l implements Function1 {
    public final /* synthetic */ j6c a;
    public final /* synthetic */ c6l b;

    public /* synthetic */ w5l(j6c j6cVar, c6l c6lVar) {
        this.a = j6cVar;
        this.b = c6lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        final c6l.a aVar = (c6l.a) obj;
        aVar.getClass();
        final j6c j6cVar = this.a;
        final c6l c6lVar = this.b;
        return new au90(new bv90() { // from class: z5l
            @Override // defpackage.bv90
            public final void a(au90.a aVar2) {
                Task<String> taskExecuteTask = aVar.b.executeTask(RecaptchaAction.INSTANCE.custom(j6cVar.a));
                final a6l a6lVar = new a6l(aVar2, 0);
                taskExecuteTask.addOnSuccessListener(new OnSuccessListener() { // from class: b6l
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj2) {
                        a6lVar.invoke(obj2);
                    }
                }).addOnFailureListener(new mv7(c6lVar, aVar2)).addOnCanceledListener(new p5l(aVar2));
            }
        }).d(wm70.c);
    }
}
