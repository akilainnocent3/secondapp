package defpackage;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yg80 implements Continuation {
    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        boolean z;
        if (task.isSuccessful()) {
            ztb ztbVar = (ztb) task.getResult();
            String str = "Crashlytics report successfully enqueued to DataTransport: " + ztbVar.c();
            ngt ngtVar = ngt.a;
            ngtVar.b(str);
            File fileB = ztbVar.b();
            if (fileB.delete()) {
                ngtVar.b("Deleted report file: " + fileB.getPath());
            } else {
                ngtVar.d("Crashlytics could not delete report file: " + fileB.getPath(), null);
            }
            z = true;
        } else {
            Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
