package okhttp3.internal.publicsuffix;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.blh;
import defpackage.cxz;
import defpackage.zpa0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lokhttp3/internal/publicsuffix/ResourcePublicSuffixList;", "Lokhttp3/internal/publicsuffix/BasePublicSuffixList;", "Lcxz;", AnalyticsParam.EVENT_PATH, "Lblh;", "fileSystem", "<init>", "(Lcxz;Lblh;)V", "Lzpa0;", "listSource", "()Lzpa0;", "d", "Lcxz;", "getPath", "()Lcxz;", "e", "Lblh;", "getFileSystem", "()Lblh;", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ResourcePublicSuffixList extends BasePublicSuffixList {
    public static final cxz PUBLIC_SUFFIX_RESOURCE;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final cxz path;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final blh fileSystem;

    static {
        String str = cxz.b;
        PUBLIC_SUFFIX_RESOURCE = cxz.a.a("okhttp3/internal/publicsuffix/PublicSuffixDatabase.list");
    }

    public /* synthetic */ ResourcePublicSuffixList(cxz cxzVar, blh blhVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? PUBLIC_SUFFIX_RESOURCE : cxzVar, (i & 2) != 0 ? blh.RESOURCES : blhVar);
    }

    public final blh getFileSystem() {
        return this.fileSystem;
    }

    @Override // okhttp3.internal.publicsuffix.BasePublicSuffixList
    public zpa0 listSource() {
        return this.fileSystem.source(getPath());
    }

    @Override // okhttp3.internal.publicsuffix.BasePublicSuffixList
    public cxz getPath() {
        return this.path;
    }

    public ResourcePublicSuffixList(cxz cxzVar, blh blhVar) {
        cxzVar.getClass();
        blhVar.getClass();
        this.path = cxzVar;
        this.fileSystem = blhVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ResourcePublicSuffixList() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
