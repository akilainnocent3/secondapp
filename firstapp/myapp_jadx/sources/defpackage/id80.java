package defpackage;

import hmd.a;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class id80 implements Iterable<Object>, dhp {
    public final /* synthetic */ hmd a;

    public id80(hmd hmdVar) {
        this.a = hmdVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return this.a.new a();
    }
}
