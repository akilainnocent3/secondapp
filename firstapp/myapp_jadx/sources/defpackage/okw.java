package defpackage;

import java.io.FileInputStream;
import java.nio.channels.FileLock;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.datastore.core.MultiProcessCoordinator", f = "MultiProcessCoordinator.android.kt", l = {62, 87}, m = "tryLock")
public final class okw<T> extends x1b {
    public tuw a;
    public FileInputStream b;
    public FileLock c;
    public boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ jkw f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public okw(jkw jkwVar, x1b x1bVar) {
        super(x1bVar);
        this.f = jkwVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.b(null, this);
    }
}
