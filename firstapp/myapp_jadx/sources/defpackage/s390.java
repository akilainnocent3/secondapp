package defpackage;

import android.content.SharedPreferences;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s390 implements Runnable {
    public final /* synthetic */ t390 a;

    @Override // java.lang.Runnable
    public final void run() {
        t390 t390Var = this.a;
        synchronized (t390Var.b) {
            SharedPreferences.Editor editorEdit = t390Var.a.edit();
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = t390Var.b.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(",");
            }
            editorEdit.putString("topic_operation_queue", sb.toString()).commit();
        }
    }
}
