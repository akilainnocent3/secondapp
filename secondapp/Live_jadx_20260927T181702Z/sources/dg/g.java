package dg;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f79146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f79147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<a> f79148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<f> f79149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final e f79150e;

    public g(@Nullable String str, long j10, List<a> list) {
        this(str, j10, list, Collections.EMPTY_LIST, null);
    }

    public int a(int i10) {
        int size = this.f79148c.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f79148c.get(i11).f79098b == i10) {
                return i11;
            }
        }
        return -1;
    }

    public g(@Nullable String str, long j10, List<a> list, List<f> list2) {
        this(str, j10, list, list2, null);
    }

    public g(@Nullable String str, long j10, List<a> list, List<f> list2, @Nullable e eVar) {
        this.f79146a = str;
        this.f79147b = j10;
        this.f79148c = Collections.unmodifiableList(list);
        this.f79149d = Collections.unmodifiableList(list2);
        this.f79150e = eVar;
    }
}
