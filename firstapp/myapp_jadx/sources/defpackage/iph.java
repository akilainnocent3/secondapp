package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class iph extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iph(String str) {
        super(str);
        hm20.f(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iph(String str, Throwable th) {
        super(str, th);
        hm20.f(str, "Detail message must not be empty");
    }
}
