package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jzk0 implements Callable {
    public static final /* synthetic */ jzk0 a = new jzk0();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        bul0 bul0Var = new bul0("internal.platform");
        bul0Var.b.put("getVersion", new stl0("getVersion"));
        return bul0Var;
    }
}
