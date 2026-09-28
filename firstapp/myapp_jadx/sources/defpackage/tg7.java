package defpackage;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class tg7 implements pya, OnCompleteListener {
    public final /* synthetic */ Object a;

    public /* synthetic */ tg7(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.pya
    public void accept(Object obj) {
        ((sg7) this.a).invoke(obj);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((cuj0.a) this.a).b.trySetResult(null);
    }
}
