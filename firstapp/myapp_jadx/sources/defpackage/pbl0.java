package defpackage;

import android.database.ContentObserver;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class pbl0 extends ContentObserver {
    public final /* synthetic */ ubl0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbl0(ubl0 ubl0Var) {
        super(null);
        this.a = ubl0Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        ubl0 ubl0Var = this.a;
        synchronized (ubl0Var.f) {
            ubl0Var.g = null;
            ubl0Var.c.run();
        }
        synchronized (ubl0Var) {
            try {
                ArrayList arrayList = ubl0Var.h;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((wbl0) obj).zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
