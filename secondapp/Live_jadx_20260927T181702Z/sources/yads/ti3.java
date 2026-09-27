package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class ti3 {
    public static int a() {
        Integer num;
        Object obj = dw2.f148384j;
        dw2 dw2VarA = cw2.a();
        synchronized (obj) {
            num = dw2VarA.f148393h;
        }
        if (num != null) {
            return ms.u.I(num.intValue(), 1, 4);
        }
        return 4;
    }
}
