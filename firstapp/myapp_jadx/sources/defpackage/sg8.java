package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class sg8 {
    public static final /* synthetic */ int a = 0;

    public static final c100 a(int i) {
        Object next;
        uag uagVar = c100.z;
        q3.b bVarA = ocx.a(uagVar, uagVar);
        while (bVarA.hasNext()) {
            next = bVarA.next();
            if (((c100) next).a == i) {
                return (c100) next;
            }
        }
        next = null;
        return (c100) next;
    }
}
