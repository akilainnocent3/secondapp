package defpackage;

import java.io.FileInputStream;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.datastore.core.FileReadScope", f = "FileStorage.kt", l = {169, 178}, m = "readData$suspendImpl")
public final class nkh<T> extends x1b {
    public Object a;
    public FileInputStream b;
    public /* synthetic */ Object c;
    public final /* synthetic */ okh<T> d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nkh(okh okhVar, x1b x1bVar) {
        super(x1bVar);
        this.d = okhVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return okh.f(this.d, this);
    }
}
