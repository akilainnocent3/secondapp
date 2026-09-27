package bq;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class a extends QueryInfoGenerationCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f21937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public tp.a f21938c;

    public a(String str, tp.a aVar) {
        this.f21937b = str;
        this.f21938c = aVar;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onFailure(String str) {
        this.f21938c.onFailure(str);
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onSuccess(QueryInfo queryInfo) {
        this.f21938c.a(this.f21937b, queryInfo.getQuery(), queryInfo);
    }
}
