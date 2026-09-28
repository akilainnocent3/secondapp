package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum akh {
    JSON(".json"),
    ZIP(".zip"),
    GZIP(".gz");

    public final String a;

    akh(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
