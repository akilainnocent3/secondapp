package com.google.firebase.messaging;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;
import k.a0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f52317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @a0("this")
    public final Map<String, Task<String>> f52318b = new f0.a();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        Task<String> start();
    }

    public h(Executor executor) {
        this.f52317a = executor;
    }

    public static /* synthetic */ Task a(h hVar, String str, Task task) {
        synchronized (hVar) {
            hVar.f52318b.remove(str);
        }
        return task;
    }

    public synchronized Task<String> b(final String str, a aVar) {
        Task<String> task = this.f52318b.get(str);
        if (task != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + str);
            }
            return task;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: " + str);
        }
        Task taskContinueWithTask = aVar.start().continueWithTask(this.f52317a, new Continuation() { // from class: ql.u0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return com.google.firebase.messaging.h.a(this.f122501a, str, task2);
            }
        });
        this.f52318b.put(str, (Task<String>) taskContinueWithTask);
        return taskContinueWithTask;
    }
}
