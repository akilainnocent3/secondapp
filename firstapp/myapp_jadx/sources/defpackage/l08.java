package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l08 {
    public static /* synthetic */ void a(int i, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append((Object) "#read(byte[]) returned invalid result: ");
        sb.append(i);
        sb.append((Object) "\nThe InputStream implementation is buggy.");
        throw new IllegalStateException(sb.toString());
    }
}
