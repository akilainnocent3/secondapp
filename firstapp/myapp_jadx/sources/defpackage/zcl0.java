package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class zcl0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long d;
    public final /* synthetic */ nfl0 e;

    public zcl0(nfl0 nfl0Var, String str, String str2, Object obj, long j) {
        this.a = str;
        this.b = str2;
        this.c = obj;
        this.d = j;
        this.e = nfl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.c;
        this.e.r(this.d, obj, this.a, this.b);
    }
}
