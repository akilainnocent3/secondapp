package defpackage;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes8.dex */
public final class trz extends urz<Object> {
    public final /* synthetic */ urz a;

    public trz(urz urzVar) {
        this.a = urzVar;
    }

    @Override // defpackage.urz
    public final void a(fa50 fa50Var, Object obj) {
        if (obj == null) {
            return;
        }
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.a.a(fa50Var, Array.get(obj, i));
        }
    }
}
