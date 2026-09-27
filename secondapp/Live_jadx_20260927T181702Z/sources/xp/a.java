package xp;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class a extends QueryInfoGenerationCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f145489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public tp.a f145490c;

    public a(String str, tp.a aVar) {
        this.f145489b = str;
        this.f145490c = aVar;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onFailure(String str) {
        this.f145490c.onFailure(str);
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onSuccess(QueryInfo queryInfo) {
        this.f145490c.a(this.f145489b, queryInfo.getQuery(), queryInfo);
    }
}
