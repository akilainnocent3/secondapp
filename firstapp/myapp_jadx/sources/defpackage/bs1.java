package defpackage;

import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lbs1;", "Lj8i0;", "Lvu60;", "handle", "<init>", "(Lvu60;)V", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class bs1 extends j8i0 {
    public final String a;
    public f4p b;

    public bs1(vu60 vu60Var) {
        String string = (String) vu60Var.b("SaveableStateHolder_BackStackEntryKey");
        if (string == null) {
            string = UUID.randomUUID().toString();
            vu60Var.e(string, "SaveableStateHolder_BackStackEntryKey");
        }
        this.a = string;
    }

    @Override // defpackage.j8i0
    public final void onCleared() {
        super.onCleared();
        f4p f4pVar = this.b;
        if (f4pVar == null) {
            Intrinsics.n("saveableStateHolderRef");
            throw null;
        }
        et60 et60Var = (et60) ((WeakReference) f4pVar.a).get();
        if (et60Var != null) {
            et60Var.c(this.a);
        }
        f4p f4pVar2 = this.b;
        if (f4pVar2 != null) {
            ((WeakReference) f4pVar2.a).clear();
        } else {
            Intrinsics.n("saveableStateHolderRef");
            throw null;
        }
    }
}
