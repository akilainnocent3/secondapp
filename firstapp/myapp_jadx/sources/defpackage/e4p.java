package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

/* JADX INFO: loaded from: classes.dex */
public final class e4p {
    public final Object a;
    public final Object b;

    public e4p() {
        this.a = new duw(new Reference[16]);
        this.b = new ReferenceQueue();
    }

    public e4p(eko ekoVar, n4p n4pVar) {
        ekoVar.getClass();
        this.a = ekoVar;
        this.b = n4pVar;
    }
}
