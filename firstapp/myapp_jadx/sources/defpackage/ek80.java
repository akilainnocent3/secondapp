package defpackage;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class ek80 implements SuccessContinuation<Void, Void> {
    public final /* synthetic */ mub a;
    public final /* synthetic */ fk80 b;

    public ek80(fk80 fk80Var, mub mubVar) {
        this.b = fk80Var;
        this.a = mubVar;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task<Void> then(Void r9) throws Throwable {
        FileWriter fileWriter;
        JSONObject jSONObject = (JSONObject) this.a.c.a.submit(new Callable() { // from class: dk80
            @Override // java.util.concurrent.Callable
            public final Object call() {
                fk80 fk80Var = this.a.b;
                ufd ufdVar = fk80Var.e;
                am80 am80Var = fk80Var.b;
                String str = ufdVar.a;
                mub.b();
                try {
                    HashMap mapB = ufd.b(am80Var);
                    spm spmVar = new spm(str, mapB);
                    spmVar.c("User-Agent", "Crashlytics Android SDK/20.0.1");
                    spmVar.c("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                    ufd.a(spmVar, am80Var);
                    String strConcat = "Requesting settings from ".concat(str);
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", strConcat, null);
                    }
                    String str2 = "Settings query params were: " + mapB;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str2, null);
                    }
                    return ufdVar.c(spmVar.b());
                } catch (IOException e) {
                    Log.e("FirebaseCrashlytics", "Settings request failed.", e);
                    return null;
                }
            }
        }).get();
        FileWriter fileWriter2 = null;
        if (jSONObject != null) {
            fk80 fk80Var = this.b;
            aj80 aj80VarA = fk80Var.c.a(jSONObject);
            it5 it5Var = fk80Var.d;
            long j = aj80VarA.c;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j);
                fileWriter = new FileWriter(it5Var.a);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Throwable th) {
                        th = th;
                        fileWriter2 = fileWriter;
                        ti8.b(fileWriter2, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Exception e) {
                    e = e;
                    Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                }
            } catch (Exception e2) {
                e = e2;
                fileWriter = null;
            } catch (Throwable th2) {
                th = th2;
                ti8.b(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            ti8.b(fileWriter, "Failed to close settings writer.");
            fk80.c("Loaded settings: ", jSONObject);
            String str = fk80Var.b.f;
            SharedPreferences.Editor editorEdit = fk80Var.a.getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            editorEdit.putString("existing_instance_identifier", str);
            editorEdit.apply();
            fk80Var.g.set(aj80VarA);
            fk80Var.h.get().trySetResult(aj80VarA);
        }
        return Tasks.forResult(null);
    }
}
