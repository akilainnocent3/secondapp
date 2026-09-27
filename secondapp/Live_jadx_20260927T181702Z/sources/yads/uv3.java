package yads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class uv3 extends gw3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f156655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f156656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f156657e;

    public uv3(fw3 fw3Var, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(fw3Var);
        this.f156655c = new HashSet(hashSet);
        this.f156656d = jSONObject;
        this.f156657e = j10;
    }
}
