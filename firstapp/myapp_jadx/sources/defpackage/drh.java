package defpackage;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.b;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class drh implements Continuation {
    public final /* synthetic */ irh a;
    public final /* synthetic */ Task b;
    public final /* synthetic */ Task c;

    public /* synthetic */ drh(irh irhVar, Task task, Task task2) {
        this.a = irhVar;
        this.b = task;
        this.c = task2;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        b bVar;
        Task task2 = this.b;
        if (!task2.isSuccessful() || task2.getResult() == null) {
            return Tasks.forResult(Boolean.FALSE);
        }
        b bVar2 = (b) task2.getResult();
        Task task3 = this.c;
        if (task3.isSuccessful() && (bVar = (b) task3.getResult()) != null && bVar2.c.equals(bVar.c)) {
            return Tasks.forResult(Boolean.FALSE);
        }
        final irh irhVar = this.a;
        return irhVar.e.d(bVar2).continueWith(irhVar.c, new Continuation() { // from class: grh
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task4) {
                boolean z;
                irh irhVar2 = irhVar;
                if (task4.isSuccessful()) {
                    noa noaVar = irhVar2.d;
                    synchronized (noaVar) {
                        noaVar.c = Tasks.forResult(null);
                    }
                    cpa cpaVar = noaVar.b;
                    synchronized (cpaVar) {
                        cpaVar.a.deleteFile(cpaVar.b);
                    }
                    b bVar3 = (b) task4.getResult();
                    if (bVar3 != null) {
                        JSONArray jSONArray = bVar3.d;
                        hoh hohVar = irhVar2.b;
                        if (hohVar != null) {
                            try {
                                hohVar.b(irh.f(jSONArray));
                            } catch (j5 e) {
                                Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e);
                            } catch (JSONException e2) {
                                Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e2);
                            }
                        }
                        cv50 cv50Var = irhVar2.l;
                        try {
                            final kk1 kk1VarA = cv50Var.b.a(bVar3);
                            for (final yu50 yu50Var : cv50Var.d) {
                                cv50Var.c.execute(new Runnable() { // from class: zu50
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        yu50Var.a(kk1VarA);
                                    }
                                });
                            }
                        } catch (krh e3) {
                            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e3);
                        }
                    } else {
                        Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
                    }
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
    }
}
