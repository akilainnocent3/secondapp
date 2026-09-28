package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface vp60 extends AutoCloseable {
    hq60 H1(String str);

    default boolean s() {
        throw new czx(this + " does not implement inTransaction().");
    }
}
