package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class fc4 {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;

    public static final d0i a(lyh lyhVar, int i) {
        if (i >= 0) {
            return new d0i(lyhVar, i);
        }
        kb5.a(hce0.a(i, "Drop count should be non-negative, but had "));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void b(myh myhVar, Object obj, Object obj2, x1b x1bVar) {
        h0i h0iVar;
        if (x1bVar instanceof h0i) {
            h0iVar = (h0i) x1bVar;
            int i = h0iVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                h0iVar.c = i - Integer.MIN_VALUE;
            } else {
                h0iVar = new h0i(x1bVar);
            }
        } else {
            h0iVar = new h0i(x1bVar);
        }
        Object obj3 = h0iVar.b;
        Object obj4 = y5b.a;
        int i2 = h0iVar.c;
        if (i2 == 0) {
            uj50.b(obj3);
            h0iVar.a = obj2;
            h0iVar.c = 1;
            if (myhVar.emit(obj, h0iVar) == obj4) {
                return;
            }
        } else if (i2 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return;
        } else {
            obj2 = h0iVar.a;
            uj50.b(obj3);
        }
        throw new t1(obj2);
    }
}
