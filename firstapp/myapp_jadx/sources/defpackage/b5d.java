package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public interface b5d {
    String A();

    int B(pd80 pd80Var);

    boolean D();

    byte F();

    dma c(pd80 pd80Var);

    int k();

    b5d l(pd80 pd80Var);

    long o();

    short p();

    float q();

    double s();

    boolean t();

    char u();

    default <T> T z(tae<? extends T> taeVar) {
        taeVar.getClass();
        return taeVar.deserialize(this);
    }
}
