package defpackage;

import android.content.Intent;

/* JADX INFO: loaded from: classes4.dex */
public final class aik0 extends fik0 {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ dbs b;

    public aik0(Intent intent, dbs dbsVar) {
        this.a = intent;
        this.b = dbsVar;
    }

    @Override // defpackage.fik0
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, 2);
        }
    }
}
