package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import defpackage.cm8;
import defpackage.dm8;
import defpackage.em8;
import defpackage.ojd;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdf {
    public static final ojd zza(Task task) {
        final dm8 dm8VarA = em8.a();
        task.addOnCompleteListener(zzdd.zza, new OnCompleteListener() { // from class: com.google.android.recaptcha.internal.zzdc
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                cm8 cm8Var = dm8VarA;
                Exception exception = task2.getException();
                if (exception != null) {
                    cm8Var.F(exception);
                } else if (task2.isCanceled()) {
                    cm8Var.cancel((CancellationException) null);
                } else {
                    cm8Var.G(task2.getResult());
                }
            }
        });
        return new zzde(dm8VarA);
    }
}
