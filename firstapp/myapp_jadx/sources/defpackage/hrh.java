package defpackage;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hrh implements SuccessContinuation {
    public static void a(qc6.b bVar, long j) {
        bVar.a().f();
        bVar.h(j);
    }

    public static /* synthetic */ void b(String str) throws oil0 {
        throw new oil0(str);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult(null);
    }
}
