package a9;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final w1 f4394a = new w1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public static final String f4395b = "room_master_table";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final String f4396c = "room_master_table";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public static final String f4397d = "id";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    public static final String f4398e = "identity_hash";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.l
    public static final String f4399f = "42";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oy.l
    public static final String f4400g = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @oy.l
    public static final String f4401h = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1";

    @oy.l
    @cs.o
    public static final String a(@oy.l String hash) {
        kotlin.jvm.internal.m0.p(hash, "hash");
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + hash + "')";
    }
}
